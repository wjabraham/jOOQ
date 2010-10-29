/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.jooq.NamedQueryPart;
import org.jooq.SQLDialect;

/**
 * @author Lukas Eder
 */
class Function<T> extends FieldImpl<T> {

    private static final long          serialVersionUID = 347252741712134044L;

    private final List<NamedQueryPart> arguments;

    Function(SQLDialect dialect, String name, Class<? extends T> type, NamedQueryPart... arguments) {
        super(dialect, name, type);

        this.arguments = Arrays.asList(arguments);
    }

    @Override
    public final String toSQLReference(boolean inlineParameters) {
        StringBuilder sb = new StringBuilder();

        sb.append(getName());
        sb.append(getArgumentListDelimiterStart(inlineParameters));

        String separator = "";
        if (arguments.isEmpty()) {
            sb.append(toSQLEmptyFields(inlineParameters));
        }
        else {
            for (NamedQueryPart field : arguments) {
                sb.append(separator);
                sb.append(toSQLField(field, inlineParameters));

                separator = ", ";
            }
        }

        sb.append(getArgumentListDelimiterEnd(inlineParameters));

        return sb.toString();
    }

    private final String getArgumentListDelimiterStart(boolean inlineParameters) {
        switch (getDialect()) {
            case ORACLE: // No break
            case HSQLDB: // No break
            case POSTGRES:

                // Oracle empty argument lists do not have parentheses ()
                if (arguments.isEmpty() && StringUtils.isBlank(toSQLEmptyFields(inlineParameters))) {
                    return "";
                }
        }

        // So far, only MySQL has empty parentheses ()
        return "(";
    }

    private final String getArgumentListDelimiterEnd(boolean inlineParameters) {
        switch (getDialect()) {
            case ORACLE: // No break
            case HSQLDB: // No break
            case POSTGRES:

                // Oracle empty argument lists do not have parentheses ()
                if (arguments.isEmpty() && StringUtils.isBlank(toSQLEmptyFields(inlineParameters))) {
                    return "";
                }
        }

        // So far, only MySQL has empty parentheses ()
        return ")";
    }

    /**
     * Render the argument field. This renders the field directly, by default.
     * Subclasses may override this method, if needed (e.g. to render
     * count(distinct [field])
     */
    protected String toSQLField(NamedQueryPart field, boolean inlineParameters) {
        return field.toSQLReference(inlineParameters);
    }

    /**
     * Render the expression, when no fields are passed to the function. This
     * returns nothing by default. Subclasses may override this method, if
     * needed (e.g. to return * for count(*))
     */
    protected String toSQLEmptyFields(boolean inlineParameters) {
        return "";
    }

    @Override
    public int bind(PreparedStatement stmt, int initialIndex) throws SQLException {
        int result = super.bind(stmt, initialIndex);

        for (NamedQueryPart field : getFields()) {
            result = field.bind(stmt, result);
        }

        return result;
    }

    protected final List<NamedQueryPart> getFields() {
        return arguments;
    }
}
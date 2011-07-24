/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
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
 * . Neither the name "jOOQ" nor the names of its contributors may be
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
import java.util.ArrayList;
import java.util.List;

import org.jooq.Attachable;
import org.jooq.Configuration;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
class InCondition<T> extends AbstractCondition {

    private static final long serialVersionUID = -1653924248576930761L;

    private final Field<T>    field;
    private final Field<?>[]  values;
    private final InOperator  operator;

    InCondition(Field<T> field, Field<?>[] values, InOperator operator) {
        this.field = field;
        this.values = values;
        this.operator = operator;
    }

    @Override
    public final List<Attachable> getAttachables() {
        List<Attachable> result = new ArrayList<Attachable>();

        result.addAll(getAttachables(field));
        result.addAll(getAttachables(values));

        return result;
    }

    @Override
    public int bindReference(Configuration configuration, PreparedStatement stmt, int initialIndex) throws SQLException {
        int result = initialIndex;

        result = internal(field).bindReference(configuration, stmt, result);
        for (Field<?> value : values) {
            result = internal(value).bindReference(configuration, stmt, result);
        }

        return result;
    }

    @Override
    public String toSQLReference(Configuration configuration, boolean inlineParameters) {
        StringBuilder sb = new StringBuilder();

        sb.append(internal(field).toSQLReference(configuration, inlineParameters));
        sb.append(" ");
        sb.append(operator.toSQL());
        sb.append(" (");

        String separator = "";
        for (Field<?> value : values) {
            sb.append(separator);
            sb.append(internal(value).toSQLReference(configuration, inlineParameters));

            separator = ", ";
        }

        sb.append(")");

        return sb.toString();
    }
}
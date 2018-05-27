/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.airavata.helix.impl.task.parsing.config;

import java.util.ArrayList;

public class ParserConfig {

    private String dataType;
    private String dataDetectorClass;
    private ArrayList<String> parserClasses;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ArrayList<String> getParserClasses() {
        return parserClasses;
    }

    public void setParserClasses(ArrayList<String> parserClasses) {
        this.parserClasses = parserClasses;
    }

    public String getDataDetectorClass() {
        return dataDetectorClass;
    }

    public void setDataDetectorClass(String dataDetectorClass) {
        this.dataDetectorClass = dataDetectorClass;
    }
}

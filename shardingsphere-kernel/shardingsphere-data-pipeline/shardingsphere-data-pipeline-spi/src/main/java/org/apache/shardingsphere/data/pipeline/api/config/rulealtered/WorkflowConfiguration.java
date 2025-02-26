/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.data.pipeline.api.config.rulealtered;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public final class WorkflowConfiguration {
    
    private long allowDelayMilliseconds = 60 * 1000L;
    
    private String schemaName;
    
    private List<String> alteredRuleYamlClassNames;
    
    private Integer activeVersion;
    
    private Integer newVersion;
    
    public WorkflowConfiguration(final String schemaName, final List<String> alteredRuleYamlClassNames, final int activeVersion, final int newVersion) {
        this.schemaName = schemaName;
        this.alteredRuleYamlClassNames = alteredRuleYamlClassNames;
        this.activeVersion = activeVersion;
        this.newVersion = newVersion;
    }
}

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
 *
 * Created by CuttleFish on 2020/7/2.
 */
package com.github.jobop.gekko.protocols.message.node;

import com.github.jobop.gekko.protocols.message.GekkoEntry;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
public class HeartBeatReq implements Serializable {
    /**
     * for serialization
     */

    private static final long serialVersionUID = -1288207208017808618L;
    private String group;
    private String remoteNodeId;
    private long term;
}

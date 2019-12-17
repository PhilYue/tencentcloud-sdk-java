/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesResponse extends AbstractModel{

    /**
    * 符合查询条件的实例总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 实例详细信息
    */
    @SerializedName("InstanceDetails")
    @Expose
    private MongoDBInstanceDetail [] InstanceDetails;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合查询条件的实例总数 
     * @return TotalCount 符合查询条件的实例总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合查询条件的实例总数
     * @param TotalCount 符合查询条件的实例总数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实例详细信息 
     * @return InstanceDetails 实例详细信息
     */
    public MongoDBInstanceDetail [] getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set 实例详细信息
     * @param InstanceDetails 实例详细信息
     */
    public void setInstanceDetails(MongoDBInstanceDetail [] InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceDetails.", this.InstanceDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


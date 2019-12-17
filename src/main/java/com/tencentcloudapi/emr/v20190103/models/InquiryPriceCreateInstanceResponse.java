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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateInstanceResponse extends AbstractModel{

    /**
    * 刊例价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
    * 时间单位，"s","m"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 时间数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 刊例价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalCost 刊例价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 刊例价
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalCost 刊例价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 折扣价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountCost 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountCost 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get 时间单位，"s","m"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 时间单位，"s","m"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单位，"s","m"
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 时间单位，"s","m"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 时间数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeSpan 时间数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时间数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeSpan 时间数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
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
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


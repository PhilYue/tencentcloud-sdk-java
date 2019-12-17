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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDeviceShadowRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 虚拟设备的状态，JSON字符串格式，由desired结构组成
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 当前版本号，需要和后台的version保持一致，才能更新成功
    */
    @SerializedName("ShadowVersion")
    @Expose
    private Integer ShadowVersion;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 虚拟设备的状态，JSON字符串格式，由desired结构组成 
     * @return State 虚拟设备的状态，JSON字符串格式，由desired结构组成
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 虚拟设备的状态，JSON字符串格式，由desired结构组成
     * @param State 虚拟设备的状态，JSON字符串格式，由desired结构组成
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 当前版本号，需要和后台的version保持一致，才能更新成功 
     * @return ShadowVersion 当前版本号，需要和后台的version保持一致，才能更新成功
     */
    public Integer getShadowVersion() {
        return this.ShadowVersion;
    }

    /**
     * Set 当前版本号，需要和后台的version保持一致，才能更新成功
     * @param ShadowVersion 当前版本号，需要和后台的version保持一致，才能更新成功
     */
    public void setShadowVersion(Integer ShadowVersion) {
        this.ShadowVersion = ShadowVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ShadowVersion", this.ShadowVersion);

    }
}


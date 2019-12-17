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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainErrorPageInfo extends AbstractModel{

    /**
    * 错误定制响应的配置ID
    */
    @SerializedName("ErrorPageId")
    @Expose
    private String ErrorPageId;

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 原始错误码
    */
    @SerializedName("ErrorNos")
    @Expose
    private Long [] ErrorNos;

    /**
    * 新的错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewErrorNo")
    @Expose
    private Long NewErrorNo;

    /**
    * 需要清理的响应头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClearHeaders")
    @Expose
    private String [] ClearHeaders;

    /**
    * 需要设置的响应头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetHeaders")
    @Expose
    private HttpHeaderParam [] SetHeaders;

    /**
    * 设置的响应体(不包括 HTTP头)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get 错误定制响应的配置ID 
     * @return ErrorPageId 错误定制响应的配置ID
     */
    public String getErrorPageId() {
        return this.ErrorPageId;
    }

    /**
     * Set 错误定制响应的配置ID
     * @param ErrorPageId 错误定制响应的配置ID
     */
    public void setErrorPageId(String ErrorPageId) {
        this.ErrorPageId = ErrorPageId;
    }

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 原始错误码 
     * @return ErrorNos 原始错误码
     */
    public Long [] getErrorNos() {
        return this.ErrorNos;
    }

    /**
     * Set 原始错误码
     * @param ErrorNos 原始错误码
     */
    public void setErrorNos(Long [] ErrorNos) {
        this.ErrorNos = ErrorNos;
    }

    /**
     * Get 新的错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewErrorNo 新的错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewErrorNo() {
        return this.NewErrorNo;
    }

    /**
     * Set 新的错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewErrorNo 新的错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewErrorNo(Long NewErrorNo) {
        this.NewErrorNo = NewErrorNo;
    }

    /**
     * Get 需要清理的响应头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClearHeaders 需要清理的响应头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClearHeaders() {
        return this.ClearHeaders;
    }

    /**
     * Set 需要清理的响应头
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClearHeaders 需要清理的响应头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClearHeaders(String [] ClearHeaders) {
        this.ClearHeaders = ClearHeaders;
    }

    /**
     * Get 需要设置的响应头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetHeaders 需要设置的响应头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpHeaderParam [] getSetHeaders() {
        return this.SetHeaders;
    }

    /**
     * Set 需要设置的响应头
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetHeaders 需要设置的响应头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetHeaders(HttpHeaderParam [] SetHeaders) {
        this.SetHeaders = SetHeaders;
    }

    /**
     * Get 设置的响应体(不包括 HTTP头)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Body 设置的响应体(不包括 HTTP头)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 设置的响应体(不包括 HTTP头)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Body 设置的响应体(不包括 HTTP头)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorPageId", this.ErrorPageId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ErrorNos.", this.ErrorNos);
        this.setParamSimple(map, prefix + "NewErrorNo", this.NewErrorNo);
        this.setParamArraySimple(map, prefix + "ClearHeaders.", this.ClearHeaders);
        this.setParamArrayObj(map, prefix + "SetHeaders.", this.SetHeaders);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}


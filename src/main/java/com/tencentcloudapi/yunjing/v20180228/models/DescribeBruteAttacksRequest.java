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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBruteAttacksRequest extends AbstractModel{

    /**
    * 客户端唯一Uuid。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>Keywords - String - 是否必填：否 -  查询关键字</li>
<li>Status - String - 是否必填：否 -  查询状态（FAILED：破解失败 |SUCCESS：破解成功）</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 客户端唯一Uuid。 
     * @return Uuid 客户端唯一Uuid。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 客户端唯一Uuid。
     * @param Uuid 客户端唯一Uuid。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>Keywords - String - 是否必填：否 -  查询关键字</li>
<li>Status - String - 是否必填：否 -  查询状态（FAILED：破解失败 |SUCCESS：破解成功）</li> 
     * @return Filters 过滤条件。
<li>Keywords - String - 是否必填：否 -  查询关键字</li>
<li>Status - String - 是否必填：否 -  查询状态（FAILED：破解失败 |SUCCESS：破解成功）</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Keywords - String - 是否必填：否 -  查询关键字</li>
<li>Status - String - 是否必填：否 -  查询状态（FAILED：破解失败 |SUCCESS：破解成功）</li>
     * @param Filters 过滤条件。
<li>Keywords - String - 是否必填：否 -  查询关键字</li>
<li>Status - String - 是否必填：否 -  查询状态（FAILED：破解失败 |SUCCESS：破解成功）</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


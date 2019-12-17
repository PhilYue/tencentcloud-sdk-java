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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageSpriteTemplateRequest extends AbstractModel{

    /**
    * 雪碧图模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 雪碧图模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 雪碧图中小图的宽度，取值范围： [128, 4096]，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 雪碧图中小图的高度，取值范围： [128, 4096]，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 采样类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * 雪碧图中小图的行数。
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * 雪碧图中小图的列数。
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 雪碧图模板唯一标识。 
     * @return Definition 雪碧图模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 雪碧图模板唯一标识。
     * @param Definition 雪碧图模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 雪碧图模板名称，长度限制：64 个字符。 
     * @return Name 雪碧图模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 雪碧图模板名称，长度限制：64 个字符。
     * @param Name 雪碧图模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 雪碧图中小图的宽度，取值范围： [128, 4096]，单位：px。 
     * @return Width 雪碧图中小图的宽度，取值范围： [128, 4096]，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 雪碧图中小图的宽度，取值范围： [128, 4096]，单位：px。
     * @param Width 雪碧图中小图的宽度，取值范围： [128, 4096]，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 雪碧图中小图的高度，取值范围： [128, 4096]，单位：px。 
     * @return Height 雪碧图中小图的高度，取值范围： [128, 4096]，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 雪碧图中小图的高度，取值范围： [128, 4096]，单位：px。
     * @param Height 雪碧图中小图的高度，取值范围： [128, 4096]，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 采样类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li> 
     * @return SampleType 采样类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 采样类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
     * @param SampleType 采样类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li> 
     * @return SampleInterval 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * Set 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
     * @param SampleInterval 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * Get 雪碧图中小图的行数。 
     * @return RowCount 雪碧图中小图的行数。
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set 雪碧图中小图的行数。
     * @param RowCount 雪碧图中小图的行数。
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get 雪碧图中小图的列数。 
     * @return ColumnCount 雪碧图中小图的列数。
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set 雪碧图中小图的列数。
     * @param ColumnCount 雪碧图中小图的列数。
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}


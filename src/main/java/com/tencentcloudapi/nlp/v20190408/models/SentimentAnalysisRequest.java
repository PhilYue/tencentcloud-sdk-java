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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentimentAnalysisRequest extends AbstractModel{

    /**
    * 待分析的文本（仅支持UTF-8格式，不超过200字）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文本所属类型（默认取4值）：
1、商品评论类
2、社交类
3、美食酒店类
4、通用领域类
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
     * Get 待分析的文本（仅支持UTF-8格式，不超过200字） 
     * @return Text 待分析的文本（仅支持UTF-8格式，不超过200字）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待分析的文本（仅支持UTF-8格式，不超过200字）
     * @param Text 待分析的文本（仅支持UTF-8格式，不超过200字）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文本所属类型（默认取4值）：
1、商品评论类
2、社交类
3、美食酒店类
4、通用领域类 
     * @return Flag 文本所属类型（默认取4值）：
1、商品评论类
2、社交类
3、美食酒店类
4、通用领域类
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 文本所属类型（默认取4值）：
1、商品评论类
2、社交类
3、美食酒店类
4、通用领域类
     * @param Flag 文本所属类型（默认取4值）：
1、商品评论类
2、社交类
3、美食酒店类
4、通用领域类
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Flag", this.Flag);

    }
}


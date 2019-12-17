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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分片大小 单位 MB
    */
    @SerializedName("MemSize")
    @Expose
    private Integer MemSize;

    /**
    * 分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Integer RedisShardNum;

    /**
    * 副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Integer RedisReplicasNum;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分片大小 单位 MB 
     * @return MemSize 分片大小 单位 MB
     */
    public Integer getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 分片大小 单位 MB
     * @param MemSize 分片大小 单位 MB
     */
    public void setMemSize(Integer MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写 
     * @return RedisShardNum 分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public Integer getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     * @param RedisShardNum 分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public void setRedisShardNum(Integer RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写 
     * @return RedisReplicasNum 副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public Integer getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     * @param RedisReplicasNum 副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public void setRedisReplicasNum(Integer RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);

    }
}


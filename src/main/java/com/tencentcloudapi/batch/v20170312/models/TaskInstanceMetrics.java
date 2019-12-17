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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInstanceMetrics extends AbstractModel{

    /**
    * Submitted个数
    */
    @SerializedName("SubmittedCount")
    @Expose
    private Integer SubmittedCount;

    /**
    * Pending个数
    */
    @SerializedName("PendingCount")
    @Expose
    private Integer PendingCount;

    /**
    * Runnable个数
    */
    @SerializedName("RunnableCount")
    @Expose
    private Integer RunnableCount;

    /**
    * Starting个数
    */
    @SerializedName("StartingCount")
    @Expose
    private Integer StartingCount;

    /**
    * Running个数
    */
    @SerializedName("RunningCount")
    @Expose
    private Integer RunningCount;

    /**
    * Succeed个数
    */
    @SerializedName("SucceedCount")
    @Expose
    private Integer SucceedCount;

    /**
    * FailedInterrupted个数
    */
    @SerializedName("FailedInterruptedCount")
    @Expose
    private Integer FailedInterruptedCount;

    /**
    * Failed个数
    */
    @SerializedName("FailedCount")
    @Expose
    private Integer FailedCount;

    /**
     * Get Submitted个数 
     * @return SubmittedCount Submitted个数
     */
    public Integer getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * Set Submitted个数
     * @param SubmittedCount Submitted个数
     */
    public void setSubmittedCount(Integer SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * Get Pending个数 
     * @return PendingCount Pending个数
     */
    public Integer getPendingCount() {
        return this.PendingCount;
    }

    /**
     * Set Pending个数
     * @param PendingCount Pending个数
     */
    public void setPendingCount(Integer PendingCount) {
        this.PendingCount = PendingCount;
    }

    /**
     * Get Runnable个数 
     * @return RunnableCount Runnable个数
     */
    public Integer getRunnableCount() {
        return this.RunnableCount;
    }

    /**
     * Set Runnable个数
     * @param RunnableCount Runnable个数
     */
    public void setRunnableCount(Integer RunnableCount) {
        this.RunnableCount = RunnableCount;
    }

    /**
     * Get Starting个数 
     * @return StartingCount Starting个数
     */
    public Integer getStartingCount() {
        return this.StartingCount;
    }

    /**
     * Set Starting个数
     * @param StartingCount Starting个数
     */
    public void setStartingCount(Integer StartingCount) {
        this.StartingCount = StartingCount;
    }

    /**
     * Get Running个数 
     * @return RunningCount Running个数
     */
    public Integer getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set Running个数
     * @param RunningCount Running个数
     */
    public void setRunningCount(Integer RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get Succeed个数 
     * @return SucceedCount Succeed个数
     */
    public Integer getSucceedCount() {
        return this.SucceedCount;
    }

    /**
     * Set Succeed个数
     * @param SucceedCount Succeed个数
     */
    public void setSucceedCount(Integer SucceedCount) {
        this.SucceedCount = SucceedCount;
    }

    /**
     * Get FailedInterrupted个数 
     * @return FailedInterruptedCount FailedInterrupted个数
     */
    public Integer getFailedInterruptedCount() {
        return this.FailedInterruptedCount;
    }

    /**
     * Set FailedInterrupted个数
     * @param FailedInterruptedCount FailedInterrupted个数
     */
    public void setFailedInterruptedCount(Integer FailedInterruptedCount) {
        this.FailedInterruptedCount = FailedInterruptedCount;
    }

    /**
     * Get Failed个数 
     * @return FailedCount Failed个数
     */
    public Integer getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set Failed个数
     * @param FailedCount Failed个数
     */
    public void setFailedCount(Integer FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubmittedCount", this.SubmittedCount);
        this.setParamSimple(map, prefix + "PendingCount", this.PendingCount);
        this.setParamSimple(map, prefix + "RunnableCount", this.RunnableCount);
        this.setParamSimple(map, prefix + "StartingCount", this.StartingCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "SucceedCount", this.SucceedCount);
        this.setParamSimple(map, prefix + "FailedInterruptedCount", this.FailedInterruptedCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);

    }
}


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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadReportResponse  extends AbstractModel{

    /**
    * 日报下载地址
    */
    @SerializedName("DailyReportUrl")
    @Expose
    private String DailyReportUrl;

    /**
    * 结果下载地址
    */
    @SerializedName("ResultReportUrl")
    @Expose
    private String ResultReportUrl;

    /**
    * 明细下载地址
    */
    @SerializedName("DetailReportUrl")
    @Expose
    private String DetailReportUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取日报下载地址
     * @return DailyReportUrl 日报下载地址
     */
    public String getDailyReportUrl() {
        return this.DailyReportUrl;
    }

    /**
     * 设置日报下载地址
     * @param DailyReportUrl 日报下载地址
     */
    public void setDailyReportUrl(String DailyReportUrl) {
        this.DailyReportUrl = DailyReportUrl;
    }

    /**
     * 获取结果下载地址
     * @return ResultReportUrl 结果下载地址
     */
    public String getResultReportUrl() {
        return this.ResultReportUrl;
    }

    /**
     * 设置结果下载地址
     * @param ResultReportUrl 结果下载地址
     */
    public void setResultReportUrl(String ResultReportUrl) {
        this.ResultReportUrl = ResultReportUrl;
    }

    /**
     * 获取明细下载地址
     * @return DetailReportUrl 明细下载地址
     */
    public String getDetailReportUrl() {
        return this.DetailReportUrl;
    }

    /**
     * 设置明细下载地址
     * @param DetailReportUrl 明细下载地址
     */
    public void setDetailReportUrl(String DetailReportUrl) {
        this.DetailReportUrl = DetailReportUrl;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DailyReportUrl", this.DailyReportUrl);
        this.setParamSimple(map, prefix + "ResultReportUrl", this.ResultReportUrl);
        this.setParamSimple(map, prefix + "DetailReportUrl", this.DetailReportUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


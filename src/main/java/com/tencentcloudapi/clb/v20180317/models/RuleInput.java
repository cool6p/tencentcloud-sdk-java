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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInput  extends AbstractModel{

    /**
    * 转发规则的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 会话保持时间
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Integer SessionExpireTime;

    /**
    * 健康检查信息
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 证书信息
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * 规则的请求转发方式
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
     * 获取转发规则的域名。
     * @return Domain 转发规则的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置转发规则的域名。
     * @param Domain 转发规则的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取转发规则的路径。
     * @return Url 转发规则的路径。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置转发规则的路径。
     * @param Url 转发规则的路径。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取会话保持时间
     * @return SessionExpireTime 会话保持时间
     */
    public Integer getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * 设置会话保持时间
     * @param SessionExpireTime 会话保持时间
     */
    public void setSessionExpireTime(Integer SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * 获取健康检查信息
     * @return HealthCheck 健康检查信息
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * 设置健康检查信息
     * @param HealthCheck 健康检查信息
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * 获取证书信息
     * @return Certificate 证书信息
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * 设置证书信息
     * @param Certificate 证书信息
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * 获取规则的请求转发方式
     * @return Scheduler 规则的请求转发方式
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * 设置规则的请求转发方式
     * @param Scheduler 规则的请求转发方式
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);

    }
}


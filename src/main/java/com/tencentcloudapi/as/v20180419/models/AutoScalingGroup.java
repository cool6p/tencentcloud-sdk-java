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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingGroup  extends AbstractModel{

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 伸缩组名称
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * 伸缩组状态
    */
    @SerializedName("AutoScalingGroupStatus")
    @Expose
    private String AutoScalingGroupStatus;

    /**
    * 创建时间，采用UTC标准计时
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 默认冷却时间，单位秒
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Integer DefaultCooldown;

    /**
    * 期望实例数
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * 启用状态，取值包括`ENABLED`和`DISABLED`
    */
    @SerializedName("EnabledStatus")
    @Expose
    private String EnabledStatus;

    /**
    * 应用型负载均衡器列表
    */
    @SerializedName("ForwardLoadBalancerSet")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancerSet;

    /**
    * 实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * 状态为`IN_SERVICE`实例的数量
    */
    @SerializedName("InServiceInstanceCount")
    @Expose
    private Integer InServiceInstanceCount;

    /**
    * 启动配置ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 启动配置名称
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * 传统型负载均衡器ID列表
    */
    @SerializedName("LoadBalancerIdSet")
    @Expose
    private String [] LoadBalancerIdSet;

    /**
    * 最大实例数
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * 最小实例数
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 子网ID列表
    */
    @SerializedName("SubnetIdSet")
    @Expose
    private String [] SubnetIdSet;

    /**
    * 销毁策略
    */
    @SerializedName("TerminationPolicySet")
    @Expose
    private String [] TerminationPolicySet;

    /**
    * VPC标识
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 可用区列表
    */
    @SerializedName("ZoneSet")
    @Expose
    private String [] ZoneSet;

    /**
    * 重试策略
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
     * 获取伸缩组ID
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * 设置伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * 获取伸缩组名称
     * @return AutoScalingGroupName 伸缩组名称
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * 设置伸缩组名称
     * @param AutoScalingGroupName 伸缩组名称
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * 获取伸缩组状态
     * @return AutoScalingGroupStatus 伸缩组状态
     */
    public String getAutoScalingGroupStatus() {
        return this.AutoScalingGroupStatus;
    }

    /**
     * 设置伸缩组状态
     * @param AutoScalingGroupStatus 伸缩组状态
     */
    public void setAutoScalingGroupStatus(String AutoScalingGroupStatus) {
        this.AutoScalingGroupStatus = AutoScalingGroupStatus;
    }

    /**
     * 获取创建时间，采用UTC标准计时
     * @return CreatedTime 创建时间，采用UTC标准计时
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间，采用UTC标准计时
     * @param CreatedTime 创建时间，采用UTC标准计时
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取默认冷却时间，单位秒
     * @return DefaultCooldown 默认冷却时间，单位秒
     */
    public Integer getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * 设置默认冷却时间，单位秒
     * @param DefaultCooldown 默认冷却时间，单位秒
     */
    public void setDefaultCooldown(Integer DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * 获取期望实例数
     * @return DesiredCapacity 期望实例数
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * 设置期望实例数
     * @param DesiredCapacity 期望实例数
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * 获取启用状态，取值包括`ENABLED`和`DISABLED`
     * @return EnabledStatus 启用状态，取值包括`ENABLED`和`DISABLED`
     */
    public String getEnabledStatus() {
        return this.EnabledStatus;
    }

    /**
     * 设置启用状态，取值包括`ENABLED`和`DISABLED`
     * @param EnabledStatus 启用状态，取值包括`ENABLED`和`DISABLED`
     */
    public void setEnabledStatus(String EnabledStatus) {
        this.EnabledStatus = EnabledStatus;
    }

    /**
     * 获取应用型负载均衡器列表
     * @return ForwardLoadBalancerSet 应用型负载均衡器列表
     */
    public ForwardLoadBalancer [] getForwardLoadBalancerSet() {
        return this.ForwardLoadBalancerSet;
    }

    /**
     * 设置应用型负载均衡器列表
     * @param ForwardLoadBalancerSet 应用型负载均衡器列表
     */
    public void setForwardLoadBalancerSet(ForwardLoadBalancer [] ForwardLoadBalancerSet) {
        this.ForwardLoadBalancerSet = ForwardLoadBalancerSet;
    }

    /**
     * 获取实例数量
     * @return InstanceCount 实例数量
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * 设置实例数量
     * @param InstanceCount 实例数量
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * 获取状态为`IN_SERVICE`实例的数量
     * @return InServiceInstanceCount 状态为`IN_SERVICE`实例的数量
     */
    public Integer getInServiceInstanceCount() {
        return this.InServiceInstanceCount;
    }

    /**
     * 设置状态为`IN_SERVICE`实例的数量
     * @param InServiceInstanceCount 状态为`IN_SERVICE`实例的数量
     */
    public void setInServiceInstanceCount(Integer InServiceInstanceCount) {
        this.InServiceInstanceCount = InServiceInstanceCount;
    }

    /**
     * 获取启动配置ID
     * @return LaunchConfigurationId 启动配置ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * 设置启动配置ID
     * @param LaunchConfigurationId 启动配置ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * 获取启动配置名称
     * @return LaunchConfigurationName 启动配置名称
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * 设置启动配置名称
     * @param LaunchConfigurationName 启动配置名称
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * 获取传统型负载均衡器ID列表
     * @return LoadBalancerIdSet 传统型负载均衡器ID列表
     */
    public String [] getLoadBalancerIdSet() {
        return this.LoadBalancerIdSet;
    }

    /**
     * 设置传统型负载均衡器ID列表
     * @param LoadBalancerIdSet 传统型负载均衡器ID列表
     */
    public void setLoadBalancerIdSet(String [] LoadBalancerIdSet) {
        this.LoadBalancerIdSet = LoadBalancerIdSet;
    }

    /**
     * 获取最大实例数
     * @return MaxSize 最大实例数
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * 设置最大实例数
     * @param MaxSize 最大实例数
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * 获取最小实例数
     * @return MinSize 最小实例数
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * 设置最小实例数
     * @param MinSize 最小实例数
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取子网ID列表
     * @return SubnetIdSet 子网ID列表
     */
    public String [] getSubnetIdSet() {
        return this.SubnetIdSet;
    }

    /**
     * 设置子网ID列表
     * @param SubnetIdSet 子网ID列表
     */
    public void setSubnetIdSet(String [] SubnetIdSet) {
        this.SubnetIdSet = SubnetIdSet;
    }

    /**
     * 获取销毁策略
     * @return TerminationPolicySet 销毁策略
     */
    public String [] getTerminationPolicySet() {
        return this.TerminationPolicySet;
    }

    /**
     * 设置销毁策略
     * @param TerminationPolicySet 销毁策略
     */
    public void setTerminationPolicySet(String [] TerminationPolicySet) {
        this.TerminationPolicySet = TerminationPolicySet;
    }

    /**
     * 获取VPC标识
     * @return VpcId VPC标识
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC标识
     * @param VpcId VPC标识
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取可用区列表
     * @return ZoneSet 可用区列表
     */
    public String [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * 设置可用区列表
     * @param ZoneSet 可用区列表
     */
    public void setZoneSet(String [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * 获取重试策略
     * @return RetryPolicy 重试策略
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * 设置重试策略
     * @param RetryPolicy 重试策略
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "AutoScalingGroupStatus", this.AutoScalingGroupStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "EnabledStatus", this.EnabledStatus);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancerSet.", this.ForwardLoadBalancerSet);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InServiceInstanceCount", this.InServiceInstanceCount);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamArraySimple(map, prefix + "LoadBalancerIdSet.", this.LoadBalancerIdSet);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIdSet.", this.SubnetIdSet);
        this.setParamArraySimple(map, prefix + "TerminationPolicySet.", this.TerminationPolicySet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);

    }
}


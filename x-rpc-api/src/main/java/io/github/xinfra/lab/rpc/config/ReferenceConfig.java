/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.xinfra.lab.rpc.config;

import io.github.xinfra.lab.rpc.cluster.ClusterType;
import io.github.xinfra.lab.rpc.cluster.loadblancer.LoadBalanceType;
import io.github.xinfra.lab.rpc.generic.GenericType;
import io.github.xinfra.lab.rpc.proxy.ProxyType;
import java.net.InetSocketAddress;
import lombok.Data;

@Data
public class ReferenceConfig<T> extends ServiceConfig<T> {

  public ReferenceConfig(Class<T> serviceInterfaceClass) {
    super(serviceInterfaceClass);
  }

  protected ConsumerConfig consumerConfig;

  private ProxyType proxyType = ProxyType.JDK;

  private ClusterType clusterType = ClusterType.FAST_FAIL;

  private InetSocketAddress directAddress;

  private LoadBalanceType loadBalanceType = LoadBalanceType.RANDOM;

  private boolean generic;

  private GenericType genericType = GenericType.JSON;

  /** provider appName * */
  private String appName;

  public void setConsumerConfig(ConsumerConfig consumerConfig) {
    this.consumerConfig = consumerConfig;
    this.protocol.add(consumerConfig.getProtocolConfig().protocol());
  }
}

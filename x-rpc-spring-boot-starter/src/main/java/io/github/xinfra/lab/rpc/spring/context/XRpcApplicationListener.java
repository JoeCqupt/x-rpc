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
package io.github.xinfra.lab.rpc.spring.context;

import io.github.xinfra.lab.rpc.core.bootstrap.ProviderBoostrap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;

@Slf4j
public class XRpcApplicationListener implements ApplicationListener<ApplicationContextEvent> {
  private ProviderBoostrap providerBoostrap;

  public XRpcApplicationListener(ProviderBoostrap providerBoostrap) {
    this.providerBoostrap = providerBoostrap;
  }

  @Override
  public void onApplicationEvent(ApplicationContextEvent event) {
    if (event instanceof ContextRefreshedEvent) {
      onContextRefreshedEvent((ContextRefreshedEvent) event);
    }
  }

  private void onContextRefreshedEvent(ContextRefreshedEvent event) {
    providerBoostrap.register();
  }
}

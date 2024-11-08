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
package io.github.xinfra.lab.transport;

import io.github.xinfra.lab.remoting.rpc.client.RpcClient;
import io.github.xinfra.lab.rpc.invoker.RpcRequest;
import io.github.xinfra.lab.rpc.invoker.RpcResponse;
import io.github.xinfra.lab.rpc.transport.ClientTransport;
import io.github.xinfra.lab.rpc.transport.TransportEventListener;
import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;
import javax.xml.ws.WebServiceException;

public class XRemotingClientTransport implements ClientTransport {
  private RpcClient rpcClient = new RpcClient();

  @Override
  public void connect(InetSocketAddress socketAddress) {
    // todo
  }

  @Override
  public void addTransportEventListener(TransportEventListener listener) {
    // todo
  }

  @Override
  public CompletableFuture<RpcResponse> sendAsync(
      InetSocketAddress socketAddress, RpcRequest request, int timeoutMills) {
    // todo
    return null;
  }

  @Override
  public void close() throws WebServiceException {
    // todo
  }
}

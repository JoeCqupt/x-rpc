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
package io.github.xinfra.lab.rpc.invoker;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvocationResult {
  // todo
  private boolean isError;
  // todo
  private String errorMsg;
  // todo
  private Object result;

  // todo
  CompletableFuture<InvocationResult> invocationResultCompletableFuture;

  public InvocationResult() {
    this.invocationResultCompletableFuture = new CompletableFuture<>();
  }

  public InvocationResult complete(RpcResponse rpcResponse) {
    invocationResultCompletableFuture.complete(from(rpcResponse));
    return this;
  }

  public InvocationResult complete(Object result) {
    invocationResultCompletableFuture.complete(from(result));
    return this;
  }

  public InvocationResult completeExceptionally(Throwable throwable) {
    invocationResultCompletableFuture.completeExceptionally(throwable);
    return this;
  }

  public InvocationResult whenComplete(
      BiConsumer<? super InvocationResult, ? super Throwable> action) {
    invocationResultCompletableFuture.whenComplete(action);
    return this;
  }

  private static InvocationResult from(Object result) {
    // todo
    return null;
  }

  private static InvocationResult from(RpcResponse rpcResponse) {
    // todo
    return null;
  }

  public void get(int timeoutMills) throws ExecutionException, InterruptedException, TimeoutException {
    invocationResultCompletableFuture.get(timeoutMills, TimeUnit.MILLISECONDS);
  }
}

/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.altus.dataeng.api;

import com.cloudera.altus.client.AltusClientBuilder;

/**
* This class can be used to build a DataengClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:11.397-07:00")
public class DataengClientBuilder extends AltusClientBuilder<DataengClientBuilder> {

  private DataengClientBuilder() {
   super(DataengClient.SERVICE_NAME);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return DataengClient
   */
  public static DataengClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return DataengClientBuilder
   */
  public static DataengClientBuilder defaultBuilder() {
    return new DataengClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return DataengClient
   */
  public DataengClient build() {
    return new DataengClient(
        getAltusCredentials().getCredentials(),
        getAltusEndPoint(),
        getAltusClientConfiguration());
  }

  @Override
  public DataengClientBuilder self() {
    return this;
  }
}
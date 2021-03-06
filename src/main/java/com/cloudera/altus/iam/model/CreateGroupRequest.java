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

package com.cloudera.altus.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;

/**
 * Request object for create group request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:11.877-07:00")
public class CreateGroupRequest  {

  /**
   * The name of the group. This name must be unique, must have a maximum of 32 characters, and must contain only alphanumeric characters, \"-\" and \"_\". Also, the first character of the name must be alphabetic or an underscore. Names are are not case-sensitive. The group named administrators is reserved.
   **/
  private String groupName = null;

  /**
   * Getter for groupName.
   * The name of the group. This name must be unique, must have a maximum of 32 characters, and must contain only alphanumeric characters, \&quot;-\&quot; and \&quot;_\&quot;. Also, the first character of the name must be alphabetic or an underscore. Names are are not case-sensitive. The group named administrators is reserved.
   **/
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }

  /**
   * Setter for groupName.
   * The name of the group. This name must be unique, must have a maximum of 32 characters, and must contain only alphanumeric characters, \&quot;-\&quot; and \&quot;_\&quot;. Also, the first character of the name must be alphabetic or an underscore. Names are are not case-sensitive. The group named administrators is reserved.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    if (!Objects.equals(this.groupName, createGroupRequest.groupName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequest {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


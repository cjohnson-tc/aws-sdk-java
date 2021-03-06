/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticbeanstalk.model;

/**
 * 
 */
public enum FailureType {

    UpdateCancelled("UpdateCancelled"),
    CancellationFailed("CancellationFailed"),
    RollbackFailed("RollbackFailed"),
    RollbackSuccessful("RollbackSuccessful"),
    InternalFailure("InternalFailure"),
    InvalidEnvironmentState("InvalidEnvironmentState"),
    PermissionsError("PermissionsError");

    private String value;

    private FailureType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return FailureType corresponding to the value
     */
    public static FailureType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("UpdateCancelled".equals(value)) {
            return UpdateCancelled;
        } else if ("CancellationFailed".equals(value)) {
            return CancellationFailed;
        } else if ("RollbackFailed".equals(value)) {
            return RollbackFailed;
        } else if ("RollbackSuccessful".equals(value)) {
            return RollbackSuccessful;
        } else if ("InternalFailure".equals(value)) {
            return InternalFailure;
        } else if ("InvalidEnvironmentState".equals(value)) {
            return InvalidEnvironmentState;
        } else if ("PermissionsError".equals(value)) {
            return PermissionsError;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *******************************************************************************/
package org.osgi.service.webservice.runtime.dto;

import org.osgi.framework.dto.ServiceReferenceDTO;

/**
 * The EndpointDTO describes the current state of an endoint implementor known
 * to the service runtime
 */
public class FailedEndpointDTO extends FailedDTO {

    /**
     * Transforming the endpoint implementor into a JAX-WS endpoint failed
     **/
    public static final int FAILURE_REASON_CREATE_FAILED = 200;

    /**
     * There are matching handlers for this endpoint but setting a handler chain is
     * not supported. This may be done to avoid any overriding of a pre-configured
     * handler chain.
     **/
    public static final int FAILURE_REASON_SET_HANDLER_NOT_SUPPORTED = 201;

    /**
     * There are matching handlers for this endpoint but an error in the
     * configuration of the handler chain occurred
     **/
    public static final int FAILURE_REASON_SET_HANDLER_FAILED = 202;

    /**
     * publishing then endpoint to the transport failed
     **/
    public static final int FAILURE_REASON_PUBLISH_FAILED = 203;

    /**
     * The DTO for the corresponding implementor that created this endpoint. This
     * value is never {@code null}.
     */
    public ServiceReferenceDTO implementor;
}

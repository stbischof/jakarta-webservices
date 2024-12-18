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

import org.osgi.dto.DTO;
import org.osgi.framework.dto.ServiceReferenceDTO;

/**
 * The EndpointDTO describes the current state of an endoint implementor known
 * to the service runtime
 */
public class EndpointDTO extends DTO {
    /**
     * The DTO for the corresponding implementor that created this endpoint. This
     * value is never {@code null}.
     */
    public ServiceReferenceDTO implementor;

    /**
     * The full resolved address this endpoint is published to This value is never
     * {@code null}.
     */
    public String address;

    /**
     * Returns all handlers that are bound to this endpoint, the returned array may
     * be empty.
     */
    public HandlerDTO[] handlers;
}

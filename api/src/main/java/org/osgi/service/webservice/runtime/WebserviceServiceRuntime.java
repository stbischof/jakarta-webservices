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

package org.osgi.service.webservice.runtime;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.webservice.runtime.dto.RuntimeDTO;

/**
 * The JakartarsServiceRuntime service represents the runtime information of a
 * Jakarta RESTful Web Services Whiteboard implementation, it provides access to
 * DTOs representing the current state of the service.
 *
 * @ThreadSafe
 * @author $Id$
 */
@ProviderType
public interface WebserviceServiceRuntime {

    /**
     * Return the runtime DTO representing the current state.
     *
     * @return The runtime DTO.
     */
    public RuntimeDTO getRuntimeDTO();
}

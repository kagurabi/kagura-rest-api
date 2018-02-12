/*
   Copyright 2014 base2Services

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.base2.kagura.rest.model;

import java.util.List;
import java.util.Map;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author aubels
 *         Date: 4/09/13
 */
@ApiModel(description = "Override for parameters, allows you to pass in a json object as a string to be decoded. Shouldn't be accessible as used as input.")
public class Parameters {
	Map<String, Object> parameters;

    public Parameters(String json) {
        ObjectMapper mapper = new ObjectMapper();
        parameters = null;
        try
        {
            parameters = mapper.readValue(json, new TypeReference<Map<String, Object>>(){});
        } catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

	@ApiModelProperty(value = "Parameters resulting from decoding")
    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }
}

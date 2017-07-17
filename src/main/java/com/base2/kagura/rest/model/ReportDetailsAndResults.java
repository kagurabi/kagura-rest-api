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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

/**
 * @author aubels
 *         Date: 16/12/2013
 */
@ApiModel(description = "Returns the report details in full (unless unselected) with the report rows.", parent = ReportDetails.class)
public class ReportDetailsAndResults extends ReportDetails {

	private List<Map<String, Object>> rows;

    public void setRows(List<Map<String, Object>> rows) {
        this.rows = rows;
    }

	@ApiModelProperty(value = "Data that has been returned from running the report.")
    public List<Map<String, Object>> getRows() {
        return rows;
    }
}

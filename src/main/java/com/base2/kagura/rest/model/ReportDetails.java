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

import com.base2.kagura.core.report.configmodel.parts.ColumnDef;
import com.base2.kagura.core.report.parameterTypes.ParamConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @author aubels
 *         Date: 13/12/2013
 */
@ApiModel
public class ReportDetails extends ResponseBase {
	@ApiModelProperty(value = "Report parameters.")
	private List<ParamConfig> params;
	@ApiModelProperty
	private List<ColumnDef> columns;

    public ReportDetails() {
    }

    public ReportDetails(Map<String, Object> result) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        super(result);
    }

    public void setParams(List<ParamConfig> params) {
        this.params = params;
    }

	@ApiModelProperty(value = "Report parameters.")
	public List<ParamConfig> getParams() {
        return params;
    }

    public void setColumns(List<ColumnDef> columns) {
        this.columns = columns;
    }

    public List<ColumnDef> getColumns() {
        return columns;
    }
}

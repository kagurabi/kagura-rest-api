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
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @author aubels
 *         Date: 13/12/2013
 */
@ApiModel(description = "Base object for responses. Contains all the common fields", parent = ResponseBase.class)
public class ResponseBase {
    String error;
    String reportId;
    List<String> errors;
    Map<String, String> extra;

    public ResponseBase() {
    }

    public ResponseBase(Map<String, Object> result) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        BeanUtils.populate(this, result);
    }

	@ApiModelProperty(value = "Gets the formost error, other errors are important.. Should be caught and passed to the user with UI specific string/object")
	public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

	@ApiModelProperty(value = "The report ID used to reference the report. Used primarily in the URL.")
	public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

	@ApiModelProperty(value = "Gets a list of errors (unlike \"error\"), these should not be passed on to the user directly but filtered.")
	public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

	@ApiModelProperty(value = "Any extras set in the report configuraiton itself. These tend to be static, but used by the front end to render correctly (such as options, or view mode, report listing details, ie Report Name is often put here..")
	public Map<String, String> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }
}

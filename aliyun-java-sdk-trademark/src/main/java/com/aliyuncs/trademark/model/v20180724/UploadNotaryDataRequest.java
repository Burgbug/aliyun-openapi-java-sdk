/*
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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadNotaryDataRequest extends RpcAcsRequest<UploadNotaryDataResponse> {
	   

	private String uploadContext;

	private String bizOrderNo;

	private Integer notaryType;
	public UploadNotaryDataRequest() {
		super("Trademark", "2018-07-24", "UploadNotaryData");
		setMethod(MethodType.POST);
	}

	public String getUploadContext() {
		return this.uploadContext;
	}

	public void setUploadContext(String uploadContext) {
		this.uploadContext = uploadContext;
		if(uploadContext != null){
			putQueryParameter("UploadContext", uploadContext);
		}
	}

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}

	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
		if(bizOrderNo != null){
			putQueryParameter("BizOrderNo", bizOrderNo);
		}
	}

	public Integer getNotaryType() {
		return this.notaryType;
	}

	public void setNotaryType(Integer notaryType) {
		this.notaryType = notaryType;
		if(notaryType != null){
			putQueryParameter("NotaryType", notaryType.toString());
		}
	}

	@Override
	public Class<UploadNotaryDataResponse> getResponseClass() {
		return UploadNotaryDataResponse.class;
	}

}

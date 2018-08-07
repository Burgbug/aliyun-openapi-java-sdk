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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifySQLCollectorPolicyRequest extends RpcAcsRequest<ModifySQLCollectorPolicyResponse> {
	
	public ModifySQLCollectorPolicyRequest() {
		super("gpdb", "2016-05-03", "ModifySQLCollectorPolicy", "gpdb");
	}

	private String sQLCollectorStatus;

	private String dBInstanceId;

	public String getSQLCollectorStatus() {
		return this.sQLCollectorStatus;
	}

	public void setSQLCollectorStatus(String sQLCollectorStatus) {
		this.sQLCollectorStatus = sQLCollectorStatus;
		if(sQLCollectorStatus != null){
			putQueryParameter("SQLCollectorStatus", sQLCollectorStatus);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	@Override
	public Class<ModifySQLCollectorPolicyResponse> getResponseClass() {
		return ModifySQLCollectorPolicyResponse.class;
	}

}
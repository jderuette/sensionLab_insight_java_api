/**
 * Copyright 2017 Djer13

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
package org.djer.sensiolab.insight.api.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author djer
 *
 */
@XmlRootElement
public class Parameters {

	private List<Parameter> parameterList;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder(100);
		builder.append("Parameters [parameters=").append(this.parameterList).append(']');
		return builder.toString();
	}

	/**
	 * @return the parameters
	 */
	@XmlElement(name = "parameter")
	public List<Parameter> getParameters() {
		return this.parameterList;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(final List<Parameter> parameters) {
		this.parameterList = parameters;
	}

}

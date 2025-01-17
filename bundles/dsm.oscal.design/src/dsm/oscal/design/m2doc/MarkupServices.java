/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */

package dsm.oscal.design.m2doc;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class MarkupServices {

	public static String toHTML(MarkupLine line) {
		if (line == null) {
			return "";
		}
		return line.toHtml();
	}

	public static String toHTML(MarkupMultiline line) {
		if (line == null) {
			return "";
		}
		return line.toHtml();
	}

}

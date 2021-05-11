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

package dsm.trades.m2doc.internal.actions;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;

/**
 * @author Arthur Daussy
 *
 */
public class M2DocActionProvider extends CommonActionProvider {

	private ContextMenuFiller contextMenuFiller;

	/**
	 * 
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator.ICommonActionExtensionSite)
	 */
	@Override
	public void init(final ICommonActionExtensionSite aSite) {
		super.init(aSite);
		initFromViewer(aSite.getStructuredViewer());
	}

	/**
	 * Initialize the {@link ContextMenuFiller} directly on the given
	 * {@link StructuredViewer}.
	 * 
	 * @param structuredViewer the viewer target of the {@link ContextMenuFiller}
	 *                         initialization.
	 */
	public void initFromViewer(final StructuredViewer structuredViewer) {
		contextMenuFiller = new ContextMenuFiller();
	}

	/**
	 * 
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.actions.ActionGroup#fillContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void fillContextMenu(final IMenuManager menu) {
		super.fillContextMenu(menu);
		final ISelection selection = getContext().getSelection();
		if (selection.isEmpty()) {
			return;
		}

		// Fill the context menu
		contextMenuFiller.fillContextMenu(menu, selection);
	}

	/**
	 * 
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public void dispose() {
		super.dispose();

		contextMenuFiller.dispose();
		contextMenuFiller = null;
	}

}

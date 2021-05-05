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
package dsm.TRADES.provider;

import dsm.TRADES.TRADESPackage;

import dsm.TRADES.util.TRADESAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TRADESItemProviderAdapterFactory extends TRADESAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			TRADESEditPlugin.INSTANCE, TRADESPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRADESItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.Analysis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisItemProvider analysisItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.Analysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalysisAdapter() {
		if (analysisItemProvider == null) {
			analysisItemProvider = new AnalysisItemProvider(this);
		}

		return analysisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.Threat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatItemProviderCustomImpl threatItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreatAdapter() {
		if (threatItemProvider == null) {
			threatItemProvider = new ThreatItemProviderCustomImpl(this);
		}

		return threatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProviderCustomImpl componentItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProviderCustomImpl(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.Control} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlItemProviderCustomImpl controlItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlAdapter() {
		if (controlItemProvider == null) {
			controlItemProvider = new ControlItemProviderCustomImpl(this);
		}

		return controlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ThreatAllocationRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatAllocationRelationItemProviderCustomImpl threatAllocationRelationItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ThreatAllocationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreatAllocationRelationAdapter() {
		if (threatAllocationRelationItemProvider == null) {
			threatAllocationRelationItemProvider = new ThreatAllocationRelationItemProviderCustomImpl(this);
		}

		return threatAllocationRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ThreatMitigationRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatMitigationRelationItemProviderCustomImpl threatMitigationRelationItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ThreatMitigationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreatMitigationRelationAdapter() {
		if (threatMitigationRelationItemProvider == null) {
			threatMitigationRelationItemProvider = new ThreatMitigationRelationItemProviderCustomImpl(this);
		}

		return threatMitigationRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.Data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemProvider dataItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAdapter() {
		if (dataItemProvider == null) {
			dataItemProvider = new DataItemProvider(this);
		}

		return dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.AffectRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectRelationItemProviderCustomImpl affectRelationItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.AffectRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAffectRelationAdapter() {
		if (affectRelationItemProvider == null) {
			affectRelationItemProvider = new AffectRelationItemProviderCustomImpl(this);
		}

		return affectRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.AttackChain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainItemProvider attackChainItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.AttackChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackChainAdapter() {
		if (attackChainItemProvider == null) {
			attackChainItemProvider = new AttackChainItemProvider(this);
		}

		return attackChainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.AttackChainStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainStepItemProvider attackChainStepItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.AttackChainStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackChainStepAdapter() {
		if (attackChainStepItemProvider == null) {
			attackChainStepItemProvider = new AttackChainStepItemProvider(this);
		}

		return attackChainStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ScoreSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreSystemItemProvider scoreSystemItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ScoreSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScoreSystemAdapter() {
		if (scoreSystemItemProvider == null) {
			scoreSystemItemProvider = new ScoreSystemItemProvider(this);
		}

		return scoreSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ImpactScore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactScoreItemProviderCustomImpl impactScoreItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ImpactScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImpactScoreAdapter() {
		if (impactScoreItemProvider == null) {
			impactScoreItemProvider = new ImpactScoreItemProviderCustomImpl(this);
		}

		return impactScoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.DifficultyScore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifficultyScoreItemProviderCustomImpl difficultyScoreItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.DifficultyScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDifficultyScoreAdapter() {
		if (difficultyScoreItemProvider == null) {
			difficultyScoreItemProvider = new DifficultyScoreItemProviderCustomImpl(this);
		}

		return difficultyScoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ExternalThreat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalThreatItemProviderCustomImpl externalThreatItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ExternalThreat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalThreatAdapter() {
		if (externalThreatItemProvider == null) {
			externalThreatItemProvider = new ExternalThreatItemProviderCustomImpl(this);
		}

		return externalThreatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ImpactConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactConfigurationItemProviderCustomImpl impactConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ImpactConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImpactConfigurationAdapter() {
		if (impactConfigurationItemProvider == null) {
			impactConfigurationItemProvider = new ImpactConfigurationItemProviderCustomImpl(this);
		}

		return impactConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ExternalControl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalControlItemProviderCustomImpl externalControlItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ExternalControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalControlAdapter() {
		if (externalControlItemProvider == null) {
			externalControlItemProvider = new ExternalControlItemProviderCustomImpl(this);
		}

		return externalControlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ThreatsOwner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatsOwnerItemProviderCustomImpl threatsOwnerItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ThreatsOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreatsOwnerAdapter() {
		if (threatsOwnerItemProvider == null) {
			threatsOwnerItemProvider = new ThreatsOwnerItemProviderCustomImpl(this);
		}

		return threatsOwnerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.ControlOwner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlOwnerItemProviderCustomImpl controlOwnerItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.ControlOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlOwnerAdapter() {
		if (controlOwnerItemProvider == null) {
			controlOwnerItemProvider = new ControlOwnerItemProviderCustomImpl(this);
		}

		return controlOwnerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.DataOwner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataOwnerItemProvider dataOwnerItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.DataOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataOwnerAdapter() {
		if (dataOwnerItemProvider == null) {
			dataOwnerItemProvider = new DataOwnerItemProvider(this);
		}

		return dataOwnerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.LinkOwner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkOwnerItemProvider linkOwnerItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.LinkOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkOwnerAdapter() {
		if (linkOwnerItemProvider == null) {
			linkOwnerItemProvider = new LinkOwnerItemProvider(this);
		}

		return linkOwnerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.LinkType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeItemProvider linkTypeItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkTypeAdapter() {
		if (linkTypeItemProvider == null) {
			linkTypeItemProvider = new LinkTypeItemProvider(this);
		}

		return linkTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.LinkTypeOwner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeOwnerItemProvider linkTypeOwnerItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.LinkTypeOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkTypeOwnerAdapter() {
		if (linkTypeOwnerItemProvider == null) {
			linkTypeOwnerItemProvider = new LinkTypeOwnerItemProvider(this);
		}

		return linkTypeOwnerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.TRADES.Catalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogItemProviderCustomImpl catalogItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.TRADES.Catalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCatalogAdapter() {
		if (catalogItemProvider == null) {
			catalogItemProvider = new CatalogItemProviderCustomImpl(this);
		}

		return catalogItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (analysisItemProvider != null)
			analysisItemProvider.dispose();
		if (threatItemProvider != null)
			threatItemProvider.dispose();
		if (componentItemProvider != null)
			componentItemProvider.dispose();
		if (controlItemProvider != null)
			controlItemProvider.dispose();
		if (threatAllocationRelationItemProvider != null)
			threatAllocationRelationItemProvider.dispose();
		if (threatMitigationRelationItemProvider != null)
			threatMitigationRelationItemProvider.dispose();
		if (dataItemProvider != null)
			dataItemProvider.dispose();
		if (affectRelationItemProvider != null)
			affectRelationItemProvider.dispose();
		if (attackChainItemProvider != null)
			attackChainItemProvider.dispose();
		if (attackChainStepItemProvider != null)
			attackChainStepItemProvider.dispose();
		if (scoreSystemItemProvider != null)
			scoreSystemItemProvider.dispose();
		if (impactScoreItemProvider != null)
			impactScoreItemProvider.dispose();
		if (difficultyScoreItemProvider != null)
			difficultyScoreItemProvider.dispose();
		if (externalThreatItemProvider != null)
			externalThreatItemProvider.dispose();
		if (impactConfigurationItemProvider != null)
			impactConfigurationItemProvider.dispose();
		if (externalControlItemProvider != null)
			externalControlItemProvider.dispose();
		if (threatsOwnerItemProvider != null)
			threatsOwnerItemProvider.dispose();
		if (controlOwnerItemProvider != null)
			controlOwnerItemProvider.dispose();
		if (dataOwnerItemProvider != null)
			dataOwnerItemProvider.dispose();
		if (linkItemProvider != null)
			linkItemProvider.dispose();
		if (linkOwnerItemProvider != null)
			linkOwnerItemProvider.dispose();
		if (linkTypeItemProvider != null)
			linkTypeItemProvider.dispose();
		if (linkTypeOwnerItemProvider != null)
			linkTypeOwnerItemProvider.dispose();
		if (catalogItemProvider != null)
			catalogItemProvider.dispose();
	}

}

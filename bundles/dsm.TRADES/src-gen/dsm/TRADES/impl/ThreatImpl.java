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
package dsm.TRADES.impl;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.threatTypeENUM;

import dsm.TRADES.util.TRADESValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getThreatAllocations <em>Threat Allocations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getThreatType <em>Threat Type</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getApplicability <em>Applicability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends NamedElementImpl implements Threat {
	/**
	 * The cached value of the '{@link #getThreatAllocations() <em>Threat Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatAllocationRelation> threatAllocations;

	/**
	 * The default value of the '{@link #getThreatType() <em>Threat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatType()
	 * @generated
	 * @ordered
	 */
	protected static final threatTypeENUM THREAT_TYPE_EDEFAULT = threatTypeENUM.CONCRETE_THREAT;

	/**
	 * The cached value of the '{@link #getThreatType() <em>Threat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatType()
	 * @generated
	 * @ordered
	 */
	protected threatTypeENUM threatType = THREAT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicability() <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected String applicability = APPLICABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatAllocationRelation> getThreatAllocations() {
		if (threatAllocations == null) {
			threatAllocations = new EObjectWithInverseResolvingEList<ThreatAllocationRelation>(
					ThreatAllocationRelation.class, this, TRADESPackage.THREAT__THREAT_ALLOCATIONS,
					TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT);
		}
		return threatAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public threatTypeENUM getThreatType() {
		return threatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreatType(threatTypeENUM newThreatType) {
		threatTypeENUM oldThreatType = threatType;
		threatType = newThreatType == null ? THREAT_TYPE_EDEFAULT : newThreatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__THREAT_TYPE, oldThreatType,
					threatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicability() {
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicability(String newApplicability) {
		String oldApplicability = applicability;
		applicability = newApplicability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__APPLICABILITY, oldApplicability,
					applicability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkIsUsed(DiagnosticChain chain, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR, TRADESValidator.DIAGNOSTIC_SOURCE,
						TRADESValidator.THREAT__CHECK_IS_USED,
						EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
								new Object[] { "checkIsUsed", EObjectValidator.getObjectLabel(this, context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREAT__THREAT_ALLOCATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getThreatAllocations()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREAT__THREAT_ALLOCATIONS:
			return ((InternalEList<?>) getThreatAllocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.THREAT__THREAT_ALLOCATIONS:
			return getThreatAllocations();
		case TRADESPackage.THREAT__THREAT_TYPE:
			return getThreatType();
		case TRADESPackage.THREAT__ID:
			return getId();
		case TRADESPackage.THREAT__DESCRIPTION:
			return getDescription();
		case TRADESPackage.THREAT__APPLICABILITY:
			return getApplicability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.THREAT__THREAT_ALLOCATIONS:
			getThreatAllocations().clear();
			getThreatAllocations().addAll((Collection<? extends ThreatAllocationRelation>) newValue);
			return;
		case TRADESPackage.THREAT__THREAT_TYPE:
			setThreatType((threatTypeENUM) newValue);
			return;
		case TRADESPackage.THREAT__ID:
			setId((String) newValue);
			return;
		case TRADESPackage.THREAT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TRADESPackage.THREAT__APPLICABILITY:
			setApplicability((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TRADESPackage.THREAT__THREAT_ALLOCATIONS:
			getThreatAllocations().clear();
			return;
		case TRADESPackage.THREAT__THREAT_TYPE:
			setThreatType(THREAT_TYPE_EDEFAULT);
			return;
		case TRADESPackage.THREAT__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.THREAT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.THREAT__APPLICABILITY:
			setApplicability(APPLICABILITY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TRADESPackage.THREAT__THREAT_ALLOCATIONS:
			return threatAllocations != null && !threatAllocations.isEmpty();
		case TRADESPackage.THREAT__THREAT_TYPE:
			return threatType != THREAT_TYPE_EDEFAULT;
		case TRADESPackage.THREAT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.THREAT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TRADESPackage.THREAT__APPLICABILITY:
			return APPLICABILITY_EDEFAULT == null ? applicability != null
					: !APPLICABILITY_EDEFAULT.equals(applicability);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP:
			return checkIsUsed((DiagnosticChain) arguments.get(0), (Map) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (threatType: ");
		result.append(threatType);
		result.append(", id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", applicability: ");
		result.append(applicability);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl

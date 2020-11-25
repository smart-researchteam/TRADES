/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AttackChainStep;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Chain Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getThreatAllocationRelation <em>Threat Allocation Relation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getImpactDescription <em>Impact Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getNext <em>Next</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackChainStepImpl extends MinimalEObjectImpl.Container implements AttackChainStep {
	/**
	 * The default value of the '{@link #getStepNum() <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNum()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreatAllocationRelation() <em>Threat Allocation Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatAllocationRelation()
	 * @generated
	 * @ordered
	 */
	protected ThreatAllocationRelation threatAllocationRelation;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final int DIFFICULTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected int difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpactDescription() <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpactDescription() <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactDescription()
	 * @generated
	 * @ordered
	 */
	protected String impactDescription = IMPACT_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChainStep> next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChainStep> previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ATTACK_CHAIN_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public String getStepNum() {
		int index = getNum(this);
		int subNum = getSubNum(this);

		String label = "";
		if (index != -1) {
			label += index;
		} else {
			label += "?";
		}

		if (subNum != -1) {
			label += "." + subNum;
		}

		return label;
	}

	private int getNum(AttackChainStep step) {
		return doGetNum(step, 0);
	}

	private int doGetNum(AttackChainStep step, int stepNum) {
		if (stepNum > 1000) {
			return -1;
		}

		int result = stepNum;
		for (AttackChainStep previous : step.getPrevious()) {
			result = Math.max(doGetNum(previous, stepNum + 1), result);
		}

		return result;

	}

	private int getSubNum(AttackChainStep step) {
		int index = -1;
		for (AttackChainStep previous : step.getPrevious()) {
			index = Math.max(index, previous.getNext().indexOf(step));
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepNum(String newStepNum) {
		// TODO: implement this method to set the 'Step Num' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation getThreatAllocationRelation() {
		if (threatAllocationRelation != null && threatAllocationRelation.eIsProxy()) {
			InternalEObject oldThreatAllocationRelation = (InternalEObject) threatAllocationRelation;
			threatAllocationRelation = (ThreatAllocationRelation) eResolveProxy(oldThreatAllocationRelation);
			if (threatAllocationRelation != oldThreatAllocationRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION, oldThreatAllocationRelation,
							threatAllocationRelation));
			}
		}
		return threatAllocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAllocationRelation basicGetThreatAllocationRelation() {
		return threatAllocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreatAllocationRelation(ThreatAllocationRelation newThreatAllocationRelation) {
		ThreatAllocationRelation oldThreatAllocationRelation = threatAllocationRelation;
		threatAllocationRelation = newThreatAllocationRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION, oldThreatAllocationRelation,
					threatAllocationRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficulty(int newDifficulty) {
		int oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY,
					oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImpactDescription() {
		return impactDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpactDescription(String newImpactDescription) {
		String oldImpactDescription = impactDescription;
		impactDescription = newImpactDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION,
					oldImpactDescription, impactDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChainStep> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<AttackChainStep>(AttackChainStep.class, this,
					TRADESPackage.ATTACK_CHAIN_STEP__NEXT, TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChainStep> getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse<AttackChainStep>(AttackChainStep.class, this,
					TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS, TRADESPackage.ATTACK_CHAIN_STEP__NEXT);
		}
		return previous;
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
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNext()).basicAdd(otherEnd, msgs);
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrevious()).basicAdd(otherEnd, msgs);
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
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return ((InternalEList<?>) getNext()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return ((InternalEList<?>) getPrevious()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			return getStepNum();
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			if (resolve)
				return getThreatAllocationRelation();
			return basicGetThreatAllocationRelation();
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			return getDifficulty();
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			return getImpactDescription();
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return getNext();
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return getPrevious();
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			setStepNum((String) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			setThreatAllocationRelation((ThreatAllocationRelation) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			setDifficulty((Integer) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			setImpactDescription((String) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			getNext().clear();
			getNext().addAll((Collection<? extends AttackChainStep>) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			getPrevious().clear();
			getPrevious().addAll((Collection<? extends AttackChainStep>) newValue);
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			setStepNum(STEP_NUM_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			setThreatAllocationRelation((ThreatAllocationRelation) null);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			setDifficulty(DIFFICULTY_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			setImpactDescription(IMPACT_DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			getNext().clear();
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			getPrevious().clear();
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			return STEP_NUM_EDEFAULT == null ? getStepNum() != null : !STEP_NUM_EDEFAULT.equals(getStepNum());
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			return threatAllocationRelation != null;
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			return difficulty != DIFFICULTY_EDEFAULT;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			return IMPACT_DESCRIPTION_EDEFAULT == null ? impactDescription != null
					: !IMPACT_DESCRIPTION_EDEFAULT.equals(impactDescription);
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return next != null && !next.isEmpty();
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return previous != null && !previous.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (difficulty: ");
		result.append(difficulty);
		result.append(", impactDescription: ");
		result.append(impactDescription);
		result.append(')');
		return result.toString();
	}

} //AttackChainStepImpl

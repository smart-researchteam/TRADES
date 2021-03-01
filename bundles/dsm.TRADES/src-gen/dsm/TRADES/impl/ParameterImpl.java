/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Annotation;
import dsm.TRADES.AnnotationOwner;
import dsm.TRADES.Constraint;
import dsm.TRADES.Link;
import dsm.TRADES.LinkOwner;
import dsm.TRADES.Parameter;
import dsm.TRADES.Select;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ParameterImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends PropertyOwnerImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final short ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected short id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected String dependsOn = DEPENDS_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getGuideline() <em>Guideline</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideline()
	 * @generated
	 * @ordered
	 */
	protected EList<String> guideline;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected Select select;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					TRADESPackage.PARAMETER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TRADESPackage.PARAMETER__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(short newId) {
		short oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARAMETER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARAMETER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependsOn(String newDependsOn) {
		String oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARAMETER__DEPENDS_ON, oldDependsOn,
					dependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARAMETER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARAMETER__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					TRADESPackage.PARAMETER__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGuideline() {
		if (guideline == null) {
			guideline = new EDataTypeUniqueEList<String>(String.class, this, TRADESPackage.PARAMETER__GUIDELINE);
		}
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(Select newSelect, NotificationChain msgs) {
		Select oldSelect = select;
		select = newSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.PARAMETER__SELECT, oldSelect, newSelect);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(Select newSelect) {
		if (newSelect != select) {
			NotificationChain msgs = null;
			if (select != null)
				msgs = ((InternalEObject) select).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.PARAMETER__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject) newSelect).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.PARAMETER__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARAMETER__SELECT, newSelect,
					newSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.PARAMETER__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.PARAMETER__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case TRADESPackage.PARAMETER__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		case TRADESPackage.PARAMETER__SELECT:
			return basicSetSelect(null, msgs);
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
		case TRADESPackage.PARAMETER__ANNOTATIONS:
			return getAnnotations();
		case TRADESPackage.PARAMETER__LINKS:
			return getLinks();
		case TRADESPackage.PARAMETER__ID:
			return getId();
		case TRADESPackage.PARAMETER__CLASS:
			return getClass_();
		case TRADESPackage.PARAMETER__DEPENDS_ON:
			return getDependsOn();
		case TRADESPackage.PARAMETER__LABEL:
			return getLabel();
		case TRADESPackage.PARAMETER__USAGE:
			return getUsage();
		case TRADESPackage.PARAMETER__CONSTRAINTS:
			return getConstraints();
		case TRADESPackage.PARAMETER__GUIDELINE:
			return getGuideline();
		case TRADESPackage.PARAMETER__VALUE:
			return getValue();
		case TRADESPackage.PARAMETER__SELECT:
			return getSelect();
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
		case TRADESPackage.PARAMETER__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case TRADESPackage.PARAMETER__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.PARAMETER__ID:
			setId((Short) newValue);
			return;
		case TRADESPackage.PARAMETER__CLASS:
			setClass((String) newValue);
			return;
		case TRADESPackage.PARAMETER__DEPENDS_ON:
			setDependsOn((String) newValue);
			return;
		case TRADESPackage.PARAMETER__LABEL:
			setLabel((String) newValue);
			return;
		case TRADESPackage.PARAMETER__USAGE:
			setUsage((String) newValue);
			return;
		case TRADESPackage.PARAMETER__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends Constraint>) newValue);
			return;
		case TRADESPackage.PARAMETER__GUIDELINE:
			getGuideline().clear();
			getGuideline().addAll((Collection<? extends String>) newValue);
			return;
		case TRADESPackage.PARAMETER__VALUE:
			setValue((String) newValue);
			return;
		case TRADESPackage.PARAMETER__SELECT:
			setSelect((Select) newValue);
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
		case TRADESPackage.PARAMETER__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case TRADESPackage.PARAMETER__LINKS:
			getLinks().clear();
			return;
		case TRADESPackage.PARAMETER__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.PARAMETER__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case TRADESPackage.PARAMETER__DEPENDS_ON:
			setDependsOn(DEPENDS_ON_EDEFAULT);
			return;
		case TRADESPackage.PARAMETER__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case TRADESPackage.PARAMETER__USAGE:
			setUsage(USAGE_EDEFAULT);
			return;
		case TRADESPackage.PARAMETER__CONSTRAINTS:
			getConstraints().clear();
			return;
		case TRADESPackage.PARAMETER__GUIDELINE:
			getGuideline().clear();
			return;
		case TRADESPackage.PARAMETER__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case TRADESPackage.PARAMETER__SELECT:
			setSelect((Select) null);
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
		case TRADESPackage.PARAMETER__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TRADESPackage.PARAMETER__LINKS:
			return links != null && !links.isEmpty();
		case TRADESPackage.PARAMETER__ID:
			return id != ID_EDEFAULT;
		case TRADESPackage.PARAMETER__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case TRADESPackage.PARAMETER__DEPENDS_ON:
			return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
		case TRADESPackage.PARAMETER__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case TRADESPackage.PARAMETER__USAGE:
			return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
		case TRADESPackage.PARAMETER__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		case TRADESPackage.PARAMETER__GUIDELINE:
			return guideline != null && !guideline.isEmpty();
		case TRADESPackage.PARAMETER__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case TRADESPackage.PARAMETER__SELECT:
			return select != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.PARAMETER__ANNOTATIONS:
				return TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.PARAMETER__LINKS:
				return TRADESPackage.LINK_OWNER__LINKS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS:
				return TRADESPackage.PARAMETER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.LINK_OWNER__LINKS:
				return TRADESPackage.PARAMETER__LINKS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", class: ");
		result.append(class_);
		result.append(", dependsOn: ");
		result.append(dependsOn);
		result.append(", label: ");
		result.append(label);
		result.append(", usage: ");
		result.append(usage);
		result.append(", guideline: ");
		result.append(guideline);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl

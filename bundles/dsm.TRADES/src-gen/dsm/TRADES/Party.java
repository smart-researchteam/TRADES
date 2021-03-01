/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A responsible entity which is either a person or an organization
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Party#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getExternalIds <em>External Ids</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getLocationUuids <em>Location Uuids</em>}</li>
 *   <li>{@link dsm.TRADES.Party#getMemberOfOrganizations <em>Member Of Organizations</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getParty()
 * @model
 * @generated
 */
public interface Party extends PropertyOwner, AnnotationOwner, NamedElement, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see dsm.TRADES.TRADESPackage#getParty_Uuid()
	 * @model required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Party#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A category describing the kind of party the object describes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see #setNewAttribute(String)
	 * @see dsm.TRADES.TRADESPackage#getParty_NewAttribute()
	 * @model required="true"
	 * @generated
	 */
	String getNewAttribute();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Party#getNewAttribute <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' attribute.
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see dsm.TRADES.TRADESPackage#getParty_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Party#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>External Ids</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ExternalId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ids</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getParty_ExternalIds()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalId> getExternalIds();

	/**
	 * Returns the value of the '<em><b>Email Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Addresses</em>' attribute list.
	 * @see dsm.TRADES.TRADESPackage#getParty_EmailAddresses()
	 * @model
	 * @generated
	 */
	EList<String> getEmailAddresses();

	/**
	 * Returns the value of the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.TelephoneNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Numbers</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getParty_TelephoneNumbers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TelephoneNumber> getTelephoneNumbers();

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getParty_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Location Uuids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Uuids</em>' attribute list.
	 * @see dsm.TRADES.TRADESPackage#getParty_LocationUuids()
	 * @model
	 * @generated
	 */
	EList<String> getLocationUuids();

	/**
	 * Returns the value of the '<em><b>Member Of Organizations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Organizations</em>' attribute list.
	 * @see dsm.TRADES.TRADESPackage#getParty_MemberOfOrganizations()
	 * @model
	 * @generated
	 */
	EList<String> getMemberOfOrganizations();

} // Party

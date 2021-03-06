//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.12 at 08:39:46 PM PDT 
//


package userProfile;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tmobile.federation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Banid_QNAME = new QName("urn:oma:xml:xdm:user-profile", "banid");
    private final static QName _Role_QNAME = new QName("urn:oma:xml:xdm:user-profile", "role");
    private final static QName _Groupid_QNAME = new QName("urn:oma:xml:xdm:user-profile", "groupid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tmobile.federation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserProfiles }
     * 
     */
    public UserProfiles createUserProfiles() {
        return new UserProfiles();
    }

    /**
     * Create an instance of {@link CommunicationTypesType }
     * 
     */
    public CommunicationTypesType createCommunicationTypesType() {
        return new CommunicationTypesType();
    }

    /**
     * Create an instance of {@link HobbiesType }
     * 
     */
    public HobbiesType createHobbiesType() {
        return new HobbiesType();
    }

    /**
     * Create an instance of {@link ListDef }
     * 
     */
    public ListDef createListDef() {
        return new ListDef();
    }

    /**
     * Create an instance of {@link UserProfileType }
     * 
     */
    public UserProfileType createUserProfileType() {
        return new UserProfileType();
    }

    /**
     * Create an instance of {@link HgListDef }
     * 
     */
    public HgListDef createHgListDef() {
        return new HgListDef();
    }

    /**
     * Create an instance of {@link LineInfo }
     * 
     */
    public LineInfo createLineInfo() {
        return new LineInfo();
    }

    /**
     * Create an instance of {@link UserProfiles.Roles }
     * 
     */
    public UserProfiles.Roles createUserProfilesRoles() {
        return new UserProfiles.Roles();
    }

    /**
     * Create an instance of {@link UserProfiles.AdministeredBans }
     * 
     */
    public UserProfiles.AdministeredBans createUserProfilesAdministeredBans() {
        return new UserProfiles.AdministeredBans();
    }

    /**
     * Create an instance of {@link UserProfiles.AdministeredGroups }
     * 
     */
    public UserProfiles.AdministeredGroups createUserProfilesAdministeredGroups() {
        return new UserProfiles.AdministeredGroups();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DisplayNameType }
     * 
     */
    public DisplayNameType createDisplayNameType() {
        return new DisplayNameType();
    }

    /**
     * Create an instance of {@link HgListItemDef }
     * 
     */
    public HgListItemDef createHgListItemDef() {
        return new HgListItemDef();
    }

    /**
     * Create an instance of {@link ListItemDef }
     * 
     */
    public ListItemDef createListItemDef() {
        return new ListItemDef();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link FavouriteLinksType }
     * 
     */
    public FavouriteLinksType createFavouriteLinksType() {
        return new FavouriteLinksType();
    }

    /**
     * Create an instance of {@link FreetextType }
     * 
     */
    public FreetextType createFreetextType() {
        return new FreetextType();
    }

    /**
     * Create an instance of {@link CommunicationAddressesType }
     * 
     */
    public CommunicationAddressesType createCommunicationAddressesType() {
        return new CommunicationAddressesType();
    }

    /**
     * Create an instance of {@link CommunicationTypesType.CommType }
     * 
     */
    public CommunicationTypesType.CommType createCommunicationTypesTypeCommType() {
        return new CommunicationTypesType.CommType();
    }

    /**
     * Create an instance of {@link HobbiesType.Hobby }
     * 
     */
    public HobbiesType.Hobby createHobbiesTypeHobby() {
        return new HobbiesType.Hobby();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oma:xml:xdm:user-profile", name = "banid")
    public JAXBElement<String> createBanid(String value) {
        return new JAXBElement<String>(_Banid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oma:xml:xdm:user-profile", name = "role")
    public JAXBElement<String> createRole(String value) {
        return new JAXBElement<String>(_Role_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oma:xml:xdm:user-profile", name = "groupid")
    public JAXBElement<String> createGroupid(String value) {
        return new JAXBElement<String>(_Groupid_QNAME, String.class, null, value);
    }

}

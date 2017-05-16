package com.howtodoinjava.demo;

/**
 * Created by THANGTQ on 5/16/2017.
 */
import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Binder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import userProfile.UserProfiles;

public class BinderDemo {
    public static void main(String[] args) {

        try {
            // we need a blank document to store final xml output
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbf.newDocumentBuilder();
            Document document = docBuilder.parse("userprofiles.xml");

            SchemaFactory sf = null;
            sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            File f = new File("cdb_userProfile_extended_v10_ucc.xsd");

            // create new schema
            Schema schema = sf.newSchema(f);

            // create JAXBContext which will be used to create a Binder
            JAXBContext jc = JAXBContext.newInstance(UserProfiles.class);

            // create binder object
            Binder<Node> binder = jc.createBinder();

            // set the property
            binder.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // get xml node
            Node xmlNode = document.getDocumentElement();

            // set schema for binder
            binder.setSchema(schema);


            // unmarshaling xml to JAXB object
            UserProfiles userProfiles = (UserProfiles)binder.unmarshal(xmlNode);

            // finally print the marshalled object on stdout
            System.out.println("Name : "+userProfiles);

        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

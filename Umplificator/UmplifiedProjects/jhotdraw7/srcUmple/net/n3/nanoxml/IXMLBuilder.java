/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.15.0.963 modeling language!*/

package net.n3.nanoxml;
import java.io.Reader;
import java.io.IOException;

public class IXMLBuilder
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public IXMLBuilder()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  public void startBuilding(String systemID,
                             int    lineNr)
      throws Exception;
/**
    * This method is called when a processing instruction is encountered.
    * A PI with a reserved target ("xml" with any case) is never reported.
    *
    * @param target the processing instruction target.
    * @param reader the method can retrieve the parameter of the PI from this
    *               reader. You may close the reader before reading all its
    *               data and you cannot read too much data.
    *
    * @throws java.lang.Exception
    *     If an exception occurred while processing the event.
    */
   public void newProcessingInstruction(String target,
                                        Reader reader)
      throws Exception;
/**
    * This method is called when a new XML element is encountered.
    *
    * @see #endElement
    *
    * @param name       the name of the element.
    * @param nsPrefix   the prefix used to identify the namespace. If no
    *                   namespace has been specified, this parameter is null.
    * @param nsURI      the URI associated with the namespace. If no
    *                   namespace has been specified, or no URI is
    *                   associated with nsPrefix, this parameter is null.
    * @param systemID   the system ID of the XML data source.
    * @param lineNr     the line in the source where the element starts.
    *
    * @throws java.lang.Exception
    *     If an exception occurred while processing the event.
    */
   public void startElement(String name,
                            String nsPrefix,
                            String nsURI,
                            String systemID,
                            int    lineNr)
      throws Exception;
/**
    * This method is called when a new attribute of an XML element is
    * encountered.
    *
    * @param key        the key (name) of the attribute.
    * @param nsPrefix   the prefix used to identify the namespace. If no
    *                   namespace has been specified, this parameter is null.
    * @param nsURI      the URI associated with the namespace. If no
    *                   namespace has been specified, or no URI is
    *                   associated with nsPrefix, this parameter is null.
    * @param value      the value of the attribute.
    * @param type       the type of the attribute. If no type is known,
    *                   "CDATA" is returned.
    *
    * @throws java.lang.Exception
    *     If an exception occurred while processing the event.
    */
   public void addAttribute(String key,
                            String nsPrefix,
                            String nsURI,
                            String value,
                            String type)
      throws Exception;
/**
    * This method is called when the attributes of an XML element have been
    * processed.
    *
    * @see #startElement
    * @see #addAttribute
    *
    * @param name       the name of the element.
    * @param nsPrefix   the prefix used to identify the namespace. If no
    *                   namespace has been specified, this parameter is null.
    * @param nsURI      the URI associated with the namespace. If no
    *                   namespace has been specified, or no URI is
    *                   associated with nsPrefix, this parameter is null.
    *
    * @throws java.lang.Exception
    *     If an exception occurred while processing the event.
    */
   public void elementAttributesProcessed(String name,
                                          String nsPrefix,
                                          String nsURI)
      throws Exception;
/**
    * This method is called when the end of an XML elemnt is encountered.
    *
    * @see #startElement
    *
    * @param name       the name of the element.
    * @param nsPrefix   the prefix used to identify the namespace. If no
    *                   namespace has been specified, this parameter is null.
    * @param nsURI      the URI associated with the namespace. If no
    *                   namespace has been specified, or no URI is
    *                   associated with nsPrefix, this parameter is null.
    *
    * @throws java.lang.Exception
    *     If an exception occurred while processing the event.
    */
   public void endElement(String name,
                          String nsPrefix,
                          String nsURI)
      throws Exception;
/**
    * This method is called when a PCDATA element is encountered. A Java
    * reader is supplied from which you can read the data. The reader will
    * only read the data of the element. You don't need to check for
    * boundaries. If you don't read the full element, the rest of the data
    * is skipped. You also don't have to care about entities: they are
    * resolved by the parser.
    *
    * @param reader   the method can retrieve the data from this reader. You
    *                 may close the reader before reading all its data and you
    *                 cannot read too much data.
    * @param systemID the system ID of the XML data source.
    * @param lineNr   the line in the source where the element starts.
    *
    * @throws java.lang.Exception
    *     If an exception occurred while processing the event.
    */
   public void addPCData(Reader reader,
                         String systemID,
                         int    lineNr)
      throws Exception;
/**
    * Returns the result of the building process. This method is called just
    * before the <I>parse</I> method of IXMLParser returns.
    *
    * @see net.n3.nanoxml.IXMLParser#parse
    *
    * @return the result of the building process.
    *
    * @throws java.lang.Exception
    *     If an exception occurred while processing the event.
    */
   public Object getResult()
      throws Exception;
}
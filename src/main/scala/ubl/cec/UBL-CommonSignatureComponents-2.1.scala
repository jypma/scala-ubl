// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package ubl.cec


/** 
         <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:sig="urn:oasis:names:specification:ubl:schema:xsd:CommonSignatureComponents-2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonSignatureComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema">This class collects all signature information for a document.</ccts:Definition>
       
*/
case class UBLDocumentSignaturesType(SignatureInformation: ubl.sac.SignatureInformationType*) extends ExtensionContentTypeOption

case class NonSignatureNamespaceElementsSequence(any: scalaxb.DataRecord[Any])

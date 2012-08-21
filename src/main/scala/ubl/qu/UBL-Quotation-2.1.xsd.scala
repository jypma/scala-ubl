// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package ubl.qu


/** 
            <ccts:Component xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:Quotation-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
               <ccts:ComponentType>ABIE</ccts:ComponentType>
               <ccts:DictionaryEntryName>Quotation. Details</ccts:DictionaryEntryName>
               <ccts:Definition>The document used to quote for the provision of goods and services.</ccts:Definition>
               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
               <ccts:AlternativeBusinessTerms>Purchase Order</ccts:AlternativeBusinessTerms>
            </ccts:Component>
         
*/
case class QuotationType(quotationtypesequence1: ubl.qu.QuotationTypeSequence1,
  quotationtypesequence2: ubl.qu.QuotationTypeSequence2,
  quotationtypesequence3: ubl.qu.QuotationTypeSequence3) {
  lazy val UBLExtensions = quotationtypesequence1.UBLExtensions
  lazy val UBLVersionID = quotationtypesequence1.UBLVersionID
  lazy val CustomizationID = quotationtypesequence1.CustomizationID
  lazy val ProfileID = quotationtypesequence1.ProfileID
  lazy val ProfileExecutionID = quotationtypesequence1.ProfileExecutionID
  lazy val ID = quotationtypesequence1.ID
  lazy val CopyIndicator = quotationtypesequence1.CopyIndicator
  lazy val UUID = quotationtypesequence1.UUID
  lazy val IssueDate = quotationtypesequence1.IssueDate
  lazy val IssueTime = quotationtypesequence1.IssueTime
  lazy val Note = quotationtypesequence2.Note
  lazy val PricingCurrencyCode = quotationtypesequence2.PricingCurrencyCode
  lazy val LineCountNumeric = quotationtypesequence2.LineCountNumeric
  lazy val ValidityPeriod = quotationtypesequence2.ValidityPeriod
  lazy val RequestForQuotationDocumentReference = quotationtypesequence2.RequestForQuotationDocumentReference
  lazy val AdditionalDocumentReference = quotationtypesequence2.AdditionalDocumentReference
  lazy val Contract = quotationtypesequence2.Contract
  lazy val Signature = quotationtypesequence2.Signature
  lazy val SellerSupplierParty = quotationtypesequence2.SellerSupplierParty
  lazy val OriginatorCustomerParty = quotationtypesequence2.OriginatorCustomerParty
  lazy val Delivery = quotationtypesequence3.Delivery
  lazy val DeliveryTerms = quotationtypesequence3.DeliveryTerms
  lazy val PaymentMeans = quotationtypesequence3.PaymentMeans
  lazy val TransactionConditions = quotationtypesequence3.TransactionConditions
  lazy val AllowanceCharge = quotationtypesequence3.AllowanceCharge
  lazy val DestinationCountry = quotationtypesequence3.DestinationCountry
  lazy val TaxTotal = quotationtypesequence3.TaxTotal
  lazy val QuotedMonetaryTotal = quotationtypesequence3.QuotedMonetaryTotal
  lazy val QuotationLine = quotationtypesequence3.QuotationLine
}


case class QuotationTypeSequence1(UBLExtensions: Option[ubl.cec.UBLExtensionsType] = None,
  UBLVersionID: Option[ubl.cbc.UBLVersionIDType] = None,
  CustomizationID: Option[ubl.cbc.CustomizationIDType] = None,
  ProfileID: Option[ubl.cbc.ProfileIDType] = None,
  ProfileExecutionID: Option[ubl.cbc.ProfileExecutionIDType] = None,
  ID: Option[ubl.cbc.IDType] = None,
  CopyIndicator: Option[ubl.cbc.CopyIndicatorType] = None,
  UUID: Option[ubl.cbc.UUIDType] = None,
  IssueDate: ubl.cbc.IssueDateType,
  IssueTime: Option[ubl.cbc.IssueTimeType] = None)

case class QuotationTypeSequence2(Note: Seq[ubl.cbc.NoteType] = Nil,
  PricingCurrencyCode: Option[ubl.cbc.PricingCurrencyCodeType] = None,
  LineCountNumeric: Option[ubl.cbc.LineCountNumericType] = None,
  ValidityPeriod: Option[ubl.cac.PeriodType] = None,
  RequestForQuotationDocumentReference: Option[ubl.cac.DocumentReferenceType] = None,
  AdditionalDocumentReference: Seq[ubl.cac.DocumentReferenceType] = Nil,
  Contract: Seq[ubl.cac.ContractType] = Nil,
  Signature: Seq[ubl.cac.SignatureType] = Nil,
  SellerSupplierParty: ubl.cac.SupplierPartyType,
  OriginatorCustomerParty: Option[ubl.cac.CustomerPartyType] = None)

case class QuotationTypeSequence3(Delivery: Seq[ubl.cac.DeliveryType] = Nil,
  DeliveryTerms: Option[ubl.cac.DeliveryTermsType] = None,
  PaymentMeans: Option[ubl.cac.PaymentMeansType] = None,
  TransactionConditions: Option[ubl.cac.TransactionConditionsType] = None,
  AllowanceCharge: Seq[ubl.cac.AllowanceChargeType] = Nil,
  DestinationCountry: Option[ubl.cac.CountryType] = None,
  TaxTotal: Seq[ubl.cac.TaxTotalType] = Nil,
  QuotedMonetaryTotal: ubl.cac.MonetaryTotalType,
  QuotationLine: Seq[ubl.cac.QuotationLineType] = Nil)


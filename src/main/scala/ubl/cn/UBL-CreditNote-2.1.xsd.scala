// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package ubl.cn


/** 
            <ccts:Component xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CreditNote-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
               <ccts:ComponentType>ABIE</ccts:ComponentType>
               <ccts:DictionaryEntryName>Credit Note. Details</ccts:DictionaryEntryName>
               <ccts:Definition>The document used to specify credits due to the Debtor from the Creditor.</ccts:Definition>
               <ccts:ObjectClass>Credit Note</ccts:ObjectClass>
            </ccts:Component>
         
*/
case class CreditNoteType(creditnotetypesequence1: ubl.cn.CreditNoteTypeSequence1,
  creditnotetypesequence2: ubl.cn.CreditNoteTypeSequence2,
  creditnotetypesequence3: ubl.cn.CreditNoteTypeSequence3,
  creditnotetypesequence4: ubl.cn.CreditNoteTypeSequence4,
  creditnotetypesequence5: ubl.cn.CreditNoteTypeSequence5) {
  lazy val UBLExtensions = creditnotetypesequence1.UBLExtensions
  lazy val UBLVersionID = creditnotetypesequence1.UBLVersionID
  lazy val CustomizationID = creditnotetypesequence1.CustomizationID
  lazy val ProfileID = creditnotetypesequence1.ProfileID
  lazy val ProfileExecutionID = creditnotetypesequence1.ProfileExecutionID
  lazy val ID = creditnotetypesequence1.ID
  lazy val CopyIndicator = creditnotetypesequence1.CopyIndicator
  lazy val UUID = creditnotetypesequence1.UUID
  lazy val IssueDate = creditnotetypesequence1.IssueDate
  lazy val IssueTime = creditnotetypesequence1.IssueTime
  lazy val TaxPointDate = creditnotetypesequence2.TaxPointDate
  lazy val Note = creditnotetypesequence2.Note
  lazy val DocumentCurrencyCode = creditnotetypesequence2.DocumentCurrencyCode
  lazy val TaxCurrencyCode = creditnotetypesequence2.TaxCurrencyCode
  lazy val PricingCurrencyCode = creditnotetypesequence2.PricingCurrencyCode
  lazy val PaymentCurrencyCode = creditnotetypesequence2.PaymentCurrencyCode
  lazy val PaymentAlternativeCurrencyCode = creditnotetypesequence2.PaymentAlternativeCurrencyCode
  lazy val AccountingCostCode = creditnotetypesequence2.AccountingCostCode
  lazy val AccountingCost = creditnotetypesequence2.AccountingCost
  lazy val LineCountNumeric = creditnotetypesequence2.LineCountNumeric
  lazy val InvoicePeriod = creditnotetypesequence3.InvoicePeriod
  lazy val DiscrepancyResponse = creditnotetypesequence3.DiscrepancyResponse
  lazy val OrderReference = creditnotetypesequence3.OrderReference
  lazy val BillingReference = creditnotetypesequence3.BillingReference
  lazy val DespatchDocumentReference = creditnotetypesequence3.DespatchDocumentReference
  lazy val ReceiptDocumentReference = creditnotetypesequence3.ReceiptDocumentReference
  lazy val ContractDocumentReference = creditnotetypesequence3.ContractDocumentReference
  lazy val AdditionalDocumentReference = creditnotetypesequence3.AdditionalDocumentReference
  lazy val Signature = creditnotetypesequence3.Signature
  lazy val AccountingSupplierParty = creditnotetypesequence3.AccountingSupplierParty
  lazy val AccountingCustomerParty = creditnotetypesequence4.AccountingCustomerParty
  lazy val PayeeParty = creditnotetypesequence4.PayeeParty
  lazy val BuyerCustomerParty = creditnotetypesequence4.BuyerCustomerParty
  lazy val SellerSupplierParty = creditnotetypesequence4.SellerSupplierParty
  lazy val TaxRepresentativeParty = creditnotetypesequence4.TaxRepresentativeParty
  lazy val TaxExchangeRate = creditnotetypesequence4.TaxExchangeRate
  lazy val PricingExchangeRate = creditnotetypesequence4.PricingExchangeRate
  lazy val PaymentExchangeRate = creditnotetypesequence4.PaymentExchangeRate
  lazy val PaymentAlternativeExchangeRate = creditnotetypesequence4.PaymentAlternativeExchangeRate
  lazy val AllowanceCharge = creditnotetypesequence4.AllowanceCharge
  lazy val TaxTotal = creditnotetypesequence5.TaxTotal
  lazy val LegalMonetaryTotal = creditnotetypesequence5.LegalMonetaryTotal
  lazy val CreditNoteLine = creditnotetypesequence5.CreditNoteLine
}


case class CreditNoteTypeSequence1(UBLExtensions: Option[ubl.cec.UBLExtensionsType] = None,
  UBLVersionID: Option[ubl.cbc.UBLVersionIDType] = None,
  CustomizationID: Option[ubl.cbc.CustomizationIDType] = None,
  ProfileID: Option[ubl.cbc.ProfileIDType] = None,
  ProfileExecutionID: Option[ubl.cbc.ProfileExecutionIDType] = None,
  ID: ubl.cbc.IDType,
  CopyIndicator: Option[ubl.cbc.CopyIndicatorType] = None,
  UUID: Option[ubl.cbc.UUIDType] = None,
  IssueDate: ubl.cbc.IssueDateType,
  IssueTime: Option[ubl.cbc.IssueTimeType] = None)

case class CreditNoteTypeSequence2(TaxPointDate: Option[ubl.cbc.TaxPointDateType] = None,
  Note: Seq[ubl.cbc.NoteType] = Nil,
  DocumentCurrencyCode: Option[ubl.cbc.DocumentCurrencyCodeType] = None,
  TaxCurrencyCode: Option[ubl.cbc.TaxCurrencyCodeType] = None,
  PricingCurrencyCode: Option[ubl.cbc.PricingCurrencyCodeType] = None,
  PaymentCurrencyCode: Option[ubl.cbc.PaymentCurrencyCodeType] = None,
  PaymentAlternativeCurrencyCode: Option[ubl.cbc.PaymentAlternativeCurrencyCodeType] = None,
  AccountingCostCode: Option[ubl.cbc.AccountingCostCodeType] = None,
  AccountingCost: Option[ubl.cbc.AccountingCostType] = None,
  LineCountNumeric: Option[ubl.cbc.LineCountNumericType] = None)

case class CreditNoteTypeSequence3(InvoicePeriod: Seq[ubl.cac.PeriodType] = Nil,
  DiscrepancyResponse: Seq[ubl.cac.ResponseType] = Nil,
  OrderReference: Option[ubl.cac.OrderReferenceType] = None,
  BillingReference: Seq[ubl.cac.BillingReferenceType] = Nil,
  DespatchDocumentReference: Seq[ubl.cac.DocumentReferenceType] = Nil,
  ReceiptDocumentReference: Seq[ubl.cac.DocumentReferenceType] = Nil,
  ContractDocumentReference: Seq[ubl.cac.DocumentReferenceType] = Nil,
  AdditionalDocumentReference: Seq[ubl.cac.DocumentReferenceType] = Nil,
  Signature: Seq[ubl.cac.SignatureType] = Nil,
  AccountingSupplierParty: ubl.cac.SupplierPartyType)

case class CreditNoteTypeSequence4(AccountingCustomerParty: ubl.cac.CustomerPartyType,
  PayeeParty: Option[ubl.cac.PartyType] = None,
  BuyerCustomerParty: Option[ubl.cac.CustomerPartyType] = None,
  SellerSupplierParty: Option[ubl.cac.SupplierPartyType] = None,
  TaxRepresentativeParty: Option[ubl.cac.PartyType] = None,
  TaxExchangeRate: Option[ubl.cac.ExchangeRateType] = None,
  PricingExchangeRate: Option[ubl.cac.ExchangeRateType] = None,
  PaymentExchangeRate: Option[ubl.cac.ExchangeRateType] = None,
  PaymentAlternativeExchangeRate: Option[ubl.cac.ExchangeRateType] = None,
  AllowanceCharge: Seq[ubl.cac.AllowanceChargeType] = Nil)

case class CreditNoteTypeSequence5(TaxTotal: Seq[ubl.cac.TaxTotalType] = Nil,
  LegalMonetaryTotal: ubl.cac.MonetaryTotalType,
  CreditNoteLine: Seq[ubl.cac.CreditNoteLineType] = Nil)

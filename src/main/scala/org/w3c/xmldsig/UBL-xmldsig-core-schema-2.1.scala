// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package org.w3c.xmldsig


case class SignatureType(SignedInfo: org.w3c.xmldsig.SignedInfoType,
  SignatureValue: org.w3c.xmldsig.SignatureValueType,
  KeyInfo: Option[org.w3c.xmldsig.KeyInfoType] = None,
  Object: Seq[org.w3c.xmldsig.ObjectType] = Nil,
  Id: Option[String] = None)


case class SignatureValueType(value: scalaxb.Base64Binary,
  Id: Option[String] = None)


case class SignedInfoType(CanonicalizationMethod: org.w3c.xmldsig.CanonicalizationMethodType,
  SignatureMethod: org.w3c.xmldsig.SignatureMethodType,
  Reference: Seq[org.w3c.xmldsig.ReferenceType] = Nil,
  Id: Option[String] = None)


case class CanonicalizationMethodType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil,
  Algorithm: java.net.URI)


case class SignatureMethodType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil,
  Algorithm: java.net.URI)


case class ReferenceType(Transforms: Option[org.w3c.xmldsig.TransformsType] = None,
  DigestMethod: org.w3c.xmldsig.DigestMethodType,
  DigestValue: scalaxb.Base64Binary,
  Id: Option[String] = None,
  URI: Option[java.net.URI] = None,
  Type: Option[java.net.URI] = None)


case class TransformsType(Transform: org.w3c.xmldsig.TransformType*)


case class TransformType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil,
  Algorithm: java.net.URI)

trait TransformTypeOption

case class DigestMethodType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil,
  Algorithm: java.net.URI)


case class KeyInfoType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil,
  Id: Option[String] = None)

trait KeyInfoTypeOption

case class KeyValueType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil)

trait KeyValueTypeOption

case class RetrievalMethodType(Transforms: Option[org.w3c.xmldsig.TransformsType] = None,
  URI: Option[java.net.URI] = None,
  Type: Option[java.net.URI] = None)


case class X509DataType(x509datatypeoption: scalaxb.DataRecord[Any]*)

trait X509DataTypeOption

case class X509IssuerSerialType(X509IssuerName: String,
  X509SerialNumber: BigInt)


case class PGPDataType(pgpdatatypeoption: scalaxb.DataRecord[org.w3c.xmldsig.PGPDataTypeOption])

trait PGPDataTypeOption
case class PGPDataTypeSequence1(PGPKeyID: scalaxb.Base64Binary,
  PGPKeyPacket: Option[scalaxb.Base64Binary] = None,
  any: Seq[scalaxb.DataRecord[Any]] = Nil) extends PGPDataTypeOption

case class PGPDataTypeSequence2(PGPKeyPacket: scalaxb.Base64Binary,
  any2: Seq[scalaxb.DataRecord[Any]] = Nil) extends PGPDataTypeOption


case class SPKIDataType(spkidatatypesequence1: org.w3c.xmldsig.SPKIDataTypeSequence1*)

case class SPKIDataTypeSequence1(SPKISexp: scalaxb.Base64Binary,
  any: Option[scalaxb.DataRecord[Any]] = None)


case class ObjectType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil,
  Id: Option[String] = None,
  MimeType: Option[String] = None,
  Encoding: Option[java.net.URI] = None)


case class ManifestType(Reference: Seq[org.w3c.xmldsig.ReferenceType] = Nil,
  Id: Option[String] = None)


case class SignaturePropertiesType(SignatureProperty: Seq[org.w3c.xmldsig.SignaturePropertyType] = Nil,
  Id: Option[String] = None)


case class SignaturePropertyType(mixed: Seq[scalaxb.DataRecord[Any]] = Nil,
  Target: java.net.URI,
  Id: Option[String] = None)

trait SignaturePropertyTypeOption

case class DSAKeyValueType(dsakeyvaluetypesequence1: Option[org.w3c.xmldsig.DSAKeyValueTypeSequence1] = None,
  G: Option[scalaxb.Base64Binary] = None,
  Y: scalaxb.Base64Binary,
  J: Option[scalaxb.Base64Binary] = None,
  dsakeyvaluetypesequence2: Option[org.w3c.xmldsig.DSAKeyValueTypeSequence2] = None) extends KeyValueTypeOption

case class DSAKeyValueTypeSequence1(P: scalaxb.Base64Binary,
  Q: scalaxb.Base64Binary)

case class DSAKeyValueTypeSequence2(Seed: scalaxb.Base64Binary,
  PgenCounter: scalaxb.Base64Binary)


case class RSAKeyValueType(Modulus: scalaxb.Base64Binary,
  Exponent: scalaxb.Base64Binary) extends KeyValueTypeOption


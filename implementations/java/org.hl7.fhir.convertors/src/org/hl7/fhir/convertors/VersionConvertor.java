package org.hl7.fhir.convertors;

import org.hl7.fhir.dstu2.model.AppointmentResponse.ParticipantStatus;
import org.hl7.fhir.dstu2.model.Reference;
import org.hl7.fhir.dstu2.utils.ToolingExtensions;
import org.hl7.fhir.exceptions.FHIRException;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Thu, Apr 7, 2016 02:14+1000 for FHIR v1.4.0


public class VersionConvertor {

  private static void copyElement(org.hl7.fhir.dstu2.model.Element src, org.hl7.fhir.dstu3.model.Element tgt) {
    tgt.setId(src.getId());
    for (org.hl7.fhir.dstu2.model.Extension  e : src.getExtension()) {
      tgt.addExtension(convertExtension(e));
    }
  }

  private static void copyElement(org.hl7.fhir.dstu3.model.Element src, org.hl7.fhir.dstu2.model.Element tgt) {
    tgt.setId(src.getId());
    for (org.hl7.fhir.dstu3.model.Extension  e : src.getExtension()) {
      tgt.addExtension(convertExtension(e));
    }
  }

  private static void copyBackboneElement(org.hl7.fhir.dstu2.model.BackboneElement src, org.hl7.fhir.dstu3.model.BackboneElement tgt) {
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Extension  e : src.getModifierExtension()) {
      tgt.addModifierExtension(convertExtension(e));
    }
  }

  private static void copyBackboneElement(org.hl7.fhir.dstu3.model.BackboneElement src, org.hl7.fhir.dstu2.model.BackboneElement tgt) {
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Extension  e : src.getModifierExtension()) {
      tgt.addModifierExtension(convertExtension(e));
    }
  }

  public static org.hl7.fhir.dstu3.model.Base64BinaryType convertBase64Binary(org.hl7.fhir.dstu2.model.Base64BinaryType src) {
    org.hl7.fhir.dstu3.model.Base64BinaryType tgt = new org.hl7.fhir.dstu3.model.Base64BinaryType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Base64BinaryType convertBase64Binary(org.hl7.fhir.dstu3.model.Base64BinaryType src) {
    org.hl7.fhir.dstu2.model.Base64BinaryType tgt = new org.hl7.fhir.dstu2.model.Base64BinaryType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.BooleanType convertBoolean(org.hl7.fhir.dstu2.model.BooleanType src) {
    org.hl7.fhir.dstu3.model.BooleanType tgt = new org.hl7.fhir.dstu3.model.BooleanType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.BooleanType convertBoolean(org.hl7.fhir.dstu3.model.BooleanType src) {
    org.hl7.fhir.dstu2.model.BooleanType tgt = new org.hl7.fhir.dstu2.model.BooleanType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeType convertCode(org.hl7.fhir.dstu2.model.CodeType src) {
    org.hl7.fhir.dstu3.model.CodeType tgt = new org.hl7.fhir.dstu3.model.CodeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CodeType convertCode(org.hl7.fhir.dstu3.model.CodeType src) {
    org.hl7.fhir.dstu2.model.CodeType tgt = new org.hl7.fhir.dstu2.model.CodeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DateType convertDate(org.hl7.fhir.dstu2.model.DateType src) {
    org.hl7.fhir.dstu3.model.DateType tgt = new org.hl7.fhir.dstu3.model.DateType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DateType convertDate(org.hl7.fhir.dstu3.model.DateType src) {
    org.hl7.fhir.dstu2.model.DateType tgt = new org.hl7.fhir.dstu2.model.DateType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DateTimeType convertDateTime(org.hl7.fhir.dstu2.model.DateTimeType src) {
    org.hl7.fhir.dstu3.model.DateTimeType tgt = new org.hl7.fhir.dstu3.model.DateTimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DateTimeType convertDateTime(org.hl7.fhir.dstu3.model.DateTimeType src) {
    org.hl7.fhir.dstu2.model.DateTimeType tgt = new org.hl7.fhir.dstu2.model.DateTimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DecimalType convertDecimal(org.hl7.fhir.dstu2.model.DecimalType src) {
    org.hl7.fhir.dstu3.model.DecimalType tgt = new org.hl7.fhir.dstu3.model.DecimalType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DecimalType convertDecimal(org.hl7.fhir.dstu3.model.DecimalType src) {
    org.hl7.fhir.dstu2.model.DecimalType tgt = new org.hl7.fhir.dstu2.model.DecimalType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.IdType convertId(org.hl7.fhir.dstu2.model.IdType src) {
    org.hl7.fhir.dstu3.model.IdType tgt = new org.hl7.fhir.dstu3.model.IdType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.IdType convertId(org.hl7.fhir.dstu3.model.IdType src) {
    org.hl7.fhir.dstu2.model.IdType tgt = new org.hl7.fhir.dstu2.model.IdType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.InstantType convertInstant(org.hl7.fhir.dstu2.model.InstantType src) {
    org.hl7.fhir.dstu3.model.InstantType tgt = new org.hl7.fhir.dstu3.model.InstantType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.InstantType convertInstant(org.hl7.fhir.dstu3.model.InstantType src) {
    org.hl7.fhir.dstu2.model.InstantType tgt = new org.hl7.fhir.dstu2.model.InstantType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.IntegerType convertInteger(org.hl7.fhir.dstu2.model.IntegerType src) {
    org.hl7.fhir.dstu3.model.IntegerType tgt = new org.hl7.fhir.dstu3.model.IntegerType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.IntegerType convertInteger(org.hl7.fhir.dstu3.model.IntegerType src) {
    org.hl7.fhir.dstu2.model.IntegerType tgt = new org.hl7.fhir.dstu2.model.IntegerType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MarkdownType convertMarkdown(org.hl7.fhir.dstu2.model.MarkdownType src) {
    org.hl7.fhir.dstu3.model.MarkdownType tgt = new org.hl7.fhir.dstu3.model.MarkdownType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MarkdownType convertMarkdown(org.hl7.fhir.dstu3.model.MarkdownType src) {
    org.hl7.fhir.dstu2.model.MarkdownType tgt = new org.hl7.fhir.dstu2.model.MarkdownType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OidType convertOid(org.hl7.fhir.dstu2.model.OidType src) {
    org.hl7.fhir.dstu3.model.OidType tgt = new org.hl7.fhir.dstu3.model.OidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OidType convertOid(org.hl7.fhir.dstu3.model.OidType src) {
    org.hl7.fhir.dstu2.model.OidType tgt = new org.hl7.fhir.dstu2.model.OidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.PositiveIntType convertPositiveInt(org.hl7.fhir.dstu2.model.PositiveIntType src) {
    org.hl7.fhir.dstu3.model.PositiveIntType tgt = new org.hl7.fhir.dstu3.model.PositiveIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.PositiveIntType convertPositiveInt(org.hl7.fhir.dstu3.model.PositiveIntType src) {
    org.hl7.fhir.dstu2.model.PositiveIntType tgt = new org.hl7.fhir.dstu2.model.PositiveIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StringType convertString(org.hl7.fhir.dstu2.model.StringType src) {
    org.hl7.fhir.dstu3.model.StringType tgt = new org.hl7.fhir.dstu3.model.StringType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.StringType convertString(org.hl7.fhir.dstu3.model.StringType src) {
    org.hl7.fhir.dstu2.model.StringType tgt = new org.hl7.fhir.dstu2.model.StringType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TimeType convertTime(org.hl7.fhir.dstu2.model.TimeType src) {
    org.hl7.fhir.dstu3.model.TimeType tgt = new org.hl7.fhir.dstu3.model.TimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TimeType convertTime(org.hl7.fhir.dstu3.model.TimeType src) {
    org.hl7.fhir.dstu2.model.TimeType tgt = new org.hl7.fhir.dstu2.model.TimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.UnsignedIntType convertUnsignedInt(org.hl7.fhir.dstu2.model.UnsignedIntType src) {
    org.hl7.fhir.dstu3.model.UnsignedIntType tgt = new org.hl7.fhir.dstu3.model.UnsignedIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.UnsignedIntType convertUnsignedInt(org.hl7.fhir.dstu3.model.UnsignedIntType src) {
    org.hl7.fhir.dstu2.model.UnsignedIntType tgt = new org.hl7.fhir.dstu2.model.UnsignedIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.UriType convertUri(org.hl7.fhir.dstu2.model.UriType src) {
    org.hl7.fhir.dstu3.model.UriType tgt = new org.hl7.fhir.dstu3.model.UriType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.UriType convertUri(org.hl7.fhir.dstu3.model.UriType src) {
    org.hl7.fhir.dstu2.model.UriType tgt = new org.hl7.fhir.dstu2.model.UriType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.UuidType convertUuid(org.hl7.fhir.dstu2.model.UuidType src) {
    org.hl7.fhir.dstu3.model.UuidType tgt = new org.hl7.fhir.dstu3.model.UuidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.UuidType convertUuid(org.hl7.fhir.dstu3.model.UuidType src) {
    org.hl7.fhir.dstu2.model.UuidType tgt = new org.hl7.fhir.dstu2.model.UuidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Extension convertExtension(org.hl7.fhir.dstu2.model.Extension src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Extension tgt = new org.hl7.fhir.dstu3.model.Extension();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Extension convertExtension(org.hl7.fhir.dstu3.model.Extension src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Extension tgt = new org.hl7.fhir.dstu2.model.Extension();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Narrative convertNarrative(org.hl7.fhir.dstu2.model.Narrative src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Narrative tgt = new org.hl7.fhir.dstu3.model.Narrative();
    copyElement(src, tgt);
    tgt.setStatus(convertNarrativeStatus(src.getStatus()));
    tgt.setDiv(src.getDiv());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Narrative convertNarrative(org.hl7.fhir.dstu3.model.Narrative src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Narrative tgt = new org.hl7.fhir.dstu2.model.Narrative();
    copyElement(src, tgt);
    tgt.setStatus(convertNarrativeStatus(src.getStatus()));
    tgt.setDiv(src.getDiv());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus convertNarrativeStatus(org.hl7.fhir.dstu2.model.Narrative.NarrativeStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case GENERATED: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.GENERATED;
    case EXTENSIONS: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.EXTENSIONS;
    case ADDITIONAL: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.ADDITIONAL;
    case EMPTY: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.EMPTY;
    default: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Narrative.NarrativeStatus convertNarrativeStatus(org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case GENERATED: return org.hl7.fhir.dstu2.model.Narrative.NarrativeStatus.GENERATED;
    case EXTENSIONS: return org.hl7.fhir.dstu2.model.Narrative.NarrativeStatus.EXTENSIONS;
    case ADDITIONAL: return org.hl7.fhir.dstu2.model.Narrative.NarrativeStatus.ADDITIONAL;
    case EMPTY: return org.hl7.fhir.dstu2.model.Narrative.NarrativeStatus.EMPTY;
    default: return org.hl7.fhir.dstu2.model.Narrative.NarrativeStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Annotation convertAnnotation(org.hl7.fhir.dstu2.model.Annotation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Annotation tgt = new org.hl7.fhir.dstu3.model.Annotation();
    copyElement(src, tgt);
    tgt.setAuthor(convertType(src.getAuthor()));
    tgt.setTime(src.getTime());
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Annotation convertAnnotation(org.hl7.fhir.dstu3.model.Annotation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Annotation tgt = new org.hl7.fhir.dstu2.model.Annotation();
    copyElement(src, tgt);
    tgt.setAuthor(convertType(src.getAuthor()));
    tgt.setTime(src.getTime());
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Attachment convertAttachment(org.hl7.fhir.dstu2.model.Attachment src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Attachment tgt = new org.hl7.fhir.dstu3.model.Attachment();
    copyElement(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setLanguage(src.getLanguage());
    tgt.setData(src.getData());
    tgt.setUrl(src.getUrl());
    tgt.setSize(src.getSize());
    tgt.setHash(src.getHash());
    tgt.setTitle(src.getTitle());
    tgt.setCreation(src.getCreation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Attachment convertAttachment(org.hl7.fhir.dstu3.model.Attachment src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Attachment tgt = new org.hl7.fhir.dstu2.model.Attachment();
    copyElement(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setLanguage(src.getLanguage());
    tgt.setData(src.getData());
    tgt.setUrl(src.getUrl());
    tgt.setSize(src.getSize());
    tgt.setHash(src.getHash());
    tgt.setTitle(src.getTitle());
    tgt.setCreation(src.getCreation());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeableConcept convertCodeableConcept(org.hl7.fhir.dstu2.model.CodeableConcept src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CodeableConcept tgt = new org.hl7.fhir.dstu3.model.CodeableConcept();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Coding t : src.getCoding())
      tgt.addCoding(convertCoding(t));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CodeableConcept convertCodeableConcept(org.hl7.fhir.dstu3.model.CodeableConcept src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CodeableConcept tgt = new org.hl7.fhir.dstu2.model.CodeableConcept();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCoding())
      tgt.addCoding(convertCoding(t));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Coding convertCoding(org.hl7.fhir.dstu2.model.Coding src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Coding tgt = new org.hl7.fhir.dstu3.model.Coding();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    tgt.setUserSelected(src.getUserSelected());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Coding convertCoding(org.hl7.fhir.dstu3.model.Coding src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Coding tgt = new org.hl7.fhir.dstu2.model.Coding();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    tgt.setUserSelected(src.getUserSelected());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Identifier convertIdentifier(org.hl7.fhir.dstu2.model.Identifier src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Identifier tgt = new org.hl7.fhir.dstu3.model.Identifier();
    copyElement(src, tgt);
    tgt.setUse(convertIdentifierUse(src.getUse()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSystem(src.getSystem());
    tgt.setValue(src.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setAssigner(convertReference(src.getAssigner()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Identifier convertIdentifier(org.hl7.fhir.dstu3.model.Identifier src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Identifier tgt = new org.hl7.fhir.dstu2.model.Identifier();
    copyElement(src, tgt);
    tgt.setUse(convertIdentifierUse(src.getUse()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSystem(src.getSystem());
    tgt.setValue(src.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setAssigner(convertReference(src.getAssigner()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Identifier.IdentifierUse convertIdentifierUse(org.hl7.fhir.dstu2.model.Identifier.IdentifierUse src) {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.TEMP;
    case SECONDARY: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.SECONDARY;
    default: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Identifier.IdentifierUse convertIdentifierUse(org.hl7.fhir.dstu3.model.Identifier.IdentifierUse src) {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu2.model.Identifier.IdentifierUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu2.model.Identifier.IdentifierUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu2.model.Identifier.IdentifierUse.TEMP;
    case SECONDARY: return org.hl7.fhir.dstu2.model.Identifier.IdentifierUse.SECONDARY;
    default: return org.hl7.fhir.dstu2.model.Identifier.IdentifierUse.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Period convertPeriod(org.hl7.fhir.dstu2.model.Period src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Period tgt = new org.hl7.fhir.dstu3.model.Period();
    copyElement(src, tgt);
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Period convertPeriod(org.hl7.fhir.dstu3.model.Period src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Period tgt = new org.hl7.fhir.dstu2.model.Period();
    copyElement(src, tgt);
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Quantity convertQuantity(org.hl7.fhir.dstu2.model.Quantity src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Quantity tgt = new org.hl7.fhir.dstu3.model.Quantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Quantity convertQuantity(org.hl7.fhir.dstu3.model.Quantity src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Quantity tgt = new org.hl7.fhir.dstu2.model.Quantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Quantity.QuantityComparator convertQuantityComparator(org.hl7.fhir.dstu2.model.Quantity.QuantityComparator src) {
    if (src == null)
      return null;
    switch (src) {
    case LESS_THAN: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.LESS_THAN;
    case LESS_OR_EQUAL: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.LESS_OR_EQUAL;
    case GREATER_OR_EQUAL: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.GREATER_OR_EQUAL;
    case GREATER_THAN: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.GREATER_THAN;
    default: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Quantity.QuantityComparator convertQuantityComparator(org.hl7.fhir.dstu3.model.Quantity.QuantityComparator src) {
    if (src == null)
      return null;
    switch (src) {
    case LESS_THAN: return org.hl7.fhir.dstu2.model.Quantity.QuantityComparator.LESS_THAN;
    case LESS_OR_EQUAL: return org.hl7.fhir.dstu2.model.Quantity.QuantityComparator.LESS_OR_EQUAL;
    case GREATER_OR_EQUAL: return org.hl7.fhir.dstu2.model.Quantity.QuantityComparator.GREATER_OR_EQUAL;
    case GREATER_THAN: return org.hl7.fhir.dstu2.model.Quantity.QuantityComparator.GREATER_THAN;
    default: return org.hl7.fhir.dstu2.model.Quantity.QuantityComparator.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Range convertRange(org.hl7.fhir.dstu2.model.Range src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Range tgt = new org.hl7.fhir.dstu3.model.Range();
    copyElement(src, tgt);
    tgt.setLow(convertSimpleQuantity(src.getLow()));
    tgt.setHigh(convertSimpleQuantity(src.getHigh()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Range convertRange(org.hl7.fhir.dstu3.model.Range src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Range tgt = new org.hl7.fhir.dstu2.model.Range();
    copyElement(src, tgt);
    tgt.setLow(convertSimpleQuantity(src.getLow()));
    tgt.setHigh(convertSimpleQuantity(src.getHigh()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Ratio convertRatio(org.hl7.fhir.dstu2.model.Ratio src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Ratio tgt = new org.hl7.fhir.dstu3.model.Ratio();
    copyElement(src, tgt);
    tgt.setNumerator(convertQuantity(src.getNumerator()));
    tgt.setDenominator(convertQuantity(src.getDenominator()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Ratio convertRatio(org.hl7.fhir.dstu3.model.Ratio src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Ratio tgt = new org.hl7.fhir.dstu2.model.Ratio();
    copyElement(src, tgt);
    tgt.setNumerator(convertQuantity(src.getNumerator()));
    tgt.setDenominator(convertQuantity(src.getDenominator()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Reference convertReference(org.hl7.fhir.dstu2.model.Reference src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Reference tgt = new org.hl7.fhir.dstu3.model.Reference();
    copyElement(src, tgt);
    tgt.setReference(src.getReference());
    tgt.setDisplay(src.getDisplay());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Reference convertReference(org.hl7.fhir.dstu3.model.Reference src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Reference tgt = new org.hl7.fhir.dstu2.model.Reference();
    copyElement(src, tgt);
    tgt.setReference(src.getReference());
    tgt.setDisplay(src.getDisplay());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.SampledData convertSampledData(org.hl7.fhir.dstu2.model.SampledData src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.SampledData tgt = new org.hl7.fhir.dstu3.model.SampledData();
    copyElement(src, tgt);
    tgt.setOrigin(convertSimpleQuantity(src.getOrigin()));
    tgt.setPeriod(src.getPeriod());
    tgt.setFactor(src.getFactor());
    tgt.setLowerLimit(src.getLowerLimit());
    tgt.setUpperLimit(src.getUpperLimit());
    tgt.setDimensions(src.getDimensions());
    tgt.setData(src.getData());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.SampledData convertSampledData(org.hl7.fhir.dstu3.model.SampledData src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.SampledData tgt = new org.hl7.fhir.dstu2.model.SampledData();
    copyElement(src, tgt);
    tgt.setOrigin(convertSimpleQuantity(src.getOrigin()));
    tgt.setPeriod(src.getPeriod());
    tgt.setFactor(src.getFactor());
    tgt.setLowerLimit(src.getLowerLimit());
    tgt.setUpperLimit(src.getUpperLimit());
    tgt.setDimensions(src.getDimensions());
    tgt.setData(src.getData());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Signature convertSignature(org.hl7.fhir.dstu2.model.Signature src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Signature tgt = new org.hl7.fhir.dstu3.model.Signature();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Coding t : src.getType())
      tgt.addType(convertCoding(t));
    tgt.setWhen(src.getWhen());
    tgt.setWho(convertType(src.getWho()));
    tgt.setContentType(src.getContentType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Signature convertSignature(org.hl7.fhir.dstu3.model.Signature src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Signature tgt = new org.hl7.fhir.dstu2.model.Signature();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Coding t : src.getType())
      tgt.addType(convertCoding(t));
    tgt.setWhen(src.getWhen());
    tgt.setWho(convertType(src.getWho()));
    tgt.setContentType(src.getContentType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Address convertAddress(org.hl7.fhir.dstu2.model.Address src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Address tgt = new org.hl7.fhir.dstu3.model.Address();
    copyElement(src, tgt);
    tgt.setUse(convertAddressUse(src.getUse()));
    tgt.setType(convertAddressType(src.getType()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getLine())
      tgt.addLine(t.getValue());
    tgt.setCity(src.getCity());
    tgt.setDistrict(src.getDistrict());
    tgt.setState(src.getState());
    tgt.setPostalCode(src.getPostalCode());
    tgt.setCountry(src.getCountry());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Address convertAddress(org.hl7.fhir.dstu3.model.Address src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Address tgt = new org.hl7.fhir.dstu2.model.Address();
    copyElement(src, tgt);
    tgt.setUse(convertAddressUse(src.getUse()));
    tgt.setType(convertAddressType(src.getType()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getLine())
      tgt.addLine(t.getValue());
    tgt.setCity(src.getCity());
    tgt.setDistrict(src.getDistrict());
    tgt.setState(src.getState());
    tgt.setPostalCode(src.getPostalCode());
    tgt.setCountry(src.getCountry());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Address.AddressUse convertAddressUse(org.hl7.fhir.dstu2.model.Address.AddressUse src) {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu3.model.Address.AddressUse.HOME;
    case WORK: return org.hl7.fhir.dstu3.model.Address.AddressUse.WORK;
    case TEMP: return org.hl7.fhir.dstu3.model.Address.AddressUse.TEMP;
    case OLD: return org.hl7.fhir.dstu3.model.Address.AddressUse.OLD;
    default: return org.hl7.fhir.dstu3.model.Address.AddressUse.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Address.AddressUse convertAddressUse(org.hl7.fhir.dstu3.model.Address.AddressUse src) {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu2.model.Address.AddressUse.HOME;
    case WORK: return org.hl7.fhir.dstu2.model.Address.AddressUse.WORK;
    case TEMP: return org.hl7.fhir.dstu2.model.Address.AddressUse.TEMP;
    case OLD: return org.hl7.fhir.dstu2.model.Address.AddressUse.OLD;
    default: return org.hl7.fhir.dstu2.model.Address.AddressUse.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Address.AddressType convertAddressType(org.hl7.fhir.dstu2.model.Address.AddressType src) {
    if (src == null)
      return null;
    switch (src) {
    case POSTAL: return org.hl7.fhir.dstu3.model.Address.AddressType.POSTAL;
    case PHYSICAL: return org.hl7.fhir.dstu3.model.Address.AddressType.PHYSICAL;
    case BOTH: return org.hl7.fhir.dstu3.model.Address.AddressType.BOTH;
    default: return org.hl7.fhir.dstu3.model.Address.AddressType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Address.AddressType convertAddressType(org.hl7.fhir.dstu3.model.Address.AddressType src) {
    if (src == null)
      return null;
    switch (src) {
    case POSTAL: return org.hl7.fhir.dstu2.model.Address.AddressType.POSTAL;
    case PHYSICAL: return org.hl7.fhir.dstu2.model.Address.AddressType.PHYSICAL;
    case BOTH: return org.hl7.fhir.dstu2.model.Address.AddressType.BOTH;
    default: return org.hl7.fhir.dstu2.model.Address.AddressType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ContactPoint convertContactPoint(org.hl7.fhir.dstu2.model.ContactPoint src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ContactPoint tgt = new org.hl7.fhir.dstu3.model.ContactPoint();
    copyElement(src, tgt);
    tgt.setSystem(convertContactPointSystem(src.getSystem()));
    tgt.setValue(src.getValue());
    tgt.setUse(convertContactPointUse(src.getUse()));
    tgt.setRank(src.getRank());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ContactPoint convertContactPoint(org.hl7.fhir.dstu3.model.ContactPoint src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ContactPoint tgt = new org.hl7.fhir.dstu2.model.ContactPoint();
    copyElement(src, tgt);
    tgt.setSystem(convertContactPointSystem(src.getSystem()));
    tgt.setValue(src.getValue());
    tgt.setUse(convertContactPointUse(src.getUse()));
    tgt.setRank(src.getRank());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem convertContactPointSystem(org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem src) {
    if (src == null)
      return null;
    switch (src) {
    case PHONE: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.PHONE;
    case FAX: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.FAX;
    case EMAIL: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.EMAIL;
    case PAGER: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.PAGER;
    case OTHER: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.OTHER;
    default: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem convertContactPointSystem(org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem src) {
    if (src == null)
      return null;
    switch (src) {
    case PHONE: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem.PHONE;
    case FAX: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem.FAX;
    case EMAIL: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem.EMAIL;
    case PAGER: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem.PAGER;
    case OTHER: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem.OTHER;
    default: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointSystem.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse convertContactPointUse(org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse src) {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.HOME;
    case WORK: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.WORK;
    case TEMP: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.TEMP;
    case OLD: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.OLD;
    case MOBILE: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.MOBILE;
    default: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse convertContactPointUse(org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse src) {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse.HOME;
    case WORK: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse.WORK;
    case TEMP: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse.TEMP;
    case OLD: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse.OLD;
    case MOBILE: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse.MOBILE;
    default: return org.hl7.fhir.dstu2.model.ContactPoint.ContactPointUse.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ElementDefinition convertElementDefinition(org.hl7.fhir.dstu2.model.ElementDefinition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition tgt = new org.hl7.fhir.dstu3.model.ElementDefinition();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    for (org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.ElementDefinition.PropertyRepresentation> t : src.getRepresentation())
      tgt.addRepresentation(convertPropertyRepresentation(t.getValue()));
    tgt.setName(src.getName());
    tgt.setId(src.getName());
    tgt.setLabel(src.getLabel());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setSlicing(convertElementDefinitionSlicingComponent(src.getSlicing()));
    tgt.setShort(src.getShort());
    tgt.setDefinition(src.getDefinition());
    tgt.setComments(src.getComments());
    tgt.setRequirements(src.getRequirements());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getAlias())
      tgt.addAlias(t.getValue());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setBase(convertElementDefinitionBaseComponent(src.getBase()));
    tgt.setContentReference("#"+src.getNameReference());
    for (org.hl7.fhir.dstu2.model.ElementDefinition.TypeRefComponent t : src.getType())
      tgt.addType(convertTypeRefComponent(t));
    tgt.setDefaultValue(convertType(src.getDefaultValue()));
    tgt.setMeaningWhenMissing(src.getMeaningWhenMissing());
    tgt.setFixed(convertType(src.getFixed()));
    tgt.setPattern(convertType(src.getPattern()));
    tgt.setExample(convertType(src.getExample()));
    tgt.setMinValue(convertType(src.getMinValue()));
    tgt.setMaxValue(convertType(src.getMaxValue()));
    tgt.setMaxLength(src.getMaxLength());
    for (org.hl7.fhir.dstu2.model.IdType t : src.getCondition())
      tgt.addCondition(t.getValue());
    for (org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionConstraintComponent t : src.getConstraint())
      tgt.addConstraint(convertElementDefinitionConstraintComponent(t));
    tgt.setMustSupport(src.getMustSupport());
    tgt.setIsModifier(src.getIsModifier());
    tgt.setIsSummary(src.getIsSummary());
    tgt.setBinding(convertElementDefinitionBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertElementDefinitionMappingComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ElementDefinition convertElementDefinition(org.hl7.fhir.dstu3.model.ElementDefinition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ElementDefinition tgt = new org.hl7.fhir.dstu2.model.ElementDefinition();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation> t : src.getRepresentation())
      tgt.addRepresentation(convertPropertyRepresentation(t.getValue()));
    tgt.setName(src.getId());
    tgt.setLabel(src.getLabel());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setSlicing(convertElementDefinitionSlicingComponent(src.getSlicing()));
    tgt.setShort(src.getShort());
    tgt.setDefinition(src.getDefinition());
    tgt.setComments(src.getComments());
    tgt.setRequirements(src.getRequirements());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getAlias())
      tgt.addAlias(t.getValue());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setBase(convertElementDefinitionBaseComponent(src.getBase()));
    if (src.hasContentReference())
      tgt.setNameReference(src.getContentReference().substring(1));
    for (org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent t : src.getType())
      tgt.addType(convertTypeRefComponent(t));
    tgt.setDefaultValue(convertType(src.getDefaultValue()));
    tgt.setMeaningWhenMissing(src.getMeaningWhenMissing());
    tgt.setFixed(convertType(src.getFixed()));
    tgt.setPattern(convertType(src.getPattern()));
    tgt.setExample(convertType(src.getExample()));
    tgt.setMinValue(convertType(src.getMinValue()));
    tgt.setMaxValue(convertType(src.getMaxValue()));
    tgt.setMaxLength(src.getMaxLength());
    for (org.hl7.fhir.dstu3.model.IdType t : src.getCondition())
      tgt.addCondition(t.getValue());
    for (org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent t : src.getConstraint())
      tgt.addConstraint(convertElementDefinitionConstraintComponent(t));
    tgt.setMustSupport(src.getMustSupport());
    tgt.setIsModifier(src.getIsModifier());
    tgt.setIsSummary(src.getIsSummary());
    tgt.setBinding(convertElementDefinitionBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertElementDefinitionMappingComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation convertPropertyRepresentation(org.hl7.fhir.dstu2.model.ElementDefinition.PropertyRepresentation src) {
    if (src == null)
      return null;
    switch (src) {
    case XMLATTR: return org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation.XMLATTR;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ElementDefinition.PropertyRepresentation convertPropertyRepresentation(org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation src) {
    if (src == null)
      return null;
    switch (src) {
    case XMLATTR: return org.hl7.fhir.dstu2.model.ElementDefinition.PropertyRepresentation.XMLATTR;
    default: return org.hl7.fhir.dstu2.model.ElementDefinition.PropertyRepresentation.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent convertElementDefinitionSlicingComponent(org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionSlicingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.StringType t : src.getDiscriminator())
      tgt.addDiscriminator(t.getValue());
    tgt.setDescription(src.getDescription());
    tgt.setOrdered(src.getOrdered());
    tgt.setRules(convertSlicingRules(src.getRules()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionSlicingComponent convertElementDefinitionSlicingComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionSlicingComponent tgt = new org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionSlicingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.StringType t : src.getDiscriminator())
      tgt.addDiscriminator(t.getValue());
    tgt.setDescription(src.getDescription());
    tgt.setOrdered(src.getOrdered());
    tgt.setRules(convertSlicingRules(src.getRules()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules convertSlicingRules(org.hl7.fhir.dstu2.model.ElementDefinition.SlicingRules src) {
    if (src == null)
      return null;
    switch (src) {
    case CLOSED: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.CLOSED;
    case OPEN: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.OPEN;
    case OPENATEND: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.OPENATEND;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ElementDefinition.SlicingRules convertSlicingRules(org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules src) {
    if (src == null)
      return null;
    switch (src) {
    case CLOSED: return org.hl7.fhir.dstu2.model.ElementDefinition.SlicingRules.CLOSED;
    case OPEN: return org.hl7.fhir.dstu2.model.ElementDefinition.SlicingRules.OPEN;
    case OPENATEND: return org.hl7.fhir.dstu2.model.ElementDefinition.SlicingRules.OPENATEND;
    default: return org.hl7.fhir.dstu2.model.ElementDefinition.SlicingRules.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent convertElementDefinitionBaseComponent(org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBaseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBaseComponent convertElementDefinitionBaseComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBaseComponent tgt = new org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBaseComponent();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent convertTypeRefComponent(org.hl7.fhir.dstu2.model.ElementDefinition.TypeRefComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu2.model.UriType t : src.getProfile())
      tgt.addProfile(t.getValue());
    for (org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.ElementDefinition.AggregationMode> t : src.getAggregation())
      tgt.addAggregation(convertAggregationMode(t.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ElementDefinition.TypeRefComponent convertTypeRefComponent(org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ElementDefinition.TypeRefComponent tgt = new org.hl7.fhir.dstu2.model.ElementDefinition.TypeRefComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu3.model.UriType t : src.getProfile())
      tgt.addProfile(t.getValue());
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode> t : src.getAggregation())
      tgt.addAggregation(convertAggregationMode(t.getValue()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode convertAggregationMode(org.hl7.fhir.dstu2.model.ElementDefinition.AggregationMode src) {
    if (src == null)
      return null;
    switch (src) {
    case CONTAINED: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.CONTAINED;
    case REFERENCED: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.REFERENCED;
    case BUNDLED: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.BUNDLED;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ElementDefinition.AggregationMode convertAggregationMode(org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode src) {
    if (src == null)
      return null;
    switch (src) {
    case CONTAINED: return org.hl7.fhir.dstu2.model.ElementDefinition.AggregationMode.CONTAINED;
    case REFERENCED: return org.hl7.fhir.dstu2.model.ElementDefinition.AggregationMode.REFERENCED;
    case BUNDLED: return org.hl7.fhir.dstu2.model.ElementDefinition.AggregationMode.BUNDLED;
    default: return org.hl7.fhir.dstu2.model.ElementDefinition.AggregationMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent convertElementDefinitionConstraintComponent(org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionConstraintComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent();
    copyElement(src, tgt);
    tgt.setKey(src.getKey());
    tgt.setRequirements(src.getRequirements());
    tgt.setSeverity(convertConstraintSeverity(src.getSeverity()));
    tgt.setHuman(src.getHuman());
    tgt.setExpression(ToolingExtensions.readStringExtension(src, ToolingExtensions.EXT_EXPRESSION));
    tgt.setXpath(src.getXpath());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionConstraintComponent convertElementDefinitionConstraintComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionConstraintComponent tgt = new org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionConstraintComponent();
    copyElement(src, tgt);
    tgt.setKey(src.getKey());
    tgt.setRequirements(src.getRequirements());
    tgt.setSeverity(convertConstraintSeverity(src.getSeverity()));
    tgt.setHuman(src.getHuman());
    if (src.hasExpression())
    	ToolingExtensions.addStringExtension(tgt, ToolingExtensions.EXT_EXPRESSION, src.getExpression());
    tgt.setXpath(src.getXpath());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity convertConstraintSeverity(org.hl7.fhir.dstu2.model.ElementDefinition.ConstraintSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case ERROR: return org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity.WARNING;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ElementDefinition.ConstraintSeverity convertConstraintSeverity(org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case ERROR: return org.hl7.fhir.dstu2.model.ElementDefinition.ConstraintSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu2.model.ElementDefinition.ConstraintSeverity.WARNING;
    default: return org.hl7.fhir.dstu2.model.ElementDefinition.ConstraintSeverity.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent convertElementDefinitionBindingComponent(org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBindingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setDescription(src.getDescription());
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBindingComponent convertElementDefinitionBindingComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBindingComponent tgt = new org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setDescription(src.getDescription());
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Enumerations.BindingStrength convertBindingStrength(org.hl7.fhir.dstu2.model.Enumerations.BindingStrength src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUIRED: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.REQUIRED;
    case EXTENSIBLE: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.EXTENSIBLE;
    case PREFERRED: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.PREFERRED;
    case EXAMPLE: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.EXAMPLE;
    default: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Enumerations.BindingStrength convertBindingStrength(org.hl7.fhir.dstu3.model.Enumerations.BindingStrength src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUIRED: return org.hl7.fhir.dstu2.model.Enumerations.BindingStrength.REQUIRED;
    case EXTENSIBLE: return org.hl7.fhir.dstu2.model.Enumerations.BindingStrength.EXTENSIBLE;
    case PREFERRED: return org.hl7.fhir.dstu2.model.Enumerations.BindingStrength.PREFERRED;
    case EXAMPLE: return org.hl7.fhir.dstu2.model.Enumerations.BindingStrength.EXAMPLE;
    default: return org.hl7.fhir.dstu2.model.Enumerations.BindingStrength.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent convertElementDefinitionMappingComponent(org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionMappingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setLanguage(src.getLanguage());
    tgt.setMap(src.getMap());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionMappingComponent convertElementDefinitionMappingComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionMappingComponent tgt = new org.hl7.fhir.dstu2.model.ElementDefinition.ElementDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setLanguage(src.getLanguage());
    tgt.setMap(src.getMap());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.HumanName convertHumanName(org.hl7.fhir.dstu2.model.HumanName src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.HumanName tgt = new org.hl7.fhir.dstu3.model.HumanName();
    copyElement(src, tgt);
    tgt.setUse(convertNameUse(src.getUse()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getFamily())
      tgt.addFamily(t.getValue());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getGiven())
      tgt.addGiven(t.getValue());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getPrefix())
      tgt.addPrefix(t.getValue());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getSuffix())
      tgt.addSuffix(t.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.HumanName convertHumanName(org.hl7.fhir.dstu3.model.HumanName src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.HumanName tgt = new org.hl7.fhir.dstu2.model.HumanName();
    copyElement(src, tgt);
    tgt.setUse(convertNameUse(src.getUse()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getFamily())
      tgt.addFamily(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getGiven())
      tgt.addGiven(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getPrefix())
      tgt.addPrefix(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getSuffix())
      tgt.addSuffix(t.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.HumanName.NameUse convertNameUse(org.hl7.fhir.dstu2.model.HumanName.NameUse src) {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu3.model.HumanName.NameUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu3.model.HumanName.NameUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu3.model.HumanName.NameUse.TEMP;
    case NICKNAME: return org.hl7.fhir.dstu3.model.HumanName.NameUse.NICKNAME;
    case ANONYMOUS: return org.hl7.fhir.dstu3.model.HumanName.NameUse.ANONYMOUS;
    case OLD: return org.hl7.fhir.dstu3.model.HumanName.NameUse.OLD;
    case MAIDEN: return org.hl7.fhir.dstu3.model.HumanName.NameUse.MAIDEN;
    default: return org.hl7.fhir.dstu3.model.HumanName.NameUse.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.HumanName.NameUse convertNameUse(org.hl7.fhir.dstu3.model.HumanName.NameUse src) {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu2.model.HumanName.NameUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu2.model.HumanName.NameUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu2.model.HumanName.NameUse.TEMP;
    case NICKNAME: return org.hl7.fhir.dstu2.model.HumanName.NameUse.NICKNAME;
    case ANONYMOUS: return org.hl7.fhir.dstu2.model.HumanName.NameUse.ANONYMOUS;
    case OLD: return org.hl7.fhir.dstu2.model.HumanName.NameUse.OLD;
    case MAIDEN: return org.hl7.fhir.dstu2.model.HumanName.NameUse.MAIDEN;
    default: return org.hl7.fhir.dstu2.model.HumanName.NameUse.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Meta convertMeta(org.hl7.fhir.dstu2.model.Meta src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Meta tgt = new org.hl7.fhir.dstu3.model.Meta();
    copyElement(src, tgt);
    tgt.setVersionId(src.getVersionId());
    tgt.setLastUpdated(src.getLastUpdated());
    for (org.hl7.fhir.dstu2.model.UriType t : src.getProfile())
      tgt.addProfile(t.getValue());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getSecurity())
      tgt.addSecurity(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getTag())
      tgt.addTag(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Meta convertMeta(org.hl7.fhir.dstu3.model.Meta src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Meta tgt = new org.hl7.fhir.dstu2.model.Meta();
    copyElement(src, tgt);
    tgt.setVersionId(src.getVersionId());
    tgt.setLastUpdated(src.getLastUpdated());
    for (org.hl7.fhir.dstu3.model.UriType t : src.getProfile())
      tgt.addProfile(t.getValue());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSecurity())
      tgt.addSecurity(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getTag())
      tgt.addTag(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Timing convertTiming(org.hl7.fhir.dstu2.model.Timing src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Timing tgt = new org.hl7.fhir.dstu3.model.Timing();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.DateTimeType t : src.getEvent())
      tgt.addEvent(t.getValue());
    tgt.setRepeat(convertTimingRepeatComponent(src.getRepeat()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Timing convertTiming(org.hl7.fhir.dstu3.model.Timing src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Timing tgt = new org.hl7.fhir.dstu2.model.Timing();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.DateTimeType t : src.getEvent())
      tgt.addEvent(t.getValue());
    tgt.setRepeat(convertTimingRepeatComponent(src.getRepeat()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent convertTimingRepeatComponent(org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent tgt = new org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent();
    copyElement(src, tgt);
    tgt.setBounds(convertType(src.getBounds()));
    tgt.setCount(src.getCount());
    tgt.setDuration(src.getDuration());
    tgt.setDurationMax(src.getDurationMax());
    tgt.setDurationUnit(convertUnitsOfTime(src.getDurationUnits()));
    tgt.setFrequency(src.getFrequency());
    tgt.setFrequencyMax(src.getFrequencyMax());
    tgt.setPeriod(src.getPeriod());
    tgt.setPeriodMax(src.getPeriodMax());
    tgt.setPeriodUnit(convertUnitsOfTime(src.getPeriodUnits()));
    tgt.setWhen(convertEventTiming(src.getWhen()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent convertTimingRepeatComponent(org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent tgt = new org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent();
    copyElement(src, tgt);
    tgt.setBounds(convertType(src.getBounds()));
    tgt.setCount(src.getCount());
    tgt.setDuration(src.getDuration());
    tgt.setDurationMax(src.getDurationMax());
    tgt.setDurationUnits(convertUnitsOfTime(src.getDurationUnit()));
    tgt.setFrequency(src.getFrequency());
    tgt.setFrequencyMax(src.getFrequencyMax());
    tgt.setPeriod(src.getPeriod());
    tgt.setPeriodMax(src.getPeriodMax());
    tgt.setPeriodUnits(convertUnitsOfTime(src.getPeriodUnit()));
    tgt.setWhen(convertEventTiming(src.getWhen()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Timing.UnitsOfTime convertUnitsOfTime(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime src) {
    if (src == null)
      return null;
    switch (src) {
    case S: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.S;
    case MIN: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.MIN;
    case H: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.H;
    case D: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.D;
    case WK: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.WK;
    case MO: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.MO;
    case A: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.A;
    default: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Timing.UnitsOfTime convertUnitsOfTime(org.hl7.fhir.dstu3.model.Timing.UnitsOfTime src) {
    if (src == null)
      return null;
    switch (src) {
    case S: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.S;
    case MIN: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.MIN;
    case H: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.H;
    case D: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.D;
    case WK: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.WK;
    case MO: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.MO;
    case A: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.A;
    default: return org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Timing.EventTiming convertEventTiming(org.hl7.fhir.dstu2.model.Timing.EventTiming src) {
    if (src == null)
      return null;
    switch (src) {
    case HS: return org.hl7.fhir.dstu3.model.Timing.EventTiming.HS;
    case WAKE: return org.hl7.fhir.dstu3.model.Timing.EventTiming.WAKE;
    case C: return org.hl7.fhir.dstu3.model.Timing.EventTiming.C;
    case CM: return org.hl7.fhir.dstu3.model.Timing.EventTiming.CM;
    case CD: return org.hl7.fhir.dstu3.model.Timing.EventTiming.CD;
    case CV: return org.hl7.fhir.dstu3.model.Timing.EventTiming.CV;
    case AC: return org.hl7.fhir.dstu3.model.Timing.EventTiming.AC;
    case ACM: return org.hl7.fhir.dstu3.model.Timing.EventTiming.ACM;
    case ACD: return org.hl7.fhir.dstu3.model.Timing.EventTiming.ACD;
    case ACV: return org.hl7.fhir.dstu3.model.Timing.EventTiming.ACV;
    case PC: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PC;
    case PCM: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PCM;
    case PCD: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PCD;
    case PCV: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PCV;
    default: return org.hl7.fhir.dstu3.model.Timing.EventTiming.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Timing.EventTiming convertEventTiming(org.hl7.fhir.dstu3.model.Timing.EventTiming src) {
    if (src == null)
      return null;
    switch (src) {
    case HS: return org.hl7.fhir.dstu2.model.Timing.EventTiming.HS;
    case WAKE: return org.hl7.fhir.dstu2.model.Timing.EventTiming.WAKE;
    case C: return org.hl7.fhir.dstu2.model.Timing.EventTiming.C;
    case CM: return org.hl7.fhir.dstu2.model.Timing.EventTiming.CM;
    case CD: return org.hl7.fhir.dstu2.model.Timing.EventTiming.CD;
    case CV: return org.hl7.fhir.dstu2.model.Timing.EventTiming.CV;
    case AC: return org.hl7.fhir.dstu2.model.Timing.EventTiming.AC;
    case ACM: return org.hl7.fhir.dstu2.model.Timing.EventTiming.ACM;
    case ACD: return org.hl7.fhir.dstu2.model.Timing.EventTiming.ACD;
    case ACV: return org.hl7.fhir.dstu2.model.Timing.EventTiming.ACV;
    case PC: return org.hl7.fhir.dstu2.model.Timing.EventTiming.PC;
    case PCM: return org.hl7.fhir.dstu2.model.Timing.EventTiming.PCM;
    case PCD: return org.hl7.fhir.dstu2.model.Timing.EventTiming.PCD;
    case PCV: return org.hl7.fhir.dstu2.model.Timing.EventTiming.PCV;
    default: return org.hl7.fhir.dstu2.model.Timing.EventTiming.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Age convertAge(org.hl7.fhir.dstu2.model.Age src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Age tgt = new org.hl7.fhir.dstu3.model.Age();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Age convertAge(org.hl7.fhir.dstu3.model.Age src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Age tgt = new org.hl7.fhir.dstu2.model.Age();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Count convertCount(org.hl7.fhir.dstu2.model.Count src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Count tgt = new org.hl7.fhir.dstu3.model.Count();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Count convertCount(org.hl7.fhir.dstu3.model.Count src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Count tgt = new org.hl7.fhir.dstu2.model.Count();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Distance convertDistance(org.hl7.fhir.dstu2.model.Distance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Distance tgt = new org.hl7.fhir.dstu3.model.Distance();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Distance convertDistance(org.hl7.fhir.dstu3.model.Distance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Distance tgt = new org.hl7.fhir.dstu2.model.Distance();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Duration convertDuration(org.hl7.fhir.dstu2.model.Duration src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Duration tgt = new org.hl7.fhir.dstu3.model.Duration();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Duration convertDuration(org.hl7.fhir.dstu3.model.Duration src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Duration tgt = new org.hl7.fhir.dstu2.model.Duration();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Money convertMoney(org.hl7.fhir.dstu2.model.Money src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Money tgt = new org.hl7.fhir.dstu3.model.Money();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Money convertMoney(org.hl7.fhir.dstu3.model.Money src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Money tgt = new org.hl7.fhir.dstu2.model.Money();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.SimpleQuantity convertSimpleQuantity(org.hl7.fhir.dstu2.model.SimpleQuantity src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.SimpleQuantity tgt = new org.hl7.fhir.dstu3.model.SimpleQuantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.SimpleQuantity convertSimpleQuantity(org.hl7.fhir.dstu3.model.SimpleQuantity src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.SimpleQuantity tgt = new org.hl7.fhir.dstu2.model.SimpleQuantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Type convertType(org.hl7.fhir.dstu2.model.Type src) {
    if (src == null)
      return null;
    if (src instanceof org.hl7.fhir.dstu2.model.Base64BinaryType)
      return convertBase64Binary((org.hl7.fhir.dstu2.model.Base64BinaryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.BooleanType)
      return convertBoolean((org.hl7.fhir.dstu2.model.BooleanType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CodeType)
      return convertCode((org.hl7.fhir.dstu2.model.CodeType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DateType)
      return convertDate((org.hl7.fhir.dstu2.model.DateType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DateTimeType)
      return convertDateTime((org.hl7.fhir.dstu2.model.DateTimeType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DecimalType)
      return convertDecimal((org.hl7.fhir.dstu2.model.DecimalType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.IdType)
      return convertId((org.hl7.fhir.dstu2.model.IdType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.InstantType)
      return convertInstant((org.hl7.fhir.dstu2.model.InstantType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.IntegerType)
      return convertInteger((org.hl7.fhir.dstu2.model.IntegerType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MarkdownType)
      return convertMarkdown((org.hl7.fhir.dstu2.model.MarkdownType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OidType)
      return convertOid((org.hl7.fhir.dstu2.model.OidType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.PositiveIntType)
      return convertPositiveInt((org.hl7.fhir.dstu2.model.PositiveIntType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.StringType)
      return convertString((org.hl7.fhir.dstu2.model.StringType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.TimeType)
      return convertTime((org.hl7.fhir.dstu2.model.TimeType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.UnsignedIntType)
      return convertUnsignedInt((org.hl7.fhir.dstu2.model.UnsignedIntType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.UriType)
      return convertUri((org.hl7.fhir.dstu2.model.UriType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.UuidType)
      return convertUuid((org.hl7.fhir.dstu2.model.UuidType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Extension)
      return convertExtension((org.hl7.fhir.dstu2.model.Extension) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Narrative)
      return convertNarrative((org.hl7.fhir.dstu2.model.Narrative) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Annotation)
      return convertAnnotation((org.hl7.fhir.dstu2.model.Annotation) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Attachment)
      return convertAttachment((org.hl7.fhir.dstu2.model.Attachment) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CodeableConcept)
      return convertCodeableConcept((org.hl7.fhir.dstu2.model.CodeableConcept) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Coding)
      return convertCoding((org.hl7.fhir.dstu2.model.Coding) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Identifier)
      return convertIdentifier((org.hl7.fhir.dstu2.model.Identifier) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Period)
      return convertPeriod((org.hl7.fhir.dstu2.model.Period) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Quantity)
      return convertQuantity((org.hl7.fhir.dstu2.model.Quantity) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Range)
      return convertRange((org.hl7.fhir.dstu2.model.Range) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Ratio)
      return convertRatio((org.hl7.fhir.dstu2.model.Ratio) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Reference)
      return convertReference((org.hl7.fhir.dstu2.model.Reference) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SampledData)
      return convertSampledData((org.hl7.fhir.dstu2.model.SampledData) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Signature)
      return convertSignature((org.hl7.fhir.dstu2.model.Signature) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Address)
      return convertAddress((org.hl7.fhir.dstu2.model.Address) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ContactPoint)
      return convertContactPoint((org.hl7.fhir.dstu2.model.ContactPoint) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ElementDefinition)
      return convertElementDefinition((org.hl7.fhir.dstu2.model.ElementDefinition) src);
    if (src instanceof org.hl7.fhir.dstu2.model.HumanName)
      return convertHumanName((org.hl7.fhir.dstu2.model.HumanName) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Meta)
      return convertMeta((org.hl7.fhir.dstu2.model.Meta) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Timing)
      return convertTiming((org.hl7.fhir.dstu2.model.Timing) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Age)
      return convertAge((org.hl7.fhir.dstu2.model.Age) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Count)
      return convertCount((org.hl7.fhir.dstu2.model.Count) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Distance)
      return convertDistance((org.hl7.fhir.dstu2.model.Distance) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Duration)
      return convertDuration((org.hl7.fhir.dstu2.model.Duration) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Money)
      return convertMoney((org.hl7.fhir.dstu2.model.Money) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SimpleQuantity)
      return convertSimpleQuantity((org.hl7.fhir.dstu2.model.SimpleQuantity) src);
    throw new Error("Unknown type "+src.fhirType());
  }

  public static org.hl7.fhir.dstu2.model.Type convertType(org.hl7.fhir.dstu3.model.Type src) {
    if (src == null)
      return null;
    if (src instanceof org.hl7.fhir.dstu3.model.Base64BinaryType)
      return convertBase64Binary((org.hl7.fhir.dstu3.model.Base64BinaryType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.BooleanType)
      return convertBoolean((org.hl7.fhir.dstu3.model.BooleanType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.CodeType)
      return convertCode((org.hl7.fhir.dstu3.model.CodeType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.DateType)
      return convertDate((org.hl7.fhir.dstu3.model.DateType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.DateTimeType)
      return convertDateTime((org.hl7.fhir.dstu3.model.DateTimeType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.DecimalType)
      return convertDecimal((org.hl7.fhir.dstu3.model.DecimalType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.IdType)
      return convertId((org.hl7.fhir.dstu3.model.IdType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.InstantType)
      return convertInstant((org.hl7.fhir.dstu3.model.InstantType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.IntegerType)
      return convertInteger((org.hl7.fhir.dstu3.model.IntegerType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.MarkdownType)
      return convertMarkdown((org.hl7.fhir.dstu3.model.MarkdownType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.OidType)
      return convertOid((org.hl7.fhir.dstu3.model.OidType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.PositiveIntType)
      return convertPositiveInt((org.hl7.fhir.dstu3.model.PositiveIntType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.StringType)
      return convertString((org.hl7.fhir.dstu3.model.StringType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.TimeType)
      return convertTime((org.hl7.fhir.dstu3.model.TimeType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.UnsignedIntType)
      return convertUnsignedInt((org.hl7.fhir.dstu3.model.UnsignedIntType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.UriType)
      return convertUri((org.hl7.fhir.dstu3.model.UriType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.UuidType)
      return convertUuid((org.hl7.fhir.dstu3.model.UuidType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Extension)
      return convertExtension((org.hl7.fhir.dstu3.model.Extension) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Narrative)
      return convertNarrative((org.hl7.fhir.dstu3.model.Narrative) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Annotation)
      return convertAnnotation((org.hl7.fhir.dstu3.model.Annotation) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Attachment)
      return convertAttachment((org.hl7.fhir.dstu3.model.Attachment) src);
    if (src instanceof org.hl7.fhir.dstu3.model.CodeableConcept)
      return convertCodeableConcept((org.hl7.fhir.dstu3.model.CodeableConcept) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Coding)
      return convertCoding((org.hl7.fhir.dstu3.model.Coding) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Identifier)
      return convertIdentifier((org.hl7.fhir.dstu3.model.Identifier) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Period)
      return convertPeriod((org.hl7.fhir.dstu3.model.Period) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Quantity)
      return convertQuantity((org.hl7.fhir.dstu3.model.Quantity) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Range)
      return convertRange((org.hl7.fhir.dstu3.model.Range) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Ratio)
      return convertRatio((org.hl7.fhir.dstu3.model.Ratio) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Reference)
      return convertReference((org.hl7.fhir.dstu3.model.Reference) src);
    if (src instanceof org.hl7.fhir.dstu3.model.SampledData)
      return convertSampledData((org.hl7.fhir.dstu3.model.SampledData) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Signature)
      return convertSignature((org.hl7.fhir.dstu3.model.Signature) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Address)
      return convertAddress((org.hl7.fhir.dstu3.model.Address) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ContactPoint)
      return convertContactPoint((org.hl7.fhir.dstu3.model.ContactPoint) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ElementDefinition)
      return convertElementDefinition((org.hl7.fhir.dstu3.model.ElementDefinition) src);
    if (src instanceof org.hl7.fhir.dstu3.model.HumanName)
      return convertHumanName((org.hl7.fhir.dstu3.model.HumanName) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Meta)
      return convertMeta((org.hl7.fhir.dstu3.model.Meta) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Timing)
      return convertTiming((org.hl7.fhir.dstu3.model.Timing) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Age)
      return convertAge((org.hl7.fhir.dstu3.model.Age) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Count)
      return convertCount((org.hl7.fhir.dstu3.model.Count) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Distance)
      return convertDistance((org.hl7.fhir.dstu3.model.Distance) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Duration)
      return convertDuration((org.hl7.fhir.dstu3.model.Duration) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Money)
      return convertMoney((org.hl7.fhir.dstu3.model.Money) src);
    if (src instanceof org.hl7.fhir.dstu3.model.SimpleQuantity)
      return convertSimpleQuantity((org.hl7.fhir.dstu3.model.SimpleQuantity) src);
    throw new Error("Unknown type "+src.fhirType());
  }

  private static void copyDomainResource(org.hl7.fhir.dstu2.model.DomainResource src, org.hl7.fhir.dstu3.model.DomainResource tgt) {
    copyResource(src, tgt);
    tgt.setText(convertNarrative(src.getText()));
    for (org.hl7.fhir.dstu2.model.Resource t : src.getContained())
      tgt.addContained(convertResource(t));
    for (org.hl7.fhir.dstu2.model.Extension t : src.getExtension())
      tgt.addExtension(convertExtension(t));
    for (org.hl7.fhir.dstu2.model.Extension t : src.getModifierExtension())
      tgt.addModifierExtension(convertExtension(t));
  }
  private static void copyDomainResource(org.hl7.fhir.dstu3.model.DomainResource src, org.hl7.fhir.dstu2.model.DomainResource tgt) {
    copyResource(src, tgt);
    tgt.setText(convertNarrative(src.getText()));
    for (org.hl7.fhir.dstu3.model.Resource t : src.getContained())
      tgt.addContained(convertResource(t));
    for (org.hl7.fhir.dstu3.model.Extension t : src.getExtension())
      tgt.addExtension(convertExtension(t));
    for (org.hl7.fhir.dstu3.model.Extension t : src.getModifierExtension())
      tgt.addModifierExtension(convertExtension(t));
  }
  public static org.hl7.fhir.dstu3.model.Parameters convertParameters(org.hl7.fhir.dstu2.model.Parameters src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Parameters tgt = new org.hl7.fhir.dstu3.model.Parameters();
    copyResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent t : src.getParameter())
      tgt.addParameter(convertParametersParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Parameters convertParameters(org.hl7.fhir.dstu3.model.Parameters src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Parameters tgt = new org.hl7.fhir.dstu2.model.Parameters();
    copyResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent t : src.getParameter())
      tgt.addParameter(convertParametersParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent convertParametersParameterComponent(org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent tgt = new org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    tgt.setResource(convertResource(src.getResource()));
    for (org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent t : src.getPart())
      tgt.addPart(convertParametersParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent convertParametersParameterComponent(org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent tgt = new org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    tgt.setResource(convertResource(src.getResource()));
    for (org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent t : src.getPart())
      tgt.addPart(convertParametersParameterComponent(t));
    return tgt;
  }

  private static void copyResource(org.hl7.fhir.dstu2.model.Resource src, org.hl7.fhir.dstu3.model.Resource tgt) {
    tgt.setId(src.getId());
    tgt.setMeta(convertMeta(src.getMeta()));
    tgt.setImplicitRules(src.getImplicitRules());
    tgt.setLanguage(src.getLanguage());
  }
  private static void copyResource(org.hl7.fhir.dstu3.model.Resource src, org.hl7.fhir.dstu2.model.Resource tgt) {
    tgt.setId(src.getId());
    tgt.setMeta(convertMeta(src.getMeta()));
    tgt.setImplicitRules(src.getImplicitRules());
    tgt.setLanguage(src.getLanguage());
  }
  public static org.hl7.fhir.dstu3.model.Account convertAccount(org.hl7.fhir.dstu2.model.Account src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Account tgt = new org.hl7.fhir.dstu3.model.Account();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setName(src.getName());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setStatus(convertAccountStatus(src.getStatus()));
    tgt.setActivePeriod(convertPeriod(src.getActivePeriod()));
    tgt.setCurrency(convertCoding(src.getCurrency()));
    tgt.setBalance(convertMoney(src.getBalance()));
    tgt.setCoveragePeriod(convertPeriod(src.getCoveragePeriod()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setOwner(convertReference(src.getOwner()));
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Account convertAccount(org.hl7.fhir.dstu3.model.Account src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Account tgt = new org.hl7.fhir.dstu2.model.Account();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setName(src.getName());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setStatus(convertAccountStatus(src.getStatus()));
    tgt.setActivePeriod(convertPeriod(src.getActivePeriod()));
    tgt.setCurrency(convertCoding(src.getCurrency()));
    tgt.setBalance(convertMoney(src.getBalance()));
    tgt.setCoveragePeriod(convertPeriod(src.getCoveragePeriod()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setOwner(convertReference(src.getOwner()));
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Account.AccountStatus convertAccountStatus(org.hl7.fhir.dstu2.model.Account.AccountStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu3.model.Account.AccountStatus.ACTIVE;
    case INACTIVE: return org.hl7.fhir.dstu3.model.Account.AccountStatus.INACTIVE;
    default: return org.hl7.fhir.dstu3.model.Account.AccountStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Account.AccountStatus convertAccountStatus(org.hl7.fhir.dstu3.model.Account.AccountStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu2.model.Account.AccountStatus.ACTIVE;
    case INACTIVE: return org.hl7.fhir.dstu2.model.Account.AccountStatus.INACTIVE;
    default: return org.hl7.fhir.dstu2.model.Account.AccountStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.AllergyIntolerance convertAllergyIntolerance(org.hl7.fhir.dstu2.model.AllergyIntolerance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AllergyIntolerance tgt = new org.hl7.fhir.dstu3.model.AllergyIntolerance();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertAllergyIntoleranceStatus(src.getStatus()));
    tgt.setType(convertAllergyIntoleranceType(src.getType()));
    tgt.setCategory(convertAllergyIntoleranceCategory(src.getCategory()));
    tgt.setCriticality(convertAllergyIntoleranceCriticality(src.getCriticality()));
    tgt.setSubstance(convertCodeableConcept(src.getSubstance()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setRecordedDate(src.getRecordedDate());
    tgt.setRecorder(convertReference(src.getRecorder()));
    tgt.setReporter(convertReference(src.getReporter()));
    tgt.setOnset(src.getOnset());
    tgt.setLastOccurence(src.getLastOccurence());
    if (src.hasNote())
      tgt.addNote(convertAnnotation(src.getNote()));
    for (org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceReactionComponent t : src.getReaction())
      tgt.addReaction(convertAllergyIntoleranceReactionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AllergyIntolerance convertAllergyIntolerance(org.hl7.fhir.dstu3.model.AllergyIntolerance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AllergyIntolerance tgt = new org.hl7.fhir.dstu2.model.AllergyIntolerance();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertAllergyIntoleranceStatus(src.getStatus()));
    tgt.setType(convertAllergyIntoleranceType(src.getType()));
    tgt.setCategory(convertAllergyIntoleranceCategory(src.getCategory()));
    tgt.setCriticality(convertAllergyIntoleranceCriticality(src.getCriticality()));
    tgt.setSubstance(convertCodeableConcept(src.getSubstance()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setRecordedDate(src.getRecordedDate());
    tgt.setRecorder(convertReference(src.getRecorder()));
    tgt.setReporter(convertReference(src.getReporter()));
    tgt.setOnset(src.getOnset());
    tgt.setLastOccurence(src.getLastOccurence());
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.setNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent t : src.getReaction())
      tgt.addReaction(convertAllergyIntoleranceReactionComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus convertAllergyIntoleranceStatus(org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.ACTIVE;
    case UNCONFIRMED: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.UNCONFIRMED;
    case CONFIRMED: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.CONFIRMED;
    case INACTIVE: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.INACTIVE;
    case RESOLVED: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.RESOLVED;
    case REFUTED: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.REFUTED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus convertAllergyIntoleranceStatus(org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.ACTIVE;
    case UNCONFIRMED: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.UNCONFIRMED;
    case CONFIRMED: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.CONFIRMED;
    case INACTIVE: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.INACTIVE;
    case RESOLVED: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.RESOLVED;
    case REFUTED: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.REFUTED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceType convertAllergyIntoleranceType(org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceType src) {
    if (src == null)
      return null;
    switch (src) {
    case ALLERGY: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceType.ALLERGY;
    case INTOLERANCE: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceType.INTOLERANCE;
    default: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceType convertAllergyIntoleranceType(org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceType src) {
    if (src == null)
      return null;
    switch (src) {
    case ALLERGY: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceType.ALLERGY;
    case INTOLERANCE: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceType.INTOLERANCE;
    default: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceType.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCategory convertAllergyIntoleranceCategory(org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case FOOD: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCategory.FOOD;
    case MEDICATION: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCategory.MEDICATION;
    case ENVIRONMENT: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCategory.ENVIRONMENT;
    case OTHER: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCategory.OTHER;
    default: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCategory.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCategory convertAllergyIntoleranceCategory(org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case FOOD: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCategory.FOOD;
    case MEDICATION: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCategory.MEDICATION;
    case ENVIRONMENT: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCategory.ENVIRONMENT;
    case OTHER: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCategory.OTHER;
    default: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCategory.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCriticality convertAllergyIntoleranceCriticality(org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCriticality src) {
    if (src == null)
      return null;
    switch (src) {
    case CRITL: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCriticality.LOW;
    case CRITH: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCriticality.HIGH;
    case CRITU: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCriticality.UNABLETOASSESS;
    default: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCriticality.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCriticality convertAllergyIntoleranceCriticality(org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCriticality src) {
    if (src == null)
      return null;
    switch (src) {
    case LOW: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCriticality.CRITL;
    case HIGH: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCriticality.CRITH;
    case UNABLETOASSESS: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCriticality.CRITU;
    default: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCriticality.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent convertAllergyIntoleranceReactionComponent(org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceReactionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent tgt = new org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent();
    copyElement(src, tgt);
    tgt.setSubstance(convertCodeableConcept(src.getSubstance()));
    tgt.setCertainty(convertAllergyIntoleranceCertainty(src.getCertainty()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getManifestation())
      tgt.addManifestation(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    tgt.setOnset(src.getOnset());
    tgt.setSeverity(convertAllergyIntoleranceSeverity(src.getSeverity()));
    tgt.setExposureRoute(convertCodeableConcept(src.getExposureRoute()));
    if (src.hasNote())
      tgt.addNote(convertAnnotation(src.getNote()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceReactionComponent convertAllergyIntoleranceReactionComponent(org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceReactionComponent tgt = new org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceReactionComponent();
    copyElement(src, tgt);
    tgt.setSubstance(convertCodeableConcept(src.getSubstance()));
    tgt.setCertainty(convertAllergyIntoleranceCertainty(src.getCertainty()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getManifestation())
      tgt.addManifestation(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    tgt.setOnset(src.getOnset());
    tgt.setSeverity(convertAllergyIntoleranceSeverity(src.getSeverity()));
    tgt.setExposureRoute(convertCodeableConcept(src.getExposureRoute()));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.setNote(convertAnnotation(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCertainty convertAllergyIntoleranceCertainty(org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCertainty src) {
    if (src == null)
      return null;
    switch (src) {
    case UNLIKELY: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCertainty.UNLIKELY;
    case LIKELY: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCertainty.LIKELY;
    case CONFIRMED: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCertainty.CONFIRMED;
    default: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCertainty.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCertainty convertAllergyIntoleranceCertainty(org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceCertainty src) {
    if (src == null)
      return null;
    switch (src) {
    case UNLIKELY: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCertainty.UNLIKELY;
    case LIKELY: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCertainty.LIKELY;
    case CONFIRMED: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCertainty.CONFIRMED;
    default: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceCertainty.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceSeverity convertAllergyIntoleranceSeverity(org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case MILD: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceSeverity.MILD;
    case MODERATE: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceSeverity.MODERATE;
    case SEVERE: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceSeverity.SEVERE;
    default: return org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceSeverity.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceSeverity convertAllergyIntoleranceSeverity(org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case MILD: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceSeverity.MILD;
    case MODERATE: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceSeverity.MODERATE;
    case SEVERE: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceSeverity.SEVERE;
    default: return org.hl7.fhir.dstu2.model.AllergyIntolerance.AllergyIntoleranceSeverity.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Appointment convertAppointment(org.hl7.fhir.dstu2.model.Appointment src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Appointment tgt = new org.hl7.fhir.dstu3.model.Appointment();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertAppointmentStatus(src.getStatus()));
    if (src.hasType())
      tgt.addServiceType(convertCodeableConcept(src.getType()));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    tgt.setPriority(src.getPriority());
    tgt.setDescription(src.getDescription());
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    tgt.setMinutesDuration(src.getMinutesDuration());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSlot())
      tgt.addSlot(convertReference(t));
    tgt.setComment(src.getComment());
    for (org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent t : src.getParticipant())
      tgt.addParticipant(convertAppointmentParticipantComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Appointment convertAppointment(org.hl7.fhir.dstu3.model.Appointment src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Appointment tgt = new org.hl7.fhir.dstu2.model.Appointment();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertAppointmentStatus(src.getStatus()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getServiceType())
      tgt.setType(convertCodeableConcept(t));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    tgt.setPriority(src.getPriority());
    tgt.setDescription(src.getDescription());
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    tgt.setMinutesDuration(src.getMinutesDuration());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSlot())
      tgt.addSlot(convertReference(t));
    tgt.setComment(src.getComment());
    for (org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent t : src.getParticipant())
      tgt.addParticipant(convertAppointmentParticipantComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus convertAppointmentStatus(org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.PROPOSED;
    case PENDING: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.PENDING;
    case BOOKED: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.BOOKED;
    case ARRIVED: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.ARRIVED;
    case FULFILLED: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.FULFILLED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.CANCELLED;
    case NOSHOW: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.NOSHOW;
    default: return org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus convertAppointmentStatus(org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.PROPOSED;
    case PENDING: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.PENDING;
    case BOOKED: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.BOOKED;
    case ARRIVED: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.ARRIVED;
    case FULFILLED: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.FULFILLED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.CANCELLED;
    case NOSHOW: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.NOSHOW;
    default: return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent convertAppointmentParticipantComponent(org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent tgt = new org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setRequired(convertParticipantRequired(src.getRequired()));
    tgt.setStatus(convertParticipationStatus(src.getStatus()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent convertAppointmentParticipantComponent(org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent tgt = new org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setRequired(convertParticipantRequired(src.getRequired()));
    tgt.setStatus(convertParticipationStatus(src.getStatus()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired convertParticipantRequired(org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUIRED: return org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired.REQUIRED;
    case OPTIONAL: return org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired.OPTIONAL;
    case INFORMATIONONLY: return org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired.INFORMATIONONLY;
    default: return org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired convertParticipantRequired(org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUIRED: return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.REQUIRED;
    case OPTIONAL: return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.OPTIONAL;
    case INFORMATIONONLY: return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.INFORMATIONONLY;
    default: return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus convertParticipationStatus(org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACCEPTED: return org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.ACCEPTED;
    case DECLINED: return org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.DECLINED;
    case TENTATIVE: return org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.TENTATIVE;
    case NEEDSACTION: return org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.NEEDSACTION;
    default: return org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus convertParticipationStatus(org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACCEPTED: return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.ACCEPTED;
    case DECLINED: return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.DECLINED;
    case TENTATIVE: return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.TENTATIVE;
    case NEEDSACTION: return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.NEEDSACTION;
    default: return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.AppointmentResponse convertAppointmentResponse(org.hl7.fhir.dstu2.model.AppointmentResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AppointmentResponse tgt = new org.hl7.fhir.dstu3.model.AppointmentResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setAppointment(convertReference(src.getAppointment()));
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getParticipantType())
      tgt.addParticipantType(convertCodeableConcept(t));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setParticipantStatus(src.getParticipantStatus().toCode());
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AppointmentResponse convertAppointmentResponse(org.hl7.fhir.dstu3.model.AppointmentResponse src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AppointmentResponse tgt = new org.hl7.fhir.dstu2.model.AppointmentResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setAppointment(convertReference(src.getAppointment()));
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getParticipantType())
      tgt.addParticipantType(convertCodeableConcept(t));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setParticipantStatus(ParticipantStatus.fromCode(src.getParticipantStatus()));
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.AuditEvent convertAuditEvent(org.hl7.fhir.dstu2.model.AuditEvent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AuditEvent tgt = new org.hl7.fhir.dstu3.model.AuditEvent();
    copyDomainResource(src, tgt);
    if (src.hasEvent()) {
    	tgt.setType(convertCoding(src.getEvent().getType()));
    	for (org.hl7.fhir.dstu2.model.Coding t : src.getEvent().getSubtype())
    		tgt.addSubtype(convertCoding(t));
    	tgt.setAction(convertAuditEventAction(src.getEvent().getAction()));
    	tgt.setRecorded(src.getEvent().getDateTime());
    	tgt.setOutcome(convertAuditEventOutcome(src.getEvent().getOutcome()));
    	tgt.setOutcomeDesc(src.getEvent().getOutcomeDesc());
      for (org.hl7.fhir.dstu2.model.Coding t : src.getEvent().getPurposeOfEvent())
        tgt.addPurposeOfEvent(convertCoding(t));
    }
    for (org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent t : src.getParticipant())
      tgt.addAgent(convertAuditEventAgentComponent(t));
    tgt.setSource(convertAuditEventSourceComponent(src.getSource()));
    for (org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent t : src.getObject())
      tgt.addEntity(convertAuditEventEntityComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AuditEvent convertAuditEvent(org.hl7.fhir.dstu3.model.AuditEvent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AuditEvent tgt = new org.hl7.fhir.dstu2.model.AuditEvent();
    copyDomainResource(src, tgt);
    tgt.getEvent().setType(convertCoding(src.getType()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSubtype())
      tgt.getEvent().addSubtype(convertCoding(t));
    tgt.getEvent().setAction(convertAuditEventAction(src.getAction()));
    tgt.getEvent().setDateTime(src.getRecorded());
    tgt.getEvent().setOutcome(convertAuditEventOutcome(src.getOutcome()));
    tgt.getEvent().setOutcomeDesc(src.getOutcomeDesc());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getPurposeOfEvent())
      tgt.getEvent().addPurposeOfEvent(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent t : src.getAgent())
      tgt.addParticipant(convertAuditEventAgentComponent(t));
    tgt.setSource(convertAuditEventSourceComponent(src.getSource()));
    for (org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent t : src.getEntity())
      tgt.addObject(convertAuditEventEntityComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction convertAuditEventAction(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction src) {
    if (src == null)
      return null;
    switch (src) {
    case C: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.C;
    case R: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.R;
    case U: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.U;
    case D: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.D;
    case E: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.E;
    default: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction convertAuditEventAction(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction src) {
    if (src == null)
      return null;
    switch (src) {
    case C: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.C;
    case R: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.R;
    case U: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.U;
    case D: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.D;
    case E: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.E;
    default: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome convertAuditEventOutcome(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome src) {
    if (src == null)
      return null;
    switch (src) {
    case _0: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._0;
    case _4: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._4;
    case _8: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._8;
    case _12: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._12;
    default: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome convertAuditEventOutcome(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome src) {
    if (src == null)
      return null;
    switch (src) {
    case _0: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._0;
    case _4: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._4;
    case _8: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._8;
    case _12: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._12;
    default: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent convertAuditEventAgentComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getRole())
      tgt.addRole(convertCodeableConcept(t));
    tgt.setReference(convertReference(src.getReference()));
    tgt.setUserId(convertIdentifier(src.getUserId()));
    tgt.setAltId(src.getAltId());
    tgt.setName(src.getName());
    tgt.setRequestor(src.getRequestor());
    tgt.setLocation(convertReference(src.getLocation()));
    for (org.hl7.fhir.dstu2.model.UriType t : src.getPolicy())
      tgt.addPolicy(t.getValue());
    tgt.setMedia(convertCoding(src.getMedia()));
    tgt.setNetwork(convertAuditEventAgentNetworkComponent(src.getNetwork()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getPurposeOfUse())
      tgt.addPurposeOfUse(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent convertAuditEventAgentComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getRole())
      tgt.addRole(convertCodeableConcept(t));
    tgt.setReference(convertReference(src.getReference()));
    tgt.setUserId(convertIdentifier(src.getUserId()));
    tgt.setAltId(src.getAltId());
    tgt.setName(src.getName());
    tgt.setRequestor(src.getRequestor());
    tgt.setLocation(convertReference(src.getLocation()));
    for (org.hl7.fhir.dstu3.model.UriType t : src.getPolicy())
      tgt.addPolicy(t.getValue());
    tgt.setMedia(convertCoding(src.getMedia()));
    tgt.setNetwork(convertAuditEventAgentNetworkComponent(src.getNetwork()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getPurposeOfUse())
      tgt.addPurposeOfUse(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent convertAuditEventAgentNetworkComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent();
    copyElement(src, tgt);
    tgt.setAddress(src.getAddress());
    tgt.setType(convertAuditEventParticipantNetworkType(src.getType()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent convertAuditEventAgentNetworkComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent();
    copyElement(src, tgt);
    tgt.setAddress(src.getAddress());
    tgt.setType(convertAuditEventParticipantNetworkType(src.getType()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType convertAuditEventParticipantNetworkType(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType src) {
    if (src == null)
      return null;
    switch (src) {
    case _1: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType._1;
    case _2: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType._2;
    case _3: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType._3;
    case _4: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType._4;
    case _5: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType._5;
    default: return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType convertAuditEventParticipantNetworkType(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventParticipantNetworkType src) {
    if (src == null)
      return null;
    switch (src) {
    case _1: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._1;
    case _2: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._2;
    case _3: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._3;
    case _4: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._4;
    case _5: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._5;
    default: return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent convertAuditEventSourceComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent();
    copyElement(src, tgt);
    tgt.setSite(src.getSite());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getType())
      tgt.addType(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent convertAuditEventSourceComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent();
    copyElement(src, tgt);
    tgt.setSite(src.getSite());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getType())
      tgt.addType(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent convertAuditEventEntityComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setReference(convertReference(src.getReference()));
    tgt.setType(convertCoding(src.getType()));
    tgt.setRole(convertCoding(src.getRole()));
    tgt.setLifecycle(convertCoding(src.getLifecycle()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getSecurityLabel())
      tgt.addSecurityLabel(convertCoding(t));
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setQuery(src.getQuery());
    for (org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent t : src.getDetail())
      tgt.addDetail(convertAuditEventEntityDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent convertAuditEventEntityComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setReference(convertReference(src.getReference()));
    tgt.setType(convertCoding(src.getType()));
    tgt.setRole(convertCoding(src.getRole()));
    tgt.setLifecycle(convertCoding(src.getLifecycle()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSecurityLabel())
      tgt.addSecurityLabel(convertCoding(t));
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setQuery(src.getQuery());
    for (org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent t : src.getDetail())
      tgt.addDetail(convertAuditEventEntityDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent convertAuditEventEntityDetailComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent convertAuditEventEntityDetailComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Basic convertBasic(org.hl7.fhir.dstu2.model.Basic src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Basic tgt = new org.hl7.fhir.dstu3.model.Basic();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setCreated(src.getCreated());
    tgt.setAuthor(convertReference(src.getAuthor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Basic convertBasic(org.hl7.fhir.dstu3.model.Basic src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Basic tgt = new org.hl7.fhir.dstu2.model.Basic();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setCreated(src.getCreated());
    tgt.setAuthor(convertReference(src.getAuthor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Binary convertBinary(org.hl7.fhir.dstu2.model.Binary src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Binary tgt = new org.hl7.fhir.dstu3.model.Binary();
    copyResource(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setContent(src.getContent());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Binary convertBinary(org.hl7.fhir.dstu3.model.Binary src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Binary tgt = new org.hl7.fhir.dstu2.model.Binary();
    copyResource(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setContent(src.getContent());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.BodySite convertBodySite(org.hl7.fhir.dstu2.model.BodySite src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.BodySite tgt = new org.hl7.fhir.dstu3.model.BodySite();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getModifier())
      tgt.addModifier(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.Attachment t : src.getImage())
      tgt.addImage(convertAttachment(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.BodySite convertBodySite(org.hl7.fhir.dstu3.model.BodySite src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.BodySite tgt = new org.hl7.fhir.dstu2.model.BodySite();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getModifier())
      tgt.addModifier(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.Attachment t : src.getImage())
      tgt.addImage(convertAttachment(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Bundle convertBundle(org.hl7.fhir.dstu2.model.Bundle src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Bundle tgt = new org.hl7.fhir.dstu3.model.Bundle();
    copyResource(src, tgt);
    tgt.setType(convertBundleType(src.getType()));
    tgt.setTotal(src.getTotal());
    for (org.hl7.fhir.dstu2.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    for (org.hl7.fhir.dstu2.model.Bundle.BundleEntryComponent t : src.getEntry())
      tgt.addEntry(convertBundleEntryComponent(t));
    tgt.setSignature(convertSignature(src.getSignature()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Bundle convertBundle(org.hl7.fhir.dstu3.model.Bundle src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Bundle tgt = new org.hl7.fhir.dstu2.model.Bundle();
    copyResource(src, tgt);
    tgt.setType(convertBundleType(src.getType()));
    tgt.setTotal(src.getTotal());
    for (org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    for (org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent t : src.getEntry())
      tgt.addEntry(convertBundleEntryComponent(t));
    tgt.setSignature(convertSignature(src.getSignature()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Bundle.BundleType convertBundleType(org.hl7.fhir.dstu2.model.Bundle.BundleType src) {
    if (src == null)
      return null;
    switch (src) {
    case DOCUMENT: return org.hl7.fhir.dstu3.model.Bundle.BundleType.DOCUMENT;
    case MESSAGE: return org.hl7.fhir.dstu3.model.Bundle.BundleType.MESSAGE;
    case TRANSACTION: return org.hl7.fhir.dstu3.model.Bundle.BundleType.TRANSACTION;
    case TRANSACTIONRESPONSE: return org.hl7.fhir.dstu3.model.Bundle.BundleType.TRANSACTIONRESPONSE;
    case BATCH: return org.hl7.fhir.dstu3.model.Bundle.BundleType.BATCH;
    case BATCHRESPONSE: return org.hl7.fhir.dstu3.model.Bundle.BundleType.BATCHRESPONSE;
    case HISTORY: return org.hl7.fhir.dstu3.model.Bundle.BundleType.HISTORY;
    case SEARCHSET: return org.hl7.fhir.dstu3.model.Bundle.BundleType.SEARCHSET;
    case COLLECTION: return org.hl7.fhir.dstu3.model.Bundle.BundleType.COLLECTION;
    default: return org.hl7.fhir.dstu3.model.Bundle.BundleType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Bundle.BundleType convertBundleType(org.hl7.fhir.dstu3.model.Bundle.BundleType src) {
    if (src == null)
      return null;
    switch (src) {
    case DOCUMENT: return org.hl7.fhir.dstu2.model.Bundle.BundleType.DOCUMENT;
    case MESSAGE: return org.hl7.fhir.dstu2.model.Bundle.BundleType.MESSAGE;
    case TRANSACTION: return org.hl7.fhir.dstu2.model.Bundle.BundleType.TRANSACTION;
    case TRANSACTIONRESPONSE: return org.hl7.fhir.dstu2.model.Bundle.BundleType.TRANSACTIONRESPONSE;
    case BATCH: return org.hl7.fhir.dstu2.model.Bundle.BundleType.BATCH;
    case BATCHRESPONSE: return org.hl7.fhir.dstu2.model.Bundle.BundleType.BATCHRESPONSE;
    case HISTORY: return org.hl7.fhir.dstu2.model.Bundle.BundleType.HISTORY;
    case SEARCHSET: return org.hl7.fhir.dstu2.model.Bundle.BundleType.SEARCHSET;
    case COLLECTION: return org.hl7.fhir.dstu2.model.Bundle.BundleType.COLLECTION;
    default: return org.hl7.fhir.dstu2.model.Bundle.BundleType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.dstu2.model.Bundle.BundleLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent();
    copyElement(src, tgt);
    tgt.setRelation(src.getRelation());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.dstu2.model.Bundle.BundleLinkComponent();
    copyElement(src, tgt);
    tgt.setRelation(src.getRelation());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.dstu2.model.Bundle.BundleEntryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    tgt.setFullUrl(src.getFullUrl());
    tgt.setResource(convertResource(src.getResource()));
    tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
    tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
    tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.dstu2.model.Bundle.BundleEntryComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    tgt.setFullUrl(src.getFullUrl());
    tgt.setResource(convertResource(src.getResource()));
    tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
    tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
    tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.dstu2.model.Bundle.BundleEntrySearchComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent();
    copyElement(src, tgt);
    tgt.setMode(convertSearchEntryMode(src.getMode()));
    tgt.setScore(src.getScore());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.dstu2.model.Bundle.BundleEntrySearchComponent();
    copyElement(src, tgt);
    tgt.setMode(convertSearchEntryMode(src.getMode()));
    tgt.setScore(src.getScore());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode convertSearchEntryMode(org.hl7.fhir.dstu2.model.Bundle.SearchEntryMode src) {
    if (src == null)
      return null;
    switch (src) {
    case MATCH: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.MATCH;
    case INCLUDE: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.INCLUDE;
    case OUTCOME: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.OUTCOME;
    default: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Bundle.SearchEntryMode convertSearchEntryMode(org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode src) {
    if (src == null)
      return null;
    switch (src) {
    case MATCH: return org.hl7.fhir.dstu2.model.Bundle.SearchEntryMode.MATCH;
    case INCLUDE: return org.hl7.fhir.dstu2.model.Bundle.SearchEntryMode.INCLUDE;
    case OUTCOME: return org.hl7.fhir.dstu2.model.Bundle.SearchEntryMode.OUTCOME;
    default: return org.hl7.fhir.dstu2.model.Bundle.SearchEntryMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.dstu2.model.Bundle.BundleEntryRequestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent();
    copyElement(src, tgt);
    tgt.setMethod(convertHTTPVerb(src.getMethod()));
    tgt.setUrl(src.getUrl());
    tgt.setIfNoneMatch(src.getIfNoneMatch());
    tgt.setIfModifiedSince(src.getIfModifiedSince());
    tgt.setIfMatch(src.getIfMatch());
    tgt.setIfNoneExist(src.getIfNoneExist());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.dstu2.model.Bundle.BundleEntryRequestComponent();
    copyElement(src, tgt);
    tgt.setMethod(convertHTTPVerb(src.getMethod()));
    tgt.setUrl(src.getUrl());
    tgt.setIfNoneMatch(src.getIfNoneMatch());
    tgt.setIfModifiedSince(src.getIfModifiedSince());
    tgt.setIfMatch(src.getIfMatch());
    tgt.setIfNoneExist(src.getIfNoneExist());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Bundle.HTTPVerb convertHTTPVerb(org.hl7.fhir.dstu2.model.Bundle.HTTPVerb src) {
    if (src == null)
      return null;
    switch (src) {
    case GET: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.GET;
    case POST: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.POST;
    case PUT: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.PUT;
    case DELETE: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.DELETE;
    default: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Bundle.HTTPVerb convertHTTPVerb(org.hl7.fhir.dstu3.model.Bundle.HTTPVerb src) {
    if (src == null)
      return null;
    switch (src) {
    case GET: return org.hl7.fhir.dstu2.model.Bundle.HTTPVerb.GET;
    case POST: return org.hl7.fhir.dstu2.model.Bundle.HTTPVerb.POST;
    case PUT: return org.hl7.fhir.dstu2.model.Bundle.HTTPVerb.PUT;
    case DELETE: return org.hl7.fhir.dstu2.model.Bundle.HTTPVerb.DELETE;
    default: return org.hl7.fhir.dstu2.model.Bundle.HTTPVerb.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.dstu2.model.Bundle.BundleEntryResponseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent();
    copyElement(src, tgt);
    tgt.setStatus(src.getStatus());
    tgt.setLocation(src.getLocation());
    tgt.setEtag(src.getEtag());
    tgt.setLastModified(src.getLastModified());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.dstu2.model.Bundle.BundleEntryResponseComponent();
    copyElement(src, tgt);
    tgt.setStatus(src.getStatus());
    tgt.setLocation(src.getLocation());
    tgt.setEtag(src.getEtag());
    tgt.setLastModified(src.getLastModified());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CarePlan convertCarePlan(org.hl7.fhir.dstu2.model.CarePlan src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CarePlan tgt = new org.hl7.fhir.dstu3.model.CarePlan();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setStatus(convertCarePlanStatus(src.getStatus()));
    tgt.setContext(convertReference(src.getContext()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    tgt.setModified(src.getModified());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAddresses())
      tgt.addAddresses(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSupport())
      tgt.addSupport(convertReference(t));
    for (org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelatedPlanComponent t : src.getRelatedPlan())
      tgt.addRelatedPlan(convertCarePlanRelatedPlanComponent(t));
    for (org.hl7.fhir.dstu2.model.CarePlan.CarePlanParticipantComponent t : src.getParticipant())
      tgt.addParticipant(convertCarePlanParticipantComponent(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getGoal())
      tgt.addGoal(convertReference(t));
    for (org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityComponent t : src.getActivity())
      tgt.addActivity(convertCarePlanActivityComponent(t));
    tgt.setNote(convertAnnotation(src.getNote()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CarePlan convertCarePlan(org.hl7.fhir.dstu3.model.CarePlan src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CarePlan tgt = new org.hl7.fhir.dstu2.model.CarePlan();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setStatus(convertCarePlanStatus(src.getStatus()));
    tgt.setContext(convertReference(src.getContext()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    tgt.setModified(src.getModified());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAddresses())
      tgt.addAddresses(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSupport())
      tgt.addSupport(convertReference(t));
    for (org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelatedPlanComponent t : src.getRelatedPlan())
      tgt.addRelatedPlan(convertCarePlanRelatedPlanComponent(t));
    for (org.hl7.fhir.dstu3.model.CarePlan.CarePlanParticipantComponent t : src.getParticipant())
      tgt.addParticipant(convertCarePlanParticipantComponent(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getGoal())
      tgt.addGoal(convertReference(t));
    for (org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityComponent t : src.getActivity())
      tgt.addActivity(convertCarePlanActivityComponent(t));
    tgt.setNote(convertAnnotation(src.getNote()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus convertCarePlanStatus(org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus.ACTIVE;
    case COMPLETED: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus.CANCELLED;
    default: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus convertCarePlanStatus(org.hl7.fhir.dstu3.model.CarePlan.CarePlanStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus.ACTIVE;
    case COMPLETED: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus.CANCELLED;
    default: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelatedPlanComponent convertCarePlanRelatedPlanComponent(org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelatedPlanComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelatedPlanComponent tgt = new org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelatedPlanComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCarePlanRelationship(src.getCode()));
    tgt.setPlan(convertReference(src.getPlan()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelatedPlanComponent convertCarePlanRelatedPlanComponent(org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelatedPlanComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelatedPlanComponent tgt = new org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelatedPlanComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCarePlanRelationship(src.getCode()));
    tgt.setPlan(convertReference(src.getPlan()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelationship convertCarePlanRelationship(org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelationship src) {
    if (src == null)
      return null;
    switch (src) {
    case INCLUDES: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelationship.INCLUDES;
    case REPLACES: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelationship.REPLACES;
    case FULFILLS: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelationship.FULFILLS;
    default: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelationship.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelationship convertCarePlanRelationship(org.hl7.fhir.dstu3.model.CarePlan.CarePlanRelationship src) {
    if (src == null)
      return null;
    switch (src) {
    case INCLUDES: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelationship.INCLUDES;
    case REPLACES: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelationship.REPLACES;
    case FULFILLS: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelationship.FULFILLS;
    default: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanRelationship.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.CarePlan.CarePlanParticipantComponent convertCarePlanParticipantComponent(org.hl7.fhir.dstu2.model.CarePlan.CarePlanParticipantComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CarePlan.CarePlanParticipantComponent tgt = new org.hl7.fhir.dstu3.model.CarePlan.CarePlanParticipantComponent();
    copyElement(src, tgt);
    tgt.setRole(convertCodeableConcept(src.getRole()));
    tgt.setMember(convertReference(src.getMember()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CarePlan.CarePlanParticipantComponent convertCarePlanParticipantComponent(org.hl7.fhir.dstu3.model.CarePlan.CarePlanParticipantComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CarePlan.CarePlanParticipantComponent tgt = new org.hl7.fhir.dstu2.model.CarePlan.CarePlanParticipantComponent();
    copyElement(src, tgt);
    tgt.setRole(convertCodeableConcept(src.getRole()));
    tgt.setMember(convertReference(src.getMember()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityComponent convertCarePlanActivityComponent(org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityComponent tgt = new org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Reference t : src.getActionResulting())
      tgt.addActionResulting(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getProgress())
      tgt.addProgress(convertAnnotation(t));
    tgt.setReference(convertReference(src.getReference()));
    tgt.setDetail(convertCarePlanActivityDetailComponent(src.getDetail()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityComponent convertCarePlanActivityComponent(org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityComponent tgt = new org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Reference t : src.getActionResulting())
      tgt.addActionResulting(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getProgress())
      tgt.addProgress(convertAnnotation(t));
    tgt.setReference(convertReference(src.getReference()));
    tgt.setDetail(convertCarePlanActivityDetailComponent(src.getDetail()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityDetailComponent convertCarePlanActivityDetailComponent(org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityDetailComponent tgt = new org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityDetailComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReasonCode())
      tgt.addReasonCode(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getReasonReference())
      tgt.addReasonReference(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getGoal())
      tgt.addGoal(convertReference(t));
    tgt.setStatus(convertCarePlanActivityStatus(src.getStatus()));
    tgt.setStatusReason(convertCodeableConcept(src.getStatusReason()));
    tgt.setProhibited(src.getProhibited());
    tgt.setScheduled(convertType(src.getScheduled()));
    tgt.setLocation(convertReference(src.getLocation()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getPerformer())
      tgt.addPerformer(convertReference(t));
    tgt.setProduct(convertType(src.getProduct()));
    tgt.setDailyAmount(convertSimpleQuantity(src.getDailyAmount()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityDetailComponent convertCarePlanActivityDetailComponent(org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityDetailComponent tgt = new org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityDetailComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReasonCode())
      tgt.addReasonCode(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getReasonReference())
      tgt.addReasonReference(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getGoal())
      tgt.addGoal(convertReference(t));
    tgt.setStatus(convertCarePlanActivityStatus(src.getStatus()));
    tgt.setStatusReason(convertCodeableConcept(src.getStatusReason()));
    tgt.setProhibited(src.getProhibited());
    tgt.setScheduled(convertType(src.getScheduled()));
    tgt.setLocation(convertReference(src.getLocation()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getPerformer())
      tgt.addPerformer(convertReference(t));
    tgt.setProduct(convertType(src.getProduct()));
    tgt.setDailyAmount(convertSimpleQuantity(src.getDailyAmount()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus convertCarePlanActivityStatus(org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTSTARTED: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus.NOTSTARTED;
    case SCHEDULED: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus.SCHEDULED;
    case INPROGRESS: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus.INPROGRESS;
    case ONHOLD: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus.CANCELLED;
    default: return org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus convertCarePlanActivityStatus(org.hl7.fhir.dstu3.model.CarePlan.CarePlanActivityStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTSTARTED: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus.NOTSTARTED;
    case SCHEDULED: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus.SCHEDULED;
    case INPROGRESS: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus.INPROGRESS;
    case ONHOLD: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus.CANCELLED;
    default: return org.hl7.fhir.dstu2.model.CarePlan.CarePlanActivityStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Claim convertClaim(org.hl7.fhir.dstu2.model.Claim src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim tgt = new org.hl7.fhir.dstu3.model.Claim();
    copyDomainResource(src, tgt);
    tgt.setType(convertClaimType(src.getType()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertType(src.getTarget()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setUse(convertUse(src.getUse()));
    tgt.setPriority(convertCoding(src.getPriority()));
    tgt.setFundsReserve(convertCoding(src.getFundsReserve()));
    tgt.setEnterer(convertType(src.getEnterer()));
    tgt.setFacility(convertType(src.getFacility()));
    tgt.setPrescription(convertType(src.getPrescription()));
    tgt.setOriginalPrescription(convertType(src.getOriginalPrescription()));
    tgt.setPayee(convertPayeeComponent(src.getPayee()));
    tgt.setReferral(convertType(src.getReferral()));
    for (org.hl7.fhir.dstu2.model.Claim.DiagnosisComponent t : src.getDiagnosis())
      tgt.addDiagnosis(convertDiagnosisComponent(t));
    tgt.setPatient(convertType(src.getPatient()));
    for (org.hl7.fhir.dstu2.model.Claim.CoverageComponent t : src.getCoverage())
      tgt.addCoverage(convertCoverageComponent(t));
    tgt.setAccidentDate(src.getAccident());
    tgt.setAccidentType(convertCoding(src.getAccidentType()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getInterventionException())
      tgt.addInterventionException(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Claim.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getAdditionalMaterials())
      tgt.addAdditionalMaterial(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Claim.MissingTeethComponent t : src.getMissingTeeth())
      tgt.addMissingTeeth(convertMissingTeethComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim convertClaim(org.hl7.fhir.dstu3.model.Claim src) throws org.hl7.fhir.dstu3.exceptions.FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim tgt = new org.hl7.fhir.dstu2.model.Claim();
    copyDomainResource(src, tgt);
    tgt.setType(convertClaimType(src.getType()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    if (src.hasOrganizationReference())
      tgt.setOrganization((Reference) convertType(src.getOrganization()));
    tgt.setUse(convertUse(src.getUse()));
    tgt.setPriority(convertCoding(src.getPriority()));
    tgt.setFundsReserve(convertCoding(src.getFundsReserve()));
    if (src.hasEntererReference())
      tgt.setEnterer((Reference) convertType(src.getEnterer()));
    if (src.hasFacilityReference())
      tgt.setFacility((Reference) convertType(src.getFacility()));
    if (src.hasPrescriptionReference())
      tgt.setPrescription((Reference) convertType(src.getPrescription()));
    tgt.setPayee(convertPayeeComponent(src.getPayee()));
    if (src.hasReferralReference())
      tgt.setReferral((Reference) convertType(src.getReferral()));
    for (org.hl7.fhir.dstu3.model.Claim.DiagnosisComponent t : src.getDiagnosis())
      tgt.addDiagnosis(convertDiagnosisComponent(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSpecialCondition())
      tgt.addCondition(convertCoding(t));
    if (src.hasPatientReference())
    	tgt.setPatient((Reference) convertType(src.getPatient()));
    for (org.hl7.fhir.dstu3.model.Claim.CoverageComponent t : src.getCoverage())
      tgt.addCoverage(convertCoverageComponent(t));
    tgt.setAccident(src.getAccidentDate());
    tgt.setAccidentType(convertCoding(src.getAccidentType()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getInterventionException())
      tgt.addInterventionException(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Claim.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getAdditionalMaterial())
      tgt.addAdditionalMaterials(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Claim.MissingTeethComponent t : src.getMissingTeeth())
      tgt.addMissingTeeth(convertMissingTeethComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Claim.ClaimType convertClaimType(org.hl7.fhir.dstu2.model.Claim.ClaimType src) {
    if (src == null)
      return null;
    switch (src) {
    case INSTITUTIONAL: return org.hl7.fhir.dstu3.model.Claim.ClaimType.INSTITUTIONAL;
    case ORAL: return org.hl7.fhir.dstu3.model.Claim.ClaimType.ORAL;
    case PHARMACY: return org.hl7.fhir.dstu3.model.Claim.ClaimType.PHARMACY;
    case PROFESSIONAL: return org.hl7.fhir.dstu3.model.Claim.ClaimType.PROFESSIONAL;
    case VISION: return org.hl7.fhir.dstu3.model.Claim.ClaimType.VISION;
    default: return org.hl7.fhir.dstu3.model.Claim.ClaimType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Claim.ClaimType convertClaimType(org.hl7.fhir.dstu3.model.Claim.ClaimType src) {
    if (src == null)
      return null;
    switch (src) {
    case INSTITUTIONAL: return org.hl7.fhir.dstu2.model.Claim.ClaimType.INSTITUTIONAL;
    case ORAL: return org.hl7.fhir.dstu2.model.Claim.ClaimType.ORAL;
    case PHARMACY: return org.hl7.fhir.dstu2.model.Claim.ClaimType.PHARMACY;
    case PROFESSIONAL: return org.hl7.fhir.dstu2.model.Claim.ClaimType.PROFESSIONAL;
    case VISION: return org.hl7.fhir.dstu2.model.Claim.ClaimType.VISION;
    default: return org.hl7.fhir.dstu2.model.Claim.ClaimType.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Claim.Use convertUse(org.hl7.fhir.dstu2.model.Claim.Use src) {
    if (src == null)
      return null;
    switch (src) {
    case COMPLETE: return org.hl7.fhir.dstu3.model.Claim.Use.COMPLETE;
    case PROPOSED: return org.hl7.fhir.dstu3.model.Claim.Use.PROPOSED;
    case EXPLORATORY: return org.hl7.fhir.dstu3.model.Claim.Use.EXPLORATORY;
    case OTHER: return org.hl7.fhir.dstu3.model.Claim.Use.OTHER;
    default: return org.hl7.fhir.dstu3.model.Claim.Use.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Claim.Use convertUse(org.hl7.fhir.dstu3.model.Claim.Use src) {
    if (src == null)
      return null;
    switch (src) {
    case COMPLETE: return org.hl7.fhir.dstu2.model.Claim.Use.COMPLETE;
    case PROPOSED: return org.hl7.fhir.dstu2.model.Claim.Use.PROPOSED;
    case EXPLORATORY: return org.hl7.fhir.dstu2.model.Claim.Use.EXPLORATORY;
    case OTHER: return org.hl7.fhir.dstu2.model.Claim.Use.OTHER;
    default: return org.hl7.fhir.dstu2.model.Claim.Use.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Claim.PayeeComponent convertPayeeComponent(org.hl7.fhir.dstu2.model.Claim.PayeeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.PayeeComponent tgt = new org.hl7.fhir.dstu3.model.Claim.PayeeComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    if (src.hasProvider())
      tgt.setParty(convertType(src.getProvider()));
    if (src.hasOrganization())
      tgt.setParty(convertType(src.getOrganization()));
    if (src.hasPerson())
      tgt.setParty(convertType(src.getPerson()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.PayeeComponent convertPayeeComponent(org.hl7.fhir.dstu3.model.Claim.PayeeComponent src) throws org.hl7.fhir.dstu3.exceptions.FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.PayeeComponent tgt = new org.hl7.fhir.dstu2.model.Claim.PayeeComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    if (src.hasPartyReference()) {
    	String r = src.getPartyReference().getReference();
    	if (r.startsWith("Practitioner/"))
    		tgt.setProvider((Reference) convertType(src.getParty()));
    	if (r.startsWith("Organization/"))
    		tgt.setOrganization((Reference) convertType(src.getParty()));
    	if (r.startsWith("Person/"))
    		tgt.setPerson((Reference) convertType(src.getParty()));
    }
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Claim.DiagnosisComponent convertDiagnosisComponent(org.hl7.fhir.dstu2.model.Claim.DiagnosisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.DiagnosisComponent tgt = new org.hl7.fhir.dstu3.model.Claim.DiagnosisComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setDiagnosis(convertCoding(src.getDiagnosis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.DiagnosisComponent convertDiagnosisComponent(org.hl7.fhir.dstu3.model.Claim.DiagnosisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.DiagnosisComponent tgt = new org.hl7.fhir.dstu2.model.Claim.DiagnosisComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setDiagnosis(convertCoding(src.getDiagnosis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Claim.CoverageComponent convertCoverageComponent(org.hl7.fhir.dstu2.model.Claim.CoverageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.CoverageComponent tgt = new org.hl7.fhir.dstu3.model.Claim.CoverageComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setFocal(src.getFocal());
    tgt.setCoverage(convertType(src.getCoverage()));
    tgt.setBusinessArrangement(src.getBusinessArrangement());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getPreAuthRef())
      tgt.addPreAuthRef(t.getValue());
    tgt.setClaimResponse(convertReference(src.getClaimResponse()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.CoverageComponent convertCoverageComponent(org.hl7.fhir.dstu3.model.Claim.CoverageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.CoverageComponent tgt = new org.hl7.fhir.dstu2.model.Claim.CoverageComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setFocal(src.getFocal());
    if (src.hasCoverageReference())
    	tgt.setCoverage((Reference) convertType(src.getCoverage()));
    tgt.setBusinessArrangement(src.getBusinessArrangement());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getPreAuthRef())
      tgt.addPreAuthRef(t.getValue());
    tgt.setClaimResponse(convertReference(src.getClaimResponse()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Claim.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu2.model.Claim.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.ItemsComponent tgt = new org.hl7.fhir.dstu3.model.Claim.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setProvider(convertType(src.getProvider()));
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getDiagnosisLinkId())
      tgt.addDiagnosisLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getModifier())
      tgt.addModifier(convertCoding(t));
    tgt.setServiced(convertType(src.getService()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    tgt.setBodySite(convertCoding(src.getBodySite()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getSubSite())
      tgt.addSubSite(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Claim.DetailComponent t : src.getDetail())
      tgt.addDetail(convertDetailComponent(t));
    tgt.setProsthesis(convertProsthesisComponent(src.getProsthesis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu3.model.Claim.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.ItemsComponent tgt = new org.hl7.fhir.dstu2.model.Claim.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    if (src.hasProviderReference())
    		tgt.setProvider((Reference) convertType(src.getProvider()));
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getDiagnosisLinkId())
      tgt.addDiagnosisLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getModifier())
      tgt.addModifier(convertCoding(t));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    tgt.setBodySite(convertCoding(src.getBodySite()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSubSite())
      tgt.addSubSite(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.item.DetailComponent t : src.getDetail())
      tgt.addDetail(convertDetailComponent(t));
    tgt.setProsthesis(convertProsthesisComponent(src.getProsthesis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Claim.DetailComponent convertDetailComponent(org.hl7.fhir.dstu2.model.Claim.DetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.DetailComponent tgt = new org.hl7.fhir.dstu3.model.Claim.DetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu2.model.Claim.SubDetailComponent t : src.getSubDetail())
      tgt.addSubDetail(convertSubDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.DetailComponent convertDetailComponent(org.hl7.fhir.dstu3.model.Claim.DetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.DetailComponent tgt = new org.hl7.fhir.dstu2.model.Claim.DetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu3.model.Claim.SubDetailComponent t : src.getSubDetail())
      tgt.addSubDetail(convertSubDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Claim.SubDetailComponent convertSubDetailComponent(org.hl7.fhir.dstu2.model.Claim.SubDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.SubDetailComponent tgt = new org.hl7.fhir.dstu3.model.Claim.SubDetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.SubDetailComponent convertSubDetailComponent(org.hl7.fhir.dstu3.model.Claim.SubDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.SubDetailComponent tgt = new org.hl7.fhir.dstu2.model.Claim.SubDetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Claim.ProsthesisComponent convertProsthesisComponent(org.hl7.fhir.dstu2.model.Claim.ProsthesisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.ProsthesisComponent tgt = new org.hl7.fhir.dstu3.model.Claim.ProsthesisComponent();
    copyElement(src, tgt);
    tgt.setInitial(src.getInitial());
    tgt.setPriorDate(src.getPriorDate());
    tgt.setPriorMaterial(convertCoding(src.getPriorMaterial()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.ProsthesisComponent convertProsthesisComponent(org.hl7.fhir.dstu3.model.Claim.ProsthesisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.ProsthesisComponent tgt = new org.hl7.fhir.dstu2.model.Claim.ProsthesisComponent();
    copyElement(src, tgt);
    tgt.setInitial(src.getInitial());
    tgt.setPriorDate(src.getPriorDate());
    tgt.setPriorMaterial(convertCoding(src.getPriorMaterial()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Claim.MissingTeethComponent convertMissingTeethComponent(org.hl7.fhir.dstu2.model.Claim.MissingTeethComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Claim.MissingTeethComponent tgt = new org.hl7.fhir.dstu3.model.Claim.MissingTeethComponent();
    copyElement(src, tgt);
    tgt.setTooth(convertCoding(src.getTooth()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setExtractionDate(src.getExtractionDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Claim.MissingTeethComponent convertMissingTeethComponent(org.hl7.fhir.dstu3.model.Claim.MissingTeethComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Claim.MissingTeethComponent tgt = new org.hl7.fhir.dstu2.model.Claim.MissingTeethComponent();
    copyElement(src, tgt);
    tgt.setTooth(convertCoding(src.getTooth()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setExtractionDate(src.getExtractionDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse convertClaimResponse(org.hl7.fhir.dstu2.model.ClaimResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse tgt = new org.hl7.fhir.dstu3.model.ClaimResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequestProvider(convertType(src.getRequestProvider()));
    tgt.setRequestOrganization(convertType(src.getRequestOrganization()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setPayeeType(convertCoding(src.getPayeeType()));
    for (org.hl7.fhir.dstu2.model.ClaimResponse.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemComponent t : src.getAddItem())
      tgt.addAddItem(convertAddedItemComponent(t));
    for (org.hl7.fhir.dstu2.model.ClaimResponse.ErrorsComponent t : src.getError())
      tgt.addError(convertErrorsComponent(t));
    tgt.setTotalCost(convertMoney(src.getTotalCost()));
    tgt.setUnallocDeductable(convertMoney(src.getUnallocDeductable()));
    tgt.setTotalBenefit(convertMoney(src.getTotalBenefit()));
    tgt.setPaymentAdjustment(convertMoney(src.getPaymentAdjustment()));
    tgt.setPaymentAdjustmentReason(convertCoding(src.getPaymentAdjustmentReason()));
    tgt.setPaymentDate(src.getPaymentDate());
    tgt.setPaymentAmount(convertMoney(src.getPaymentAmount()));
    tgt.setPaymentRef(convertIdentifier(src.getPaymentRef()));
    tgt.setReserved(convertCoding(src.getReserved()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu2.model.ClaimResponse.NotesComponent t : src.getNote())
      tgt.addNote(convertNotesComponent(t));
    for (org.hl7.fhir.dstu2.model.ClaimResponse.CoverageComponent t : src.getCoverage())
      tgt.addCoverage(convertCoverageComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse convertClaimResponse(org.hl7.fhir.dstu3.model.ClaimResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse tgt = new org.hl7.fhir.dstu2.model.ClaimResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    if (src.hasRequestReference())
    	tgt.setRequest((Reference) convertType(src.getRequest()));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    if (src.hasOrganizationReference())
    	tgt.setOrganization((Reference) convertType(src.getOrganization()));
    if (src.hasRequestProviderReference())
    	tgt.setRequestProvider((Reference) convertType(src.getRequestProvider()));
    if (src.hasRequestOrganizationReference())
    	tgt.setRequestOrganization((Reference) convertType(src.getRequestOrganization()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setPayeeType(convertCoding(src.getPayeeType()));
    for (org.hl7.fhir.dstu3.model.ClaimResponse.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemComponent t : src.getAddItem())
      tgt.addAddItem(convertAddedItemComponent(t));
    for (org.hl7.fhir.dstu3.model.ClaimResponse.ErrorsComponent t : src.getError())
      tgt.addError(convertErrorsComponent(t));
    tgt.setTotalCost(convertMoney(src.getTotalCost()));
    tgt.setUnallocDeductable(convertMoney(src.getUnallocDeductable()));
    tgt.setTotalBenefit(convertMoney(src.getTotalBenefit()));
    tgt.setPaymentAdjustment(convertMoney(src.getPaymentAdjustment()));
    tgt.setPaymentAdjustmentReason(convertCoding(src.getPaymentAdjustmentReason()));
    tgt.setPaymentDate(src.getPaymentDate());
    tgt.setPaymentAmount(convertMoney(src.getPaymentAmount()));
    tgt.setPaymentRef(convertIdentifier(src.getPaymentRef()));
    tgt.setReserved(convertCoding(src.getReserved()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu3.model.ClaimResponse.NotesComponent t : src.getNote())
      tgt.addNote(convertNotesComponent(t));
    for (org.hl7.fhir.dstu3.model.ClaimResponse.CoverageComponent t : src.getCoverage())
      tgt.addCoverage(convertCoverageComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Enumerations.RemittanceOutcome convertRemittanceOutcome(org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome src) {
    if (src == null)
      return null;
    switch (src) {
    case COMPLETE: return org.hl7.fhir.dstu3.model.Enumerations.RemittanceOutcome.COMPLETE;
    case ERROR: return org.hl7.fhir.dstu3.model.Enumerations.RemittanceOutcome.ERROR;
    default: return org.hl7.fhir.dstu3.model.Enumerations.RemittanceOutcome.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome convertRemittanceOutcome(org.hl7.fhir.dstu3.model.Enumerations.RemittanceOutcome src) {
    if (src == null)
      return null;
    switch (src) {
    case COMPLETE: return org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome.COMPLETE;
    case ERROR: return org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome.ERROR;
    default: return org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ClaimResponse.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu2.model.ClaimResponse.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.ItemsComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getNoteNumber())
      tgt.addNoteNumber(t.getValue());
    for (org.hl7.fhir.dstu2.model.ClaimResponse.ItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu2.model.ClaimResponse.ItemDetailComponent t : src.getDetail())
      tgt.addDetail(convertItemDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu3.model.ClaimResponse.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.ItemsComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getNoteNumber())
      tgt.addNoteNumber(t.getValue());
    for (org.hl7.fhir.dstu3.model.ClaimResponse.ItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu3.model.item.ItemDetailComponent t : src.getDetail())
      tgt.addDetail(convertItemDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.ItemAdjudicationComponent convertItemAdjudicationComponent(org.hl7.fhir.dstu2.model.ClaimResponse.ItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.ItemAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.ItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.ItemAdjudicationComponent convertItemAdjudicationComponent(org.hl7.fhir.dstu3.model.ClaimResponse.ItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.ItemAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.ItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.ItemDetailComponent convertItemDetailComponent(org.hl7.fhir.dstu2.model.ClaimResponse.ItemDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.ItemDetailComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.ItemDetailComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    for (org.hl7.fhir.dstu2.model.ClaimResponse.DetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertDetailAdjudicationComponent(t));
    for (org.hl7.fhir.dstu2.model.detail.SubDetailComponent t : src.getSubDetail())
      tgt.addSubDetail(convertSubDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.ItemDetailComponent convertItemDetailComponent(org.hl7.fhir.dstu3.model.ClaimResponse.ItemDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.ItemDetailComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.ItemDetailComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    for (org.hl7.fhir.dstu3.model.ClaimResponse.DetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertDetailAdjudicationComponent(t));
    for (org.hl7.fhir.dstu3.model.detail.SubDetailComponent t : src.getSubDetail())
      tgt.addSubDetail(convertSubDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.DetailAdjudicationComponent convertDetailAdjudicationComponent(org.hl7.fhir.dstu2.model.ClaimResponse.DetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.DetailAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.DetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.DetailAdjudicationComponent convertDetailAdjudicationComponent(org.hl7.fhir.dstu3.model.ClaimResponse.DetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.DetailAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.DetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.SubDetailComponent convertSubDetailComponent(org.hl7.fhir.dstu2.model.ClaimResponse.SubDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.SubDetailComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.SubDetailComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    for (org.hl7.fhir.dstu2.model.ClaimResponse.SubdetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertSubdetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.SubDetailComponent convertSubDetailComponent(org.hl7.fhir.dstu3.model.ClaimResponse.SubDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.SubDetailComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.SubDetailComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    for (org.hl7.fhir.dstu3.model.ClaimResponse.SubdetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertSubdetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.SubdetailAdjudicationComponent convertSubdetailAdjudicationComponent(org.hl7.fhir.dstu2.model.ClaimResponse.SubdetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.SubdetailAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.SubdetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.SubdetailAdjudicationComponent convertSubdetailAdjudicationComponent(org.hl7.fhir.dstu3.model.ClaimResponse.SubdetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.SubdetailAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.SubdetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemComponent convertAddedItemComponent(org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getSequenceLinkId())
      tgt.addSequenceLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getNoteNumberLinkId())
      tgt.addNoteNumberLinkId(t.getValue());
    for (org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu2.model.addItem.AddedItemsDetailComponent t : src.getDetail())
      tgt.addDetail(convertAddedItemsDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemComponent convertAddedItemComponent(org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getSequenceLinkId())
      tgt.addSequenceLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getNoteNumberLinkId())
      tgt.addNoteNumberLinkId(t.getValue());
    for (org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu3.model.addItem.AddedItemsDetailComponent t : src.getDetail())
      tgt.addDetail(convertAddedItemsDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemAdjudicationComponent convertAddedItemAdjudicationComponent(org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemAdjudicationComponent convertAddedItemAdjudicationComponent(org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemsDetailComponent convertAddedItemsDetailComponent(org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemsDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemsDetailComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemsDetailComponent();
    copyElement(src, tgt);
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu2.model.detail.AddedItemDetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemDetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemsDetailComponent convertAddedItemsDetailComponent(org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemsDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemsDetailComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemsDetailComponent();
    copyElement(src, tgt);
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu3.model.detail.AddedItemDetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemDetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemDetailAdjudicationComponent convertAddedItemDetailAdjudicationComponent(org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemDetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemDetailAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemDetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemDetailAdjudicationComponent convertAddedItemDetailAdjudicationComponent(org.hl7.fhir.dstu3.model.ClaimResponse.AddedItemDetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemDetailAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.AddedItemDetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.ErrorsComponent convertErrorsComponent(org.hl7.fhir.dstu2.model.ClaimResponse.ErrorsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.ErrorsComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.ErrorsComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    tgt.setDetailSequenceLinkId(src.getDetailSequenceLinkId());
    tgt.setSubdetailSequenceLinkId(src.getSubdetailSequenceLinkId());
    tgt.setCode(convertCoding(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.ErrorsComponent convertErrorsComponent(org.hl7.fhir.dstu3.model.ClaimResponse.ErrorsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.ErrorsComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.ErrorsComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    tgt.setDetailSequenceLinkId(src.getDetailSequenceLinkId());
    tgt.setSubdetailSequenceLinkId(src.getSubdetailSequenceLinkId());
    tgt.setCode(convertCoding(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.NotesComponent convertNotesComponent(org.hl7.fhir.dstu2.model.ClaimResponse.NotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.NotesComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.NotesComponent();
    copyElement(src, tgt);
    tgt.setNumber(src.getNumber());
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.NotesComponent convertNotesComponent(org.hl7.fhir.dstu3.model.ClaimResponse.NotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.NotesComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.NotesComponent();
    copyElement(src, tgt);
    tgt.setNumber(src.getNumber());
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClaimResponse.CoverageComponent convertCoverageComponent(org.hl7.fhir.dstu2.model.ClaimResponse.CoverageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClaimResponse.CoverageComponent tgt = new org.hl7.fhir.dstu3.model.ClaimResponse.CoverageComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setFocal(src.getFocal());
    tgt.setCoverage(convertType(src.getCoverage()));
    tgt.setBusinessArrangement(src.getBusinessArrangement());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getPreAuthRef())
      tgt.addPreAuthRef(t.getValue());
    tgt.setClaimResponse(convertReference(src.getClaimResponse()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClaimResponse.CoverageComponent convertCoverageComponent(org.hl7.fhir.dstu3.model.ClaimResponse.CoverageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClaimResponse.CoverageComponent tgt = new org.hl7.fhir.dstu2.model.ClaimResponse.CoverageComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setFocal(src.getFocal());
    tgt.setCoverage(convertType(src.getCoverage()));
    tgt.setBusinessArrangement(src.getBusinessArrangement());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getPreAuthRef())
      tgt.addPreAuthRef(t.getValue());
    tgt.setClaimResponse(convertReference(src.getClaimResponse()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClinicalImpression convertClinicalImpression(org.hl7.fhir.dstu2.model.ClinicalImpression src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClinicalImpression tgt = new org.hl7.fhir.dstu3.model.ClinicalImpression();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setAssessor(convertReference(src.getAssessor()));
    tgt.setStatus(convertClinicalImpressionStatus(src.getStatus()));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    tgt.setPrevious(convertReference(src.getPrevious()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getProblem())
      tgt.addProblem(convertReference(t));
    tgt.setTrigger(convertType(src.getTrigger()));
    for (org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent t : src.getInvestigations())
      tgt.addInvestigations(convertClinicalImpressionInvestigationsComponent(t));
    tgt.setProtocol(src.getProtocol());
    tgt.setSummary(src.getSummary());
    for (org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionFindingComponent t : src.getFinding())
      tgt.addFinding(convertClinicalImpressionFindingComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getResolved())
      tgt.addResolved(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionRuledOutComponent t : src.getRuledOut())
      tgt.addRuledOut(convertClinicalImpressionRuledOutComponent(t));
    tgt.setPrognosis(src.getPrognosis());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getPlan())
      tgt.addPlan(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAction())
      tgt.addAction(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClinicalImpression convertClinicalImpression(org.hl7.fhir.dstu3.model.ClinicalImpression src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClinicalImpression tgt = new org.hl7.fhir.dstu2.model.ClinicalImpression();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setAssessor(convertReference(src.getAssessor()));
    tgt.setStatus(convertClinicalImpressionStatus(src.getStatus()));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    tgt.setPrevious(convertReference(src.getPrevious()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getProblem())
      tgt.addProblem(convertReference(t));
    tgt.setTrigger(convertType(src.getTrigger()));
    for (org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent t : src.getInvestigations())
      tgt.addInvestigations(convertClinicalImpressionInvestigationsComponent(t));
    tgt.setProtocol(src.getProtocol());
    tgt.setSummary(src.getSummary());
    for (org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionFindingComponent t : src.getFinding())
      tgt.addFinding(convertClinicalImpressionFindingComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getResolved())
      tgt.addResolved(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionRuledOutComponent t : src.getRuledOut())
      tgt.addRuledOut(convertClinicalImpressionRuledOutComponent(t));
    tgt.setPrognosis(src.getPrognosis());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getPlan())
      tgt.addPlan(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAction())
      tgt.addAction(convertReference(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionStatus convertClinicalImpressionStatus(org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionStatus convertClinicalImpressionStatus(org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent convertClinicalImpressionInvestigationsComponent(org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent tgt = new org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getItem())
      tgt.addItem(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent convertClinicalImpressionInvestigationsComponent(org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent tgt = new org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionInvestigationsComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getItem())
      tgt.addItem(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionFindingComponent convertClinicalImpressionFindingComponent(org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionFindingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionFindingComponent tgt = new org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionFindingComponent();
    copyElement(src, tgt);
    tgt.setItem(convertCodeableConcept(src.getItem()));
    tgt.setCause(src.getCause());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionFindingComponent convertClinicalImpressionFindingComponent(org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionFindingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionFindingComponent tgt = new org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionFindingComponent();
    copyElement(src, tgt);
    tgt.setItem(convertCodeableConcept(src.getItem()));
    tgt.setCause(src.getCause());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionRuledOutComponent convertClinicalImpressionRuledOutComponent(org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionRuledOutComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionRuledOutComponent tgt = new org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionRuledOutComponent();
    copyElement(src, tgt);
    tgt.setItem(convertCodeableConcept(src.getItem()));
    tgt.setReason(src.getReason());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionRuledOutComponent convertClinicalImpressionRuledOutComponent(org.hl7.fhir.dstu3.model.ClinicalImpression.ClinicalImpressionRuledOutComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionRuledOutComponent tgt = new org.hl7.fhir.dstu2.model.ClinicalImpression.ClinicalImpressionRuledOutComponent();
    copyElement(src, tgt);
    tgt.setItem(convertCodeableConcept(src.getItem()));
    tgt.setReason(src.getReason());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Communication convertCommunication(org.hl7.fhir.dstu2.model.Communication src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Communication tgt = new org.hl7.fhir.dstu3.model.Communication();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setSender(convertReference(src.getSender()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Communication.CommunicationPayloadComponent t : src.getPayload())
      tgt.addPayload(convertCommunicationPayloadComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getMedium())
      tgt.addMedium(convertCodeableConcept(t));
    tgt.setStatus(convertCommunicationStatus(src.getStatus()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setSent(src.getSent());
    tgt.setReceived(src.getReceived());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setRequestDetail(convertReference(src.getRequestDetail()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Communication convertCommunication(org.hl7.fhir.dstu3.model.Communication src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Communication tgt = new org.hl7.fhir.dstu2.model.Communication();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setSender(convertReference(src.getSender()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Communication.CommunicationPayloadComponent t : src.getPayload())
      tgt.addPayload(convertCommunicationPayloadComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getMedium())
      tgt.addMedium(convertCodeableConcept(t));
    tgt.setStatus(convertCommunicationStatus(src.getStatus()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setSent(src.getSent());
    tgt.setReceived(src.getReceived());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setRequestDetail(convertReference(src.getRequestDetail()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Communication.CommunicationStatus convertCommunicationStatus(org.hl7.fhir.dstu2.model.Communication.CommunicationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.Communication.CommunicationStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.Communication.CommunicationStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu3.model.Communication.CommunicationStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu3.model.Communication.CommunicationStatus.REJECTED;
    case FAILED: return org.hl7.fhir.dstu3.model.Communication.CommunicationStatus.FAILED;
    default: return org.hl7.fhir.dstu3.model.Communication.CommunicationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Communication.CommunicationStatus convertCommunicationStatus(org.hl7.fhir.dstu3.model.Communication.CommunicationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2.model.Communication.CommunicationStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2.model.Communication.CommunicationStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu2.model.Communication.CommunicationStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu2.model.Communication.CommunicationStatus.REJECTED;
    case FAILED: return org.hl7.fhir.dstu2.model.Communication.CommunicationStatus.FAILED;
    default: return org.hl7.fhir.dstu2.model.Communication.CommunicationStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Communication.CommunicationPayloadComponent convertCommunicationPayloadComponent(org.hl7.fhir.dstu2.model.Communication.CommunicationPayloadComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Communication.CommunicationPayloadComponent tgt = new org.hl7.fhir.dstu3.model.Communication.CommunicationPayloadComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Communication.CommunicationPayloadComponent convertCommunicationPayloadComponent(org.hl7.fhir.dstu3.model.Communication.CommunicationPayloadComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Communication.CommunicationPayloadComponent tgt = new org.hl7.fhir.dstu2.model.Communication.CommunicationPayloadComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CommunicationRequest convertCommunicationRequest(org.hl7.fhir.dstu2.model.CommunicationRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CommunicationRequest tgt = new org.hl7.fhir.dstu3.model.CommunicationRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setSender(convertReference(src.getSender()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    for (org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent t : src.getPayload())
      tgt.addPayload(convertCommunicationRequestPayloadComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getMedium())
      tgt.addMedium(convertCodeableConcept(t));
    tgt.setRequester(convertReference(src.getRequester()));
    tgt.setStatus(convertCommunicationRequestStatus(src.getStatus()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setScheduled(convertType(src.getScheduled()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    tgt.setRequestedOn(src.getRequestedOn());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CommunicationRequest convertCommunicationRequest(org.hl7.fhir.dstu3.model.CommunicationRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CommunicationRequest tgt = new org.hl7.fhir.dstu2.model.CommunicationRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setSender(convertReference(src.getSender()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    for (org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestPayloadComponent t : src.getPayload())
      tgt.addPayload(convertCommunicationRequestPayloadComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getMedium())
      tgt.addMedium(convertCodeableConcept(t));
    tgt.setRequester(convertReference(src.getRequester()));
    tgt.setStatus(convertCommunicationRequestStatus(src.getStatus()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setScheduled(convertType(src.getScheduled()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    tgt.setRequestedOn(src.getRequestedOn());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus convertCommunicationRequestStatus(org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.PROPOSED;
    case PLANNED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.REJECTED;
    case FAILED: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.FAILED;
    default: return org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus convertCommunicationRequestStatus(org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.PROPOSED;
    case PLANNED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.REJECTED;
    case FAILED: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.FAILED;
    default: return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestPayloadComponent convertCommunicationRequestPayloadComponent(org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestPayloadComponent tgt = new org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestPayloadComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent convertCommunicationRequestPayloadComponent(org.hl7.fhir.dstu3.model.CommunicationRequest.CommunicationRequestPayloadComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent tgt = new org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Composition convertComposition(org.hl7.fhir.dstu2.model.Composition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Composition tgt = new org.hl7.fhir.dstu3.model.Composition();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setDate(src.getDate());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setClass(convertCodeableConcept(src.getClass()));
    tgt.setTitle(src.getTitle());
    tgt.setStatus(convertCompositionStatus(src.getStatus()));
    tgt.setConfidentiality(src.getConfidentiality());
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Composition.CompositionAttesterComponent t : src.getAttester())
      tgt.addAttester(convertCompositionAttesterComponent(t));
    tgt.setCustodian(convertReference(src.getCustodian()));
    for (org.hl7.fhir.dstu2.model.Composition.CompositionEventComponent t : src.getEvent())
      tgt.addEvent(convertCompositionEventComponent(t));
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu2.model.Composition.SectionComponent t : src.getSection())
      tgt.addSection(convertSectionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Composition convertComposition(org.hl7.fhir.dstu3.model.Composition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Composition tgt = new org.hl7.fhir.dstu2.model.Composition();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setDate(src.getDate());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setClass(convertCodeableConcept(src.getClass()));
    tgt.setTitle(src.getTitle());
    tgt.setStatus(convertCompositionStatus(src.getStatus()));
    tgt.setConfidentiality(src.getConfidentiality());
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Composition.CompositionAttesterComponent t : src.getAttester())
      tgt.addAttester(convertCompositionAttesterComponent(t));
    tgt.setCustodian(convertReference(src.getCustodian()));
    for (org.hl7.fhir.dstu3.model.Composition.CompositionEventComponent t : src.getEvent())
      tgt.addEvent(convertCompositionEventComponent(t));
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu3.model.Composition.SectionComponent t : src.getSection())
      tgt.addSection(convertSectionComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Composition.CompositionStatus convertCompositionStatus(org.hl7.fhir.dstu2.model.Composition.CompositionStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PRELIMINARY: return org.hl7.fhir.dstu3.model.Composition.CompositionStatus.PRELIMINARY;
    case FINAL: return org.hl7.fhir.dstu3.model.Composition.CompositionStatus.FINAL;
    case AMENDED: return org.hl7.fhir.dstu3.model.Composition.CompositionStatus.AMENDED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Composition.CompositionStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.Composition.CompositionStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Composition.CompositionStatus convertCompositionStatus(org.hl7.fhir.dstu3.model.Composition.CompositionStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PRELIMINARY: return org.hl7.fhir.dstu2.model.Composition.CompositionStatus.PRELIMINARY;
    case FINAL: return org.hl7.fhir.dstu2.model.Composition.CompositionStatus.FINAL;
    case AMENDED: return org.hl7.fhir.dstu2.model.Composition.CompositionStatus.AMENDED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Composition.CompositionStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.Composition.CompositionStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Composition.CompositionAttesterComponent convertCompositionAttesterComponent(org.hl7.fhir.dstu2.model.Composition.CompositionAttesterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Composition.CompositionAttesterComponent tgt = new org.hl7.fhir.dstu3.model.Composition.CompositionAttesterComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode> t : src.getMode())
      tgt.addMode(convertCompositionAttestationMode(t.getValue()));
    tgt.setTime(src.getTime());
    tgt.setParty(convertReference(src.getParty()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Composition.CompositionAttesterComponent convertCompositionAttesterComponent(org.hl7.fhir.dstu3.model.Composition.CompositionAttesterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Composition.CompositionAttesterComponent tgt = new org.hl7.fhir.dstu2.model.Composition.CompositionAttesterComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode> t : src.getMode())
      tgt.addMode(convertCompositionAttestationMode(t.getValue()));
    tgt.setTime(src.getTime());
    tgt.setParty(convertReference(src.getParty()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode convertCompositionAttestationMode(org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode src) {
    if (src == null)
      return null;
    switch (src) {
    case PERSONAL: return org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode.PERSONAL;
    case PROFESSIONAL: return org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode.PROFESSIONAL;
    case LEGAL: return org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode.LEGAL;
    case OFFICIAL: return org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode.OFFICIAL;
    default: return org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode convertCompositionAttestationMode(org.hl7.fhir.dstu3.model.Composition.CompositionAttestationMode src) {
    if (src == null)
      return null;
    switch (src) {
    case PERSONAL: return org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode.PERSONAL;
    case PROFESSIONAL: return org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode.PROFESSIONAL;
    case LEGAL: return org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode.LEGAL;
    case OFFICIAL: return org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode.OFFICIAL;
    default: return org.hl7.fhir.dstu2.model.Composition.CompositionAttestationMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Composition.CompositionEventComponent convertCompositionEventComponent(org.hl7.fhir.dstu2.model.Composition.CompositionEventComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Composition.CompositionEventComponent tgt = new org.hl7.fhir.dstu3.model.Composition.CompositionEventComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCode())
      tgt.addCode(convertCodeableConcept(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getDetail())
      tgt.addDetail(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Composition.CompositionEventComponent convertCompositionEventComponent(org.hl7.fhir.dstu3.model.Composition.CompositionEventComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Composition.CompositionEventComponent tgt = new org.hl7.fhir.dstu2.model.Composition.CompositionEventComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getCode())
      tgt.addCode(convertCodeableConcept(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getDetail())
      tgt.addDetail(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Composition.SectionComponent convertSectionComponent(org.hl7.fhir.dstu2.model.Composition.SectionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Composition.SectionComponent tgt = new org.hl7.fhir.dstu3.model.Composition.SectionComponent();
    copyElement(src, tgt);
    tgt.setTitle(src.getTitle());
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setText(convertNarrative(src.getText()));
    tgt.setMode(src.getMode());
    tgt.setOrderedBy(convertCodeableConcept(src.getOrderedBy()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getEntry())
      tgt.addEntry(convertReference(t));
    tgt.setEmptyReason(convertCodeableConcept(src.getEmptyReason()));
    for (org.hl7.fhir.dstu2.model.Composition.SectionComponent t : src.getSection())
      tgt.addSection(convertSectionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Composition.SectionComponent convertSectionComponent(org.hl7.fhir.dstu3.model.Composition.SectionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Composition.SectionComponent tgt = new org.hl7.fhir.dstu2.model.Composition.SectionComponent();
    copyElement(src, tgt);
    tgt.setTitle(src.getTitle());
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setText(convertNarrative(src.getText()));
    tgt.setMode(src.getMode());
    tgt.setOrderedBy(convertCodeableConcept(src.getOrderedBy()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getEntry())
      tgt.addEntry(convertReference(t));
    tgt.setEmptyReason(convertCodeableConcept(src.getEmptyReason()));
    for (org.hl7.fhir.dstu3.model.Composition.SectionComponent t : src.getSection())
      tgt.addSection(convertSectionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ConceptMap convertConceptMap(org.hl7.fhir.dstu2.model.ConceptMap src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap tgt = new org.hl7.fhir.dstu3.model.ConceptMap();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapContactComponent t : src.getContact())
      tgt.addContact(convertConceptMapContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setSource(convertType(src.getSource()));
    tgt.setTarget(convertType(src.getTarget()));
    for (org.hl7.fhir.dstu2.model.ConceptMap.SourceElementComponent t : src.getElement())
      tgt.addElement(convertSourceElementComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ConceptMap convertConceptMap(org.hl7.fhir.dstu3.model.ConceptMap src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ConceptMap tgt = new org.hl7.fhir.dstu2.model.ConceptMap();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent t : src.getContact())
      tgt.addContact(convertConceptMapContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setSource(convertType(src.getSource()));
    tgt.setTarget(convertType(src.getTarget()));
    for (org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent t : src.getElement())
      tgt.addElement(convertSourceElementComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus convertConformanceResourceStatus(org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.ACTIVE;
    case RETIRED: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.RETIRED;
    default: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus convertConformanceResourceStatus(org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus.ACTIVE;
    case RETIRED: return org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus.RETIRED;
    default: return org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent convertConceptMapContactComponent(org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapContactComponent convertConceptMapContactComponent(org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapContactComponent tgt = new org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent convertSourceElementComponent(org.hl7.fhir.dstu2.model.ConceptMap.SourceElementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu2.model.element.TargetElementComponent t : src.getTarget())
      tgt.addTarget(convertTargetElementComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ConceptMap.SourceElementComponent convertSourceElementComponent(org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ConceptMap.SourceElementComponent tgt = new org.hl7.fhir.dstu2.model.ConceptMap.SourceElementComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu3.model.element.TargetElementComponent t : src.getTarget())
      tgt.addTarget(convertTargetElementComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent convertTargetElementComponent(org.hl7.fhir.dstu2.model.ConceptMap.TargetElementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setEquivalence(convertConceptMapEquivalence(src.getEquivalence()));
    tgt.setComments(src.getComments());
    for (org.hl7.fhir.dstu2.model.target.OtherElementComponent t : src.getDependsOn())
      tgt.addDependsOn(convertOtherElementComponent(t));
    for (org.hl7.fhir.dstu2.model.ConceptMap.OtherElementComponent t : src.getProduct())
      tgt.addProduct(convertOtherElementComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ConceptMap.TargetElementComponent convertTargetElementComponent(org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ConceptMap.TargetElementComponent tgt = new org.hl7.fhir.dstu2.model.ConceptMap.TargetElementComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setEquivalence(convertConceptMapEquivalence(src.getEquivalence()));
    tgt.setComments(src.getComments());
    for (org.hl7.fhir.dstu3.model.target.OtherElementComponent t : src.getDependsOn())
      tgt.addDependsOn(convertOtherElementComponent(t));
    for (org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent t : src.getProduct())
      tgt.addProduct(convertOtherElementComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence convertConceptMapEquivalence(org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence src) {
    if (src == null)
      return null;
    switch (src) {
    case EQUIVALENT: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.EQUIVALENT;
    case EQUAL: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.EQUAL;
    case WIDER: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.WIDER;
    case SUBSUMES: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.SUBSUMES;
    case NARROWER: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.NARROWER;
    case SPECIALIZES: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.SPECIALIZES;
    case INEXACT: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.INEXACT;
    case UNMATCHED: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.UNMATCHED;
    case DISJOINT: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.DISJOINT;
    default: return org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence convertConceptMapEquivalence(org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapEquivalence src) {
    if (src == null)
      return null;
    switch (src) {
    case EQUIVALENT: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.EQUIVALENT;
    case EQUAL: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.EQUAL;
    case WIDER: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.WIDER;
    case SUBSUMES: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.SUBSUMES;
    case NARROWER: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.NARROWER;
    case SPECIALIZES: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.SPECIALIZES;
    case INEXACT: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.INEXACT;
    case UNMATCHED: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.UNMATCHED;
    case DISJOINT: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.DISJOINT;
    default: return org.hl7.fhir.dstu2.model.ConceptMap.ConceptMapEquivalence.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent convertOtherElementComponent(org.hl7.fhir.dstu2.model.ConceptMap.OtherElementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent();
    copyElement(src, tgt);
    tgt.setElement(src.getElement());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ConceptMap.OtherElementComponent convertOtherElementComponent(org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ConceptMap.OtherElementComponent tgt = new org.hl7.fhir.dstu2.model.ConceptMap.OtherElementComponent();
    copyElement(src, tgt);
    tgt.setElement(src.getElement());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Condition convertCondition(org.hl7.fhir.dstu2.model.Condition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Condition tgt = new org.hl7.fhir.dstu3.model.Condition();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setAsserter(convertReference(src.getAsserter()));
    tgt.setDateRecorded(src.getDateRecorded());
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setClinicalStatus(src.getClinicalStatus());
    tgt.setVerificationStatus(convertConditionVerificationStatus(src.getVerificationStatus()));
    tgt.setSeverity(convertCodeableConcept(src.getSeverity()));
    tgt.setOnset(convertType(src.getOnset()));
    tgt.setAbatement(convertType(src.getAbatement()));
    tgt.setStage(convertConditionStageComponent(src.getStage()));
    for (org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent t : src.getEvidence())
      tgt.addEvidence(convertConditionEvidenceComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(convertCodeableConcept(t));
    tgt.setNotes(src.getNotes());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Condition convertCondition(org.hl7.fhir.dstu3.model.Condition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Condition tgt = new org.hl7.fhir.dstu2.model.Condition();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setAsserter(convertReference(src.getAsserter()));
    tgt.setDateRecorded(src.getDateRecorded());
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setClinicalStatus(src.getClinicalStatus());
    tgt.setVerificationStatus(convertConditionVerificationStatus(src.getVerificationStatus()));
    tgt.setSeverity(convertCodeableConcept(src.getSeverity()));
    tgt.setOnset(convertType(src.getOnset()));
    tgt.setAbatement(convertType(src.getAbatement()));
    tgt.setStage(convertConditionStageComponent(src.getStage()));
    for (org.hl7.fhir.dstu3.model.Condition.ConditionEvidenceComponent t : src.getEvidence())
      tgt.addEvidence(convertConditionEvidenceComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(convertCodeableConcept(t));
    tgt.setNotes(src.getNotes());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus convertConditionVerificationStatus(org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROVISIONAL: return org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus.PROVISIONAL;
    case DIFFERENTIAL: return org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus.DIFFERENTIAL;
    case CONFIRMED: return org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus.CONFIRMED;
    case REFUTED: return org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus.REFUTED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus.ENTEREDINERROR;
    case UNKNOWN: return org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus.UNKNOWN;
    default: return org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus convertConditionVerificationStatus(org.hl7.fhir.dstu3.model.Condition.ConditionVerificationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROVISIONAL: return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.PROVISIONAL;
    case DIFFERENTIAL: return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.DIFFERENTIAL;
    case CONFIRMED: return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.CONFIRMED;
    case REFUTED: return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.REFUTED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.ENTEREDINERROR;
    case UNKNOWN: return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.UNKNOWN;
    default: return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Condition.ConditionStageComponent convertConditionStageComponent(org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Condition.ConditionStageComponent tgt = new org.hl7.fhir.dstu3.model.Condition.ConditionStageComponent();
    copyElement(src, tgt);
    tgt.setSummary(convertCodeableConcept(src.getSummary()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAssessment())
      tgt.addAssessment(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent convertConditionStageComponent(org.hl7.fhir.dstu3.model.Condition.ConditionStageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent tgt = new org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent();
    copyElement(src, tgt);
    tgt.setSummary(convertCodeableConcept(src.getSummary()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAssessment())
      tgt.addAssessment(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Condition.ConditionEvidenceComponent convertConditionEvidenceComponent(org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Condition.ConditionEvidenceComponent tgt = new org.hl7.fhir.dstu3.model.Condition.ConditionEvidenceComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getDetail())
      tgt.addDetail(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent convertConditionEvidenceComponent(org.hl7.fhir.dstu3.model.Condition.ConditionEvidenceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent tgt = new org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getDetail())
      tgt.addDetail(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance convertConformance(org.hl7.fhir.dstu2.model.Conformance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance tgt = new org.hl7.fhir.dstu3.model.Conformance();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceContactComponent t : src.getContact())
      tgt.addContact(convertConformanceContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setKind(convertConformanceStatementKind(src.getKind()));
    tgt.setSoftware(convertConformanceSoftwareComponent(src.getSoftware()));
    tgt.setImplementation(convertConformanceImplementationComponent(src.getImplementation()));
    tgt.setFhirVersion(src.getFhirVersion());
    tgt.setAcceptUnknown(convertUnknownContentCode(src.getAcceptUnknown()));
    for (org.hl7.fhir.dstu2.model.CodeType t : src.getFormat())
      tgt.addFormat(t.getValue());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceRestComponent t : src.getRest())
      tgt.addRest(convertConformanceRestComponent(t));
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingComponent t : src.getMessaging())
      tgt.addMessaging(convertConformanceMessagingComponent(t));
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceDocumentComponent t : src.getDocument())
      tgt.addDocument(convertConformanceDocumentComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance convertConformance(org.hl7.fhir.dstu3.model.Conformance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance tgt = new org.hl7.fhir.dstu2.model.Conformance();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent t : src.getContact())
      tgt.addContact(convertConformanceContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setKind(convertConformanceStatementKind(src.getKind()));
    tgt.setSoftware(convertConformanceSoftwareComponent(src.getSoftware()));
    tgt.setImplementation(convertConformanceImplementationComponent(src.getImplementation()));
    tgt.setFhirVersion(src.getFhirVersion());
    tgt.setAcceptUnknown(convertUnknownContentCode(src.getAcceptUnknown()));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getFormat())
      tgt.addFormat(t.getValue());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent t : src.getRest())
      tgt.addRest(convertConformanceRestComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent t : src.getMessaging())
      tgt.addMessaging(convertConformanceMessagingComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent t : src.getDocument())
      tgt.addDocument(convertConformanceDocumentComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind convertConformanceStatementKind(org.hl7.fhir.dstu2.model.Conformance.ConformanceStatementKind src) {
    if (src == null)
      return null;
    switch (src) {
    case INSTANCE: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.INSTANCE;
    case CAPABILITY: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.CAPABILITY;
    case REQUIREMENTS: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.REQUIREMENTS;
    default: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.ConformanceStatementKind convertConformanceStatementKind(org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind src) {
    if (src == null)
      return null;
    switch (src) {
    case INSTANCE: return org.hl7.fhir.dstu2.model.Conformance.ConformanceStatementKind.INSTANCE;
    case CAPABILITY: return org.hl7.fhir.dstu2.model.Conformance.ConformanceStatementKind.CAPABILITY;
    case REQUIREMENTS: return org.hl7.fhir.dstu2.model.Conformance.ConformanceStatementKind.REQUIREMENTS;
    default: return org.hl7.fhir.dstu2.model.Conformance.ConformanceStatementKind.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode convertUnknownContentCode(org.hl7.fhir.dstu2.model.Conformance.UnknownContentCode src) {
    if (src == null)
      return null;
    switch (src) {
    case NO: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.NO;
    case EXTENSIONS: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.EXTENSIONS;
    case ELEMENTS: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.ELEMENTS;
    case BOTH: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.BOTH;
    default: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.UnknownContentCode convertUnknownContentCode(org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode src) {
    if (src == null)
      return null;
    switch (src) {
    case NO: return org.hl7.fhir.dstu2.model.Conformance.UnknownContentCode.NO;
    case EXTENSIONS: return org.hl7.fhir.dstu2.model.Conformance.UnknownContentCode.EXTENSIONS;
    case ELEMENTS: return org.hl7.fhir.dstu2.model.Conformance.UnknownContentCode.ELEMENTS;
    case BOTH: return org.hl7.fhir.dstu2.model.Conformance.UnknownContentCode.BOTH;
    default: return org.hl7.fhir.dstu2.model.Conformance.UnknownContentCode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent convertConformanceContactComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceContactComponent convertConformanceContactComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceContactComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent convertConformanceSoftwareComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceSoftwareComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setVersion(src.getVersion());
    tgt.setReleaseDate(src.getReleaseDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceSoftwareComponent convertConformanceSoftwareComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceSoftwareComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceSoftwareComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setVersion(src.getVersion());
    tgt.setReleaseDate(src.getReleaseDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent convertConformanceImplementationComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceImplementationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceImplementationComponent convertConformanceImplementationComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceImplementationComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceImplementationComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent convertConformanceRestComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceRestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent();
    copyElement(src, tgt);
    tgt.setMode(convertRestfulConformanceMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setSecurity(convertConformanceRestSecurityComponent(src.getSecurity()));
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceComponent t : src.getResource())
      tgt.addResource(convertConformanceRestResourceComponent(t));
    for (org.hl7.fhir.dstu2.model.Conformance.SystemInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertSystemInteractionComponent(t));
    tgt.setTransactionMode(convertTransactionMode(src.getTransactionMode()));
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceRestOperationComponent t : src.getOperation())
      tgt.addOperation(convertConformanceRestOperationComponent(t));
    for (org.hl7.fhir.dstu2.model.UriType t : src.getCompartment())
      tgt.addCompartment(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceRestComponent convertConformanceRestComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceRestComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceRestComponent();
    copyElement(src, tgt);
    tgt.setMode(convertRestfulConformanceMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setSecurity(convertConformanceRestSecurityComponent(src.getSecurity()));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent t : src.getResource())
      tgt.addResource(convertConformanceRestResourceComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertSystemInteractionComponent(t));
    tgt.setTransactionMode(convertTransactionMode(src.getTransactionMode()));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent t : src.getOperation())
      tgt.addOperation(convertConformanceRestOperationComponent(t));
    for (org.hl7.fhir.dstu3.model.UriType t : src.getCompartment())
      tgt.addCompartment(t.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode convertRestfulConformanceMode(org.hl7.fhir.dstu2.model.Conformance.RestfulConformanceMode src) {
    if (src == null)
      return null;
    switch (src) {
    case CLIENT: return org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode.CLIENT;
    case SERVER: return org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode.SERVER;
    default: return org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.RestfulConformanceMode convertRestfulConformanceMode(org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode src) {
    if (src == null)
      return null;
    switch (src) {
    case CLIENT: return org.hl7.fhir.dstu2.model.Conformance.RestfulConformanceMode.CLIENT;
    case SERVER: return org.hl7.fhir.dstu2.model.Conformance.RestfulConformanceMode.SERVER;
    default: return org.hl7.fhir.dstu2.model.Conformance.RestfulConformanceMode.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Conformance.TransactionMode convertTransactionMode(org.hl7.fhir.dstu2.model.Conformance.TransactionMode src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTSUPPORTED: return org.hl7.fhir.dstu3.model.Conformance.TransactionMode.NOTSUPPORTED;
    case BATCH: return org.hl7.fhir.dstu3.model.Conformance.TransactionMode.BATCH;
    case TRANSACTION: return org.hl7.fhir.dstu3.model.Conformance.TransactionMode.TRANSACTION;
    case BOTH: return org.hl7.fhir.dstu3.model.Conformance.TransactionMode.BOTH;
    default: return org.hl7.fhir.dstu3.model.Conformance.TransactionMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.TransactionMode convertTransactionMode(org.hl7.fhir.dstu3.model.Conformance.TransactionMode src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTSUPPORTED: return org.hl7.fhir.dstu2.model.Conformance.TransactionMode.NOTSUPPORTED;
    case BATCH: return org.hl7.fhir.dstu2.model.Conformance.TransactionMode.BATCH;
    case TRANSACTION: return org.hl7.fhir.dstu2.model.Conformance.TransactionMode.TRANSACTION;
    case BOTH: return org.hl7.fhir.dstu2.model.Conformance.TransactionMode.BOTH;
    default: return org.hl7.fhir.dstu2.model.Conformance.TransactionMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent convertConformanceRestSecurityComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent();
    copyElement(src, tgt);
    tgt.setCors(src.getCors());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getService())
      tgt.addService(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityCertificateComponent t : src.getCertificate())
      tgt.addCertificate(convertConformanceRestSecurityCertificateComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityComponent convertConformanceRestSecurityComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityComponent();
    copyElement(src, tgt);
    tgt.setCors(src.getCors());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getService())
      tgt.addService(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent t : src.getCertificate())
      tgt.addCertificate(convertConformanceRestSecurityCertificateComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent convertConformanceRestSecurityCertificateComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityCertificateComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityCertificateComponent convertConformanceRestSecurityCertificateComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityCertificateComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceRestSecurityCertificateComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent convertConformanceRestResourceComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    for (org.hl7.fhir.dstu2.model.Conformance.ResourceInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertResourceInteractionComponent(t));
    tgt.setVersioning(convertResourceVersionPolicy(src.getVersioning()));
    tgt.setReadHistory(src.getReadHistory());
    tgt.setUpdateCreate(src.getUpdateCreate());
    tgt.setConditionalCreate(src.getConditionalCreate());
    tgt.setConditionalUpdate(src.getConditionalUpdate());
    tgt.setConditionalDelete(convertConditionalDeleteStatus(src.getConditionalDelete()));
    for (org.hl7.fhir.dstu2.model.StringType t : src.getSearchInclude())
      tgt.addSearchInclude(t.getValue());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getSearchRevInclude())
      tgt.addSearchRevInclude(t.getValue());
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceComponent convertConformanceRestResourceComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    for (org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertResourceInteractionComponent(t));
    tgt.setVersioning(convertResourceVersionPolicy(src.getVersioning()));
    tgt.setReadHistory(src.getReadHistory());
    tgt.setUpdateCreate(src.getUpdateCreate());
    tgt.setConditionalCreate(src.getConditionalCreate());
    tgt.setConditionalUpdate(src.getConditionalUpdate());
    tgt.setConditionalDelete(convertConditionalDeleteStatus(src.getConditionalDelete()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getSearchInclude())
      tgt.addSearchInclude(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getSearchRevInclude())
      tgt.addSearchRevInclude(t.getValue());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy convertResourceVersionPolicy(org.hl7.fhir.dstu2.model.Conformance.ResourceVersionPolicy src) {
    if (src == null)
      return null;
    switch (src) {
    case NOVERSION: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.NOVERSION;
    case VERSIONED: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.VERSIONED;
    case VERSIONEDUPDATE: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.VERSIONEDUPDATE;
    default: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.ResourceVersionPolicy convertResourceVersionPolicy(org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy src) {
    if (src == null)
      return null;
    switch (src) {
    case NOVERSION: return org.hl7.fhir.dstu2.model.Conformance.ResourceVersionPolicy.NOVERSION;
    case VERSIONED: return org.hl7.fhir.dstu2.model.Conformance.ResourceVersionPolicy.VERSIONED;
    case VERSIONEDUPDATE: return org.hl7.fhir.dstu2.model.Conformance.ResourceVersionPolicy.VERSIONEDUPDATE;
    default: return org.hl7.fhir.dstu2.model.Conformance.ResourceVersionPolicy.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus convertConditionalDeleteStatus(org.hl7.fhir.dstu2.model.Conformance.ConditionalDeleteStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTSUPPORTED: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.NOTSUPPORTED;
    case SINGLE: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.SINGLE;
    case MULTIPLE: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.MULTIPLE;
    default: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.ConditionalDeleteStatus convertConditionalDeleteStatus(org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTSUPPORTED: return org.hl7.fhir.dstu2.model.Conformance.ConditionalDeleteStatus.NOTSUPPORTED;
    case SINGLE: return org.hl7.fhir.dstu2.model.Conformance.ConditionalDeleteStatus.SINGLE;
    case MULTIPLE: return org.hl7.fhir.dstu2.model.Conformance.ConditionalDeleteStatus.MULTIPLE;
    default: return org.hl7.fhir.dstu2.model.Conformance.ConditionalDeleteStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent convertResourceInteractionComponent(org.hl7.fhir.dstu2.model.Conformance.ResourceInteractionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertTypeRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ResourceInteractionComponent convertResourceInteractionComponent(org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ResourceInteractionComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ResourceInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertTypeRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction convertTypeRestfulInteraction(org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction src) {
    if (src == null)
      return null;
    switch (src) {
    case READ: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.READ;
    case VREAD: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.VREAD;
    case UPDATE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.UPDATE;
    case DELETE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.DELETE;
    case HISTORYINSTANCE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.HISTORYINSTANCE;
    case HISTORYTYPE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.HISTORYTYPE;
    case CREATE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.CREATE;
    case SEARCHTYPE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.SEARCHTYPE;
    default: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction convertTypeRestfulInteraction(org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction src) {
    if (src == null)
      return null;
    switch (src) {
    case READ: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.READ;
    case VREAD: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.VREAD;
    case UPDATE: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.UPDATE;
    case DELETE: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.DELETE;
    case HISTORYINSTANCE: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.HISTORYINSTANCE;
    case HISTORYTYPE: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.HISTORYTYPE;
    case CREATE: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.CREATE;
    case SEARCHTYPE: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.SEARCHTYPE;
    default: return org.hl7.fhir.dstu2.model.Conformance.TypeRestfulInteraction.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent convertConformanceRestResourceSearchParamComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceSearchParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(src.getDefinition());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu2.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    for (org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode> t : src.getModifier())
      tgt.addModifier(convertSearchModifierCode(t.getValue()));
    for (org.hl7.fhir.dstu2.model.StringType t : src.getChain())
      tgt.addChain(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceSearchParamComponent convertConformanceRestResourceSearchParamComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceSearchParamComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceRestResourceSearchParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(src.getDefinition());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode> t : src.getModifier())
      tgt.addModifier(convertSearchModifierCode(t.getValue()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getChain())
      tgt.addChain(t.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Enumerations.SearchParamType convertSearchParamType(org.hl7.fhir.dstu2.model.Enumerations.SearchParamType src) {
    if (src == null)
      return null;
    switch (src) {
    case NUMBER: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.NUMBER;
    case DATE: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.DATE;
    case STRING: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.STRING;
    case TOKEN: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.TOKEN;
    case REFERENCE: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.REFERENCE;
    case COMPOSITE: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.COMPOSITE;
    case QUANTITY: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.QUANTITY;
    case URI: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.URI;
    default: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Enumerations.SearchParamType convertSearchParamType(org.hl7.fhir.dstu3.model.Enumerations.SearchParamType src) {
    if (src == null)
      return null;
    switch (src) {
    case NUMBER: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.NUMBER;
    case DATE: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.DATE;
    case STRING: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.STRING;
    case TOKEN: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.TOKEN;
    case REFERENCE: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.REFERENCE;
    case COMPOSITE: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.COMPOSITE;
    case QUANTITY: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.QUANTITY;
    case URI: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.URI;
    default: return org.hl7.fhir.dstu2.model.Enumerations.SearchParamType.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode convertSearchModifierCode(org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode src) {
    if (src == null)
      return null;
    switch (src) {
    case MISSING: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.MISSING;
    case EXACT: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.EXACT;
    case CONTAINS: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.CONTAINS;
    case NOT: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.NOT;
    case TEXT: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.TEXT;
    case IN: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.IN;
    case NOTIN: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.NOTIN;
    case BELOW: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.BELOW;
    case ABOVE: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.ABOVE;
    case TYPE: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.TYPE;
    default: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode convertSearchModifierCode(org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode src) {
    if (src == null)
      return null;
    switch (src) {
    case MISSING: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.MISSING;
    case EXACT: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.EXACT;
    case CONTAINS: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.CONTAINS;
    case NOT: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.NOT;
    case TEXT: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.TEXT;
    case IN: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.IN;
    case NOTIN: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.NOTIN;
    case BELOW: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.BELOW;
    case ABOVE: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.ABOVE;
    case TYPE: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.TYPE;
    default: return org.hl7.fhir.dstu2.model.Conformance.SearchModifierCode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent convertSystemInteractionComponent(org.hl7.fhir.dstu2.model.Conformance.SystemInteractionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertSystemRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.SystemInteractionComponent convertSystemInteractionComponent(org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.SystemInteractionComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.SystemInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertSystemRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction convertSystemRestfulInteraction(org.hl7.fhir.dstu2.model.Conformance.SystemRestfulInteraction src) {
    if (src == null)
      return null;
    switch (src) {
    case TRANSACTION: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.TRANSACTION;
    case SEARCHSYSTEM: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.SEARCHSYSTEM;
    case HISTORYSYSTEM: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.HISTORYSYSTEM;
    default: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.SystemRestfulInteraction convertSystemRestfulInteraction(org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction src) {
    if (src == null)
      return null;
    switch (src) {
    case TRANSACTION: return org.hl7.fhir.dstu2.model.Conformance.SystemRestfulInteraction.TRANSACTION;
    case SEARCHSYSTEM: return org.hl7.fhir.dstu2.model.Conformance.SystemRestfulInteraction.SEARCHSYSTEM;
    case HISTORYSYSTEM: return org.hl7.fhir.dstu2.model.Conformance.SystemRestfulInteraction.HISTORYSYSTEM;
    default: return org.hl7.fhir.dstu2.model.Conformance.SystemRestfulInteraction.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent convertConformanceRestOperationComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceRestOperationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(convertReference(src.getDefinition()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceRestOperationComponent convertConformanceRestOperationComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceRestOperationComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceRestOperationComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(convertReference(src.getDefinition()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent convertConformanceMessagingComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEndpointComponent t : src.getEndpoint())
      tgt.addEndpoint(convertConformanceMessagingEndpointComponent(t));
    tgt.setReliableCache(src.getReliableCache());
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEventComponent t : src.getEvent())
      tgt.addEvent(convertConformanceMessagingEventComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingComponent convertConformanceMessagingComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent t : src.getEndpoint())
      tgt.addEndpoint(convertConformanceMessagingEndpointComponent(t));
    tgt.setReliableCache(src.getReliableCache());
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent t : src.getEvent())
      tgt.addEvent(convertConformanceMessagingEventComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent convertConformanceMessagingEndpointComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEndpointComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent();
    copyElement(src, tgt);
    tgt.setProtocol(convertCoding(src.getProtocol()));
    tgt.setAddress(src.getAddress());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEndpointComponent convertConformanceMessagingEndpointComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEndpointComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEndpointComponent();
    copyElement(src, tgt);
    tgt.setProtocol(convertCoding(src.getProtocol()));
    tgt.setAddress(src.getAddress());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent convertConformanceMessagingEventComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEventComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCoding(src.getCode()));
    tgt.setCategory(convertMessageSignificanceCategory(src.getCategory()));
    tgt.setMode(convertConformanceEventMode(src.getMode()));
    tgt.setFocus(src.getFocus());
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setResponse(convertReference(src.getResponse()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEventComponent convertConformanceMessagingEventComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEventComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceMessagingEventComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCoding(src.getCode()));
    tgt.setCategory(convertMessageSignificanceCategory(src.getCategory()));
    tgt.setMode(convertConformanceEventMode(src.getMode()));
    tgt.setFocus(src.getFocus());
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setResponse(convertReference(src.getResponse()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory convertMessageSignificanceCategory(org.hl7.fhir.dstu2.model.Conformance.MessageSignificanceCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case CONSEQUENCE: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.CONSEQUENCE;
    case CURRENCY: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.CURRENCY;
    case NOTIFICATION: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.NOTIFICATION;
    default: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.MessageSignificanceCategory convertMessageSignificanceCategory(org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case CONSEQUENCE: return org.hl7.fhir.dstu2.model.Conformance.MessageSignificanceCategory.CONSEQUENCE;
    case CURRENCY: return org.hl7.fhir.dstu2.model.Conformance.MessageSignificanceCategory.CURRENCY;
    case NOTIFICATION: return org.hl7.fhir.dstu2.model.Conformance.MessageSignificanceCategory.NOTIFICATION;
    default: return org.hl7.fhir.dstu2.model.Conformance.MessageSignificanceCategory.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode convertConformanceEventMode(org.hl7.fhir.dstu2.model.Conformance.ConformanceEventMode src) {
    if (src == null)
      return null;
    switch (src) {
    case SENDER: return org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode.SENDER;
    case RECEIVER: return org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode.RECEIVER;
    default: return org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.ConformanceEventMode convertConformanceEventMode(org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode src) {
    if (src == null)
      return null;
    switch (src) {
    case SENDER: return org.hl7.fhir.dstu2.model.Conformance.ConformanceEventMode.SENDER;
    case RECEIVER: return org.hl7.fhir.dstu2.model.Conformance.ConformanceEventMode.RECEIVER;
    default: return org.hl7.fhir.dstu2.model.Conformance.ConformanceEventMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent convertConformanceDocumentComponent(org.hl7.fhir.dstu2.model.Conformance.ConformanceDocumentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent();
    copyElement(src, tgt);
    tgt.setMode(convertDocumentMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Conformance.ConformanceDocumentComponent convertConformanceDocumentComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Conformance.ConformanceDocumentComponent tgt = new org.hl7.fhir.dstu2.model.Conformance.ConformanceDocumentComponent();
    copyElement(src, tgt);
    tgt.setMode(convertDocumentMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.DocumentMode convertDocumentMode(org.hl7.fhir.dstu2.model.Conformance.DocumentMode src) {
    if (src == null)
      return null;
    switch (src) {
    case PRODUCER: return org.hl7.fhir.dstu3.model.Conformance.DocumentMode.PRODUCER;
    case CONSUMER: return org.hl7.fhir.dstu3.model.Conformance.DocumentMode.CONSUMER;
    default: return org.hl7.fhir.dstu3.model.Conformance.DocumentMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Conformance.DocumentMode convertDocumentMode(org.hl7.fhir.dstu3.model.Conformance.DocumentMode src) {
    if (src == null)
      return null;
    switch (src) {
    case PRODUCER: return org.hl7.fhir.dstu2.model.Conformance.DocumentMode.PRODUCER;
    case CONSUMER: return org.hl7.fhir.dstu2.model.Conformance.DocumentMode.CONSUMER;
    default: return org.hl7.fhir.dstu2.model.Conformance.DocumentMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Contract convertContract(org.hl7.fhir.dstu2.model.Contract src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract tgt = new org.hl7.fhir.dstu3.model.Contract();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setIssued(src.getIssued());
    tgt.setApplies(convertPeriod(src.getApplies()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSubject())
      tgt.addSubject(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getTopic())
      tgt.addTopic(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAuthority())
      tgt.addAuthority(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getDomain())
      tgt.addDomain(convertReference(t));
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSubType())
      tgt.addSubType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getAction())
      tgt.addAction(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getActionReason())
      tgt.addActionReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Contract.AgentComponent t : src.getAgent())
      tgt.addAgent(convertAgentComponent(t));
    for (org.hl7.fhir.dstu2.model.Contract.SignatoryComponent t : src.getSigner())
      tgt.addSigner(convertSignatoryComponent(t));
    for (org.hl7.fhir.dstu2.model.Contract.ValuedItemComponent t : src.getValuedItem())
      tgt.addValuedItem(convertValuedItemComponent(t));
    for (org.hl7.fhir.dstu2.model.Contract.TermComponent t : src.getTerm())
      tgt.addTerm(convertTermComponent(t));
    tgt.setBinding(convertType(src.getBinding()));
    for (org.hl7.fhir.dstu2.model.Contract.FriendlyLanguageComponent t : src.getFriendly())
      tgt.addFriendly(convertFriendlyLanguageComponent(t));
    for (org.hl7.fhir.dstu2.model.Contract.LegalLanguageComponent t : src.getLegal())
      tgt.addLegal(convertLegalLanguageComponent(t));
    for (org.hl7.fhir.dstu2.model.Contract.ComputableLanguageComponent t : src.getRule())
      tgt.addRule(convertComputableLanguageComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract convertContract(org.hl7.fhir.dstu3.model.Contract src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract tgt = new org.hl7.fhir.dstu2.model.Contract();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setIssued(src.getIssued());
    tgt.setApplies(convertPeriod(src.getApplies()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSubject())
      tgt.addSubject(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getTopic())
      tgt.addTopic(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAuthority())
      tgt.addAuthority(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getDomain())
      tgt.addDomain(convertReference(t));
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSubType())
      tgt.addSubType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getAction())
      tgt.addAction(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getActionReason())
      tgt.addActionReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Contract.AgentComponent t : src.getAgent())
      tgt.addAgent(convertAgentComponent(t));
    for (org.hl7.fhir.dstu3.model.Contract.SignatoryComponent t : src.getSigner())
      tgt.addSigner(convertSignatoryComponent(t));
    for (org.hl7.fhir.dstu3.model.Contract.ValuedItemComponent t : src.getValuedItem())
      tgt.addValuedItem(convertValuedItemComponent(t));
    for (org.hl7.fhir.dstu3.model.Contract.TermComponent t : src.getTerm())
      tgt.addTerm(convertTermComponent(t));
    tgt.setBinding(convertType(src.getBinding()));
    for (org.hl7.fhir.dstu3.model.Contract.FriendlyLanguageComponent t : src.getFriendly())
      tgt.addFriendly(convertFriendlyLanguageComponent(t));
    for (org.hl7.fhir.dstu3.model.Contract.LegalLanguageComponent t : src.getLegal())
      tgt.addLegal(convertLegalLanguageComponent(t));
    for (org.hl7.fhir.dstu3.model.Contract.ComputableLanguageComponent t : src.getRule())
      tgt.addRule(convertComputableLanguageComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.AgentComponent convertAgentComponent(org.hl7.fhir.dstu2.model.Contract.AgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.AgentComponent tgt = new org.hl7.fhir.dstu3.model.Contract.AgentComponent();
    copyElement(src, tgt);
    tgt.setActor(convertReference(src.getActor()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getRole())
      tgt.addRole(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.AgentComponent convertAgentComponent(org.hl7.fhir.dstu3.model.Contract.AgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.AgentComponent tgt = new org.hl7.fhir.dstu2.model.Contract.AgentComponent();
    copyElement(src, tgt);
    tgt.setActor(convertReference(src.getActor()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getRole())
      tgt.addRole(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.SignatoryComponent convertSignatoryComponent(org.hl7.fhir.dstu2.model.Contract.SignatoryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.SignatoryComponent tgt = new org.hl7.fhir.dstu3.model.Contract.SignatoryComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setParty(convertReference(src.getParty()));
    for (org.hl7.fhir.dstu2.model.Signature t : src.getSignature())
      tgt.addSignature(convertSignature(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.SignatoryComponent convertSignatoryComponent(org.hl7.fhir.dstu3.model.Contract.SignatoryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.SignatoryComponent tgt = new org.hl7.fhir.dstu2.model.Contract.SignatoryComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setParty(convertReference(src.getParty()));
    for (org.hl7.fhir.dstu3.model.Signature t : src.getSignature())
      tgt.addSignature(convertSignature(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.ValuedItemComponent convertValuedItemComponent(org.hl7.fhir.dstu2.model.Contract.ValuedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.ValuedItemComponent tgt = new org.hl7.fhir.dstu3.model.Contract.ValuedItemComponent();
    copyElement(src, tgt);
    tgt.setEntity(convertType(src.getEntity()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setEffectiveTime(src.getEffectiveTime());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.ValuedItemComponent convertValuedItemComponent(org.hl7.fhir.dstu3.model.Contract.ValuedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.ValuedItemComponent tgt = new org.hl7.fhir.dstu2.model.Contract.ValuedItemComponent();
    copyElement(src, tgt);
    tgt.setEntity(convertType(src.getEntity()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setEffectiveTime(src.getEffectiveTime());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.TermComponent convertTermComponent(org.hl7.fhir.dstu2.model.Contract.TermComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.TermComponent tgt = new org.hl7.fhir.dstu3.model.Contract.TermComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setIssued(src.getIssued());
    tgt.setApplies(convertPeriod(src.getApplies()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSubType(convertCodeableConcept(src.getSubType()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getTopic())
      tgt.addTopic(convertReference(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getAction())
      tgt.addAction(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getActionReason())
      tgt.addActionReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.term.TermAgentComponent t : src.getAgent())
      tgt.addAgent(convertTermAgentComponent(t));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu2.model.term.TermValuedItemComponent t : src.getValuedItem())
      tgt.addValuedItem(convertTermValuedItemComponent(t));
    for (org.hl7.fhir.dstu2.model.Contract.TermComponent t : src.getGroup())
      tgt.addGroup(convertTermComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.TermComponent convertTermComponent(org.hl7.fhir.dstu3.model.Contract.TermComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.TermComponent tgt = new org.hl7.fhir.dstu2.model.Contract.TermComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setIssued(src.getIssued());
    tgt.setApplies(convertPeriod(src.getApplies()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSubType(convertCodeableConcept(src.getSubType()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getTopic())
      tgt.addTopic(convertReference(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getAction())
      tgt.addAction(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getActionReason())
      tgt.addActionReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.term.TermAgentComponent t : src.getAgent())
      tgt.addAgent(convertTermAgentComponent(t));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu3.model.term.TermValuedItemComponent t : src.getValuedItem())
      tgt.addValuedItem(convertTermValuedItemComponent(t));
    for (org.hl7.fhir.dstu3.model.Contract.TermComponent t : src.getGroup())
      tgt.addGroup(convertTermComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.TermAgentComponent convertTermAgentComponent(org.hl7.fhir.dstu2.model.Contract.TermAgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.TermAgentComponent tgt = new org.hl7.fhir.dstu3.model.Contract.TermAgentComponent();
    copyElement(src, tgt);
    tgt.setActor(convertReference(src.getActor()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getRole())
      tgt.addRole(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.TermAgentComponent convertTermAgentComponent(org.hl7.fhir.dstu3.model.Contract.TermAgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.TermAgentComponent tgt = new org.hl7.fhir.dstu2.model.Contract.TermAgentComponent();
    copyElement(src, tgt);
    tgt.setActor(convertReference(src.getActor()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getRole())
      tgt.addRole(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.TermValuedItemComponent convertTermValuedItemComponent(org.hl7.fhir.dstu2.model.Contract.TermValuedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.TermValuedItemComponent tgt = new org.hl7.fhir.dstu3.model.Contract.TermValuedItemComponent();
    copyElement(src, tgt);
    tgt.setEntity(convertType(src.getEntity()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setEffectiveTime(src.getEffectiveTime());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.TermValuedItemComponent convertTermValuedItemComponent(org.hl7.fhir.dstu3.model.Contract.TermValuedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.TermValuedItemComponent tgt = new org.hl7.fhir.dstu2.model.Contract.TermValuedItemComponent();
    copyElement(src, tgt);
    tgt.setEntity(convertType(src.getEntity()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setEffectiveTime(src.getEffectiveTime());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.FriendlyLanguageComponent convertFriendlyLanguageComponent(org.hl7.fhir.dstu2.model.Contract.FriendlyLanguageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.FriendlyLanguageComponent tgt = new org.hl7.fhir.dstu3.model.Contract.FriendlyLanguageComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.FriendlyLanguageComponent convertFriendlyLanguageComponent(org.hl7.fhir.dstu3.model.Contract.FriendlyLanguageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.FriendlyLanguageComponent tgt = new org.hl7.fhir.dstu2.model.Contract.FriendlyLanguageComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.LegalLanguageComponent convertLegalLanguageComponent(org.hl7.fhir.dstu2.model.Contract.LegalLanguageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.LegalLanguageComponent tgt = new org.hl7.fhir.dstu3.model.Contract.LegalLanguageComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.LegalLanguageComponent convertLegalLanguageComponent(org.hl7.fhir.dstu3.model.Contract.LegalLanguageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.LegalLanguageComponent tgt = new org.hl7.fhir.dstu2.model.Contract.LegalLanguageComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Contract.ComputableLanguageComponent convertComputableLanguageComponent(org.hl7.fhir.dstu2.model.Contract.ComputableLanguageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Contract.ComputableLanguageComponent tgt = new org.hl7.fhir.dstu3.model.Contract.ComputableLanguageComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Contract.ComputableLanguageComponent convertComputableLanguageComponent(org.hl7.fhir.dstu3.model.Contract.ComputableLanguageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Contract.ComputableLanguageComponent tgt = new org.hl7.fhir.dstu2.model.Contract.ComputableLanguageComponent();
    copyElement(src, tgt);
    tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Coverage convertCoverage(org.hl7.fhir.dstu2.model.Coverage src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Coverage tgt = new org.hl7.fhir.dstu3.model.Coverage();
    copyDomainResource(src, tgt);
    tgt.setIssuer(convertType(src.getIssuer()));
    tgt.setBin(src.getBin());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setType(convertCoding(src.getType()));
    tgt.setPlanholder(convertType(src.getPlanholder()));
    tgt.setBeneficiary(convertType(src.getBeneficiary()));
    tgt.setRelationship(convertCoding(src.getRelationship()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setGroup(src.getGroup());
    tgt.setPlan(src.getPlan());
    tgt.setSubPlan(src.getSubPlan());
    tgt.setDependent(src.getDependent());
    tgt.setSequence(src.getSequence());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getException())
      tgt.addException(convertCoding(t));
    tgt.setSchool(src.getSchool());
    tgt.setNetwork(src.getNetwork());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getContract())
      tgt.addContract(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Coverage convertCoverage(org.hl7.fhir.dstu3.model.Coverage src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Coverage tgt = new org.hl7.fhir.dstu2.model.Coverage();
    copyDomainResource(src, tgt);
    tgt.setIssuer(convertType(src.getIssuer()));
    tgt.setBin(src.getBin());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setType(convertCoding(src.getType()));
    tgt.setPlanholder(convertType(src.getPlanholder()));
    tgt.setBeneficiary(convertType(src.getBeneficiary()));
    tgt.setRelationship(convertCoding(src.getRelationship()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setGroup(src.getGroup());
    tgt.setPlan(src.getPlan());
    tgt.setSubPlan(src.getSubPlan());
    tgt.setDependent(src.getDependent());
    tgt.setSequence(src.getSequence());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getException())
      tgt.addException(convertCoding(t));
    tgt.setSchool(src.getSchool());
    tgt.setNetwork(src.getNetwork());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getContract())
      tgt.addContract(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DataElement convertDataElement(org.hl7.fhir.dstu2.model.DataElement src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DataElement tgt = new org.hl7.fhir.dstu3.model.DataElement();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    tgt.setDate(src.getDate());
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.DataElement.DataElementContactComponent t : src.getContact())
      tgt.addContact(convertDataElementContactComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setStringency(convertDataElementStringency(src.getStringency()));
    for (org.hl7.fhir.dstu2.model.DataElement.DataElementMappingComponent t : src.getMapping())
      tgt.addMapping(convertDataElementMappingComponent(t));
    for (org.hl7.fhir.dstu2.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DataElement convertDataElement(org.hl7.fhir.dstu3.model.DataElement src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DataElement tgt = new org.hl7.fhir.dstu2.model.DataElement();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    tgt.setDate(src.getDate());
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent t : src.getContact())
      tgt.addContact(convertDataElementContactComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setStringency(convertDataElementStringency(src.getStringency()));
    for (org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent t : src.getMapping())
      tgt.addMapping(convertDataElementMappingComponent(t));
    for (org.hl7.fhir.dstu3.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DataElement.DataElementStringency convertDataElementStringency(org.hl7.fhir.dstu2.model.DataElement.DataElementStringency src) {
    if (src == null)
      return null;
    switch (src) {
    case COMPARABLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.COMPARABLE;
    case FULLYSPECIFIED: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.FULLYSPECIFIED;
    case EQUIVALENT: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.EQUIVALENT;
    case CONVERTABLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.CONVERTABLE;
    case SCALEABLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.SCALEABLE;
    case FLEXIBLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.FLEXIBLE;
    default: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DataElement.DataElementStringency convertDataElementStringency(org.hl7.fhir.dstu3.model.DataElement.DataElementStringency src) {
    if (src == null)
      return null;
    switch (src) {
    case COMPARABLE: return org.hl7.fhir.dstu2.model.DataElement.DataElementStringency.COMPARABLE;
    case FULLYSPECIFIED: return org.hl7.fhir.dstu2.model.DataElement.DataElementStringency.FULLYSPECIFIED;
    case EQUIVALENT: return org.hl7.fhir.dstu2.model.DataElement.DataElementStringency.EQUIVALENT;
    case CONVERTABLE: return org.hl7.fhir.dstu2.model.DataElement.DataElementStringency.CONVERTABLE;
    case SCALEABLE: return org.hl7.fhir.dstu2.model.DataElement.DataElementStringency.SCALEABLE;
    case FLEXIBLE: return org.hl7.fhir.dstu2.model.DataElement.DataElementStringency.FLEXIBLE;
    default: return org.hl7.fhir.dstu2.model.DataElement.DataElementStringency.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent convertDataElementContactComponent(org.hl7.fhir.dstu2.model.DataElement.DataElementContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent tgt = new org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DataElement.DataElementContactComponent convertDataElementContactComponent(org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DataElement.DataElementContactComponent tgt = new org.hl7.fhir.dstu2.model.DataElement.DataElementContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent convertDataElementMappingComponent(org.hl7.fhir.dstu2.model.DataElement.DataElementMappingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent tgt = new org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DataElement.DataElementMappingComponent convertDataElementMappingComponent(org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DataElement.DataElementMappingComponent tgt = new org.hl7.fhir.dstu2.model.DataElement.DataElementMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DetectedIssue convertDetectedIssue(org.hl7.fhir.dstu2.model.DetectedIssue src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DetectedIssue tgt = new org.hl7.fhir.dstu3.model.DetectedIssue();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setSeverity(convertDetectedIssueSeverity(src.getSeverity()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getImplicated())
      tgt.addImplicated(convertReference(t));
    tgt.setDetail(src.getDetail());
    tgt.setDate(src.getDate());
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setReference(src.getReference());
    for (org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueMitigationComponent t : src.getMitigation())
      tgt.addMitigation(convertDetectedIssueMitigationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DetectedIssue convertDetectedIssue(org.hl7.fhir.dstu3.model.DetectedIssue src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DetectedIssue tgt = new org.hl7.fhir.dstu2.model.DetectedIssue();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setSeverity(convertDetectedIssueSeverity(src.getSeverity()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getImplicated())
      tgt.addImplicated(convertReference(t));
    tgt.setDetail(src.getDetail());
    tgt.setDate(src.getDate());
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setReference(src.getReference());
    for (org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueMitigationComponent t : src.getMitigation())
      tgt.addMitigation(convertDetectedIssueMitigationComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueSeverity convertDetectedIssueSeverity(org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case HIGH: return org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueSeverity.HIGH;
    case MODERATE: return org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueSeverity.MODERATE;
    case LOW: return org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueSeverity.LOW;
    default: return org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueSeverity.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueSeverity convertDetectedIssueSeverity(org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case HIGH: return org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueSeverity.HIGH;
    case MODERATE: return org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueSeverity.MODERATE;
    case LOW: return org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueSeverity.LOW;
    default: return org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueSeverity.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueMitigationComponent convertDetectedIssueMitigationComponent(org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueMitigationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueMitigationComponent tgt = new org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueMitigationComponent();
    copyElement(src, tgt);
    tgt.setAction(convertCodeableConcept(src.getAction()));
    tgt.setDate(src.getDate());
    tgt.setAuthor(convertReference(src.getAuthor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueMitigationComponent convertDetectedIssueMitigationComponent(org.hl7.fhir.dstu3.model.DetectedIssue.DetectedIssueMitigationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueMitigationComponent tgt = new org.hl7.fhir.dstu2.model.DetectedIssue.DetectedIssueMitigationComponent();
    copyElement(src, tgt);
    tgt.setAction(convertCodeableConcept(src.getAction()));
    tgt.setDate(src.getDate());
    tgt.setAuthor(convertReference(src.getAuthor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Device convertDevice(org.hl7.fhir.dstu2.model.Device src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Device tgt = new org.hl7.fhir.dstu3.model.Device();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setUdiCarrier(convertIdentifier(src.getUdiCarrier()));
    tgt.setStatus(convertDeviceStatus(src.getStatus()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setLotNumber(src.getLotNumber());
    tgt.setManufacturer(src.getManufacturer());
    tgt.setManufactureDate(src.getManufactureDate());
    tgt.setExpirationDate(src.getExpirationDate());
    tgt.setModel(src.getModel());
    tgt.setVersion(src.getVersion());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setOwner(convertReference(src.getOwner()));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getContact())
      tgt.addContact(convertContactPoint(t));
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Device convertDevice(org.hl7.fhir.dstu3.model.Device src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Device tgt = new org.hl7.fhir.dstu2.model.Device();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setUdiCarrier(convertIdentifier(src.getUdiCarrier()));
    tgt.setStatus(convertDeviceStatus(src.getStatus()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setLotNumber(src.getLotNumber());
    tgt.setManufacturer(src.getManufacturer());
    tgt.setManufactureDate(src.getManufactureDate());
    tgt.setExpirationDate(src.getExpirationDate());
    tgt.setModel(src.getModel());
    tgt.setVersion(src.getVersion());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setOwner(convertReference(src.getOwner()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getContact())
      tgt.addContact(convertContactPoint(t));
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Device.DeviceStatus convertDeviceStatus(org.hl7.fhir.dstu2.model.Device.DeviceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case AVAILABLE: return org.hl7.fhir.dstu3.model.Device.DeviceStatus.AVAILABLE;
    case NOTAVAILABLE: return org.hl7.fhir.dstu3.model.Device.DeviceStatus.NOTAVAILABLE;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Device.DeviceStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.Device.DeviceStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Device.DeviceStatus convertDeviceStatus(org.hl7.fhir.dstu3.model.Device.DeviceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case AVAILABLE: return org.hl7.fhir.dstu2.model.Device.DeviceStatus.AVAILABLE;
    case NOTAVAILABLE: return org.hl7.fhir.dstu2.model.Device.DeviceStatus.NOTAVAILABLE;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Device.DeviceStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.Device.DeviceStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DeviceComponent convertDeviceComponent(org.hl7.fhir.dstu2.model.DeviceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DeviceComponent tgt = new org.hl7.fhir.dstu3.model.DeviceComponent();
    copyDomainResource(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setLastSystemChange(src.getLastSystemChange());
    tgt.setSource(convertReference(src.getSource()));
    tgt.setParent(convertReference(src.getParent()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getOperationalStatus())
      tgt.addOperationalStatus(convertCodeableConcept(t));
    tgt.setParameterGroup(convertCodeableConcept(src.getParameterGroup()));
    tgt.setMeasurementPrinciple(convertMeasmntPrinciple(src.getMeasurementPrinciple()));
    for (org.hl7.fhir.dstu2.model.DeviceComponent.DeviceComponentProductionSpecificationComponent t : src.getProductionSpecification())
      tgt.addProductionSpecification(convertDeviceComponentProductionSpecificationComponent(t));
    tgt.setLanguageCode(convertCodeableConcept(src.getLanguageCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DeviceComponent convertDeviceComponent(org.hl7.fhir.dstu3.model.DeviceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DeviceComponent tgt = new org.hl7.fhir.dstu2.model.DeviceComponent();
    copyDomainResource(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setLastSystemChange(src.getLastSystemChange());
    tgt.setSource(convertReference(src.getSource()));
    tgt.setParent(convertReference(src.getParent()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getOperationalStatus())
      tgt.addOperationalStatus(convertCodeableConcept(t));
    tgt.setParameterGroup(convertCodeableConcept(src.getParameterGroup()));
    tgt.setMeasurementPrinciple(convertMeasmntPrinciple(src.getMeasurementPrinciple()));
    for (org.hl7.fhir.dstu3.model.DeviceComponent.DeviceComponentProductionSpecificationComponent t : src.getProductionSpecification())
      tgt.addProductionSpecification(convertDeviceComponentProductionSpecificationComponent(t));
    tgt.setLanguageCode(convertCodeableConcept(src.getLanguageCode()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple convertMeasmntPrinciple(org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple src) {
    if (src == null)
      return null;
    switch (src) {
    case OTHER: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.OTHER;
    case CHEMICAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.CHEMICAL;
    case ELECTRICAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.ELECTRICAL;
    case IMPEDANCE: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.IMPEDANCE;
    case NUCLEAR: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.NUCLEAR;
    case OPTICAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.OPTICAL;
    case THERMAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.THERMAL;
    case BIOLOGICAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.BIOLOGICAL;
    case MECHANICAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.MECHANICAL;
    case ACOUSTICAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.ACOUSTICAL;
    case MANUAL: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.MANUAL;
    default: return org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple convertMeasmntPrinciple(org.hl7.fhir.dstu3.model.DeviceComponent.MeasmntPrinciple src) {
    if (src == null)
      return null;
    switch (src) {
    case OTHER: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.OTHER;
    case CHEMICAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.CHEMICAL;
    case ELECTRICAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.ELECTRICAL;
    case IMPEDANCE: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.IMPEDANCE;
    case NUCLEAR: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.NUCLEAR;
    case OPTICAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.OPTICAL;
    case THERMAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.THERMAL;
    case BIOLOGICAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.BIOLOGICAL;
    case MECHANICAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.MECHANICAL;
    case ACOUSTICAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.ACOUSTICAL;
    case MANUAL: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.MANUAL;
    default: return org.hl7.fhir.dstu2.model.DeviceComponent.MeasmntPrinciple.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DeviceComponent.DeviceComponentProductionSpecificationComponent convertDeviceComponentProductionSpecificationComponent(org.hl7.fhir.dstu2.model.DeviceComponent.DeviceComponentProductionSpecificationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DeviceComponent.DeviceComponentProductionSpecificationComponent tgt = new org.hl7.fhir.dstu3.model.DeviceComponent.DeviceComponentProductionSpecificationComponent();
    copyElement(src, tgt);
    tgt.setSpecType(convertCodeableConcept(src.getSpecType()));
    tgt.setComponentId(convertIdentifier(src.getComponentId()));
    tgt.setProductionSpec(src.getProductionSpec());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DeviceComponent.DeviceComponentProductionSpecificationComponent convertDeviceComponentProductionSpecificationComponent(org.hl7.fhir.dstu3.model.DeviceComponent.DeviceComponentProductionSpecificationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DeviceComponent.DeviceComponentProductionSpecificationComponent tgt = new org.hl7.fhir.dstu2.model.DeviceComponent.DeviceComponentProductionSpecificationComponent();
    copyElement(src, tgt);
    tgt.setSpecType(convertCodeableConcept(src.getSpecType()));
    tgt.setComponentId(convertIdentifier(src.getComponentId()));
    tgt.setProductionSpec(src.getProductionSpec());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DeviceMetric convertDeviceMetric(org.hl7.fhir.dstu2.model.DeviceMetric src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DeviceMetric tgt = new org.hl7.fhir.dstu3.model.DeviceMetric();
    copyDomainResource(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setUnit(convertCodeableConcept(src.getUnit()));
    tgt.setSource(convertReference(src.getSource()));
    tgt.setParent(convertReference(src.getParent()));
    tgt.setOperationalStatus(convertDeviceMetricOperationalStatus(src.getOperationalStatus()));
    tgt.setColor(convertDeviceMetricColor(src.getColor()));
    tgt.setCategory(convertDeviceMetricCategory(src.getCategory()));
    tgt.setMeasurementPeriod(convertTiming(src.getMeasurementPeriod()));
    for (org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent t : src.getCalibration())
      tgt.addCalibration(convertDeviceMetricCalibrationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DeviceMetric convertDeviceMetric(org.hl7.fhir.dstu3.model.DeviceMetric src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DeviceMetric tgt = new org.hl7.fhir.dstu2.model.DeviceMetric();
    copyDomainResource(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setUnit(convertCodeableConcept(src.getUnit()));
    tgt.setSource(convertReference(src.getSource()));
    tgt.setParent(convertReference(src.getParent()));
    tgt.setOperationalStatus(convertDeviceMetricOperationalStatus(src.getOperationalStatus()));
    tgt.setColor(convertDeviceMetricColor(src.getColor()));
    tgt.setCategory(convertDeviceMetricCategory(src.getCategory()));
    tgt.setMeasurementPeriod(convertTiming(src.getMeasurementPeriod()));
    for (org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationComponent t : src.getCalibration())
      tgt.addCalibration(convertDeviceMetricCalibrationComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricOperationalStatus convertDeviceMetricOperationalStatus(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ON: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricOperationalStatus.ON;
    case OFF: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricOperationalStatus.OFF;
    case STANDBY: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricOperationalStatus.STANDBY;
    default: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricOperationalStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus convertDeviceMetricOperationalStatus(org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricOperationalStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ON: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.ON;
    case OFF: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.OFF;
    case STANDBY: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.STANDBY;
    default: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor convertDeviceMetricColor(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor src) {
    if (src == null)
      return null;
    switch (src) {
    case BLACK: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.BLACK;
    case RED: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.RED;
    case GREEN: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.GREEN;
    case YELLOW: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.YELLOW;
    case BLUE: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.BLUE;
    case MAGENTA: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.MAGENTA;
    case CYAN: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.CYAN;
    case WHITE: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.WHITE;
    default: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor convertDeviceMetricColor(org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricColor src) {
    if (src == null)
      return null;
    switch (src) {
    case BLACK: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.BLACK;
    case RED: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.RED;
    case GREEN: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.GREEN;
    case YELLOW: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.YELLOW;
    case BLUE: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.BLUE;
    case MAGENTA: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.MAGENTA;
    case CYAN: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.CYAN;
    case WHITE: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.WHITE;
    default: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCategory convertDeviceMetricCategory(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case MEASUREMENT: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCategory.MEASUREMENT;
    case SETTING: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCategory.SETTING;
    case CALCULATION: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCategory.CALCULATION;
    case UNSPECIFIED: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCategory.UNSPECIFIED;
    default: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCategory.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory convertDeviceMetricCategory(org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case MEASUREMENT: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.MEASUREMENT;
    case SETTING: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.SETTING;
    case CALCULATION: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.CALCULATION;
    case UNSPECIFIED: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.UNSPECIFIED;
    default: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationComponent convertDeviceMetricCalibrationComponent(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationComponent tgt = new org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationComponent();
    copyElement(src, tgt);
    tgt.setType(convertDeviceMetricCalibrationType(src.getType()));
    tgt.setState(convertDeviceMetricCalibrationState(src.getState()));
    tgt.setTime(src.getTime());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent convertDeviceMetricCalibrationComponent(org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent tgt = new org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent();
    copyElement(src, tgt);
    tgt.setType(convertDeviceMetricCalibrationType(src.getType()));
    tgt.setState(convertDeviceMetricCalibrationState(src.getState()));
    tgt.setTime(src.getTime());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationType convertDeviceMetricCalibrationType(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType src) {
    if (src == null)
      return null;
    switch (src) {
    case UNSPECIFIED: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationType.UNSPECIFIED;
    case OFFSET: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationType.OFFSET;
    case GAIN: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationType.GAIN;
    case TWOPOINT: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationType.TWOPOINT;
    default: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType convertDeviceMetricCalibrationType(org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationType src) {
    if (src == null)
      return null;
    switch (src) {
    case UNSPECIFIED: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.UNSPECIFIED;
    case OFFSET: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.OFFSET;
    case GAIN: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.GAIN;
    case TWOPOINT: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.TWOPOINT;
    default: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationState convertDeviceMetricCalibrationState(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTCALIBRATED: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationState.NOTCALIBRATED;
    case CALIBRATIONREQUIRED: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATIONREQUIRED;
    case CALIBRATED: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATED;
    case UNSPECIFIED: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationState.UNSPECIFIED;
    default: return org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationState.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState convertDeviceMetricCalibrationState(org.hl7.fhir.dstu3.model.DeviceMetric.DeviceMetricCalibrationState src) {
    if (src == null)
      return null;
    switch (src) {
    case NOTCALIBRATED: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.NOTCALIBRATED;
    case CALIBRATIONREQUIRED: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATIONREQUIRED;
    case CALIBRATED: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATED;
    case UNSPECIFIED: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.UNSPECIFIED;
    default: return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DeviceUseRequest convertDeviceUseRequest(org.hl7.fhir.dstu2.model.DeviceUseRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DeviceUseRequest tgt = new org.hl7.fhir.dstu3.model.DeviceUseRequest();
    copyDomainResource(src, tgt);
    tgt.setBodySite(convertType(src.getBodySite()));
    tgt.setStatus(convertDeviceUseRequestStatus(src.getStatus()));
    tgt.setDevice(convertReference(src.getDevice()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getIndication())
      tgt.addIndication(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.StringType t : src.getNotes())
      tgt.addNotes(t.getValue());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getPrnReason())
      tgt.addPrnReason(convertCodeableConcept(t));
    tgt.setOrderedOn(src.getOrderedOn());
    tgt.setRecordedOn(src.getRecordedOn());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setTiming(convertType(src.getTiming()));
    tgt.setPriority(convertDeviceUseRequestPriority(src.getPriority()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DeviceUseRequest convertDeviceUseRequest(org.hl7.fhir.dstu3.model.DeviceUseRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DeviceUseRequest tgt = new org.hl7.fhir.dstu2.model.DeviceUseRequest();
    copyDomainResource(src, tgt);
    tgt.setBodySite(convertType(src.getBodySite()));
    tgt.setStatus(convertDeviceUseRequestStatus(src.getStatus()));
    tgt.setDevice(convertReference(src.getDevice()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getIndication())
      tgt.addIndication(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getNotes())
      tgt.addNotes(t.getValue());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getPrnReason())
      tgt.addPrnReason(convertCodeableConcept(t));
    tgt.setOrderedOn(src.getOrderedOn());
    tgt.setRecordedOn(src.getRecordedOn());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setTiming(convertType(src.getTiming()));
    tgt.setPriority(convertDeviceUseRequestPriority(src.getPriority()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus convertDeviceUseRequestStatus(org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.PROPOSED;
    case PLANNED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.REJECTED;
    case ABORTED: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.ABORTED;
    default: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus convertDeviceUseRequestStatus(org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.PROPOSED;
    case PLANNED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.REJECTED;
    case ABORTED: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.ABORTED;
    default: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestPriority convertDeviceUseRequestPriority(org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestPriority src) {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestPriority.URGENT;
    case STAT: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestPriority.STAT;
    case ASAP: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestPriority.ASAP;
    default: return org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestPriority.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestPriority convertDeviceUseRequestPriority(org.hl7.fhir.dstu3.model.DeviceUseRequest.DeviceUseRequestPriority src) {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestPriority.URGENT;
    case STAT: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestPriority.STAT;
    case ASAP: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestPriority.ASAP;
    default: return org.hl7.fhir.dstu2.model.DeviceUseRequest.DeviceUseRequestPriority.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DeviceUseStatement convertDeviceUseStatement(org.hl7.fhir.dstu2.model.DeviceUseStatement src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DeviceUseStatement tgt = new org.hl7.fhir.dstu3.model.DeviceUseStatement();
    copyDomainResource(src, tgt);
    tgt.setBodySite(convertType(src.getBodySite()));
    tgt.setWhenUsed(convertPeriod(src.getWhenUsed()));
    tgt.setDevice(convertReference(src.getDevice()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getIndication())
      tgt.addIndication(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.StringType t : src.getNotes())
      tgt.addNotes(t.getValue());
    tgt.setRecordedOn(src.getRecordedOn());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setTiming(convertType(src.getTiming()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DeviceUseStatement convertDeviceUseStatement(org.hl7.fhir.dstu3.model.DeviceUseStatement src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DeviceUseStatement tgt = new org.hl7.fhir.dstu2.model.DeviceUseStatement();
    copyDomainResource(src, tgt);
    tgt.setBodySite(convertType(src.getBodySite()));
    tgt.setWhenUsed(convertPeriod(src.getWhenUsed()));
    tgt.setDevice(convertReference(src.getDevice()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getIndication())
      tgt.addIndication(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getNotes())
      tgt.addNotes(t.getValue());
    tgt.setRecordedOn(src.getRecordedOn());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setTiming(convertType(src.getTiming()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DiagnosticOrder convertDiagnosticOrder(org.hl7.fhir.dstu2.model.DiagnosticOrder src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DiagnosticOrder tgt = new org.hl7.fhir.dstu3.model.DiagnosticOrder();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertDiagnosticOrderStatus(src.getStatus()));
    tgt.setPriority(convertDiagnosticOrderPriority(src.getPriority()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setOrderer(convertReference(src.getOrderer()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSupportingInformation())
      tgt.addSupportingInformation(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSpecimen())
      tgt.addSpecimen(convertReference(t));
    for (org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderEventComponent t : src.getEvent())
      tgt.addEvent(convertDiagnosticOrderEventComponent(t));
    for (org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderItemComponent t : src.getItem())
      tgt.addItem(convertDiagnosticOrderItemComponent(t));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DiagnosticOrder convertDiagnosticOrder(org.hl7.fhir.dstu3.model.DiagnosticOrder src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DiagnosticOrder tgt = new org.hl7.fhir.dstu2.model.DiagnosticOrder();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertDiagnosticOrderStatus(src.getStatus()));
    tgt.setPriority(convertDiagnosticOrderPriority(src.getPriority()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setOrderer(convertReference(src.getOrderer()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSupportingInformation())
      tgt.addSupportingInformation(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSpecimen())
      tgt.addSpecimen(convertReference(t));
    for (org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderEventComponent t : src.getEvent())
      tgt.addEvent(convertDiagnosticOrderEventComponent(t));
    for (org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderItemComponent t : src.getItem())
      tgt.addItem(convertDiagnosticOrderItemComponent(t));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus convertDiagnosticOrderStatus(org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.DRAFT;
    case PLANNED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.INPROGRESS;
    case REVIEW: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.REVIEW;
    case COMPLETED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.CANCELLED;
    case SUSPENDED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.REJECTED;
    case FAILED: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.FAILED;
    default: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus convertDiagnosticOrderStatus(org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.DRAFT;
    case PLANNED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.INPROGRESS;
    case REVIEW: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.REVIEW;
    case COMPLETED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.CANCELLED;
    case SUSPENDED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.REJECTED;
    case FAILED: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.FAILED;
    default: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderPriority convertDiagnosticOrderPriority(org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderPriority src) {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderPriority.URGENT;
    case STAT: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderPriority.STAT;
    case ASAP: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderPriority.ASAP;
    default: return org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderPriority.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderPriority convertDiagnosticOrderPriority(org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderPriority src) {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderPriority.URGENT;
    case STAT: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderPriority.STAT;
    case ASAP: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderPriority.ASAP;
    default: return org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderPriority.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderEventComponent convertDiagnosticOrderEventComponent(org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderEventComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderEventComponent tgt = new org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderEventComponent();
    copyElement(src, tgt);
    tgt.setStatus(convertDiagnosticOrderStatus(src.getStatus()));
    tgt.setDescription(convertCodeableConcept(src.getDescription()));
    tgt.setDateTime(src.getDateTime());
    tgt.setActor(convertReference(src.getActor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderEventComponent convertDiagnosticOrderEventComponent(org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderEventComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderEventComponent tgt = new org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderEventComponent();
    copyElement(src, tgt);
    tgt.setStatus(convertDiagnosticOrderStatus(src.getStatus()));
    tgt.setDescription(convertCodeableConcept(src.getDescription()));
    tgt.setDateTime(src.getDateTime());
    tgt.setActor(convertReference(src.getActor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderItemComponent convertDiagnosticOrderItemComponent(org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderItemComponent tgt = new org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderItemComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSpecimen())
      tgt.addSpecimen(convertReference(t));
    tgt.setBodySite(convertCodeableConcept(src.getBodySite()));
    tgt.setStatus(convertDiagnosticOrderStatus(src.getStatus()));
    for (org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderEventComponent t : src.getEvent())
      tgt.addEvent(convertDiagnosticOrderEventComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderItemComponent convertDiagnosticOrderItemComponent(org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderItemComponent tgt = new org.hl7.fhir.dstu2.model.DiagnosticOrder.DiagnosticOrderItemComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSpecimen())
      tgt.addSpecimen(convertReference(t));
    tgt.setBodySite(convertCodeableConcept(src.getBodySite()));
    tgt.setStatus(convertDiagnosticOrderStatus(src.getStatus()));
    for (org.hl7.fhir.dstu3.model.DiagnosticOrder.DiagnosticOrderEventComponent t : src.getEvent())
      tgt.addEvent(convertDiagnosticOrderEventComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DiagnosticReport convertDiagnosticReport(org.hl7.fhir.dstu2.model.DiagnosticReport src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DiagnosticReport tgt = new org.hl7.fhir.dstu3.model.DiagnosticReport();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertDiagnosticReportStatus(src.getStatus()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setEffective(convertType(src.getEffective()));
    tgt.setIssued(src.getIssued());
    tgt.setPerformer(convertReference(src.getPerformer()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getRequest())
      tgt.addRequest(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSpecimen())
      tgt.addSpecimen(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getResult())
      tgt.addResult(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getImagingStudy())
      tgt.addImagingStudy(convertReference(t));
    for (org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportImageComponent t : src.getImage())
      tgt.addImage(convertDiagnosticReportImageComponent(t));
    tgt.setConclusion(src.getConclusion());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCodedDiagnosis())
      tgt.addCodedDiagnosis(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Attachment t : src.getPresentedForm())
      tgt.addPresentedForm(convertAttachment(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DiagnosticReport convertDiagnosticReport(org.hl7.fhir.dstu3.model.DiagnosticReport src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DiagnosticReport tgt = new org.hl7.fhir.dstu2.model.DiagnosticReport();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertDiagnosticReportStatus(src.getStatus()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setEffective(convertType(src.getEffective()));
    tgt.setIssued(src.getIssued());
    tgt.setPerformer(convertReference(src.getPerformer()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getRequest())
      tgt.addRequest(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSpecimen())
      tgt.addSpecimen(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getResult())
      tgt.addResult(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getImagingStudy())
      tgt.addImagingStudy(convertReference(t));
    for (org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportImageComponent t : src.getImage())
      tgt.addImage(convertDiagnosticReportImageComponent(t));
    tgt.setConclusion(src.getConclusion());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getCodedDiagnosis())
      tgt.addCodedDiagnosis(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Attachment t : src.getPresentedForm())
      tgt.addPresentedForm(convertAttachment(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus convertDiagnosticReportStatus(org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REGISTERED: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.REGISTERED;
    case PARTIAL: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.PARTIAL;
    case FINAL: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.FINAL;
    case CORRECTED: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.CORRECTED;
    case APPENDED: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.APPENDED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.CANCELLED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus convertDiagnosticReportStatus(org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REGISTERED: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.REGISTERED;
    case PARTIAL: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.PARTIAL;
    case FINAL: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.FINAL;
    case CORRECTED: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.CORRECTED;
    case APPENDED: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.APPENDED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.CANCELLED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportImageComponent convertDiagnosticReportImageComponent(org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportImageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportImageComponent tgt = new org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportImageComponent();
    copyElement(src, tgt);
    tgt.setComment(src.getComment());
    tgt.setLink(convertReference(src.getLink()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportImageComponent convertDiagnosticReportImageComponent(org.hl7.fhir.dstu3.model.DiagnosticReport.DiagnosticReportImageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportImageComponent tgt = new org.hl7.fhir.dstu2.model.DiagnosticReport.DiagnosticReportImageComponent();
    copyElement(src, tgt);
    tgt.setComment(src.getComment());
    tgt.setLink(convertReference(src.getLink()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DocumentManifest convertDocumentManifest(org.hl7.fhir.dstu2.model.DocumentManifest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentManifest tgt = new org.hl7.fhir.dstu3.model.DocumentManifest();
    copyDomainResource(src, tgt);
    tgt.setMasterIdentifier(convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    tgt.setCreated(src.getCreated());
    tgt.setSource(src.getSource());
    tgt.setStatus(convertDocumentReferenceStatus(src.getStatus()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestContentComponent t : src.getContent())
      tgt.addContent(convertDocumentManifestContentComponent(t));
    for (org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentManifestRelatedComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentManifest convertDocumentManifest(org.hl7.fhir.dstu3.model.DocumentManifest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentManifest tgt = new org.hl7.fhir.dstu2.model.DocumentManifest();
    copyDomainResource(src, tgt);
    tgt.setMasterIdentifier(convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    tgt.setCreated(src.getCreated());
    tgt.setSource(src.getSource());
    tgt.setStatus(convertDocumentReferenceStatus(src.getStatus()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestContentComponent t : src.getContent())
      tgt.addContent(convertDocumentManifestContentComponent(t));
    for (org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentManifestRelatedComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Enumerations.DocumentReferenceStatus convertDocumentReferenceStatus(org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case CURRENT: return org.hl7.fhir.dstu3.model.Enumerations.DocumentReferenceStatus.CURRENT;
    case SUPERSEDED: return org.hl7.fhir.dstu3.model.Enumerations.DocumentReferenceStatus.SUPERSEDED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Enumerations.DocumentReferenceStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.Enumerations.DocumentReferenceStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus convertDocumentReferenceStatus(org.hl7.fhir.dstu3.model.Enumerations.DocumentReferenceStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case CURRENT: return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.CURRENT;
    case SUPERSEDED: return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.SUPERSEDED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestContentComponent convertDocumentManifestContentComponent(org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestContentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestContentComponent tgt = new org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestContentComponent();
    copyElement(src, tgt);
    tgt.setP(convertType(src.getP()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestContentComponent convertDocumentManifestContentComponent(org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestContentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestContentComponent tgt = new org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestContentComponent();
    copyElement(src, tgt);
    tgt.setP(convertType(src.getP()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestRelatedComponent convertDocumentManifestRelatedComponent(org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestRelatedComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestRelatedComponent tgt = new org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestRelatedComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setRef(convertReference(src.getRef()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestRelatedComponent convertDocumentManifestRelatedComponent(org.hl7.fhir.dstu3.model.DocumentManifest.DocumentManifestRelatedComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestRelatedComponent tgt = new org.hl7.fhir.dstu2.model.DocumentManifest.DocumentManifestRelatedComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setRef(convertReference(src.getRef()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DocumentReference convertDocumentReference(org.hl7.fhir.dstu2.model.DocumentReference src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentReference tgt = new org.hl7.fhir.dstu3.model.DocumentReference();
    copyDomainResource(src, tgt);
    tgt.setMasterIdentifier(convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setClass(convertCodeableConcept(src.getClass()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    tgt.setCustodian(convertReference(src.getCustodian()));
    tgt.setAuthenticator(convertReference(src.getAuthenticator()));
    tgt.setCreated(src.getCreated());
    tgt.setIndexed(src.getIndexed());
    tgt.setStatus(convertDocumentReferenceStatus(src.getStatus()));
    tgt.setDocStatus(convertCodeableConcept(src.getDocStatus()));
    for (org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent t : src.getRelatesTo())
      tgt.addRelatesTo(convertDocumentReferenceRelatesToComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSecurityLabel())
      tgt.addSecurityLabel(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent t : src.getContent())
      tgt.addContent(convertDocumentReferenceContentComponent(t));
    tgt.setContext(convertDocumentReferenceContextComponent(src.getContext()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentReference convertDocumentReference(org.hl7.fhir.dstu3.model.DocumentReference src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentReference tgt = new org.hl7.fhir.dstu2.model.DocumentReference();
    copyDomainResource(src, tgt);
    tgt.setMasterIdentifier(convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setClass(convertCodeableConcept(src.getClass()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAuthor())
      tgt.addAuthor(convertReference(t));
    tgt.setCustodian(convertReference(src.getCustodian()));
    tgt.setAuthenticator(convertReference(src.getAuthenticator()));
    tgt.setCreated(src.getCreated());
    tgt.setIndexed(src.getIndexed());
    tgt.setStatus(convertDocumentReferenceStatus(src.getStatus()));
    tgt.setDocStatus(convertCodeableConcept(src.getDocStatus()));
    for (org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceRelatesToComponent t : src.getRelatesTo())
      tgt.addRelatesTo(convertDocumentReferenceRelatesToComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSecurityLabel())
      tgt.addSecurityLabel(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContentComponent t : src.getContent())
      tgt.addContent(convertDocumentReferenceContentComponent(t));
    tgt.setContext(convertDocumentReferenceContextComponent(src.getContext()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceRelatesToComponent convertDocumentReferenceRelatesToComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceRelatesToComponent tgt = new org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceRelatesToComponent();
    copyElement(src, tgt);
    tgt.setCode(convertDocumentRelationshipType(src.getCode()));
    tgt.setTarget(convertReference(src.getTarget()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent convertDocumentReferenceRelatesToComponent(org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceRelatesToComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent();
    copyElement(src, tgt);
    tgt.setCode(convertDocumentRelationshipType(src.getCode()));
    tgt.setTarget(convertReference(src.getTarget()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DocumentReference.DocumentRelationshipType convertDocumentRelationshipType(org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType src) {
    if (src == null)
      return null;
    switch (src) {
    case REPLACES: return org.hl7.fhir.dstu3.model.DocumentReference.DocumentRelationshipType.REPLACES;
    case TRANSFORMS: return org.hl7.fhir.dstu3.model.DocumentReference.DocumentRelationshipType.TRANSFORMS;
    case SIGNS: return org.hl7.fhir.dstu3.model.DocumentReference.DocumentRelationshipType.SIGNS;
    case APPENDS: return org.hl7.fhir.dstu3.model.DocumentReference.DocumentRelationshipType.APPENDS;
    default: return org.hl7.fhir.dstu3.model.DocumentReference.DocumentRelationshipType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType convertDocumentRelationshipType(org.hl7.fhir.dstu3.model.DocumentReference.DocumentRelationshipType src) {
    if (src == null)
      return null;
    switch (src) {
    case REPLACES: return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.REPLACES;
    case TRANSFORMS: return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.TRANSFORMS;
    case SIGNS: return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.SIGNS;
    case APPENDS: return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.APPENDS;
    default: return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContentComponent convertDocumentReferenceContentComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContentComponent tgt = new org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContentComponent();
    copyElement(src, tgt);
    tgt.setAttachment(convertAttachment(src.getAttachment()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getFormat())
      tgt.addFormat(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent convertDocumentReferenceContentComponent(org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent();
    copyElement(src, tgt);
    tgt.setAttachment(convertAttachment(src.getAttachment()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getFormat())
      tgt.addFormat(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextComponent convertDocumentReferenceContextComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextComponent tgt = new org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextComponent();
    copyElement(src, tgt);
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getEvent())
      tgt.addEvent(convertCodeableConcept(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setFacilityType(convertCodeableConcept(src.getFacilityType()));
    tgt.setPracticeSetting(convertCodeableConcept(src.getPracticeSetting()));
    tgt.setSourcePatientInfo(convertReference(src.getSourcePatientInfo()));
    for (org.hl7.fhir.dstu2.model.context.DocumentReferenceContextRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentReferenceContextRelatedComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent convertDocumentReferenceContextComponent(org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent();
    copyElement(src, tgt);
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getEvent())
      tgt.addEvent(convertCodeableConcept(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setFacilityType(convertCodeableConcept(src.getFacilityType()));
    tgt.setPracticeSetting(convertCodeableConcept(src.getPracticeSetting()));
    tgt.setSourcePatientInfo(convertReference(src.getSourcePatientInfo()));
    for (org.hl7.fhir.dstu3.model.context.DocumentReferenceContextRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentReferenceContextRelatedComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextRelatedComponent convertDocumentReferenceContextRelatedComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextRelatedComponent tgt = new org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextRelatedComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setRef(convertReference(src.getRef()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent convertDocumentReferenceContextRelatedComponent(org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextRelatedComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setRef(convertReference(src.getRef()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.EligibilityRequest convertEligibilityRequest(org.hl7.fhir.dstu2.model.EligibilityRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EligibilityRequest tgt = new org.hl7.fhir.dstu3.model.EligibilityRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertType(src.getTarget()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setPriority(convertCoding(src.getPriority()));
    tgt.setEnterer(convertType(src.getEnterer()));
    tgt.setFacility(convertType(src.getFacility()));
    tgt.setPatient(convertType(src.getPatient()));
    tgt.setCoverage(convertType(src.getCoverage()));
    tgt.setBusinessArrangement(src.getBusinessArrangement());
    tgt.setServiced(convertType(src.getServiced()));
    tgt.setBenefitCategory(convertCoding(src.getBenefitCategory()));
    tgt.setBenefitSubCategory(convertCoding(src.getBenefitSubCategory()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EligibilityRequest convertEligibilityRequest(org.hl7.fhir.dstu3.model.EligibilityRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EligibilityRequest tgt = new org.hl7.fhir.dstu2.model.EligibilityRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertType(src.getTarget()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setPriority(convertCoding(src.getPriority()));
    tgt.setEnterer(convertType(src.getEnterer()));
    tgt.setFacility(convertType(src.getFacility()));
    tgt.setPatient(convertType(src.getPatient()));
    tgt.setCoverage(convertType(src.getCoverage()));
    tgt.setBusinessArrangement(src.getBusinessArrangement());
    tgt.setServiced(convertType(src.getServiced()));
    tgt.setBenefitCategory(convertCoding(src.getBenefitCategory()));
    tgt.setBenefitSubCategory(convertCoding(src.getBenefitSubCategory()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.EligibilityResponse convertEligibilityResponse(org.hl7.fhir.dstu2.model.EligibilityResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EligibilityResponse tgt = new org.hl7.fhir.dstu3.model.EligibilityResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequestProvider(convertType(src.getRequestProvider()));
    tgt.setRequestOrganization(convertType(src.getRequestOrganization()));
    tgt.setInforce(src.getInforce());
    tgt.setContract(convertReference(src.getContract()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitsComponent t : src.getBenefitBalance())
      tgt.addBenefitBalance(convertBenefitsComponent(t));
    for (org.hl7.fhir.dstu2.model.EligibilityResponse.ErrorsComponent t : src.getError())
      tgt.addError(convertErrorsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EligibilityResponse convertEligibilityResponse(org.hl7.fhir.dstu3.model.EligibilityResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EligibilityResponse tgt = new org.hl7.fhir.dstu2.model.EligibilityResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequestProvider(convertType(src.getRequestProvider()));
    tgt.setRequestOrganization(convertType(src.getRequestOrganization()));
    tgt.setInforce(src.getInforce());
    tgt.setContract(convertReference(src.getContract()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitsComponent t : src.getBenefitBalance())
      tgt.addBenefitBalance(convertBenefitsComponent(t));
    for (org.hl7.fhir.dstu3.model.EligibilityResponse.ErrorsComponent t : src.getError())
      tgt.addError(convertErrorsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitsComponent convertBenefitsComponent(org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitsComponent tgt = new org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitsComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setSubCategory(convertCoding(src.getSubCategory()));
    tgt.setNetwork(convertCoding(src.getNetwork()));
    tgt.setUnit(convertCoding(src.getUnit()));
    tgt.setTerm(convertCoding(src.getTerm()));
    for (org.hl7.fhir.dstu2.model.benefitBalance.BenefitComponent t : src.getFinancial())
      tgt.addFinancial(convertBenefitComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitsComponent convertBenefitsComponent(org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitsComponent tgt = new org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitsComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setSubCategory(convertCoding(src.getSubCategory()));
    tgt.setNetwork(convertCoding(src.getNetwork()));
    tgt.setUnit(convertCoding(src.getUnit()));
    tgt.setTerm(convertCoding(src.getTerm()));
    for (org.hl7.fhir.dstu3.model.benefitBalance.BenefitComponent t : src.getFinancial())
      tgt.addFinancial(convertBenefitComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitComponent convertBenefitComponent(org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitComponent tgt = new org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setBenefit(convertType(src.getBenefit()));
    tgt.setBenefitUsed(convertType(src.getBenefitUsed()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitComponent convertBenefitComponent(org.hl7.fhir.dstu3.model.EligibilityResponse.BenefitComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitComponent tgt = new org.hl7.fhir.dstu2.model.EligibilityResponse.BenefitComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setBenefit(convertType(src.getBenefit()));
    tgt.setBenefitUsed(convertType(src.getBenefitUsed()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.EligibilityResponse.ErrorsComponent convertErrorsComponent(org.hl7.fhir.dstu2.model.EligibilityResponse.ErrorsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EligibilityResponse.ErrorsComponent tgt = new org.hl7.fhir.dstu3.model.EligibilityResponse.ErrorsComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCoding(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EligibilityResponse.ErrorsComponent convertErrorsComponent(org.hl7.fhir.dstu3.model.EligibilityResponse.ErrorsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EligibilityResponse.ErrorsComponent tgt = new org.hl7.fhir.dstu2.model.EligibilityResponse.ErrorsComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCoding(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Encounter convertEncounter(org.hl7.fhir.dstu2.model.Encounter src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Encounter tgt = new org.hl7.fhir.dstu3.model.Encounter();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertEncounterState(src.getStatus()));
    for (org.hl7.fhir.dstu2.model.Encounter.EncounterStatusHistoryComponent t : src.getStatusHistory())
      tgt.addStatusHistory(convertEncounterStatusHistoryComponent(t));
    tgt.setClass(convertEncounterClass(src.getClass()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    tgt.setPatient(convertReference(src.getPatient()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getEpisodeOfCare())
      tgt.addEpisodeOfCare(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getIncomingReferral())
      tgt.addIncomingReferral(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Encounter.EncounterParticipantComponent t : src.getParticipant())
      tgt.addParticipant(convertEncounterParticipantComponent(t));
    tgt.setAppointment(convertReference(src.getAppointment()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setLength(convertDuration(src.getLength()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getIndication())
      tgt.addIndication(convertReference(t));
    tgt.setHospitalization(convertEncounterHospitalizationComponent(src.getHospitalization()));
    for (org.hl7.fhir.dstu2.model.Encounter.EncounterLocationComponent t : src.getLocation())
      tgt.addLocation(convertEncounterLocationComponent(t));
    tgt.setServiceProvider(convertReference(src.getServiceProvider()));
    tgt.setPartOf(convertReference(src.getPartOf()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Encounter convertEncounter(org.hl7.fhir.dstu3.model.Encounter src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Encounter tgt = new org.hl7.fhir.dstu2.model.Encounter();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertEncounterState(src.getStatus()));
    for (org.hl7.fhir.dstu3.model.Encounter.EncounterStatusHistoryComponent t : src.getStatusHistory())
      tgt.addStatusHistory(convertEncounterStatusHistoryComponent(t));
    tgt.setClass(convertEncounterClass(src.getClass()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    tgt.setPatient(convertReference(src.getPatient()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getEpisodeOfCare())
      tgt.addEpisodeOfCare(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getIncomingReferral())
      tgt.addIncomingReferral(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent t : src.getParticipant())
      tgt.addParticipant(convertEncounterParticipantComponent(t));
    tgt.setAppointment(convertReference(src.getAppointment()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setLength(convertDuration(src.getLength()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getIndication())
      tgt.addIndication(convertReference(t));
    tgt.setHospitalization(convertEncounterHospitalizationComponent(src.getHospitalization()));
    for (org.hl7.fhir.dstu3.model.Encounter.EncounterLocationComponent t : src.getLocation())
      tgt.addLocation(convertEncounterLocationComponent(t));
    tgt.setServiceProvider(convertReference(src.getServiceProvider()));
    tgt.setPartOf(convertReference(src.getPartOf()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Encounter.EncounterState convertEncounterState(org.hl7.fhir.dstu2.model.Encounter.EncounterState src) {
    if (src == null)
      return null;
    switch (src) {
    case PLANNED: return org.hl7.fhir.dstu3.model.Encounter.EncounterState.PLANNED;
    case ARRIVED: return org.hl7.fhir.dstu3.model.Encounter.EncounterState.ARRIVED;
    case INPROGRESS: return org.hl7.fhir.dstu3.model.Encounter.EncounterState.INPROGRESS;
    case ONLEAVE: return org.hl7.fhir.dstu3.model.Encounter.EncounterState.ONLEAVE;
    case FINISHED: return org.hl7.fhir.dstu3.model.Encounter.EncounterState.FINISHED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.Encounter.EncounterState.CANCELLED;
    default: return org.hl7.fhir.dstu3.model.Encounter.EncounterState.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Encounter.EncounterState convertEncounterState(org.hl7.fhir.dstu3.model.Encounter.EncounterState src) {
    if (src == null)
      return null;
    switch (src) {
    case PLANNED: return org.hl7.fhir.dstu2.model.Encounter.EncounterState.PLANNED;
    case ARRIVED: return org.hl7.fhir.dstu2.model.Encounter.EncounterState.ARRIVED;
    case INPROGRESS: return org.hl7.fhir.dstu2.model.Encounter.EncounterState.INPROGRESS;
    case ONLEAVE: return org.hl7.fhir.dstu2.model.Encounter.EncounterState.ONLEAVE;
    case FINISHED: return org.hl7.fhir.dstu2.model.Encounter.EncounterState.FINISHED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.Encounter.EncounterState.CANCELLED;
    default: return org.hl7.fhir.dstu2.model.Encounter.EncounterState.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Encounter.EncounterClass convertEncounterClass(org.hl7.fhir.dstu2.model.Encounter.EncounterClass src) {
    if (src == null)
      return null;
    switch (src) {
    case INPATIENT: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.INPATIENT;
    case OUTPATIENT: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.OUTPATIENT;
    case AMBULATORY: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.AMBULATORY;
    case EMERGENCY: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.EMERGENCY;
    case HOME: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.HOME;
    case FIELD: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.FIELD;
    case DAYTIME: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.DAYTIME;
    case VIRTUAL: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.VIRTUAL;
    case OTHER: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.OTHER;
    default: return org.hl7.fhir.dstu3.model.Encounter.EncounterClass.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Encounter.EncounterClass convertEncounterClass(org.hl7.fhir.dstu3.model.Encounter.EncounterClass src) {
    if (src == null)
      return null;
    switch (src) {
    case INPATIENT: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.INPATIENT;
    case OUTPATIENT: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.OUTPATIENT;
    case AMBULATORY: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.AMBULATORY;
    case EMERGENCY: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.EMERGENCY;
    case HOME: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.HOME;
    case FIELD: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.FIELD;
    case DAYTIME: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.DAYTIME;
    case VIRTUAL: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.VIRTUAL;
    case OTHER: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.OTHER;
    default: return org.hl7.fhir.dstu2.model.Encounter.EncounterClass.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Encounter.EncounterStatusHistoryComponent convertEncounterStatusHistoryComponent(org.hl7.fhir.dstu2.model.Encounter.EncounterStatusHistoryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Encounter.EncounterStatusHistoryComponent tgt = new org.hl7.fhir.dstu3.model.Encounter.EncounterStatusHistoryComponent();
    copyElement(src, tgt);
    tgt.setStatus(convertEncounterState(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Encounter.EncounterStatusHistoryComponent convertEncounterStatusHistoryComponent(org.hl7.fhir.dstu3.model.Encounter.EncounterStatusHistoryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Encounter.EncounterStatusHistoryComponent tgt = new org.hl7.fhir.dstu2.model.Encounter.EncounterStatusHistoryComponent();
    copyElement(src, tgt);
    tgt.setStatus(convertEncounterState(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent convertEncounterParticipantComponent(org.hl7.fhir.dstu2.model.Encounter.EncounterParticipantComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent tgt = new org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setIndividual(convertReference(src.getIndividual()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Encounter.EncounterParticipantComponent convertEncounterParticipantComponent(org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Encounter.EncounterParticipantComponent tgt = new org.hl7.fhir.dstu2.model.Encounter.EncounterParticipantComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setIndividual(convertReference(src.getIndividual()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent convertEncounterHospitalizationComponent(org.hl7.fhir.dstu2.model.Encounter.EncounterHospitalizationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent tgt = new org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent();
    copyElement(src, tgt);
    tgt.setPreAdmissionIdentifier(convertIdentifier(src.getPreAdmissionIdentifier()));
    tgt.setOrigin(convertReference(src.getOrigin()));
    tgt.setAdmitSource(convertCodeableConcept(src.getAdmitSource()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAdmittingDiagnosis())
      tgt.addAdmittingDiagnosis(convertReference(t));
    tgt.setReAdmission(convertCodeableConcept(src.getReAdmission()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getDietPreference())
      tgt.addDietPreference(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSpecialCourtesy())
      tgt.addSpecialCourtesy(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSpecialArrangement())
      tgt.addSpecialArrangement(convertCodeableConcept(t));
    tgt.setDestination(convertReference(src.getDestination()));
    tgt.setDischargeDisposition(convertCodeableConcept(src.getDischargeDisposition()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getDischargeDiagnosis())
      tgt.addDischargeDiagnosis(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Encounter.EncounterHospitalizationComponent convertEncounterHospitalizationComponent(org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Encounter.EncounterHospitalizationComponent tgt = new org.hl7.fhir.dstu2.model.Encounter.EncounterHospitalizationComponent();
    copyElement(src, tgt);
    tgt.setPreAdmissionIdentifier(convertIdentifier(src.getPreAdmissionIdentifier()));
    tgt.setOrigin(convertReference(src.getOrigin()));
    tgt.setAdmitSource(convertCodeableConcept(src.getAdmitSource()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAdmittingDiagnosis())
      tgt.addAdmittingDiagnosis(convertReference(t));
    tgt.setReAdmission(convertCodeableConcept(src.getReAdmission()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getDietPreference())
      tgt.addDietPreference(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSpecialCourtesy())
      tgt.addSpecialCourtesy(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSpecialArrangement())
      tgt.addSpecialArrangement(convertCodeableConcept(t));
    tgt.setDestination(convertReference(src.getDestination()));
    tgt.setDischargeDisposition(convertCodeableConcept(src.getDischargeDisposition()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getDischargeDiagnosis())
      tgt.addDischargeDiagnosis(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Encounter.EncounterLocationComponent convertEncounterLocationComponent(org.hl7.fhir.dstu2.model.Encounter.EncounterLocationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Encounter.EncounterLocationComponent tgt = new org.hl7.fhir.dstu3.model.Encounter.EncounterLocationComponent();
    copyElement(src, tgt);
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setStatus(convertEncounterLocationStatus(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Encounter.EncounterLocationComponent convertEncounterLocationComponent(org.hl7.fhir.dstu3.model.Encounter.EncounterLocationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Encounter.EncounterLocationComponent tgt = new org.hl7.fhir.dstu2.model.Encounter.EncounterLocationComponent();
    copyElement(src, tgt);
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setStatus(convertEncounterLocationStatus(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Encounter.EncounterLocationStatus convertEncounterLocationStatus(org.hl7.fhir.dstu2.model.Encounter.EncounterLocationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PLANNED: return org.hl7.fhir.dstu3.model.Encounter.EncounterLocationStatus.PLANNED;
    case ACTIVE: return org.hl7.fhir.dstu3.model.Encounter.EncounterLocationStatus.ACTIVE;
    case RESERVED: return org.hl7.fhir.dstu3.model.Encounter.EncounterLocationStatus.RESERVED;
    case COMPLETED: return org.hl7.fhir.dstu3.model.Encounter.EncounterLocationStatus.COMPLETED;
    default: return org.hl7.fhir.dstu3.model.Encounter.EncounterLocationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Encounter.EncounterLocationStatus convertEncounterLocationStatus(org.hl7.fhir.dstu3.model.Encounter.EncounterLocationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PLANNED: return org.hl7.fhir.dstu2.model.Encounter.EncounterLocationStatus.PLANNED;
    case ACTIVE: return org.hl7.fhir.dstu2.model.Encounter.EncounterLocationStatus.ACTIVE;
    case RESERVED: return org.hl7.fhir.dstu2.model.Encounter.EncounterLocationStatus.RESERVED;
    case COMPLETED: return org.hl7.fhir.dstu2.model.Encounter.EncounterLocationStatus.COMPLETED;
    default: return org.hl7.fhir.dstu2.model.Encounter.EncounterLocationStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.EnrollmentRequest convertEnrollmentRequest(org.hl7.fhir.dstu2.model.EnrollmentRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EnrollmentRequest tgt = new org.hl7.fhir.dstu3.model.EnrollmentRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setProvider(convertReference(src.getProvider()));
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setCoverage(convertReference(src.getCoverage()));
    tgt.setRelationship(convertCoding(src.getRelationship()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EnrollmentRequest convertEnrollmentRequest(org.hl7.fhir.dstu3.model.EnrollmentRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EnrollmentRequest tgt = new org.hl7.fhir.dstu2.model.EnrollmentRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setProvider(convertReference(src.getProvider()));
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setCoverage(convertReference(src.getCoverage()));
    tgt.setRelationship(convertCoding(src.getRelationship()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.EnrollmentResponse convertEnrollmentResponse(org.hl7.fhir.dstu2.model.EnrollmentResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EnrollmentResponse tgt = new org.hl7.fhir.dstu3.model.EnrollmentResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setRequestProvider(convertReference(src.getRequestProvider()));
    tgt.setRequestOrganization(convertReference(src.getRequestOrganization()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EnrollmentResponse convertEnrollmentResponse(org.hl7.fhir.dstu3.model.EnrollmentResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EnrollmentResponse tgt = new org.hl7.fhir.dstu2.model.EnrollmentResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setRequestProvider(convertReference(src.getRequestProvider()));
    tgt.setRequestOrganization(convertReference(src.getRequestOrganization()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.EpisodeOfCare convertEpisodeOfCare(org.hl7.fhir.dstu2.model.EpisodeOfCare src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EpisodeOfCare tgt = new org.hl7.fhir.dstu3.model.EpisodeOfCare();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertEpisodeOfCareStatus(src.getStatus()));
    for (org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent t : src.getStatusHistory())
      tgt.addStatusHistory(convertEpisodeOfCareStatusHistoryComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getCondition())
      tgt.addCondition(convertReference(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getReferralRequest())
      tgt.addReferralRequest(convertReference(t));
    tgt.setCareManager(convertReference(src.getCareManager()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getTeam())
      tgt.addTeam(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EpisodeOfCare convertEpisodeOfCare(org.hl7.fhir.dstu3.model.EpisodeOfCare src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EpisodeOfCare tgt = new org.hl7.fhir.dstu2.model.EpisodeOfCare();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertEpisodeOfCareStatus(src.getStatus()));
    for (org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent t : src.getStatusHistory())
      tgt.addStatusHistory(convertEpisodeOfCareStatusHistoryComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getCondition())
      tgt.addCondition(convertReference(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getReferralRequest())
      tgt.addReferralRequest(convertReference(t));
    tgt.setCareManager(convertReference(src.getCareManager()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getTeam())
      tgt.addTeam(convertReference(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus convertEpisodeOfCareStatus(org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PLANNED: return org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus.PLANNED;
    case WAITLIST: return org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus.WAITLIST;
    case ACTIVE: return org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus.ACTIVE;
    case ONHOLD: return org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus.ONHOLD;
    case FINISHED: return org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus.FINISHED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus.CANCELLED;
    default: return org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus convertEpisodeOfCareStatus(org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PLANNED: return org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus.PLANNED;
    case WAITLIST: return org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus.WAITLIST;
    case ACTIVE: return org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus.ACTIVE;
    case ONHOLD: return org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus.ONHOLD;
    case FINISHED: return org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus.FINISHED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus.CANCELLED;
    default: return org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent convertEpisodeOfCareStatusHistoryComponent(org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent tgt = new org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent();
    copyElement(src, tgt);
    tgt.setStatus(convertEpisodeOfCareStatus(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent convertEpisodeOfCareStatusHistoryComponent(org.hl7.fhir.dstu3.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent tgt = new org.hl7.fhir.dstu2.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent();
    copyElement(src, tgt);
    tgt.setStatus(convertEpisodeOfCareStatus(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit convertExplanationOfBenefit(org.hl7.fhir.dstu2.model.ExplanationOfBenefit src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setClaim(convertType(src.getClaim()));
    tgt.setClaimResponse(convertType(src.getClaimResponse()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getSubType())
      tgt.addSubType(convertCoding(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setBillablePeriod(convertPeriod(src.getBillablePeriod()));
    tgt.setDisposition(src.getDisposition());
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setFacility(convertType(src.getFacility()));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.RelatedClaimsComponent t : src.getRelated())
      tgt.addRelated(convertRelatedClaimsComponent(t));
    tgt.setPrescription(convertType(src.getPrescription()));
    tgt.setOriginalPrescription(convertType(src.getOriginalPrescription()));
    tgt.setPayee(convertPayeeComponent(src.getPayee()));
    tgt.setReferral(convertType(src.getReferral()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getOccurrenceCode())
      tgt.addOccurrenceCode(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getOccurenceSpanCode())
      tgt.addOccurenceSpanCode(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getValueCode())
      tgt.addValueCode(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DiagnosisComponent t : src.getDiagnosis())
      tgt.addDiagnosis(convertDiagnosisComponent(t));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProcedureComponent t : src.getProcedure())
      tgt.addProcedure(convertProcedureComponent(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getSpecialCondition())
      tgt.addSpecialCondition(convertCoding(t));
    tgt.setPatient(convertType(src.getPatient()));
    tgt.setPrecedence(src.getPrecedence());
    tgt.setCoverage(convertCoverageComponent(src.getCoverage()));
    tgt.setAccidentDate(src.getAccidentDate());
    tgt.setAccidentType(convertCoding(src.getAccidentType()));
    tgt.setAccidentLocation(convertType(src.getAccidentLocation()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getInterventionException())
      tgt.addInterventionException(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.OnsetComponent t : src.getOnset())
      tgt.addOnset(convertOnsetComponent(t));
    tgt.setEmploymentImpacted(convertPeriod(src.getEmploymentImpacted()));
    tgt.setHospitalization(convertPeriod(src.getHospitalization()));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemComponent t : src.getAddItem())
      tgt.addAddItem(convertAddedItemComponent(t));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.MissingTeethComponent t : src.getMissingTeeth())
      tgt.addMissingTeeth(convertMissingTeethComponent(t));
    tgt.setTotalCost(convertMoney(src.getTotalCost()));
    tgt.setUnallocDeductable(convertMoney(src.getUnallocDeductable()));
    tgt.setTotalBenefit(convertMoney(src.getTotalBenefit()));
    tgt.setPaymentAdjustment(convertMoney(src.getPaymentAdjustment()));
    tgt.setPaymentAdjustmentReason(convertCoding(src.getPaymentAdjustmentReason()));
    tgt.setPaymentDate(src.getPaymentDate());
    tgt.setPaymentAmount(convertMoney(src.getPaymentAmount()));
    tgt.setPaymentRef(convertIdentifier(src.getPaymentRef()));
    tgt.setReserved(convertCoding(src.getReserved()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.NotesComponent t : src.getNote())
      tgt.addNote(convertNotesComponent(t));
    for (org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitBalanceComponent t : src.getBenefitBalance())
      tgt.addBenefitBalance(convertBenefitBalanceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit convertExplanationOfBenefit(org.hl7.fhir.dstu3.model.ExplanationOfBenefit src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setClaim(convertType(src.getClaim()));
    tgt.setClaimResponse(convertType(src.getClaimResponse()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSubType())
      tgt.addSubType(convertCoding(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setBillablePeriod(convertPeriod(src.getBillablePeriod()));
    tgt.setDisposition(src.getDisposition());
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setFacility(convertType(src.getFacility()));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.RelatedClaimsComponent t : src.getRelated())
      tgt.addRelated(convertRelatedClaimsComponent(t));
    tgt.setPrescription(convertType(src.getPrescription()));
    tgt.setOriginalPrescription(convertType(src.getOriginalPrescription()));
    tgt.setPayee(convertPayeeComponent(src.getPayee()));
    tgt.setReferral(convertType(src.getReferral()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getOccurrenceCode())
      tgt.addOccurrenceCode(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getOccurenceSpanCode())
      tgt.addOccurenceSpanCode(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getValueCode())
      tgt.addValueCode(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DiagnosisComponent t : src.getDiagnosis())
      tgt.addDiagnosis(convertDiagnosisComponent(t));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProcedureComponent t : src.getProcedure())
      tgt.addProcedure(convertProcedureComponent(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSpecialCondition())
      tgt.addSpecialCondition(convertCoding(t));
    tgt.setPatient(convertType(src.getPatient()));
    tgt.setPrecedence(src.getPrecedence());
    tgt.setCoverage(convertCoverageComponent(src.getCoverage()));
    tgt.setAccidentDate(src.getAccidentDate());
    tgt.setAccidentType(convertCoding(src.getAccidentType()));
    tgt.setAccidentLocation(convertType(src.getAccidentLocation()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getInterventionException())
      tgt.addInterventionException(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.OnsetComponent t : src.getOnset())
      tgt.addOnset(convertOnsetComponent(t));
    tgt.setEmploymentImpacted(convertPeriod(src.getEmploymentImpacted()));
    tgt.setHospitalization(convertPeriod(src.getHospitalization()));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemComponent t : src.getAddItem())
      tgt.addAddItem(convertAddedItemComponent(t));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.MissingTeethComponent t : src.getMissingTeeth())
      tgt.addMissingTeeth(convertMissingTeethComponent(t));
    tgt.setTotalCost(convertMoney(src.getTotalCost()));
    tgt.setUnallocDeductable(convertMoney(src.getUnallocDeductable()));
    tgt.setTotalBenefit(convertMoney(src.getTotalBenefit()));
    tgt.setPaymentAdjustment(convertMoney(src.getPaymentAdjustment()));
    tgt.setPaymentAdjustmentReason(convertCoding(src.getPaymentAdjustmentReason()));
    tgt.setPaymentDate(src.getPaymentDate());
    tgt.setPaymentAmount(convertMoney(src.getPaymentAmount()));
    tgt.setPaymentRef(convertIdentifier(src.getPaymentRef()));
    tgt.setReserved(convertCoding(src.getReserved()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.NotesComponent t : src.getNote())
      tgt.addNote(convertNotesComponent(t));
    for (org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitBalanceComponent t : src.getBenefitBalance())
      tgt.addBenefitBalance(convertBenefitBalanceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.RelatedClaimsComponent convertRelatedClaimsComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.RelatedClaimsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.RelatedClaimsComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.RelatedClaimsComponent();
    copyElement(src, tgt);
    tgt.setClaim(convertType(src.getClaim()));
    tgt.setRelationship(convertCoding(src.getRelationship()));
    tgt.setReference(convertIdentifier(src.getReference()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.RelatedClaimsComponent convertRelatedClaimsComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.RelatedClaimsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.RelatedClaimsComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.RelatedClaimsComponent();
    copyElement(src, tgt);
    tgt.setClaim(convertType(src.getClaim()));
    tgt.setRelationship(convertCoding(src.getRelationship()));
    tgt.setReference(convertIdentifier(src.getReference()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.PayeeComponent convertPayeeComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.PayeeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.PayeeComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.PayeeComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setParty(convertType(src.getParty()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.PayeeComponent convertPayeeComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.PayeeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.PayeeComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.PayeeComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setParty(convertType(src.getParty()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DiagnosisComponent convertDiagnosisComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DiagnosisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DiagnosisComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DiagnosisComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setDiagnosis(convertCoding(src.getDiagnosis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DiagnosisComponent convertDiagnosisComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DiagnosisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DiagnosisComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DiagnosisComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setDiagnosis(convertCoding(src.getDiagnosis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProcedureComponent convertProcedureComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProcedureComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProcedureComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProcedureComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setDate(src.getDate());
    tgt.setProcedure(convertType(src.getProcedure()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProcedureComponent convertProcedureComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProcedureComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProcedureComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProcedureComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setDate(src.getDate());
    tgt.setProcedure(convertType(src.getProcedure()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.CoverageComponent convertCoverageComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.CoverageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.CoverageComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.CoverageComponent();
    copyElement(src, tgt);
    tgt.setCoverage(convertType(src.getCoverage()));
    for (org.hl7.fhir.dstu2.model.StringType t : src.getPreAuthRef())
      tgt.addPreAuthRef(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.CoverageComponent convertCoverageComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.CoverageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.CoverageComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.CoverageComponent();
    copyElement(src, tgt);
    tgt.setCoverage(convertType(src.getCoverage()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getPreAuthRef())
      tgt.addPreAuthRef(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.OnsetComponent convertOnsetComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.OnsetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.OnsetComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.OnsetComponent();
    copyElement(src, tgt);
    tgt.setTime(convertType(src.getTime()));
    tgt.setType(convertCoding(src.getType()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.OnsetComponent convertOnsetComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.OnsetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.OnsetComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.OnsetComponent();
    copyElement(src, tgt);
    tgt.setTime(convertType(src.getTime()));
    tgt.setType(convertCoding(src.getType()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemsComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setSupervisor(convertType(src.getSupervisor()));
    tgt.setProviderQualification(convertCoding(src.getProviderQualification()));
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getDiagnosisLinkId())
      tgt.addDiagnosisLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getServiceModifier())
      tgt.addServiceModifier(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getModifier())
      tgt.addModifier(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getProgramCode())
      tgt.addProgramCode(convertCoding(t));
    tgt.setServiced(convertType(src.getServiced()));
    tgt.setPlace(convertCoding(src.getPlace()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getUdi())
      tgt.addUdi(convertReference(t));
    tgt.setBodySite(convertCoding(src.getBodySite()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getSubSite())
      tgt.addSubSite(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getNoteNumber())
      tgt.addNoteNumber(t.getValue());
    for (org.hl7.fhir.dstu2.model.item.ItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu2.model.item.DetailComponent t : src.getDetail())
      tgt.addDetail(convertDetailComponent(t));
    tgt.setProsthesis(convertProsthesisComponent(src.getProsthesis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemsComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setSupervisor(convertType(src.getSupervisor()));
    tgt.setProviderQualification(convertCoding(src.getProviderQualification()));
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getDiagnosisLinkId())
      tgt.addDiagnosisLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getServiceModifier())
      tgt.addServiceModifier(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getModifier())
      tgt.addModifier(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getProgramCode())
      tgt.addProgramCode(convertCoding(t));
    tgt.setServiced(convertType(src.getServiced()));
    tgt.setPlace(convertCoding(src.getPlace()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getUdi())
      tgt.addUdi(convertReference(t));
    tgt.setBodySite(convertCoding(src.getBodySite()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSubSite())
      tgt.addSubSite(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getNoteNumber())
      tgt.addNoteNumber(t.getValue());
    for (org.hl7.fhir.dstu3.model.item.ItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu3.model.item.DetailComponent t : src.getDetail())
      tgt.addDetail(convertDetailComponent(t));
    tgt.setProsthesis(convertProsthesisComponent(src.getProsthesis()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemAdjudicationComponent convertItemAdjudicationComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemAdjudicationComponent convertItemAdjudicationComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailComponent convertDetailComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getProgramCode())
      tgt.addProgramCode(convertCoding(t));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getUdi())
      tgt.addUdi(convertReference(t));
    for (org.hl7.fhir.dstu2.model.detail.DetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertDetailAdjudicationComponent(t));
    for (org.hl7.fhir.dstu2.model.detail.SubDetailComponent t : src.getSubDetail())
      tgt.addSubDetail(convertSubDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailComponent convertDetailComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getProgramCode())
      tgt.addProgramCode(convertCoding(t));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getUdi())
      tgt.addUdi(convertReference(t));
    for (org.hl7.fhir.dstu3.model.detail.DetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertDetailAdjudicationComponent(t));
    for (org.hl7.fhir.dstu3.model.detail.SubDetailComponent t : src.getSubDetail())
      tgt.addSubDetail(convertSubDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailAdjudicationComponent convertDetailAdjudicationComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailAdjudicationComponent convertDetailAdjudicationComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.DetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.DetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailComponent convertSubDetailComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getProgramCode())
      tgt.addProgramCode(convertCoding(t));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getUdi())
      tgt.addUdi(convertReference(t));
    for (org.hl7.fhir.dstu2.model.subDetail.SubDetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertSubDetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailComponent convertSubDetailComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailComponent();
    copyElement(src, tgt);
    tgt.setSequence(src.getSequence());
    tgt.setType(convertCoding(src.getType()));
    tgt.setService(convertCoding(src.getService()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getProgramCode())
      tgt.addProgramCode(convertCoding(t));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setUnitPrice(convertMoney(src.getUnitPrice()));
    tgt.setFactor(src.getFactor());
    tgt.setPoints(src.getPoints());
    tgt.setNet(convertMoney(src.getNet()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getUdi())
      tgt.addUdi(convertReference(t));
    for (org.hl7.fhir.dstu3.model.subDetail.SubDetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertSubDetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailAdjudicationComponent convertSubDetailAdjudicationComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailAdjudicationComponent convertSubDetailAdjudicationComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.SubDetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.SubDetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProsthesisComponent convertProsthesisComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProsthesisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProsthesisComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProsthesisComponent();
    copyElement(src, tgt);
    tgt.setInitial(src.getInitial());
    tgt.setPriorDate(src.getPriorDate());
    tgt.setPriorMaterial(convertCoding(src.getPriorMaterial()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProsthesisComponent convertProsthesisComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.ProsthesisComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProsthesisComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.ProsthesisComponent();
    copyElement(src, tgt);
    tgt.setInitial(src.getInitial());
    tgt.setPriorDate(src.getPriorDate());
    tgt.setPriorMaterial(convertCoding(src.getPriorMaterial()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemComponent convertAddedItemComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getSequenceLinkId())
      tgt.addSequenceLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu2.model.PositiveIntType t : src.getNoteNumberLinkId())
      tgt.addNoteNumberLinkId(t.getValue());
    for (org.hl7.fhir.dstu2.model.addItem.AddedItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu2.model.addItem.AddedItemsDetailComponent t : src.getDetail())
      tgt.addDetail(convertAddedItemsDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemComponent convertAddedItemComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getSequenceLinkId())
      tgt.addSequenceLinkId(t.getValue());
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu3.model.PositiveIntType t : src.getNoteNumberLinkId())
      tgt.addNoteNumberLinkId(t.getValue());
    for (org.hl7.fhir.dstu3.model.addItem.AddedItemAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemAdjudicationComponent(t));
    for (org.hl7.fhir.dstu3.model.addItem.AddedItemsDetailComponent t : src.getDetail())
      tgt.addDetail(convertAddedItemsDetailComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemAdjudicationComponent convertAddedItemAdjudicationComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemAdjudicationComponent convertAddedItemAdjudicationComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemsDetailComponent convertAddedItemsDetailComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemsDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemsDetailComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemsDetailComponent();
    copyElement(src, tgt);
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu2.model.detail.AddedItemDetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemDetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemsDetailComponent convertAddedItemsDetailComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemsDetailComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemsDetailComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemsDetailComponent();
    copyElement(src, tgt);
    tgt.setService(convertCoding(src.getService()));
    tgt.setFee(convertMoney(src.getFee()));
    for (org.hl7.fhir.dstu3.model.detail.AddedItemDetailAdjudicationComponent t : src.getAdjudication())
      tgt.addAdjudication(convertAddedItemDetailAdjudicationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent convertAddedItemDetailAdjudicationComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent convertAddedItemDetailAdjudicationComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.AddedItemDetailAdjudicationComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setAmount(convertMoney(src.getAmount()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.MissingTeethComponent convertMissingTeethComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.MissingTeethComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.MissingTeethComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.MissingTeethComponent();
    copyElement(src, tgt);
    tgt.setTooth(convertCoding(src.getTooth()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setExtractionDate(src.getExtractionDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.MissingTeethComponent convertMissingTeethComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.MissingTeethComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.MissingTeethComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.MissingTeethComponent();
    copyElement(src, tgt);
    tgt.setTooth(convertCoding(src.getTooth()));
    tgt.setReason(convertCoding(src.getReason()));
    tgt.setExtractionDate(src.getExtractionDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.NotesComponent convertNotesComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.NotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.NotesComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.NotesComponent();
    copyElement(src, tgt);
    tgt.setNumber(src.getNumber());
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.NotesComponent convertNotesComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.NotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.NotesComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.NotesComponent();
    copyElement(src, tgt);
    tgt.setNumber(src.getNumber());
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitBalanceComponent convertBenefitBalanceComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitBalanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitBalanceComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitBalanceComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setSubCategory(convertCoding(src.getSubCategory()));
    tgt.setNetwork(convertCoding(src.getNetwork()));
    tgt.setUnit(convertCoding(src.getUnit()));
    tgt.setTerm(convertCoding(src.getTerm()));
    for (org.hl7.fhir.dstu2.model.benefitBalance.BenefitComponent t : src.getFinancial())
      tgt.addFinancial(convertBenefitComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitBalanceComponent convertBenefitBalanceComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitBalanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitBalanceComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitBalanceComponent();
    copyElement(src, tgt);
    tgt.setCategory(convertCoding(src.getCategory()));
    tgt.setSubCategory(convertCoding(src.getSubCategory()));
    tgt.setNetwork(convertCoding(src.getNetwork()));
    tgt.setUnit(convertCoding(src.getUnit()));
    tgt.setTerm(convertCoding(src.getTerm()));
    for (org.hl7.fhir.dstu3.model.benefitBalance.BenefitComponent t : src.getFinancial())
      tgt.addFinancial(convertBenefitComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitComponent convertBenefitComponent(org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitComponent tgt = new org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setBenefit(convertType(src.getBenefit()));
    tgt.setBenefitUsed(convertType(src.getBenefitUsed()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitComponent convertBenefitComponent(org.hl7.fhir.dstu3.model.ExplanationOfBenefit.BenefitComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitComponent tgt = new org.hl7.fhir.dstu2.model.ExplanationOfBenefit.BenefitComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setBenefit(convertType(src.getBenefit()));
    tgt.setBenefitUsed(convertType(src.getBenefitUsed()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.FamilyMemberHistory convertFamilyMemberHistory(org.hl7.fhir.dstu2.model.FamilyMemberHistory src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.FamilyMemberHistory tgt = new org.hl7.fhir.dstu3.model.FamilyMemberHistory();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setDate(src.getDate());
    tgt.setStatus(convertFamilyHistoryStatus(src.getStatus()));
    tgt.setName(src.getName());
    tgt.setRelationship(convertCodeableConcept(src.getRelationship()));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBorn(convertType(src.getBorn()));
    tgt.setAge(convertType(src.getAge()));
    tgt.setDeceased(convertType(src.getDeceased()));
    tgt.setNote(convertAnnotation(src.getNote()));
    for (org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent t : src.getCondition())
      tgt.addCondition(convertFamilyMemberHistoryConditionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.FamilyMemberHistory convertFamilyMemberHistory(org.hl7.fhir.dstu3.model.FamilyMemberHistory src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.FamilyMemberHistory tgt = new org.hl7.fhir.dstu2.model.FamilyMemberHistory();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setDate(src.getDate());
    tgt.setStatus(convertFamilyHistoryStatus(src.getStatus()));
    tgt.setName(src.getName());
    tgt.setRelationship(convertCodeableConcept(src.getRelationship()));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBorn(convertType(src.getBorn()));
    tgt.setAge(convertType(src.getAge()));
    tgt.setDeceased(convertType(src.getDeceased()));
    tgt.setNote(convertAnnotation(src.getNote()));
    for (org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent t : src.getCondition())
      tgt.addCondition(convertFamilyMemberHistoryConditionComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyHistoryStatus convertFamilyHistoryStatus(org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyHistoryStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PARTIAL: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyHistoryStatus.PARTIAL;
    case COMPLETED: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyHistoryStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyHistoryStatus.ENTEREDINERROR;
    case HEALTHUNKNOWN: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyHistoryStatus.HEALTHUNKNOWN;
    default: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyHistoryStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyHistoryStatus convertFamilyHistoryStatus(org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyHistoryStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PARTIAL: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyHistoryStatus.PARTIAL;
    case COMPLETED: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyHistoryStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyHistoryStatus.ENTEREDINERROR;
    case HEALTHUNKNOWN: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyHistoryStatus.HEALTHUNKNOWN;
    default: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyHistoryStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.FamilyMemberHistory.AdministrativeGender convertAdministrativeGender(org.hl7.fhir.dstu2.model.FamilyMemberHistory.AdministrativeGender src) {
    if (src == null)
      return null;
    switch (src) {
    case MALE: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.AdministrativeGender.MALE;
    case FEMALE: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.AdministrativeGender.FEMALE;
    case OTHER: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.AdministrativeGender.OTHER;
    case UNKNOWN: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.AdministrativeGender.UNKNOWN;
    default: return org.hl7.fhir.dstu3.model.FamilyMemberHistory.AdministrativeGender.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.FamilyMemberHistory.AdministrativeGender convertAdministrativeGender(org.hl7.fhir.dstu3.model.FamilyMemberHistory.AdministrativeGender src) {
    if (src == null)
      return null;
    switch (src) {
    case MALE: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.AdministrativeGender.MALE;
    case FEMALE: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.AdministrativeGender.FEMALE;
    case OTHER: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.AdministrativeGender.OTHER;
    case UNKNOWN: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.AdministrativeGender.UNKNOWN;
    default: return org.hl7.fhir.dstu2.model.FamilyMemberHistory.AdministrativeGender.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent convertFamilyMemberHistoryConditionComponent(org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent tgt = new org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setOutcome(convertCodeableConcept(src.getOutcome()));
    tgt.setOnset(convertType(src.getOnset()));
    tgt.setNote(convertAnnotation(src.getNote()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent convertFamilyMemberHistoryConditionComponent(org.hl7.fhir.dstu3.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent tgt = new org.hl7.fhir.dstu2.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setOutcome(convertCodeableConcept(src.getOutcome()));
    tgt.setOnset(convertType(src.getOnset()));
    tgt.setNote(convertAnnotation(src.getNote()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Flag convertFlag(org.hl7.fhir.dstu2.model.Flag src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Flag tgt = new org.hl7.fhir.dstu3.model.Flag();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setStatus(convertFlagStatus(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Flag convertFlag(org.hl7.fhir.dstu3.model.Flag src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Flag tgt = new org.hl7.fhir.dstu2.model.Flag();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setStatus(convertFlagStatus(src.getStatus()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Flag.FlagStatus convertFlagStatus(org.hl7.fhir.dstu2.model.Flag.FlagStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu3.model.Flag.FlagStatus.ACTIVE;
    case INACTIVE: return org.hl7.fhir.dstu3.model.Flag.FlagStatus.INACTIVE;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Flag.FlagStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.Flag.FlagStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Flag.FlagStatus convertFlagStatus(org.hl7.fhir.dstu3.model.Flag.FlagStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu2.model.Flag.FlagStatus.ACTIVE;
    case INACTIVE: return org.hl7.fhir.dstu2.model.Flag.FlagStatus.INACTIVE;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Flag.FlagStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.Flag.FlagStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Goal convertGoal(org.hl7.fhir.dstu2.model.Goal src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Goal tgt = new org.hl7.fhir.dstu3.model.Goal();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setStart(convertType(src.getStart()));
    tgt.setTarget(convertType(src.getTarget()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    tgt.setStatus(convertGoalStatus(src.getStatus()));
    tgt.setStatusDate(src.getStatusDate());
    tgt.setStatusReason(convertCodeableConcept(src.getStatusReason()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAddresses())
      tgt.addAddresses(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu2.model.Goal.GoalOutcomeComponent t : src.getOutcome())
      tgt.addOutcome(convertGoalOutcomeComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Goal convertGoal(org.hl7.fhir.dstu3.model.Goal src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Goal tgt = new org.hl7.fhir.dstu2.model.Goal();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setStart(convertType(src.getStart()));
    tgt.setTarget(convertType(src.getTarget()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    tgt.setStatus(convertGoalStatus(src.getStatus()));
    tgt.setStatusDate(src.getStatusDate());
    tgt.setStatusReason(convertCodeableConcept(src.getStatusReason()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAddresses())
      tgt.addAddresses(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu3.model.Goal.GoalOutcomeComponent t : src.getOutcome())
      tgt.addOutcome(convertGoalOutcomeComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Goal.GoalStatus convertGoalStatus(org.hl7.fhir.dstu2.model.Goal.GoalStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.PROPOSED;
    case PLANNED: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.PLANNED;
    case ACCEPTED: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.ACCEPTED;
    case REJECTED: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.REJECTED;
    case INPROGRESS: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.INPROGRESS;
    case ACHIEVED: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.ACHIEVED;
    case SUSTAINING: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.SUSTAINING;
    case ONHOLD: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.ONHOLD;
    case CANCELLED: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.CANCELLED;
    default: return org.hl7.fhir.dstu3.model.Goal.GoalStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Goal.GoalStatus convertGoalStatus(org.hl7.fhir.dstu3.model.Goal.GoalStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.PROPOSED;
    case PLANNED: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.PLANNED;
    case ACCEPTED: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.ACCEPTED;
    case REJECTED: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.REJECTED;
    case INPROGRESS: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.INPROGRESS;
    case ACHIEVED: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.ACHIEVED;
    case SUSTAINING: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.SUSTAINING;
    case ONHOLD: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.ONHOLD;
    case CANCELLED: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.CANCELLED;
    default: return org.hl7.fhir.dstu2.model.Goal.GoalStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Goal.GoalOutcomeComponent convertGoalOutcomeComponent(org.hl7.fhir.dstu2.model.Goal.GoalOutcomeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Goal.GoalOutcomeComponent tgt = new org.hl7.fhir.dstu3.model.Goal.GoalOutcomeComponent();
    copyElement(src, tgt);
    tgt.setResult(convertType(src.getResult()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Goal.GoalOutcomeComponent convertGoalOutcomeComponent(org.hl7.fhir.dstu3.model.Goal.GoalOutcomeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Goal.GoalOutcomeComponent tgt = new org.hl7.fhir.dstu2.model.Goal.GoalOutcomeComponent();
    copyElement(src, tgt);
    tgt.setResult(convertType(src.getResult()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Group convertGroup(org.hl7.fhir.dstu2.model.Group src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Group tgt = new org.hl7.fhir.dstu3.model.Group();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setType(convertGroupType(src.getType()));
    tgt.setActual(src.getActual());
    tgt.setActive(src.getActive());
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setName(src.getName());
    tgt.setQuantity(src.getQuantity());
    for (org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent t : src.getCharacteristic())
      tgt.addCharacteristic(convertGroupCharacteristicComponent(t));
    for (org.hl7.fhir.dstu2.model.Group.GroupMemberComponent t : src.getMember())
      tgt.addMember(convertGroupMemberComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Group convertGroup(org.hl7.fhir.dstu3.model.Group src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Group tgt = new org.hl7.fhir.dstu2.model.Group();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setType(convertGroupType(src.getType()));
    tgt.setActual(src.getActual());
    tgt.setActive(src.getActive());
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setName(src.getName());
    tgt.setQuantity(src.getQuantity());
    for (org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent t : src.getCharacteristic())
      tgt.addCharacteristic(convertGroupCharacteristicComponent(t));
    for (org.hl7.fhir.dstu3.model.Group.GroupMemberComponent t : src.getMember())
      tgt.addMember(convertGroupMemberComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Group.GroupType convertGroupType(org.hl7.fhir.dstu2.model.Group.GroupType src) {
    if (src == null)
      return null;
    switch (src) {
    case PERSON: return org.hl7.fhir.dstu3.model.Group.GroupType.PERSON;
    case ANIMAL: return org.hl7.fhir.dstu3.model.Group.GroupType.ANIMAL;
    case PRACTITIONER: return org.hl7.fhir.dstu3.model.Group.GroupType.PRACTITIONER;
    case DEVICE: return org.hl7.fhir.dstu3.model.Group.GroupType.DEVICE;
    case MEDICATION: return org.hl7.fhir.dstu3.model.Group.GroupType.MEDICATION;
    case SUBSTANCE: return org.hl7.fhir.dstu3.model.Group.GroupType.SUBSTANCE;
    default: return org.hl7.fhir.dstu3.model.Group.GroupType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Group.GroupType convertGroupType(org.hl7.fhir.dstu3.model.Group.GroupType src) {
    if (src == null)
      return null;
    switch (src) {
    case PERSON: return org.hl7.fhir.dstu2.model.Group.GroupType.PERSON;
    case ANIMAL: return org.hl7.fhir.dstu2.model.Group.GroupType.ANIMAL;
    case PRACTITIONER: return org.hl7.fhir.dstu2.model.Group.GroupType.PRACTITIONER;
    case DEVICE: return org.hl7.fhir.dstu2.model.Group.GroupType.DEVICE;
    case MEDICATION: return org.hl7.fhir.dstu2.model.Group.GroupType.MEDICATION;
    case SUBSTANCE: return org.hl7.fhir.dstu2.model.Group.GroupType.SUBSTANCE;
    default: return org.hl7.fhir.dstu2.model.Group.GroupType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent convertGroupCharacteristicComponent(org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent tgt = new org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setValue(convertType(src.getValue()));
    tgt.setExclude(src.getExclude());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent convertGroupCharacteristicComponent(org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent tgt = new org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setValue(convertType(src.getValue()));
    tgt.setExclude(src.getExclude());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Group.GroupMemberComponent convertGroupMemberComponent(org.hl7.fhir.dstu2.model.Group.GroupMemberComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Group.GroupMemberComponent tgt = new org.hl7.fhir.dstu3.model.Group.GroupMemberComponent();
    copyElement(src, tgt);
    tgt.setEntity(convertReference(src.getEntity()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setInactive(src.getInactive());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Group.GroupMemberComponent convertGroupMemberComponent(org.hl7.fhir.dstu3.model.Group.GroupMemberComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Group.GroupMemberComponent tgt = new org.hl7.fhir.dstu2.model.Group.GroupMemberComponent();
    copyElement(src, tgt);
    tgt.setEntity(convertReference(src.getEntity()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setInactive(src.getInactive());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.HealthcareService convertHealthcareService(org.hl7.fhir.dstu2.model.HealthcareService src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.HealthcareService tgt = new org.hl7.fhir.dstu3.model.HealthcareService();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setProvidedBy(convertReference(src.getProvidedBy()));
    tgt.setServiceCategory(convertCodeableConcept(src.getServiceCategory()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getServiceType())
      tgt.addServiceType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getLocation())
      tgt.addLocation(convertReference(t));
    tgt.setServiceName(src.getServiceName());
    tgt.setComment(src.getComment());
    tgt.setExtraDetails(src.getExtraDetails());
    tgt.setPhoto(convertAttachment(src.getPhoto()));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getCoverageArea())
      tgt.addCoverageArea(convertReference(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getServiceProvisionCode())
      tgt.addServiceProvisionCode(convertCodeableConcept(t));
    tgt.setEligibility(convertCodeableConcept(src.getEligibility()));
    tgt.setEligibilityNote(src.getEligibilityNote());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getProgramName())
      tgt.addProgramName(t.getValue());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCharacteristic())
      tgt.addCharacteristic(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReferralMethod())
      tgt.addReferralMethod(convertCodeableConcept(t));
    tgt.setPublicKey(src.getPublicKey());
    tgt.setAppointmentRequired(src.getAppointmentRequired());
    for (org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceAvailableTimeComponent t : src.getAvailableTime())
      tgt.addAvailableTime(convertHealthcareServiceAvailableTimeComponent(t));
    for (org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceNotAvailableComponent t : src.getNotAvailable())
      tgt.addNotAvailable(convertHealthcareServiceNotAvailableComponent(t));
    tgt.setAvailabilityExceptions(src.getAvailabilityExceptions());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.HealthcareService convertHealthcareService(org.hl7.fhir.dstu3.model.HealthcareService src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.HealthcareService tgt = new org.hl7.fhir.dstu2.model.HealthcareService();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setProvidedBy(convertReference(src.getProvidedBy()));
    tgt.setServiceCategory(convertCodeableConcept(src.getServiceCategory()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getServiceType())
      tgt.addServiceType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getLocation())
      tgt.addLocation(convertReference(t));
    tgt.setServiceName(src.getServiceName());
    tgt.setComment(src.getComment());
    tgt.setExtraDetails(src.getExtraDetails());
    tgt.setPhoto(convertAttachment(src.getPhoto()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getCoverageArea())
      tgt.addCoverageArea(convertReference(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getServiceProvisionCode())
      tgt.addServiceProvisionCode(convertCodeableConcept(t));
    tgt.setEligibility(convertCodeableConcept(src.getEligibility()));
    tgt.setEligibilityNote(src.getEligibilityNote());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getProgramName())
      tgt.addProgramName(t.getValue());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getCharacteristic())
      tgt.addCharacteristic(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReferralMethod())
      tgt.addReferralMethod(convertCodeableConcept(t));
    tgt.setPublicKey(src.getPublicKey());
    tgt.setAppointmentRequired(src.getAppointmentRequired());
    for (org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceAvailableTimeComponent t : src.getAvailableTime())
      tgt.addAvailableTime(convertHealthcareServiceAvailableTimeComponent(t));
    for (org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceNotAvailableComponent t : src.getNotAvailable())
      tgt.addNotAvailable(convertHealthcareServiceNotAvailableComponent(t));
    tgt.setAvailabilityExceptions(src.getAvailabilityExceptions());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceAvailableTimeComponent convertHealthcareServiceAvailableTimeComponent(org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceAvailableTimeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceAvailableTimeComponent tgt = new org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceAvailableTimeComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek> t : src.getDaysOfWeek())
      tgt.addDaysOfWeek(convertDaysOfWeek(t.getValue()));
    tgt.setAllDay(src.getAllDay());
    tgt.setAvailableStartTime(src.getAvailableStartTime());
    tgt.setAvailableEndTime(src.getAvailableEndTime());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceAvailableTimeComponent convertHealthcareServiceAvailableTimeComponent(org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceAvailableTimeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceAvailableTimeComponent tgt = new org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceAvailableTimeComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek> t : src.getDaysOfWeek())
      tgt.addDaysOfWeek(convertDaysOfWeek(t.getValue()));
    tgt.setAllDay(src.getAllDay());
    tgt.setAvailableStartTime(src.getAvailableStartTime());
    tgt.setAvailableEndTime(src.getAvailableEndTime());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek convertDaysOfWeek(org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek src) {
    if (src == null)
      return null;
    switch (src) {
    case MON: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.MON;
    case TUE: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.TUE;
    case WED: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.WED;
    case THU: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.THU;
    case FRI: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.FRI;
    case SAT: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.SAT;
    case SUN: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.SUN;
    default: return org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek convertDaysOfWeek(org.hl7.fhir.dstu3.model.HealthcareService.DaysOfWeek src) {
    if (src == null)
      return null;
    switch (src) {
    case MON: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.MON;
    case TUE: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.TUE;
    case WED: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.WED;
    case THU: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.THU;
    case FRI: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.FRI;
    case SAT: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.SAT;
    case SUN: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.SUN;
    default: return org.hl7.fhir.dstu2.model.HealthcareService.DaysOfWeek.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceNotAvailableComponent convertHealthcareServiceNotAvailableComponent(org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceNotAvailableComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceNotAvailableComponent tgt = new org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceNotAvailableComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setDuring(convertPeriod(src.getDuring()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceNotAvailableComponent convertHealthcareServiceNotAvailableComponent(org.hl7.fhir.dstu3.model.HealthcareService.HealthcareServiceNotAvailableComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceNotAvailableComponent tgt = new org.hl7.fhir.dstu2.model.HealthcareService.HealthcareServiceNotAvailableComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setDuring(convertPeriod(src.getDuring()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImagingObjectSelection convertImagingObjectSelection(org.hl7.fhir.dstu2.model.ImagingObjectSelection src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingObjectSelection tgt = new org.hl7.fhir.dstu3.model.ImagingObjectSelection();
    copyDomainResource(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setAuthoringTime(src.getAuthoringTime());
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setTitle(convertCodeableConcept(src.getTitle()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.ImagingObjectSelection.StudyComponent t : src.getStudy())
      tgt.addStudy(convertStudyComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingObjectSelection convertImagingObjectSelection(org.hl7.fhir.dstu3.model.ImagingObjectSelection src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingObjectSelection tgt = new org.hl7.fhir.dstu2.model.ImagingObjectSelection();
    copyDomainResource(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setAuthoringTime(src.getAuthoringTime());
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setTitle(convertCodeableConcept(src.getTitle()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.ImagingObjectSelection.StudyComponent t : src.getStudy())
      tgt.addStudy(convertStudyComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImagingObjectSelection.StudyComponent convertStudyComponent(org.hl7.fhir.dstu2.model.ImagingObjectSelection.StudyComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingObjectSelection.StudyComponent tgt = new org.hl7.fhir.dstu3.model.ImagingObjectSelection.StudyComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setUrl(src.getUrl());
    tgt.setImagingStudy(convertReference(src.getImagingStudy()));
    for (org.hl7.fhir.dstu2.model.study.SeriesComponent t : src.getSeries())
      tgt.addSeries(convertSeriesComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingObjectSelection.StudyComponent convertStudyComponent(org.hl7.fhir.dstu3.model.ImagingObjectSelection.StudyComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingObjectSelection.StudyComponent tgt = new org.hl7.fhir.dstu2.model.ImagingObjectSelection.StudyComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setUrl(src.getUrl());
    tgt.setImagingStudy(convertReference(src.getImagingStudy()));
    for (org.hl7.fhir.dstu3.model.study.SeriesComponent t : src.getSeries())
      tgt.addSeries(convertSeriesComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImagingObjectSelection.SeriesComponent convertSeriesComponent(org.hl7.fhir.dstu2.model.ImagingObjectSelection.SeriesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingObjectSelection.SeriesComponent tgt = new org.hl7.fhir.dstu3.model.ImagingObjectSelection.SeriesComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2.model.series.InstanceComponent t : src.getInstance())
      tgt.addInstance(convertInstanceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingObjectSelection.SeriesComponent convertSeriesComponent(org.hl7.fhir.dstu3.model.ImagingObjectSelection.SeriesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingObjectSelection.SeriesComponent tgt = new org.hl7.fhir.dstu2.model.ImagingObjectSelection.SeriesComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.series.InstanceComponent t : src.getInstance())
      tgt.addInstance(convertInstanceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImagingObjectSelection.InstanceComponent convertInstanceComponent(org.hl7.fhir.dstu2.model.ImagingObjectSelection.InstanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingObjectSelection.InstanceComponent tgt = new org.hl7.fhir.dstu3.model.ImagingObjectSelection.InstanceComponent();
    copyElement(src, tgt);
    tgt.setSopClass(src.getSopClass());
    tgt.setUid(src.getUid());
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2.model.instance.FramesComponent t : src.getFrame())
      tgt.addFrame(convertFramesComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingObjectSelection.InstanceComponent convertInstanceComponent(org.hl7.fhir.dstu3.model.ImagingObjectSelection.InstanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingObjectSelection.InstanceComponent tgt = new org.hl7.fhir.dstu2.model.ImagingObjectSelection.InstanceComponent();
    copyElement(src, tgt);
    tgt.setSopClass(src.getSopClass());
    tgt.setUid(src.getUid());
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.instance.FramesComponent t : src.getFrame())
      tgt.addFrame(convertFramesComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImagingObjectSelection.FramesComponent convertFramesComponent(org.hl7.fhir.dstu2.model.ImagingObjectSelection.FramesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingObjectSelection.FramesComponent tgt = new org.hl7.fhir.dstu3.model.ImagingObjectSelection.FramesComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.UnsignedIntType t : src.getNumber())
      tgt.addNumber(t.getValue());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingObjectSelection.FramesComponent convertFramesComponent(org.hl7.fhir.dstu3.model.ImagingObjectSelection.FramesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingObjectSelection.FramesComponent tgt = new org.hl7.fhir.dstu2.model.ImagingObjectSelection.FramesComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.UnsignedIntType t : src.getNumber())
      tgt.addNumber(t.getValue());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImagingStudy convertImagingStudy(org.hl7.fhir.dstu2.model.ImagingStudy src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingStudy tgt = new org.hl7.fhir.dstu3.model.ImagingStudy();
    copyDomainResource(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setAccession(convertIdentifier(src.getAccession()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setAvailability(convertInstanceAvailability(src.getAvailability()));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getModalityList())
      tgt.addModalityList(convertCoding(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setStarted(src.getStarted());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getOrder())
      tgt.addOrder(convertReference(t));
    tgt.setReferrer(convertReference(src.getReferrer()));
    tgt.setInterpreter(convertReference(src.getInterpreter()));
    tgt.setUrl(src.getUrl());
    tgt.setNumberOfSeries(src.getNumberOfSeries());
    tgt.setNumberOfInstances(src.getNumberOfInstances());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getProcedure())
      tgt.addProcedure(convertReference(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesComponent t : src.getSeries())
      tgt.addSeries(convertImagingStudySeriesComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingStudy convertImagingStudy(org.hl7.fhir.dstu3.model.ImagingStudy src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingStudy tgt = new org.hl7.fhir.dstu2.model.ImagingStudy();
    copyDomainResource(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setAccession(convertIdentifier(src.getAccession()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setAvailability(convertInstanceAvailability(src.getAvailability()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getModalityList())
      tgt.addModalityList(convertCoding(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setStarted(src.getStarted());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getOrder())
      tgt.addOrder(convertReference(t));
    tgt.setReferrer(convertReference(src.getReferrer()));
    tgt.setInterpreter(convertReference(src.getInterpreter()));
    tgt.setUrl(src.getUrl());
    tgt.setNumberOfSeries(src.getNumberOfSeries());
    tgt.setNumberOfInstances(src.getNumberOfInstances());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getProcedure())
      tgt.addProcedure(convertReference(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesComponent t : src.getSeries())
      tgt.addSeries(convertImagingStudySeriesComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ImagingStudy.InstanceAvailability convertInstanceAvailability(org.hl7.fhir.dstu2.model.ImagingStudy.InstanceAvailability src) {
    if (src == null)
      return null;
    switch (src) {
    case ONLINE: return org.hl7.fhir.dstu3.model.ImagingStudy.InstanceAvailability.ONLINE;
    case OFFLINE: return org.hl7.fhir.dstu3.model.ImagingStudy.InstanceAvailability.OFFLINE;
    case NEARLINE: return org.hl7.fhir.dstu3.model.ImagingStudy.InstanceAvailability.NEARLINE;
    case UNAVAILABLE: return org.hl7.fhir.dstu3.model.ImagingStudy.InstanceAvailability.UNAVAILABLE;
    default: return org.hl7.fhir.dstu3.model.ImagingStudy.InstanceAvailability.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ImagingStudy.InstanceAvailability convertInstanceAvailability(org.hl7.fhir.dstu3.model.ImagingStudy.InstanceAvailability src) {
    if (src == null)
      return null;
    switch (src) {
    case ONLINE: return org.hl7.fhir.dstu2.model.ImagingStudy.InstanceAvailability.ONLINE;
    case OFFLINE: return org.hl7.fhir.dstu2.model.ImagingStudy.InstanceAvailability.OFFLINE;
    case NEARLINE: return org.hl7.fhir.dstu2.model.ImagingStudy.InstanceAvailability.NEARLINE;
    case UNAVAILABLE: return org.hl7.fhir.dstu2.model.ImagingStudy.InstanceAvailability.UNAVAILABLE;
    default: return org.hl7.fhir.dstu2.model.ImagingStudy.InstanceAvailability.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesComponent convertImagingStudySeriesComponent(org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesComponent tgt = new org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setNumber(src.getNumber());
    tgt.setModality(convertCoding(src.getModality()));
    tgt.setDescription(src.getDescription());
    tgt.setNumberOfInstances(src.getNumberOfInstances());
    tgt.setAvailability(convertInstanceAvailability(src.getAvailability()));
    tgt.setUrl(src.getUrl());
    tgt.setBodySite(convertCoding(src.getBodySite()));
    tgt.setLaterality(convertCoding(src.getLaterality()));
    tgt.setStarted(src.getStarted());
    for (org.hl7.fhir.dstu2.model.series.ImagingStudySeriesInstanceComponent t : src.getInstance())
      tgt.addInstance(convertImagingStudySeriesInstanceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesComponent convertImagingStudySeriesComponent(org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesComponent tgt = new org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setNumber(src.getNumber());
    tgt.setModality(convertCoding(src.getModality()));
    tgt.setDescription(src.getDescription());
    tgt.setNumberOfInstances(src.getNumberOfInstances());
    tgt.setAvailability(convertInstanceAvailability(src.getAvailability()));
    tgt.setUrl(src.getUrl());
    tgt.setBodySite(convertCoding(src.getBodySite()));
    tgt.setLaterality(convertCoding(src.getLaterality()));
    tgt.setStarted(src.getStarted());
    for (org.hl7.fhir.dstu3.model.series.ImagingStudySeriesInstanceComponent t : src.getInstance())
      tgt.addInstance(convertImagingStudySeriesInstanceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesInstanceComponent convertImagingStudySeriesInstanceComponent(org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesInstanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesInstanceComponent tgt = new org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesInstanceComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setNumber(src.getNumber());
    tgt.setSopClass(src.getSopClass());
    tgt.setType(src.getType());
    tgt.setTitle(src.getTitle());
    for (org.hl7.fhir.dstu2.model.Attachment t : src.getContent())
      tgt.addContent(convertAttachment(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesInstanceComponent convertImagingStudySeriesInstanceComponent(org.hl7.fhir.dstu3.model.ImagingStudy.ImagingStudySeriesInstanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesInstanceComponent tgt = new org.hl7.fhir.dstu2.model.ImagingStudy.ImagingStudySeriesInstanceComponent();
    copyElement(src, tgt);
    tgt.setUid(src.getUid());
    tgt.setNumber(src.getNumber());
    tgt.setSopClass(src.getSopClass());
    tgt.setType(src.getType());
    tgt.setTitle(src.getTitle());
    for (org.hl7.fhir.dstu3.model.Attachment t : src.getContent())
      tgt.addContent(convertAttachment(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Immunization convertImmunization(org.hl7.fhir.dstu2.model.Immunization src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Immunization tgt = new org.hl7.fhir.dstu3.model.Immunization();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(src.getStatus());
    tgt.setDate(src.getDate());
    tgt.setVaccineCode(convertCodeableConcept(src.getVaccineCode()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setWasNotGiven(src.getWasNotGiven());
    tgt.setReported(src.getReported());
    tgt.setPerformer(convertReference(src.getPerformer()));
    tgt.setRequester(convertReference(src.getRequester()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setManufacturer(convertReference(src.getManufacturer()));
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setLotNumber(src.getLotNumber());
    tgt.setExpirationDate(src.getExpirationDate());
    tgt.setSite(convertCodeableConcept(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setDoseQuantity(convertSimpleQuantity(src.getDoseQuantity()));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    tgt.setExplanation(convertImmunizationExplanationComponent(src.getExplanation()));
    for (org.hl7.fhir.dstu2.model.Immunization.ImmunizationReactionComponent t : src.getReaction())
      tgt.addReaction(convertImmunizationReactionComponent(t));
    for (org.hl7.fhir.dstu2.model.Immunization.ImmunizationVaccinationProtocolComponent t : src.getVaccinationProtocol())
      tgt.addVaccinationProtocol(convertImmunizationVaccinationProtocolComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Immunization convertImmunization(org.hl7.fhir.dstu3.model.Immunization src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Immunization tgt = new org.hl7.fhir.dstu2.model.Immunization();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(src.getStatus());
    tgt.setDate(src.getDate());
    tgt.setVaccineCode(convertCodeableConcept(src.getVaccineCode()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setWasNotGiven(src.getWasNotGiven());
    tgt.setReported(src.getReported());
    tgt.setPerformer(convertReference(src.getPerformer()));
    tgt.setRequester(convertReference(src.getRequester()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setManufacturer(convertReference(src.getManufacturer()));
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setLotNumber(src.getLotNumber());
    tgt.setExpirationDate(src.getExpirationDate());
    tgt.setSite(convertCodeableConcept(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setDoseQuantity(convertSimpleQuantity(src.getDoseQuantity()));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    tgt.setExplanation(convertImmunizationExplanationComponent(src.getExplanation()));
    for (org.hl7.fhir.dstu3.model.Immunization.ImmunizationReactionComponent t : src.getReaction())
      tgt.addReaction(convertImmunizationReactionComponent(t));
    for (org.hl7.fhir.dstu3.model.Immunization.ImmunizationVaccinationProtocolComponent t : src.getVaccinationProtocol())
      tgt.addVaccinationProtocol(convertImmunizationVaccinationProtocolComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Immunization.ImmunizationExplanationComponent convertImmunizationExplanationComponent(org.hl7.fhir.dstu2.model.Immunization.ImmunizationExplanationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Immunization.ImmunizationExplanationComponent tgt = new org.hl7.fhir.dstu3.model.Immunization.ImmunizationExplanationComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReasonNotGiven())
      tgt.addReasonNotGiven(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Immunization.ImmunizationExplanationComponent convertImmunizationExplanationComponent(org.hl7.fhir.dstu3.model.Immunization.ImmunizationExplanationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Immunization.ImmunizationExplanationComponent tgt = new org.hl7.fhir.dstu2.model.Immunization.ImmunizationExplanationComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReasonNotGiven())
      tgt.addReasonNotGiven(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Immunization.ImmunizationReactionComponent convertImmunizationReactionComponent(org.hl7.fhir.dstu2.model.Immunization.ImmunizationReactionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Immunization.ImmunizationReactionComponent tgt = new org.hl7.fhir.dstu3.model.Immunization.ImmunizationReactionComponent();
    copyElement(src, tgt);
    tgt.setDate(src.getDate());
    tgt.setDetail(convertReference(src.getDetail()));
    tgt.setReported(src.getReported());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Immunization.ImmunizationReactionComponent convertImmunizationReactionComponent(org.hl7.fhir.dstu3.model.Immunization.ImmunizationReactionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Immunization.ImmunizationReactionComponent tgt = new org.hl7.fhir.dstu2.model.Immunization.ImmunizationReactionComponent();
    copyElement(src, tgt);
    tgt.setDate(src.getDate());
    tgt.setDetail(convertReference(src.getDetail()));
    tgt.setReported(src.getReported());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Immunization.ImmunizationVaccinationProtocolComponent convertImmunizationVaccinationProtocolComponent(org.hl7.fhir.dstu2.model.Immunization.ImmunizationVaccinationProtocolComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Immunization.ImmunizationVaccinationProtocolComponent tgt = new org.hl7.fhir.dstu3.model.Immunization.ImmunizationVaccinationProtocolComponent();
    copyElement(src, tgt);
    tgt.setDoseSequence(src.getDoseSequence());
    tgt.setDescription(src.getDescription());
    tgt.setAuthority(convertReference(src.getAuthority()));
    tgt.setSeries(src.getSeries());
    tgt.setSeriesDoses(src.getSeriesDoses());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getTargetDisease())
      tgt.addTargetDisease(convertCodeableConcept(t));
    tgt.setDoseStatus(convertCodeableConcept(src.getDoseStatus()));
    tgt.setDoseStatusReason(convertCodeableConcept(src.getDoseStatusReason()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Immunization.ImmunizationVaccinationProtocolComponent convertImmunizationVaccinationProtocolComponent(org.hl7.fhir.dstu3.model.Immunization.ImmunizationVaccinationProtocolComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Immunization.ImmunizationVaccinationProtocolComponent tgt = new org.hl7.fhir.dstu2.model.Immunization.ImmunizationVaccinationProtocolComponent();
    copyElement(src, tgt);
    tgt.setDoseSequence(src.getDoseSequence());
    tgt.setDescription(src.getDescription());
    tgt.setAuthority(convertReference(src.getAuthority()));
    tgt.setSeries(src.getSeries());
    tgt.setSeriesDoses(src.getSeriesDoses());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getTargetDisease())
      tgt.addTargetDisease(convertCodeableConcept(t));
    tgt.setDoseStatus(convertCodeableConcept(src.getDoseStatus()));
    tgt.setDoseStatusReason(convertCodeableConcept(src.getDoseStatusReason()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImmunizationRecommendation convertImmunizationRecommendation(org.hl7.fhir.dstu2.model.ImmunizationRecommendation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImmunizationRecommendation tgt = new org.hl7.fhir.dstu3.model.ImmunizationRecommendation();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    for (org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent t : src.getRecommendation())
      tgt.addRecommendation(convertImmunizationRecommendationRecommendationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImmunizationRecommendation convertImmunizationRecommendation(org.hl7.fhir.dstu3.model.ImmunizationRecommendation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImmunizationRecommendation tgt = new org.hl7.fhir.dstu2.model.ImmunizationRecommendation();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    for (org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent t : src.getRecommendation())
      tgt.addRecommendation(convertImmunizationRecommendationRecommendationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent convertImmunizationRecommendationRecommendationComponent(org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent tgt = new org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent();
    copyElement(src, tgt);
    tgt.setDate(src.getDate());
    tgt.setVaccineCode(convertCodeableConcept(src.getVaccineCode()));
    tgt.setDoseNumber(src.getDoseNumber());
    tgt.setForecastStatus(convertCodeableConcept(src.getForecastStatus()));
    for (org.hl7.fhir.dstu2.model.recommendation.ImmunizationRecommendationRecommendationDateCriterionComponent t : src.getDateCriterion())
      tgt.addDateCriterion(convertImmunizationRecommendationRecommendationDateCriterionComponent(t));
    tgt.setProtocol(convertImmunizationRecommendationRecommendationProtocolComponent(src.getProtocol()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSupportingImmunization())
      tgt.addSupportingImmunization(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSupportingPatientInformation())
      tgt.addSupportingPatientInformation(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent convertImmunizationRecommendationRecommendationComponent(org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent tgt = new org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent();
    copyElement(src, tgt);
    tgt.setDate(src.getDate());
    tgt.setVaccineCode(convertCodeableConcept(src.getVaccineCode()));
    tgt.setDoseNumber(src.getDoseNumber());
    tgt.setForecastStatus(convertCodeableConcept(src.getForecastStatus()));
    for (org.hl7.fhir.dstu3.model.recommendation.ImmunizationRecommendationRecommendationDateCriterionComponent t : src.getDateCriterion())
      tgt.addDateCriterion(convertImmunizationRecommendationRecommendationDateCriterionComponent(t));
    tgt.setProtocol(convertImmunizationRecommendationRecommendationProtocolComponent(src.getProtocol()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSupportingImmunization())
      tgt.addSupportingImmunization(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSupportingPatientInformation())
      tgt.addSupportingPatientInformation(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent convertImmunizationRecommendationRecommendationDateCriterionComponent(org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent tgt = new org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent convertImmunizationRecommendationRecommendationDateCriterionComponent(org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent tgt = new org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent convertImmunizationRecommendationRecommendationProtocolComponent(org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent tgt = new org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent();
    copyElement(src, tgt);
    tgt.setDoseSequence(src.getDoseSequence());
    tgt.setDescription(src.getDescription());
    tgt.setAuthority(convertReference(src.getAuthority()));
    tgt.setSeries(src.getSeries());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent convertImmunizationRecommendationRecommendationProtocolComponent(org.hl7.fhir.dstu3.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent tgt = new org.hl7.fhir.dstu2.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationProtocolComponent();
    copyElement(src, tgt);
    tgt.setDoseSequence(src.getDoseSequence());
    tgt.setDescription(src.getDescription());
    tgt.setAuthority(convertReference(src.getAuthority()));
    tgt.setSeries(src.getSeries());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide convertImplementationGuide(org.hl7.fhir.dstu2.model.ImplementationGuide src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideContactComponent t : src.getContact())
      tgt.addContact(convertImplementationGuideContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideDependencyComponent t : src.getDependency())
      tgt.addDependency(convertImplementationGuideDependencyComponent(t));
    for (org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageComponent t : src.getPackage())
      tgt.addPackage(convertImplementationGuidePackageComponent(t));
    for (org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideGlobalComponent t : src.getGlobal())
      tgt.addGlobal(convertImplementationGuideGlobalComponent(t));
    for (org.hl7.fhir.dstu2.model.UriType t : src.getBinary())
      tgt.addBinary(t.getValue());
    tgt.setPage(convertImplementationGuidePageComponent(src.getPage()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImplementationGuide convertImplementationGuide(org.hl7.fhir.dstu3.model.ImplementationGuide src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImplementationGuide tgt = new org.hl7.fhir.dstu2.model.ImplementationGuide();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent t : src.getContact())
      tgt.addContact(convertImplementationGuideContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent t : src.getDependency())
      tgt.addDependency(convertImplementationGuideDependencyComponent(t));
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent t : src.getPackage())
      tgt.addPackage(convertImplementationGuidePackageComponent(t));
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent t : src.getGlobal())
      tgt.addGlobal(convertImplementationGuideGlobalComponent(t));
    for (org.hl7.fhir.dstu3.model.UriType t : src.getBinary())
      tgt.addBinary(t.getValue());
    tgt.setPage(convertImplementationGuidePageComponent(src.getPage()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent convertImplementationGuideContactComponent(org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideContactComponent convertImplementationGuideContactComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideContactComponent tgt = new org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent convertImplementationGuideDependencyComponent(org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideDependencyComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent();
    copyElement(src, tgt);
    tgt.setType(convertGuideDependencyType(src.getType()));
    tgt.setUri(src.getUri());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideDependencyComponent convertImplementationGuideDependencyComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideDependencyComponent tgt = new org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideDependencyComponent();
    copyElement(src, tgt);
    tgt.setType(convertGuideDependencyType(src.getType()));
    tgt.setUri(src.getUri());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType convertGuideDependencyType(org.hl7.fhir.dstu2.model.ImplementationGuide.GuideDependencyType src) {
    if (src == null)
      return null;
    switch (src) {
    case REFERENCE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType.REFERENCE;
    case INCLUSION: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType.INCLUSION;
    default: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ImplementationGuide.GuideDependencyType convertGuideDependencyType(org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType src) {
    if (src == null)
      return null;
    switch (src) {
    case REFERENCE: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuideDependencyType.REFERENCE;
    case INCLUSION: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuideDependencyType.INCLUSION;
    default: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuideDependencyType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent convertImplementationGuidePackageComponent(org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.package.ImplementationGuidePackageResourceComponent t : src.getResource())
      tgt.addResource(convertImplementationGuidePackageResourceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageComponent convertImplementationGuidePackageComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageComponent tgt = new org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.package.ImplementationGuidePackageResourceComponent t : src.getResource())
      tgt.addResource(convertImplementationGuidePackageResourceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent convertImplementationGuidePackageResourceComponent(org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageResourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent();
    copyElement(src, tgt);
    tgt.setExample(src.getExample());
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setAcronym(src.getAcronym());
    tgt.setSource(convertType(src.getSource()));
    tgt.setExampleFor(convertReference(src.getExampleFor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageResourceComponent convertImplementationGuidePackageResourceComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageResourceComponent tgt = new org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePackageResourceComponent();
    copyElement(src, tgt);
    tgt.setExample(src.getExample());
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setAcronym(src.getAcronym());
    tgt.setSource(convertType(src.getSource()));
    tgt.setExampleFor(convertReference(src.getExampleFor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent convertImplementationGuideGlobalComponent(org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideGlobalComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideGlobalComponent convertImplementationGuideGlobalComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideGlobalComponent tgt = new org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuideGlobalComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent convertImplementationGuidePageComponent(org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent();
    copyElement(src, tgt);
    tgt.setSource(src.getSource());
    tgt.setName(src.getName());
    tgt.setKind(convertGuidePageKind(src.getKind()));
    for (org.hl7.fhir.dstu2.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getPackage())
      tgt.addPackage(t.getValue());
    tgt.setFormat(src.getFormat());
    for (org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePageComponent t : src.getPage())
      tgt.addPage(convertImplementationGuidePageComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePageComponent convertImplementationGuidePageComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePageComponent tgt = new org.hl7.fhir.dstu2.model.ImplementationGuide.ImplementationGuidePageComponent();
    copyElement(src, tgt);
    tgt.setSource(src.getSource());
    tgt.setName(src.getName());
    tgt.setKind(convertGuidePageKind(src.getKind()));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getPackage())
      tgt.addPackage(t.getValue());
    tgt.setFormat(src.getFormat());
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent t : src.getPage())
      tgt.addPage(convertImplementationGuidePageComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind convertGuidePageKind(org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind src) {
    if (src == null)
      return null;
    switch (src) {
    case PAGE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.PAGE;
    case EXAMPLE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.EXAMPLE;
    case LIST: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.LIST;
    case INCLUDE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.INCLUDE;
    case DIRECTORY: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.DIRECTORY;
    case DICTIONARY: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.DICTIONARY;
    case TOC: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.TOC;
    case RESOURCE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.RESOURCE;
    default: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind convertGuidePageKind(org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind src) {
    if (src == null)
      return null;
    switch (src) {
    case PAGE: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.PAGE;
    case EXAMPLE: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.EXAMPLE;
    case LIST: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.LIST;
    case INCLUDE: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.INCLUDE;
    case DIRECTORY: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.DIRECTORY;
    case DICTIONARY: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.DICTIONARY;
    case TOC: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.TOC;
    case RESOURCE: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.RESOURCE;
    default: return org.hl7.fhir.dstu2.model.ImplementationGuide.GuidePageKind.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Location convertLocation(org.hl7.fhir.dstu2.model.Location src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Location tgt = new org.hl7.fhir.dstu3.model.Location();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertLocationStatus(src.getStatus()));
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setMode(convertLocationMode(src.getMode()));
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setAddress(convertAddress(src.getAddress()));
    tgt.setPhysicalType(convertCodeableConcept(src.getPhysicalType()));
    tgt.setPosition(convertLocationPositionComponent(src.getPosition()));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    tgt.setPartOf(convertReference(src.getPartOf()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Location convertLocation(org.hl7.fhir.dstu3.model.Location src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Location tgt = new org.hl7.fhir.dstu2.model.Location();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertLocationStatus(src.getStatus()));
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setMode(convertLocationMode(src.getMode()));
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setAddress(convertAddress(src.getAddress()));
    tgt.setPhysicalType(convertCodeableConcept(src.getPhysicalType()));
    tgt.setPosition(convertLocationPositionComponent(src.getPosition()));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    tgt.setPartOf(convertReference(src.getPartOf()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Location.LocationStatus convertLocationStatus(org.hl7.fhir.dstu2.model.Location.LocationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu3.model.Location.LocationStatus.ACTIVE;
    case SUSPENDED: return org.hl7.fhir.dstu3.model.Location.LocationStatus.SUSPENDED;
    case INACTIVE: return org.hl7.fhir.dstu3.model.Location.LocationStatus.INACTIVE;
    default: return org.hl7.fhir.dstu3.model.Location.LocationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Location.LocationStatus convertLocationStatus(org.hl7.fhir.dstu3.model.Location.LocationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu2.model.Location.LocationStatus.ACTIVE;
    case SUSPENDED: return org.hl7.fhir.dstu2.model.Location.LocationStatus.SUSPENDED;
    case INACTIVE: return org.hl7.fhir.dstu2.model.Location.LocationStatus.INACTIVE;
    default: return org.hl7.fhir.dstu2.model.Location.LocationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.Location.LocationMode convertLocationMode(org.hl7.fhir.dstu2.model.Location.LocationMode src) {
    if (src == null)
      return null;
    switch (src) {
    case INSTANCE: return org.hl7.fhir.dstu3.model.Location.LocationMode.INSTANCE;
    case KIND: return org.hl7.fhir.dstu3.model.Location.LocationMode.KIND;
    default: return org.hl7.fhir.dstu3.model.Location.LocationMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Location.LocationMode convertLocationMode(org.hl7.fhir.dstu3.model.Location.LocationMode src) {
    if (src == null)
      return null;
    switch (src) {
    case INSTANCE: return org.hl7.fhir.dstu2.model.Location.LocationMode.INSTANCE;
    case KIND: return org.hl7.fhir.dstu2.model.Location.LocationMode.KIND;
    default: return org.hl7.fhir.dstu2.model.Location.LocationMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Location.LocationPositionComponent convertLocationPositionComponent(org.hl7.fhir.dstu2.model.Location.LocationPositionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Location.LocationPositionComponent tgt = new org.hl7.fhir.dstu3.model.Location.LocationPositionComponent();
    copyElement(src, tgt);
    tgt.setLongitude(src.getLongitude());
    tgt.setLatitude(src.getLatitude());
    tgt.setAltitude(src.getAltitude());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Location.LocationPositionComponent convertLocationPositionComponent(org.hl7.fhir.dstu3.model.Location.LocationPositionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Location.LocationPositionComponent tgt = new org.hl7.fhir.dstu2.model.Location.LocationPositionComponent();
    copyElement(src, tgt);
    tgt.setLongitude(src.getLongitude());
    tgt.setLatitude(src.getLatitude());
    tgt.setAltitude(src.getAltitude());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Media convertMedia(org.hl7.fhir.dstu2.model.Media src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Media tgt = new org.hl7.fhir.dstu3.model.Media();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setType(convertDigitalMediaType(src.getType()));
    tgt.setSubtype(convertCodeableConcept(src.getSubtype()));
    tgt.setView(convertCodeableConcept(src.getView()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setOperator(convertReference(src.getOperator()));
    tgt.setDeviceName(src.getDeviceName());
    tgt.setHeight(src.getHeight());
    tgt.setWidth(src.getWidth());
    tgt.setFrames(src.getFrames());
    tgt.setDuration(src.getDuration());
    tgt.setContent(convertAttachment(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Media convertMedia(org.hl7.fhir.dstu3.model.Media src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Media tgt = new org.hl7.fhir.dstu2.model.Media();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setType(convertDigitalMediaType(src.getType()));
    tgt.setSubtype(convertCodeableConcept(src.getSubtype()));
    tgt.setView(convertCodeableConcept(src.getView()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setOperator(convertReference(src.getOperator()));
    tgt.setDeviceName(src.getDeviceName());
    tgt.setHeight(src.getHeight());
    tgt.setWidth(src.getWidth());
    tgt.setFrames(src.getFrames());
    tgt.setDuration(src.getDuration());
    tgt.setContent(convertAttachment(src.getContent()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Media.DigitalMediaType convertDigitalMediaType(org.hl7.fhir.dstu2.model.Media.DigitalMediaType src) {
    if (src == null)
      return null;
    switch (src) {
    case PHOTO: return org.hl7.fhir.dstu3.model.Media.DigitalMediaType.PHOTO;
    case VIDEO: return org.hl7.fhir.dstu3.model.Media.DigitalMediaType.VIDEO;
    case AUDIO: return org.hl7.fhir.dstu3.model.Media.DigitalMediaType.AUDIO;
    default: return org.hl7.fhir.dstu3.model.Media.DigitalMediaType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Media.DigitalMediaType convertDigitalMediaType(org.hl7.fhir.dstu3.model.Media.DigitalMediaType src) {
    if (src == null)
      return null;
    switch (src) {
    case PHOTO: return org.hl7.fhir.dstu2.model.Media.DigitalMediaType.PHOTO;
    case VIDEO: return org.hl7.fhir.dstu2.model.Media.DigitalMediaType.VIDEO;
    case AUDIO: return org.hl7.fhir.dstu2.model.Media.DigitalMediaType.AUDIO;
    default: return org.hl7.fhir.dstu2.model.Media.DigitalMediaType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Medication convertMedication(org.hl7.fhir.dstu2.model.Medication src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Medication tgt = new org.hl7.fhir.dstu3.model.Medication();
    copyDomainResource(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setIsBrand(src.getIsBrand());
    tgt.setManufacturer(convertReference(src.getManufacturer()));
    tgt.setProduct(convertMedicationProductComponent(src.getProduct()));
    tgt.setPackage(convertMedicationPackageComponent(src.getPackage()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Medication convertMedication(org.hl7.fhir.dstu3.model.Medication src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Medication tgt = new org.hl7.fhir.dstu2.model.Medication();
    copyDomainResource(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setIsBrand(src.getIsBrand());
    tgt.setManufacturer(convertReference(src.getManufacturer()));
    tgt.setProduct(convertMedicationProductComponent(src.getProduct()));
    tgt.setPackage(convertMedicationPackageComponent(src.getPackage()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Medication.MedicationProductComponent convertMedicationProductComponent(org.hl7.fhir.dstu2.model.Medication.MedicationProductComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Medication.MedicationProductComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationProductComponent();
    copyElement(src, tgt);
    tgt.setForm(convertCodeableConcept(src.getForm()));
    for (org.hl7.fhir.dstu2.model.product.MedicationProductIngredientComponent t : src.getIngredient())
      tgt.addIngredient(convertMedicationProductIngredientComponent(t));
    for (org.hl7.fhir.dstu2.model.product.MedicationProductBatchComponent t : src.getBatch())
      tgt.addBatch(convertMedicationProductBatchComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Medication.MedicationProductComponent convertMedicationProductComponent(org.hl7.fhir.dstu3.model.Medication.MedicationProductComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Medication.MedicationProductComponent tgt = new org.hl7.fhir.dstu2.model.Medication.MedicationProductComponent();
    copyElement(src, tgt);
    tgt.setForm(convertCodeableConcept(src.getForm()));
    for (org.hl7.fhir.dstu3.model.product.MedicationProductIngredientComponent t : src.getIngredient())
      tgt.addIngredient(convertMedicationProductIngredientComponent(t));
    for (org.hl7.fhir.dstu3.model.product.MedicationProductBatchComponent t : src.getBatch())
      tgt.addBatch(convertMedicationProductBatchComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Medication.MedicationProductIngredientComponent convertMedicationProductIngredientComponent(org.hl7.fhir.dstu2.model.Medication.MedicationProductIngredientComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Medication.MedicationProductIngredientComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationProductIngredientComponent();
    copyElement(src, tgt);
    tgt.setItem(convertType(src.getItem()));
    tgt.setAmount(convertRatio(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Medication.MedicationProductIngredientComponent convertMedicationProductIngredientComponent(org.hl7.fhir.dstu3.model.Medication.MedicationProductIngredientComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Medication.MedicationProductIngredientComponent tgt = new org.hl7.fhir.dstu2.model.Medication.MedicationProductIngredientComponent();
    copyElement(src, tgt);
    tgt.setItem(convertType(src.getItem()));
    tgt.setAmount(convertRatio(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Medication.MedicationProductBatchComponent convertMedicationProductBatchComponent(org.hl7.fhir.dstu2.model.Medication.MedicationProductBatchComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Medication.MedicationProductBatchComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationProductBatchComponent();
    copyElement(src, tgt);
    tgt.setLotNumber(src.getLotNumber());
    tgt.setExpirationDate(src.getExpirationDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Medication.MedicationProductBatchComponent convertMedicationProductBatchComponent(org.hl7.fhir.dstu3.model.Medication.MedicationProductBatchComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Medication.MedicationProductBatchComponent tgt = new org.hl7.fhir.dstu2.model.Medication.MedicationProductBatchComponent();
    copyElement(src, tgt);
    tgt.setLotNumber(src.getLotNumber());
    tgt.setExpirationDate(src.getExpirationDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Medication.MedicationPackageComponent convertMedicationPackageComponent(org.hl7.fhir.dstu2.model.Medication.MedicationPackageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Medication.MedicationPackageComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationPackageComponent();
    copyElement(src, tgt);
    tgt.setContainer(convertCodeableConcept(src.getContainer()));
    for (org.hl7.fhir.dstu2.model.package.MedicationPackageContentComponent t : src.getContent())
      tgt.addContent(convertMedicationPackageContentComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Medication.MedicationPackageComponent convertMedicationPackageComponent(org.hl7.fhir.dstu3.model.Medication.MedicationPackageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Medication.MedicationPackageComponent tgt = new org.hl7.fhir.dstu2.model.Medication.MedicationPackageComponent();
    copyElement(src, tgt);
    tgt.setContainer(convertCodeableConcept(src.getContainer()));
    for (org.hl7.fhir.dstu3.model.package.MedicationPackageContentComponent t : src.getContent())
      tgt.addContent(convertMedicationPackageContentComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Medication.MedicationPackageContentComponent convertMedicationPackageContentComponent(org.hl7.fhir.dstu2.model.Medication.MedicationPackageContentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Medication.MedicationPackageContentComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationPackageContentComponent();
    copyElement(src, tgt);
    tgt.setItem(convertType(src.getItem()));
    tgt.setAmount(convertSimpleQuantity(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Medication.MedicationPackageContentComponent convertMedicationPackageContentComponent(org.hl7.fhir.dstu3.model.Medication.MedicationPackageContentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Medication.MedicationPackageContentComponent tgt = new org.hl7.fhir.dstu2.model.Medication.MedicationPackageContentComponent();
    copyElement(src, tgt);
    tgt.setItem(convertType(src.getItem()));
    tgt.setAmount(convertSimpleQuantity(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MedicationAdministration convertMedicationAdministration(org.hl7.fhir.dstu2.model.MedicationAdministration src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationAdministration tgt = new org.hl7.fhir.dstu3.model.MedicationAdministration();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertMedicationAdministrationStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setEffectiveTime(convertType(src.getEffectiveTime()));
    tgt.setPractitioner(convertReference(src.getPractitioner()));
    tgt.setPrescription(convertReference(src.getPrescription()));
    tgt.setWasNotGiven(src.getWasNotGiven());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReasonNotGiven())
      tgt.addReasonNotGiven(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReasonGiven())
      tgt.addReasonGiven(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getDevice())
      tgt.addDevice(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    tgt.setDosage(convertMedicationAdministrationDosageComponent(src.getDosage()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationAdministration convertMedicationAdministration(org.hl7.fhir.dstu3.model.MedicationAdministration src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationAdministration tgt = new org.hl7.fhir.dstu2.model.MedicationAdministration();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertMedicationAdministrationStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setEffectiveTime(convertType(src.getEffectiveTime()));
    tgt.setPractitioner(convertReference(src.getPractitioner()));
    tgt.setPrescription(convertReference(src.getPrescription()));
    tgt.setWasNotGiven(src.getWasNotGiven());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReasonNotGiven())
      tgt.addReasonNotGiven(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReasonGiven())
      tgt.addReasonGiven(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getDevice())
      tgt.addDevice(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    tgt.setDosage(convertMedicationAdministrationDosageComponent(src.getDosage()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus convertMedicationAdministrationStatus(org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus.INPROGRESS;
    case ONHOLD: return org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus.ENTEREDINERROR;
    case STOPPED: return org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus.STOPPED;
    default: return org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus convertMedicationAdministrationStatus(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus.INPROGRESS;
    case ONHOLD: return org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus.ENTEREDINERROR;
    case STOPPED: return org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus.STOPPED;
    default: return org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent convertMedicationAdministrationDosageComponent(org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationDosageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent tgt = new org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setRate(convertType(src.getRate()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationDosageComponent convertMedicationAdministrationDosageComponent(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationDosageComponent tgt = new org.hl7.fhir.dstu2.model.MedicationAdministration.MedicationAdministrationDosageComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setRate(convertType(src.getRate()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MedicationDispense convertMedicationDispense(org.hl7.fhir.dstu2.model.MedicationDispense src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationDispense tgt = new org.hl7.fhir.dstu3.model.MedicationDispense();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setStatus(convertMedicationDispenseStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setDispenser(convertReference(src.getDispenser()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAuthorizingPrescription())
      tgt.addAuthorizingPrescription(convertReference(t));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setDaysSupply(convertSimpleQuantity(src.getDaysSupply()));
    tgt.setWhenPrepared(src.getWhenPrepared());
    tgt.setWhenHandedOver(src.getWhenHandedOver());
    tgt.setDestination(convertReference(src.getDestination()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getReceiver())
      tgt.addReceiver(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseDosageInstructionComponent t : src.getDosageInstruction())
      tgt.addDosageInstruction(convertMedicationDispenseDosageInstructionComponent(t));
    tgt.setSubstitution(convertMedicationDispenseSubstitutionComponent(src.getSubstitution()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationDispense convertMedicationDispense(org.hl7.fhir.dstu3.model.MedicationDispense src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationDispense tgt = new org.hl7.fhir.dstu2.model.MedicationDispense();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setStatus(convertMedicationDispenseStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setDispenser(convertReference(src.getDispenser()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAuthorizingPrescription())
      tgt.addAuthorizingPrescription(convertReference(t));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setDaysSupply(convertSimpleQuantity(src.getDaysSupply()));
    tgt.setWhenPrepared(src.getWhenPrepared());
    tgt.setWhenHandedOver(src.getWhenHandedOver());
    tgt.setDestination(convertReference(src.getDestination()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getReceiver())
      tgt.addReceiver(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent t : src.getDosageInstruction())
      tgt.addDosageInstruction(convertMedicationDispenseDosageInstructionComponent(t));
    tgt.setSubstitution(convertMedicationDispenseSubstitutionComponent(src.getSubstitution()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus convertMedicationDispenseStatus(org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus.INPROGRESS;
    case ONHOLD: return org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus.ENTEREDINERROR;
    case STOPPED: return org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus.STOPPED;
    default: return org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus convertMedicationDispenseStatus(org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus.INPROGRESS;
    case ONHOLD: return org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus.ENTEREDINERROR;
    case STOPPED: return org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus.STOPPED;
    default: return org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent convertMedicationDispenseDosageInstructionComponent(org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseDosageInstructionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent tgt = new org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setAdditionalInstructions(convertCodeableConcept(src.getAdditionalInstructions()));
    tgt.setTiming(convertTiming(src.getTiming()));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setDose(convertType(src.getDose()));
    tgt.setRate(convertType(src.getRate()));
    tgt.setMaxDosePerPeriod(convertRatio(src.getMaxDosePerPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseDosageInstructionComponent convertMedicationDispenseDosageInstructionComponent(org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseDosageInstructionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseDosageInstructionComponent tgt = new org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseDosageInstructionComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setAdditionalInstructions(convertCodeableConcept(src.getAdditionalInstructions()));
    tgt.setTiming(convertTiming(src.getTiming()));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setDose(convertType(src.getDose()));
    tgt.setRate(convertType(src.getRate()));
    tgt.setMaxDosePerPeriod(convertRatio(src.getMaxDosePerPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseSubstitutionComponent convertMedicationDispenseSubstitutionComponent(org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseSubstitutionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseSubstitutionComponent tgt = new org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseSubstitutionComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getResponsibleParty())
      tgt.addResponsibleParty(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseSubstitutionComponent convertMedicationDispenseSubstitutionComponent(org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseSubstitutionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseSubstitutionComponent tgt = new org.hl7.fhir.dstu2.model.MedicationDispense.MedicationDispenseSubstitutionComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReason())
      tgt.addReason(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getResponsibleParty())
      tgt.addResponsibleParty(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MedicationOrder convertMedicationOrder(org.hl7.fhir.dstu2.model.MedicationOrder src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationOrder tgt = new org.hl7.fhir.dstu3.model.MedicationOrder();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertMedicationOrderStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setDateWritten(src.getDateWritten());
    tgt.setPrescriber(convertReference(src.getPrescriber()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReasonCode())
      tgt.addReasonCode(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getReasonReference())
      tgt.addReasonReference(convertReference(t));
    tgt.setDateEnded(src.getDateEnded());
    tgt.setReasonEnded(convertCodeableConcept(src.getReasonEnded()));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDosageInstructionComponent t : src.getDosageInstruction())
      tgt.addDosageInstruction(convertMedicationOrderDosageInstructionComponent(t));
    tgt.setDispenseRequest(convertMedicationOrderDispenseRequestComponent(src.getDispenseRequest()));
    tgt.setSubstitution(convertMedicationOrderSubstitutionComponent(src.getSubstitution()));
    tgt.setPriorPrescription(convertReference(src.getPriorPrescription()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationOrder convertMedicationOrder(org.hl7.fhir.dstu3.model.MedicationOrder src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationOrder tgt = new org.hl7.fhir.dstu2.model.MedicationOrder();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertMedicationOrderStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setDateWritten(src.getDateWritten());
    tgt.setPrescriber(convertReference(src.getPrescriber()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReasonCode())
      tgt.addReasonCode(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getReasonReference())
      tgt.addReasonReference(convertReference(t));
    tgt.setDateEnded(src.getDateEnded());
    tgt.setReasonEnded(convertCodeableConcept(src.getReasonEnded()));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent t : src.getDosageInstruction())
      tgt.addDosageInstruction(convertMedicationOrderDosageInstructionComponent(t));
    tgt.setDispenseRequest(convertMedicationOrderDispenseRequestComponent(src.getDispenseRequest()));
    tgt.setSubstitution(convertMedicationOrderSubstitutionComponent(src.getSubstitution()));
    tgt.setPriorPrescription(convertReference(src.getPriorPrescription()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus convertMedicationOrderStatus(org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus.ACTIVE;
    case ONHOLD: return org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus.ENTEREDINERROR;
    case STOPPED: return org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus.STOPPED;
    case DRAFT: return org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus.DRAFT;
    default: return org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus convertMedicationOrderStatus(org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus.ACTIVE;
    case ONHOLD: return org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus.ENTEREDINERROR;
    case STOPPED: return org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus.STOPPED;
    case DRAFT: return org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus.DRAFT;
    default: return org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent convertMedicationOrderDosageInstructionComponent(org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDosageInstructionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent tgt = new org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setAdditionalInstructions(convertCodeableConcept(src.getAdditionalInstructions()));
    tgt.setTiming(convertTiming(src.getTiming()));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setDose(convertType(src.getDose()));
    tgt.setRate(convertType(src.getRate()));
    tgt.setMaxDosePerPeriod(convertRatio(src.getMaxDosePerPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDosageInstructionComponent convertMedicationOrderDosageInstructionComponent(org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDosageInstructionComponent tgt = new org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDosageInstructionComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setAdditionalInstructions(convertCodeableConcept(src.getAdditionalInstructions()));
    tgt.setTiming(convertTiming(src.getTiming()));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setDose(convertType(src.getDose()));
    tgt.setRate(convertType(src.getRate()));
    tgt.setMaxDosePerPeriod(convertRatio(src.getMaxDosePerPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDispenseRequestComponent convertMedicationOrderDispenseRequestComponent(org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDispenseRequestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDispenseRequestComponent tgt = new org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDispenseRequestComponent();
    copyElement(src, tgt);
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setValidityPeriod(convertPeriod(src.getValidityPeriod()));
    tgt.setNumberOfRepeatsAllowed(src.getNumberOfRepeatsAllowed());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setExpectedSupplyDuration(convertDuration(src.getExpectedSupplyDuration()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDispenseRequestComponent convertMedicationOrderDispenseRequestComponent(org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDispenseRequestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDispenseRequestComponent tgt = new org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderDispenseRequestComponent();
    copyElement(src, tgt);
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setValidityPeriod(convertPeriod(src.getValidityPeriod()));
    tgt.setNumberOfRepeatsAllowed(src.getNumberOfRepeatsAllowed());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setExpectedSupplyDuration(convertDuration(src.getExpectedSupplyDuration()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderSubstitutionComponent convertMedicationOrderSubstitutionComponent(org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderSubstitutionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderSubstitutionComponent tgt = new org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderSubstitutionComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderSubstitutionComponent convertMedicationOrderSubstitutionComponent(org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderSubstitutionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderSubstitutionComponent tgt = new org.hl7.fhir.dstu2.model.MedicationOrder.MedicationOrderSubstitutionComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MedicationStatement convertMedicationStatement(org.hl7.fhir.dstu2.model.MedicationStatement src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationStatement tgt = new org.hl7.fhir.dstu3.model.MedicationStatement();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertMedicationStatementStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEffective(convertType(src.getEffective()));
    tgt.setInformationSource(convertReference(src.getInformationSource()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSupportingInformation())
      tgt.addSupportingInformation(convertReference(t));
    tgt.setDateAsserted(src.getDateAsserted());
    tgt.setWasNotTaken(src.getWasNotTaken());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReasonNotTaken())
      tgt.addReasonNotTaken(convertCodeableConcept(t));
    tgt.setReasonForUse(convertType(src.getReasonForUse()));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent t : src.getDosage())
      tgt.addDosage(convertMedicationStatementDosageComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationStatement convertMedicationStatement(org.hl7.fhir.dstu3.model.MedicationStatement src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationStatement tgt = new org.hl7.fhir.dstu2.model.MedicationStatement();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertMedicationStatementStatus(src.getStatus()));
    tgt.setMedication(convertType(src.getMedication()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEffective(convertType(src.getEffective()));
    tgt.setInformationSource(convertReference(src.getInformationSource()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSupportingInformation())
      tgt.addSupportingInformation(convertReference(t));
    tgt.setDateAsserted(src.getDateAsserted());
    tgt.setWasNotTaken(src.getWasNotTaken());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReasonNotTaken())
      tgt.addReasonNotTaken(convertCodeableConcept(t));
    tgt.setReasonForUse(convertType(src.getReasonForUse()));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    for (org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementDosageComponent t : src.getDosage())
      tgt.addDosage(convertMedicationStatementDosageComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementStatus convertMedicationStatementStatus(org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementStatus.ACTIVE;
    case COMPLETED: return org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementStatus.ENTEREDINERROR;
    case INTENDED: return org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementStatus.INTENDED;
    default: return org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus convertMedicationStatementStatus(org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case ACTIVE: return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.ACTIVE;
    case COMPLETED: return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.ENTEREDINERROR;
    case INTENDED: return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.INTENDED;
    default: return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementDosageComponent convertMedicationStatementDosageComponent(org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementDosageComponent tgt = new org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementDosageComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setTiming(convertTiming(src.getTiming()));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setQuantity(convertType(src.getQuantity()));
    tgt.setRate(convertType(src.getRate()));
    tgt.setMaxDosePerPeriod(convertRatio(src.getMaxDosePerPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent convertMedicationStatementDosageComponent(org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementDosageComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent tgt = new org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent();
    copyElement(src, tgt);
    tgt.setText(src.getText());
    tgt.setTiming(convertTiming(src.getTiming()));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setSite(convertType(src.getSite()));
    tgt.setRoute(convertCodeableConcept(src.getRoute()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setQuantity(convertType(src.getQuantity()));
    tgt.setRate(convertType(src.getRate()));
    tgt.setMaxDosePerPeriod(convertRatio(src.getMaxDosePerPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MessageHeader convertMessageHeader(org.hl7.fhir.dstu2.model.MessageHeader src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MessageHeader tgt = new org.hl7.fhir.dstu3.model.MessageHeader();
    copyDomainResource(src, tgt);
    tgt.setTimestamp(src.getTimestamp());
    tgt.setEvent(convertCoding(src.getEvent()));
    tgt.setResponse(convertMessageHeaderResponseComponent(src.getResponse()));
    tgt.setSource(convertMessageSourceComponent(src.getSource()));
    for (org.hl7.fhir.dstu2.model.MessageHeader.MessageDestinationComponent t : src.getDestination())
      tgt.addDestination(convertMessageDestinationComponent(t));
    tgt.setEnterer(convertReference(src.getEnterer()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setReceiver(convertReference(src.getReceiver()));
    tgt.setResponsible(convertReference(src.getResponsible()));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getData())
      tgt.addData(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MessageHeader convertMessageHeader(org.hl7.fhir.dstu3.model.MessageHeader src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MessageHeader tgt = new org.hl7.fhir.dstu2.model.MessageHeader();
    copyDomainResource(src, tgt);
    tgt.setTimestamp(src.getTimestamp());
    tgt.setEvent(convertCoding(src.getEvent()));
    tgt.setResponse(convertMessageHeaderResponseComponent(src.getResponse()));
    tgt.setSource(convertMessageSourceComponent(src.getSource()));
    for (org.hl7.fhir.dstu3.model.MessageHeader.MessageDestinationComponent t : src.getDestination())
      tgt.addDestination(convertMessageDestinationComponent(t));
    tgt.setEnterer(convertReference(src.getEnterer()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setReceiver(convertReference(src.getReceiver()));
    tgt.setResponsible(convertReference(src.getResponsible()));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getData())
      tgt.addData(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MessageHeader.MessageHeaderResponseComponent convertMessageHeaderResponseComponent(org.hl7.fhir.dstu2.model.MessageHeader.MessageHeaderResponseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MessageHeader.MessageHeaderResponseComponent tgt = new org.hl7.fhir.dstu3.model.MessageHeader.MessageHeaderResponseComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(src.getIdentifier());
    tgt.setCode(convertResponseType(src.getCode()));
    tgt.setDetails(convertReference(src.getDetails()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MessageHeader.MessageHeaderResponseComponent convertMessageHeaderResponseComponent(org.hl7.fhir.dstu3.model.MessageHeader.MessageHeaderResponseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MessageHeader.MessageHeaderResponseComponent tgt = new org.hl7.fhir.dstu2.model.MessageHeader.MessageHeaderResponseComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(src.getIdentifier());
    tgt.setCode(convertResponseType(src.getCode()));
    tgt.setDetails(convertReference(src.getDetails()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.MessageHeader.ResponseType convertResponseType(org.hl7.fhir.dstu2.model.MessageHeader.ResponseType src) {
    if (src == null)
      return null;
    switch (src) {
    case OK: return org.hl7.fhir.dstu3.model.MessageHeader.ResponseType.OK;
    case TRANSIENTERROR: return org.hl7.fhir.dstu3.model.MessageHeader.ResponseType.TRANSIENTERROR;
    case FATALERROR: return org.hl7.fhir.dstu3.model.MessageHeader.ResponseType.FATALERROR;
    default: return org.hl7.fhir.dstu3.model.MessageHeader.ResponseType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.MessageHeader.ResponseType convertResponseType(org.hl7.fhir.dstu3.model.MessageHeader.ResponseType src) {
    if (src == null)
      return null;
    switch (src) {
    case OK: return org.hl7.fhir.dstu2.model.MessageHeader.ResponseType.OK;
    case TRANSIENTERROR: return org.hl7.fhir.dstu2.model.MessageHeader.ResponseType.TRANSIENTERROR;
    case FATALERROR: return org.hl7.fhir.dstu2.model.MessageHeader.ResponseType.FATALERROR;
    default: return org.hl7.fhir.dstu2.model.MessageHeader.ResponseType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.MessageHeader.MessageSourceComponent convertMessageSourceComponent(org.hl7.fhir.dstu2.model.MessageHeader.MessageSourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MessageHeader.MessageSourceComponent tgt = new org.hl7.fhir.dstu3.model.MessageHeader.MessageSourceComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setSoftware(src.getSoftware());
    tgt.setVersion(src.getVersion());
    tgt.setContact(convertContactPoint(src.getContact()));
    tgt.setEndpoint(src.getEndpoint());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MessageHeader.MessageSourceComponent convertMessageSourceComponent(org.hl7.fhir.dstu3.model.MessageHeader.MessageSourceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MessageHeader.MessageSourceComponent tgt = new org.hl7.fhir.dstu2.model.MessageHeader.MessageSourceComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setSoftware(src.getSoftware());
    tgt.setVersion(src.getVersion());
    tgt.setContact(convertContactPoint(src.getContact()));
    tgt.setEndpoint(src.getEndpoint());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MessageHeader.MessageDestinationComponent convertMessageDestinationComponent(org.hl7.fhir.dstu2.model.MessageHeader.MessageDestinationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.MessageHeader.MessageDestinationComponent tgt = new org.hl7.fhir.dstu3.model.MessageHeader.MessageDestinationComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setEndpoint(src.getEndpoint());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.MessageHeader.MessageDestinationComponent convertMessageDestinationComponent(org.hl7.fhir.dstu3.model.MessageHeader.MessageDestinationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.MessageHeader.MessageDestinationComponent tgt = new org.hl7.fhir.dstu2.model.MessageHeader.MessageDestinationComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setEndpoint(src.getEndpoint());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NamingSystem convertNamingSystem(org.hl7.fhir.dstu2.model.NamingSystem src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NamingSystem tgt = new org.hl7.fhir.dstu3.model.NamingSystem();
    copyDomainResource(src, tgt);
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertNamingSystemType(src.getKind()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent t : src.getContact())
      tgt.addContact(convertNamingSystemContactComponent(t));
    tgt.setResponsible(src.getResponsible());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setUsage(src.getUsage());
    for (org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent t : src.getUniqueId())
      tgt.addUniqueId(convertNamingSystemUniqueIdComponent(t));
    tgt.setReplacedBy(convertReference(src.getReplacedBy()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NamingSystem convertNamingSystem(org.hl7.fhir.dstu3.model.NamingSystem src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NamingSystem tgt = new org.hl7.fhir.dstu2.model.NamingSystem();
    copyDomainResource(src, tgt);
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertNamingSystemType(src.getKind()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent t : src.getContact())
      tgt.addContact(convertNamingSystemContactComponent(t));
    tgt.setResponsible(src.getResponsible());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setUsage(src.getUsage());
    for (org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent t : src.getUniqueId())
      tgt.addUniqueId(convertNamingSystemUniqueIdComponent(t));
    tgt.setReplacedBy(convertReference(src.getReplacedBy()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType convertNamingSystemType(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType src) {
    if (src == null)
      return null;
    switch (src) {
    case CODESYSTEM: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.CODESYSTEM;
    case IDENTIFIER: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.IDENTIFIER;
    case ROOT: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.ROOT;
    default: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType convertNamingSystemType(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType src) {
    if (src == null)
      return null;
    switch (src) {
    case CODESYSTEM: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.CODESYSTEM;
    case IDENTIFIER: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.IDENTIFIER;
    case ROOT: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.ROOT;
    default: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent convertNamingSystemContactComponent(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent tgt = new org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent convertNamingSystemContactComponent(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent tgt = new org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent convertNamingSystemUniqueIdComponent(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent tgt = new org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent();
    copyElement(src, tgt);
    tgt.setType(convertNamingSystemIdentifierType(src.getType()));
    tgt.setValue(src.getValue());
    tgt.setPreferred(src.getPreferred());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent convertNamingSystemUniqueIdComponent(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent tgt = new org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent();
    copyElement(src, tgt);
    tgt.setType(convertNamingSystemIdentifierType(src.getType()));
    tgt.setValue(src.getValue());
    tgt.setPreferred(src.getPreferred());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType convertNamingSystemIdentifierType(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType src) {
    if (src == null)
      return null;
    switch (src) {
    case OID: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.OID;
    case UUID: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.UUID;
    case URI: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.URI;
    case OTHER: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.OTHER;
    default: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType convertNamingSystemIdentifierType(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType src) {
    if (src == null)
      return null;
    switch (src) {
    case OID: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.OID;
    case UUID: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.UUID;
    case URI: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.URI;
    case OTHER: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.OTHER;
    default: return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.NutritionOrder convertNutritionOrder(org.hl7.fhir.dstu2.model.NutritionOrder src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NutritionOrder tgt = new org.hl7.fhir.dstu3.model.NutritionOrder();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertNutritionOrderStatus(src.getStatus()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setDateTime(src.getDateTime());
    tgt.setOrderer(convertReference(src.getOrderer()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAllergyIntolerance())
      tgt.addAllergyIntolerance(convertReference(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getFoodPreferenceModifier())
      tgt.addFoodPreferenceModifier(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getExcludeFoodModifier())
      tgt.addExcludeFoodModifier(convertCodeableConcept(t));
    tgt.setOralDiet(convertNutritionOrderOralDietComponent(src.getOralDiet()));
    for (org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderSupplementComponent t : src.getSupplement())
      tgt.addSupplement(convertNutritionOrderSupplementComponent(t));
    tgt.setEnteralFormula(convertNutritionOrderEnteralFormulaComponent(src.getEnteralFormula()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NutritionOrder convertNutritionOrder(org.hl7.fhir.dstu3.model.NutritionOrder src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NutritionOrder tgt = new org.hl7.fhir.dstu2.model.NutritionOrder();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertNutritionOrderStatus(src.getStatus()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setDateTime(src.getDateTime());
    tgt.setOrderer(convertReference(src.getOrderer()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAllergyIntolerance())
      tgt.addAllergyIntolerance(convertReference(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getFoodPreferenceModifier())
      tgt.addFoodPreferenceModifier(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getExcludeFoodModifier())
      tgt.addExcludeFoodModifier(convertCodeableConcept(t));
    tgt.setOralDiet(convertNutritionOrderOralDietComponent(src.getOralDiet()));
    for (org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderSupplementComponent t : src.getSupplement())
      tgt.addSupplement(convertNutritionOrderSupplementComponent(t));
    tgt.setEnteralFormula(convertNutritionOrderEnteralFormulaComponent(src.getEnteralFormula()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus convertNutritionOrderStatus(org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.DRAFT;
    case PLANNED: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.REQUESTED;
    case ACTIVE: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.ACTIVE;
    case ONHOLD: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.CANCELLED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus convertNutritionOrderStatus(org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.DRAFT;
    case PLANNED: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.PLANNED;
    case REQUESTED: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.REQUESTED;
    case ACTIVE: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.ACTIVE;
    case ONHOLD: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.ONHOLD;
    case COMPLETED: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.COMPLETED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.CANCELLED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietComponent convertNutritionOrderOralDietComponent(org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietComponent tgt = new org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Timing t : src.getSchedule())
      tgt.addSchedule(convertTiming(t));
    for (org.hl7.fhir.dstu2.model.oralDiet.NutritionOrderOralDietNutrientComponent t : src.getNutrient())
      tgt.addNutrient(convertNutritionOrderOralDietNutrientComponent(t));
    for (org.hl7.fhir.dstu2.model.oralDiet.NutritionOrderOralDietTextureComponent t : src.getTexture())
      tgt.addTexture(convertNutritionOrderOralDietTextureComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getFluidConsistencyType())
      tgt.addFluidConsistencyType(convertCodeableConcept(t));
    tgt.setInstruction(src.getInstruction());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietComponent convertNutritionOrderOralDietComponent(org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietComponent tgt = new org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getType())
      tgt.addType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Timing t : src.getSchedule())
      tgt.addSchedule(convertTiming(t));
    for (org.hl7.fhir.dstu3.model.oralDiet.NutritionOrderOralDietNutrientComponent t : src.getNutrient())
      tgt.addNutrient(convertNutritionOrderOralDietNutrientComponent(t));
    for (org.hl7.fhir.dstu3.model.oralDiet.NutritionOrderOralDietTextureComponent t : src.getTexture())
      tgt.addTexture(convertNutritionOrderOralDietTextureComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getFluidConsistencyType())
      tgt.addFluidConsistencyType(convertCodeableConcept(t));
    tgt.setInstruction(src.getInstruction());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietNutrientComponent convertNutritionOrderOralDietNutrientComponent(org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietNutrientComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietNutrientComponent tgt = new org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietNutrientComponent();
    copyElement(src, tgt);
    tgt.setModifier(convertCodeableConcept(src.getModifier()));
    tgt.setAmount(convertSimpleQuantity(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietNutrientComponent convertNutritionOrderOralDietNutrientComponent(org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietNutrientComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietNutrientComponent tgt = new org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietNutrientComponent();
    copyElement(src, tgt);
    tgt.setModifier(convertCodeableConcept(src.getModifier()));
    tgt.setAmount(convertSimpleQuantity(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietTextureComponent convertNutritionOrderOralDietTextureComponent(org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietTextureComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietTextureComponent tgt = new org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietTextureComponent();
    copyElement(src, tgt);
    tgt.setModifier(convertCodeableConcept(src.getModifier()));
    tgt.setFoodType(convertCodeableConcept(src.getFoodType()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietTextureComponent convertNutritionOrderOralDietTextureComponent(org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderOralDietTextureComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietTextureComponent tgt = new org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderOralDietTextureComponent();
    copyElement(src, tgt);
    tgt.setModifier(convertCodeableConcept(src.getModifier()));
    tgt.setFoodType(convertCodeableConcept(src.getFoodType()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderSupplementComponent convertNutritionOrderSupplementComponent(org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderSupplementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderSupplementComponent tgt = new org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderSupplementComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setProductName(src.getProductName());
    for (org.hl7.fhir.dstu2.model.Timing t : src.getSchedule())
      tgt.addSchedule(convertTiming(t));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setInstruction(src.getInstruction());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderSupplementComponent convertNutritionOrderSupplementComponent(org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderSupplementComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderSupplementComponent tgt = new org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderSupplementComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setProductName(src.getProductName());
    for (org.hl7.fhir.dstu3.model.Timing t : src.getSchedule())
      tgt.addSchedule(convertTiming(t));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setInstruction(src.getInstruction());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaComponent convertNutritionOrderEnteralFormulaComponent(org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaComponent tgt = new org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaComponent();
    copyElement(src, tgt);
    tgt.setBaseFormulaType(convertCodeableConcept(src.getBaseFormulaType()));
    tgt.setBaseFormulaProductName(src.getBaseFormulaProductName());
    tgt.setAdditiveType(convertCodeableConcept(src.getAdditiveType()));
    tgt.setAdditiveProductName(src.getAdditiveProductName());
    tgt.setCaloricDensity(convertSimpleQuantity(src.getCaloricDensity()));
    tgt.setRouteofAdministration(convertCodeableConcept(src.getRouteofAdministration()));
    for (org.hl7.fhir.dstu2.model.enteralFormula.NutritionOrderEnteralFormulaAdministrationComponent t : src.getAdministration())
      tgt.addAdministration(convertNutritionOrderEnteralFormulaAdministrationComponent(t));
    tgt.setMaxVolumeToDeliver(convertSimpleQuantity(src.getMaxVolumeToDeliver()));
    tgt.setAdministrationInstruction(src.getAdministrationInstruction());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaComponent convertNutritionOrderEnteralFormulaComponent(org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaComponent tgt = new org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaComponent();
    copyElement(src, tgt);
    tgt.setBaseFormulaType(convertCodeableConcept(src.getBaseFormulaType()));
    tgt.setBaseFormulaProductName(src.getBaseFormulaProductName());
    tgt.setAdditiveType(convertCodeableConcept(src.getAdditiveType()));
    tgt.setAdditiveProductName(src.getAdditiveProductName());
    tgt.setCaloricDensity(convertSimpleQuantity(src.getCaloricDensity()));
    tgt.setRouteofAdministration(convertCodeableConcept(src.getRouteofAdministration()));
    for (org.hl7.fhir.dstu3.model.enteralFormula.NutritionOrderEnteralFormulaAdministrationComponent t : src.getAdministration())
      tgt.addAdministration(convertNutritionOrderEnteralFormulaAdministrationComponent(t));
    tgt.setMaxVolumeToDeliver(convertSimpleQuantity(src.getMaxVolumeToDeliver()));
    tgt.setAdministrationInstruction(src.getAdministrationInstruction());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent convertNutritionOrderEnteralFormulaAdministrationComponent(org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent tgt = new org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent();
    copyElement(src, tgt);
    tgt.setSchedule(convertTiming(src.getSchedule()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setRate(convertType(src.getRate()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent convertNutritionOrderEnteralFormulaAdministrationComponent(org.hl7.fhir.dstu3.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent tgt = new org.hl7.fhir.dstu2.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent();
    copyElement(src, tgt);
    tgt.setSchedule(convertTiming(src.getSchedule()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setRate(convertType(src.getRate()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Observation convertObservation(org.hl7.fhir.dstu2.model.Observation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Observation tgt = new org.hl7.fhir.dstu3.model.Observation();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertObservationStatus(src.getStatus()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setEffective(convertType(src.getEffective()));
    tgt.setIssued(src.getIssued());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getPerformer())
      tgt.addPerformer(convertReference(t));
    tgt.setValue(convertType(src.getValue()));
    tgt.setDataAbsentReason(convertCodeableConcept(src.getDataAbsentReason()));
    tgt.setInterpretation(convertCodeableConcept(src.getInterpretation()));
    tgt.setComment(src.getComment());
    tgt.setBodySite(convertCodeableConcept(src.getBodySite()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setSpecimen(convertReference(src.getSpecimen()));
    tgt.setDevice(convertReference(src.getDevice()));
    for (org.hl7.fhir.dstu2.model.Observation.ObservationReferenceRangeComponent t : src.getReferenceRange())
      tgt.addReferenceRange(convertObservationReferenceRangeComponent(t));
    for (org.hl7.fhir.dstu2.model.Observation.ObservationRelatedComponent t : src.getRelated())
      tgt.addRelated(convertObservationRelatedComponent(t));
    for (org.hl7.fhir.dstu2.model.Observation.ObservationComponentComponent t : src.getComponent())
      tgt.addComponent(convertObservationComponentComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Observation convertObservation(org.hl7.fhir.dstu3.model.Observation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Observation tgt = new org.hl7.fhir.dstu2.model.Observation();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setStatus(convertObservationStatus(src.getStatus()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setEffective(convertType(src.getEffective()));
    tgt.setIssued(src.getIssued());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getPerformer())
      tgt.addPerformer(convertReference(t));
    tgt.setValue(convertType(src.getValue()));
    tgt.setDataAbsentReason(convertCodeableConcept(src.getDataAbsentReason()));
    tgt.setInterpretation(convertCodeableConcept(src.getInterpretation()));
    tgt.setComment(src.getComment());
    tgt.setBodySite(convertCodeableConcept(src.getBodySite()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setSpecimen(convertReference(src.getSpecimen()));
    tgt.setDevice(convertReference(src.getDevice()));
    for (org.hl7.fhir.dstu3.model.Observation.ObservationReferenceRangeComponent t : src.getReferenceRange())
      tgt.addReferenceRange(convertObservationReferenceRangeComponent(t));
    for (org.hl7.fhir.dstu3.model.Observation.ObservationRelatedComponent t : src.getRelated())
      tgt.addRelated(convertObservationRelatedComponent(t));
    for (org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent t : src.getComponent())
      tgt.addComponent(convertObservationComponentComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Observation.ObservationStatus convertObservationStatus(org.hl7.fhir.dstu2.model.Observation.ObservationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REGISTERED: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.REGISTERED;
    case PRELIMINARY: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.PRELIMINARY;
    case FINAL: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.FINAL;
    case AMENDED: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.AMENDED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.CANCELLED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.ENTEREDINERROR;
    case UNKNOWN: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.UNKNOWN;
    default: return org.hl7.fhir.dstu3.model.Observation.ObservationStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Observation.ObservationStatus convertObservationStatus(org.hl7.fhir.dstu3.model.Observation.ObservationStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REGISTERED: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.REGISTERED;
    case PRELIMINARY: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.PRELIMINARY;
    case FINAL: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.FINAL;
    case AMENDED: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.AMENDED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.CANCELLED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.ENTEREDINERROR;
    case UNKNOWN: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.UNKNOWN;
    default: return org.hl7.fhir.dstu2.model.Observation.ObservationStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Observation.ObservationReferenceRangeComponent convertObservationReferenceRangeComponent(org.hl7.fhir.dstu2.model.Observation.ObservationReferenceRangeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Observation.ObservationReferenceRangeComponent tgt = new org.hl7.fhir.dstu3.model.Observation.ObservationReferenceRangeComponent();
    copyElement(src, tgt);
    tgt.setLow(convertSimpleQuantity(src.getLow()));
    tgt.setHigh(convertSimpleQuantity(src.getHigh()));
    tgt.setMeaning(convertCodeableConcept(src.getMeaning()));
    tgt.setAge(convertRange(src.getAge()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Observation.ObservationReferenceRangeComponent convertObservationReferenceRangeComponent(org.hl7.fhir.dstu3.model.Observation.ObservationReferenceRangeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Observation.ObservationReferenceRangeComponent tgt = new org.hl7.fhir.dstu2.model.Observation.ObservationReferenceRangeComponent();
    copyElement(src, tgt);
    tgt.setLow(convertSimpleQuantity(src.getLow()));
    tgt.setHigh(convertSimpleQuantity(src.getHigh()));
    tgt.setMeaning(convertCodeableConcept(src.getMeaning()));
    tgt.setAge(convertRange(src.getAge()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Observation.ObservationRelatedComponent convertObservationRelatedComponent(org.hl7.fhir.dstu2.model.Observation.ObservationRelatedComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Observation.ObservationRelatedComponent tgt = new org.hl7.fhir.dstu3.model.Observation.ObservationRelatedComponent();
    copyElement(src, tgt);
    tgt.setType(convertObservationRelationshipType(src.getType()));
    tgt.setTarget(convertReference(src.getTarget()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Observation.ObservationRelatedComponent convertObservationRelatedComponent(org.hl7.fhir.dstu3.model.Observation.ObservationRelatedComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Observation.ObservationRelatedComponent tgt = new org.hl7.fhir.dstu2.model.Observation.ObservationRelatedComponent();
    copyElement(src, tgt);
    tgt.setType(convertObservationRelationshipType(src.getType()));
    tgt.setTarget(convertReference(src.getTarget()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType convertObservationRelationshipType(org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType src) {
    if (src == null)
      return null;
    switch (src) {
    case HASMEMBER: return org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType.HASMEMBER;
    case DERIVEDFROM: return org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType.DERIVEDFROM;
    case SEQUELTO: return org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType.SEQUELTO;
    case REPLACES: return org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType.REPLACES;
    case QUALIFIEDBY: return org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType.QUALIFIEDBY;
    case INTERFEREDBY: return org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType.INTERFEREDBY;
    default: return org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType convertObservationRelationshipType(org.hl7.fhir.dstu3.model.Observation.ObservationRelationshipType src) {
    if (src == null)
      return null;
    switch (src) {
    case HASMEMBER: return org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType.HASMEMBER;
    case DERIVEDFROM: return org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType.DERIVEDFROM;
    case SEQUELTO: return org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType.SEQUELTO;
    case REPLACES: return org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType.REPLACES;
    case QUALIFIEDBY: return org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType.QUALIFIEDBY;
    case INTERFEREDBY: return org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType.INTERFEREDBY;
    default: return org.hl7.fhir.dstu2.model.Observation.ObservationRelationshipType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent convertObservationComponentComponent(org.hl7.fhir.dstu2.model.Observation.ObservationComponentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent tgt = new org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setValue(convertType(src.getValue()));
    tgt.setDataAbsentReason(convertCodeableConcept(src.getDataAbsentReason()));
    for (org.hl7.fhir.dstu2.model.Observation.ObservationReferenceRangeComponent t : src.getReferenceRange())
      tgt.addReferenceRange(convertObservationReferenceRangeComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Observation.ObservationComponentComponent convertObservationComponentComponent(org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Observation.ObservationComponentComponent tgt = new org.hl7.fhir.dstu2.model.Observation.ObservationComponentComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setValue(convertType(src.getValue()));
    tgt.setDataAbsentReason(convertCodeableConcept(src.getDataAbsentReason()));
    for (org.hl7.fhir.dstu3.model.Observation.ObservationReferenceRangeComponent t : src.getReferenceRange())
      tgt.addReferenceRange(convertObservationReferenceRangeComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.dstu2.model.OperationDefinition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition tgt = new org.hl7.fhir.dstu3.model.OperationDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertOperationKind(src.getKind()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertOperationDefinitionContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setIdempotent(src.getIdempotent());
    tgt.setCode(src.getCode());
    tgt.setComment(src.getComment());
    tgt.setBase(convertReference(src.getBase()));
    tgt.setSystem(src.getSystem());
    for (org.hl7.fhir.dstu2.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    tgt.setInstance(src.getInstance());
    for (org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter())
      tgt.addParameter(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.dstu3.model.OperationDefinition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.OperationDefinition tgt = new org.hl7.fhir.dstu2.model.OperationDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertOperationKind(src.getKind()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertOperationDefinitionContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setIdempotent(src.getIdempotent());
    tgt.setCode(src.getCode());
    tgt.setComment(src.getComment());
    tgt.setBase(convertReference(src.getBase()));
    tgt.setSystem(src.getSystem());
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    tgt.setInstance(src.getInstance());
    for (org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter())
      tgt.addParameter(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind src) {
    if (src == null)
      return null;
    switch (src) {
    case OPERATION: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind.OPERATION;
    case QUERY: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind.QUERY;
    default: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind src) {
    if (src == null)
      return null;
    switch (src) {
    case OPERATION: return org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind.OPERATION;
    case QUERY: return org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind.QUERY;
    default: return org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent convertOperationDefinitionContactComponent(org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent tgt = new org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent convertOperationDefinitionContactComponent(org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent tgt = new org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setUse(convertOperationParameterUse(src.getUse()));
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setDocumentation(src.getDocumentation());
    tgt.setType(src.getType());
    tgt.setSearchType(convertSearchParamType(src.getSearchType()));
    tgt.setProfile(convertReference(src.getProfile()));
    tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart())
      tgt.addPart(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setUse(convertOperationParameterUse(src.getUse()));
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setDocumentation(src.getDocumentation());
    tgt.setType(src.getType());
    tgt.setSearchType(convertSearchParamType(src.getSearchType()));
    tgt.setProfile(convertReference(src.getProfile()));
    tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart())
      tgt.addPart(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse src) {
    if (src == null)
      return null;
    switch (src) {
    case IN: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse.IN;
    case OUT: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse.OUT;
    default: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse src) {
    if (src == null)
      return null;
    switch (src) {
    case IN: return org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse.IN;
    case OUT: return org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse.OUT;
    default: return org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OperationOutcome convertOperationOutcome(org.hl7.fhir.dstu2.model.OperationOutcome src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.OperationOutcome tgt = new org.hl7.fhir.dstu3.model.OperationOutcome();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.OperationOutcome.OperationOutcomeIssueComponent t : src.getIssue())
      tgt.addIssue(convertOperationOutcomeIssueComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OperationOutcome convertOperationOutcome(org.hl7.fhir.dstu3.model.OperationOutcome src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.OperationOutcome tgt = new org.hl7.fhir.dstu2.model.OperationOutcome();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent t : src.getIssue())
      tgt.addIssue(convertOperationOutcomeIssueComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent convertOperationOutcomeIssueComponent(org.hl7.fhir.dstu2.model.OperationOutcome.OperationOutcomeIssueComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent tgt = new org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent();
    copyElement(src, tgt);
    tgt.setSeverity(convertIssueSeverity(src.getSeverity()));
    tgt.setCode(convertIssueType(src.getCode()));
    tgt.setDetails(convertCodeableConcept(src.getDetails()));
    tgt.setDiagnostics(src.getDiagnostics());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getLocation())
      tgt.addLocation(t.getValue());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getExpression())
      tgt.addExpression(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OperationOutcome.OperationOutcomeIssueComponent convertOperationOutcomeIssueComponent(org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.OperationOutcome.OperationOutcomeIssueComponent tgt = new org.hl7.fhir.dstu2.model.OperationOutcome.OperationOutcomeIssueComponent();
    copyElement(src, tgt);
    tgt.setSeverity(convertIssueSeverity(src.getSeverity()));
    tgt.setCode(convertIssueType(src.getCode()));
    tgt.setDetails(convertCodeableConcept(src.getDetails()));
    tgt.setDiagnostics(src.getDiagnostics());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getLocation())
      tgt.addLocation(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getExpression())
      tgt.addExpression(t.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity convertIssueSeverity(org.hl7.fhir.dstu2.model.OperationOutcome.IssueSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case FATAL: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.FATAL;
    case ERROR: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.WARNING;
    case INFORMATION: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.INFORMATION;
    default: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.OperationOutcome.IssueSeverity convertIssueSeverity(org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity src) {
    if (src == null)
      return null;
    switch (src) {
    case FATAL: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueSeverity.FATAL;
    case ERROR: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueSeverity.WARNING;
    case INFORMATION: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueSeverity.INFORMATION;
    default: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueSeverity.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.OperationOutcome.IssueType convertIssueType(org.hl7.fhir.dstu2.model.OperationOutcome.IssueType src) {
    if (src == null)
      return null;
    switch (src) {
    case INVALID: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INVALID;
    case STRUCTURE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.STRUCTURE;
    case REQUIRED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.REQUIRED;
    case VALUE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.VALUE;
    case INVARIANT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INVARIANT;
    case SECURITY: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.SECURITY;
    case LOGIN: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.LOGIN;
    case UNKNOWN: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.UNKNOWN;
    case EXPIRED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.EXPIRED;
    case FORBIDDEN: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.FORBIDDEN;
    case SUPPRESSED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.SUPPRESSED;
    case PROCESSING: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.PROCESSING;
    case NOTSUPPORTED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NOTSUPPORTED;
    case DUPLICATE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.DUPLICATE;
    case NOTFOUND: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NOTFOUND;
    case TOOLONG: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TOOLONG;
    case CODEINVALID: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.CODEINVALID;
    case EXTENSION: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.EXTENSION;
    case TOOCOSTLY: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TOOCOSTLY;
    case BUSINESSRULE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.BUSINESSRULE;
    case CONFLICT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.CONFLICT;
    case INCOMPLETE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INCOMPLETE;
    case TRANSIENT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TRANSIENT;
    case LOCKERROR: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.LOCKERROR;
    case NOSTORE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NOSTORE;
    case EXCEPTION: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.EXCEPTION;
    case TIMEOUT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TIMEOUT;
    case THROTTLED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.THROTTLED;
    case INFORMATIONAL: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INFORMATIONAL;
    default: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.OperationOutcome.IssueType convertIssueType(org.hl7.fhir.dstu3.model.OperationOutcome.IssueType src) {
    if (src == null)
      return null;
    switch (src) {
    case INVALID: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.INVALID;
    case STRUCTURE: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.STRUCTURE;
    case REQUIRED: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.REQUIRED;
    case VALUE: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.VALUE;
    case INVARIANT: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.INVARIANT;
    case SECURITY: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.SECURITY;
    case LOGIN: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.LOGIN;
    case UNKNOWN: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.UNKNOWN;
    case EXPIRED: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.EXPIRED;
    case FORBIDDEN: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.FORBIDDEN;
    case SUPPRESSED: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.SUPPRESSED;
    case PROCESSING: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.PROCESSING;
    case NOTSUPPORTED: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.NOTSUPPORTED;
    case DUPLICATE: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.DUPLICATE;
    case NOTFOUND: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.NOTFOUND;
    case TOOLONG: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.TOOLONG;
    case CODEINVALID: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.CODEINVALID;
    case EXTENSION: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.EXTENSION;
    case TOOCOSTLY: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.TOOCOSTLY;
    case BUSINESSRULE: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.BUSINESSRULE;
    case CONFLICT: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.CONFLICT;
    case INCOMPLETE: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.INCOMPLETE;
    case TRANSIENT: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.TRANSIENT;
    case LOCKERROR: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.LOCKERROR;
    case NOSTORE: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.NOSTORE;
    case EXCEPTION: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.EXCEPTION;
    case TIMEOUT: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.TIMEOUT;
    case THROTTLED: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.THROTTLED;
    case INFORMATIONAL: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.INFORMATIONAL;
    default: return org.hl7.fhir.dstu2.model.OperationOutcome.IssueType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Order convertOrder(org.hl7.fhir.dstu2.model.Order src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Order tgt = new org.hl7.fhir.dstu3.model.Order();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDate(src.getDate());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setSource(convertReference(src.getSource()));
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setReason(convertType(src.getReason()));
    tgt.setWhen(convertOrderWhenComponent(src.getWhen()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getDetail())
      tgt.addDetail(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Order convertOrder(org.hl7.fhir.dstu3.model.Order src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Order tgt = new org.hl7.fhir.dstu2.model.Order();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDate(src.getDate());
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setSource(convertReference(src.getSource()));
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setReason(convertType(src.getReason()));
    tgt.setWhen(convertOrderWhenComponent(src.getWhen()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getDetail())
      tgt.addDetail(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Order.OrderWhenComponent convertOrderWhenComponent(org.hl7.fhir.dstu2.model.Order.OrderWhenComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Order.OrderWhenComponent tgt = new org.hl7.fhir.dstu3.model.Order.OrderWhenComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSchedule(convertTiming(src.getSchedule()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Order.OrderWhenComponent convertOrderWhenComponent(org.hl7.fhir.dstu3.model.Order.OrderWhenComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Order.OrderWhenComponent tgt = new org.hl7.fhir.dstu2.model.Order.OrderWhenComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSchedule(convertTiming(src.getSchedule()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OrderResponse convertOrderResponse(org.hl7.fhir.dstu2.model.OrderResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.OrderResponse tgt = new org.hl7.fhir.dstu3.model.OrderResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setDate(src.getDate());
    tgt.setWho(convertReference(src.getWho()));
    tgt.setOrderStatus(convertOrderStatus(src.getOrderStatus()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getFulfillment())
      tgt.addFulfillment(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.OrderResponse convertOrderResponse(org.hl7.fhir.dstu3.model.OrderResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.OrderResponse tgt = new org.hl7.fhir.dstu2.model.OrderResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setDate(src.getDate());
    tgt.setWho(convertReference(src.getWho()));
    tgt.setOrderStatus(convertOrderStatus(src.getOrderStatus()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getFulfillment())
      tgt.addFulfillment(convertReference(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus convertOrderStatus(org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PENDING: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.PENDING;
    case REVIEW: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.REVIEW;
    case REJECTED: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.REJECTED;
    case ERROR: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.ERROR;
    case ACCEPTED: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.ACCEPTED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.CANCELLED;
    case REPLACED: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.REPLACED;
    case ABORTED: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.ABORTED;
    case COMPLETED: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.COMPLETED;
    default: return org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus convertOrderStatus(org.hl7.fhir.dstu3.model.OrderResponse.OrderStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PENDING: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.PENDING;
    case REVIEW: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.REVIEW;
    case REJECTED: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.REJECTED;
    case ERROR: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.ERROR;
    case ACCEPTED: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.ACCEPTED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.CANCELLED;
    case REPLACED: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.REPLACED;
    case ABORTED: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.ABORTED;
    case COMPLETED: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.COMPLETED;
    default: return org.hl7.fhir.dstu2.model.OrderResponse.OrderStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Organization convertOrganization(org.hl7.fhir.dstu2.model.Organization src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Organization tgt = new org.hl7.fhir.dstu3.model.Organization();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setActive(src.getActive());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu2.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setPartOf(convertReference(src.getPartOf()));
    for (org.hl7.fhir.dstu2.model.Organization.OrganizationContactComponent t : src.getContact())
      tgt.addContact(convertOrganizationContactComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Organization convertOrganization(org.hl7.fhir.dstu3.model.Organization src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Organization tgt = new org.hl7.fhir.dstu2.model.Organization();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setActive(src.getActive());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu3.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setPartOf(convertReference(src.getPartOf()));
    for (org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent t : src.getContact())
      tgt.addContact(convertOrganizationContactComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent convertOrganizationContactComponent(org.hl7.fhir.dstu2.model.Organization.OrganizationContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent tgt = new org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent();
    copyElement(src, tgt);
    tgt.setPurpose(convertCodeableConcept(src.getPurpose()));
    tgt.setName(convertHumanName(src.getName()));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setAddress(convertAddress(src.getAddress()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Organization.OrganizationContactComponent convertOrganizationContactComponent(org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Organization.OrganizationContactComponent tgt = new org.hl7.fhir.dstu2.model.Organization.OrganizationContactComponent();
    copyElement(src, tgt);
    tgt.setPurpose(convertCodeableConcept(src.getPurpose()));
    tgt.setName(convertHumanName(src.getName()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setAddress(convertAddress(src.getAddress()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient convertPatient(org.hl7.fhir.dstu2.model.Patient src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient tgt = new org.hl7.fhir.dstu3.model.Patient();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setActive(src.getActive());
    for (org.hl7.fhir.dstu2.model.HumanName t : src.getName())
      tgt.addName(convertHumanName(t));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    tgt.setDeceased(convertType(src.getDeceased()));
    for (org.hl7.fhir.dstu2.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setMaritalStatus(convertCodeableConcept(src.getMaritalStatus()));
    tgt.setMultipleBirth(convertType(src.getMultipleBirth()));
    for (org.hl7.fhir.dstu2.model.Attachment t : src.getPhoto())
      tgt.addPhoto(convertAttachment(t));
    for (org.hl7.fhir.dstu2.model.Patient.ContactComponent t : src.getContact())
      tgt.addContact(convertContactComponent(t));
    tgt.setAnimal(convertAnimalComponent(src.getAnimal()));
    for (org.hl7.fhir.dstu2.model.Patient.PatientCommunicationComponent t : src.getCommunication())
      tgt.addCommunication(convertPatientCommunicationComponent(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getCareProvider())
      tgt.addCareProvider(convertReference(t));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    for (org.hl7.fhir.dstu2.model.Patient.PatientLinkComponent t : src.getLink())
      tgt.addLink(convertPatientLinkComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Patient convertPatient(org.hl7.fhir.dstu3.model.Patient src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Patient tgt = new org.hl7.fhir.dstu2.model.Patient();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setActive(src.getActive());
    for (org.hl7.fhir.dstu3.model.HumanName t : src.getName())
      tgt.addName(convertHumanName(t));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    tgt.setDeceased(convertType(src.getDeceased()));
    for (org.hl7.fhir.dstu3.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setMaritalStatus(convertCodeableConcept(src.getMaritalStatus()));
    tgt.setMultipleBirth(convertType(src.getMultipleBirth()));
    for (org.hl7.fhir.dstu3.model.Attachment t : src.getPhoto())
      tgt.addPhoto(convertAttachment(t));
    for (org.hl7.fhir.dstu3.model.Patient.ContactComponent t : src.getContact())
      tgt.addContact(convertContactComponent(t));
    tgt.setAnimal(convertAnimalComponent(src.getAnimal()));
    for (org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent t : src.getCommunication())
      tgt.addCommunication(convertPatientCommunicationComponent(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getCareProvider())
      tgt.addCareProvider(convertReference(t));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    for (org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent t : src.getLink())
      tgt.addLink(convertPatientLinkComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient.ContactComponent convertContactComponent(org.hl7.fhir.dstu2.model.Patient.ContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient.ContactComponent tgt = new org.hl7.fhir.dstu3.model.Patient.ContactComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getRelationship())
      tgt.addRelationship(convertCodeableConcept(t));
    tgt.setName(convertHumanName(src.getName()));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setAddress(convertAddress(src.getAddress()));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Patient.ContactComponent convertContactComponent(org.hl7.fhir.dstu3.model.Patient.ContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Patient.ContactComponent tgt = new org.hl7.fhir.dstu2.model.Patient.ContactComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getRelationship())
      tgt.addRelationship(convertCodeableConcept(t));
    tgt.setName(convertHumanName(src.getName()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setAddress(convertAddress(src.getAddress()));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient.AnimalComponent convertAnimalComponent(org.hl7.fhir.dstu2.model.Patient.AnimalComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient.AnimalComponent tgt = new org.hl7.fhir.dstu3.model.Patient.AnimalComponent();
    copyElement(src, tgt);
    tgt.setSpecies(convertCodeableConcept(src.getSpecies()));
    tgt.setBreed(convertCodeableConcept(src.getBreed()));
    tgt.setGenderStatus(convertCodeableConcept(src.getGenderStatus()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Patient.AnimalComponent convertAnimalComponent(org.hl7.fhir.dstu3.model.Patient.AnimalComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Patient.AnimalComponent tgt = new org.hl7.fhir.dstu2.model.Patient.AnimalComponent();
    copyElement(src, tgt);
    tgt.setSpecies(convertCodeableConcept(src.getSpecies()));
    tgt.setBreed(convertCodeableConcept(src.getBreed()));
    tgt.setGenderStatus(convertCodeableConcept(src.getGenderStatus()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent convertPatientCommunicationComponent(org.hl7.fhir.dstu2.model.Patient.PatientCommunicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent tgt = new org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(convertCodeableConcept(src.getLanguage()));
    tgt.setPreferred(src.getPreferred());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Patient.PatientCommunicationComponent convertPatientCommunicationComponent(org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Patient.PatientCommunicationComponent tgt = new org.hl7.fhir.dstu2.model.Patient.PatientCommunicationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(convertCodeableConcept(src.getLanguage()));
    tgt.setPreferred(src.getPreferred());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent convertPatientLinkComponent(org.hl7.fhir.dstu2.model.Patient.PatientLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent tgt = new org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent();
    copyElement(src, tgt);
    tgt.setOther(convertReference(src.getOther()));
    tgt.setType(convertLinkType(src.getType()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Patient.PatientLinkComponent convertPatientLinkComponent(org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Patient.PatientLinkComponent tgt = new org.hl7.fhir.dstu2.model.Patient.PatientLinkComponent();
    copyElement(src, tgt);
    tgt.setOther(convertReference(src.getOther()));
    tgt.setType(convertLinkType(src.getType()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Patient.LinkType convertLinkType(org.hl7.fhir.dstu2.model.Patient.LinkType src) {
    if (src == null)
      return null;
    switch (src) {
    case REPLACE: return org.hl7.fhir.dstu3.model.Patient.LinkType.REPLACE;
    case REFER: return org.hl7.fhir.dstu3.model.Patient.LinkType.REFER;
    case SEEALSO: return org.hl7.fhir.dstu3.model.Patient.LinkType.SEEALSO;
    default: return org.hl7.fhir.dstu3.model.Patient.LinkType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Patient.LinkType convertLinkType(org.hl7.fhir.dstu3.model.Patient.LinkType src) {
    if (src == null)
      return null;
    switch (src) {
    case REPLACE: return org.hl7.fhir.dstu2.model.Patient.LinkType.REPLACE;
    case REFER: return org.hl7.fhir.dstu2.model.Patient.LinkType.REFER;
    case SEEALSO: return org.hl7.fhir.dstu2.model.Patient.LinkType.SEEALSO;
    default: return org.hl7.fhir.dstu2.model.Patient.LinkType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.PaymentNotice convertPaymentNotice(org.hl7.fhir.dstu2.model.PaymentNotice src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.PaymentNotice tgt = new org.hl7.fhir.dstu3.model.PaymentNotice();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertType(src.getTarget()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setResponse(convertType(src.getResponse()));
    tgt.setPaymentStatus(convertCoding(src.getPaymentStatus()));
    tgt.setStatusDate(src.getStatusDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.PaymentNotice convertPaymentNotice(org.hl7.fhir.dstu3.model.PaymentNotice src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.PaymentNotice tgt = new org.hl7.fhir.dstu2.model.PaymentNotice();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertType(src.getTarget()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setResponse(convertType(src.getResponse()));
    tgt.setPaymentStatus(convertCoding(src.getPaymentStatus()));
    tgt.setStatusDate(src.getStatusDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.PaymentReconciliation convertPaymentReconciliation(org.hl7.fhir.dstu2.model.PaymentReconciliation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.PaymentReconciliation tgt = new org.hl7.fhir.dstu3.model.PaymentReconciliation();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequestProvider(convertType(src.getRequestProvider()));
    tgt.setRequestOrganization(convertType(src.getRequestOrganization()));
    for (org.hl7.fhir.dstu2.model.PaymentReconciliation.DetailsComponent t : src.getDetail())
      tgt.addDetail(convertDetailsComponent(t));
    tgt.setForm(convertCoding(src.getForm()));
    tgt.setTotal(convertMoney(src.getTotal()));
    for (org.hl7.fhir.dstu2.model.PaymentReconciliation.NotesComponent t : src.getNote())
      tgt.addNote(convertNotesComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.PaymentReconciliation convertPaymentReconciliation(org.hl7.fhir.dstu3.model.PaymentReconciliation src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.PaymentReconciliation tgt = new org.hl7.fhir.dstu2.model.PaymentReconciliation();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setOutcome(convertRemittanceOutcome(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequestProvider(convertType(src.getRequestProvider()));
    tgt.setRequestOrganization(convertType(src.getRequestOrganization()));
    for (org.hl7.fhir.dstu3.model.PaymentReconciliation.DetailsComponent t : src.getDetail())
      tgt.addDetail(convertDetailsComponent(t));
    tgt.setForm(convertCoding(src.getForm()));
    tgt.setTotal(convertMoney(src.getTotal()));
    for (org.hl7.fhir.dstu3.model.PaymentReconciliation.NotesComponent t : src.getNote())
      tgt.addNote(convertNotesComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.PaymentReconciliation.DetailsComponent convertDetailsComponent(org.hl7.fhir.dstu2.model.PaymentReconciliation.DetailsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.PaymentReconciliation.DetailsComponent tgt = new org.hl7.fhir.dstu3.model.PaymentReconciliation.DetailsComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setResponce(convertType(src.getResponce()));
    tgt.setSubmitter(convertType(src.getSubmitter()));
    tgt.setPayee(convertType(src.getPayee()));
    tgt.setDate(src.getDate());
    tgt.setAmount(convertMoney(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.PaymentReconciliation.DetailsComponent convertDetailsComponent(org.hl7.fhir.dstu3.model.PaymentReconciliation.DetailsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.PaymentReconciliation.DetailsComponent tgt = new org.hl7.fhir.dstu2.model.PaymentReconciliation.DetailsComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setResponce(convertType(src.getResponce()));
    tgt.setSubmitter(convertType(src.getSubmitter()));
    tgt.setPayee(convertType(src.getPayee()));
    tgt.setDate(src.getDate());
    tgt.setAmount(convertMoney(src.getAmount()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.PaymentReconciliation.NotesComponent convertNotesComponent(org.hl7.fhir.dstu2.model.PaymentReconciliation.NotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.PaymentReconciliation.NotesComponent tgt = new org.hl7.fhir.dstu3.model.PaymentReconciliation.NotesComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.PaymentReconciliation.NotesComponent convertNotesComponent(org.hl7.fhir.dstu3.model.PaymentReconciliation.NotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.PaymentReconciliation.NotesComponent tgt = new org.hl7.fhir.dstu2.model.PaymentReconciliation.NotesComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Person convertPerson(org.hl7.fhir.dstu2.model.Person src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Person tgt = new org.hl7.fhir.dstu3.model.Person();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu2.model.HumanName t : src.getName())
      tgt.addName(convertHumanName(t));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    for (org.hl7.fhir.dstu2.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setPhoto(convertAttachment(src.getPhoto()));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    tgt.setActive(src.getActive());
    for (org.hl7.fhir.dstu2.model.Person.PersonLinkComponent t : src.getLink())
      tgt.addLink(convertPersonLinkComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Person convertPerson(org.hl7.fhir.dstu3.model.Person src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Person tgt = new org.hl7.fhir.dstu2.model.Person();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu3.model.HumanName t : src.getName())
      tgt.addName(convertHumanName(t));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    for (org.hl7.fhir.dstu3.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setPhoto(convertAttachment(src.getPhoto()));
    tgt.setManagingOrganization(convertReference(src.getManagingOrganization()));
    tgt.setActive(src.getActive());
    for (org.hl7.fhir.dstu3.model.Person.PersonLinkComponent t : src.getLink())
      tgt.addLink(convertPersonLinkComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Person.PersonLinkComponent convertPersonLinkComponent(org.hl7.fhir.dstu2.model.Person.PersonLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Person.PersonLinkComponent tgt = new org.hl7.fhir.dstu3.model.Person.PersonLinkComponent();
    copyElement(src, tgt);
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setAssurance(convertIdentityAssuranceLevel(src.getAssurance()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Person.PersonLinkComponent convertPersonLinkComponent(org.hl7.fhir.dstu3.model.Person.PersonLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Person.PersonLinkComponent tgt = new org.hl7.fhir.dstu2.model.Person.PersonLinkComponent();
    copyElement(src, tgt);
    tgt.setTarget(convertReference(src.getTarget()));
    tgt.setAssurance(convertIdentityAssuranceLevel(src.getAssurance()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Person.IdentityAssuranceLevel convertIdentityAssuranceLevel(org.hl7.fhir.dstu2.model.Person.IdentityAssuranceLevel src) {
    if (src == null)
      return null;
    switch (src) {
    case LEVEL1: return org.hl7.fhir.dstu3.model.Person.IdentityAssuranceLevel.LEVEL1;
    case LEVEL2: return org.hl7.fhir.dstu3.model.Person.IdentityAssuranceLevel.LEVEL2;
    case LEVEL3: return org.hl7.fhir.dstu3.model.Person.IdentityAssuranceLevel.LEVEL3;
    case LEVEL4: return org.hl7.fhir.dstu3.model.Person.IdentityAssuranceLevel.LEVEL4;
    default: return org.hl7.fhir.dstu3.model.Person.IdentityAssuranceLevel.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Person.IdentityAssuranceLevel convertIdentityAssuranceLevel(org.hl7.fhir.dstu3.model.Person.IdentityAssuranceLevel src) {
    if (src == null)
      return null;
    switch (src) {
    case LEVEL1: return org.hl7.fhir.dstu2.model.Person.IdentityAssuranceLevel.LEVEL1;
    case LEVEL2: return org.hl7.fhir.dstu2.model.Person.IdentityAssuranceLevel.LEVEL2;
    case LEVEL3: return org.hl7.fhir.dstu2.model.Person.IdentityAssuranceLevel.LEVEL3;
    case LEVEL4: return org.hl7.fhir.dstu2.model.Person.IdentityAssuranceLevel.LEVEL4;
    default: return org.hl7.fhir.dstu2.model.Person.IdentityAssuranceLevel.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Practitioner convertPractitioner(org.hl7.fhir.dstu2.model.Practitioner src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Practitioner tgt = new org.hl7.fhir.dstu3.model.Practitioner();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setActive(src.getActive());
    for (org.hl7.fhir.dstu2.model.HumanName t : src.getName())
      tgt.addName(convertHumanName(t));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu2.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    for (org.hl7.fhir.dstu2.model.Attachment t : src.getPhoto())
      tgt.addPhoto(convertAttachment(t));
    for (org.hl7.fhir.dstu2.model.Practitioner.PractitionerPractitionerRoleComponent t : src.getPractitionerRole())
      tgt.addPractitionerRole(convertPractitionerPractitionerRoleComponent(t));
    for (org.hl7.fhir.dstu2.model.Practitioner.PractitionerQualificationComponent t : src.getQualification())
      tgt.addQualification(convertPractitionerQualificationComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCommunication())
      tgt.addCommunication(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Practitioner convertPractitioner(org.hl7.fhir.dstu3.model.Practitioner src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Practitioner tgt = new org.hl7.fhir.dstu2.model.Practitioner();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setActive(src.getActive());
    for (org.hl7.fhir.dstu3.model.HumanName t : src.getName())
      tgt.addName(convertHumanName(t));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu3.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    for (org.hl7.fhir.dstu3.model.Attachment t : src.getPhoto())
      tgt.addPhoto(convertAttachment(t));
    for (org.hl7.fhir.dstu3.model.Practitioner.PractitionerPractitionerRoleComponent t : src.getPractitionerRole())
      tgt.addPractitionerRole(convertPractitionerPractitionerRoleComponent(t));
    for (org.hl7.fhir.dstu3.model.Practitioner.PractitionerQualificationComponent t : src.getQualification())
      tgt.addQualification(convertPractitionerQualificationComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getCommunication())
      tgt.addCommunication(convertCodeableConcept(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Practitioner.PractitionerPractitionerRoleComponent convertPractitionerPractitionerRoleComponent(org.hl7.fhir.dstu2.model.Practitioner.PractitionerPractitionerRoleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Practitioner.PractitionerPractitionerRoleComponent tgt = new org.hl7.fhir.dstu3.model.Practitioner.PractitionerPractitionerRoleComponent();
    copyElement(src, tgt);
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setRole(convertCodeableConcept(src.getRole()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getLocation())
      tgt.addLocation(convertReference(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getHealthcareService())
      tgt.addHealthcareService(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Practitioner.PractitionerPractitionerRoleComponent convertPractitionerPractitionerRoleComponent(org.hl7.fhir.dstu3.model.Practitioner.PractitionerPractitionerRoleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Practitioner.PractitionerPractitionerRoleComponent tgt = new org.hl7.fhir.dstu2.model.Practitioner.PractitionerPractitionerRoleComponent();
    copyElement(src, tgt);
    tgt.setOrganization(convertReference(src.getOrganization()));
    tgt.setRole(convertCodeableConcept(src.getRole()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getLocation())
      tgt.addLocation(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getHealthcareService())
      tgt.addHealthcareService(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Practitioner.PractitionerQualificationComponent convertPractitionerQualificationComponent(org.hl7.fhir.dstu2.model.Practitioner.PractitionerQualificationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Practitioner.PractitionerQualificationComponent tgt = new org.hl7.fhir.dstu3.model.Practitioner.PractitionerQualificationComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setIssuer(convertReference(src.getIssuer()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Practitioner.PractitionerQualificationComponent convertPractitionerQualificationComponent(org.hl7.fhir.dstu3.model.Practitioner.PractitionerQualificationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Practitioner.PractitionerQualificationComponent tgt = new org.hl7.fhir.dstu2.model.Practitioner.PractitionerQualificationComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setIssuer(convertReference(src.getIssuer()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Procedure convertProcedure(org.hl7.fhir.dstu2.model.Procedure src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Procedure tgt = new org.hl7.fhir.dstu3.model.Procedure();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setStatus(convertProcedureStatus(src.getStatus()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setNotPerformed(src.getNotPerformed());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReasonNotPerformed())
      tgt.addReasonNotPerformed(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(convertCodeableConcept(t));
    tgt.setReason(convertType(src.getReason()));
    for (org.hl7.fhir.dstu2.model.Procedure.ProcedurePerformerComponent t : src.getPerformer())
      tgt.addPerformer(convertProcedurePerformerComponent(t));
    tgt.setPerformed(convertType(src.getPerformed()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setOutcome(convertCodeableConcept(src.getOutcome()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getReport())
      tgt.addReport(convertReference(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getComplication())
      tgt.addComplication(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getFollowUp())
      tgt.addFollowUp(convertCodeableConcept(t));
    tgt.setRequest(convertReference(src.getRequest()));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNotes())
      tgt.addNotes(convertAnnotation(t));
    for (org.hl7.fhir.dstu2.model.Procedure.ProcedureFocalDeviceComponent t : src.getFocalDevice())
      tgt.addFocalDevice(convertProcedureFocalDeviceComponent(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getUsed())
      tgt.addUsed(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Procedure convertProcedure(org.hl7.fhir.dstu3.model.Procedure src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Procedure tgt = new org.hl7.fhir.dstu2.model.Procedure();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setStatus(convertProcedureStatus(src.getStatus()));
    tgt.setCategory(convertCodeableConcept(src.getCategory()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setNotPerformed(src.getNotPerformed());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getReasonNotPerformed())
      tgt.addReasonNotPerformed(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(convertCodeableConcept(t));
    tgt.setReason(convertType(src.getReason()));
    for (org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent t : src.getPerformer())
      tgt.addPerformer(convertProcedurePerformerComponent(t));
    tgt.setPerformed(convertType(src.getPerformed()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setLocation(convertReference(src.getLocation()));
    tgt.setOutcome(convertCodeableConcept(src.getOutcome()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getReport())
      tgt.addReport(convertReference(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getComplication())
      tgt.addComplication(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getFollowUp())
      tgt.addFollowUp(convertCodeableConcept(t));
    tgt.setRequest(convertReference(src.getRequest()));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNotes())
      tgt.addNotes(convertAnnotation(t));
    for (org.hl7.fhir.dstu3.model.Procedure.ProcedureFocalDeviceComponent t : src.getFocalDevice())
      tgt.addFocalDevice(convertProcedureFocalDeviceComponent(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getUsed())
      tgt.addUsed(convertReference(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus convertProcedureStatus(org.hl7.fhir.dstu2.model.Procedure.ProcedureStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus.INPROGRESS;
    case ABORTED: return org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus.ABORTED;
    case COMPLETED: return org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Procedure.ProcedureStatus convertProcedureStatus(org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2.model.Procedure.ProcedureStatus.INPROGRESS;
    case ABORTED: return org.hl7.fhir.dstu2.model.Procedure.ProcedureStatus.ABORTED;
    case COMPLETED: return org.hl7.fhir.dstu2.model.Procedure.ProcedureStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Procedure.ProcedureStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.Procedure.ProcedureStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent convertProcedurePerformerComponent(org.hl7.fhir.dstu2.model.Procedure.ProcedurePerformerComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent tgt = new org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent();
    copyElement(src, tgt);
    tgt.setActor(convertReference(src.getActor()));
    tgt.setRole(convertCodeableConcept(src.getRole()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Procedure.ProcedurePerformerComponent convertProcedurePerformerComponent(org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Procedure.ProcedurePerformerComponent tgt = new org.hl7.fhir.dstu2.model.Procedure.ProcedurePerformerComponent();
    copyElement(src, tgt);
    tgt.setActor(convertReference(src.getActor()));
    tgt.setRole(convertCodeableConcept(src.getRole()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Procedure.ProcedureFocalDeviceComponent convertProcedureFocalDeviceComponent(org.hl7.fhir.dstu2.model.Procedure.ProcedureFocalDeviceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Procedure.ProcedureFocalDeviceComponent tgt = new org.hl7.fhir.dstu3.model.Procedure.ProcedureFocalDeviceComponent();
    copyElement(src, tgt);
    tgt.setAction(convertCodeableConcept(src.getAction()));
    tgt.setManipulated(convertReference(src.getManipulated()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Procedure.ProcedureFocalDeviceComponent convertProcedureFocalDeviceComponent(org.hl7.fhir.dstu3.model.Procedure.ProcedureFocalDeviceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Procedure.ProcedureFocalDeviceComponent tgt = new org.hl7.fhir.dstu2.model.Procedure.ProcedureFocalDeviceComponent();
    copyElement(src, tgt);
    tgt.setAction(convertCodeableConcept(src.getAction()));
    tgt.setManipulated(convertReference(src.getManipulated()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ProcedureRequest convertProcedureRequest(org.hl7.fhir.dstu2.model.ProcedureRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ProcedureRequest tgt = new org.hl7.fhir.dstu3.model.ProcedureRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(convertCodeableConcept(t));
    tgt.setReason(convertType(src.getReason()));
    tgt.setScheduled(convertType(src.getScheduled()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setPerformer(convertReference(src.getPerformer()));
    tgt.setStatus(convertProcedureRequestStatus(src.getStatus()));
    for (org.hl7.fhir.dstu2.model.Annotation t : src.getNotes())
      tgt.addNotes(convertAnnotation(t));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setOrderedOn(src.getOrderedOn());
    tgt.setOrderer(convertReference(src.getOrderer()));
    tgt.setPriority(convertProcedureRequestPriority(src.getPriority()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ProcedureRequest convertProcedureRequest(org.hl7.fhir.dstu3.model.ProcedureRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ProcedureRequest tgt = new org.hl7.fhir.dstu2.model.ProcedureRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getBodySite())
      tgt.addBodySite(convertCodeableConcept(t));
    tgt.setReason(convertType(src.getReason()));
    tgt.setScheduled(convertType(src.getScheduled()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setPerformer(convertReference(src.getPerformer()));
    tgt.setStatus(convertProcedureRequestStatus(src.getStatus()));
    for (org.hl7.fhir.dstu3.model.Annotation t : src.getNotes())
      tgt.addNotes(convertAnnotation(t));
    tgt.setAsNeeded(convertType(src.getAsNeeded()));
    tgt.setOrderedOn(src.getOrderedOn());
    tgt.setOrderer(convertReference(src.getOrderer()));
    tgt.setPriority(convertProcedureRequestPriority(src.getPriority()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus convertProcedureRequestStatus(org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.DRAFT;
    case REQUESTED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.REJECTED;
    case ABORTED: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.ABORTED;
    default: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus convertProcedureRequestStatus(org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.PROPOSED;
    case DRAFT: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.DRAFT;
    case REQUESTED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.REQUESTED;
    case RECEIVED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.RECEIVED;
    case ACCEPTED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.ACCEPTED;
    case INPROGRESS: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.COMPLETED;
    case SUSPENDED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.SUSPENDED;
    case REJECTED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.REJECTED;
    case ABORTED: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.ABORTED;
    default: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestPriority convertProcedureRequestPriority(org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestPriority src) {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestPriority.URGENT;
    case STAT: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestPriority.STAT;
    case ASAP: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestPriority.ASAP;
    default: return org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestPriority.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestPriority convertProcedureRequestPriority(org.hl7.fhir.dstu3.model.ProcedureRequest.ProcedureRequestPriority src) {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestPriority.URGENT;
    case STAT: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestPriority.STAT;
    case ASAP: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestPriority.ASAP;
    default: return org.hl7.fhir.dstu2.model.ProcedureRequest.ProcedureRequestPriority.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ProcessRequest convertProcessRequest(org.hl7.fhir.dstu2.model.ProcessRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ProcessRequest tgt = new org.hl7.fhir.dstu3.model.ProcessRequest();
    copyDomainResource(src, tgt);
    tgt.setAction(convertActionList(src.getAction()));
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertType(src.getTarget()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setResponse(convertType(src.getResponse()));
    tgt.setNullify(src.getNullify());
    tgt.setReference(src.getReference());
    for (org.hl7.fhir.dstu2.model.ProcessRequest.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu2.model.StringType t : src.getInclude())
      tgt.addInclude(t.getValue());
    for (org.hl7.fhir.dstu2.model.StringType t : src.getExclude())
      tgt.addExclude(t.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ProcessRequest convertProcessRequest(org.hl7.fhir.dstu3.model.ProcessRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ProcessRequest tgt = new org.hl7.fhir.dstu2.model.ProcessRequest();
    copyDomainResource(src, tgt);
    tgt.setAction(convertActionList(src.getAction()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setTarget(convertType(src.getTarget()));
    tgt.setProvider(convertType(src.getProvider()));
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setResponse(convertType(src.getResponse()));
    tgt.setNullify(src.getNullify());
    tgt.setReference(src.getReference());
    for (org.hl7.fhir.dstu3.model.ProcessRequest.ItemsComponent t : src.getItem())
      tgt.addItem(convertItemsComponent(t));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getInclude())
      tgt.addInclude(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getExclude())
      tgt.addExclude(t.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ProcessRequest.ActionList convertActionList(org.hl7.fhir.dstu2.model.ProcessRequest.ActionList src) {
    if (src == null)
      return null;
    switch (src) {
    case CANCEL: return org.hl7.fhir.dstu3.model.ProcessRequest.ActionList.CANCEL;
    case POLL: return org.hl7.fhir.dstu3.model.ProcessRequest.ActionList.POLL;
    case REPROCESS: return org.hl7.fhir.dstu3.model.ProcessRequest.ActionList.REPROCESS;
    case STATUS: return org.hl7.fhir.dstu3.model.ProcessRequest.ActionList.STATUS;
    default: return org.hl7.fhir.dstu3.model.ProcessRequest.ActionList.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ProcessRequest.ActionList convertActionList(org.hl7.fhir.dstu3.model.ProcessRequest.ActionList src) {
    if (src == null)
      return null;
    switch (src) {
    case CANCEL: return org.hl7.fhir.dstu2.model.ProcessRequest.ActionList.CANCEL;
    case POLL: return org.hl7.fhir.dstu2.model.ProcessRequest.ActionList.POLL;
    case REPROCESS: return org.hl7.fhir.dstu2.model.ProcessRequest.ActionList.REPROCESS;
    case STATUS: return org.hl7.fhir.dstu2.model.ProcessRequest.ActionList.STATUS;
    default: return org.hl7.fhir.dstu2.model.ProcessRequest.ActionList.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ProcessRequest.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu2.model.ProcessRequest.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ProcessRequest.ItemsComponent tgt = new org.hl7.fhir.dstu3.model.ProcessRequest.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ProcessRequest.ItemsComponent convertItemsComponent(org.hl7.fhir.dstu3.model.ProcessRequest.ItemsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ProcessRequest.ItemsComponent tgt = new org.hl7.fhir.dstu2.model.ProcessRequest.ItemsComponent();
    copyElement(src, tgt);
    tgt.setSequenceLinkId(src.getSequenceLinkId());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ProcessResponse convertProcessResponse(org.hl7.fhir.dstu2.model.ProcessResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ProcessResponse tgt = new org.hl7.fhir.dstu3.model.ProcessResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setOutcome(convertCoding(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequestProvider(convertType(src.getRequestProvider()));
    tgt.setRequestOrganization(convertType(src.getRequestOrganization()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu2.model.ProcessResponse.ProcessResponseNotesComponent t : src.getNotes())
      tgt.addNotes(convertProcessResponseNotesComponent(t));
    for (org.hl7.fhir.dstu2.model.Coding t : src.getError())
      tgt.addError(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ProcessResponse convertProcessResponse(org.hl7.fhir.dstu3.model.ProcessResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ProcessResponse tgt = new org.hl7.fhir.dstu2.model.ProcessResponse();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setRequest(convertType(src.getRequest()));
    tgt.setOutcome(convertCoding(src.getOutcome()));
    tgt.setDisposition(src.getDisposition());
    tgt.setRuleset(convertCoding(src.getRuleset()));
    tgt.setOriginalRuleset(convertCoding(src.getOriginalRuleset()));
    tgt.setCreated(src.getCreated());
    tgt.setOrganization(convertType(src.getOrganization()));
    tgt.setRequestProvider(convertType(src.getRequestProvider()));
    tgt.setRequestOrganization(convertType(src.getRequestOrganization()));
    tgt.setForm(convertCoding(src.getForm()));
    for (org.hl7.fhir.dstu3.model.ProcessResponse.ProcessResponseNotesComponent t : src.getNotes())
      tgt.addNotes(convertProcessResponseNotesComponent(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getError())
      tgt.addError(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ProcessResponse.ProcessResponseNotesComponent convertProcessResponseNotesComponent(org.hl7.fhir.dstu2.model.ProcessResponse.ProcessResponseNotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ProcessResponse.ProcessResponseNotesComponent tgt = new org.hl7.fhir.dstu3.model.ProcessResponse.ProcessResponseNotesComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ProcessResponse.ProcessResponseNotesComponent convertProcessResponseNotesComponent(org.hl7.fhir.dstu3.model.ProcessResponse.ProcessResponseNotesComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ProcessResponse.ProcessResponseNotesComponent tgt = new org.hl7.fhir.dstu2.model.ProcessResponse.ProcessResponseNotesComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Provenance convertProvenance(org.hl7.fhir.dstu2.model.Provenance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Provenance tgt = new org.hl7.fhir.dstu3.model.Provenance();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Reference t : src.getTarget())
      tgt.addTarget(convertReference(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setRecorded(src.getRecorded());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getReason())
      tgt.addReason(convertCoding(t));
    tgt.setActivity(convertCoding(src.getActivity()));
    tgt.setLocation(convertReference(src.getLocation()));
    for (org.hl7.fhir.dstu2.model.UriType t : src.getPolicy())
      tgt.addPolicy(t.getValue());
    for (org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentComponent t : src.getAgent())
      tgt.addAgent(convertProvenanceAgentComponent(t));
    for (org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityComponent t : src.getEntity())
      tgt.addEntity(convertProvenanceEntityComponent(t));
    for (org.hl7.fhir.dstu2.model.Signature t : src.getSignature())
      tgt.addSignature(convertSignature(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Provenance convertProvenance(org.hl7.fhir.dstu3.model.Provenance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Provenance tgt = new org.hl7.fhir.dstu2.model.Provenance();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Reference t : src.getTarget())
      tgt.addTarget(convertReference(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setRecorded(src.getRecorded());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getReason())
      tgt.addReason(convertCoding(t));
    tgt.setActivity(convertCoding(src.getActivity()));
    tgt.setLocation(convertReference(src.getLocation()));
    for (org.hl7.fhir.dstu3.model.UriType t : src.getPolicy())
      tgt.addPolicy(t.getValue());
    for (org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentComponent t : src.getAgent())
      tgt.addAgent(convertProvenanceAgentComponent(t));
    for (org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityComponent t : src.getEntity())
      tgt.addEntity(convertProvenanceEntityComponent(t));
    for (org.hl7.fhir.dstu3.model.Signature t : src.getSignature())
      tgt.addSignature(convertSignature(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentComponent convertProvenanceAgentComponent(org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentComponent tgt = new org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentComponent();
    copyElement(src, tgt);
    tgt.setRole(convertCoding(src.getRole()));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setUserId(convertIdentifier(src.getUserId()));
    for (org.hl7.fhir.dstu2.model.agent.ProvenanceAgentRelatedAgentComponent t : src.getRelatedAgent())
      tgt.addRelatedAgent(convertProvenanceAgentRelatedAgentComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentComponent convertProvenanceAgentComponent(org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentComponent tgt = new org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentComponent();
    copyElement(src, tgt);
    tgt.setRole(convertCoding(src.getRole()));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setUserId(convertIdentifier(src.getUserId()));
    for (org.hl7.fhir.dstu3.model.agent.ProvenanceAgentRelatedAgentComponent t : src.getRelatedAgent())
      tgt.addRelatedAgent(convertProvenanceAgentRelatedAgentComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentRelatedAgentComponent convertProvenanceAgentRelatedAgentComponent(org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentRelatedAgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentRelatedAgentComponent tgt = new org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentRelatedAgentComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setTarget(src.getTarget());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentRelatedAgentComponent convertProvenanceAgentRelatedAgentComponent(org.hl7.fhir.dstu3.model.Provenance.ProvenanceAgentRelatedAgentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentRelatedAgentComponent tgt = new org.hl7.fhir.dstu2.model.Provenance.ProvenanceAgentRelatedAgentComponent();
    copyElement(src, tgt);
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setTarget(src.getTarget());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityComponent convertProvenanceEntityComponent(org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityComponent tgt = new org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityComponent();
    copyElement(src, tgt);
    tgt.setRole(convertProvenanceEntityRole(src.getRole()));
    tgt.setType(convertCoding(src.getType()));
    tgt.setReference(src.getReference());
    tgt.setDisplay(src.getDisplay());
    tgt.setAgent(convertProvenanceAgentComponent(src.getAgent()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityComponent convertProvenanceEntityComponent(org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityComponent tgt = new org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityComponent();
    copyElement(src, tgt);
    tgt.setRole(convertProvenanceEntityRole(src.getRole()));
    tgt.setType(convertCoding(src.getType()));
    tgt.setReference(src.getReference());
    tgt.setDisplay(src.getDisplay());
    tgt.setAgent(convertProvenanceAgentComponent(src.getAgent()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole convertProvenanceEntityRole(org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole src) {
    if (src == null)
      return null;
    switch (src) {
    case DERIVATION: return org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole.DERIVATION;
    case REVISION: return org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole.REVISION;
    case QUOTATION: return org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole.QUOTATION;
    case SOURCE: return org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole.SOURCE;
    case REMOVAL: return org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole.REMOVAL;
    default: return org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole convertProvenanceEntityRole(org.hl7.fhir.dstu3.model.Provenance.ProvenanceEntityRole src) {
    if (src == null)
      return null;
    switch (src) {
    case DERIVATION: return org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole.DERIVATION;
    case REVISION: return org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole.REVISION;
    case QUOTATION: return org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole.QUOTATION;
    case SOURCE: return org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole.SOURCE;
    case REMOVAL: return org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole.REMOVAL;
    default: return org.hl7.fhir.dstu2.model.Provenance.ProvenanceEntityRole.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Questionnaire convertQuestionnaire(org.hl7.fhir.dstu2.model.Questionnaire src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire tgt = new org.hl7.fhir.dstu3.model.Questionnaire();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertQuestionnaireStatus(src.getStatus()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setTitle(src.getTitle());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    for (org.hl7.fhir.dstu2.model.CodeType t : src.getSubjectType())
      tgt.addSubjectType(t.getValue());
    for (org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Questionnaire convertQuestionnaire(org.hl7.fhir.dstu3.model.Questionnaire src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Questionnaire tgt = new org.hl7.fhir.dstu2.model.Questionnaire();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertQuestionnaireStatus(src.getStatus()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setTitle(src.getTitle());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getSubjectType())
      tgt.addSubjectType(t.getValue());
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus convertQuestionnaireStatus(org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.DRAFT;
    case PUBLISHED: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.PUBLISHED;
    case RETIRED: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.RETIRED;
    default: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireStatus convertQuestionnaireStatus(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireStatus.DRAFT;
    case PUBLISHED: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireStatus.PUBLISHED;
    case RETIRED: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireStatus.RETIRED;
    default: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    tgt.setPrefix(src.getPrefix());
    tgt.setText(src.getText());
    tgt.setType(convertQuestionnaireItemType(src.getType()));
    for (org.hl7.fhir.dstu2.model.item.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen())
      tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
    tgt.setRequired(src.getRequired());
    tgt.setRepeats(src.getRepeats());
    tgt.setReadOnly(src.getReadOnly());
    tgt.setMaxLength(src.getMaxLength());
    tgt.setOptions(convertReference(src.getOptions()));
    for (org.hl7.fhir.dstu2.model.item.QuestionnaireItemOptionComponent t : src.getOption())
      tgt.addOption(convertQuestionnaireItemOptionComponent(t));
    tgt.setInitial(convertType(src.getInitial()));
    for (org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    tgt.setPrefix(src.getPrefix());
    tgt.setText(src.getText());
    tgt.setType(convertQuestionnaireItemType(src.getType()));
    for (org.hl7.fhir.dstu3.model.item.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen())
      tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
    tgt.setRequired(src.getRequired());
    tgt.setRepeats(src.getRepeats());
    tgt.setReadOnly(src.getReadOnly());
    tgt.setMaxLength(src.getMaxLength());
    tgt.setOptions(convertReference(src.getOptions()));
    for (org.hl7.fhir.dstu3.model.item.QuestionnaireItemOptionComponent t : src.getOption())
      tgt.addOption(convertQuestionnaireItemOptionComponent(t));
    tgt.setInitial(convertType(src.getInitial()));
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType convertQuestionnaireItemType(org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType src) {
    if (src == null)
      return null;
    switch (src) {
    case GROUP: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.GROUP;
    case DISPLAY: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DISPLAY;
    case QUESTION: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.QUESTION;
    case BOOLEAN: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.BOOLEAN;
    case DECIMAL: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DECIMAL;
    case INTEGER: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.INTEGER;
    case DATE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DATE;
    case DATETIME: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DATETIME;
    case INSTANT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.INSTANT;
    case TIME: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.TIME;
    case STRING: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.STRING;
    case TEXT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.TEXT;
    case URL: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.URL;
    case CHOICE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.CHOICE;
    case OPENCHOICE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.OPENCHOICE;
    case ATTACHMENT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.ATTACHMENT;
    case REFERENCE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.REFERENCE;
    case QUANTITY: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.QUANTITY;
    default: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType convertQuestionnaireItemType(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType src) {
    if (src == null)
      return null;
    switch (src) {
    case GROUP: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.GROUP;
    case DISPLAY: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.DISPLAY;
    case QUESTION: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.QUESTION;
    case BOOLEAN: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.BOOLEAN;
    case DECIMAL: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.DECIMAL;
    case INTEGER: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.INTEGER;
    case DATE: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.DATE;
    case DATETIME: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.DATETIME;
    case INSTANT: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.INSTANT;
    case TIME: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.TIME;
    case STRING: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.STRING;
    case TEXT: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.TEXT;
    case URL: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.URL;
    case CHOICE: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.CHOICE;
    case OPENCHOICE: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.OPENCHOICE;
    case ATTACHMENT: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.ATTACHMENT;
    case REFERENCE: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.REFERENCE;
    case QUANTITY: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.QUANTITY;
    default: return org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
    copyElement(src, tgt);
    tgt.setQuestion(src.getQuestion());
    tgt.setAnswered(src.getAnswered());
    tgt.setAnswer(convertType(src.getAnswer()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
    copyElement(src, tgt);
    tgt.setQuestion(src.getQuestion());
    tgt.setAnswered(src.getAnswered());
    tgt.setAnswer(convertType(src.getAnswer()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemOptionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemOptionComponent tgt = new org.hl7.fhir.dstu2.model.Questionnaire.QuestionnaireItemOptionComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.QuestionnaireResponse convertQuestionnaireResponse(org.hl7.fhir.dstu2.model.QuestionnaireResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.QuestionnaireResponse tgt = new org.hl7.fhir.dstu3.model.QuestionnaireResponse();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setQuestionnaire(convertReference(src.getQuestionnaire()));
    tgt.setStatus(convertQuestionnaireResponseStatus(src.getStatus()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setAuthored(src.getAuthored());
    tgt.setSource(convertReference(src.getSource()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.QuestionnaireResponse convertQuestionnaireResponse(org.hl7.fhir.dstu3.model.QuestionnaireResponse src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.QuestionnaireResponse tgt = new org.hl7.fhir.dstu2.model.QuestionnaireResponse();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setQuestionnaire(convertReference(src.getQuestionnaire()));
    tgt.setStatus(convertQuestionnaireResponseStatus(src.getStatus()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setAuthored(src.getAuthored());
    tgt.setSource(convertReference(src.getSource()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    for (org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus convertQuestionnaireResponseStatus(org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.COMPLETED;
    case AMENDED: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.AMENDED;
    default: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseStatus convertQuestionnaireResponseStatus(org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseStatus.COMPLETED;
    case AMENDED: return org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseStatus.AMENDED;
    default: return org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent convertQuestionnaireResponseItemComponent(org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent tgt = new org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    tgt.setText(src.getText());
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu2.model.item.QuestionnaireResponseItemAnswerComponent t : src.getAnswer())
      tgt.addAnswer(convertQuestionnaireResponseItemAnswerComponent(t));
    for (org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemComponent convertQuestionnaireResponseItemComponent(org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemComponent tgt = new org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    tgt.setText(src.getText());
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu3.model.item.QuestionnaireResponseItemAnswerComponent t : src.getAnswer())
      tgt.addAnswer(convertQuestionnaireResponseItemAnswerComponent(t));
    for (org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent convertQuestionnaireResponseItemAnswerComponent(org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent tgt = new org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    for (org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent convertQuestionnaireResponseItemAnswerComponent(org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent tgt = new org.hl7.fhir.dstu2.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    for (org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ReferralRequest convertReferralRequest(org.hl7.fhir.dstu2.model.ReferralRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ReferralRequest tgt = new org.hl7.fhir.dstu3.model.ReferralRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getBasedOn())
      tgt.addBasedOn(convertReference(t));
    tgt.setParent(convertIdentifier(src.getParent()));
    tgt.setStatus(convertReferralStatus(src.getStatus()));
    tgt.setCategory(convertReferralCategory(src.getCategory()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setContext(convertReference(src.getContext()));
    tgt.setFulfillmentTime(convertPeriod(src.getFulfillmentTime()));
    tgt.setAuthored(src.getAuthored());
    tgt.setRequester(convertReference(src.getRequester()));
    tgt.setSpecialty(convertCodeableConcept(src.getSpecialty()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getServiceRequested())
      tgt.addServiceRequested(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSupportingInformation())
      tgt.addSupportingInformation(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ReferralRequest convertReferralRequest(org.hl7.fhir.dstu3.model.ReferralRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ReferralRequest tgt = new org.hl7.fhir.dstu2.model.ReferralRequest();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getBasedOn())
      tgt.addBasedOn(convertReference(t));
    tgt.setParent(convertIdentifier(src.getParent()));
    tgt.setStatus(convertReferralStatus(src.getStatus()));
    tgt.setCategory(convertReferralCategory(src.getCategory()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setPriority(convertCodeableConcept(src.getPriority()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setContext(convertReference(src.getContext()));
    tgt.setFulfillmentTime(convertPeriod(src.getFulfillmentTime()));
    tgt.setAuthored(src.getAuthored());
    tgt.setRequester(convertReference(src.getRequester()));
    tgt.setSpecialty(convertCodeableConcept(src.getSpecialty()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    tgt.setReason(convertCodeableConcept(src.getReason()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getServiceRequested())
      tgt.addServiceRequested(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSupportingInformation())
      tgt.addSupportingInformation(convertReference(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus convertReferralStatus(org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus.ACTIVE;
    case CANCELLED: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus.CANCELLED;
    case COMPLETED: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus convertReferralStatus(org.hl7.fhir.dstu3.model.ReferralRequest.ReferralStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus.ACTIVE;
    case CANCELLED: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus.CANCELLED;
    case COMPLETED: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.ReferralRequest.ReferralCategory convertReferralCategory(org.hl7.fhir.dstu2.model.ReferralRequest.ReferralCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSAL: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralCategory.PROPOSAL;
    case PLAN: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralCategory.PLAN;
    case REQUEST: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralCategory.REQUEST;
    default: return org.hl7.fhir.dstu3.model.ReferralRequest.ReferralCategory.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ReferralRequest.ReferralCategory convertReferralCategory(org.hl7.fhir.dstu3.model.ReferralRequest.ReferralCategory src) {
    if (src == null)
      return null;
    switch (src) {
    case PROPOSAL: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralCategory.PROPOSAL;
    case PLAN: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralCategory.PLAN;
    case REQUEST: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralCategory.REQUEST;
    default: return org.hl7.fhir.dstu2.model.ReferralRequest.ReferralCategory.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.RelatedPerson convertRelatedPerson(org.hl7.fhir.dstu2.model.RelatedPerson src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.RelatedPerson tgt = new org.hl7.fhir.dstu3.model.RelatedPerson();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setRelationship(convertCodeableConcept(src.getRelationship()));
    tgt.setName(convertHumanName(src.getName()));
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    for (org.hl7.fhir.dstu2.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    for (org.hl7.fhir.dstu2.model.Attachment t : src.getPhoto())
      tgt.addPhoto(convertAttachment(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.RelatedPerson convertRelatedPerson(org.hl7.fhir.dstu3.model.RelatedPerson src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.RelatedPerson tgt = new org.hl7.fhir.dstu2.model.RelatedPerson();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setRelationship(convertCodeableConcept(src.getRelationship()));
    tgt.setName(convertHumanName(src.getName()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    tgt.setGender(convertAdministrativeGender(src.getGender()));
    tgt.setBirthDate(src.getBirthDate());
    for (org.hl7.fhir.dstu3.model.Address t : src.getAddress())
      tgt.addAddress(convertAddress(t));
    for (org.hl7.fhir.dstu3.model.Attachment t : src.getPhoto())
      tgt.addPhoto(convertAttachment(t));
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.RiskAssessment convertRiskAssessment(org.hl7.fhir.dstu2.model.RiskAssessment src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.RiskAssessment tgt = new org.hl7.fhir.dstu3.model.RiskAssessment();
    copyDomainResource(src, tgt);
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setDate(src.getDate());
    tgt.setCondition(convertReference(src.getCondition()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setPerformer(convertReference(src.getPerformer()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getBasis())
      tgt.addBasis(convertReference(t));
    for (org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent t : src.getPrediction())
      tgt.addPrediction(convertRiskAssessmentPredictionComponent(t));
    tgt.setMitigation(src.getMitigation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.RiskAssessment convertRiskAssessment(org.hl7.fhir.dstu3.model.RiskAssessment src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.RiskAssessment tgt = new org.hl7.fhir.dstu2.model.RiskAssessment();
    copyDomainResource(src, tgt);
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setDate(src.getDate());
    tgt.setCondition(convertReference(src.getCondition()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setPerformer(convertReference(src.getPerformer()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getBasis())
      tgt.addBasis(convertReference(t));
    for (org.hl7.fhir.dstu3.model.RiskAssessment.RiskAssessmentPredictionComponent t : src.getPrediction())
      tgt.addPrediction(convertRiskAssessmentPredictionComponent(t));
    tgt.setMitigation(src.getMitigation());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.RiskAssessment.RiskAssessmentPredictionComponent convertRiskAssessmentPredictionComponent(org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.RiskAssessment.RiskAssessmentPredictionComponent tgt = new org.hl7.fhir.dstu3.model.RiskAssessment.RiskAssessmentPredictionComponent();
    copyElement(src, tgt);
    tgt.setOutcome(convertCodeableConcept(src.getOutcome()));
    tgt.setProbability(convertType(src.getProbability()));
    tgt.setRelativeRisk(src.getRelativeRisk());
    tgt.setWhen(convertType(src.getWhen()));
    tgt.setRationale(src.getRationale());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent convertRiskAssessmentPredictionComponent(org.hl7.fhir.dstu3.model.RiskAssessment.RiskAssessmentPredictionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent tgt = new org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent();
    copyElement(src, tgt);
    tgt.setOutcome(convertCodeableConcept(src.getOutcome()));
    tgt.setProbability(convertType(src.getProbability()));
    tgt.setRelativeRisk(src.getRelativeRisk());
    tgt.setWhen(convertType(src.getWhen()));
    tgt.setRationale(src.getRationale());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Schedule convertSchedule(org.hl7.fhir.dstu2.model.Schedule src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Schedule tgt = new org.hl7.fhir.dstu3.model.Schedule();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setServiceCategory(convertCodeableConcept(src.getServiceCategory()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getServiceType())
      tgt.addServiceType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setPlanningHorizon(convertPeriod(src.getPlanningHorizon()));
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Schedule convertSchedule(org.hl7.fhir.dstu3.model.Schedule src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Schedule tgt = new org.hl7.fhir.dstu2.model.Schedule();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setServiceCategory(convertCodeableConcept(src.getServiceCategory()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getServiceType())
      tgt.addServiceType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    tgt.setActor(convertReference(src.getActor()));
    tgt.setPlanningHorizon(convertPeriod(src.getPlanningHorizon()));
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.SearchParameter convertSearchParameter(org.hl7.fhir.dstu2.model.SearchParameter src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.SearchParameter tgt = new org.hl7.fhir.dstu3.model.SearchParameter();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.SearchParameter.SearchParameterContactComponent t : src.getContact())
      tgt.addContact(convertSearchParameterContactComponent(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCode(src.getCode());
    tgt.setBase(src.getBase());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDescription(src.getDescription());
    tgt.setExpression(src.getExpression());
    tgt.setXpath(src.getXpath());
    tgt.setXpathUsage(convertXPathUsageType(src.getXpathUsage()));
    for (org.hl7.fhir.dstu2.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.SearchParameter convertSearchParameter(org.hl7.fhir.dstu3.model.SearchParameter src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.SearchParameter tgt = new org.hl7.fhir.dstu2.model.SearchParameter();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent t : src.getContact())
      tgt.addContact(convertSearchParameterContactComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCode(src.getCode());
    tgt.setBase(src.getBase());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDescription(src.getDescription());
    tgt.setExpression(src.getExpression());
    tgt.setXpath(src.getXpath());
    tgt.setXpathUsage(convertXPathUsageType(src.getXpathUsage()));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType convertXPathUsageType(org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType src) {
    if (src == null)
      return null;
    switch (src) {
    case NORMAL: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NORMAL;
    case PHONETIC: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.PHONETIC;
    case NEARBY: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NEARBY;
    case DISTANCE: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.DISTANCE;
    case OTHER: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.OTHER;
    default: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType convertXPathUsageType(org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType src) {
    if (src == null)
      return null;
    switch (src) {
    case NORMAL: return org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType.NORMAL;
    case PHONETIC: return org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType.PHONETIC;
    case NEARBY: return org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType.NEARBY;
    case DISTANCE: return org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType.DISTANCE;
    case OTHER: return org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType.OTHER;
    default: return org.hl7.fhir.dstu2.model.SearchParameter.XPathUsageType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent convertSearchParameterContactComponent(org.hl7.fhir.dstu2.model.SearchParameter.SearchParameterContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent tgt = new org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.SearchParameter.SearchParameterContactComponent convertSearchParameterContactComponent(org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.SearchParameter.SearchParameterContactComponent tgt = new org.hl7.fhir.dstu2.model.SearchParameter.SearchParameterContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Slot convertSlot(org.hl7.fhir.dstu2.model.Slot src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Slot tgt = new org.hl7.fhir.dstu3.model.Slot();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setServiceCategory(convertCodeableConcept(src.getServiceCategory()));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getServiceType())
      tgt.addServiceType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    tgt.setAppointmentType(convertCodeableConcept(src.getAppointmentType()));
    tgt.setSchedule(convertReference(src.getSchedule()));
    tgt.setStatus(convertSlotStatus(src.getStatus()));
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    tgt.setOverbooked(src.getOverbooked());
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Slot convertSlot(org.hl7.fhir.dstu3.model.Slot src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Slot tgt = new org.hl7.fhir.dstu2.model.Slot();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setServiceCategory(convertCodeableConcept(src.getServiceCategory()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getServiceType())
      tgt.addServiceType(convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getSpecialty())
      tgt.addSpecialty(convertCodeableConcept(t));
    tgt.setAppointmentType(convertCodeableConcept(src.getAppointmentType()));
    tgt.setSchedule(convertReference(src.getSchedule()));
    tgt.setStatus(convertSlotStatus(src.getStatus()));
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    tgt.setOverbooked(src.getOverbooked());
    tgt.setComment(src.getComment());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Slot.SlotStatus convertSlotStatus(org.hl7.fhir.dstu2.model.Slot.SlotStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case BUSY: return org.hl7.fhir.dstu3.model.Slot.SlotStatus.BUSY;
    case FREE: return org.hl7.fhir.dstu3.model.Slot.SlotStatus.FREE;
    case BUSYUNAVAILABLE: return org.hl7.fhir.dstu3.model.Slot.SlotStatus.BUSYUNAVAILABLE;
    case BUSYTENTATIVE: return org.hl7.fhir.dstu3.model.Slot.SlotStatus.BUSYTENTATIVE;
    default: return org.hl7.fhir.dstu3.model.Slot.SlotStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Slot.SlotStatus convertSlotStatus(org.hl7.fhir.dstu3.model.Slot.SlotStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case BUSY: return org.hl7.fhir.dstu2.model.Slot.SlotStatus.BUSY;
    case FREE: return org.hl7.fhir.dstu2.model.Slot.SlotStatus.FREE;
    case BUSYUNAVAILABLE: return org.hl7.fhir.dstu2.model.Slot.SlotStatus.BUSYUNAVAILABLE;
    case BUSYTENTATIVE: return org.hl7.fhir.dstu2.model.Slot.SlotStatus.BUSYTENTATIVE;
    default: return org.hl7.fhir.dstu2.model.Slot.SlotStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Specimen convertSpecimen(org.hl7.fhir.dstu2.model.Specimen src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Specimen tgt = new org.hl7.fhir.dstu3.model.Specimen();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setAccessionIdentifier(convertIdentifier(src.getAccessionIdentifier()));
    tgt.setStatus(convertSpecimenStatus(src.getStatus()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setReceivedTime(src.getReceivedTime());
    for (org.hl7.fhir.dstu2.model.Reference t : src.getParent())
      tgt.addParent(convertReference(t));
    tgt.setCollection(convertSpecimenCollectionComponent(src.getCollection()));
    for (org.hl7.fhir.dstu2.model.Specimen.SpecimenTreatmentComponent t : src.getTreatment())
      tgt.addTreatment(convertSpecimenTreatmentComponent(t));
    for (org.hl7.fhir.dstu2.model.Specimen.SpecimenContainerComponent t : src.getContainer())
      tgt.addContainer(convertSpecimenContainerComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Specimen convertSpecimen(org.hl7.fhir.dstu3.model.Specimen src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Specimen tgt = new org.hl7.fhir.dstu2.model.Specimen();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setAccessionIdentifier(convertIdentifier(src.getAccessionIdentifier()));
    tgt.setStatus(convertSpecimenStatus(src.getStatus()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setReceivedTime(src.getReceivedTime());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getParent())
      tgt.addParent(convertReference(t));
    tgt.setCollection(convertSpecimenCollectionComponent(src.getCollection()));
    for (org.hl7.fhir.dstu3.model.Specimen.SpecimenTreatmentComponent t : src.getTreatment())
      tgt.addTreatment(convertSpecimenTreatmentComponent(t));
    for (org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent t : src.getContainer())
      tgt.addContainer(convertSpecimenContainerComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Specimen.SpecimenStatus convertSpecimenStatus(org.hl7.fhir.dstu2.model.Specimen.SpecimenStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case AVAILABLE: return org.hl7.fhir.dstu3.model.Specimen.SpecimenStatus.AVAILABLE;
    case UNAVAILABLE: return org.hl7.fhir.dstu3.model.Specimen.SpecimenStatus.UNAVAILABLE;
    case UNSATISFACTORY: return org.hl7.fhir.dstu3.model.Specimen.SpecimenStatus.UNSATISFACTORY;
    case ENTEREDINERROR: return org.hl7.fhir.dstu3.model.Specimen.SpecimenStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu3.model.Specimen.SpecimenStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Specimen.SpecimenStatus convertSpecimenStatus(org.hl7.fhir.dstu3.model.Specimen.SpecimenStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case AVAILABLE: return org.hl7.fhir.dstu2.model.Specimen.SpecimenStatus.AVAILABLE;
    case UNAVAILABLE: return org.hl7.fhir.dstu2.model.Specimen.SpecimenStatus.UNAVAILABLE;
    case UNSATISFACTORY: return org.hl7.fhir.dstu2.model.Specimen.SpecimenStatus.UNSATISFACTORY;
    case ENTEREDINERROR: return org.hl7.fhir.dstu2.model.Specimen.SpecimenStatus.ENTEREDINERROR;
    default: return org.hl7.fhir.dstu2.model.Specimen.SpecimenStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Specimen.SpecimenCollectionComponent convertSpecimenCollectionComponent(org.hl7.fhir.dstu2.model.Specimen.SpecimenCollectionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Specimen.SpecimenCollectionComponent tgt = new org.hl7.fhir.dstu3.model.Specimen.SpecimenCollectionComponent();
    copyElement(src, tgt);
    tgt.setCollector(convertReference(src.getCollector()));
    tgt.setComment(src.getComment());
    tgt.setCollected(convertType(src.getCollected()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setBodySite(convertCodeableConcept(src.getBodySite()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Specimen.SpecimenCollectionComponent convertSpecimenCollectionComponent(org.hl7.fhir.dstu3.model.Specimen.SpecimenCollectionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Specimen.SpecimenCollectionComponent tgt = new org.hl7.fhir.dstu2.model.Specimen.SpecimenCollectionComponent();
    copyElement(src, tgt);
    tgt.setCollector(convertReference(src.getCollector()));
    tgt.setComment(src.getComment());
    tgt.setCollected(convertType(src.getCollected()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setMethod(convertCodeableConcept(src.getMethod()));
    tgt.setBodySite(convertCodeableConcept(src.getBodySite()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Specimen.SpecimenTreatmentComponent convertSpecimenTreatmentComponent(org.hl7.fhir.dstu2.model.Specimen.SpecimenTreatmentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Specimen.SpecimenTreatmentComponent tgt = new org.hl7.fhir.dstu3.model.Specimen.SpecimenTreatmentComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setProcedure(convertCodeableConcept(src.getProcedure()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getAdditive())
      tgt.addAdditive(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Specimen.SpecimenTreatmentComponent convertSpecimenTreatmentComponent(org.hl7.fhir.dstu3.model.Specimen.SpecimenTreatmentComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Specimen.SpecimenTreatmentComponent tgt = new org.hl7.fhir.dstu2.model.Specimen.SpecimenTreatmentComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setProcedure(convertCodeableConcept(src.getProcedure()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getAdditive())
      tgt.addAdditive(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent convertSpecimenContainerComponent(org.hl7.fhir.dstu2.model.Specimen.SpecimenContainerComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent tgt = new org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDescription(src.getDescription());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setCapacity(convertSimpleQuantity(src.getCapacity()));
    tgt.setSpecimenQuantity(convertSimpleQuantity(src.getSpecimenQuantity()));
    tgt.setAdditive(convertType(src.getAdditive()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Specimen.SpecimenContainerComponent convertSpecimenContainerComponent(org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Specimen.SpecimenContainerComponent tgt = new org.hl7.fhir.dstu2.model.Specimen.SpecimenContainerComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDescription(src.getDescription());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setCapacity(convertSimpleQuantity(src.getCapacity()));
    tgt.setSpecimenQuantity(convertSimpleQuantity(src.getSpecimenQuantity()));
    tgt.setAdditive(convertType(src.getAdditive()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition convertStructureDefinition(org.hl7.fhir.dstu2.model.StructureDefinition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition tgt = new org.hl7.fhir.dstu3.model.StructureDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setDisplay(src.getDisplay());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertStructureDefinitionContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertStructureDefinitionMappingComponent(t));
    tgt.setKind(convertStructureDefinitionKind(src.getKind()));
    tgt.setAbstract(src.getAbstract());
    tgt.setContextType(convertExtensionContext(src.getContextType()));
    for (org.hl7.fhir.dstu2.model.StringType t : src.getContext())
      tgt.addContext(t.getValue());
    tgt.setBaseType(src.getBaseType());
    tgt.setBaseDefinition(src.getBaseDefinition());
    tgt.setDerivation(convertTypeDerivationRule(src.getDerivation()));
    tgt.setSnapshot(convertStructureDefinitionSnapshotComponent(src.getSnapshot()));
    tgt.setDifferential(convertStructureDefinitionDifferentialComponent(src.getDifferential()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.StructureDefinition convertStructureDefinition(org.hl7.fhir.dstu3.model.StructureDefinition src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.StructureDefinition tgt = new org.hl7.fhir.dstu2.model.StructureDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setDisplay(src.getDisplay());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertStructureDefinitionContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertStructureDefinitionMappingComponent(t));
    tgt.setKind(convertStructureDefinitionKind(src.getKind()));
    tgt.setAbstract(src.getAbstract());
    tgt.setContextType(convertExtensionContext(src.getContextType()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getContext())
      tgt.addContext(t.getValue());
    tgt.setBaseType(src.getBaseType());
    tgt.setBaseDefinition(src.getBaseDefinition());
    tgt.setDerivation(convertTypeDerivationRule(src.getDerivation()));
    tgt.setSnapshot(convertStructureDefinitionSnapshotComponent(src.getSnapshot()));
    tgt.setDifferential(convertStructureDefinitionDifferentialComponent(src.getDifferential()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind convertStructureDefinitionKind(org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionKind src) {
    if (src == null)
      return null;
    switch (src) {
    case DATATYPE: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.DATATYPE;
    case RESOURCE: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.RESOURCE;
    case LOGICAL: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.LOGICAL;
    default: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionKind convertStructureDefinitionKind(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind src) {
    if (src == null)
      return null;
    switch (src) {
    case DATATYPE: return org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionKind.DATATYPE;
    case RESOURCE: return org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionKind.RESOURCE;
    case LOGICAL: return org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionKind.LOGICAL;
    default: return org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionKind.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext convertExtensionContext(org.hl7.fhir.dstu2.model.StructureDefinition.ExtensionContext src) {
    if (src == null)
      return null;
    switch (src) {
    case RESOURCE: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.RESOURCE;
    case DATATYPE: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.DATATYPE;
    case EXTENSION: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.EXTENSION;
    default: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.StructureDefinition.ExtensionContext convertExtensionContext(org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext src) {
    if (src == null)
      return null;
    switch (src) {
    case RESOURCE: return org.hl7.fhir.dstu2.model.StructureDefinition.ExtensionContext.RESOURCE;
    case DATATYPE: return org.hl7.fhir.dstu2.model.StructureDefinition.ExtensionContext.DATATYPE;
    case EXTENSION: return org.hl7.fhir.dstu2.model.StructureDefinition.ExtensionContext.EXTENSION;
    default: return org.hl7.fhir.dstu2.model.StructureDefinition.ExtensionContext.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule convertTypeDerivationRule(org.hl7.fhir.dstu2.model.StructureDefinition.TypeDerivationRule src) {
    if (src == null)
      return null;
    switch (src) {
    case SPECIALIZATION: return org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule.SPECIALIZATION;
    case CONSTRAINT: return org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule.CONSTRAINT;
    default: return org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.StructureDefinition.TypeDerivationRule convertTypeDerivationRule(org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule src) {
    if (src == null)
      return null;
    switch (src) {
    case SPECIALIZATION: return org.hl7.fhir.dstu2.model.StructureDefinition.TypeDerivationRule.SPECIALIZATION;
    case CONSTRAINT: return org.hl7.fhir.dstu2.model.StructureDefinition.TypeDerivationRule.CONSTRAINT;
    default: return org.hl7.fhir.dstu2.model.StructureDefinition.TypeDerivationRule.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent convertStructureDefinitionContactComponent(org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionContactComponent convertStructureDefinitionContactComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionContactComponent tgt = new org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent convertStructureDefinitionMappingComponent(org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionMappingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComments(src.getComments());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionMappingComponent convertStructureDefinitionMappingComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionMappingComponent tgt = new org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComments(src.getComments());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent convertStructureDefinitionSnapshotComponent(org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionSnapshotComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionSnapshotComponent convertStructureDefinitionSnapshotComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionSnapshotComponent tgt = new org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionSnapshotComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent convertStructureDefinitionDifferentialComponent(org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionDifferentialComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionDifferentialComponent convertStructureDefinitionDifferentialComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionDifferentialComponent tgt = new org.hl7.fhir.dstu2.model.StructureDefinition.StructureDefinitionDifferentialComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Subscription convertSubscription(org.hl7.fhir.dstu2.model.Subscription src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Subscription tgt = new org.hl7.fhir.dstu3.model.Subscription();
    copyDomainResource(src, tgt);
    tgt.setCriteria(src.getCriteria());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getContact())
      tgt.addContact(convertContactPoint(t));
    tgt.setReason(src.getReason());
    tgt.setStatus(convertSubscriptionStatus(src.getStatus()));
    tgt.setError(src.getError());
    tgt.setChannel(convertSubscriptionChannelComponent(src.getChannel()));
    tgt.setEnd(src.getEnd());
    for (org.hl7.fhir.dstu2.model.Coding t : src.getTag())
      tgt.addTag(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Subscription convertSubscription(org.hl7.fhir.dstu3.model.Subscription src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Subscription tgt = new org.hl7.fhir.dstu2.model.Subscription();
    copyDomainResource(src, tgt);
    tgt.setCriteria(src.getCriteria());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getContact())
      tgt.addContact(convertContactPoint(t));
    tgt.setReason(src.getReason());
    tgt.setStatus(convertSubscriptionStatus(src.getStatus()));
    tgt.setError(src.getError());
    tgt.setChannel(convertSubscriptionChannelComponent(src.getChannel()));
    tgt.setEnd(src.getEnd());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getTag())
      tgt.addTag(convertCoding(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Subscription.SubscriptionStatus convertSubscriptionStatus(org.hl7.fhir.dstu2.model.Subscription.SubscriptionStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUESTED: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionStatus.REQUESTED;
    case ACTIVE: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionStatus.ACTIVE;
    case ERROR: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionStatus.ERROR;
    case OFF: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionStatus.OFF;
    default: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Subscription.SubscriptionStatus convertSubscriptionStatus(org.hl7.fhir.dstu3.model.Subscription.SubscriptionStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUESTED: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionStatus.REQUESTED;
    case ACTIVE: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionStatus.ACTIVE;
    case ERROR: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionStatus.ERROR;
    case OFF: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionStatus.OFF;
    default: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelComponent convertSubscriptionChannelComponent(org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelComponent tgt = new org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelComponent();
    copyElement(src, tgt);
    tgt.setType(convertSubscriptionChannelType(src.getType()));
    tgt.setEndpoint(src.getEndpoint());
    tgt.setPayload(src.getPayload());
    tgt.setHeader(src.getHeader());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelComponent convertSubscriptionChannelComponent(org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelComponent tgt = new org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelComponent();
    copyElement(src, tgt);
    tgt.setType(convertSubscriptionChannelType(src.getType()));
    tgt.setEndpoint(src.getEndpoint());
    tgt.setPayload(src.getPayload());
    tgt.setHeader(src.getHeader());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType convertSubscriptionChannelType(org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType src) {
    if (src == null)
      return null;
    switch (src) {
    case RESTHOOK: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType.RESTHOOK;
    case WEBSOCKET: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType.WEBSOCKET;
    case EMAIL: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType.EMAIL;
    case SMS: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType.SMS;
    case MESSAGE: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType.MESSAGE;
    default: return org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType convertSubscriptionChannelType(org.hl7.fhir.dstu3.model.Subscription.SubscriptionChannelType src) {
    if (src == null)
      return null;
    switch (src) {
    case RESTHOOK: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType.RESTHOOK;
    case WEBSOCKET: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType.WEBSOCKET;
    case EMAIL: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType.EMAIL;
    case SMS: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType.SMS;
    case MESSAGE: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType.MESSAGE;
    default: return org.hl7.fhir.dstu2.model.Subscription.SubscriptionChannelType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Substance convertSubstance(org.hl7.fhir.dstu2.model.Substance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Substance tgt = new org.hl7.fhir.dstu3.model.Substance();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent t : src.getInstance())
      tgt.addInstance(convertSubstanceInstanceComponent(t));
    for (org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent t : src.getIngredient())
      tgt.addIngredient(convertSubstanceIngredientComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Substance convertSubstance(org.hl7.fhir.dstu3.model.Substance src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Substance tgt = new org.hl7.fhir.dstu2.model.Substance();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.Substance.SubstanceInstanceComponent t : src.getInstance())
      tgt.addInstance(convertSubstanceInstanceComponent(t));
    for (org.hl7.fhir.dstu3.model.Substance.SubstanceIngredientComponent t : src.getIngredient())
      tgt.addIngredient(convertSubstanceIngredientComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Substance.SubstanceInstanceComponent convertSubstanceInstanceComponent(org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Substance.SubstanceInstanceComponent tgt = new org.hl7.fhir.dstu3.model.Substance.SubstanceInstanceComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setExpiry(src.getExpiry());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent convertSubstanceInstanceComponent(org.hl7.fhir.dstu3.model.Substance.SubstanceInstanceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent tgt = new org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setExpiry(src.getExpiry());
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Substance.SubstanceIngredientComponent convertSubstanceIngredientComponent(org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Substance.SubstanceIngredientComponent tgt = new org.hl7.fhir.dstu3.model.Substance.SubstanceIngredientComponent();
    copyElement(src, tgt);
    tgt.setQuantity(convertRatio(src.getQuantity()));
    tgt.setSubstance(convertReference(src.getSubstance()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent convertSubstanceIngredientComponent(org.hl7.fhir.dstu3.model.Substance.SubstanceIngredientComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent tgt = new org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent();
    copyElement(src, tgt);
    tgt.setQuantity(convertRatio(src.getQuantity()));
    tgt.setSubstance(convertReference(src.getSubstance()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.SupplyDelivery convertSupplyDelivery(org.hl7.fhir.dstu2.model.SupplyDelivery src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.SupplyDelivery tgt = new org.hl7.fhir.dstu3.model.SupplyDelivery();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setStatus(convertSupplyDeliveryStatus(src.getStatus()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setSuppliedItem(convertReference(src.getSuppliedItem()));
    tgt.setSupplier(convertReference(src.getSupplier()));
    tgt.setWhenPrepared(convertPeriod(src.getWhenPrepared()));
    tgt.setTime(src.getTime());
    tgt.setDestination(convertReference(src.getDestination()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getReceiver())
      tgt.addReceiver(convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.SupplyDelivery convertSupplyDelivery(org.hl7.fhir.dstu3.model.SupplyDelivery src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.SupplyDelivery tgt = new org.hl7.fhir.dstu2.model.SupplyDelivery();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setStatus(convertSupplyDeliveryStatus(src.getStatus()));
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setQuantity(convertSimpleQuantity(src.getQuantity()));
    tgt.setSuppliedItem(convertReference(src.getSuppliedItem()));
    tgt.setSupplier(convertReference(src.getSupplier()));
    tgt.setWhenPrepared(convertPeriod(src.getWhenPrepared()));
    tgt.setTime(src.getTime());
    tgt.setDestination(convertReference(src.getDestination()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getReceiver())
      tgt.addReceiver(convertReference(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.SupplyDelivery.SupplyDeliveryStatus convertSupplyDeliveryStatus(org.hl7.fhir.dstu2.model.SupplyDelivery.SupplyDeliveryStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.SupplyDelivery.SupplyDeliveryStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.SupplyDelivery.SupplyDeliveryStatus.COMPLETED;
    case ABANDONED: return org.hl7.fhir.dstu3.model.SupplyDelivery.SupplyDeliveryStatus.ABANDONED;
    default: return org.hl7.fhir.dstu3.model.SupplyDelivery.SupplyDeliveryStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.SupplyDelivery.SupplyDeliveryStatus convertSupplyDeliveryStatus(org.hl7.fhir.dstu3.model.SupplyDelivery.SupplyDeliveryStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2.model.SupplyDelivery.SupplyDeliveryStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2.model.SupplyDelivery.SupplyDeliveryStatus.COMPLETED;
    case ABANDONED: return org.hl7.fhir.dstu2.model.SupplyDelivery.SupplyDeliveryStatus.ABANDONED;
    default: return org.hl7.fhir.dstu2.model.SupplyDelivery.SupplyDeliveryStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.SupplyRequest convertSupplyRequest(org.hl7.fhir.dstu2.model.SupplyRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.SupplyRequest tgt = new org.hl7.fhir.dstu3.model.SupplyRequest();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setSource(convertReference(src.getSource()));
    tgt.setDate(src.getDate());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setStatus(convertSupplyRequestStatus(src.getStatus()));
    tgt.setKind(convertCodeableConcept(src.getKind()));
    tgt.setOrderedItem(convertReference(src.getOrderedItem()));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getSupplier())
      tgt.addSupplier(convertReference(t));
    tgt.setReason(convertType(src.getReason()));
    tgt.setWhen(convertSupplyRequestWhenComponent(src.getWhen()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.SupplyRequest convertSupplyRequest(org.hl7.fhir.dstu3.model.SupplyRequest src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.SupplyRequest tgt = new org.hl7.fhir.dstu2.model.SupplyRequest();
    copyDomainResource(src, tgt);
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setSource(convertReference(src.getSource()));
    tgt.setDate(src.getDate());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setStatus(convertSupplyRequestStatus(src.getStatus()));
    tgt.setKind(convertCodeableConcept(src.getKind()));
    tgt.setOrderedItem(convertReference(src.getOrderedItem()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getSupplier())
      tgt.addSupplier(convertReference(t));
    tgt.setReason(convertType(src.getReason()));
    tgt.setWhen(convertSupplyRequestWhenComponent(src.getWhen()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestStatus convertSupplyRequestStatus(org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUESTED: return org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestStatus.REQUESTED;
    case COMPLETED: return org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestStatus.COMPLETED;
    case FAILED: return org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestStatus.FAILED;
    case CANCELLED: return org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestStatus.CANCELLED;
    default: return org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestStatus.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestStatus convertSupplyRequestStatus(org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestStatus src) {
    if (src == null)
      return null;
    switch (src) {
    case REQUESTED: return org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestStatus.REQUESTED;
    case COMPLETED: return org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestStatus.COMPLETED;
    case FAILED: return org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestStatus.FAILED;
    case CANCELLED: return org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestStatus.CANCELLED;
    default: return org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestStatus.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestWhenComponent convertSupplyRequestWhenComponent(org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestWhenComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestWhenComponent tgt = new org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestWhenComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSchedule(convertTiming(src.getSchedule()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestWhenComponent convertSupplyRequestWhenComponent(org.hl7.fhir.dstu3.model.SupplyRequest.SupplyRequestWhenComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestWhenComponent tgt = new org.hl7.fhir.dstu2.model.SupplyRequest.SupplyRequestWhenComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCodeableConcept(src.getCode()));
    tgt.setSchedule(convertTiming(src.getSchedule()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript convertTestScript(org.hl7.fhir.dstu2.model.TestScript src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript tgt = new org.hl7.fhir.dstu3.model.TestScript();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptContactComponent t : src.getContact())
      tgt.addContact(convertTestScriptContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptOriginComponent t : src.getOrigin())
      tgt.addOrigin(convertTestScriptOriginComponent(t));
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptDestinationComponent t : src.getDestination())
      tgt.addDestination(convertTestScriptDestinationComponent(t));
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptFixtureComponent t : src.getFixture())
      tgt.addFixture(convertTestScriptFixtureComponent(t));
    for (org.hl7.fhir.dstu2.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptVariableComponent t : src.getVariable())
      tgt.addVariable(convertTestScriptVariableComponent(t));
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleComponent t : src.getRule())
      tgt.addRule(convertTestScriptRuleComponent(t));
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetComponent t : src.getRuleset())
      tgt.addRuleset(convertTestScriptRulesetComponent(t));
    tgt.setSetup(convertTestScriptSetupComponent(src.getSetup()));
    for (org.hl7.fhir.dstu2.model.TestScript.TestScriptTestComponent t : src.getTest())
      tgt.addTest(convertTestScriptTestComponent(t));
    tgt.setTeardown(convertTestScriptTeardownComponent(src.getTeardown()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript convertTestScript(org.hl7.fhir.dstu3.model.TestScript src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript tgt = new org.hl7.fhir.dstu2.model.TestScript();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent t : src.getContact())
      tgt.addContact(convertTestScriptContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent t : src.getOrigin())
      tgt.addOrigin(convertTestScriptOriginComponent(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent t : src.getDestination())
      tgt.addDestination(convertTestScriptDestinationComponent(t));
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent t : src.getFixture())
      tgt.addFixture(convertTestScriptFixtureComponent(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent t : src.getVariable())
      tgt.addVariable(convertTestScriptVariableComponent(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent t : src.getRule())
      tgt.addRule(convertTestScriptRuleComponent(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent t : src.getRuleset())
      tgt.addRuleset(convertTestScriptRulesetComponent(t));
    tgt.setSetup(convertTestScriptSetupComponent(src.getSetup()));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent t : src.getTest())
      tgt.addTest(convertTestScriptTestComponent(t));
    tgt.setTeardown(convertTestScriptTeardownComponent(src.getTeardown()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent convertTestScriptContactComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptContactComponent convertTestScriptContactComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptContactComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent convertTestScriptOriginComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptOriginComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptOriginComponent convertTestScriptOriginComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptOriginComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptOriginComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent convertTestScriptDestinationComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptDestinationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptDestinationComponent convertTestScriptDestinationComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptDestinationComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptDestinationComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent convertTestScriptMetadataComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.metadata.TestScriptMetadataLinkComponent t : src.getLink())
      tgt.addLink(convertTestScriptMetadataLinkComponent(t));
    for (org.hl7.fhir.dstu2.model.metadata.TestScriptMetadataCapabilityComponent t : src.getCapability())
      tgt.addCapability(convertTestScriptMetadataCapabilityComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataComponent convertTestScriptMetadataComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.metadata.TestScriptMetadataLinkComponent t : src.getLink())
      tgt.addLink(convertTestScriptMetadataLinkComponent(t));
    for (org.hl7.fhir.dstu3.model.metadata.TestScriptMetadataCapabilityComponent t : src.getCapability())
      tgt.addCapability(convertTestScriptMetadataCapabilityComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent convertTestScriptMetadataLinkComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataLinkComponent convertTestScriptMetadataLinkComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataLinkComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataLinkComponent();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent convertTestScriptMetadataCapabilityComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataCapabilityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent();
    copyElement(src, tgt);
    tgt.setRequired(src.getRequired());
    tgt.setValidated(src.getValidated());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.IntegerType t : src.getOrigin())
      tgt.addOrigin(t.getValue());
    tgt.setDestination(src.getDestination());
    for (org.hl7.fhir.dstu2.model.UriType t : src.getLink())
      tgt.addLink(t.getValue());
    tgt.setConformance(convertReference(src.getConformance()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataCapabilityComponent convertTestScriptMetadataCapabilityComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataCapabilityComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptMetadataCapabilityComponent();
    copyElement(src, tgt);
    tgt.setRequired(src.getRequired());
    tgt.setValidated(src.getValidated());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.IntegerType t : src.getOrigin())
      tgt.addOrigin(t.getValue());
    tgt.setDestination(src.getDestination());
    for (org.hl7.fhir.dstu3.model.UriType t : src.getLink())
      tgt.addLink(t.getValue());
    tgt.setConformance(convertReference(src.getConformance()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent convertTestScriptFixtureComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptFixtureComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent();
    copyElement(src, tgt);
    tgt.setAutocreate(src.getAutocreate());
    tgt.setAutodelete(src.getAutodelete());
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptFixtureComponent convertTestScriptFixtureComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptFixtureComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptFixtureComponent();
    copyElement(src, tgt);
    tgt.setAutocreate(src.getAutocreate());
    tgt.setAutodelete(src.getAutodelete());
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent convertTestScriptVariableComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptVariableComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefaultValue(src.getDefaultValue());
    tgt.setHeaderField(src.getHeaderField());
    tgt.setPath(src.getPath());
    tgt.setSourceId(src.getSourceId());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptVariableComponent convertTestScriptVariableComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptVariableComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptVariableComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefaultValue(src.getDefaultValue());
    tgt.setHeaderField(src.getHeaderField());
    tgt.setPath(src.getPath());
    tgt.setSourceId(src.getSourceId());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent convertTestScriptRuleComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    for (org.hl7.fhir.dstu2.model.rule.TestScriptRuleParamComponent t : src.getParam())
      tgt.addParam(convertTestScriptRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleComponent convertTestScriptRuleComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    for (org.hl7.fhir.dstu3.model.rule.TestScriptRuleParamComponent t : src.getParam())
      tgt.addParam(convertTestScriptRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleParamComponent convertTestScriptRuleParamComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleParamComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleParamComponent convertTestScriptRuleParamComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleParamComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent convertTestScriptRulesetComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    for (org.hl7.fhir.dstu2.model.ruleset.TestScriptRulesetRuleComponent t : src.getRule())
      tgt.addRule(convertTestScriptRulesetRuleComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetComponent convertTestScriptRulesetComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    for (org.hl7.fhir.dstu3.model.ruleset.TestScriptRulesetRuleComponent t : src.getRule())
      tgt.addRule(convertTestScriptRulesetRuleComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleComponent convertTestScriptRulesetRuleComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.rule.TestScriptRulesetRuleParamComponent t : src.getParam())
      tgt.addParam(convertTestScriptRulesetRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleComponent convertTestScriptRulesetRuleComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.rule.TestScriptRulesetRuleParamComponent t : src.getParam())
      tgt.addParam(convertTestScriptRulesetRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleParamComponent convertTestScriptRulesetRuleParamComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleParamComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleParamComponent convertTestScriptRulesetRuleParamComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleParamComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptRulesetRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent convertTestScriptSetupComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptSetupComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent();
    copyElement(src, tgt);
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu2.model.setup.SetupActionComponent t : src.getAction())
      tgt.addAction(convertSetupActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptSetupComponent convertTestScriptSetupComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptSetupComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptSetupComponent();
    copyElement(src, tgt);
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu3.model.setup.SetupActionComponent t : src.getAction())
      tgt.addAction(convertSetupActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent convertSetupActionComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionComponent convertSetupActionComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent convertSetupActionOperationComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setResource(src.getResource());
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setAccept(convertContentType(src.getAccept()));
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setDestination(src.getDestination());
    tgt.setEncodeRequestUrl(src.getEncodeRequestUrl());
    tgt.setOrigin(src.getOrigin());
    tgt.setParams(src.getParams());
    for (org.hl7.fhir.dstu2.model.operation.SetupActionOperationRequestHeaderComponent t : src.getRequestHeader())
      tgt.addRequestHeader(convertSetupActionOperationRequestHeaderComponent(t));
    tgt.setResponseId(src.getResponseId());
    tgt.setSourceId(src.getSourceId());
    tgt.setTargetId(src.getTargetId());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationComponent convertSetupActionOperationComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setResource(src.getResource());
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setAccept(convertContentType(src.getAccept()));
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setDestination(src.getDestination());
    tgt.setEncodeRequestUrl(src.getEncodeRequestUrl());
    tgt.setOrigin(src.getOrigin());
    tgt.setParams(src.getParams());
    for (org.hl7.fhir.dstu3.model.operation.SetupActionOperationRequestHeaderComponent t : src.getRequestHeader())
      tgt.addRequestHeader(convertSetupActionOperationRequestHeaderComponent(t));
    tgt.setResponseId(src.getResponseId());
    tgt.setSourceId(src.getSourceId());
    tgt.setTargetId(src.getTargetId());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.TestScript.ContentType convertContentType(org.hl7.fhir.dstu2.model.TestScript.ContentType src) {
    if (src == null)
      return null;
    switch (src) {
    case XML: return org.hl7.fhir.dstu3.model.TestScript.ContentType.XML;
    case JSON: return org.hl7.fhir.dstu3.model.TestScript.ContentType.JSON;
    default: return org.hl7.fhir.dstu3.model.TestScript.ContentType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.TestScript.ContentType convertContentType(org.hl7.fhir.dstu3.model.TestScript.ContentType src) {
    if (src == null)
      return null;
    switch (src) {
    case XML: return org.hl7.fhir.dstu2.model.TestScript.ContentType.XML;
    case JSON: return org.hl7.fhir.dstu2.model.TestScript.ContentType.JSON;
    default: return org.hl7.fhir.dstu2.model.TestScript.ContentType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent convertSetupActionOperationRequestHeaderComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationRequestHeaderComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent();
    copyElement(src, tgt);
    tgt.setField(src.getField());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationRequestHeaderComponent convertSetupActionOperationRequestHeaderComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationRequestHeaderComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionOperationRequestHeaderComponent();
    copyElement(src, tgt);
    tgt.setField(src.getField());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent convertSetupActionAssertComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent();
    copyElement(src, tgt);
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setDirection(convertAssertionDirectionType(src.getDirection()));
    tgt.setCompareToSourceId(src.getCompareToSourceId());
    tgt.setCompareToSourcePath(src.getCompareToSourcePath());
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setHeaderField(src.getHeaderField());
    tgt.setMinimumId(src.getMinimumId());
    tgt.setNavigationLinks(src.getNavigationLinks());
    tgt.setOperator(convertAssertionOperatorType(src.getOperator()));
    tgt.setPath(src.getPath());
    tgt.setResource(src.getResource());
    tgt.setResponse(convertAssertionResponseTypes(src.getResponse()));
    tgt.setResponseCode(src.getResponseCode());
    tgt.setRule(convertSetupActionAssertRuleComponent(src.getRule()));
    tgt.setRuleset(convertSetupActionAssertRulesetComponent(src.getRuleset()));
    tgt.setSourceId(src.getSourceId());
    tgt.setValidateProfileId(src.getValidateProfileId());
    tgt.setValue(src.getValue());
    tgt.setWarningOnly(src.getWarningOnly());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertComponent convertSetupActionAssertComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertComponent();
    copyElement(src, tgt);
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setDirection(convertAssertionDirectionType(src.getDirection()));
    tgt.setCompareToSourceId(src.getCompareToSourceId());
    tgt.setCompareToSourcePath(src.getCompareToSourcePath());
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setHeaderField(src.getHeaderField());
    tgt.setMinimumId(src.getMinimumId());
    tgt.setNavigationLinks(src.getNavigationLinks());
    tgt.setOperator(convertAssertionOperatorType(src.getOperator()));
    tgt.setPath(src.getPath());
    tgt.setResource(src.getResource());
    tgt.setResponse(convertAssertionResponseTypes(src.getResponse()));
    tgt.setResponseCode(src.getResponseCode());
    tgt.setRule(convertSetupActionAssertRuleComponent(src.getRule()));
    tgt.setRuleset(convertSetupActionAssertRulesetComponent(src.getRuleset()));
    tgt.setSourceId(src.getSourceId());
    tgt.setValidateProfileId(src.getValidateProfileId());
    tgt.setValue(src.getValue());
    tgt.setWarningOnly(src.getWarningOnly());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType convertAssertionDirectionType(org.hl7.fhir.dstu2.model.TestScript.AssertionDirectionType src) {
    if (src == null)
      return null;
    switch (src) {
    case RESPONSE: return org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType.RESPONSE;
    case REQUEST: return org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType.REQUEST;
    default: return org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.TestScript.AssertionDirectionType convertAssertionDirectionType(org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType src) {
    if (src == null)
      return null;
    switch (src) {
    case RESPONSE: return org.hl7.fhir.dstu2.model.TestScript.AssertionDirectionType.RESPONSE;
    case REQUEST: return org.hl7.fhir.dstu2.model.TestScript.AssertionDirectionType.REQUEST;
    default: return org.hl7.fhir.dstu2.model.TestScript.AssertionDirectionType.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType convertAssertionOperatorType(org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType src) {
    if (src == null)
      return null;
    switch (src) {
    case EQUALS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.EQUALS;
    case NOTEQUALS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTEQUALS;
    case IN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.IN;
    case NOTIN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTIN;
    case GREATERTHAN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.GREATERTHAN;
    case LESSTHAN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.LESSTHAN;
    case EMPTY: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.EMPTY;
    case NOTEMPTY: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTEMPTY;
    case CONTAINS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.CONTAINS;
    case NOTCONTAINS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTCONTAINS;
    default: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType convertAssertionOperatorType(org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType src) {
    if (src == null)
      return null;
    switch (src) {
    case EQUALS: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.EQUALS;
    case NOTEQUALS: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.NOTEQUALS;
    case IN: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.IN;
    case NOTIN: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.NOTIN;
    case GREATERTHAN: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.GREATERTHAN;
    case LESSTHAN: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.LESSTHAN;
    case EMPTY: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.EMPTY;
    case NOTEMPTY: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.NOTEMPTY;
    case CONTAINS: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.CONTAINS;
    case NOTCONTAINS: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.NOTCONTAINS;
    default: return org.hl7.fhir.dstu2.model.TestScript.AssertionOperatorType.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes convertAssertionResponseTypes(org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes src) {
    if (src == null)
      return null;
    switch (src) {
    case OKAY: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.OKAY;
    case CREATED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.CREATED;
    case NOCONTENT: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NOCONTENT;
    case NOTMODIFIED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NOTMODIFIED;
    case BAD: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.BAD;
    case FORBIDDEN: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.FORBIDDEN;
    case NOTFOUND: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NOTFOUND;
    case METHODNOTALLOWED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.METHODNOTALLOWED;
    case CONFLICT: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.CONFLICT;
    case GONE: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.GONE;
    case PRECONDITIONFAILED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.PRECONDITIONFAILED;
    case UNPROCESSABLE: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.UNPROCESSABLE;
    default: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes convertAssertionResponseTypes(org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes src) {
    if (src == null)
      return null;
    switch (src) {
    case OKAY: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.OKAY;
    case CREATED: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.CREATED;
    case NOCONTENT: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.NOCONTENT;
    case NOTMODIFIED: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.NOTMODIFIED;
    case BAD: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.BAD;
    case FORBIDDEN: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.FORBIDDEN;
    case NOTFOUND: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.NOTFOUND;
    case METHODNOTALLOWED: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.METHODNOTALLOWED;
    case CONFLICT: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.CONFLICT;
    case GONE: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.GONE;
    case PRECONDITIONFAILED: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.PRECONDITIONFAILED;
    case UNPROCESSABLE: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.UNPROCESSABLE;
    default: return org.hl7.fhir.dstu2.model.TestScript.AssertionResponseTypes.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleComponent convertSetupActionAssertRuleComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.rule.SetupActionAssertRuleParamComponent t : src.getParam())
      tgt.addParam(convertSetupActionAssertRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleComponent convertSetupActionAssertRuleComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.rule.SetupActionAssertRuleParamComponent t : src.getParam())
      tgt.addParam(convertSetupActionAssertRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleParamComponent convertSetupActionAssertRuleParamComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleParamComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleParamComponent convertSetupActionAssertRuleParamComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleParamComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetComponent convertSetupActionAssertRulesetComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.ruleset.SetupActionAssertRulesetRuleComponent t : src.getRule())
      tgt.addRule(convertSetupActionAssertRulesetRuleComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetComponent convertSetupActionAssertRulesetComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.ruleset.SetupActionAssertRulesetRuleComponent t : src.getRule())
      tgt.addRule(convertSetupActionAssertRulesetRuleComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleComponent convertSetupActionAssertRulesetRuleComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.rule.SetupActionAssertRulesetRuleParamComponent t : src.getParam())
      tgt.addParam(convertSetupActionAssertRulesetRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleComponent convertSetupActionAssertRulesetRuleComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.rule.SetupActionAssertRulesetRuleParamComponent t : src.getParam())
      tgt.addParam(convertSetupActionAssertRulesetRuleParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleParamComponent convertSetupActionAssertRulesetRuleParamComponent(org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleParamComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleParamComponent convertSetupActionAssertRulesetRuleParamComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertRulesetRuleParamComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleParamComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.SetupActionAssertRulesetRuleParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent convertTestScriptTestComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptTestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu2.model.test.TestActionComponent t : src.getAction())
      tgt.addAction(convertTestActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptTestComponent convertTestScriptTestComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptTestComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptTestComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu3.model.test.TestActionComponent t : src.getAction())
      tgt.addAction(convertTestActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestActionComponent convertTestActionComponent(org.hl7.fhir.dstu2.model.TestScript.TestActionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestActionComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestActionComponent convertTestActionComponent(org.hl7.fhir.dstu3.model.TestScript.TestActionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestActionComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent convertTestScriptTeardownComponent(org.hl7.fhir.dstu2.model.TestScript.TestScriptTeardownComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.teardown.TeardownActionComponent t : src.getAction())
      tgt.addAction(convertTeardownActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TestScriptTeardownComponent convertTestScriptTeardownComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TestScriptTeardownComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TestScriptTeardownComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.teardown.TeardownActionComponent t : src.getAction())
      tgt.addAction(convertTeardownActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent convertTeardownActionComponent(org.hl7.fhir.dstu2.model.TestScript.TeardownActionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.TestScript.TeardownActionComponent convertTeardownActionComponent(org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.TestScript.TeardownActionComponent tgt = new org.hl7.fhir.dstu2.model.TestScript.TeardownActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet convertValueSet(org.hl7.fhir.dstu2.model.ValueSet src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet tgt = new org.hl7.fhir.dstu3.model.ValueSet();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent t : src.getContact())
      tgt.addContact(convertValueSetContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setLockedDate(src.getLockedDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setImmutable(src.getImmutable());
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setExtensible(src.getExtensible());
    tgt.setCompose(convertValueSetComposeComponent(src.getCompose()));
    tgt.setExpansion(convertValueSetExpansionComponent(src.getExpansion()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet convertValueSet(org.hl7.fhir.dstu3.model.ValueSet src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet tgt = new org.hl7.fhir.dstu2.model.ValueSet();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent t : src.getContact())
      tgt.addContact(convertValueSetContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setLockedDate(src.getLockedDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setImmutable(src.getImmutable());
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setExtensible(src.getExtensible());
    tgt.setCompose(convertValueSetComposeComponent(src.getCompose()));
    tgt.setExpansion(convertValueSetExpansionComponent(src.getExpansion()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent convertValueSetContactComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent convertValueSetContactComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent convertValueSetComposeComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.UriType t : src.getImport())
      tgt.addImport(t.getValue());
    for (org.hl7.fhir.dstu2.model.compose.ConceptSetComponent t : src.getInclude())
      tgt.addInclude(convertConceptSetComponent(t));
    for (org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent t : src.getExclude())
      tgt.addExclude(convertConceptSetComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent convertValueSetComposeComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.UriType t : src.getImport())
      tgt.addImport(t.getValue());
    for (org.hl7.fhir.dstu3.model.compose.ConceptSetComponent t : src.getInclude())
      tgt.addInclude(convertConceptSetComponent(t));
    for (org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent t : src.getExclude())
      tgt.addExclude(convertConceptSetComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent convertConceptSetComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    for (org.hl7.fhir.dstu2.model.include.ConceptReferenceComponent t : src.getConcept())
      tgt.addConcept(convertConceptReferenceComponent(t));
    for (org.hl7.fhir.dstu2.model.include.ConceptSetFilterComponent t : src.getFilter())
      tgt.addFilter(convertConceptSetFilterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent convertConceptSetComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    for (org.hl7.fhir.dstu3.model.include.ConceptReferenceComponent t : src.getConcept())
      tgt.addConcept(convertConceptReferenceComponent(t));
    for (org.hl7.fhir.dstu3.model.include.ConceptSetFilterComponent t : src.getFilter())
      tgt.addFilter(convertConceptSetFilterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent convertConceptReferenceComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu2.model.concept.ConceptReferenceDesignationComponent t : src.getDesignation())
      tgt.addDesignation(convertConceptReferenceDesignationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent convertConceptReferenceComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu3.model.concept.ConceptReferenceDesignationComponent t : src.getDesignation())
      tgt.addDesignation(convertConceptReferenceDesignationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent convertConceptReferenceDesignationComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceDesignationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(src.getLanguage());
    tgt.setUse(convertCoding(src.getUse()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceDesignationComponent convertConceptReferenceDesignationComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceDesignationComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceDesignationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(src.getLanguage());
    tgt.setUse(convertCoding(src.getUse()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent convertConceptSetFilterComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent();
    copyElement(src, tgt);
    tgt.setProperty(src.getProperty());
    tgt.setOp(convertFilterOperator(src.getOp()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent convertConceptSetFilterComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent();
    copyElement(src, tgt);
    tgt.setProperty(src.getProperty());
    tgt.setOp(convertFilterOperator(src.getOp()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ValueSet.FilterOperator convertFilterOperator(org.hl7.fhir.dstu2.model.ValueSet.FilterOperator src) {
    if (src == null)
      return null;
    switch (src) {
    case EQUAL: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.EQUAL;
    case ISA: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.ISA;
    case ISNOTA: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.ISNOTA;
    case REGEX: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.REGEX;
    case IN: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.IN;
    case NOTIN: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.NOTIN;
    default: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.ValueSet.FilterOperator convertFilterOperator(org.hl7.fhir.dstu3.model.ValueSet.FilterOperator src) {
    if (src == null)
      return null;
    switch (src) {
    case EQUAL: return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.EQUAL;
    case ISA: return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.ISA;
    case ISNOTA: return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.ISNOTA;
    case REGEX: return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.REGEX;
    case IN: return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.IN;
    case NOTIN: return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.NOTIN;
    default: return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent convertValueSetExpansionComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(src.getIdentifier());
    tgt.setTimestamp(src.getTimestamp());
    tgt.setTotal(src.getTotal());
    tgt.setOffset(src.getOffset());
    for (org.hl7.fhir.dstu2.model.expansion.ValueSetExpansionParameterComponent t : src.getParameter())
      tgt.addParameter(convertValueSetExpansionParameterComponent(t));
    for (org.hl7.fhir.dstu2.model.expansion.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent convertValueSetExpansionComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(src.getIdentifier());
    tgt.setTimestamp(src.getTimestamp());
    tgt.setTotal(src.getTotal());
    tgt.setOffset(src.getOffset());
    for (org.hl7.fhir.dstu3.model.expansion.ValueSetExpansionParameterComponent t : src.getParameter())
      tgt.addParameter(convertValueSetExpansionParameterComponent(t));
    for (org.hl7.fhir.dstu3.model.expansion.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent convertValueSetExpansionParameterComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent convertValueSetExpansionParameterComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent convertValueSetExpansionContainsComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setAbstract(src.getAbstract());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent convertValueSetExpansionContainsComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setAbstract(src.getAbstract());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.VisionPrescription convertVisionPrescription(org.hl7.fhir.dstu2.model.VisionPrescription src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.VisionPrescription tgt = new org.hl7.fhir.dstu3.model.VisionPrescription();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDateWritten(src.getDateWritten());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setPrescriber(convertReference(src.getPrescriber()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setReason(convertType(src.getReason()));
    for (org.hl7.fhir.dstu2.model.VisionPrescription.VisionPrescriptionDispenseComponent t : src.getDispense())
      tgt.addDispense(convertVisionPrescriptionDispenseComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.VisionPrescription convertVisionPrescription(org.hl7.fhir.dstu3.model.VisionPrescription src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.VisionPrescription tgt = new org.hl7.fhir.dstu2.model.VisionPrescription();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDateWritten(src.getDateWritten());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setPrescriber(convertReference(src.getPrescriber()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setReason(convertType(src.getReason()));
    for (org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent t : src.getDispense())
      tgt.addDispense(convertVisionPrescriptionDispenseComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent convertVisionPrescriptionDispenseComponent(org.hl7.fhir.dstu2.model.VisionPrescription.VisionPrescriptionDispenseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent tgt = new org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent();
    copyElement(src, tgt);
    tgt.setProduct(convertCoding(src.getProduct()));
    tgt.setEye(convertVisionEyes(src.getEye()));
    tgt.setSphere(src.getSphere());
    tgt.setCylinder(src.getCylinder());
    tgt.setAxis(src.getAxis());
    tgt.setPrism(src.getPrism());
    tgt.setBase(convertVisionBase(src.getBase()));
    tgt.setAdd(src.getAdd());
    tgt.setPower(src.getPower());
    tgt.setBackCurve(src.getBackCurve());
    tgt.setDiameter(src.getDiameter());
    tgt.setDuration(convertSimpleQuantity(src.getDuration()));
    tgt.setColor(src.getColor());
    tgt.setBrand(src.getBrand());
    tgt.setNotes(src.getNotes());
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.VisionPrescription.VisionPrescriptionDispenseComponent convertVisionPrescriptionDispenseComponent(org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent src) {
    if (src == null)
      return null;
    org.hl7.fhir.dstu2.model.VisionPrescription.VisionPrescriptionDispenseComponent tgt = new org.hl7.fhir.dstu2.model.VisionPrescription.VisionPrescriptionDispenseComponent();
    copyElement(src, tgt);
    tgt.setProduct(convertCoding(src.getProduct()));
    tgt.setEye(convertVisionEyes(src.getEye()));
    tgt.setSphere(src.getSphere());
    tgt.setCylinder(src.getCylinder());
    tgt.setAxis(src.getAxis());
    tgt.setPrism(src.getPrism());
    tgt.setBase(convertVisionBase(src.getBase()));
    tgt.setAdd(src.getAdd());
    tgt.setPower(src.getPower());
    tgt.setBackCurve(src.getBackCurve());
    tgt.setDiameter(src.getDiameter());
    tgt.setDuration(convertSimpleQuantity(src.getDuration()));
    tgt.setColor(src.getColor());
    tgt.setBrand(src.getBrand());
    tgt.setNotes(src.getNotes());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes convertVisionEyes(org.hl7.fhir.dstu2.model.VisionPrescription.VisionEyes src) {
    if (src == null)
      return null;
    switch (src) {
    case RIGHT: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes.RIGHT;
    case LEFT: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes.LEFT;
    default: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.VisionPrescription.VisionEyes convertVisionEyes(org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes src) {
    if (src == null)
      return null;
    switch (src) {
    case RIGHT: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionEyes.RIGHT;
    case LEFT: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionEyes.LEFT;
    default: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionEyes.NULL;
  }
}

  private static org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase convertVisionBase(org.hl7.fhir.dstu2.model.VisionPrescription.VisionBase src) {
    if (src == null)
      return null;
    switch (src) {
    case UP: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.UP;
    case DOWN: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.DOWN;
    case IN: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.IN;
    case OUT: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.OUT;
    default: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.NULL;
  }
}

  private static org.hl7.fhir.dstu2.model.VisionPrescription.VisionBase convertVisionBase(org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase src) {
    if (src == null)
      return null;
    switch (src) {
    case UP: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionBase.UP;
    case DOWN: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionBase.DOWN;
    case IN: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionBase.IN;
    case OUT: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionBase.OUT;
    default: return org.hl7.fhir.dstu2.model.VisionPrescription.VisionBase.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.Resource convertResource(org.hl7.fhir.dstu2.model.Resource src) {
    if (src == null)
      return null;
    if (src instanceof org.hl7.fhir.dstu2.model.Parameters)
      return convertParameters((org.hl7.fhir.dstu2.model.Parameters) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Account)
      return convertAccount((org.hl7.fhir.dstu2.model.AccountType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.AllergyIntolerance)
      return convertAllergyIntolerance((org.hl7.fhir.dstu2.model.AllergyIntoleranceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Appointment)
      return convertAppointment((org.hl7.fhir.dstu2.model.AppointmentType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.AppointmentResponse)
      return convertAppointmentResponse((org.hl7.fhir.dstu2.model.AppointmentResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.AuditEvent)
      return convertAuditEvent((org.hl7.fhir.dstu2.model.AuditEventType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Basic)
      return convertBasic((org.hl7.fhir.dstu2.model.BasicType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Binary)
      return convertBinary((org.hl7.fhir.dstu2.model.BinaryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.BodySite)
      return convertBodySite((org.hl7.fhir.dstu2.model.BodySiteType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Bundle)
      return convertBundle((org.hl7.fhir.dstu2.model.BundleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CarePlan)
      return convertCarePlan((org.hl7.fhir.dstu2.model.CarePlanType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CareTeam)
      return convertCareTeam((org.hl7.fhir.dstu2.model.CareTeamType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Claim)
      return convertClaim((org.hl7.fhir.dstu2.model.ClaimType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ClaimResponse)
      return convertClaimResponse((org.hl7.fhir.dstu2.model.ClaimResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ClinicalImpression)
      return convertClinicalImpression((org.hl7.fhir.dstu2.model.ClinicalImpressionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CodeSystem)
      return convertCodeSystem((org.hl7.fhir.dstu2.model.CodeSystemType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Communication)
      return convertCommunication((org.hl7.fhir.dstu2.model.CommunicationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CommunicationRequest)
      return convertCommunicationRequest((org.hl7.fhir.dstu2.model.CommunicationRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CompartmentDefinition)
      return convertCompartmentDefinition((org.hl7.fhir.dstu2.model.CompartmentDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Composition)
      return convertComposition((org.hl7.fhir.dstu2.model.CompositionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ConceptMap)
      return convertConceptMap((org.hl7.fhir.dstu2.model.ConceptMapType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Condition)
      return convertCondition((org.hl7.fhir.dstu2.model.ConditionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Conformance)
      return convertConformance((org.hl7.fhir.dstu2.model.ConformanceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Contract)
      return convertContract((org.hl7.fhir.dstu2.model.ContractType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Coverage)
      return convertCoverage((org.hl7.fhir.dstu2.model.CoverageType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DataElement)
      return convertDataElement((org.hl7.fhir.dstu2.model.DataElementType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DecisionSupportRule)
      return convertDecisionSupportRule((org.hl7.fhir.dstu2.model.DecisionSupportRuleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DecisionSupportServiceModule)
      return convertDecisionSupportServiceModule((org.hl7.fhir.dstu2.model.DecisionSupportServiceModuleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DetectedIssue)
      return convertDetectedIssue((org.hl7.fhir.dstu2.model.DetectedIssueType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Device)
      return convertDevice((org.hl7.fhir.dstu2.model.DeviceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceComponent)
      return convertDeviceComponent((org.hl7.fhir.dstu2.model.DeviceComponentType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceMetric)
      return convertDeviceMetric((org.hl7.fhir.dstu2.model.DeviceMetricType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceUseRequest)
      return convertDeviceUseRequest((org.hl7.fhir.dstu2.model.DeviceUseRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceUseStatement)
      return convertDeviceUseStatement((org.hl7.fhir.dstu2.model.DeviceUseStatementType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DiagnosticOrder)
      return convertDiagnosticOrder((org.hl7.fhir.dstu2.model.DiagnosticOrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DiagnosticReport)
      return convertDiagnosticReport((org.hl7.fhir.dstu2.model.DiagnosticReportType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DocumentManifest)
      return convertDocumentManifest((org.hl7.fhir.dstu2.model.DocumentManifestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DocumentReference)
      return convertDocumentReference((org.hl7.fhir.dstu2.model.DocumentReferenceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EligibilityRequest)
      return convertEligibilityRequest((org.hl7.fhir.dstu2.model.EligibilityRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EligibilityResponse)
      return convertEligibilityResponse((org.hl7.fhir.dstu2.model.EligibilityResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Encounter)
      return convertEncounter((org.hl7.fhir.dstu2.model.EncounterType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EnrollmentRequest)
      return convertEnrollmentRequest((org.hl7.fhir.dstu2.model.EnrollmentRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EnrollmentResponse)
      return convertEnrollmentResponse((org.hl7.fhir.dstu2.model.EnrollmentResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EpisodeOfCare)
      return convertEpisodeOfCare((org.hl7.fhir.dstu2.model.EpisodeOfCareType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ExpansionProfile)
      return convertExpansionProfile((org.hl7.fhir.dstu2.model.ExpansionProfileType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ExplanationOfBenefit)
      return convertExplanationOfBenefit((org.hl7.fhir.dstu2.model.ExplanationOfBenefitType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.FamilyMemberHistory)
      return convertFamilyMemberHistory((org.hl7.fhir.dstu2.model.FamilyMemberHistoryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Flag)
      return convertFlag((org.hl7.fhir.dstu2.model.FlagType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Goal)
      return convertGoal((org.hl7.fhir.dstu2.model.GoalType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Group)
      return convertGroup((org.hl7.fhir.dstu2.model.GroupType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.GuidanceResponse)
      return convertGuidanceResponse((org.hl7.fhir.dstu2.model.GuidanceResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.HealthcareService)
      return convertHealthcareService((org.hl7.fhir.dstu2.model.HealthcareServiceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImagingExcerpt)
      return convertImagingExcerpt((org.hl7.fhir.dstu2.model.ImagingExcerptType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImagingObjectSelection)
      return convertImagingObjectSelection((org.hl7.fhir.dstu2.model.ImagingObjectSelectionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImagingStudy)
      return convertImagingStudy((org.hl7.fhir.dstu2.model.ImagingStudyType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Immunization)
      return convertImmunization((org.hl7.fhir.dstu2.model.ImmunizationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImmunizationRecommendation)
      return convertImmunizationRecommendation((org.hl7.fhir.dstu2.model.ImmunizationRecommendationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImplementationGuide)
      return convertImplementationGuide((org.hl7.fhir.dstu2.model.ImplementationGuideType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Library)
      return convertLibrary((org.hl7.fhir.dstu2.model.LibraryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Linkage)
      return convertLinkage((org.hl7.fhir.dstu2.model.LinkageType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.List)
      return convertList((org.hl7.fhir.dstu2.model.ListType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Location)
      return convertLocation((org.hl7.fhir.dstu2.model.LocationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Measure)
      return convertMeasure((org.hl7.fhir.dstu2.model.MeasureType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MeasureReport)
      return convertMeasureReport((org.hl7.fhir.dstu2.model.MeasureReportType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Media)
      return convertMedia((org.hl7.fhir.dstu2.model.MediaType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Medication)
      return convertMedication((org.hl7.fhir.dstu2.model.MedicationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationAdministration)
      return convertMedicationAdministration((org.hl7.fhir.dstu2.model.MedicationAdministrationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationDispense)
      return convertMedicationDispense((org.hl7.fhir.dstu2.model.MedicationDispenseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationOrder)
      return convertMedicationOrder((org.hl7.fhir.dstu2.model.MedicationOrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationStatement)
      return convertMedicationStatement((org.hl7.fhir.dstu2.model.MedicationStatementType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MessageHeader)
      return convertMessageHeader((org.hl7.fhir.dstu2.model.MessageHeaderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ModuleDefinition)
      return convertModuleDefinition((org.hl7.fhir.dstu2.model.ModuleDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.NamingSystem)
      return convertNamingSystem((org.hl7.fhir.dstu2.model.NamingSystemType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.NutritionOrder)
      return convertNutritionOrder((org.hl7.fhir.dstu2.model.NutritionOrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Observation)
      return convertObservation((org.hl7.fhir.dstu2.model.ObservationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OperationDefinition)
      return convertOperationDefinition((org.hl7.fhir.dstu2.model.OperationDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OperationOutcome)
      return convertOperationOutcome((org.hl7.fhir.dstu2.model.OperationOutcomeType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Order)
      return convertOrder((org.hl7.fhir.dstu2.model.OrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OrderResponse)
      return convertOrderResponse((org.hl7.fhir.dstu2.model.OrderResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OrderSet)
      return convertOrderSet((org.hl7.fhir.dstu2.model.OrderSetType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Organization)
      return convertOrganization((org.hl7.fhir.dstu2.model.OrganizationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Patient)
      return convertPatient((org.hl7.fhir.dstu2.model.PatientType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.PaymentNotice)
      return convertPaymentNotice((org.hl7.fhir.dstu2.model.PaymentNoticeType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.PaymentReconciliation)
      return convertPaymentReconciliation((org.hl7.fhir.dstu2.model.PaymentReconciliationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Person)
      return convertPerson((org.hl7.fhir.dstu2.model.PersonType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Practitioner)
      return convertPractitioner((org.hl7.fhir.dstu2.model.PractitionerType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.PractitionerRole)
      return convertPractitionerRole((org.hl7.fhir.dstu2.model.PractitionerRoleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Procedure)
      return convertProcedure((org.hl7.fhir.dstu2.model.ProcedureType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ProcedureRequest)
      return convertProcedureRequest((org.hl7.fhir.dstu2.model.ProcedureRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ProcessRequest)
      return convertProcessRequest((org.hl7.fhir.dstu2.model.ProcessRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ProcessResponse)
      return convertProcessResponse((org.hl7.fhir.dstu2.model.ProcessResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Protocol)
      return convertProtocol((org.hl7.fhir.dstu2.model.ProtocolType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Provenance)
      return convertProvenance((org.hl7.fhir.dstu2.model.ProvenanceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Questionnaire)
      return convertQuestionnaire((org.hl7.fhir.dstu2.model.QuestionnaireType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.QuestionnaireResponse)
      return convertQuestionnaireResponse((org.hl7.fhir.dstu2.model.QuestionnaireResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ReferralRequest)
      return convertReferralRequest((org.hl7.fhir.dstu2.model.ReferralRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.RelatedPerson)
      return convertRelatedPerson((org.hl7.fhir.dstu2.model.RelatedPersonType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.RiskAssessment)
      return convertRiskAssessment((org.hl7.fhir.dstu2.model.RiskAssessmentType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Schedule)
      return convertSchedule((org.hl7.fhir.dstu2.model.ScheduleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SearchParameter)
      return convertSearchParameter((org.hl7.fhir.dstu2.model.SearchParameterType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Sequence)
      return convertSequence((org.hl7.fhir.dstu2.model.SequenceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Slot)
      return convertSlot((org.hl7.fhir.dstu2.model.SlotType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Specimen)
      return convertSpecimen((org.hl7.fhir.dstu2.model.SpecimenType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.StructureDefinition)
      return convertStructureDefinition((org.hl7.fhir.dstu2.model.StructureDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.StructureMap)
      return convertStructureMap((org.hl7.fhir.dstu2.model.StructureMapType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Subscription)
      return convertSubscription((org.hl7.fhir.dstu2.model.SubscriptionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Substance)
      return convertSubstance((org.hl7.fhir.dstu2.model.SubstanceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SupplyDelivery)
      return convertSupplyDelivery((org.hl7.fhir.dstu2.model.SupplyDeliveryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SupplyRequest)
      return convertSupplyRequest((org.hl7.fhir.dstu2.model.SupplyRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Task)
      return convertTask((org.hl7.fhir.dstu2.model.TaskType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.TestScript)
      return convertTestScript((org.hl7.fhir.dstu2.model.TestScriptType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ValueSet)
      return convertValueSet((org.hl7.fhir.dstu2.model.ValueSetType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.VisionPrescription)
      return convertVisionPrescription((org.hl7.fhir.dstu2.model.VisionPrescriptionType) src);
    throw new Error("Unknown resource "+src.fhirType());
  }

  public static org.hl7.fhir.dstu2.model.Resource convertResource(org.hl7.fhir.dstu3.model.Resource src) {
    if (src == null)
      return null;
    if (src instanceof org.hl7.fhir.dstu3.model.Parameters)
      return convertParameters((org.hl7.fhir.dstu3.model.Parameters) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Account)
      return convertAccount((org.hl7.fhir.dstu2.model.AccountType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.AllergyIntolerance)
      return convertAllergyIntolerance((org.hl7.fhir.dstu2.model.AllergyIntoleranceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Appointment)
      return convertAppointment((org.hl7.fhir.dstu2.model.AppointmentType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.AppointmentResponse)
      return convertAppointmentResponse((org.hl7.fhir.dstu2.model.AppointmentResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.AuditEvent)
      return convertAuditEvent((org.hl7.fhir.dstu2.model.AuditEventType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Basic)
      return convertBasic((org.hl7.fhir.dstu2.model.BasicType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Binary)
      return convertBinary((org.hl7.fhir.dstu2.model.BinaryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.BodySite)
      return convertBodySite((org.hl7.fhir.dstu2.model.BodySiteType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Bundle)
      return convertBundle((org.hl7.fhir.dstu2.model.BundleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CarePlan)
      return convertCarePlan((org.hl7.fhir.dstu2.model.CarePlanType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CareTeam)
      return convertCareTeam((org.hl7.fhir.dstu2.model.CareTeamType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Claim)
      return convertClaim((org.hl7.fhir.dstu2.model.ClaimType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ClaimResponse)
      return convertClaimResponse((org.hl7.fhir.dstu2.model.ClaimResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ClinicalImpression)
      return convertClinicalImpression((org.hl7.fhir.dstu2.model.ClinicalImpressionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CodeSystem)
      return convertCodeSystem((org.hl7.fhir.dstu2.model.CodeSystemType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Communication)
      return convertCommunication((org.hl7.fhir.dstu2.model.CommunicationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CommunicationRequest)
      return convertCommunicationRequest((org.hl7.fhir.dstu2.model.CommunicationRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.CompartmentDefinition)
      return convertCompartmentDefinition((org.hl7.fhir.dstu2.model.CompartmentDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Composition)
      return convertComposition((org.hl7.fhir.dstu2.model.CompositionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ConceptMap)
      return convertConceptMap((org.hl7.fhir.dstu2.model.ConceptMapType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Condition)
      return convertCondition((org.hl7.fhir.dstu2.model.ConditionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Conformance)
      return convertConformance((org.hl7.fhir.dstu2.model.ConformanceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Contract)
      return convertContract((org.hl7.fhir.dstu2.model.ContractType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Coverage)
      return convertCoverage((org.hl7.fhir.dstu2.model.CoverageType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DataElement)
      return convertDataElement((org.hl7.fhir.dstu2.model.DataElementType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DecisionSupportRule)
      return convertDecisionSupportRule((org.hl7.fhir.dstu2.model.DecisionSupportRuleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DecisionSupportServiceModule)
      return convertDecisionSupportServiceModule((org.hl7.fhir.dstu2.model.DecisionSupportServiceModuleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DetectedIssue)
      return convertDetectedIssue((org.hl7.fhir.dstu2.model.DetectedIssueType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Device)
      return convertDevice((org.hl7.fhir.dstu2.model.DeviceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceComponent)
      return convertDeviceComponent((org.hl7.fhir.dstu2.model.DeviceComponentType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceMetric)
      return convertDeviceMetric((org.hl7.fhir.dstu2.model.DeviceMetricType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceUseRequest)
      return convertDeviceUseRequest((org.hl7.fhir.dstu2.model.DeviceUseRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DeviceUseStatement)
      return convertDeviceUseStatement((org.hl7.fhir.dstu2.model.DeviceUseStatementType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DiagnosticOrder)
      return convertDiagnosticOrder((org.hl7.fhir.dstu2.model.DiagnosticOrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DiagnosticReport)
      return convertDiagnosticReport((org.hl7.fhir.dstu2.model.DiagnosticReportType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DocumentManifest)
      return convertDocumentManifest((org.hl7.fhir.dstu2.model.DocumentManifestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.DocumentReference)
      return convertDocumentReference((org.hl7.fhir.dstu2.model.DocumentReferenceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EligibilityRequest)
      return convertEligibilityRequest((org.hl7.fhir.dstu2.model.EligibilityRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EligibilityResponse)
      return convertEligibilityResponse((org.hl7.fhir.dstu2.model.EligibilityResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Encounter)
      return convertEncounter((org.hl7.fhir.dstu2.model.EncounterType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EnrollmentRequest)
      return convertEnrollmentRequest((org.hl7.fhir.dstu2.model.EnrollmentRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EnrollmentResponse)
      return convertEnrollmentResponse((org.hl7.fhir.dstu2.model.EnrollmentResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.EpisodeOfCare)
      return convertEpisodeOfCare((org.hl7.fhir.dstu2.model.EpisodeOfCareType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ExpansionProfile)
      return convertExpansionProfile((org.hl7.fhir.dstu2.model.ExpansionProfileType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ExplanationOfBenefit)
      return convertExplanationOfBenefit((org.hl7.fhir.dstu2.model.ExplanationOfBenefitType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.FamilyMemberHistory)
      return convertFamilyMemberHistory((org.hl7.fhir.dstu2.model.FamilyMemberHistoryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Flag)
      return convertFlag((org.hl7.fhir.dstu2.model.FlagType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Goal)
      return convertGoal((org.hl7.fhir.dstu2.model.GoalType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Group)
      return convertGroup((org.hl7.fhir.dstu2.model.GroupType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.GuidanceResponse)
      return convertGuidanceResponse((org.hl7.fhir.dstu2.model.GuidanceResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.HealthcareService)
      return convertHealthcareService((org.hl7.fhir.dstu2.model.HealthcareServiceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImagingExcerpt)
      return convertImagingExcerpt((org.hl7.fhir.dstu2.model.ImagingExcerptType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImagingObjectSelection)
      return convertImagingObjectSelection((org.hl7.fhir.dstu2.model.ImagingObjectSelectionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImagingStudy)
      return convertImagingStudy((org.hl7.fhir.dstu2.model.ImagingStudyType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Immunization)
      return convertImmunization((org.hl7.fhir.dstu2.model.ImmunizationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImmunizationRecommendation)
      return convertImmunizationRecommendation((org.hl7.fhir.dstu2.model.ImmunizationRecommendationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ImplementationGuide)
      return convertImplementationGuide((org.hl7.fhir.dstu2.model.ImplementationGuideType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Library)
      return convertLibrary((org.hl7.fhir.dstu2.model.LibraryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Linkage)
      return convertLinkage((org.hl7.fhir.dstu2.model.LinkageType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.List)
      return convertList((org.hl7.fhir.dstu2.model.ListType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Location)
      return convertLocation((org.hl7.fhir.dstu2.model.LocationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Measure)
      return convertMeasure((org.hl7.fhir.dstu2.model.MeasureType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MeasureReport)
      return convertMeasureReport((org.hl7.fhir.dstu2.model.MeasureReportType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Media)
      return convertMedia((org.hl7.fhir.dstu2.model.MediaType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Medication)
      return convertMedication((org.hl7.fhir.dstu2.model.MedicationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationAdministration)
      return convertMedicationAdministration((org.hl7.fhir.dstu2.model.MedicationAdministrationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationDispense)
      return convertMedicationDispense((org.hl7.fhir.dstu2.model.MedicationDispenseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationOrder)
      return convertMedicationOrder((org.hl7.fhir.dstu2.model.MedicationOrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MedicationStatement)
      return convertMedicationStatement((org.hl7.fhir.dstu2.model.MedicationStatementType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.MessageHeader)
      return convertMessageHeader((org.hl7.fhir.dstu2.model.MessageHeaderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ModuleDefinition)
      return convertModuleDefinition((org.hl7.fhir.dstu2.model.ModuleDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.NamingSystem)
      return convertNamingSystem((org.hl7.fhir.dstu2.model.NamingSystemType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.NutritionOrder)
      return convertNutritionOrder((org.hl7.fhir.dstu2.model.NutritionOrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Observation)
      return convertObservation((org.hl7.fhir.dstu2.model.ObservationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OperationDefinition)
      return convertOperationDefinition((org.hl7.fhir.dstu2.model.OperationDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OperationOutcome)
      return convertOperationOutcome((org.hl7.fhir.dstu2.model.OperationOutcomeType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Order)
      return convertOrder((org.hl7.fhir.dstu2.model.OrderType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OrderResponse)
      return convertOrderResponse((org.hl7.fhir.dstu2.model.OrderResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.OrderSet)
      return convertOrderSet((org.hl7.fhir.dstu2.model.OrderSetType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Organization)
      return convertOrganization((org.hl7.fhir.dstu2.model.OrganizationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Patient)
      return convertPatient((org.hl7.fhir.dstu2.model.PatientType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.PaymentNotice)
      return convertPaymentNotice((org.hl7.fhir.dstu2.model.PaymentNoticeType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.PaymentReconciliation)
      return convertPaymentReconciliation((org.hl7.fhir.dstu2.model.PaymentReconciliationType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Person)
      return convertPerson((org.hl7.fhir.dstu2.model.PersonType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Practitioner)
      return convertPractitioner((org.hl7.fhir.dstu2.model.PractitionerType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.PractitionerRole)
      return convertPractitionerRole((org.hl7.fhir.dstu2.model.PractitionerRoleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Procedure)
      return convertProcedure((org.hl7.fhir.dstu2.model.ProcedureType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ProcedureRequest)
      return convertProcedureRequest((org.hl7.fhir.dstu2.model.ProcedureRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ProcessRequest)
      return convertProcessRequest((org.hl7.fhir.dstu2.model.ProcessRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ProcessResponse)
      return convertProcessResponse((org.hl7.fhir.dstu2.model.ProcessResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Protocol)
      return convertProtocol((org.hl7.fhir.dstu2.model.ProtocolType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Provenance)
      return convertProvenance((org.hl7.fhir.dstu2.model.ProvenanceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Questionnaire)
      return convertQuestionnaire((org.hl7.fhir.dstu2.model.QuestionnaireType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.QuestionnaireResponse)
      return convertQuestionnaireResponse((org.hl7.fhir.dstu2.model.QuestionnaireResponseType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ReferralRequest)
      return convertReferralRequest((org.hl7.fhir.dstu2.model.ReferralRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.RelatedPerson)
      return convertRelatedPerson((org.hl7.fhir.dstu2.model.RelatedPersonType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.RiskAssessment)
      return convertRiskAssessment((org.hl7.fhir.dstu2.model.RiskAssessmentType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Schedule)
      return convertSchedule((org.hl7.fhir.dstu2.model.ScheduleType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SearchParameter)
      return convertSearchParameter((org.hl7.fhir.dstu2.model.SearchParameterType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Sequence)
      return convertSequence((org.hl7.fhir.dstu2.model.SequenceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Slot)
      return convertSlot((org.hl7.fhir.dstu2.model.SlotType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Specimen)
      return convertSpecimen((org.hl7.fhir.dstu2.model.SpecimenType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.StructureDefinition)
      return convertStructureDefinition((org.hl7.fhir.dstu2.model.StructureDefinitionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.StructureMap)
      return convertStructureMap((org.hl7.fhir.dstu2.model.StructureMapType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Subscription)
      return convertSubscription((org.hl7.fhir.dstu2.model.SubscriptionType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Substance)
      return convertSubstance((org.hl7.fhir.dstu2.model.SubstanceType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SupplyDelivery)
      return convertSupplyDelivery((org.hl7.fhir.dstu2.model.SupplyDeliveryType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.SupplyRequest)
      return convertSupplyRequest((org.hl7.fhir.dstu2.model.SupplyRequestType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.Task)
      return convertTask((org.hl7.fhir.dstu2.model.TaskType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.TestScript)
      return convertTestScript((org.hl7.fhir.dstu2.model.TestScriptType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.ValueSet)
      return convertValueSet((org.hl7.fhir.dstu2.model.ValueSetType) src);
    if (src instanceof org.hl7.fhir.dstu2.model.VisionPrescription)
      return convertVisionPrescription((org.hl7.fhir.dstu2.model.VisionPrescriptionType) src);
    throw new Error("Unknown resource "+src.fhirType());
  }


}

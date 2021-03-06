/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package point.io.securevault.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-02-10")
public class TData implements org.apache.thrift.TBase<TData, TData._Fields>, java.io.Serializable, Cloneable, Comparable<TData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TData");

  private static final org.apache.thrift.protocol.TField STYLE_FIELD_DESC = new org.apache.thrift.protocol.TField("style", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FORMS_FIELD_DESC = new org.apache.thrift.protocol.TField("forms", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PROCESSTYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("processtype", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ICON_FIELD_DESC = new org.apache.thrift.protocol.TField("icon", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DIAGRAM_XML_FIELD_DESC = new org.apache.thrift.protocol.TField("diagram_xml", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PROVIDERS_FIELD_DESC = new org.apache.thrift.protocol.TField("providers", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField FACTS_FIELD_DESC = new org.apache.thrift.protocol.TField("facts", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDataTupleSchemeFactory());
  }

  public String style; // required
  public List<TForm> forms; // required
  public TTProcessType processtype; // required
  public String icon; // required
  public String diagram_xml; // required
  public TProvider providers; // required
  public String facts; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STYLE((short)1, "style"),
    FORMS((short)2, "forms"),
    PROCESSTYPE((short)3, "processtype"),
    ICON((short)4, "icon"),
    DIAGRAM_XML((short)5, "diagram_xml"),
    PROVIDERS((short)6, "providers"),
    FACTS((short)7, "facts");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STYLE
          return STYLE;
        case 2: // FORMS
          return FORMS;
        case 3: // PROCESSTYPE
          return PROCESSTYPE;
        case 4: // ICON
          return ICON;
        case 5: // DIAGRAM_XML
          return DIAGRAM_XML;
        case 6: // PROVIDERS
          return PROVIDERS;
        case 7: // FACTS
          return FACTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.FACTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STYLE, new org.apache.thrift.meta_data.FieldMetaData("style", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.FORMS, new org.apache.thrift.meta_data.FieldMetaData("forms", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TForm.class))));
    tmpMap.put(_Fields.PROCESSTYPE, new org.apache.thrift.meta_data.FieldMetaData("processtype", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTProcessType.class)));
    tmpMap.put(_Fields.ICON, new org.apache.thrift.meta_data.FieldMetaData("icon", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.DIAGRAM_XML, new org.apache.thrift.meta_data.FieldMetaData("diagram_xml", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.PROVIDERS, new org.apache.thrift.meta_data.FieldMetaData("providers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TProvider.class)));
    tmpMap.put(_Fields.FACTS, new org.apache.thrift.meta_data.FieldMetaData("facts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TData.class, metaDataMap);
  }

  public TData() {
  }

  public TData(
    String style,
    List<TForm> forms,
    TTProcessType processtype,
    String icon,
    String diagram_xml,
    TProvider providers)
  {
    this();
    this.style = style;
    this.forms = forms;
    this.processtype = processtype;
    this.icon = icon;
    this.diagram_xml = diagram_xml;
    this.providers = providers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TData(TData other) {
    if (other.isSetStyle()) {
      this.style = other.style;
    }
    if (other.isSetForms()) {
      List<TForm> __this__forms = new ArrayList<TForm>(other.forms.size());
      for (TForm other_element : other.forms) {
        __this__forms.add(new TForm(other_element));
      }
      this.forms = __this__forms;
    }
    if (other.isSetProcesstype()) {
      this.processtype = new TTProcessType(other.processtype);
    }
    if (other.isSetIcon()) {
      this.icon = other.icon;
    }
    if (other.isSetDiagram_xml()) {
      this.diagram_xml = other.diagram_xml;
    }
    if (other.isSetProviders()) {
      this.providers = new TProvider(other.providers);
    }
    if (other.isSetFacts()) {
      this.facts = other.facts;
    }
  }

  public TData deepCopy() {
    return new TData(this);
  }

  @Override
  public void clear() {
    this.style = null;
    this.forms = null;
    this.processtype = null;
    this.icon = null;
    this.diagram_xml = null;
    this.providers = null;
    this.facts = null;
  }

  public String getStyle() {
    return this.style;
  }

  public TData setStyle(String style) {
    this.style = style;
    return this;
  }

  public void unsetStyle() {
    this.style = null;
  }

  /** Returns true if field style is set (has been assigned a value) and false otherwise */
  public boolean isSetStyle() {
    return this.style != null;
  }

  public void setStyleIsSet(boolean value) {
    if (!value) {
      this.style = null;
    }
  }

  public int getFormsSize() {
    return (this.forms == null) ? 0 : this.forms.size();
  }

  public java.util.Iterator<TForm> getFormsIterator() {
    return (this.forms == null) ? null : this.forms.iterator();
  }

  public void addToForms(TForm elem) {
    if (this.forms == null) {
      this.forms = new ArrayList<TForm>();
    }
    this.forms.add(elem);
  }

  public List<TForm> getForms() {
    return this.forms;
  }

  public TData setForms(List<TForm> forms) {
    this.forms = forms;
    return this;
  }

  public void unsetForms() {
    this.forms = null;
  }

  /** Returns true if field forms is set (has been assigned a value) and false otherwise */
  public boolean isSetForms() {
    return this.forms != null;
  }

  public void setFormsIsSet(boolean value) {
    if (!value) {
      this.forms = null;
    }
  }

  public TTProcessType getProcesstype() {
    return this.processtype;
  }

  public TData setProcesstype(TTProcessType processtype) {
    this.processtype = processtype;
    return this;
  }

  public void unsetProcesstype() {
    this.processtype = null;
  }

  /** Returns true if field processtype is set (has been assigned a value) and false otherwise */
  public boolean isSetProcesstype() {
    return this.processtype != null;
  }

  public void setProcesstypeIsSet(boolean value) {
    if (!value) {
      this.processtype = null;
    }
  }

  public String getIcon() {
    return this.icon;
  }

  public TData setIcon(String icon) {
    this.icon = icon;
    return this;
  }

  public void unsetIcon() {
    this.icon = null;
  }

  /** Returns true if field icon is set (has been assigned a value) and false otherwise */
  public boolean isSetIcon() {
    return this.icon != null;
  }

  public void setIconIsSet(boolean value) {
    if (!value) {
      this.icon = null;
    }
  }

  public String getDiagram_xml() {
    return this.diagram_xml;
  }

  public TData setDiagram_xml(String diagram_xml) {
    this.diagram_xml = diagram_xml;
    return this;
  }

  public void unsetDiagram_xml() {
    this.diagram_xml = null;
  }

  /** Returns true if field diagram_xml is set (has been assigned a value) and false otherwise */
  public boolean isSetDiagram_xml() {
    return this.diagram_xml != null;
  }

  public void setDiagram_xmlIsSet(boolean value) {
    if (!value) {
      this.diagram_xml = null;
    }
  }

  public TProvider getProviders() {
    return this.providers;
  }

  public TData setProviders(TProvider providers) {
    this.providers = providers;
    return this;
  }

  public void unsetProviders() {
    this.providers = null;
  }

  /** Returns true if field providers is set (has been assigned a value) and false otherwise */
  public boolean isSetProviders() {
    return this.providers != null;
  }

  public void setProvidersIsSet(boolean value) {
    if (!value) {
      this.providers = null;
    }
  }

  public String getFacts() {
    return this.facts;
  }

  public TData setFacts(String facts) {
    this.facts = facts;
    return this;
  }

  public void unsetFacts() {
    this.facts = null;
  }

  /** Returns true if field facts is set (has been assigned a value) and false otherwise */
  public boolean isSetFacts() {
    return this.facts != null;
  }

  public void setFactsIsSet(boolean value) {
    if (!value) {
      this.facts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STYLE:
      if (value == null) {
        unsetStyle();
      } else {
        setStyle((String)value);
      }
      break;

    case FORMS:
      if (value == null) {
        unsetForms();
      } else {
        setForms((List<TForm>)value);
      }
      break;

    case PROCESSTYPE:
      if (value == null) {
        unsetProcesstype();
      } else {
        setProcesstype((TTProcessType)value);
      }
      break;

    case ICON:
      if (value == null) {
        unsetIcon();
      } else {
        setIcon((String)value);
      }
      break;

    case DIAGRAM_XML:
      if (value == null) {
        unsetDiagram_xml();
      } else {
        setDiagram_xml((String)value);
      }
      break;

    case PROVIDERS:
      if (value == null) {
        unsetProviders();
      } else {
        setProviders((TProvider)value);
      }
      break;

    case FACTS:
      if (value == null) {
        unsetFacts();
      } else {
        setFacts((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STYLE:
      return getStyle();

    case FORMS:
      return getForms();

    case PROCESSTYPE:
      return getProcesstype();

    case ICON:
      return getIcon();

    case DIAGRAM_XML:
      return getDiagram_xml();

    case PROVIDERS:
      return getProviders();

    case FACTS:
      return getFacts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STYLE:
      return isSetStyle();
    case FORMS:
      return isSetForms();
    case PROCESSTYPE:
      return isSetProcesstype();
    case ICON:
      return isSetIcon();
    case DIAGRAM_XML:
      return isSetDiagram_xml();
    case PROVIDERS:
      return isSetProviders();
    case FACTS:
      return isSetFacts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TData)
      return this.equals((TData)that);
    return false;
  }

  public boolean equals(TData that) {
    if (that == null)
      return false;

    boolean this_present_style = true && this.isSetStyle();
    boolean that_present_style = true && that.isSetStyle();
    if (this_present_style || that_present_style) {
      if (!(this_present_style && that_present_style))
        return false;
      if (!this.style.equals(that.style))
        return false;
    }

    boolean this_present_forms = true && this.isSetForms();
    boolean that_present_forms = true && that.isSetForms();
    if (this_present_forms || that_present_forms) {
      if (!(this_present_forms && that_present_forms))
        return false;
      if (!this.forms.equals(that.forms))
        return false;
    }

    boolean this_present_processtype = true && this.isSetProcesstype();
    boolean that_present_processtype = true && that.isSetProcesstype();
    if (this_present_processtype || that_present_processtype) {
      if (!(this_present_processtype && that_present_processtype))
        return false;
      if (!this.processtype.equals(that.processtype))
        return false;
    }

    boolean this_present_icon = true && this.isSetIcon();
    boolean that_present_icon = true && that.isSetIcon();
    if (this_present_icon || that_present_icon) {
      if (!(this_present_icon && that_present_icon))
        return false;
      if (!this.icon.equals(that.icon))
        return false;
    }

    boolean this_present_diagram_xml = true && this.isSetDiagram_xml();
    boolean that_present_diagram_xml = true && that.isSetDiagram_xml();
    if (this_present_diagram_xml || that_present_diagram_xml) {
      if (!(this_present_diagram_xml && that_present_diagram_xml))
        return false;
      if (!this.diagram_xml.equals(that.diagram_xml))
        return false;
    }

    boolean this_present_providers = true && this.isSetProviders();
    boolean that_present_providers = true && that.isSetProviders();
    if (this_present_providers || that_present_providers) {
      if (!(this_present_providers && that_present_providers))
        return false;
      if (!this.providers.equals(that.providers))
        return false;
    }

    boolean this_present_facts = true && this.isSetFacts();
    boolean that_present_facts = true && that.isSetFacts();
    if (this_present_facts || that_present_facts) {
      if (!(this_present_facts && that_present_facts))
        return false;
      if (!this.facts.equals(that.facts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_style = true && (isSetStyle());
    list.add(present_style);
    if (present_style)
      list.add(style);

    boolean present_forms = true && (isSetForms());
    list.add(present_forms);
    if (present_forms)
      list.add(forms);

    boolean present_processtype = true && (isSetProcesstype());
    list.add(present_processtype);
    if (present_processtype)
      list.add(processtype);

    boolean present_icon = true && (isSetIcon());
    list.add(present_icon);
    if (present_icon)
      list.add(icon);

    boolean present_diagram_xml = true && (isSetDiagram_xml());
    list.add(present_diagram_xml);
    if (present_diagram_xml)
      list.add(diagram_xml);

    boolean present_providers = true && (isSetProviders());
    list.add(present_providers);
    if (present_providers)
      list.add(providers);

    boolean present_facts = true && (isSetFacts());
    list.add(present_facts);
    if (present_facts)
      list.add(facts);

    return list.hashCode();
  }

  @Override
  public int compareTo(TData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStyle()).compareTo(other.isSetStyle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStyle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.style, other.style);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetForms()).compareTo(other.isSetForms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.forms, other.forms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProcesstype()).compareTo(other.isSetProcesstype());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcesstype()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processtype, other.processtype);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIcon()).compareTo(other.isSetIcon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIcon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.icon, other.icon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDiagram_xml()).compareTo(other.isSetDiagram_xml());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiagram_xml()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diagram_xml, other.diagram_xml);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProviders()).compareTo(other.isSetProviders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProviders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.providers, other.providers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFacts()).compareTo(other.isSetFacts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFacts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.facts, other.facts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TData(");
    boolean first = true;

    sb.append("style:");
    if (this.style == null) {
      sb.append("null");
    } else {
      sb.append(this.style);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("forms:");
    if (this.forms == null) {
      sb.append("null");
    } else {
      sb.append(this.forms);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("processtype:");
    if (this.processtype == null) {
      sb.append("null");
    } else {
      sb.append(this.processtype);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("icon:");
    if (this.icon == null) {
      sb.append("null");
    } else {
      sb.append(this.icon);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("diagram_xml:");
    if (this.diagram_xml == null) {
      sb.append("null");
    } else {
      sb.append(this.diagram_xml);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("providers:");
    if (this.providers == null) {
      sb.append("null");
    } else {
      sb.append(this.providers);
    }
    first = false;
    if (isSetFacts()) {
      if (!first) sb.append(", ");
      sb.append("facts:");
      if (this.facts == null) {
        sb.append("null");
      } else {
        sb.append(this.facts);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (style == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'style' was not present! Struct: " + toString());
    }
    if (forms == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'forms' was not present! Struct: " + toString());
    }
    if (processtype == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'processtype' was not present! Struct: " + toString());
    }
    if (icon == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'icon' was not present! Struct: " + toString());
    }
    if (diagram_xml == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'diagram_xml' was not present! Struct: " + toString());
    }
    if (providers == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'providers' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (processtype != null) {
      processtype.validate();
    }
    if (providers != null) {
      providers.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDataStandardSchemeFactory implements SchemeFactory {
    public TDataStandardScheme getScheme() {
      return new TDataStandardScheme();
    }
  }

  private static class TDataStandardScheme extends StandardScheme<TData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STYLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.style = iprot.readString();
              struct.setStyleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FORMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list42 = iprot.readListBegin();
                struct.forms = new ArrayList<TForm>(_list42.size);
                TForm _elem43;
                for (int _i44 = 0; _i44 < _list42.size; ++_i44)
                {
                  _elem43 = new TForm();
                  _elem43.read(iprot);
                  struct.forms.add(_elem43);
                }
                iprot.readListEnd();
              }
              struct.setFormsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROCESSTYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.processtype = new TTProcessType();
              struct.processtype.read(iprot);
              struct.setProcesstypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ICON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.icon = iprot.readString();
              struct.setIconIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DIAGRAM_XML
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.diagram_xml = iprot.readString();
              struct.setDiagram_xmlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROVIDERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.providers = new TProvider();
              struct.providers.read(iprot);
              struct.setProvidersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FACTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.facts = iprot.readString();
              struct.setFactsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.style != null) {
        oprot.writeFieldBegin(STYLE_FIELD_DESC);
        oprot.writeString(struct.style);
        oprot.writeFieldEnd();
      }
      if (struct.forms != null) {
        oprot.writeFieldBegin(FORMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.forms.size()));
          for (TForm _iter45 : struct.forms)
          {
            _iter45.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.processtype != null) {
        oprot.writeFieldBegin(PROCESSTYPE_FIELD_DESC);
        struct.processtype.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.icon != null) {
        oprot.writeFieldBegin(ICON_FIELD_DESC);
        oprot.writeString(struct.icon);
        oprot.writeFieldEnd();
      }
      if (struct.diagram_xml != null) {
        oprot.writeFieldBegin(DIAGRAM_XML_FIELD_DESC);
        oprot.writeString(struct.diagram_xml);
        oprot.writeFieldEnd();
      }
      if (struct.providers != null) {
        oprot.writeFieldBegin(PROVIDERS_FIELD_DESC);
        struct.providers.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.facts != null) {
        if (struct.isSetFacts()) {
          oprot.writeFieldBegin(FACTS_FIELD_DESC);
          oprot.writeString(struct.facts);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataTupleSchemeFactory implements SchemeFactory {
    public TDataTupleScheme getScheme() {
      return new TDataTupleScheme();
    }
  }

  private static class TDataTupleScheme extends TupleScheme<TData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.style);
      {
        oprot.writeI32(struct.forms.size());
        for (TForm _iter46 : struct.forms)
        {
          _iter46.write(oprot);
        }
      }
      struct.processtype.write(oprot);
      oprot.writeString(struct.icon);
      oprot.writeString(struct.diagram_xml);
      struct.providers.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetFacts()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFacts()) {
        oprot.writeString(struct.facts);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.style = iprot.readString();
      struct.setStyleIsSet(true);
      {
        org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.forms = new ArrayList<TForm>(_list47.size);
        TForm _elem48;
        for (int _i49 = 0; _i49 < _list47.size; ++_i49)
        {
          _elem48 = new TForm();
          _elem48.read(iprot);
          struct.forms.add(_elem48);
        }
      }
      struct.setFormsIsSet(true);
      struct.processtype = new TTProcessType();
      struct.processtype.read(iprot);
      struct.setProcesstypeIsSet(true);
      struct.icon = iprot.readString();
      struct.setIconIsSet(true);
      struct.diagram_xml = iprot.readString();
      struct.setDiagram_xmlIsSet(true);
      struct.providers = new TProvider();
      struct.providers.read(iprot);
      struct.setProvidersIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.facts = iprot.readString();
        struct.setFactsIsSet(true);
      }
    }
  }

}


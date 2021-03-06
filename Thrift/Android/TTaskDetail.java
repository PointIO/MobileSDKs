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
public class TTaskDetail implements org.apache.thrift.TBase<TTaskDetail, TTaskDetail._Fields>, java.io.Serializable, Cloneable, Comparable<TTaskDetail> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTaskDetail");

  private static final org.apache.thrift.protocol.TField TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("task", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ASSIGNEE_FIELD_DESC = new org.apache.thrift.protocol.TField("assignee", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField PROCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("process", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField INPUT_FIELD_DESC = new org.apache.thrift.protocol.TField("input", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField HISTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("history", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTaskDetailStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTaskDetailTupleSchemeFactory());
  }

  public TTask task; // required
  public TAssignee assignee; // optional
  public TProcess process; // optional
  public TTaskInput input; // optional
  public TTaskHistory history; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK((short)1, "task"),
    ASSIGNEE((short)2, "assignee"),
    PROCESS((short)3, "process"),
    INPUT((short)4, "input"),
    HISTORY((short)5, "history");

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
        case 1: // TASK
          return TASK;
        case 2: // ASSIGNEE
          return ASSIGNEE;
        case 3: // PROCESS
          return PROCESS;
        case 4: // INPUT
          return INPUT;
        case 5: // HISTORY
          return HISTORY;
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
  private static final _Fields optionals[] = {_Fields.ASSIGNEE,_Fields.PROCESS,_Fields.INPUT,_Fields.HISTORY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK, new org.apache.thrift.meta_data.FieldMetaData("task", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTask.class)));
    tmpMap.put(_Fields.ASSIGNEE, new org.apache.thrift.meta_data.FieldMetaData("assignee", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAssignee.class)));
    tmpMap.put(_Fields.PROCESS, new org.apache.thrift.meta_data.FieldMetaData("process", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TProcess.class)));
    tmpMap.put(_Fields.INPUT, new org.apache.thrift.meta_data.FieldMetaData("input", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTaskInput.class)));
    tmpMap.put(_Fields.HISTORY, new org.apache.thrift.meta_data.FieldMetaData("history", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTaskHistory.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTaskDetail.class, metaDataMap);
  }

  public TTaskDetail() {
  }

  public TTaskDetail(
    TTask task)
  {
    this();
    this.task = task;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTaskDetail(TTaskDetail other) {
    if (other.isSetTask()) {
      this.task = new TTask(other.task);
    }
    if (other.isSetAssignee()) {
      this.assignee = new TAssignee(other.assignee);
    }
    if (other.isSetProcess()) {
      this.process = new TProcess(other.process);
    }
    if (other.isSetInput()) {
      this.input = new TTaskInput(other.input);
    }
    if (other.isSetHistory()) {
      this.history = new TTaskHistory(other.history);
    }
  }

  public TTaskDetail deepCopy() {
    return new TTaskDetail(this);
  }

  @Override
  public void clear() {
    this.task = null;
    this.assignee = null;
    this.process = null;
    this.input = null;
    this.history = null;
  }

  public TTask getTask() {
    return this.task;
  }

  public TTaskDetail setTask(TTask task) {
    this.task = task;
    return this;
  }

  public void unsetTask() {
    this.task = null;
  }

  /** Returns true if field task is set (has been assigned a value) and false otherwise */
  public boolean isSetTask() {
    return this.task != null;
  }

  public void setTaskIsSet(boolean value) {
    if (!value) {
      this.task = null;
    }
  }

  public TAssignee getAssignee() {
    return this.assignee;
  }

  public TTaskDetail setAssignee(TAssignee assignee) {
    this.assignee = assignee;
    return this;
  }

  public void unsetAssignee() {
    this.assignee = null;
  }

  /** Returns true if field assignee is set (has been assigned a value) and false otherwise */
  public boolean isSetAssignee() {
    return this.assignee != null;
  }

  public void setAssigneeIsSet(boolean value) {
    if (!value) {
      this.assignee = null;
    }
  }

  public TProcess getProcess() {
    return this.process;
  }

  public TTaskDetail setProcess(TProcess process) {
    this.process = process;
    return this;
  }

  public void unsetProcess() {
    this.process = null;
  }

  /** Returns true if field process is set (has been assigned a value) and false otherwise */
  public boolean isSetProcess() {
    return this.process != null;
  }

  public void setProcessIsSet(boolean value) {
    if (!value) {
      this.process = null;
    }
  }

  public TTaskInput getInput() {
    return this.input;
  }

  public TTaskDetail setInput(TTaskInput input) {
    this.input = input;
    return this;
  }

  public void unsetInput() {
    this.input = null;
  }

  /** Returns true if field input is set (has been assigned a value) and false otherwise */
  public boolean isSetInput() {
    return this.input != null;
  }

  public void setInputIsSet(boolean value) {
    if (!value) {
      this.input = null;
    }
  }

  public TTaskHistory getHistory() {
    return this.history;
  }

  public TTaskDetail setHistory(TTaskHistory history) {
    this.history = history;
    return this;
  }

  public void unsetHistory() {
    this.history = null;
  }

  /** Returns true if field history is set (has been assigned a value) and false otherwise */
  public boolean isSetHistory() {
    return this.history != null;
  }

  public void setHistoryIsSet(boolean value) {
    if (!value) {
      this.history = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK:
      if (value == null) {
        unsetTask();
      } else {
        setTask((TTask)value);
      }
      break;

    case ASSIGNEE:
      if (value == null) {
        unsetAssignee();
      } else {
        setAssignee((TAssignee)value);
      }
      break;

    case PROCESS:
      if (value == null) {
        unsetProcess();
      } else {
        setProcess((TProcess)value);
      }
      break;

    case INPUT:
      if (value == null) {
        unsetInput();
      } else {
        setInput((TTaskInput)value);
      }
      break;

    case HISTORY:
      if (value == null) {
        unsetHistory();
      } else {
        setHistory((TTaskHistory)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK:
      return getTask();

    case ASSIGNEE:
      return getAssignee();

    case PROCESS:
      return getProcess();

    case INPUT:
      return getInput();

    case HISTORY:
      return getHistory();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK:
      return isSetTask();
    case ASSIGNEE:
      return isSetAssignee();
    case PROCESS:
      return isSetProcess();
    case INPUT:
      return isSetInput();
    case HISTORY:
      return isSetHistory();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTaskDetail)
      return this.equals((TTaskDetail)that);
    return false;
  }

  public boolean equals(TTaskDetail that) {
    if (that == null)
      return false;

    boolean this_present_task = true && this.isSetTask();
    boolean that_present_task = true && that.isSetTask();
    if (this_present_task || that_present_task) {
      if (!(this_present_task && that_present_task))
        return false;
      if (!this.task.equals(that.task))
        return false;
    }

    boolean this_present_assignee = true && this.isSetAssignee();
    boolean that_present_assignee = true && that.isSetAssignee();
    if (this_present_assignee || that_present_assignee) {
      if (!(this_present_assignee && that_present_assignee))
        return false;
      if (!this.assignee.equals(that.assignee))
        return false;
    }

    boolean this_present_process = true && this.isSetProcess();
    boolean that_present_process = true && that.isSetProcess();
    if (this_present_process || that_present_process) {
      if (!(this_present_process && that_present_process))
        return false;
      if (!this.process.equals(that.process))
        return false;
    }

    boolean this_present_input = true && this.isSetInput();
    boolean that_present_input = true && that.isSetInput();
    if (this_present_input || that_present_input) {
      if (!(this_present_input && that_present_input))
        return false;
      if (!this.input.equals(that.input))
        return false;
    }

    boolean this_present_history = true && this.isSetHistory();
    boolean that_present_history = true && that.isSetHistory();
    if (this_present_history || that_present_history) {
      if (!(this_present_history && that_present_history))
        return false;
      if (!this.history.equals(that.history))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_task = true && (isSetTask());
    list.add(present_task);
    if (present_task)
      list.add(task);

    boolean present_assignee = true && (isSetAssignee());
    list.add(present_assignee);
    if (present_assignee)
      list.add(assignee);

    boolean present_process = true && (isSetProcess());
    list.add(present_process);
    if (present_process)
      list.add(process);

    boolean present_input = true && (isSetInput());
    list.add(present_input);
    if (present_input)
      list.add(input);

    boolean present_history = true && (isSetHistory());
    list.add(present_history);
    if (present_history)
      list.add(history);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTaskDetail other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTask()).compareTo(other.isSetTask());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTask()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task, other.task);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAssignee()).compareTo(other.isSetAssignee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAssignee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.assignee, other.assignee);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProcess()).compareTo(other.isSetProcess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.process, other.process);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInput()).compareTo(other.isSetInput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInput()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.input, other.input);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHistory()).compareTo(other.isSetHistory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.history, other.history);
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
    StringBuilder sb = new StringBuilder("TTaskDetail(");
    boolean first = true;

    sb.append("task:");
    if (this.task == null) {
      sb.append("null");
    } else {
      sb.append(this.task);
    }
    first = false;
    if (isSetAssignee()) {
      if (!first) sb.append(", ");
      sb.append("assignee:");
      if (this.assignee == null) {
        sb.append("null");
      } else {
        sb.append(this.assignee);
      }
      first = false;
    }
    if (isSetProcess()) {
      if (!first) sb.append(", ");
      sb.append("process:");
      if (this.process == null) {
        sb.append("null");
      } else {
        sb.append(this.process);
      }
      first = false;
    }
    if (isSetInput()) {
      if (!first) sb.append(", ");
      sb.append("input:");
      if (this.input == null) {
        sb.append("null");
      } else {
        sb.append(this.input);
      }
      first = false;
    }
    if (isSetHistory()) {
      if (!first) sb.append(", ");
      sb.append("history:");
      if (this.history == null) {
        sb.append("null");
      } else {
        sb.append(this.history);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (task == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'task' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (task != null) {
      task.validate();
    }
    if (assignee != null) {
      assignee.validate();
    }
    if (process != null) {
      process.validate();
    }
    if (input != null) {
      input.validate();
    }
    if (history != null) {
      history.validate();
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

  private static class TTaskDetailStandardSchemeFactory implements SchemeFactory {
    public TTaskDetailStandardScheme getScheme() {
      return new TTaskDetailStandardScheme();
    }
  }

  private static class TTaskDetailStandardScheme extends StandardScheme<TTaskDetail> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTaskDetail struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.task = new TTask();
              struct.task.read(iprot);
              struct.setTaskIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ASSIGNEE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.assignee = new TAssignee();
              struct.assignee.read(iprot);
              struct.setAssigneeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.process = new TProcess();
              struct.process.read(iprot);
              struct.setProcessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INPUT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.input = new TTaskInput();
              struct.input.read(iprot);
              struct.setInputIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HISTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.history = new TTaskHistory();
              struct.history.read(iprot);
              struct.setHistoryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTaskDetail struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.task != null) {
        oprot.writeFieldBegin(TASK_FIELD_DESC);
        struct.task.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.assignee != null) {
        if (struct.isSetAssignee()) {
          oprot.writeFieldBegin(ASSIGNEE_FIELD_DESC);
          struct.assignee.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.process != null) {
        if (struct.isSetProcess()) {
          oprot.writeFieldBegin(PROCESS_FIELD_DESC);
          struct.process.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.input != null) {
        if (struct.isSetInput()) {
          oprot.writeFieldBegin(INPUT_FIELD_DESC);
          struct.input.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.history != null) {
        if (struct.isSetHistory()) {
          oprot.writeFieldBegin(HISTORY_FIELD_DESC);
          struct.history.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTaskDetailTupleSchemeFactory implements SchemeFactory {
    public TTaskDetailTupleScheme getScheme() {
      return new TTaskDetailTupleScheme();
    }
  }

  private static class TTaskDetailTupleScheme extends TupleScheme<TTaskDetail> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTaskDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.task.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetAssignee()) {
        optionals.set(0);
      }
      if (struct.isSetProcess()) {
        optionals.set(1);
      }
      if (struct.isSetInput()) {
        optionals.set(2);
      }
      if (struct.isSetHistory()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAssignee()) {
        struct.assignee.write(oprot);
      }
      if (struct.isSetProcess()) {
        struct.process.write(oprot);
      }
      if (struct.isSetInput()) {
        struct.input.write(oprot);
      }
      if (struct.isSetHistory()) {
        struct.history.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTaskDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.task = new TTask();
      struct.task.read(iprot);
      struct.setTaskIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.assignee = new TAssignee();
        struct.assignee.read(iprot);
        struct.setAssigneeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.process = new TProcess();
        struct.process.read(iprot);
        struct.setProcessIsSet(true);
      }
      if (incoming.get(2)) {
        struct.input = new TTaskInput();
        struct.input.read(iprot);
        struct.setInputIsSet(true);
      }
      if (incoming.get(3)) {
        struct.history = new TTaskHistory();
        struct.history.read(iprot);
        struct.setHistoryIsSet(true);
      }
    }
  }

}


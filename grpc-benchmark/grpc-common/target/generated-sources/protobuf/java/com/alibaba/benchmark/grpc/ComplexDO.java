// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Complex.proto

package com.alibaba.benchmark.grpc;

/**
 * Protobuf type {@code grpc.ComplexDO}
 */
public  final class ComplexDO extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.ComplexDO)
    ComplexDOOrBuilder {
  // Use ComplexDO.newBuilder() to construct.
  private ComplexDO(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ComplexDO() {
    pint_ = 0;
    plong_ = 0L;
    pfloat_ = 0F;
    longArray_ = java.util.Collections.emptyList();
    stringArray_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    ip_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ComplexDO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            pint_ = input.readInt32();
            break;
          }
          case 16: {

            plong_ = input.readInt64();
            break;
          }
          case 29: {

            pfloat_ = input.readFloat();
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              longArray_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000008;
            }
            longArray_.add(input.readInt64());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
              longArray_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              longArray_.add(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              stringArray_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            stringArray_.add(s);
            break;
          }
          case 82: {
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        longArray_ = java.util.Collections.unmodifiableList(longArray_);
      }
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        stringArray_ = stringArray_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.benchmark.grpc.EchoServiceProto.internal_static_grpc_ComplexDO_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.benchmark.grpc.EchoServiceProto.internal_static_grpc_ComplexDO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.benchmark.grpc.ComplexDO.class, com.alibaba.benchmark.grpc.ComplexDO.Builder.class);
  }

  private int bitField0_;
  public static final int PINT_FIELD_NUMBER = 1;
  private int pint_;
  /**
   * <code>optional int32 pint = 1;</code>
   */
  public int getPint() {
    return pint_;
  }

  public static final int PLONG_FIELD_NUMBER = 2;
  private long plong_;
  /**
   * <code>optional int64 plong = 2;</code>
   */
  public long getPlong() {
    return plong_;
  }

  public static final int PFLOAT_FIELD_NUMBER = 3;
  private float pfloat_;
  /**
   * <code>optional float pfloat = 3;</code>
   */
  public float getPfloat() {
    return pfloat_;
  }

  public static final int LONGARRAY_FIELD_NUMBER = 4;
  private java.util.List<java.lang.Long> longArray_;
  /**
   * <code>repeated int64 longArray = 4;</code>
   */
  public java.util.List<java.lang.Long>
      getLongArrayList() {
    return longArray_;
  }
  /**
   * <code>repeated int64 longArray = 4;</code>
   */
  public int getLongArrayCount() {
    return longArray_.size();
  }
  /**
   * <code>repeated int64 longArray = 4;</code>
   */
  public long getLongArray(int index) {
    return longArray_.get(index);
  }
  private int longArrayMemoizedSerializedSize = -1;

  public static final int STRINGARRAY_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList stringArray_;
  /**
   * <code>repeated string stringArray = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getStringArrayList() {
    return stringArray_;
  }
  /**
   * <code>repeated string stringArray = 5;</code>
   */
  public int getStringArrayCount() {
    return stringArray_.size();
  }
  /**
   * <code>repeated string stringArray = 5;</code>
   */
  public java.lang.String getStringArray(int index) {
    return stringArray_.get(index);
  }
  /**
   * <code>repeated string stringArray = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStringArrayBytes(int index) {
    return stringArray_.getByteString(index);
  }

  public static final int IP_FIELD_NUMBER = 10;
  private volatile java.lang.Object ip_;
  /**
   * <code>optional string ip = 10;</code>
   */
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <code>optional string ip = 10;</code>
   */
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (pint_ != 0) {
      output.writeInt32(1, pint_);
    }
    if (plong_ != 0L) {
      output.writeInt64(2, plong_);
    }
    if (pfloat_ != 0F) {
      output.writeFloat(3, pfloat_);
    }
    if (getLongArrayList().size() > 0) {
      output.writeRawVarint32(34);
      output.writeRawVarint32(longArrayMemoizedSerializedSize);
    }
    for (int i = 0; i < longArray_.size(); i++) {
      output.writeInt64NoTag(longArray_.get(i));
    }
    for (int i = 0; i < stringArray_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, stringArray_.getRaw(i));
    }
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 10, ip_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pint_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pint_);
    }
    if (plong_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, plong_);
    }
    if (pfloat_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, pfloat_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < longArray_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(longArray_.get(i));
      }
      size += dataSize;
      if (!getLongArrayList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      longArrayMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < stringArray_.size(); i++) {
        dataSize += computeStringSizeNoTag(stringArray_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStringArrayList().size();
    }
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(10, ip_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.alibaba.benchmark.grpc.ComplexDO parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.benchmark.grpc.ComplexDO prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.ComplexDO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.ComplexDO)
      com.alibaba.benchmark.grpc.ComplexDOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.benchmark.grpc.EchoServiceProto.internal_static_grpc_ComplexDO_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.benchmark.grpc.EchoServiceProto.internal_static_grpc_ComplexDO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.benchmark.grpc.ComplexDO.class, com.alibaba.benchmark.grpc.ComplexDO.Builder.class);
    }

    // Construct using com.alibaba.benchmark.grpc.ComplexDO.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      pint_ = 0;

      plong_ = 0L;

      pfloat_ = 0F;

      longArray_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      stringArray_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      ip_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.benchmark.grpc.EchoServiceProto.internal_static_grpc_ComplexDO_descriptor;
    }

    public com.alibaba.benchmark.grpc.ComplexDO getDefaultInstanceForType() {
      return com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance();
    }

    public com.alibaba.benchmark.grpc.ComplexDO build() {
      com.alibaba.benchmark.grpc.ComplexDO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.benchmark.grpc.ComplexDO buildPartial() {
      com.alibaba.benchmark.grpc.ComplexDO result = new com.alibaba.benchmark.grpc.ComplexDO(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.pint_ = pint_;
      result.plong_ = plong_;
      result.pfloat_ = pfloat_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        longArray_ = java.util.Collections.unmodifiableList(longArray_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.longArray_ = longArray_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        stringArray_ = stringArray_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.stringArray_ = stringArray_;
      result.ip_ = ip_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.benchmark.grpc.ComplexDO) {
        return mergeFrom((com.alibaba.benchmark.grpc.ComplexDO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.benchmark.grpc.ComplexDO other) {
      if (other == com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()) return this;
      if (other.getPint() != 0) {
        setPint(other.getPint());
      }
      if (other.getPlong() != 0L) {
        setPlong(other.getPlong());
      }
      if (other.getPfloat() != 0F) {
        setPfloat(other.getPfloat());
      }
      if (!other.longArray_.isEmpty()) {
        if (longArray_.isEmpty()) {
          longArray_ = other.longArray_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureLongArrayIsMutable();
          longArray_.addAll(other.longArray_);
        }
        onChanged();
      }
      if (!other.stringArray_.isEmpty()) {
        if (stringArray_.isEmpty()) {
          stringArray_ = other.stringArray_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureStringArrayIsMutable();
          stringArray_.addAll(other.stringArray_);
        }
        onChanged();
      }
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.benchmark.grpc.ComplexDO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.benchmark.grpc.ComplexDO) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int pint_ ;
    /**
     * <code>optional int32 pint = 1;</code>
     */
    public int getPint() {
      return pint_;
    }
    /**
     * <code>optional int32 pint = 1;</code>
     */
    public Builder setPint(int value) {
      
      pint_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 pint = 1;</code>
     */
    public Builder clearPint() {
      
      pint_ = 0;
      onChanged();
      return this;
    }

    private long plong_ ;
    /**
     * <code>optional int64 plong = 2;</code>
     */
    public long getPlong() {
      return plong_;
    }
    /**
     * <code>optional int64 plong = 2;</code>
     */
    public Builder setPlong(long value) {
      
      plong_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 plong = 2;</code>
     */
    public Builder clearPlong() {
      
      plong_ = 0L;
      onChanged();
      return this;
    }

    private float pfloat_ ;
    /**
     * <code>optional float pfloat = 3;</code>
     */
    public float getPfloat() {
      return pfloat_;
    }
    /**
     * <code>optional float pfloat = 3;</code>
     */
    public Builder setPfloat(float value) {
      
      pfloat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float pfloat = 3;</code>
     */
    public Builder clearPfloat() {
      
      pfloat_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Long> longArray_ = java.util.Collections.emptyList();
    private void ensureLongArrayIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        longArray_ = new java.util.ArrayList<java.lang.Long>(longArray_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated int64 longArray = 4;</code>
     */
    public java.util.List<java.lang.Long>
        getLongArrayList() {
      return java.util.Collections.unmodifiableList(longArray_);
    }
    /**
     * <code>repeated int64 longArray = 4;</code>
     */
    public int getLongArrayCount() {
      return longArray_.size();
    }
    /**
     * <code>repeated int64 longArray = 4;</code>
     */
    public long getLongArray(int index) {
      return longArray_.get(index);
    }
    /**
     * <code>repeated int64 longArray = 4;</code>
     */
    public Builder setLongArray(
        int index, long value) {
      ensureLongArrayIsMutable();
      longArray_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 longArray = 4;</code>
     */
    public Builder addLongArray(long value) {
      ensureLongArrayIsMutable();
      longArray_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 longArray = 4;</code>
     */
    public Builder addAllLongArray(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureLongArrayIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, longArray_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 longArray = 4;</code>
     */
    public Builder clearLongArray() {
      longArray_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList stringArray_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStringArrayIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        stringArray_ = new com.google.protobuf.LazyStringArrayList(stringArray_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getStringArrayList() {
      return stringArray_.getUnmodifiableView();
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public int getStringArrayCount() {
      return stringArray_.size();
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public java.lang.String getStringArray(int index) {
      return stringArray_.get(index);
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStringArrayBytes(int index) {
      return stringArray_.getByteString(index);
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public Builder setStringArray(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStringArrayIsMutable();
      stringArray_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public Builder addStringArray(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStringArrayIsMutable();
      stringArray_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public Builder addAllStringArray(
        java.lang.Iterable<java.lang.String> values) {
      ensureStringArrayIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, stringArray_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public Builder clearStringArray() {
      stringArray_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringArray = 5;</code>
     */
    public Builder addStringArrayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStringArrayIsMutable();
      stringArray_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object ip_ = "";
    /**
     * <code>optional string ip = 10;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string ip = 10;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string ip = 10;</code>
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string ip = 10;</code>
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }
    /**
     * <code>optional string ip = 10;</code>
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ip_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.ComplexDO)
  }

  // @@protoc_insertion_point(class_scope:grpc.ComplexDO)
  private static final com.alibaba.benchmark.grpc.ComplexDO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.benchmark.grpc.ComplexDO();
  }

  public static com.alibaba.benchmark.grpc.ComplexDO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComplexDO>
      PARSER = new com.google.protobuf.AbstractParser<ComplexDO>() {
    public ComplexDO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ComplexDO(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ComplexDO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComplexDO> getParserForType() {
    return PARSER;
  }

  public com.alibaba.benchmark.grpc.ComplexDO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

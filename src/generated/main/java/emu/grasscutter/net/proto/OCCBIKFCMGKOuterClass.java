// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OCCBIKFCMGK.proto

package emu.grasscutter.net.proto;

public final class OCCBIKFCMGKOuterClass {
  private OCCBIKFCMGKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OCCBIKFCMGKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OCCBIKFCMGK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
     * @return Whether the cECPEAKGCFO field is set.
     */
    boolean hasCECPEAKGCFO();
    /**
     * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
     * @return The cECPEAKGCFO.
     */
    emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH getCECPEAKGCFO();
    /**
     * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
     */
    emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLHOrBuilder getCECPEAKGCFOOrBuilder();

    /**
     * <code>repeated uint32 LDDAEIABIEC = 4;</code>
     * @return A list containing the lDDAEIABIEC.
     */
    java.util.List<java.lang.Integer> getLDDAEIABIECList();
    /**
     * <code>repeated uint32 LDDAEIABIEC = 4;</code>
     * @return The count of lDDAEIABIEC.
     */
    int getLDDAEIABIECCount();
    /**
     * <code>repeated uint32 LDDAEIABIEC = 4;</code>
     * @param index The index of the element to return.
     * @return The lDDAEIABIEC at the given index.
     */
    int getLDDAEIABIEC(int index);
  }
  /**
   * <pre>
   * CmdId: 9118
   * </pre>
   *
   * Protobuf type {@code OCCBIKFCMGK}
   */
  public static final class OCCBIKFCMGK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OCCBIKFCMGK)
      OCCBIKFCMGKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OCCBIKFCMGK.newBuilder() to construct.
    private OCCBIKFCMGK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OCCBIKFCMGK() {
      lDDAEIABIEC_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OCCBIKFCMGK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OCCBIKFCMGK(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                lDDAEIABIEC_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              lDDAEIABIEC_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                lDDAEIABIEC_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                lDDAEIABIEC_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.Builder subBuilder = null;
              if (cECPEAKGCFO_ != null) {
                subBuilder = cECPEAKGCFO_.toBuilder();
              }
              cECPEAKGCFO_ = input.readMessage(emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cECPEAKGCFO_);
                cECPEAKGCFO_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          lDDAEIABIEC_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.internal_static_OCCBIKFCMGK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.internal_static_OCCBIKFCMGK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK.class, emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK.Builder.class);
    }

    public static final int CECPEAKGCFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH cECPEAKGCFO_;
    /**
     * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
     * @return Whether the cECPEAKGCFO field is set.
     */
    @java.lang.Override
    public boolean hasCECPEAKGCFO() {
      return cECPEAKGCFO_ != null;
    }
    /**
     * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
     * @return The cECPEAKGCFO.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH getCECPEAKGCFO() {
      return cECPEAKGCFO_ == null ? emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.getDefaultInstance() : cECPEAKGCFO_;
    }
    /**
     * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLHOrBuilder getCECPEAKGCFOOrBuilder() {
      return getCECPEAKGCFO();
    }

    public static final int LDDAEIABIEC_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList lDDAEIABIEC_;
    /**
     * <code>repeated uint32 LDDAEIABIEC = 4;</code>
     * @return A list containing the lDDAEIABIEC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLDDAEIABIECList() {
      return lDDAEIABIEC_;
    }
    /**
     * <code>repeated uint32 LDDAEIABIEC = 4;</code>
     * @return The count of lDDAEIABIEC.
     */
    public int getLDDAEIABIECCount() {
      return lDDAEIABIEC_.size();
    }
    /**
     * <code>repeated uint32 LDDAEIABIEC = 4;</code>
     * @param index The index of the element to return.
     * @return The lDDAEIABIEC at the given index.
     */
    public int getLDDAEIABIEC(int index) {
      return lDDAEIABIEC_.getInt(index);
    }
    private int lDDAEIABIECMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getLDDAEIABIECList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(lDDAEIABIECMemoizedSerializedSize);
      }
      for (int i = 0; i < lDDAEIABIEC_.size(); i++) {
        output.writeUInt32NoTag(lDDAEIABIEC_.getInt(i));
      }
      if (cECPEAKGCFO_ != null) {
        output.writeMessage(15, getCECPEAKGCFO());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < lDDAEIABIEC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(lDDAEIABIEC_.getInt(i));
        }
        size += dataSize;
        if (!getLDDAEIABIECList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lDDAEIABIECMemoizedSerializedSize = dataSize;
      }
      if (cECPEAKGCFO_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getCECPEAKGCFO());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK other = (emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK) obj;

      if (hasCECPEAKGCFO() != other.hasCECPEAKGCFO()) return false;
      if (hasCECPEAKGCFO()) {
        if (!getCECPEAKGCFO()
            .equals(other.getCECPEAKGCFO())) return false;
      }
      if (!getLDDAEIABIECList()
          .equals(other.getLDDAEIABIECList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCECPEAKGCFO()) {
        hash = (37 * hash) + CECPEAKGCFO_FIELD_NUMBER;
        hash = (53 * hash) + getCECPEAKGCFO().hashCode();
      }
      if (getLDDAEIABIECCount() > 0) {
        hash = (37 * hash) + LDDAEIABIEC_FIELD_NUMBER;
        hash = (53 * hash) + getLDDAEIABIECList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 9118
     * </pre>
     *
     * Protobuf type {@code OCCBIKFCMGK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OCCBIKFCMGK)
        emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.internal_static_OCCBIKFCMGK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.internal_static_OCCBIKFCMGK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK.class, emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (cECPEAKGCFOBuilder_ == null) {
          cECPEAKGCFO_ = null;
        } else {
          cECPEAKGCFO_ = null;
          cECPEAKGCFOBuilder_ = null;
        }
        lDDAEIABIEC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.internal_static_OCCBIKFCMGK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK build() {
        emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK buildPartial() {
        emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK result = new emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK(this);
        int from_bitField0_ = bitField0_;
        if (cECPEAKGCFOBuilder_ == null) {
          result.cECPEAKGCFO_ = cECPEAKGCFO_;
        } else {
          result.cECPEAKGCFO_ = cECPEAKGCFOBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          lDDAEIABIEC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lDDAEIABIEC_ = lDDAEIABIEC_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK) {
          return mergeFrom((emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK other) {
        if (other == emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK.getDefaultInstance()) return this;
        if (other.hasCECPEAKGCFO()) {
          mergeCECPEAKGCFO(other.getCECPEAKGCFO());
        }
        if (!other.lDDAEIABIEC_.isEmpty()) {
          if (lDDAEIABIEC_.isEmpty()) {
            lDDAEIABIEC_ = other.lDDAEIABIEC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLDDAEIABIECIsMutable();
            lDDAEIABIEC_.addAll(other.lDDAEIABIEC_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH cECPEAKGCFO_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH, emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.Builder, emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLHOrBuilder> cECPEAKGCFOBuilder_;
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       * @return Whether the cECPEAKGCFO field is set.
       */
      public boolean hasCECPEAKGCFO() {
        return cECPEAKGCFOBuilder_ != null || cECPEAKGCFO_ != null;
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       * @return The cECPEAKGCFO.
       */
      public emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH getCECPEAKGCFO() {
        if (cECPEAKGCFOBuilder_ == null) {
          return cECPEAKGCFO_ == null ? emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.getDefaultInstance() : cECPEAKGCFO_;
        } else {
          return cECPEAKGCFOBuilder_.getMessage();
        }
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       */
      public Builder setCECPEAKGCFO(emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH value) {
        if (cECPEAKGCFOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cECPEAKGCFO_ = value;
          onChanged();
        } else {
          cECPEAKGCFOBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       */
      public Builder setCECPEAKGCFO(
          emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.Builder builderForValue) {
        if (cECPEAKGCFOBuilder_ == null) {
          cECPEAKGCFO_ = builderForValue.build();
          onChanged();
        } else {
          cECPEAKGCFOBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       */
      public Builder mergeCECPEAKGCFO(emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH value) {
        if (cECPEAKGCFOBuilder_ == null) {
          if (cECPEAKGCFO_ != null) {
            cECPEAKGCFO_ =
              emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.newBuilder(cECPEAKGCFO_).mergeFrom(value).buildPartial();
          } else {
            cECPEAKGCFO_ = value;
          }
          onChanged();
        } else {
          cECPEAKGCFOBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       */
      public Builder clearCECPEAKGCFO() {
        if (cECPEAKGCFOBuilder_ == null) {
          cECPEAKGCFO_ = null;
          onChanged();
        } else {
          cECPEAKGCFO_ = null;
          cECPEAKGCFOBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       */
      public emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.Builder getCECPEAKGCFOBuilder() {
        
        onChanged();
        return getCECPEAKGCFOFieldBuilder().getBuilder();
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       */
      public emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLHOrBuilder getCECPEAKGCFOOrBuilder() {
        if (cECPEAKGCFOBuilder_ != null) {
          return cECPEAKGCFOBuilder_.getMessageOrBuilder();
        } else {
          return cECPEAKGCFO_ == null ?
              emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.getDefaultInstance() : cECPEAKGCFO_;
        }
      }
      /**
       * <code>.GGJENGOICLH CECPEAKGCFO = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH, emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.Builder, emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLHOrBuilder> 
          getCECPEAKGCFOFieldBuilder() {
        if (cECPEAKGCFOBuilder_ == null) {
          cECPEAKGCFOBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH, emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLH.Builder, emu.grasscutter.net.proto.GGJENGOICLHOuterClass.GGJENGOICLHOrBuilder>(
                  getCECPEAKGCFO(),
                  getParentForChildren(),
                  isClean());
          cECPEAKGCFO_ = null;
        }
        return cECPEAKGCFOBuilder_;
      }

      private com.google.protobuf.Internal.IntList lDDAEIABIEC_ = emptyIntList();
      private void ensureLDDAEIABIECIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          lDDAEIABIEC_ = mutableCopy(lDDAEIABIEC_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 LDDAEIABIEC = 4;</code>
       * @return A list containing the lDDAEIABIEC.
       */
      public java.util.List<java.lang.Integer>
          getLDDAEIABIECList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(lDDAEIABIEC_) : lDDAEIABIEC_;
      }
      /**
       * <code>repeated uint32 LDDAEIABIEC = 4;</code>
       * @return The count of lDDAEIABIEC.
       */
      public int getLDDAEIABIECCount() {
        return lDDAEIABIEC_.size();
      }
      /**
       * <code>repeated uint32 LDDAEIABIEC = 4;</code>
       * @param index The index of the element to return.
       * @return The lDDAEIABIEC at the given index.
       */
      public int getLDDAEIABIEC(int index) {
        return lDDAEIABIEC_.getInt(index);
      }
      /**
       * <code>repeated uint32 LDDAEIABIEC = 4;</code>
       * @param index The index to set the value at.
       * @param value The lDDAEIABIEC to set.
       * @return This builder for chaining.
       */
      public Builder setLDDAEIABIEC(
          int index, int value) {
        ensureLDDAEIABIECIsMutable();
        lDDAEIABIEC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LDDAEIABIEC = 4;</code>
       * @param value The lDDAEIABIEC to add.
       * @return This builder for chaining.
       */
      public Builder addLDDAEIABIEC(int value) {
        ensureLDDAEIABIECIsMutable();
        lDDAEIABIEC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LDDAEIABIEC = 4;</code>
       * @param values The lDDAEIABIEC to add.
       * @return This builder for chaining.
       */
      public Builder addAllLDDAEIABIEC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLDDAEIABIECIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lDDAEIABIEC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LDDAEIABIEC = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLDDAEIABIEC() {
        lDDAEIABIEC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:OCCBIKFCMGK)
    }

    // @@protoc_insertion_point(class_scope:OCCBIKFCMGK)
    private static final emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK();
    }

    public static emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OCCBIKFCMGK>
        PARSER = new com.google.protobuf.AbstractParser<OCCBIKFCMGK>() {
      @java.lang.Override
      public OCCBIKFCMGK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OCCBIKFCMGK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OCCBIKFCMGK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OCCBIKFCMGK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OCCBIKFCMGKOuterClass.OCCBIKFCMGK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OCCBIKFCMGK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OCCBIKFCMGK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OCCBIKFCMGK.proto\032\021GGJENGOICLH.proto\"E" +
      "\n\013OCCBIKFCMGK\022!\n\013CECPEAKGCFO\030\017 \001(\0132\014.GGJ" +
      "ENGOICLH\022\023\n\013LDDAEIABIEC\030\004 \003(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GGJENGOICLHOuterClass.getDescriptor(),
        });
    internal_static_OCCBIKFCMGK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OCCBIKFCMGK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OCCBIKFCMGK_descriptor,
        new java.lang.String[] { "CECPEAKGCFO", "LDDAEIABIEC", });
    emu.grasscutter.net.proto.GGJENGOICLHOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
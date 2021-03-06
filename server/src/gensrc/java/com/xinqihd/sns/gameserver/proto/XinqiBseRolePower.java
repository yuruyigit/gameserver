// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseRolePower.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseRolePower {
  private XinqiBseRolePower() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseRolePowerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string sessionID = 1;
    boolean hasSessionID();
    String getSessionID();
    
    // required bool full = 2;
    boolean hasFull();
    boolean getFull();
  }
  public static final class BseRolePower extends
      com.google.protobuf.GeneratedMessage
      implements BseRolePowerOrBuilder {
    // Use BseRolePower.newBuilder() to construct.
    private BseRolePower(Builder builder) {
      super(builder);
    }
    private BseRolePower(boolean noInit) {}
    
    private static final BseRolePower defaultInstance;
    public static BseRolePower getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseRolePower getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string sessionID = 1;
    public static final int SESSIONID_FIELD_NUMBER = 1;
    private java.lang.Object sessionID_;
    public boolean hasSessionID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getSessionID() {
      java.lang.Object ref = sessionID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          sessionID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSessionIDBytes() {
      java.lang.Object ref = sessionID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        sessionID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required bool full = 2;
    public static final int FULL_FIELD_NUMBER = 2;
    private boolean full_;
    public boolean hasFull() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getFull() {
      return full_;
    }
    
    private void initFields() {
      sessionID_ = "";
      full_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSessionID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFull()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSessionIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, full_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getSessionIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, full_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePowerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        sessionID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        full_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower result = new com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sessionID_ = sessionID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.full_ = full_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower.getDefaultInstance()) return this;
        if (other.hasSessionID()) {
          setSessionID(other.getSessionID());
        }
        if (other.hasFull()) {
          setFull(other.getFull());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSessionID()) {
          
          return false;
        }
        if (!hasFull()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              sessionID_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              full_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string sessionID = 1;
      private java.lang.Object sessionID_ = "";
      public boolean hasSessionID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getSessionID() {
        java.lang.Object ref = sessionID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          sessionID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSessionID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sessionID_ = value;
        onChanged();
        return this;
      }
      public Builder clearSessionID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionID_ = getDefaultInstance().getSessionID();
        onChanged();
        return this;
      }
      void setSessionID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        sessionID_ = value;
        onChanged();
      }
      
      // required bool full = 2;
      private boolean full_ ;
      public boolean hasFull() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getFull() {
        return full_;
      }
      public Builder setFull(boolean value) {
        bitField0_ |= 0x00000002;
        full_ = value;
        onChanged();
        return this;
      }
      public Builder clearFull() {
        bitField0_ = (bitField0_ & ~0x00000002);
        full_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseRolePower)
    }
    
    static {
      defaultInstance = new BseRolePower(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseRolePower)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BseRolePower.proto\022 com.xinqihd.sns.ga" +
      "meserver.proto\"/\n\014BseRolePower\022\021\n\tsessio" +
      "nID\030\001 \002(\t\022\014\n\004full\030\002 \002(\010B\023B\021XinqiBseRoleP" +
      "ower"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseRolePower_descriptor,
              new java.lang.String[] { "SessionID", "Full", },
              com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseRolePower.BseRolePower.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}

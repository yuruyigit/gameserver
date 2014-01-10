// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseUserEnterRoom.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseUserEnterRoom {
  private XinqiBseUserEnterRoom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseUserEnterRoomOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string roomId = 1;
    boolean hasRoomId();
    String getRoomId();
    
    // required .com.xinqihd.sns.gameserver.proto.RoleInfo role = 2;
    boolean hasRole();
    com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo getRole();
    com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder getRoleOrBuilder();
    
    // optional bool automode = 3;
    boolean hasAutomode();
    boolean getAutomode();
  }
  public static final class BseUserEnterRoom extends
      com.google.protobuf.GeneratedMessage
      implements BseUserEnterRoomOrBuilder {
    // Use BseUserEnterRoom.newBuilder() to construct.
    private BseUserEnterRoom(Builder builder) {
      super(builder);
    }
    private BseUserEnterRoom(boolean noInit) {}
    
    private static final BseUserEnterRoom defaultInstance;
    public static BseUserEnterRoom getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseUserEnterRoom getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string roomId = 1;
    public static final int ROOMID_FIELD_NUMBER = 1;
    private java.lang.Object roomId_;
    public boolean hasRoomId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getRoomId() {
      java.lang.Object ref = roomId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          roomId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRoomIdBytes() {
      java.lang.Object ref = roomId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        roomId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required .com.xinqihd.sns.gameserver.proto.RoleInfo role = 2;
    public static final int ROLE_FIELD_NUMBER = 2;
    private com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo role_;
    public boolean hasRole() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo getRole() {
      return role_;
    }
    public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder getRoleOrBuilder() {
      return role_;
    }
    
    // optional bool automode = 3;
    public static final int AUTOMODE_FIELD_NUMBER = 3;
    private boolean automode_;
    public boolean hasAutomode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getAutomode() {
      return automode_;
    }
    
    private void initFields() {
      roomId_ = "";
      role_ = com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.getDefaultInstance();
      automode_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasRoomId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRole()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRole().isInitialized()) {
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
        output.writeBytes(1, getRoomIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, role_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, automode_);
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
          .computeBytesSize(1, getRoomIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, role_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, automode_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRoleFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        roomId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (roleBuilder_ == null) {
          role_ = com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.getDefaultInstance();
        } else {
          roleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        automode_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom result = new com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.roomId_ = roomId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (roleBuilder_ == null) {
          result.role_ = role_;
        } else {
          result.role_ = roleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.automode_ = automode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom.getDefaultInstance()) return this;
        if (other.hasRoomId()) {
          setRoomId(other.getRoomId());
        }
        if (other.hasRole()) {
          mergeRole(other.getRole());
        }
        if (other.hasAutomode()) {
          setAutomode(other.getAutomode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasRoomId()) {
          
          return false;
        }
        if (!hasRole()) {
          
          return false;
        }
        if (!getRole().isInitialized()) {
          
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
              roomId_ = input.readBytes();
              break;
            }
            case 18: {
              com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.newBuilder();
              if (hasRole()) {
                subBuilder.mergeFrom(getRole());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setRole(subBuilder.buildPartial());
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              automode_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string roomId = 1;
      private java.lang.Object roomId_ = "";
      public boolean hasRoomId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getRoomId() {
        java.lang.Object ref = roomId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          roomId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRoomId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        roomId_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoomId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        roomId_ = getDefaultInstance().getRoomId();
        onChanged();
        return this;
      }
      void setRoomId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        roomId_ = value;
        onChanged();
      }
      
      // required .com.xinqihd.sns.gameserver.proto.RoleInfo role = 2;
      private com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo role_ = com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder> roleBuilder_;
      public boolean hasRole() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo getRole() {
        if (roleBuilder_ == null) {
          return role_;
        } else {
          return roleBuilder_.getMessage();
        }
      }
      public Builder setRole(com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo value) {
        if (roleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          role_ = value;
          onChanged();
        } else {
          roleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setRole(
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder builderForValue) {
        if (roleBuilder_ == null) {
          role_ = builderForValue.build();
          onChanged();
        } else {
          roleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeRole(com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo value) {
        if (roleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              role_ != com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.getDefaultInstance()) {
            role_ =
              com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.newBuilder(role_).mergeFrom(value).buildPartial();
          } else {
            role_ = value;
          }
          onChanged();
        } else {
          roleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearRole() {
        if (roleBuilder_ == null) {
          role_ = com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.getDefaultInstance();
          onChanged();
        } else {
          roleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder getRoleBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getRoleFieldBuilder().getBuilder();
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder getRoleOrBuilder() {
        if (roleBuilder_ != null) {
          return roleBuilder_.getMessageOrBuilder();
        } else {
          return role_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder> 
          getRoleFieldBuilder() {
        if (roleBuilder_ == null) {
          roleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder>(
                  role_,
                  getParentForChildren(),
                  isClean());
          role_ = null;
        }
        return roleBuilder_;
      }
      
      // optional bool automode = 3;
      private boolean automode_ ;
      public boolean hasAutomode() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getAutomode() {
        return automode_;
      }
      public Builder setAutomode(boolean value) {
        bitField0_ |= 0x00000004;
        automode_ = value;
        onChanged();
        return this;
      }
      public Builder clearAutomode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        automode_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseUserEnterRoom)
    }
    
    static {
      defaultInstance = new BseUserEnterRoom(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseUserEnterRoom)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BseUserEnterRoom.proto\022 com.xinqihd.sn" +
      "s.gameserver.proto\032\016RoleInfo.proto\"n\n\020Bs" +
      "eUserEnterRoom\022\016\n\006roomId\030\001 \002(\t\0228\n\004role\030\002" +
      " \002(\0132*.com.xinqihd.sns.gameserver.proto." +
      "RoleInfo\022\020\n\010automode\030\003 \001(\010B\027B\025XinqiBseUs" +
      "erEnterRoom"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseUserEnterRoom_descriptor,
              new java.lang.String[] { "RoomId", "Role", "Automode", },
              com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseUserEnterRoom.BseUserEnterRoom.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GuildMember.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiGuildMember {
  private XinqiGuildMember() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GuildMemberOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string userid = 1;
    boolean hasUserid();
    String getUserid();
    
    // optional string name = 2;
    boolean hasName();
    String getName();
    
    // optional int32 level = 3;
    boolean hasLevel();
    int getLevel();
    
    // optional int32 gender = 4;
    boolean hasGender();
    int getGender();
    
    // optional int32 power = 5;
    boolean hasPower();
    int getPower();
    
    // optional int32 viplevel = 6;
    boolean hasViplevel();
    int getViplevel();
    
    // optional string rolekey = 8;
    boolean hasRolekey();
    String getRolekey();
    
    // optional string roledesc = 9;
    boolean hasRoledesc();
    String getRoledesc();
    
    // optional int32 credit = 10;
    boolean hasCredit();
    int getCredit();
    
    // optional int32 totalcredit = 11;
    boolean hasTotalcredit();
    int getTotalcredit();
    
    // optional bool isonline = 20;
    boolean hasIsonline();
    boolean getIsonline();
  }
  public static final class GuildMember extends
      com.google.protobuf.GeneratedMessage
      implements GuildMemberOrBuilder {
    // Use GuildMember.newBuilder() to construct.
    private GuildMember(Builder builder) {
      super(builder);
    }
    private GuildMember(boolean noInit) {}
    
    private static final GuildMember defaultInstance;
    public static GuildMember getDefaultInstance() {
      return defaultInstance;
    }
    
    public GuildMember getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiGuildMember.internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiGuildMember.internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string userid = 1;
    public static final int USERID_FIELD_NUMBER = 1;
    private java.lang.Object userid_;
    public boolean hasUserid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUserid() {
      java.lang.Object ref = userid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          userid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUseridBytes() {
      java.lang.Object ref = userid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        userid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 level = 3;
    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getLevel() {
      return level_;
    }
    
    // optional int32 gender = 4;
    public static final int GENDER_FIELD_NUMBER = 4;
    private int gender_;
    public boolean hasGender() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getGender() {
      return gender_;
    }
    
    // optional int32 power = 5;
    public static final int POWER_FIELD_NUMBER = 5;
    private int power_;
    public boolean hasPower() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getPower() {
      return power_;
    }
    
    // optional int32 viplevel = 6;
    public static final int VIPLEVEL_FIELD_NUMBER = 6;
    private int viplevel_;
    public boolean hasViplevel() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getViplevel() {
      return viplevel_;
    }
    
    // optional string rolekey = 8;
    public static final int ROLEKEY_FIELD_NUMBER = 8;
    private java.lang.Object rolekey_;
    public boolean hasRolekey() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getRolekey() {
      java.lang.Object ref = rolekey_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          rolekey_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRolekeyBytes() {
      java.lang.Object ref = rolekey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        rolekey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string roledesc = 9;
    public static final int ROLEDESC_FIELD_NUMBER = 9;
    private java.lang.Object roledesc_;
    public boolean hasRoledesc() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public String getRoledesc() {
      java.lang.Object ref = roledesc_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          roledesc_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRoledescBytes() {
      java.lang.Object ref = roledesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        roledesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 credit = 10;
    public static final int CREDIT_FIELD_NUMBER = 10;
    private int credit_;
    public boolean hasCredit() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getCredit() {
      return credit_;
    }
    
    // optional int32 totalcredit = 11;
    public static final int TOTALCREDIT_FIELD_NUMBER = 11;
    private int totalcredit_;
    public boolean hasTotalcredit() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public int getTotalcredit() {
      return totalcredit_;
    }
    
    // optional bool isonline = 20;
    public static final int ISONLINE_FIELD_NUMBER = 20;
    private boolean isonline_;
    public boolean hasIsonline() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public boolean getIsonline() {
      return isonline_;
    }
    
    private void initFields() {
      userid_ = "";
      name_ = "";
      level_ = 0;
      gender_ = 0;
      power_ = 0;
      viplevel_ = 0;
      rolekey_ = "";
      roledesc_ = "";
      credit_ = 0;
      totalcredit_ = 0;
      isonline_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUseridBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, level_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, gender_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, power_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, viplevel_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(8, getRolekeyBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(9, getRoledescBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(10, credit_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(11, totalcredit_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeBool(20, isonline_);
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
          .computeBytesSize(1, getUseridBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, level_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, gender_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, power_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, viplevel_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getRolekeyBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, getRoledescBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, credit_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, totalcredit_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(20, isonline_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildMember.internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildMember.internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.newBuilder()
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
        userid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        gender_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        power_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        viplevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        rolekey_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        roledesc_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        credit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        totalcredit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        isonline_ = false;
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember build() {
        com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember result = new com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userid_ = userid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.gender_ = gender_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.power_ = power_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.viplevel_ = viplevel_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.rolekey_ = rolekey_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.roledesc_ = roledesc_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.credit_ = credit_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.totalcredit_ = totalcredit_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.isonline_ = isonline_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.getDefaultInstance()) return this;
        if (other.hasUserid()) {
          setUserid(other.getUserid());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasGender()) {
          setGender(other.getGender());
        }
        if (other.hasPower()) {
          setPower(other.getPower());
        }
        if (other.hasViplevel()) {
          setViplevel(other.getViplevel());
        }
        if (other.hasRolekey()) {
          setRolekey(other.getRolekey());
        }
        if (other.hasRoledesc()) {
          setRoledesc(other.getRoledesc());
        }
        if (other.hasCredit()) {
          setCredit(other.getCredit());
        }
        if (other.hasTotalcredit()) {
          setTotalcredit(other.getTotalcredit());
        }
        if (other.hasIsonline()) {
          setIsonline(other.getIsonline());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              userid_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              level_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              gender_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              power_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              viplevel_ = input.readInt32();
              break;
            }
            case 66: {
              bitField0_ |= 0x00000040;
              rolekey_ = input.readBytes();
              break;
            }
            case 74: {
              bitField0_ |= 0x00000080;
              roledesc_ = input.readBytes();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000100;
              credit_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000200;
              totalcredit_ = input.readInt32();
              break;
            }
            case 160: {
              bitField0_ |= 0x00000400;
              isonline_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string userid = 1;
      private java.lang.Object userid_ = "";
      public boolean hasUserid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUserid() {
        java.lang.Object ref = userid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          userid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUserid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userid_ = getDefaultInstance().getUserid();
        onChanged();
        return this;
      }
      void setUserid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        userid_ = value;
        onChanged();
      }
      
      // optional string name = 2;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
      }
      
      // optional int32 level = 3;
      private int level_ ;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getLevel() {
        return level_;
      }
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000004;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 gender = 4;
      private int gender_ ;
      public boolean hasGender() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getGender() {
        return gender_;
      }
      public Builder setGender(int value) {
        bitField0_ |= 0x00000008;
        gender_ = value;
        onChanged();
        return this;
      }
      public Builder clearGender() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gender_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 power = 5;
      private int power_ ;
      public boolean hasPower() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getPower() {
        return power_;
      }
      public Builder setPower(int value) {
        bitField0_ |= 0x00000010;
        power_ = value;
        onChanged();
        return this;
      }
      public Builder clearPower() {
        bitField0_ = (bitField0_ & ~0x00000010);
        power_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 viplevel = 6;
      private int viplevel_ ;
      public boolean hasViplevel() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getViplevel() {
        return viplevel_;
      }
      public Builder setViplevel(int value) {
        bitField0_ |= 0x00000020;
        viplevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearViplevel() {
        bitField0_ = (bitField0_ & ~0x00000020);
        viplevel_ = 0;
        onChanged();
        return this;
      }
      
      // optional string rolekey = 8;
      private java.lang.Object rolekey_ = "";
      public boolean hasRolekey() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getRolekey() {
        java.lang.Object ref = rolekey_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          rolekey_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRolekey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        rolekey_ = value;
        onChanged();
        return this;
      }
      public Builder clearRolekey() {
        bitField0_ = (bitField0_ & ~0x00000040);
        rolekey_ = getDefaultInstance().getRolekey();
        onChanged();
        return this;
      }
      void setRolekey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        rolekey_ = value;
        onChanged();
      }
      
      // optional string roledesc = 9;
      private java.lang.Object roledesc_ = "";
      public boolean hasRoledesc() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public String getRoledesc() {
        java.lang.Object ref = roledesc_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          roledesc_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRoledesc(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        roledesc_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoledesc() {
        bitField0_ = (bitField0_ & ~0x00000080);
        roledesc_ = getDefaultInstance().getRoledesc();
        onChanged();
        return this;
      }
      void setRoledesc(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000080;
        roledesc_ = value;
        onChanged();
      }
      
      // optional int32 credit = 10;
      private int credit_ ;
      public boolean hasCredit() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getCredit() {
        return credit_;
      }
      public Builder setCredit(int value) {
        bitField0_ |= 0x00000100;
        credit_ = value;
        onChanged();
        return this;
      }
      public Builder clearCredit() {
        bitField0_ = (bitField0_ & ~0x00000100);
        credit_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 totalcredit = 11;
      private int totalcredit_ ;
      public boolean hasTotalcredit() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public int getTotalcredit() {
        return totalcredit_;
      }
      public Builder setTotalcredit(int value) {
        bitField0_ |= 0x00000200;
        totalcredit_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalcredit() {
        bitField0_ = (bitField0_ & ~0x00000200);
        totalcredit_ = 0;
        onChanged();
        return this;
      }
      
      // optional bool isonline = 20;
      private boolean isonline_ ;
      public boolean hasIsonline() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public boolean getIsonline() {
        return isonline_;
      }
      public Builder setIsonline(boolean value) {
        bitField0_ |= 0x00000400;
        isonline_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsonline() {
        bitField0_ = (bitField0_ & ~0x00000400);
        isonline_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.GuildMember)
    }
    
    static {
      defaultInstance = new GuildMember(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.GuildMember)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GuildMember.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\"\305\001\n\013GuildMember\022\016\n\006userid\030" +
      "\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005level\030\003 \001(\005\022\016\n\006ge" +
      "nder\030\004 \001(\005\022\r\n\005power\030\005 \001(\005\022\020\n\010viplevel\030\006 " +
      "\001(\005\022\017\n\007rolekey\030\010 \001(\t\022\020\n\010roledesc\030\t \001(\t\022\016" +
      "\n\006credit\030\n \001(\005\022\023\n\013totalcredit\030\013 \001(\005\022\020\n\010i" +
      "sonline\030\024 \001(\010B\022B\020XinqiGuildMember"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_GuildMember_descriptor,
              new java.lang.String[] { "Userid", "Name", "Level", "Gender", "Power", "Viplevel", "Rolekey", "Roledesc", "Credit", "Totalcredit", "Isonline", },
              com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.class,
              com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder.class);
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

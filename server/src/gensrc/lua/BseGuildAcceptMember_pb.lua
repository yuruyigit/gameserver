-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildAcceptMember_pb', package.seeall)


local BSEGUILDACCEPTMEMBER = protobuf.Descriptor();
local BSEGUILDACCEPTMEMBER_RESULT_FIELD = protobuf.FieldDescriptor();
local BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD = protobuf.FieldDescriptor();
local BSEGUILDACCEPTMEMBER_UID_FIELD = protobuf.FieldDescriptor();

BSEGUILDACCEPTMEMBER_RESULT_FIELD.name = "result"
BSEGUILDACCEPTMEMBER_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildAcceptMember.result"
BSEGUILDACCEPTMEMBER_RESULT_FIELD.number = 1
BSEGUILDACCEPTMEMBER_RESULT_FIELD.index = 0
BSEGUILDACCEPTMEMBER_RESULT_FIELD.label = 2
BSEGUILDACCEPTMEMBER_RESULT_FIELD.has_default_value = false
BSEGUILDACCEPTMEMBER_RESULT_FIELD.default_value = 0
BSEGUILDACCEPTMEMBER_RESULT_FIELD.type = 5
BSEGUILDACCEPTMEMBER_RESULT_FIELD.cpp_type = 1

BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.name = "guildInfo"
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildAcceptMember.guildInfo"
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.number = 2
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.index = 1
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.label = 1
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.has_default_value = false
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.default_value = nil
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.message_type = GUILDINFO_PB_GUILDINFO
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.type = 11
BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD.cpp_type = 10

BSEGUILDACCEPTMEMBER_UID_FIELD.name = "uid"
BSEGUILDACCEPTMEMBER_UID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildAcceptMember.uid"
BSEGUILDACCEPTMEMBER_UID_FIELD.number = 3
BSEGUILDACCEPTMEMBER_UID_FIELD.index = 2
BSEGUILDACCEPTMEMBER_UID_FIELD.label = 1
BSEGUILDACCEPTMEMBER_UID_FIELD.has_default_value = false
BSEGUILDACCEPTMEMBER_UID_FIELD.default_value = ""
BSEGUILDACCEPTMEMBER_UID_FIELD.type = 9
BSEGUILDACCEPTMEMBER_UID_FIELD.cpp_type = 9

BSEGUILDACCEPTMEMBER.name = "BseGuildAcceptMember"
BSEGUILDACCEPTMEMBER.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildAcceptMember"
BSEGUILDACCEPTMEMBER.nested_types = {}
BSEGUILDACCEPTMEMBER.enum_types = {}
BSEGUILDACCEPTMEMBER.fields = {BSEGUILDACCEPTMEMBER_RESULT_FIELD, BSEGUILDACCEPTMEMBER_GUILDINFO_FIELD, BSEGUILDACCEPTMEMBER_UID_FIELD}
BSEGUILDACCEPTMEMBER.is_extendable = false
BSEGUILDACCEPTMEMBER.extensions = {}

BseGuildAcceptMember = protobuf.Message(BSEGUILDACCEPTMEMBER)
_G.BSEGUILDACCEPTMEMBER_PB_BSEGUILDACCEPTMEMBER = BSEGUILDACCEPTMEMBER


-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuideFinish_pb', package.seeall)


local BCEGUIDEFINISH = protobuf.Descriptor();
local BCEGUIDEFINISH_UID_FIELD = protobuf.FieldDescriptor();

BCEGUIDEFINISH_UID_FIELD.name = "uid"
BCEGUIDEFINISH_UID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuideFinish.uid"
BCEGUIDEFINISH_UID_FIELD.number = 1
BCEGUIDEFINISH_UID_FIELD.index = 0
BCEGUIDEFINISH_UID_FIELD.label = 1
BCEGUIDEFINISH_UID_FIELD.has_default_value = false
BCEGUIDEFINISH_UID_FIELD.default_value = ""
BCEGUIDEFINISH_UID_FIELD.type = 9
BCEGUIDEFINISH_UID_FIELD.cpp_type = 9

BCEGUIDEFINISH.name = "BceGuideFinish"
BCEGUIDEFINISH.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuideFinish"
BCEGUIDEFINISH.nested_types = {}
BCEGUIDEFINISH.enum_types = {}
BCEGUIDEFINISH.fields = {BCEGUIDEFINISH_UID_FIELD}
BCEGUIDEFINISH.is_extendable = false
BCEGUIDEFINISH.extensions = {}

BceGuideFinish = protobuf.Message(BCEGUIDEFINISH)
_G.BCEGUIDEFINISH_PB_BCEGUIDEFINISH = BCEGUIDEFINISH


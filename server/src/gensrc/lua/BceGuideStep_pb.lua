-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuideStep_pb', package.seeall)


local BCEGUIDESTEP = protobuf.Descriptor();
local BCEGUIDESTEP_STEP_FIELD = protobuf.FieldDescriptor();

BCEGUIDESTEP_STEP_FIELD.name = "step"
BCEGUIDESTEP_STEP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuideStep.step"
BCEGUIDESTEP_STEP_FIELD.number = 1
BCEGUIDESTEP_STEP_FIELD.index = 0
BCEGUIDESTEP_STEP_FIELD.label = 2
BCEGUIDESTEP_STEP_FIELD.has_default_value = false
BCEGUIDESTEP_STEP_FIELD.default_value = 0
BCEGUIDESTEP_STEP_FIELD.type = 5
BCEGUIDESTEP_STEP_FIELD.cpp_type = 1

BCEGUIDESTEP.name = "BceGuideStep"
BCEGUIDESTEP.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuideStep"
BCEGUIDESTEP.nested_types = {}
BCEGUIDESTEP.enum_types = {}
BCEGUIDESTEP.fields = {BCEGUIDESTEP_STEP_FIELD}
BCEGUIDESTEP.is_extendable = false
BCEGUIDESTEP.extensions = {}

BceGuideStep = protobuf.Message(BCEGUIDESTEP)
_G.BCEGUIDESTEP_PB_BCEGUIDESTEP = BCEGUIDESTEP


-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseHallUserList_pb', package.seeall)


local BSEHALLUSERLIST = protobuf.Descriptor();
local BSEHALLUSERLIST_USERID_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_NAME_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_URL_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_LEVEL_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_GENDER_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_WIN_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_TOTAL_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_ATTACK_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_YELLOWDMD_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_YELLOWDMDLV_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_POWER_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_USERCOUNT_FIELD = protobuf.FieldDescriptor();
local BSEHALLUSERLIST_PAGE_FIELD = protobuf.FieldDescriptor();

BSEHALLUSERLIST_USERID_FIELD.name = "userId"
BSEHALLUSERLIST_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.userId"
BSEHALLUSERLIST_USERID_FIELD.number = 1
BSEHALLUSERLIST_USERID_FIELD.index = 0
BSEHALLUSERLIST_USERID_FIELD.label = 3
BSEHALLUSERLIST_USERID_FIELD.has_default_value = false
BSEHALLUSERLIST_USERID_FIELD.default_value = {}
BSEHALLUSERLIST_USERID_FIELD.type = 9
BSEHALLUSERLIST_USERID_FIELD.cpp_type = 9

BSEHALLUSERLIST_NAME_FIELD.name = "name"
BSEHALLUSERLIST_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.name"
BSEHALLUSERLIST_NAME_FIELD.number = 2
BSEHALLUSERLIST_NAME_FIELD.index = 1
BSEHALLUSERLIST_NAME_FIELD.label = 3
BSEHALLUSERLIST_NAME_FIELD.has_default_value = false
BSEHALLUSERLIST_NAME_FIELD.default_value = {}
BSEHALLUSERLIST_NAME_FIELD.type = 9
BSEHALLUSERLIST_NAME_FIELD.cpp_type = 9

BSEHALLUSERLIST_URL_FIELD.name = "url"
BSEHALLUSERLIST_URL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.url"
BSEHALLUSERLIST_URL_FIELD.number = 3
BSEHALLUSERLIST_URL_FIELD.index = 2
BSEHALLUSERLIST_URL_FIELD.label = 3
BSEHALLUSERLIST_URL_FIELD.has_default_value = false
BSEHALLUSERLIST_URL_FIELD.default_value = {}
BSEHALLUSERLIST_URL_FIELD.type = 9
BSEHALLUSERLIST_URL_FIELD.cpp_type = 9

BSEHALLUSERLIST_LEVEL_FIELD.name = "level"
BSEHALLUSERLIST_LEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.level"
BSEHALLUSERLIST_LEVEL_FIELD.number = 4
BSEHALLUSERLIST_LEVEL_FIELD.index = 3
BSEHALLUSERLIST_LEVEL_FIELD.label = 3
BSEHALLUSERLIST_LEVEL_FIELD.has_default_value = false
BSEHALLUSERLIST_LEVEL_FIELD.default_value = {}
BSEHALLUSERLIST_LEVEL_FIELD.type = 5
BSEHALLUSERLIST_LEVEL_FIELD.cpp_type = 1

BSEHALLUSERLIST_GENDER_FIELD.name = "gender"
BSEHALLUSERLIST_GENDER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.gender"
BSEHALLUSERLIST_GENDER_FIELD.number = 5
BSEHALLUSERLIST_GENDER_FIELD.index = 4
BSEHALLUSERLIST_GENDER_FIELD.label = 3
BSEHALLUSERLIST_GENDER_FIELD.has_default_value = false
BSEHALLUSERLIST_GENDER_FIELD.default_value = {}
BSEHALLUSERLIST_GENDER_FIELD.type = 5
BSEHALLUSERLIST_GENDER_FIELD.cpp_type = 1

BSEHALLUSERLIST_WIN_FIELD.name = "win"
BSEHALLUSERLIST_WIN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.win"
BSEHALLUSERLIST_WIN_FIELD.number = 6
BSEHALLUSERLIST_WIN_FIELD.index = 5
BSEHALLUSERLIST_WIN_FIELD.label = 3
BSEHALLUSERLIST_WIN_FIELD.has_default_value = false
BSEHALLUSERLIST_WIN_FIELD.default_value = {}
BSEHALLUSERLIST_WIN_FIELD.type = 5
BSEHALLUSERLIST_WIN_FIELD.cpp_type = 1

BSEHALLUSERLIST_TOTAL_FIELD.name = "total"
BSEHALLUSERLIST_TOTAL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.total"
BSEHALLUSERLIST_TOTAL_FIELD.number = 7
BSEHALLUSERLIST_TOTAL_FIELD.index = 6
BSEHALLUSERLIST_TOTAL_FIELD.label = 3
BSEHALLUSERLIST_TOTAL_FIELD.has_default_value = false
BSEHALLUSERLIST_TOTAL_FIELD.default_value = {}
BSEHALLUSERLIST_TOTAL_FIELD.type = 5
BSEHALLUSERLIST_TOTAL_FIELD.cpp_type = 1

BSEHALLUSERLIST_ATTACK_FIELD.name = "attack"
BSEHALLUSERLIST_ATTACK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.attack"
BSEHALLUSERLIST_ATTACK_FIELD.number = 8
BSEHALLUSERLIST_ATTACK_FIELD.index = 7
BSEHALLUSERLIST_ATTACK_FIELD.label = 3
BSEHALLUSERLIST_ATTACK_FIELD.has_default_value = false
BSEHALLUSERLIST_ATTACK_FIELD.default_value = {}
BSEHALLUSERLIST_ATTACK_FIELD.type = 5
BSEHALLUSERLIST_ATTACK_FIELD.cpp_type = 1

BSEHALLUSERLIST_YELLOWDMD_FIELD.name = "yellowDmd"
BSEHALLUSERLIST_YELLOWDMD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.yellowDmd"
BSEHALLUSERLIST_YELLOWDMD_FIELD.number = 9
BSEHALLUSERLIST_YELLOWDMD_FIELD.index = 8
BSEHALLUSERLIST_YELLOWDMD_FIELD.label = 3
BSEHALLUSERLIST_YELLOWDMD_FIELD.has_default_value = false
BSEHALLUSERLIST_YELLOWDMD_FIELD.default_value = {}
BSEHALLUSERLIST_YELLOWDMD_FIELD.type = 8
BSEHALLUSERLIST_YELLOWDMD_FIELD.cpp_type = 7

BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.name = "yellowDmdYear"
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.yellowDmdYear"
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.number = 10
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.index = 9
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.label = 3
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.has_default_value = false
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.default_value = {}
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.type = 8
BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD.cpp_type = 7

BSEHALLUSERLIST_YELLOWDMDLV_FIELD.name = "yellowDmdLv"
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.yellowDmdLv"
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.number = 11
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.index = 10
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.label = 3
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.has_default_value = false
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.default_value = {}
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.type = 5
BSEHALLUSERLIST_YELLOWDMDLV_FIELD.cpp_type = 1

BSEHALLUSERLIST_POWER_FIELD.name = "power"
BSEHALLUSERLIST_POWER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.power"
BSEHALLUSERLIST_POWER_FIELD.number = 12
BSEHALLUSERLIST_POWER_FIELD.index = 11
BSEHALLUSERLIST_POWER_FIELD.label = 3
BSEHALLUSERLIST_POWER_FIELD.has_default_value = false
BSEHALLUSERLIST_POWER_FIELD.default_value = {}
BSEHALLUSERLIST_POWER_FIELD.type = 5
BSEHALLUSERLIST_POWER_FIELD.cpp_type = 1

BSEHALLUSERLIST_USERCOUNT_FIELD.name = "userCount"
BSEHALLUSERLIST_USERCOUNT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.userCount"
BSEHALLUSERLIST_USERCOUNT_FIELD.number = 13
BSEHALLUSERLIST_USERCOUNT_FIELD.index = 12
BSEHALLUSERLIST_USERCOUNT_FIELD.label = 2
BSEHALLUSERLIST_USERCOUNT_FIELD.has_default_value = false
BSEHALLUSERLIST_USERCOUNT_FIELD.default_value = 0
BSEHALLUSERLIST_USERCOUNT_FIELD.type = 5
BSEHALLUSERLIST_USERCOUNT_FIELD.cpp_type = 1

BSEHALLUSERLIST_PAGE_FIELD.name = "page"
BSEHALLUSERLIST_PAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList.page"
BSEHALLUSERLIST_PAGE_FIELD.number = 14
BSEHALLUSERLIST_PAGE_FIELD.index = 13
BSEHALLUSERLIST_PAGE_FIELD.label = 1
BSEHALLUSERLIST_PAGE_FIELD.has_default_value = true
BSEHALLUSERLIST_PAGE_FIELD.default_value = 0
BSEHALLUSERLIST_PAGE_FIELD.type = 5
BSEHALLUSERLIST_PAGE_FIELD.cpp_type = 1

BSEHALLUSERLIST.name = "BseHallUserList"
BSEHALLUSERLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseHallUserList"
BSEHALLUSERLIST.nested_types = {}
BSEHALLUSERLIST.enum_types = {}
BSEHALLUSERLIST.fields = {BSEHALLUSERLIST_USERID_FIELD, BSEHALLUSERLIST_NAME_FIELD, BSEHALLUSERLIST_URL_FIELD, BSEHALLUSERLIST_LEVEL_FIELD, BSEHALLUSERLIST_GENDER_FIELD, BSEHALLUSERLIST_WIN_FIELD, BSEHALLUSERLIST_TOTAL_FIELD, BSEHALLUSERLIST_ATTACK_FIELD, BSEHALLUSERLIST_YELLOWDMD_FIELD, BSEHALLUSERLIST_YELLOWDMDYEAR_FIELD, BSEHALLUSERLIST_YELLOWDMDLV_FIELD, BSEHALLUSERLIST_POWER_FIELD, BSEHALLUSERLIST_USERCOUNT_FIELD, BSEHALLUSERLIST_PAGE_FIELD}
BSEHALLUSERLIST.is_extendable = false
BSEHALLUSERLIST.extensions = {}

BseHallUserList = protobuf.Message(BSEHALLUSERLIST)
_G.BSEHALLUSERLIST_PB_BSEHALLUSERLIST = BSEHALLUSERLIST

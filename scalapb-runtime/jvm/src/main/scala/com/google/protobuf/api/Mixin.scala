// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.api

/** Declares an API Interface to be included in this interface. The including
  * interface must redeclare all the methods from the included interface, but
  * documentation and options are inherited as follows:
  *
  * - If after comment and whitespace stripping, the documentation
  *   string of the redeclared method is empty, it will be inherited
  *   from the original method.
  *
  * - Each annotation belonging to the service config (http,
  *   visibility) which is not set in the redeclared method will be
  *   inherited.
  *
  * - If an http annotation is inherited, the path pattern will be
  *   modified as follows. Any version prefix will be replaced by the
  *   version of the including interface plus the [root][] path if
  *   specified.
  *
  * Example of a simple mixin:
  *
  *     package google.acl.v1;
  *     service AccessControl {
  *       // Get the underlying ACL object.
  *       rpc GetAcl(GetAclRequest) returns (Acl) {
  *         option (google.api.http).get = "/v1/{resource=**}:getAcl";
  *       }
  *     }
  *
  *     package google.storage.v2;
  *     service Storage {
  *       rpc GetAcl(GetAclRequest) returns (Acl);
  *
  *       // Get a data record.
  *       rpc GetData(GetDataRequest) returns (Data) {
  *         option (google.api.http).get = "/v2/{resource=**}";
  *       }
  *     }
  *
  * Example of a mixin configuration:
  *
  *     apis:
  *     - name: google.storage.v2.Storage
  *       mixins:
  *       - name: google.acl.v1.AccessControl
  *
  * The mixin construct implies that all methods in `AccessControl` are
  * also declared with same name and request/response types in
  * `Storage`. A documentation generator or annotation processor will
  * see the effective `Storage.GetAcl` method after inherting
  * documentation and annotations as follows:
  *
  *     service Storage {
  *       // Get the underlying ACL object.
  *       rpc GetAcl(GetAclRequest) returns (Acl) {
  *         option (google.api.http).get = "/v2/{resource=**}:getAcl";
  *       }
  *       ...
  *     }
  *
  * Note how the version in the path pattern changed from `v1` to `v2`.
  *
  * If the `root` field in the mixin is specified, it should be a
  * relative path under which inherited HTTP paths are placed. Example:
  *
  *     apis:
  *     - name: google.storage.v2.Storage
  *       mixins:
  *       - name: google.acl.v1.AccessControl
  *         root: acls
  *
  * This implies the following inherited HTTP annotation:
  *
  *     service Storage {
  *       // Get the underlying ACL object.
  *       rpc GetAcl(GetAclRequest) returns (Acl) {
  *         option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
  *       }
  *       ...
  *     }
  *
  * @param name
  *   The fully qualified name of the interface which is included.
  * @param root
  *   If non-empty specifies a path under which inherited HTTP paths
  *   are rooted.
  */
@SerialVersionUID(0L)
final case class Mixin(
    name: _root_.scala.Predef.String = "",
    root: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[Mixin] with scalapb.lenses.Updatable[Mixin] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = root
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = root
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.api.Mixin = {
      var __name = this.name
      var __root = this.root
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __root = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.api.Mixin(
          name = __name,
          root = __root
      )
    }
    def withName(__v: _root_.scala.Predef.String): Mixin = copy(name = __v)
    def withRoot(__v: _root_.scala.Predef.String): Mixin = copy(root = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = root
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(root)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.api.Mixin
}

object Mixin extends scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Mixin] with scalapb.JavaProtoSupport[com.google.protobuf.api.Mixin, com.google.protobuf.Mixin] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Mixin] with scalapb.JavaProtoSupport[com.google.protobuf.api.Mixin, com.google.protobuf.Mixin] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.api.Mixin): com.google.protobuf.Mixin = {
    val javaPbOut = com.google.protobuf.Mixin.newBuilder
    javaPbOut.setName(scalaPbSource.name)
    javaPbOut.setRoot(scalaPbSource.root)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.Mixin): com.google.protobuf.api.Mixin = com.google.protobuf.api.Mixin(
    name = javaPbSource.getName,
    root = javaPbSource.getRoot
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.api.Mixin = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.api.Mixin(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.api.Mixin] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.api.Mixin(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.api.Mixin(
    name = "",
    root = ""
  )
  implicit class MixinLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.api.Mixin]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.api.Mixin](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def root: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.root)((c_, f_) => c_.copy(root = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val ROOT_FIELD_NUMBER = 2
  def of(
    name: _root_.scala.Predef.String,
    root: _root_.scala.Predef.String
  ): _root_.com.google.protobuf.api.Mixin = _root_.com.google.protobuf.api.Mixin(
    name,
    root
  )
}

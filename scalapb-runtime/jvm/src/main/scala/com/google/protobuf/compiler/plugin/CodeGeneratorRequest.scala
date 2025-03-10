// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.compiler.plugin
import _root_.scalapb.internal.compat.JavaConverters._

/** An encoded CodeGeneratorRequest is written to the plugin's stdin.
  *
  * @param fileToGenerate
  *   The .proto files that were explicitly listed on the command-line.  The
  *   code generator should generate code only for these files.  Each file's
  *   descriptor will be included in proto_file, below.
  * @param parameter
  *   The generator parameter passed on the command-line.
  * @param protoFile
  *   FileDescriptorProtos for all files in files_to_generate and everything
  *   they import.  The files will appear in topological order, so each file
  *   appears before any file that imports it.
  *  
  *   protoc guarantees that all proto_files will be written after
  *   the fields above, even though this is not technically guaranteed by the
  *   protobuf wire format.  This theoretically could allow a plugin to stream
  *   in the FileDescriptorProtos and handle them one by one rather than read
  *   the entire set into memory at once.  However, as of this writing, this
  *   is not similarly optimized on protoc's end -- it will store all fields in
  *   memory at once before sending them to the plugin.
  *  
  *   Type names of fields and extensions in the FileDescriptorProto are always
  *   fully qualified.
  * @param compilerVersion
  *   The version number of protocol compiler.
  */
@SerialVersionUID(0L)
final case class CodeGeneratorRequest(
    fileToGenerate: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    parameter: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    protoFile: _root_.scala.Seq[com.google.protobuf.descriptor.FileDescriptorProto] = _root_.scala.Seq.empty,
    compilerVersion: _root_.scala.Option[com.google.protobuf.compiler.plugin.Version] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[CodeGeneratorRequest] with scalapb.lenses.Updatable[CodeGeneratorRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      fileToGenerate.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      if (parameter.isDefined) {
        val __value = parameter.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
      protoFile.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (compilerVersion.isDefined) {
        val __value = compilerVersion.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      fileToGenerate.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      parameter.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      compilerVersion.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      protoFile.foreach { __v =>
        val __m = __v
        _output__.writeTag(15, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorRequest = {
      val __fileToGenerate = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.fileToGenerate)
      var __parameter = this.parameter
      val __protoFile = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.FileDescriptorProto] ++= this.protoFile)
      var __compilerVersion = this.compilerVersion
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fileToGenerate += _input__.readString()
          case 18 =>
            __parameter = Option(_input__.readString())
          case 122 =>
            __protoFile += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.FileDescriptorProto.defaultInstance)
          case 26 =>
            __compilerVersion = Option(_root_.scalapb.LiteParser.readMessage(_input__, __compilerVersion.getOrElse(com.google.protobuf.compiler.plugin.Version.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
          fileToGenerate = __fileToGenerate.result(),
          parameter = __parameter,
          protoFile = __protoFile.result(),
          compilerVersion = __compilerVersion
      )
    }
    def clearFileToGenerate = copy(fileToGenerate = _root_.scala.Seq.empty)
    def addFileToGenerate(__vs: _root_.scala.Predef.String*): CodeGeneratorRequest = addAllFileToGenerate(__vs)
    def addAllFileToGenerate(__vs: Iterable[_root_.scala.Predef.String]): CodeGeneratorRequest = copy(fileToGenerate = fileToGenerate ++ __vs)
    def withFileToGenerate(__v: _root_.scala.Seq[_root_.scala.Predef.String]): CodeGeneratorRequest = copy(fileToGenerate = __v)
    def getParameter: _root_.scala.Predef.String = parameter.getOrElse("")
    def clearParameter: CodeGeneratorRequest = copy(parameter = _root_.scala.None)
    def withParameter(__v: _root_.scala.Predef.String): CodeGeneratorRequest = copy(parameter = Option(__v))
    def clearProtoFile = copy(protoFile = _root_.scala.Seq.empty)
    def addProtoFile(__vs: com.google.protobuf.descriptor.FileDescriptorProto*): CodeGeneratorRequest = addAllProtoFile(__vs)
    def addAllProtoFile(__vs: Iterable[com.google.protobuf.descriptor.FileDescriptorProto]): CodeGeneratorRequest = copy(protoFile = protoFile ++ __vs)
    def withProtoFile(__v: _root_.scala.Seq[com.google.protobuf.descriptor.FileDescriptorProto]): CodeGeneratorRequest = copy(protoFile = __v)
    def getCompilerVersion: com.google.protobuf.compiler.plugin.Version = compilerVersion.getOrElse(com.google.protobuf.compiler.plugin.Version.defaultInstance)
    def clearCompilerVersion: CodeGeneratorRequest = copy(compilerVersion = _root_.scala.None)
    def withCompilerVersion(__v: com.google.protobuf.compiler.plugin.Version): CodeGeneratorRequest = copy(compilerVersion = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => fileToGenerate
        case 2 => parameter.orNull
        case 15 => protoFile
        case 3 => compilerVersion.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(fileToGenerate.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        case 2 => parameter.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 15 => _root_.scalapb.descriptors.PRepeated(protoFile.iterator.map(_.toPMessage).toVector)
        case 3 => compilerVersion.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.compiler.plugin.CodeGeneratorRequest
}

object CodeGeneratorRequest extends scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorRequest] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorRequest, com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorRequest] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorRequest, com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.compiler.plugin.CodeGeneratorRequest): com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest = {
    val javaPbOut = com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.newBuilder
    javaPbOut.addAllFileToGenerate(scalaPbSource.fileToGenerate.asJava)
    scalaPbSource.parameter.foreach(javaPbOut.setParameter)
    javaPbOut.addAllProtoFile(scalaPbSource.protoFile.iterator.map(com.google.protobuf.descriptor.FileDescriptorProto.toJavaProto).toIterable.asJava)
    scalaPbSource.compilerVersion.map(com.google.protobuf.compiler.plugin.Version.toJavaProto).foreach(javaPbOut.setCompilerVersion)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest): com.google.protobuf.compiler.plugin.CodeGeneratorRequest = com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
    fileToGenerate = javaPbSource.getFileToGenerateList.asScala.iterator.map(_root_.scala.Predef.identity).toSeq,
    parameter = if (javaPbSource.hasParameter) Some(javaPbSource.getParameter) else _root_.scala.None,
    protoFile = javaPbSource.getProtoFileList.asScala.iterator.map(com.google.protobuf.descriptor.FileDescriptorProto.fromJavaProto).toSeq,
    compilerVersion = if (javaPbSource.hasCompilerVersion) Some(com.google.protobuf.compiler.plugin.Version.fromJavaProto(javaPbSource.getCompilerVersion)) else _root_.scala.None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.compiler.plugin.CodeGeneratorRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[com.google.protobuf.descriptor.FileDescriptorProto]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[com.google.protobuf.compiler.plugin.Version]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.compiler.plugin.CodeGeneratorRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(15).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.FileDescriptorProto]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.compiler.plugin.Version]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PluginProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PluginProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 15 => __out = com.google.protobuf.descriptor.FileDescriptorProto
      case 3 => __out = com.google.protobuf.compiler.plugin.Version
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
    fileToGenerate = _root_.scala.Seq.empty,
    parameter = _root_.scala.None,
    protoFile = _root_.scala.Seq.empty,
    compilerVersion = _root_.scala.None
  )
  implicit class CodeGeneratorRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorRequest](_l) {
    def fileToGenerate: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.fileToGenerate)((c_, f_) => c_.copy(fileToGenerate = f_))
    def parameter: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getParameter)((c_, f_) => c_.copy(parameter = Option(f_)))
    def optionalParameter: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.parameter)((c_, f_) => c_.copy(parameter = f_))
    def protoFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.FileDescriptorProto]] = field(_.protoFile)((c_, f_) => c_.copy(protoFile = f_))
    def compilerVersion: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.Version] = field(_.getCompilerVersion)((c_, f_) => c_.copy(compilerVersion = Option(f_)))
    def optionalCompilerVersion: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.compiler.plugin.Version]] = field(_.compilerVersion)((c_, f_) => c_.copy(compilerVersion = f_))
  }
  final val FILE_TO_GENERATE_FIELD_NUMBER = 1
  final val PARAMETER_FIELD_NUMBER = 2
  final val PROTO_FILE_FIELD_NUMBER = 15
  final val COMPILER_VERSION_FIELD_NUMBER = 3
  def of(
    fileToGenerate: _root_.scala.Seq[_root_.scala.Predef.String],
    parameter: _root_.scala.Option[_root_.scala.Predef.String],
    protoFile: _root_.scala.Seq[com.google.protobuf.descriptor.FileDescriptorProto],
    compilerVersion: _root_.scala.Option[com.google.protobuf.compiler.plugin.Version]
  ): _root_.com.google.protobuf.compiler.plugin.CodeGeneratorRequest = _root_.com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
    fileToGenerate,
    parameter,
    protoFile,
    compilerVersion
  )
}

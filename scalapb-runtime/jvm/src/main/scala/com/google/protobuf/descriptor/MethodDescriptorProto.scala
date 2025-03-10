// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** Describes a method of a service.
  *
  * @param inputType
  *   Input and output type names.  These are resolved in the same way as
  *   FieldDescriptorProto.type_name, but must refer to a message type.
  * @param clientStreaming
  *   Identifies if client streams multiple client messages
  * @param serverStreaming
  *   Identifies if server streams multiple server messages
  */
@SerialVersionUID(0L)
final case class MethodDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    inputType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    outputType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    options: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions] = _root_.scala.None,
    clientStreaming: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    serverStreaming: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[MethodDescriptorProto] with scalapb.lenses.Updatable[MethodDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (inputType.isDefined) {
        val __value = inputType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
      if (outputType.isDefined) {
        val __value = outputType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      };
      if (options.isDefined) {
        val __value = options.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (clientStreaming.isDefined) {
        val __value = clientStreaming.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
      };
      if (serverStreaming.isDefined) {
        val __value = serverStreaming.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(6, __value)
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
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      inputType.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      outputType.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      clientStreaming.foreach { __v =>
        val __m = __v
        _output__.writeBool(5, __m)
      };
      serverStreaming.foreach { __v =>
        val __m = __v
        _output__.writeBool(6, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MethodDescriptorProto = {
      var __name = this.name
      var __inputType = this.inputType
      var __outputType = this.outputType
      var __options = this.options
      var __clientStreaming = this.clientStreaming
      var __serverStreaming = this.serverStreaming
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readString())
          case 18 =>
            __inputType = Option(_input__.readString())
          case 26 =>
            __outputType = Option(_input__.readString())
          case 34 =>
            __options = Option(_root_.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.MethodOptions.defaultInstance)))
          case 40 =>
            __clientStreaming = Option(_input__.readBool())
          case 48 =>
            __serverStreaming = Option(_input__.readBool())
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.MethodDescriptorProto(
          name = __name,
          inputType = __inputType,
          outputType = __outputType,
          options = __options,
          clientStreaming = __clientStreaming,
          serverStreaming = __serverStreaming
      )
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: MethodDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): MethodDescriptorProto = copy(name = Option(__v))
    def getInputType: _root_.scala.Predef.String = inputType.getOrElse("")
    def clearInputType: MethodDescriptorProto = copy(inputType = _root_.scala.None)
    def withInputType(__v: _root_.scala.Predef.String): MethodDescriptorProto = copy(inputType = Option(__v))
    def getOutputType: _root_.scala.Predef.String = outputType.getOrElse("")
    def clearOutputType: MethodDescriptorProto = copy(outputType = _root_.scala.None)
    def withOutputType(__v: _root_.scala.Predef.String): MethodDescriptorProto = copy(outputType = Option(__v))
    def getOptions: com.google.protobuf.descriptor.MethodOptions = options.getOrElse(com.google.protobuf.descriptor.MethodOptions.defaultInstance)
    def clearOptions: MethodDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.MethodOptions): MethodDescriptorProto = copy(options = Option(__v))
    def getClientStreaming: _root_.scala.Boolean = clientStreaming.getOrElse(false)
    def clearClientStreaming: MethodDescriptorProto = copy(clientStreaming = _root_.scala.None)
    def withClientStreaming(__v: _root_.scala.Boolean): MethodDescriptorProto = copy(clientStreaming = Option(__v))
    def getServerStreaming: _root_.scala.Boolean = serverStreaming.getOrElse(false)
    def clearServerStreaming: MethodDescriptorProto = copy(serverStreaming = _root_.scala.None)
    def withServerStreaming(__v: _root_.scala.Boolean): MethodDescriptorProto = copy(serverStreaming = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => inputType.orNull
        case 3 => outputType.orNull
        case 4 => options.orNull
        case 5 => clientStreaming.orNull
        case 6 => serverStreaming.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => inputType.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => outputType.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => clientStreaming.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => serverStreaming.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.MethodDescriptorProto
}

object MethodDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodDescriptorProto, com.google.protobuf.DescriptorProtos.MethodDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodDescriptorProto, com.google.protobuf.DescriptorProtos.MethodDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.MethodDescriptorProto): com.google.protobuf.DescriptorProtos.MethodDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    scalaPbSource.inputType.foreach(javaPbOut.setInputType)
    scalaPbSource.outputType.foreach(javaPbOut.setOutputType)
    scalaPbSource.options.map(com.google.protobuf.descriptor.MethodOptions.toJavaProto).foreach(javaPbOut.setOptions)
    scalaPbSource.clientStreaming.foreach(javaPbOut.setClientStreaming)
    scalaPbSource.serverStreaming.foreach(javaPbOut.setServerStreaming)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.MethodDescriptorProto): com.google.protobuf.descriptor.MethodDescriptorProto = com.google.protobuf.descriptor.MethodDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else _root_.scala.None,
    inputType = if (javaPbSource.hasInputType) Some(javaPbSource.getInputType) else _root_.scala.None,
    outputType = if (javaPbSource.hasOutputType) Some(javaPbSource.getOutputType) else _root_.scala.None,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.MethodOptions.fromJavaProto(javaPbSource.getOptions)) else _root_.scala.None,
    clientStreaming = if (javaPbSource.hasClientStreaming) Some(javaPbSource.getClientStreaming.booleanValue) else _root_.scala.None,
    serverStreaming = if (javaPbSource.hasServerStreaming) Some(javaPbSource.getServerStreaming.booleanValue) else _root_.scala.None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.descriptor.MethodDescriptorProto = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.MethodDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[com.google.protobuf.descriptor.MethodOptions]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.MethodDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.MethodDescriptorProto(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.MethodOptions]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(9)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(9)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 4 => __out = com.google.protobuf.descriptor.MethodOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.MethodDescriptorProto(
    name = _root_.scala.None,
    inputType = _root_.scala.None,
    outputType = _root_.scala.None,
    options = _root_.scala.None,
    clientStreaming = _root_.scala.None,
    serverStreaming = _root_.scala.None
  )
  implicit class MethodDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def inputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getInputType)((c_, f_) => c_.copy(inputType = Option(f_)))
    def optionalInputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.inputType)((c_, f_) => c_.copy(inputType = f_))
    def outputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getOutputType)((c_, f_) => c_.copy(outputType = Option(f_)))
    def optionalOutputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.outputType)((c_, f_) => c_.copy(outputType = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def clientStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getClientStreaming)((c_, f_) => c_.copy(clientStreaming = Option(f_)))
    def optionalClientStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.clientStreaming)((c_, f_) => c_.copy(clientStreaming = f_))
    def serverStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getServerStreaming)((c_, f_) => c_.copy(serverStreaming = Option(f_)))
    def optionalServerStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.serverStreaming)((c_, f_) => c_.copy(serverStreaming = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val INPUT_TYPE_FIELD_NUMBER = 2
  final val OUTPUT_TYPE_FIELD_NUMBER = 3
  final val OPTIONS_FIELD_NUMBER = 4
  final val CLIENT_STREAMING_FIELD_NUMBER = 5
  final val SERVER_STREAMING_FIELD_NUMBER = 6
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    inputType: _root_.scala.Option[_root_.scala.Predef.String],
    outputType: _root_.scala.Option[_root_.scala.Predef.String],
    options: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions],
    clientStreaming: _root_.scala.Option[_root_.scala.Boolean],
    serverStreaming: _root_.scala.Option[_root_.scala.Boolean]
  ): _root_.com.google.protobuf.descriptor.MethodDescriptorProto = _root_.com.google.protobuf.descriptor.MethodDescriptorProto(
    name,
    inputType,
    outputType,
    options,
    clientStreaming,
    serverStreaming
  )
}

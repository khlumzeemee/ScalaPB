// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor
import _root_.scalapb.internal.compat.JavaConverters._

/** Describes an enum type.
  *
  * @param reservedRange
  *   Range of reserved numeric values. Reserved numeric values may not be used
  *   by enum values in the same enum declaration. Reserved ranges may not
  *   overlap.
  * @param reservedName
  *   Reserved enum value names, which may not be reused. A given name may only
  *   be reserved once.
  */
@SerialVersionUID(0L)
final case class EnumDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    value: _root_.scala.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto] = _root_.scala.Seq.empty,
    options: _root_.scala.Option[com.google.protobuf.descriptor.EnumOptions] = _root_.scala.None,
    reservedRange: _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange] = _root_.scala.Seq.empty,
    reservedName: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[EnumDescriptorProto] with scalapb.lenses.Updatable[EnumDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      value.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (options.isDefined) {
        val __value = options.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      reservedRange.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      reservedName.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
      }
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
      value.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      reservedRange.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      reservedName.foreach { __v =>
        val __m = __v
        _output__.writeString(5, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumDescriptorProto = {
      var __name = this.name
      val __value = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.EnumValueDescriptorProto] ++= this.value)
      var __options = this.options
      val __reservedRange = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange] ++= this.reservedRange)
      val __reservedName = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.reservedName)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readString())
          case 18 =>
            __value += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.EnumValueDescriptorProto.defaultInstance)
          case 26 =>
            __options = Option(_root_.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.EnumOptions.defaultInstance)))
          case 34 =>
            __reservedRange += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange.defaultInstance)
          case 42 =>
            __reservedName += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.EnumDescriptorProto(
          name = __name,
          value = __value.result(),
          options = __options,
          reservedRange = __reservedRange.result(),
          reservedName = __reservedName.result()
      )
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: EnumDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): EnumDescriptorProto = copy(name = Option(__v))
    def clearValue = copy(value = _root_.scala.Seq.empty)
    def addValue(__vs: com.google.protobuf.descriptor.EnumValueDescriptorProto*): EnumDescriptorProto = addAllValue(__vs)
    def addAllValue(__vs: Iterable[com.google.protobuf.descriptor.EnumValueDescriptorProto]): EnumDescriptorProto = copy(value = value ++ __vs)
    def withValue(__v: _root_.scala.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]): EnumDescriptorProto = copy(value = __v)
    def getOptions: com.google.protobuf.descriptor.EnumOptions = options.getOrElse(com.google.protobuf.descriptor.EnumOptions.defaultInstance)
    def clearOptions: EnumDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.EnumOptions): EnumDescriptorProto = copy(options = Option(__v))
    def clearReservedRange = copy(reservedRange = _root_.scala.Seq.empty)
    def addReservedRange(__vs: com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange*): EnumDescriptorProto = addAllReservedRange(__vs)
    def addAllReservedRange(__vs: Iterable[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange]): EnumDescriptorProto = copy(reservedRange = reservedRange ++ __vs)
    def withReservedRange(__v: _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange]): EnumDescriptorProto = copy(reservedRange = __v)
    def clearReservedName = copy(reservedName = _root_.scala.Seq.empty)
    def addReservedName(__vs: _root_.scala.Predef.String*): EnumDescriptorProto = addAllReservedName(__vs)
    def addAllReservedName(__vs: Iterable[_root_.scala.Predef.String]): EnumDescriptorProto = copy(reservedName = reservedName ++ __vs)
    def withReservedName(__v: _root_.scala.Seq[_root_.scala.Predef.String]): EnumDescriptorProto = copy(reservedName = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => value
        case 3 => options.orNull
        case 4 => reservedRange
        case 5 => reservedName
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(value.iterator.map(_.toPMessage).toVector)
        case 3 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => _root_.scalapb.descriptors.PRepeated(reservedRange.iterator.map(_.toPMessage).toVector)
        case 5 => _root_.scalapb.descriptors.PRepeated(reservedName.iterator.map(_root_.scalapb.descriptors.PString).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.EnumDescriptorProto
}

object EnumDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumDescriptorProto, com.google.protobuf.DescriptorProtos.EnumDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumDescriptorProto, com.google.protobuf.DescriptorProtos.EnumDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.EnumDescriptorProto): com.google.protobuf.DescriptorProtos.EnumDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    javaPbOut.addAllValue(scalaPbSource.value.iterator.map(com.google.protobuf.descriptor.EnumValueDescriptorProto.toJavaProto).toIterable.asJava)
    scalaPbSource.options.map(com.google.protobuf.descriptor.EnumOptions.toJavaProto).foreach(javaPbOut.setOptions)
    javaPbOut.addAllReservedRange(scalaPbSource.reservedRange.iterator.map(com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange.toJavaProto).toIterable.asJava)
    javaPbOut.addAllReservedName(scalaPbSource.reservedName.asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.EnumDescriptorProto): com.google.protobuf.descriptor.EnumDescriptorProto = com.google.protobuf.descriptor.EnumDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else _root_.scala.None,
    value = javaPbSource.getValueList.asScala.iterator.map(com.google.protobuf.descriptor.EnumValueDescriptorProto.fromJavaProto).toSeq,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.EnumOptions.fromJavaProto(javaPbSource.getOptions)) else _root_.scala.None,
    reservedRange = javaPbSource.getReservedRangeList.asScala.iterator.map(com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange.fromJavaProto).toSeq,
    reservedName = javaPbSource.getReservedNameList.asScala.iterator.map(_root_.scala.Predef.identity).toSeq
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.descriptor.EnumDescriptorProto = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.EnumDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[_root_.scala.Option[com.google.protobuf.descriptor.EnumOptions]],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange]],
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.EnumDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.EnumDescriptorProto(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.EnumOptions]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.descriptor.EnumValueDescriptorProto
      case 3 => __out = com.google.protobuf.descriptor.EnumOptions
      case 4 => __out = com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumDescriptorProto(
    name = _root_.scala.None,
    value = _root_.scala.Seq.empty,
    options = _root_.scala.None,
    reservedRange = _root_.scala.Seq.empty,
    reservedName = _root_.scala.Seq.empty
  )
  /** Range of reserved numeric values. Reserved values may not be used by
    * entries in the same enum. Reserved ranges may not overlap.
    *
    * Note that this is distinct from DescriptorProto.ReservedRange in that it
    * is inclusive such that it can appropriately represent the entire int32
    * domain.
    *
    * @param start
    *   Inclusive.
    * @param end
    *   Inclusive.
    */
  @SerialVersionUID(0L)
  final case class EnumReservedRange(
      start: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
      end: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None
      ) extends scalapb.GeneratedMessage with scalapb.Message[EnumReservedRange] with scalapb.lenses.Updatable[EnumReservedRange] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (start.isDefined) {
          val __value = start.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        };
        if (end.isDefined) {
          val __value = end.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
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
        start.foreach { __v =>
          val __m = __v
          _output__.writeInt32(1, __m)
        };
        end.foreach { __v =>
          val __m = __v
          _output__.writeInt32(2, __m)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange = {
        var __start = this.start
        var __end = this.end
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __start = Option(_input__.readInt32())
            case 16 =>
              __end = Option(_input__.readInt32())
            case tag => _input__.skipField(tag)
          }
        }
        com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange(
            start = __start,
            end = __end
        )
      }
      def getStart: _root_.scala.Int = start.getOrElse(0)
      def clearStart: EnumReservedRange = copy(start = _root_.scala.None)
      def withStart(__v: _root_.scala.Int): EnumReservedRange = copy(start = Option(__v))
      def getEnd: _root_.scala.Int = end.getOrElse(0)
      def clearEnd: EnumReservedRange = copy(end = _root_.scala.None)
      def withEnd(__v: _root_.scala.Int): EnumReservedRange = copy(end = Option(__v))
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => start.orNull
          case 2 => end.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => start.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 2 => end.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange
  }
  
  object EnumReservedRange extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange): com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange = {
      val javaPbOut = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.newBuilder
      scalaPbSource.start.foreach(javaPbOut.setStart)
      scalaPbSource.end.foreach(javaPbOut.setEnd)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange): com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange = com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange(
      start = if (javaPbSource.hasStart) Some(javaPbSource.getStart.intValue) else _root_.scala.None,
      end = if (javaPbSource.hasEnd) Some(javaPbSource.getEnd.intValue) else _root_.scala.None
    )
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange(
        __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.scala.Int]],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Int]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.EnumDescriptorProto.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.EnumDescriptorProto.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange(
      start = _root_.scala.None,
      end = _root_.scala.None
    )
    implicit class EnumReservedRangeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange](_l) {
      def start: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getStart)((c_, f_) => c_.copy(start = Option(f_)))
      def optionalStart: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.start)((c_, f_) => c_.copy(start = f_))
      def end: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getEnd)((c_, f_) => c_.copy(end = Option(f_)))
      def optionalEnd: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.end)((c_, f_) => c_.copy(end = f_))
    }
    final val START_FIELD_NUMBER = 1
    final val END_FIELD_NUMBER = 2
    def of(
      start: _root_.scala.Option[_root_.scala.Int],
      end: _root_.scala.Option[_root_.scala.Int]
    ): _root_.com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange = _root_.com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange(
      start,
      end
    )
  }
  
  implicit class EnumDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.EnumOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def reservedRange: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange]] = field(_.reservedRange)((c_, f_) => c_.copy(reservedRange = f_))
    def reservedName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.reservedName)((c_, f_) => c_.copy(reservedName = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
  final val RESERVED_RANGE_FIELD_NUMBER = 4
  final val RESERVED_NAME_FIELD_NUMBER = 5
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    value: _root_.scala.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto],
    options: _root_.scala.Option[com.google.protobuf.descriptor.EnumOptions],
    reservedRange: _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto.EnumReservedRange],
    reservedName: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.com.google.protobuf.descriptor.EnumDescriptorProto = _root_.com.google.protobuf.descriptor.EnumDescriptorProto(
    name,
    value,
    options,
    reservedRange,
    reservedName
  )
}

/*
 * Copyright (C) 2019 Drakeet Xu <drakeet@drakeet.com>
 *
 * This file is part of Pure Writer Desktop
 *
 * Pure Writer Desktop is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * rebase-server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with rebase-server. If not, see <http://www.gnu.org/licenses/>.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Protocols.proto

package com.drakeet.purewriter.protocol;

public final class PureWriterProtocol {
  private PureWriterProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>int32 version = 2;</code>
     */
    int getVersion();

    /**
     * <code>string contentType = 3;</code>
     */
    java.lang.String getContentType();
    /**
     * <code>string contentType = 3;</code>
     */
    com.google.protobuf.ByteString
    getContentTypeBytes();

    /**
     * <code>string messageType = 4;</code>
     */
    java.lang.String getMessageType();
    /**
     * <code>string messageType = 4;</code>
     */
    com.google.protobuf.ByteString
    getMessageTypeBytes();

    /**
     * <code>string content = 5;</code>
     */
    java.lang.String getContent();
    /**
     * <code>string content = 5;</code>
     */
    com.google.protobuf.ByteString
    getContentBytes();

    /**
     * <code>bytes data = 6;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>uint64 time = 7;</code>
     */
    long getTime();
  }
  /**
   * Protobuf type {@code protocol.Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.Message)
      MessageOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      contentType_ = "";
      messageType_ = "";
      content_ = "";
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Message();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 16: {

              version_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              contentType_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              messageType_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
            case 50: {

              data_ = input.readBytes();
              break;
            }
            case 56: {

              time_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.drakeet.purewriter.protocol.PureWriterProtocol.internal_static_protocol_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.drakeet.purewriter.protocol.PureWriterProtocol.internal_static_protocol_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.drakeet.purewriter.protocol.PureWriterProtocol.Message.class, com.drakeet.purewriter.protocol.PureWriterProtocol.Message.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private int version_;
    /**
     * <code>int32 version = 2;</code>
     */
    public int getVersion() {
      return version_;
    }

    public static final int CONTENTTYPE_FIELD_NUMBER = 3;
    private volatile java.lang.Object contentType_;
    /**
     * <code>string contentType = 3;</code>
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      }
    }
    /**
     * <code>string contentType = 3;</code>
     */
    public com.google.protobuf.ByteString
    getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGETYPE_FIELD_NUMBER = 4;
    private volatile java.lang.Object messageType_;
    /**
     * <code>string messageType = 4;</code>
     */
    public java.lang.String getMessageType() {
      java.lang.Object ref = messageType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageType_ = s;
        return s;
      }
    }
    /**
     * <code>string messageType = 4;</code>
     */
    public com.google.protobuf.ByteString
    getMessageTypeBytes() {
      java.lang.Object ref = messageType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 5;
    private volatile java.lang.Object content_;
    /**
     * <code>string content = 5;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 5;</code>
     */
    public com.google.protobuf.ByteString
    getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>bytes data = 6;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int TIME_FIELD_NUMBER = 7;
    private long time_;
    /**
     * <code>uint64 time = 7;</code>
     */
    public long getTime() {
      return time_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (version_ != 0) {
        output.writeInt32(2, version_);
      }
      if (!getContentTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, contentType_);
      }
      if (!getMessageTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, messageType_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, content_);
      }
      if (!data_.isEmpty()) {
        output.writeBytes(6, data_);
      }
      if (time_ != 0L) {
        output.writeUInt64(7, time_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(1, id_);
      }
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(2, version_);
      }
      if (!getContentTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, contentType_);
      }
      if (!getMessageTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, messageType_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, content_);
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(6, data_);
      }
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(7, time_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof com.drakeet.purewriter.protocol.PureWriterProtocol.Message)) {
        return super.equals(obj);
      }
      com.drakeet.purewriter.protocol.PureWriterProtocol.Message other = (com.drakeet.purewriter.protocol.PureWriterProtocol.Message) obj;

      if (getId()
          != other.getId()) return false;
      if (getVersion()
          != other.getVersion()) return false;
      if (!getContentType()
          .equals(other.getContentType())) return false;
      if (!getMessageType()
          .equals(other.getMessageType())) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (!getData()
          .equals(other.getData())) return false;
      if (getTime()
          != other.getTime()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (37 * hash) + CONTENTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getContentType().hashCode();
      hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageType().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.drakeet.purewriter.protocol.PureWriterProtocol.Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
             ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.Message)
        com.drakeet.purewriter.protocol.PureWriterProtocol.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.drakeet.purewriter.protocol.PureWriterProtocol.internal_static_protocol_Message_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.drakeet.purewriter.protocol.PureWriterProtocol.internal_static_protocol_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.drakeet.purewriter.protocol.PureWriterProtocol.Message.class, com.drakeet.purewriter.protocol.PureWriterProtocol.Message.Builder.class);
      }

      // Construct using com.drakeet.purewriter.protocol.PureWriterProtocol.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
            .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        version_ = 0;

        contentType_ = "";

        messageType_ = "";

        content_ = "";

        data_ = com.google.protobuf.ByteString.EMPTY;

        time_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.drakeet.purewriter.protocol.PureWriterProtocol.internal_static_protocol_Message_descriptor;
      }

      @java.lang.Override
      public com.drakeet.purewriter.protocol.PureWriterProtocol.Message getDefaultInstanceForType() {
        return com.drakeet.purewriter.protocol.PureWriterProtocol.Message.getDefaultInstance();
      }

      @java.lang.Override
      public com.drakeet.purewriter.protocol.PureWriterProtocol.Message build() {
        com.drakeet.purewriter.protocol.PureWriterProtocol.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.drakeet.purewriter.protocol.PureWriterProtocol.Message buildPartial() {
        com.drakeet.purewriter.protocol.PureWriterProtocol.Message result = new com.drakeet.purewriter.protocol.PureWriterProtocol.Message(this);
        result.id_ = id_;
        result.version_ = version_;
        result.contentType_ = contentType_;
        result.messageType_ = messageType_;
        result.content_ = content_;
        result.data_ = data_;
        result.time_ = time_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.drakeet.purewriter.protocol.PureWriterProtocol.Message) {
          return mergeFrom((com.drakeet.purewriter.protocol.PureWriterProtocol.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.drakeet.purewriter.protocol.PureWriterProtocol.Message other) {
        if (other == com.drakeet.purewriter.protocol.PureWriterProtocol.Message.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
        }
        if (!other.getContentType().isEmpty()) {
          contentType_ = other.contentType_;
          onChanged();
        }
        if (!other.getMessageType().isEmpty()) {
          messageType_ = other.messageType_;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        if (other.getTime() != 0L) {
          setTime(other.getTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.drakeet.purewriter.protocol.PureWriterProtocol.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.drakeet.purewriter.protocol.PureWriterProtocol.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {

        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {

        id_ = 0;
        onChanged();
        return this;
      }

      private int version_ ;
      /**
       * <code>int32 version = 2;</code>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <code>int32 version = 2;</code>
       */
      public Builder setVersion(int value) {

        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 version = 2;</code>
       */
      public Builder clearVersion() {

        version_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object contentType_ = "";
      /**
       * <code>string contentType = 3;</code>
       */
      public java.lang.String getContentType() {
        java.lang.Object ref = contentType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          contentType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string contentType = 3;</code>
       */
      public com.google.protobuf.ByteString
      getContentTypeBytes() {
        java.lang.Object ref = contentType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          contentType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string contentType = 3;</code>
       */
      public Builder setContentType(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        contentType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string contentType = 3;</code>
       */
      public Builder clearContentType() {

        contentType_ = getDefaultInstance().getContentType();
        onChanged();
        return this;
      }
      /**
       * <code>string contentType = 3;</code>
       */
      public Builder setContentTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        contentType_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object messageType_ = "";
      /**
       * <code>string messageType = 4;</code>
       */
      public java.lang.String getMessageType() {
        java.lang.Object ref = messageType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          messageType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string messageType = 4;</code>
       */
      public com.google.protobuf.ByteString
      getMessageTypeBytes() {
        java.lang.Object ref = messageType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          messageType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string messageType = 4;</code>
       */
      public Builder setMessageType(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        messageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string messageType = 4;</code>
       */
      public Builder clearMessageType() {

        messageType_ = getDefaultInstance().getMessageType();
        onChanged();
        return this;
      }
      /**
       * <code>string messageType = 4;</code>
       */
      public Builder setMessageTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        messageType_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 5;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 5;</code>
       */
      public com.google.protobuf.ByteString
      getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder clearContent() {

        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        content_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 6;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 6;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }

        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 6;</code>
       */
      public Builder clearData() {

        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private long time_ ;
      /**
       * <code>uint64 time = 7;</code>
       */
      public long getTime() {
        return time_;
      }
      /**
       * <code>uint64 time = 7;</code>
       */
      public Builder setTime(long value) {

        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 time = 7;</code>
       */
      public Builder clearTime() {

        time_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.Message)
    }

    // @@protoc_insertion_point(class_scope:protocol.Message)
    private static final com.drakeet.purewriter.protocol.PureWriterProtocol.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.drakeet.purewriter.protocol.PureWriterProtocol.Message();
    }

    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.drakeet.purewriter.protocol.PureWriterProtocol.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_protocol_Message_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
        "\n\017Protocols.proto\022\010protocol\"}\n\007Message\022\n" +
            "\n\002id\030\001 \001(\005\022\017\n\007version\030\002 \001(\005\022\023\n\013contentTy" +
            "pe\030\003 \001(\t\022\023\n\013messageType\030\004 \001(\t\022\017\n\007content" +
            "\030\005 \001(\t\022\014\n\004data\030\006 \001(\014\022\014\n\004time\030\007 \001(\004B5\n\037co" +
            "m.drakeet.purewriter.protocolB\022PureWrite" +
            "rProtocolb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
            });
    internal_static_protocol_Message_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_Message_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_Message_descriptor,
        new java.lang.String[] { "Id", "Version", "ContentType", "MessageType", "Content", "Data", "Time", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

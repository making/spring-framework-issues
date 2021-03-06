// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/tutorial/addressbook.proto

package org.springframework.issues.tutorial;

/**
 * Protobuf type {@code AddressBook}
 */
public  final class AddressBook extends
    com.google.protobuf.GeneratedMessage
    implements AddressBookOrBuilder {
  // Use AddressBook.newBuilder() to construct.
  private AddressBook(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AddressBook(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AddressBook defaultInstance;
  public static AddressBook getDefaultInstance() {
    return defaultInstance;
  }

  public AddressBook getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AddressBook(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              person_ = new java.util.ArrayList<org.springframework.issues.tutorial.Person>();
              mutable_bitField0_ |= 0x00000001;
            }
            person_.add(input.readMessage(org.springframework.issues.tutorial.Person.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        person_ = java.util.Collections.unmodifiableList(person_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.springframework.issues.tutorial.AddressBookProtos.internal_static_AddressBook_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.springframework.issues.tutorial.AddressBookProtos.internal_static_AddressBook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.springframework.issues.tutorial.AddressBook.class, org.springframework.issues.tutorial.AddressBook.Builder.class);
  }

  public static com.google.protobuf.Parser<AddressBook> PARSER =
      new com.google.protobuf.AbstractParser<AddressBook>() {
    public AddressBook parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressBook(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<AddressBook> getParserForType() {
    return PARSER;
  }

  // repeated .Person person = 1;
  public static final int PERSON_FIELD_NUMBER = 1;
  private java.util.List<org.springframework.issues.tutorial.Person> person_;
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public java.util.List<org.springframework.issues.tutorial.Person> getPersonList() {
    return person_;
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public java.util.List<? extends org.springframework.issues.tutorial.PersonOrBuilder> 
      getPersonOrBuilderList() {
    return person_;
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public int getPersonCount() {
    return person_.size();
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public org.springframework.issues.tutorial.Person getPerson(int index) {
    return person_.get(index);
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public org.springframework.issues.tutorial.PersonOrBuilder getPersonOrBuilder(
      int index) {
    return person_.get(index);
  }

  private void initFields() {
    person_ = java.util.Collections.emptyList();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;

    for (int i = 0; i < getPersonCount(); i++) {
      if (!getPerson(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    for (int i = 0; i < person_.size(); i++) {
      output.writeMessage(1, person_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < person_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, person_.get(i));
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

  public static org.springframework.issues.tutorial.AddressBook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.springframework.issues.tutorial.AddressBook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.springframework.issues.tutorial.AddressBook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.springframework.issues.tutorial.AddressBook parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.springframework.issues.tutorial.AddressBook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.springframework.issues.tutorial.AddressBook parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.springframework.issues.tutorial.AddressBook parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.springframework.issues.tutorial.AddressBook parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.springframework.issues.tutorial.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.springframework.issues.tutorial.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.springframework.issues.tutorial.AddressBook prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AddressBook}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements org.springframework.issues.tutorial.AddressBookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.springframework.issues.tutorial.AddressBookProtos.internal_static_AddressBook_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.springframework.issues.tutorial.AddressBookProtos.internal_static_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.springframework.issues.tutorial.AddressBook.class, org.springframework.issues.tutorial.AddressBook.Builder.class);
    }

    // Construct using org.springframework.issues.tutorial.AddressBook.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getPersonFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        personBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.springframework.issues.tutorial.AddressBookProtos.internal_static_AddressBook_descriptor;
    }

    public org.springframework.issues.tutorial.AddressBook getDefaultInstanceForType() {
      return org.springframework.issues.tutorial.AddressBook.getDefaultInstance();
    }

    public org.springframework.issues.tutorial.AddressBook build() {
      org.springframework.issues.tutorial.AddressBook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.springframework.issues.tutorial.AddressBook buildPartial() {
      org.springframework.issues.tutorial.AddressBook result = new org.springframework.issues.tutorial.AddressBook(this);
      int from_bitField0_ = bitField0_;
      if (personBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          person_ = java.util.Collections.unmodifiableList(person_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.springframework.issues.tutorial.AddressBook) {
        return mergeFrom((org.springframework.issues.tutorial.AddressBook)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.springframework.issues.tutorial.AddressBook other) {
      if (other == org.springframework.issues.tutorial.AddressBook.getDefaultInstance()) return this;
      if (personBuilder_ == null) {
        if (!other.person_.isEmpty()) {
          if (person_.isEmpty()) {
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersonIsMutable();
            person_.addAll(other.person_);
          }
          onChanged();
        }
      } else {
        if (!other.person_.isEmpty()) {
          if (personBuilder_.isEmpty()) {
            personBuilder_.dispose();
            personBuilder_ = null;
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
            personBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPersonFieldBuilder() : null;
          } else {
            personBuilder_.addAllMessages(other.person_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      for (int i = 0; i < getPersonCount(); i++) {
        if (!getPerson(i).isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.springframework.issues.tutorial.AddressBook parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.springframework.issues.tutorial.AddressBook) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // repeated .Person person = 1;
    private java.util.List<org.springframework.issues.tutorial.Person> person_ =
      java.util.Collections.emptyList();
    private void ensurePersonIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        person_ = new java.util.ArrayList<org.springframework.issues.tutorial.Person>(person_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.springframework.issues.tutorial.Person, org.springframework.issues.tutorial.Person.Builder, org.springframework.issues.tutorial.PersonOrBuilder> personBuilder_;

    /**
     * <code>repeated .Person person = 1;</code>
     */
    public java.util.List<org.springframework.issues.tutorial.Person> getPersonList() {
      if (personBuilder_ == null) {
        return java.util.Collections.unmodifiableList(person_);
      } else {
        return personBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public int getPersonCount() {
      if (personBuilder_ == null) {
        return person_.size();
      } else {
        return personBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public org.springframework.issues.tutorial.Person getPerson(int index) {
      if (personBuilder_ == null) {
        return person_.get(index);
      } else {
        return personBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder setPerson(
        int index, org.springframework.issues.tutorial.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.set(index, value);
        onChanged();
      } else {
        personBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder setPerson(
        int index, org.springframework.issues.tutorial.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.set(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(org.springframework.issues.tutorial.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(value);
        onChanged();
      } else {
        personBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(
        int index, org.springframework.issues.tutorial.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(index, value);
        onChanged();
      } else {
        personBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(
        org.springframework.issues.tutorial.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(
        int index, org.springframework.issues.tutorial.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addAllPerson(
        java.lang.Iterable<? extends org.springframework.issues.tutorial.Person> values) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        super.addAll(values, person_);
        onChanged();
      } else {
        personBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder clearPerson() {
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder removePerson(int index) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.remove(index);
        onChanged();
      } else {
        personBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public org.springframework.issues.tutorial.Person.Builder getPersonBuilder(
        int index) {
      return getPersonFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public org.springframework.issues.tutorial.PersonOrBuilder getPersonOrBuilder(
        int index) {
      if (personBuilder_ == null) {
        return person_.get(index);  } else {
        return personBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public java.util.List<? extends org.springframework.issues.tutorial.PersonOrBuilder> 
         getPersonOrBuilderList() {
      if (personBuilder_ != null) {
        return personBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(person_);
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public org.springframework.issues.tutorial.Person.Builder addPersonBuilder() {
      return getPersonFieldBuilder().addBuilder(
          org.springframework.issues.tutorial.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public org.springframework.issues.tutorial.Person.Builder addPersonBuilder(
        int index) {
      return getPersonFieldBuilder().addBuilder(
          index, org.springframework.issues.tutorial.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public java.util.List<org.springframework.issues.tutorial.Person.Builder> 
         getPersonBuilderList() {
      return getPersonFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.springframework.issues.tutorial.Person, org.springframework.issues.tutorial.Person.Builder, org.springframework.issues.tutorial.PersonOrBuilder> 
        getPersonFieldBuilder() {
      if (personBuilder_ == null) {
        personBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.springframework.issues.tutorial.Person, org.springframework.issues.tutorial.Person.Builder, org.springframework.issues.tutorial.PersonOrBuilder>(
                person_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        person_ = null;
      }
      return personBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:AddressBook)
  }

  static {
    defaultInstance = new AddressBook(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AddressBook)
}


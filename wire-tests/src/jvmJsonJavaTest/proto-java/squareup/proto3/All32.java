// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.All32 in all32.proto
package squareup.proto3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class All32 extends Message<All32, All32.Builder> {
  public static final ProtoAdapter<All32> ADAPTER = ProtoAdapter.newMessageAdapter(All32.class, "type.googleapis.com/squareup.proto3.All32", Syntax.PROTO_3);

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_ONEOF_INT32 = 0;

  public static final Integer DEFAULT_ONEOF_SFIXED32 = 0;

  /**
   * Prefixing so the generated code doesn't rename it weirdly.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "myInt32"
  )
  public final int my_int32;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "myUint32"
  )
  public final int my_uint32;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#SINT32",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "mySint32"
  )
  public final int my_sint32;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "myFixed32"
  )
  public final int my_fixed32;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED32",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "mySfixed32"
  )
  public final int my_sfixed32;

  @WireField(
      tag = 201,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REPEATED,
      jsonName = "repInt32"
  )
  public final List<Integer> rep_int32;

  @WireField(
      tag = 202,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32",
      label = WireField.Label.REPEATED,
      jsonName = "repUint32"
  )
  public final List<Integer> rep_uint32;

  @WireField(
      tag = 203,
      adapter = "com.squareup.wire.ProtoAdapter#SINT32",
      label = WireField.Label.REPEATED,
      jsonName = "repSint32"
  )
  public final List<Integer> rep_sint32;

  @WireField(
      tag = 204,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32",
      label = WireField.Label.REPEATED,
      jsonName = "repFixed32"
  )
  public final List<Integer> rep_fixed32;

  @WireField(
      tag = 205,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED32",
      label = WireField.Label.REPEATED,
      jsonName = "repSfixed32"
  )
  public final List<Integer> rep_sfixed32;

  @WireField(
      tag = 301,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.PACKED,
      jsonName = "packInt32"
  )
  public final List<Integer> pack_int32;

  @WireField(
      tag = 302,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32",
      label = WireField.Label.PACKED,
      jsonName = "packUint32"
  )
  public final List<Integer> pack_uint32;

  @WireField(
      tag = 303,
      adapter = "com.squareup.wire.ProtoAdapter#SINT32",
      label = WireField.Label.PACKED,
      jsonName = "packSint32"
  )
  public final List<Integer> pack_sint32;

  @WireField(
      tag = 304,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32",
      label = WireField.Label.PACKED,
      jsonName = "packFixed32"
  )
  public final List<Integer> pack_fixed32;

  @WireField(
      tag = 305,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED32",
      label = WireField.Label.PACKED,
      jsonName = "packSfixed32"
  )
  public final List<Integer> pack_sfixed32;

  @WireField(
      tag = 501,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      jsonName = "mapInt32Int32"
  )
  public final Map<Integer, Integer> map_int32_int32;

  @WireField(
      tag = 502,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#UINT32",
      jsonName = "mapInt32Uint32"
  )
  public final Map<Integer, Integer> map_int32_uint32;

  @WireField(
      tag = 503,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#SINT32",
      jsonName = "mapInt32Sint32"
  )
  public final Map<Integer, Integer> map_int32_sint32;

  @WireField(
      tag = 504,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32",
      jsonName = "mapInt32Fixed32"
  )
  public final Map<Integer, Integer> map_int32_fixed32;

  @WireField(
      tag = 505,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED32",
      jsonName = "mapInt32Sfixed32"
  )
  public final Map<Integer, Integer> map_int32_sfixed32;

  @WireField(
      tag = 401,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      jsonName = "oneofInt32",
      oneofName = "choice"
  )
  public final Integer oneof_int32;

  @WireField(
      tag = 402,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED32",
      jsonName = "oneofSfixed32",
      oneofName = "choice"
  )
  public final Integer oneof_sfixed32;

  public All32(Builder builder, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    if (Internal.countNonNull(builder.oneof_int32, builder.oneof_sfixed32) > 1) {
      throw new IllegalArgumentException("at most one of builder.oneof_int32, builder.oneof_sfixed32 may be non-null");
    }
    this.my_int32 = builder.my_int32;
    this.my_uint32 = builder.my_uint32;
    this.my_sint32 = builder.my_sint32;
    this.my_fixed32 = builder.my_fixed32;
    this.my_sfixed32 = builder.my_sfixed32;
    this.rep_int32 = Internal.immutableCopyOf("rep_int32", builder.rep_int32);
    this.rep_uint32 = Internal.immutableCopyOf("rep_uint32", builder.rep_uint32);
    this.rep_sint32 = Internal.immutableCopyOf("rep_sint32", builder.rep_sint32);
    this.rep_fixed32 = Internal.immutableCopyOf("rep_fixed32", builder.rep_fixed32);
    this.rep_sfixed32 = Internal.immutableCopyOf("rep_sfixed32", builder.rep_sfixed32);
    this.pack_int32 = Internal.immutableCopyOf("pack_int32", builder.pack_int32);
    this.pack_uint32 = Internal.immutableCopyOf("pack_uint32", builder.pack_uint32);
    this.pack_sint32 = Internal.immutableCopyOf("pack_sint32", builder.pack_sint32);
    this.pack_fixed32 = Internal.immutableCopyOf("pack_fixed32", builder.pack_fixed32);
    this.pack_sfixed32 = Internal.immutableCopyOf("pack_sfixed32", builder.pack_sfixed32);
    this.map_int32_int32 = Internal.immutableCopyOf("map_int32_int32", builder.map_int32_int32);
    this.map_int32_uint32 = Internal.immutableCopyOf("map_int32_uint32", builder.map_int32_uint32);
    this.map_int32_sint32 = Internal.immutableCopyOf("map_int32_sint32", builder.map_int32_sint32);
    this.map_int32_fixed32 = Internal.immutableCopyOf("map_int32_fixed32", builder.map_int32_fixed32);
    this.map_int32_sfixed32 = Internal.immutableCopyOf("map_int32_sfixed32", builder.map_int32_sfixed32);
    this.oneof_int32 = builder.oneof_int32;
    this.oneof_sfixed32 = builder.oneof_sfixed32;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.my_int32 = my_int32;
    builder.my_uint32 = my_uint32;
    builder.my_sint32 = my_sint32;
    builder.my_fixed32 = my_fixed32;
    builder.my_sfixed32 = my_sfixed32;
    builder.rep_int32 = Internal.copyOf(rep_int32);
    builder.rep_uint32 = Internal.copyOf(rep_uint32);
    builder.rep_sint32 = Internal.copyOf(rep_sint32);
    builder.rep_fixed32 = Internal.copyOf(rep_fixed32);
    builder.rep_sfixed32 = Internal.copyOf(rep_sfixed32);
    builder.pack_int32 = Internal.copyOf(pack_int32);
    builder.pack_uint32 = Internal.copyOf(pack_uint32);
    builder.pack_sint32 = Internal.copyOf(pack_sint32);
    builder.pack_fixed32 = Internal.copyOf(pack_fixed32);
    builder.pack_sfixed32 = Internal.copyOf(pack_sfixed32);
    builder.map_int32_int32 = Internal.copyOf(map_int32_int32);
    builder.map_int32_uint32 = Internal.copyOf(map_int32_uint32);
    builder.map_int32_sint32 = Internal.copyOf(map_int32_sint32);
    builder.map_int32_fixed32 = Internal.copyOf(map_int32_fixed32);
    builder.map_int32_sfixed32 = Internal.copyOf(map_int32_sfixed32);
    builder.oneof_int32 = oneof_int32;
    builder.oneof_sfixed32 = oneof_sfixed32;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof All32)) return false;
    All32 o = (All32) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(my_int32, o.my_int32)
        && Internal.equals(my_uint32, o.my_uint32)
        && Internal.equals(my_sint32, o.my_sint32)
        && Internal.equals(my_fixed32, o.my_fixed32)
        && Internal.equals(my_sfixed32, o.my_sfixed32)
        && rep_int32.equals(o.rep_int32)
        && rep_uint32.equals(o.rep_uint32)
        && rep_sint32.equals(o.rep_sint32)
        && rep_fixed32.equals(o.rep_fixed32)
        && rep_sfixed32.equals(o.rep_sfixed32)
        && pack_int32.equals(o.pack_int32)
        && pack_uint32.equals(o.pack_uint32)
        && pack_sint32.equals(o.pack_sint32)
        && pack_fixed32.equals(o.pack_fixed32)
        && pack_sfixed32.equals(o.pack_sfixed32)
        && map_int32_int32.equals(o.map_int32_int32)
        && map_int32_uint32.equals(o.map_int32_uint32)
        && map_int32_sint32.equals(o.map_int32_sint32)
        && map_int32_fixed32.equals(o.map_int32_fixed32)
        && map_int32_sfixed32.equals(o.map_int32_sfixed32)
        && Internal.equals(oneof_int32, o.oneof_int32)
        && Internal.equals(oneof_sfixed32, o.oneof_sfixed32);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + Integer.hashCode(my_int32);
      result = result * 37 + Integer.hashCode(my_uint32);
      result = result * 37 + Integer.hashCode(my_sint32);
      result = result * 37 + Integer.hashCode(my_fixed32);
      result = result * 37 + Integer.hashCode(my_sfixed32);
      result = result * 37 + rep_int32.hashCode();
      result = result * 37 + rep_uint32.hashCode();
      result = result * 37 + rep_sint32.hashCode();
      result = result * 37 + rep_fixed32.hashCode();
      result = result * 37 + rep_sfixed32.hashCode();
      result = result * 37 + pack_int32.hashCode();
      result = result * 37 + pack_uint32.hashCode();
      result = result * 37 + pack_sint32.hashCode();
      result = result * 37 + pack_fixed32.hashCode();
      result = result * 37 + pack_sfixed32.hashCode();
      result = result * 37 + map_int32_int32.hashCode();
      result = result * 37 + map_int32_uint32.hashCode();
      result = result * 37 + map_int32_sint32.hashCode();
      result = result * 37 + map_int32_fixed32.hashCode();
      result = result * 37 + map_int32_sfixed32.hashCode();
      result = result * 37 + (oneof_int32 != null ? oneof_int32.hashCode() : 0);
      result = result * 37 + (oneof_sfixed32 != null ? oneof_sfixed32.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<All32, Builder> {
    public int my_int32;

    public int my_uint32;

    public int my_sint32;

    public int my_fixed32;

    public int my_sfixed32;

    public List<Integer> rep_int32;

    public List<Integer> rep_uint32;

    public List<Integer> rep_sint32;

    public List<Integer> rep_fixed32;

    public List<Integer> rep_sfixed32;

    public List<Integer> pack_int32;

    public List<Integer> pack_uint32;

    public List<Integer> pack_sint32;

    public List<Integer> pack_fixed32;

    public List<Integer> pack_sfixed32;

    public Map<Integer, Integer> map_int32_int32;

    public Map<Integer, Integer> map_int32_uint32;

    public Map<Integer, Integer> map_int32_sint32;

    public Map<Integer, Integer> map_int32_fixed32;

    public Map<Integer, Integer> map_int32_sfixed32;

    public Integer oneof_int32;

    public Integer oneof_sfixed32;

    public Builder() {
      my_int32 = 0;
      my_uint32 = 0;
      my_sint32 = 0;
      my_fixed32 = 0;
      my_sfixed32 = 0;
      rep_int32 = Internal.newMutableList();
      rep_uint32 = Internal.newMutableList();
      rep_sint32 = Internal.newMutableList();
      rep_fixed32 = Internal.newMutableList();
      rep_sfixed32 = Internal.newMutableList();
      pack_int32 = Internal.newMutableList();
      pack_uint32 = Internal.newMutableList();
      pack_sint32 = Internal.newMutableList();
      pack_fixed32 = Internal.newMutableList();
      pack_sfixed32 = Internal.newMutableList();
      map_int32_int32 = Internal.newMutableMap();
      map_int32_uint32 = Internal.newMutableMap();
      map_int32_sint32 = Internal.newMutableMap();
      map_int32_fixed32 = Internal.newMutableMap();
      map_int32_sfixed32 = Internal.newMutableMap();
    }

    /**
     * Prefixing so the generated code doesn't rename it weirdly.
     */
    public Builder my_int32(int my_int32) {
      this.my_int32 = my_int32;
      return this;
    }

    public Builder my_uint32(int my_uint32) {
      this.my_uint32 = my_uint32;
      return this;
    }

    public Builder my_sint32(int my_sint32) {
      this.my_sint32 = my_sint32;
      return this;
    }

    public Builder my_fixed32(int my_fixed32) {
      this.my_fixed32 = my_fixed32;
      return this;
    }

    public Builder my_sfixed32(int my_sfixed32) {
      this.my_sfixed32 = my_sfixed32;
      return this;
    }

    public Builder rep_int32(List<Integer> rep_int32) {
      Internal.checkElementsNotNull(rep_int32);
      this.rep_int32 = rep_int32;
      return this;
    }

    public Builder rep_uint32(List<Integer> rep_uint32) {
      Internal.checkElementsNotNull(rep_uint32);
      this.rep_uint32 = rep_uint32;
      return this;
    }

    public Builder rep_sint32(List<Integer> rep_sint32) {
      Internal.checkElementsNotNull(rep_sint32);
      this.rep_sint32 = rep_sint32;
      return this;
    }

    public Builder rep_fixed32(List<Integer> rep_fixed32) {
      Internal.checkElementsNotNull(rep_fixed32);
      this.rep_fixed32 = rep_fixed32;
      return this;
    }

    public Builder rep_sfixed32(List<Integer> rep_sfixed32) {
      Internal.checkElementsNotNull(rep_sfixed32);
      this.rep_sfixed32 = rep_sfixed32;
      return this;
    }

    public Builder pack_int32(List<Integer> pack_int32) {
      Internal.checkElementsNotNull(pack_int32);
      this.pack_int32 = pack_int32;
      return this;
    }

    public Builder pack_uint32(List<Integer> pack_uint32) {
      Internal.checkElementsNotNull(pack_uint32);
      this.pack_uint32 = pack_uint32;
      return this;
    }

    public Builder pack_sint32(List<Integer> pack_sint32) {
      Internal.checkElementsNotNull(pack_sint32);
      this.pack_sint32 = pack_sint32;
      return this;
    }

    public Builder pack_fixed32(List<Integer> pack_fixed32) {
      Internal.checkElementsNotNull(pack_fixed32);
      this.pack_fixed32 = pack_fixed32;
      return this;
    }

    public Builder pack_sfixed32(List<Integer> pack_sfixed32) {
      Internal.checkElementsNotNull(pack_sfixed32);
      this.pack_sfixed32 = pack_sfixed32;
      return this;
    }

    public Builder map_int32_int32(Map<Integer, Integer> map_int32_int32) {
      Internal.checkElementsNotNull(map_int32_int32);
      this.map_int32_int32 = map_int32_int32;
      return this;
    }

    public Builder map_int32_uint32(Map<Integer, Integer> map_int32_uint32) {
      Internal.checkElementsNotNull(map_int32_uint32);
      this.map_int32_uint32 = map_int32_uint32;
      return this;
    }

    public Builder map_int32_sint32(Map<Integer, Integer> map_int32_sint32) {
      Internal.checkElementsNotNull(map_int32_sint32);
      this.map_int32_sint32 = map_int32_sint32;
      return this;
    }

    public Builder map_int32_fixed32(Map<Integer, Integer> map_int32_fixed32) {
      Internal.checkElementsNotNull(map_int32_fixed32);
      this.map_int32_fixed32 = map_int32_fixed32;
      return this;
    }

    public Builder map_int32_sfixed32(Map<Integer, Integer> map_int32_sfixed32) {
      Internal.checkElementsNotNull(map_int32_sfixed32);
      this.map_int32_sfixed32 = map_int32_sfixed32;
      return this;
    }

    public Builder oneof_int32(Integer oneof_int32) {
      this.oneof_int32 = oneof_int32;
      this.oneof_sfixed32 = null;
      return this;
    }

    public Builder oneof_sfixed32(Integer oneof_sfixed32) {
      this.oneof_sfixed32 = oneof_sfixed32;
      this.oneof_int32 = null;
      return this;
    }

    @Override
    public All32 build() {
      return new All32(this, super.buildUnknownFields());
    }
  }
}

package com.spotify.cosmos.util.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TrackDescriptor extends h implements TrackDescriptorOrBuilder {
    private static final TrackDescriptor DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int WEIGHT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private float weight_;

    static {
        TrackDescriptor trackDescriptor = new TrackDescriptor();
        DEFAULT_INSTANCE = trackDescriptor;
        h.registerDefaultInstance(TrackDescriptor.class, trackDescriptor);
    }

    private TrackDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.bitField0_ &= -3;
        this.weight_ = 0.0f;
    }

    public static TrackDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (TrackDescriptor) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        this.name_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(float f) {
        this.bitField0_ |= 2;
        this.weight_ = f;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "name_", "weight_"});
        }
        if (iOrdinal == 3) {
            return new TrackDescriptor();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (TrackDescriptor.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackDescriptorOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDescriptorOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackDescriptorOrBuilder
    public float getWeight() {
        return this.weight_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDescriptorOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDescriptorOrBuilder
    public boolean hasWeight() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackDescriptor trackDescriptor) {
        return DEFAULT_INSTANCE.createBuilder(trackDescriptor);
    }

    public static TrackDescriptor parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackDescriptor) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackDescriptor parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackDescriptor parseFrom(phc phcVar) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackDescriptor parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackDescriptor parseFrom(byte[] bArr) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackDescriptor parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackDescriptor parseFrom(InputStream inputStream) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDescriptor parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackDescriptor parseFrom(lwg lwgVar) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackDescriptor parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackDescriptor) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

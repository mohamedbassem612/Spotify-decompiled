package com.spotify.cosmos.util.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.gz00;
import p.hz00;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Extension extends h implements ExtensionOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final Extension DEFAULT_INSTANCE;
    public static final int EXTENSION_KIND_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private phc data_ = phc.b;
    private int extensionKind_;

    static {
        Extension extension = new Extension();
        DEFAULT_INSTANCE = extension;
        h.registerDefaultInstance(Extension.class, extension);
    }

    private Extension() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.bitField0_ &= -3;
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensionKind() {
        this.bitField0_ &= -2;
        this.extensionKind_ = 0;
    }

    public static Extension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Extension parseDelimitedFrom(InputStream inputStream) {
        return (Extension) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extension parseFrom(ByteBuffer byteBuffer) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(phc phcVar) {
        phcVar.getClass();
        this.bitField0_ |= 2;
        this.data_ = phcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionKind(hz00 hz00Var) {
        this.extensionKind_ = hz00Var.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            hz00 hz00Var = hz00.b;
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001", new Object[]{"bitField0_", "extensionKind_", gz00.b, "data_"});
        }
        if (iOrdinal == 3) {
            return new Extension();
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
        synchronized (Extension.class) {
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

    @Override // com.spotify.cosmos.util.proto.ExtensionOrBuilder
    public phc getData() {
        return this.data_;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ExtensionOrBuilder
    public hz00 getExtensionKind() {
        hz00 hz00VarB = hz00.b(this.extensionKind_);
        return hz00VarB == null ? hz00.b : hz00VarB;
    }

    @Override // com.spotify.cosmos.util.proto.ExtensionOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ExtensionOrBuilder
    public boolean hasExtensionKind() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(Extension extension) {
        return DEFAULT_INSTANCE.createBuilder(extension);
    }

    public static Extension parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Extension) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Extension parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Extension parseFrom(phc phcVar) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Extension parseFrom(phc phcVar, uz00 uz00Var) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Extension parseFrom(byte[] bArr) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Extension parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Extension parseFrom(InputStream inputStream) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extension parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Extension parseFrom(lwg lwgVar) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Extension parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Extension) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

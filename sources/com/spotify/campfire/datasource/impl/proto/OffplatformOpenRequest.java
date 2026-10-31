package com.spotify.campfire.datasource.impl.proto;

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
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class OffplatformOpenRequest extends h implements OffplatformOpenRequestOrBuilder {
    private static final OffplatformOpenRequest DEFAULT_INSTANCE;
    public static final int OFFPLATFORM_SHARE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String offplatformShareId_ = "";

    static {
        OffplatformOpenRequest offplatformOpenRequest = new OffplatformOpenRequest();
        DEFAULT_INSTANCE = offplatformOpenRequest;
        h.registerDefaultInstance(OffplatformOpenRequest.class, offplatformOpenRequest);
    }

    private OffplatformOpenRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffplatformShareId() {
        this.offplatformShareId_ = getDefaultInstance().getOffplatformShareId();
    }

    public static OffplatformOpenRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OffplatformOpenRequest parseDelimitedFrom(InputStream inputStream) {
        return (OffplatformOpenRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformOpenRequest parseFrom(ByteBuffer byteBuffer) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffplatformShareId(String str) {
        str.getClass();
        this.offplatformShareId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffplatformShareIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.offplatformShareId_ = phcVar.v();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"offplatformShareId_"});
        }
        if (iOrdinal == 3) {
            return new OffplatformOpenRequest();
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
        synchronized (OffplatformOpenRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenRequestOrBuilder
    public String getOffplatformShareId() {
        return this.offplatformShareId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenRequestOrBuilder
    public phc getOffplatformShareIdBytes() {
        return phc.i(this.offplatformShareId_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(OffplatformOpenRequest offplatformOpenRequest) {
        return DEFAULT_INSTANCE.createBuilder(offplatformOpenRequest);
    }

    public static OffplatformOpenRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (OffplatformOpenRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static OffplatformOpenRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static OffplatformOpenRequest parseFrom(phc phcVar) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static OffplatformOpenRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static OffplatformOpenRequest parseFrom(byte[] bArr) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OffplatformOpenRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static OffplatformOpenRequest parseFrom(InputStream inputStream) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformOpenRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static OffplatformOpenRequest parseFrom(lwg lwgVar) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static OffplatformOpenRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (OffplatformOpenRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

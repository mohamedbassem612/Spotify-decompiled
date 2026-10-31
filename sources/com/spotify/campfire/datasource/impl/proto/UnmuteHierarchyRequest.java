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
public final class UnmuteHierarchyRequest extends h implements UnmuteHierarchyRequestOrBuilder {
    private static final UnmuteHierarchyRequest DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String hierarchyId_ = "";

    static {
        UnmuteHierarchyRequest unmuteHierarchyRequest = new UnmuteHierarchyRequest();
        DEFAULT_INSTANCE = unmuteHierarchyRequest;
        h.registerDefaultInstance(UnmuteHierarchyRequest.class, unmuteHierarchyRequest);
    }

    private UnmuteHierarchyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    public static UnmuteHierarchyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UnmuteHierarchyRequest parseDelimitedFrom(InputStream inputStream) {
        return (UnmuteHierarchyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnmuteHierarchyRequest parseFrom(ByteBuffer byteBuffer) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.hierarchyId_ = phcVar.v();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"hierarchyId_"});
        }
        if (iOrdinal == 3) {
            return new UnmuteHierarchyRequest();
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
        synchronized (UnmuteHierarchyRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.UnmuteHierarchyRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UnmuteHierarchyRequestOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(UnmuteHierarchyRequest unmuteHierarchyRequest) {
        return DEFAULT_INSTANCE.createBuilder(unmuteHierarchyRequest);
    }

    public static UnmuteHierarchyRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (UnmuteHierarchyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static UnmuteHierarchyRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static UnmuteHierarchyRequest parseFrom(phc phcVar) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static UnmuteHierarchyRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static UnmuteHierarchyRequest parseFrom(byte[] bArr) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UnmuteHierarchyRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static UnmuteHierarchyRequest parseFrom(InputStream inputStream) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnmuteHierarchyRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static UnmuteHierarchyRequest parseFrom(lwg lwgVar) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static UnmuteHierarchyRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (UnmuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

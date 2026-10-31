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
public final class DeleteChatForMeRequest extends h implements DeleteChatForMeRequestOrBuilder {
    private static final DeleteChatForMeRequest DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String hierarchyId_ = "";

    static {
        DeleteChatForMeRequest deleteChatForMeRequest = new DeleteChatForMeRequest();
        DEFAULT_INSTANCE = deleteChatForMeRequest;
        h.registerDefaultInstance(DeleteChatForMeRequest.class, deleteChatForMeRequest);
    }

    private DeleteChatForMeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    public static DeleteChatForMeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DeleteChatForMeRequest parseDelimitedFrom(InputStream inputStream) {
        return (DeleteChatForMeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteChatForMeRequest parseFrom(ByteBuffer byteBuffer) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
            return new DeleteChatForMeRequest();
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
        synchronized (DeleteChatForMeRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteChatForMeRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteChatForMeRequestOrBuilder
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

    public static Builder newBuilder(DeleteChatForMeRequest deleteChatForMeRequest) {
        return DEFAULT_INSTANCE.createBuilder(deleteChatForMeRequest);
    }

    public static DeleteChatForMeRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeleteChatForMeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeleteChatForMeRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DeleteChatForMeRequest parseFrom(phc phcVar) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DeleteChatForMeRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DeleteChatForMeRequest parseFrom(byte[] bArr) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeleteChatForMeRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DeleteChatForMeRequest parseFrom(InputStream inputStream) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteChatForMeRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeleteChatForMeRequest parseFrom(lwg lwgVar) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DeleteChatForMeRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DeleteChatForMeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

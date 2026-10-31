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
public final class InviteLinkOpenRequest extends h implements InviteLinkOpenRequestOrBuilder {
    private static final InviteLinkOpenRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_ID_FIELD_NUMBER = 1;
    private String shareId_ = "";

    static {
        InviteLinkOpenRequest inviteLinkOpenRequest = new InviteLinkOpenRequest();
        DEFAULT_INSTANCE = inviteLinkOpenRequest;
        h.registerDefaultInstance(InviteLinkOpenRequest.class, inviteLinkOpenRequest);
    }

    private InviteLinkOpenRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareId() {
        this.shareId_ = getDefaultInstance().getShareId();
    }

    public static InviteLinkOpenRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static InviteLinkOpenRequest parseDelimitedFrom(InputStream inputStream) {
        return (InviteLinkOpenRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteLinkOpenRequest parseFrom(ByteBuffer byteBuffer) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareId(String str) {
        str.getClass();
        this.shareId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.shareId_ = phcVar.v();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"shareId_"});
        }
        if (iOrdinal == 3) {
            return new InviteLinkOpenRequest();
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
        synchronized (InviteLinkOpenRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenRequestOrBuilder
    public String getShareId() {
        return this.shareId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenRequestOrBuilder
    public phc getShareIdBytes() {
        return phc.i(this.shareId_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(InviteLinkOpenRequest inviteLinkOpenRequest) {
        return DEFAULT_INSTANCE.createBuilder(inviteLinkOpenRequest);
    }

    public static InviteLinkOpenRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (InviteLinkOpenRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static InviteLinkOpenRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static InviteLinkOpenRequest parseFrom(phc phcVar) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static InviteLinkOpenRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static InviteLinkOpenRequest parseFrom(byte[] bArr) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InviteLinkOpenRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static InviteLinkOpenRequest parseFrom(InputStream inputStream) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteLinkOpenRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static InviteLinkOpenRequest parseFrom(lwg lwgVar) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static InviteLinkOpenRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (InviteLinkOpenRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

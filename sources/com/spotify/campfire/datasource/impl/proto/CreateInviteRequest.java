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
public final class CreateInviteRequest extends h implements CreateInviteRequestOrBuilder {
    private static final CreateInviteRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private InviteOptions options_;
    private String uri_ = "";

    static {
        CreateInviteRequest createInviteRequest = new CreateInviteRequest();
        DEFAULT_INSTANCE = createInviteRequest;
        h.registerDefaultInstance(CreateInviteRequest.class, createInviteRequest);
    }

    private CreateInviteRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static CreateInviteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(InviteOptions inviteOptions) {
        inviteOptions.getClass();
        InviteOptions inviteOptions2 = this.options_;
        if (inviteOptions2 == null || inviteOptions2 == InviteOptions.getDefaultInstance()) {
            this.options_ = inviteOptions;
        } else {
            this.options_ = InviteOptions.newBuilder(this.options_).mergeFrom(inviteOptions).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateInviteRequest parseDelimitedFrom(InputStream inputStream) {
        return (CreateInviteRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateInviteRequest parseFrom(ByteBuffer byteBuffer) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(InviteOptions inviteOptions) {
        inviteOptions.getClass();
        this.options_ = inviteOptions;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.uri_ = phcVar.v();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "options_"});
        }
        if (iOrdinal == 3) {
            return new CreateInviteRequest();
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
        synchronized (CreateInviteRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CreateInviteRequestOrBuilder
    public InviteOptions getOptions() {
        InviteOptions inviteOptions = this.options_;
        return inviteOptions == null ? InviteOptions.getDefaultInstance() : inviteOptions;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateInviteRequestOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateInviteRequestOrBuilder
    public phc getUriBytes() {
        return phc.i(this.uri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateInviteRequestOrBuilder
    public boolean hasOptions() {
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

    public static Builder newBuilder(CreateInviteRequest createInviteRequest) {
        return DEFAULT_INSTANCE.createBuilder(createInviteRequest);
    }

    public static CreateInviteRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateInviteRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateInviteRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CreateInviteRequest parseFrom(phc phcVar) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CreateInviteRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CreateInviteRequest parseFrom(byte[] bArr) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateInviteRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CreateInviteRequest parseFrom(InputStream inputStream) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateInviteRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateInviteRequest parseFrom(lwg lwgVar) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CreateInviteRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CreateInviteRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

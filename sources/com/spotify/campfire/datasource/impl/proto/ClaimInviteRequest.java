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
public final class ClaimInviteRequest extends h implements ClaimInviteRequestOrBuilder {
    private static final ClaimInviteRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_TOKEN_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String permissionToken_ = "";

    static {
        ClaimInviteRequest claimInviteRequest = new ClaimInviteRequest();
        DEFAULT_INSTANCE = claimInviteRequest;
        h.registerDefaultInstance(ClaimInviteRequest.class, claimInviteRequest);
    }

    private ClaimInviteRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermissionToken() {
        this.permissionToken_ = getDefaultInstance().getPermissionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static ClaimInviteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClaimInviteRequest parseDelimitedFrom(InputStream inputStream) {
        return (ClaimInviteRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClaimInviteRequest parseFrom(ByteBuffer byteBuffer) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissionToken(String str) {
        str.getClass();
        this.permissionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissionTokenBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.permissionToken_ = phcVar.v();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uri_", "permissionToken_"});
        }
        if (iOrdinal == 3) {
            return new ClaimInviteRequest();
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
        synchronized (ClaimInviteRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ClaimInviteRequestOrBuilder
    public String getPermissionToken() {
        return this.permissionToken_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClaimInviteRequestOrBuilder
    public phc getPermissionTokenBytes() {
        return phc.i(this.permissionToken_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClaimInviteRequestOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClaimInviteRequestOrBuilder
    public phc getUriBytes() {
        return phc.i(this.uri_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ClaimInviteRequest claimInviteRequest) {
        return DEFAULT_INSTANCE.createBuilder(claimInviteRequest);
    }

    public static ClaimInviteRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClaimInviteRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClaimInviteRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ClaimInviteRequest parseFrom(phc phcVar) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ClaimInviteRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ClaimInviteRequest parseFrom(byte[] bArr) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClaimInviteRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ClaimInviteRequest parseFrom(InputStream inputStream) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClaimInviteRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClaimInviteRequest parseFrom(lwg lwgVar) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ClaimInviteRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ClaimInviteRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

package com.spotify.dj.interactionmanager.v0;

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
public final class GetAckCommentaryAndPrepareRecsRequest extends h implements GetAckCommentaryAndPrepareRecsRequestOrBuilder {
    public static final int CURRENT_SEGMENT_ID_FIELD_NUMBER = 4;
    public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 5;
    private static final GetAckCommentaryAndPrepareRecsRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    private String prompt_ = "";
    private String sessionId_ = "";
    private String deviceId_ = "";
    private String currentSegmentId_ = "";
    private String currentTrackUri_ = "";

    static {
        GetAckCommentaryAndPrepareRecsRequest getAckCommentaryAndPrepareRecsRequest = new GetAckCommentaryAndPrepareRecsRequest();
        DEFAULT_INSTANCE = getAckCommentaryAndPrepareRecsRequest;
        h.registerDefaultInstance(GetAckCommentaryAndPrepareRecsRequest.class, getAckCommentaryAndPrepareRecsRequest);
    }

    private GetAckCommentaryAndPrepareRecsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentSegmentId() {
        this.currentSegmentId_ = DEFAULT_INSTANCE.currentSegmentId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentTrackUri() {
        this.currentTrackUri_ = DEFAULT_INSTANCE.currentTrackUri_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.deviceId_ = DEFAULT_INSTANCE.deviceId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.prompt_ = DEFAULT_INSTANCE.prompt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static GetAckCommentaryAndPrepareRecsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentSegmentId(String str) {
        str.getClass();
        this.currentSegmentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentSegmentIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.currentSegmentId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentTrackUri(String str) {
        str.getClass();
        this.currentTrackUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentTrackUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.currentTrackUri_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.deviceId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrompt(String str) {
        str.getClass();
        this.prompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.prompt_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.sessionId_ = phcVar.v();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"prompt_", "sessionId_", "deviceId_", "currentSegmentId_", "currentTrackUri_"});
        }
        if (iOrdinal == 3) {
            return new GetAckCommentaryAndPrepareRecsRequest();
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
        synchronized (GetAckCommentaryAndPrepareRecsRequest.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final String getCurrentSegmentId() {
        return this.currentSegmentId_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final phc getCurrentSegmentIdBytes() {
        return phc.i(this.currentSegmentId_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final String getCurrentTrackUri() {
        return this.currentTrackUri_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final phc getCurrentTrackUriBytes() {
        return phc.i(this.currentTrackUri_);
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final String getDeviceId() {
        return this.deviceId_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final phc getDeviceIdBytes() {
        return phc.i(this.deviceId_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final String getPrompt() {
        return this.prompt_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final phc getPromptBytes() {
        return phc.i(this.prompt_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequestOrBuilder
    public final phc getSessionIdBytes() {
        return phc.i(this.sessionId_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetAckCommentaryAndPrepareRecsRequest getAckCommentaryAndPrepareRecsRequest) {
        return DEFAULT_INSTANCE.createBuilder(getAckCommentaryAndPrepareRecsRequest);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(phc phcVar) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(byte[] bArr) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(InputStream inputStream) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(lwg lwgVar) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetAckCommentaryAndPrepareRecsRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetAckCommentaryAndPrepareRecsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

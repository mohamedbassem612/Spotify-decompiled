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
public final class ResolveInteractiveContextRequest extends h implements ResolveInteractiveContextRequestOrBuilder {
    public static final int CURRENT_SEGMENT_ID_FIELD_NUMBER = 4;
    public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 7;
    private static final ResolveInteractiveContextRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    public static final int INPUT_TYPE_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 6;
    public static final int RETRIES_LEFT_FIELD_NUMBER = 5;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    private int inputType_;
    private int reason_;
    private String prompt_ = "";
    private String sessionId_ = "";
    private String deviceId_ = "";
    private String currentSegmentId_ = "";
    private String retriesLeft_ = "";
    private String currentTrackUri_ = "";

    static {
        ResolveInteractiveContextRequest resolveInteractiveContextRequest = new ResolveInteractiveContextRequest();
        DEFAULT_INSTANCE = resolveInteractiveContextRequest;
        h.registerDefaultInstance(ResolveInteractiveContextRequest.class, resolveInteractiveContextRequest);
    }

    private ResolveInteractiveContextRequest() {
    }

    public static void C(ResolveInteractiveContextRequest resolveInteractiveContextRequest, int i) {
        resolveInteractiveContextRequest.inputType_ = i;
    }

    public static void G(ResolveInteractiveContextRequest resolveInteractiveContextRequest, int i) {
        resolveInteractiveContextRequest.reason_ = i;
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

    private void clearInputType() {
        this.inputType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.prompt_ = DEFAULT_INSTANCE.prompt_;
    }

    private void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetriesLeft() {
        this.retriesLeft_ = DEFAULT_INSTANCE.retriesLeft_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static ResolveInteractiveContextRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResolveInteractiveContextRequest parseDelimitedFrom(InputStream inputStream) {
        return (ResolveInteractiveContextRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResolveInteractiveContextRequest parseFrom(ByteBuffer byteBuffer) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(ResolveInteractiveContextRequest resolveInteractiveContextRequest) {
        resolveInteractiveContextRequest.inputType_ = 0;
    }

    public static void s(ResolveInteractiveContextRequest resolveInteractiveContextRequest) {
        resolveInteractiveContextRequest.reason_ = 0;
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
    public void setInputType(PromptInputType promptInputType) {
        this.inputType_ = promptInputType.getNumber();
    }

    private void setInputTypeValue(int i) {
        this.inputType_ = i;
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
    public void setReason(RequestSubmissionReason requestSubmissionReason) {
        this.reason_ = requestSubmissionReason.getNumber();
    }

    private void setReasonValue(int i) {
        this.reason_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetriesLeft(String str) {
        str.getClass();
        this.retriesLeft_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetriesLeftBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.retriesLeft_ = phcVar.v();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007Ȉ\b\f", new Object[]{"prompt_", "sessionId_", "deviceId_", "currentSegmentId_", "retriesLeft_", "reason_", "currentTrackUri_", "inputType_"});
        }
        if (iOrdinal == 3) {
            return new ResolveInteractiveContextRequest();
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
        synchronized (ResolveInteractiveContextRequest.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final String getCurrentSegmentId() {
        return this.currentSegmentId_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final phc getCurrentSegmentIdBytes() {
        return phc.i(this.currentSegmentId_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final String getCurrentTrackUri() {
        return this.currentTrackUri_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final phc getCurrentTrackUriBytes() {
        return phc.i(this.currentTrackUri_);
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final String getDeviceId() {
        return this.deviceId_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final phc getDeviceIdBytes() {
        return phc.i(this.deviceId_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final PromptInputType getInputType() {
        PromptInputType promptInputTypeForNumber = PromptInputType.forNumber(this.inputType_);
        return promptInputTypeForNumber == null ? PromptInputType.UNRECOGNIZED : promptInputTypeForNumber;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final int getInputTypeValue() {
        return this.inputType_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final String getPrompt() {
        return this.prompt_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final phc getPromptBytes() {
        return phc.i(this.prompt_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final RequestSubmissionReason getReason() {
        RequestSubmissionReason requestSubmissionReasonForNumber = RequestSubmissionReason.forNumber(this.reason_);
        return requestSubmissionReasonForNumber == null ? RequestSubmissionReason.UNRECOGNIZED : requestSubmissionReasonForNumber;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final int getReasonValue() {
        return this.reason_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final String getRetriesLeft() {
        return this.retriesLeft_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final phc getRetriesLeftBytes() {
        return phc.i(this.retriesLeft_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequestOrBuilder
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

    public static Builder newBuilder(ResolveInteractiveContextRequest resolveInteractiveContextRequest) {
        return DEFAULT_INSTANCE.createBuilder(resolveInteractiveContextRequest);
    }

    public static ResolveInteractiveContextRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ResolveInteractiveContextRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ResolveInteractiveContextRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ResolveInteractiveContextRequest parseFrom(phc phcVar) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ResolveInteractiveContextRequest parseFrom(byte[] bArr) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResolveInteractiveContextRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ResolveInteractiveContextRequest parseFrom(InputStream inputStream) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResolveInteractiveContextRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ResolveInteractiveContextRequest parseFrom(lwg lwgVar) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ResolveInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

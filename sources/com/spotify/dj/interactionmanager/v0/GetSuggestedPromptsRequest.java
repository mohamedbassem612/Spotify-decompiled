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
public final class GetSuggestedPromptsRequest extends h implements GetSuggestedPromptsRequestOrBuilder {
    public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 3;
    private static final GetSuggestedPromptsRequest DEFAULT_INSTANCE;
    public static final int LLM_MODEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private String currentTrackUri_ = "";
    private int llmModel_;
    private boolean unused_;

    static {
        GetSuggestedPromptsRequest getSuggestedPromptsRequest = new GetSuggestedPromptsRequest();
        DEFAULT_INSTANCE = getSuggestedPromptsRequest;
        h.registerDefaultInstance(GetSuggestedPromptsRequest.class, getSuggestedPromptsRequest);
    }

    private GetSuggestedPromptsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentTrackUri() {
        this.currentTrackUri_ = DEFAULT_INSTANCE.currentTrackUri_;
    }

    private void clearLlmModel() {
        this.llmModel_ = 0;
    }

    private void clearUnused() {
        this.unused_ = false;
    }

    public static GetSuggestedPromptsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(GetSuggestedPromptsRequest getSuggestedPromptsRequest) {
        getSuggestedPromptsRequest.llmModel_ = 0;
    }

    public static void p(GetSuggestedPromptsRequest getSuggestedPromptsRequest) {
        getSuggestedPromptsRequest.unused_ = false;
    }

    public static GetSuggestedPromptsRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetSuggestedPromptsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetSuggestedPromptsRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setLlmModel(Model model) {
        this.llmModel_ = model.getNumber();
    }

    private void setLlmModelValue(int i) {
        this.llmModel_ = i;
    }

    private void setUnused(boolean z) {
        this.unused_ = z;
    }

    public static void t(GetSuggestedPromptsRequest getSuggestedPromptsRequest, int i) {
        getSuggestedPromptsRequest.llmModel_ = i;
    }

    public static void u(GetSuggestedPromptsRequest getSuggestedPromptsRequest, boolean z) {
        getSuggestedPromptsRequest.unused_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003Ȉ", new Object[]{"unused_", "llmModel_", "currentTrackUri_"});
        }
        if (iOrdinal == 3) {
            return new GetSuggestedPromptsRequest();
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
        synchronized (GetSuggestedPromptsRequest.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequestOrBuilder
    public final String getCurrentTrackUri() {
        return this.currentTrackUri_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequestOrBuilder
    public final phc getCurrentTrackUriBytes() {
        return phc.i(this.currentTrackUri_);
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequestOrBuilder
    public final Model getLlmModel() {
        Model modelForNumber = Model.forNumber(this.llmModel_);
        return modelForNumber == null ? Model.UNRECOGNIZED : modelForNumber;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequestOrBuilder
    public final int getLlmModelValue() {
        return this.llmModel_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequestOrBuilder
    public final boolean getUnused() {
        return this.unused_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetSuggestedPromptsRequest getSuggestedPromptsRequest) {
        return DEFAULT_INSTANCE.createBuilder(getSuggestedPromptsRequest);
    }

    public static GetSuggestedPromptsRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetSuggestedPromptsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetSuggestedPromptsRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetSuggestedPromptsRequest parseFrom(phc phcVar) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetSuggestedPromptsRequest parseFrom(byte[] bArr) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetSuggestedPromptsRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetSuggestedPromptsRequest parseFrom(InputStream inputStream) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetSuggestedPromptsRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetSuggestedPromptsRequest parseFrom(lwg lwgVar) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetSuggestedPromptsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

package com.spotify.dj.interactionmanager.v0;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DebugInteractiveContextResponse extends h implements DebugInteractiveContextResponseOrBuilder {
    public static final int ACK_COMMENTARY_FIELD_NUMBER = 3;
    public static final int CONTAINS_PROMPT_VIOLATION_FIELD_NUMBER = 8;
    private static final DebugInteractiveContextResponse DEFAULT_INSTANCE;
    public static final int INTRO_COMMENTARY_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_VIOLATION_LABEL_FIELD_NUMBER = 7;
    public static final int RECSPLANATION_FIELD_NUMBER = 6;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    public static final int STATUS_MESSAGE_FIELD_NUMBER = 2;
    public static final int TRACK_URIS_FIELD_NUMBER = 4;
    private boolean containsPromptViolation_;
    private String statusCode_ = "";
    private String statusMessage_ = "";
    private String ackCommentary_ = "";
    private h290 trackUris_ = h.emptyProtobufList();
    private String introCommentary_ = "";
    private String recsplanation_ = "";
    private String promptViolationLabel_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        DebugInteractiveContextResponse debugInteractiveContextResponse = new DebugInteractiveContextResponse();
        DEFAULT_INSTANCE = debugInteractiveContextResponse;
        h.registerDefaultInstance(DebugInteractiveContextResponse.class, debugInteractiveContextResponse);
    }

    private DebugInteractiveContextResponse() {
    }

    public static void A(DebugInteractiveContextResponse debugInteractiveContextResponse, boolean z) {
        debugInteractiveContextResponse.containsPromptViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackUris(Iterable<String> iterable) {
        ensureTrackUrisIsMutable();
        s8.addAll(iterable, this.trackUris_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackUris(String str) {
        str.getClass();
        ensureTrackUrisIsMutable();
        this.trackUris_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackUrisBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureTrackUrisIsMutable();
        this.trackUris_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckCommentary() {
        this.ackCommentary_ = DEFAULT_INSTANCE.ackCommentary_;
    }

    private void clearContainsPromptViolation() {
        this.containsPromptViolation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroCommentary() {
        this.introCommentary_ = DEFAULT_INSTANCE.introCommentary_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptViolationLabel() {
        this.promptViolationLabel_ = DEFAULT_INSTANCE.promptViolationLabel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecsplanation() {
        this.recsplanation_ = DEFAULT_INSTANCE.recsplanation_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusCode() {
        this.statusCode_ = DEFAULT_INSTANCE.statusCode_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusMessage() {
        this.statusMessage_ = DEFAULT_INSTANCE.statusMessage_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackUris() {
        this.trackUris_ = h.emptyProtobufList();
    }

    private void ensureTrackUrisIsMutable() {
        i9 i9Var = this.trackUris_;
        if (i9Var.a) {
            return;
        }
        this.trackUris_ = h.mutableCopy(i9Var);
    }

    public static DebugInteractiveContextResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DebugInteractiveContextResponse parseDelimitedFrom(InputStream inputStream) {
        return (DebugInteractiveContextResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextResponse parseFrom(ByteBuffer byteBuffer) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void r(DebugInteractiveContextResponse debugInteractiveContextResponse) {
        debugInteractiveContextResponse.containsPromptViolation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckCommentary(String str) {
        str.getClass();
        this.ackCommentary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckCommentaryBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.ackCommentary_ = phcVar.v();
    }

    private void setContainsPromptViolation(boolean z) {
        this.containsPromptViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroCommentary(String str) {
        str.getClass();
        this.introCommentary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroCommentaryBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.introCommentary_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptViolationLabel(String str) {
        str.getClass();
        this.promptViolationLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptViolationLabelBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.promptViolationLabel_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecsplanation(String str) {
        str.getClass();
        this.recsplanation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecsplanationBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.recsplanation_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCode(String str) {
        str.getClass();
        this.statusCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCodeBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.statusCode_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessage(String str) {
        str.getClass();
        this.statusMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessageBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.statusMessage_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackUris(int i, String str) {
        str.getClass();
        ensureTrackUrisIsMutable();
        this.trackUris_.set(i, str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007", new Object[]{"statusCode_", "statusMessage_", "ackCommentary_", "trackUris_", "introCommentary_", "recsplanation_", "promptViolationLabel_", "containsPromptViolation_"});
        }
        if (iOrdinal == 3) {
            return new DebugInteractiveContextResponse();
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
        synchronized (DebugInteractiveContextResponse.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final String getAckCommentary() {
        return this.ackCommentary_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final phc getAckCommentaryBytes() {
        return phc.i(this.ackCommentary_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final boolean getContainsPromptViolation() {
        return this.containsPromptViolation_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final String getIntroCommentary() {
        return this.introCommentary_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final phc getIntroCommentaryBytes() {
        return phc.i(this.introCommentary_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final String getPromptViolationLabel() {
        return this.promptViolationLabel_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final phc getPromptViolationLabelBytes() {
        return phc.i(this.promptViolationLabel_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final String getRecsplanation() {
        return this.recsplanation_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final phc getRecsplanationBytes() {
        return phc.i(this.recsplanation_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final String getStatusCode() {
        return this.statusCode_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final phc getStatusCodeBytes() {
        return phc.i(this.statusCode_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final String getStatusMessage() {
        return this.statusMessage_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final phc getStatusMessageBytes() {
        return phc.i(this.statusMessage_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final String getTrackUris(int i) {
        return (String) this.trackUris_.get(i);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final phc getTrackUrisBytes(int i) {
        return phc.i((String) this.trackUris_.get(i));
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final int getTrackUrisCount() {
        return this.trackUris_.size();
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
    public final List<String> getTrackUrisList() {
        return this.trackUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DebugInteractiveContextResponseOrBuilder {
        private Builder() {
            super(DebugInteractiveContextResponse.DEFAULT_INSTANCE);
        }

        public final Builder addAllTrackUris(Iterable<String> iterable) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).addAllTrackUris(iterable);
            return this;
        }

        public final Builder addTrackUris(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).addTrackUris(str);
            return this;
        }

        public final Builder addTrackUrisBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).addTrackUrisBytes(phcVar);
            return this;
        }

        public final /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public final /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public final Builder clearAckCommentary() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).clearAckCommentary();
            return this;
        }

        public final Builder clearContainsPromptViolation() {
            copyOnWrite();
            DebugInteractiveContextResponse.r((DebugInteractiveContextResponse) ((g) this).instance);
            return this;
        }

        public final Builder clearIntroCommentary() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).clearIntroCommentary();
            return this;
        }

        public final Builder clearPromptViolationLabel() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).clearPromptViolationLabel();
            return this;
        }

        public final Builder clearRecsplanation() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).clearRecsplanation();
            return this;
        }

        public final Builder clearStatusCode() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).clearStatusCode();
            return this;
        }

        public final Builder clearStatusMessage() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).clearStatusMessage();
            return this;
        }

        public final Builder clearTrackUris() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).clearTrackUris();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final String getAckCommentary() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getAckCommentary();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final phc getAckCommentaryBytes() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getAckCommentaryBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final boolean getContainsPromptViolation() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getContainsPromptViolation();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final String getIntroCommentary() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getIntroCommentary();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final phc getIntroCommentaryBytes() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getIntroCommentaryBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final String getPromptViolationLabel() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getPromptViolationLabel();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final phc getPromptViolationLabelBytes() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getPromptViolationLabelBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final String getRecsplanation() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getRecsplanation();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final phc getRecsplanationBytes() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getRecsplanationBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final String getStatusCode() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getStatusCode();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final phc getStatusCodeBytes() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getStatusCodeBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final String getStatusMessage() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getStatusMessage();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final phc getStatusMessageBytes() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getStatusMessageBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final String getTrackUris(int i) {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getTrackUris(i);
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final phc getTrackUrisBytes(int i) {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getTrackUrisBytes(i);
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final int getTrackUrisCount() {
            return ((DebugInteractiveContextResponse) ((g) this).instance).getTrackUrisCount();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponseOrBuilder
        public final List<String> getTrackUrisList() {
            return Collections.unmodifiableList(((DebugInteractiveContextResponse) ((g) this).instance).getTrackUrisList());
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m27mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setAckCommentary(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setAckCommentary(str);
            return this;
        }

        public final Builder setAckCommentaryBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setAckCommentaryBytes(phcVar);
            return this;
        }

        public final Builder setContainsPromptViolation(boolean z) {
            copyOnWrite();
            DebugInteractiveContextResponse.A((DebugInteractiveContextResponse) ((g) this).instance, z);
            return this;
        }

        public final Builder setIntroCommentary(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setIntroCommentary(str);
            return this;
        }

        public final Builder setIntroCommentaryBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setIntroCommentaryBytes(phcVar);
            return this;
        }

        public final Builder setPromptViolationLabel(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setPromptViolationLabel(str);
            return this;
        }

        public final Builder setPromptViolationLabelBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setPromptViolationLabelBytes(phcVar);
            return this;
        }

        public final Builder setRecsplanation(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setRecsplanation(str);
            return this;
        }

        public final Builder setRecsplanationBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setRecsplanationBytes(phcVar);
            return this;
        }

        public final Builder setStatusCode(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setStatusCode(str);
            return this;
        }

        public final Builder setStatusCodeBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setStatusCodeBytes(phcVar);
            return this;
        }

        public final Builder setStatusMessage(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setStatusMessage(str);
            return this;
        }

        public final Builder setStatusMessageBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setStatusMessageBytes(phcVar);
            return this;
        }

        public final Builder setTrackUris(int i, String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) ((g) this).instance).setTrackUris(i, str);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m26clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m28mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m25clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m29mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(DebugInteractiveContextResponse debugInteractiveContextResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(debugInteractiveContextResponse);
    }

    public static DebugInteractiveContextResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DebugInteractiveContextResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DebugInteractiveContextResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DebugInteractiveContextResponse parseFrom(phc phcVar) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DebugInteractiveContextResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DebugInteractiveContextResponse parseFrom(byte[] bArr) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DebugInteractiveContextResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DebugInteractiveContextResponse parseFrom(InputStream inputStream) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DebugInteractiveContextResponse parseFrom(lwg lwgVar) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DebugInteractiveContextResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DebugInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

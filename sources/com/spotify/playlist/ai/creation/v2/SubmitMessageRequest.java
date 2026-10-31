package com.spotify.playlist.ai.creation.v2;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class SubmitMessageRequest extends h implements SubmitMessageRequestOrBuilder {
    private static final SubmitMessageRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 3;
    public static final int MESSAGE_PROMPT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ChatMessagePreferences messagePreferences_;
    private String sessionId_ = "";
    private String messagePrompt_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.SubmitMessageRequest$1, reason: invalid class name */
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
        SubmitMessageRequest submitMessageRequest = new SubmitMessageRequest();
        DEFAULT_INSTANCE = submitMessageRequest;
        h.registerDefaultInstance(SubmitMessageRequest.class, submitMessageRequest);
    }

    private SubmitMessageRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePreferences() {
        this.messagePreferences_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePrompt() {
        this.messagePrompt_ = DEFAULT_INSTANCE.messagePrompt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static SubmitMessageRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
        chatMessagePreferences.getClass();
        ChatMessagePreferences chatMessagePreferences2 = this.messagePreferences_;
        if (chatMessagePreferences2 == null || chatMessagePreferences2 == ChatMessagePreferences.getDefaultInstance()) {
            this.messagePreferences_ = chatMessagePreferences;
        } else {
            this.messagePreferences_ = (ChatMessagePreferences) ((ChatMessagePreferences.Builder) ChatMessagePreferences.newBuilder(this.messagePreferences_).mergeFrom(chatMessagePreferences)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SubmitMessageRequest parseDelimitedFrom(InputStream inputStream) {
        return (SubmitMessageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageRequest parseFrom(ByteBuffer byteBuffer) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
        chatMessagePreferences.getClass();
        this.messagePreferences_ = chatMessagePreferences;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePrompt(String str) {
        str.getClass();
        this.messagePrompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePromptBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.messagePrompt_ = phcVar.v();
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

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "sessionId_", "messagePrompt_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new SubmitMessageRequest();
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
        synchronized (SubmitMessageRequest.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
    public final ChatMessagePreferences getMessagePreferences() {
        ChatMessagePreferences chatMessagePreferences = this.messagePreferences_;
        return chatMessagePreferences == null ? ChatMessagePreferences.getDefaultInstance() : chatMessagePreferences;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
    public final String getMessagePrompt() {
        return this.messagePrompt_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
    public final phc getMessagePromptBytes() {
        return phc.i(this.messagePrompt_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
    public final phc getSessionIdBytes() {
        return phc.i(this.sessionId_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
    public final boolean hasMessagePreferences() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SubmitMessageRequestOrBuilder {
        private Builder() {
            super(SubmitMessageRequest.DEFAULT_INSTANCE);
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

        public final Builder clearMessagePreferences() {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).clearMessagePreferences();
            return this;
        }

        public final Builder clearMessagePrompt() {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).clearMessagePrompt();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).clearSessionId();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
        public final ChatMessagePreferences getMessagePreferences() {
            return ((SubmitMessageRequest) ((g) this).instance).getMessagePreferences();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
        public final String getMessagePrompt() {
            return ((SubmitMessageRequest) ((g) this).instance).getMessagePrompt();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
        public final phc getMessagePromptBytes() {
            return ((SubmitMessageRequest) ((g) this).instance).getMessagePromptBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
        public final String getSessionId() {
            return ((SubmitMessageRequest) ((g) this).instance).getSessionId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
        public final phc getSessionIdBytes() {
            return ((SubmitMessageRequest) ((g) this).instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageRequestOrBuilder
        public final boolean hasMessagePreferences() {
            return ((SubmitMessageRequest) ((g) this).instance).hasMessagePreferences();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m567mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder mergeMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).mergeMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setMessagePreferences(ChatMessagePreferences.Builder builder) {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).setMessagePreferences((ChatMessagePreferences) builder.build());
            return this;
        }

        public final Builder setMessagePrompt(String str) {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).setMessagePrompt(str);
            return this;
        }

        public final Builder setMessagePromptBytes(phc phcVar) {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).setMessagePromptBytes(phcVar);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(phc phcVar) {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).setSessionIdBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m566clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m568mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m565clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m569mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((SubmitMessageRequest) ((g) this).instance).setMessagePreferences(chatMessagePreferences);
            return this;
        }
    }

    public static Builder newBuilder(SubmitMessageRequest submitMessageRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(submitMessageRequest);
    }

    public static SubmitMessageRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitMessageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitMessageRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SubmitMessageRequest parseFrom(phc phcVar) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SubmitMessageRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SubmitMessageRequest parseFrom(byte[] bArr) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubmitMessageRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SubmitMessageRequest parseFrom(InputStream inputStream) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitMessageRequest parseFrom(lwg lwgVar) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SubmitMessageRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SubmitMessageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

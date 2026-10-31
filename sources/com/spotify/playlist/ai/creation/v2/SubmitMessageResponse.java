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
public final class SubmitMessageResponse extends h implements SubmitMessageResponseOrBuilder {
    private static final SubmitMessageResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RETRY_AFTER_MS_FIELD_NUMBER = 5;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBMIT_TIMESTAMP_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private int retryAfterMs_;
    private Status status_;
    private long submitTimestampMs_;
    private String sessionId_ = "";
    private String messageId_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.SubmitMessageResponse$1, reason: invalid class name */
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
        SubmitMessageResponse submitMessageResponse = new SubmitMessageResponse();
        DEFAULT_INSTANCE = submitMessageResponse;
        h.registerDefaultInstance(SubmitMessageResponse.class, submitMessageResponse);
    }

    private SubmitMessageResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
    }

    private void clearRetryAfterMs() {
        this.retryAfterMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubmitTimestampMs() {
        this.submitTimestampMs_ = 0L;
    }

    public static SubmitMessageResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.Builder) Status.newBuilder(this.status_).mergeFrom(status)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(SubmitMessageResponse submitMessageResponse) {
        submitMessageResponse.retryAfterMs_ = 0;
    }

    public static SubmitMessageResponse parseDelimitedFrom(InputStream inputStream) {
        return (SubmitMessageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageResponse parseFrom(ByteBuffer byteBuffer) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void r(SubmitMessageResponse submitMessageResponse) {
        submitMessageResponse.submitTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        str.getClass();
        this.messageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.messageId_ = phcVar.v();
    }

    private void setRetryAfterMs(int i) {
        this.retryAfterMs_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    private void setSubmitTimestampMs(long j) {
        this.submitTimestampMs_ = j;
    }

    public static void v(SubmitMessageResponse submitMessageResponse, int i) {
        submitMessageResponse.retryAfterMs_ = i;
    }

    public static void z(SubmitMessageResponse submitMessageResponse, long j) {
        submitMessageResponse.submitTimestampMs_ = j;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0004", new Object[]{"bitField0_", "status_", "sessionId_", "messageId_", "submitTimestampMs_", "retryAfterMs_"});
        }
        if (iOrdinal == 3) {
            return new SubmitMessageResponse();
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
        synchronized (SubmitMessageResponse.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final phc getMessageIdBytes() {
        return phc.i(this.messageId_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final int getRetryAfterMs() {
        return this.retryAfterMs_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final phc getSessionIdBytes() {
        return phc.i(this.sessionId_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final long getSubmitTimestampMs() {
        return this.submitTimestampMs_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
    public final boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SubmitMessageResponseOrBuilder {
        private Builder() {
            super(SubmitMessageResponse.DEFAULT_INSTANCE);
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

        public final Builder clearMessageId() {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).clearMessageId();
            return this;
        }

        public final Builder clearRetryAfterMs() {
            copyOnWrite();
            SubmitMessageResponse.o((SubmitMessageResponse) ((g) this).instance);
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).clearSessionId();
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).clearStatus();
            return this;
        }

        public final Builder clearSubmitTimestampMs() {
            copyOnWrite();
            SubmitMessageResponse.r((SubmitMessageResponse) ((g) this).instance);
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final String getMessageId() {
            return ((SubmitMessageResponse) ((g) this).instance).getMessageId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final phc getMessageIdBytes() {
            return ((SubmitMessageResponse) ((g) this).instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final int getRetryAfterMs() {
            return ((SubmitMessageResponse) ((g) this).instance).getRetryAfterMs();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final String getSessionId() {
            return ((SubmitMessageResponse) ((g) this).instance).getSessionId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final phc getSessionIdBytes() {
            return ((SubmitMessageResponse) ((g) this).instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final Status getStatus() {
            return ((SubmitMessageResponse) ((g) this).instance).getStatus();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final long getSubmitTimestampMs() {
            return ((SubmitMessageResponse) ((g) this).instance).getSubmitTimestampMs();
        }

        @Override // com.spotify.playlist.ai.creation.v2.SubmitMessageResponseOrBuilder
        public final boolean hasStatus() {
            return ((SubmitMessageResponse) ((g) this).instance).hasStatus();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m572mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder mergeStatus(Status status) {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).mergeStatus(status);
            return this;
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(phc phcVar) {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).setMessageIdBytes(phcVar);
            return this;
        }

        public final Builder setRetryAfterMs(int i) {
            copyOnWrite();
            SubmitMessageResponse.v((SubmitMessageResponse) ((g) this).instance, i);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(phc phcVar) {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).setSessionIdBytes(phcVar);
            return this;
        }

        public final Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).setStatus((Status) builder.build());
            return this;
        }

        public final Builder setSubmitTimestampMs(long j) {
            copyOnWrite();
            SubmitMessageResponse.z((SubmitMessageResponse) ((g) this).instance, j);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m571clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m573mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m570clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m574mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder setStatus(Status status) {
            copyOnWrite();
            ((SubmitMessageResponse) ((g) this).instance).setStatus(status);
            return this;
        }
    }

    public static Builder newBuilder(SubmitMessageResponse submitMessageResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(submitMessageResponse);
    }

    public static SubmitMessageResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitMessageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitMessageResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SubmitMessageResponse parseFrom(phc phcVar) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SubmitMessageResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SubmitMessageResponse parseFrom(byte[] bArr) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubmitMessageResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SubmitMessageResponse parseFrom(InputStream inputStream) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitMessageResponse parseFrom(lwg lwgVar) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SubmitMessageResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SubmitMessageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

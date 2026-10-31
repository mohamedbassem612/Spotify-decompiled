package com.spotify.dj.interactionmanager.v0;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SubmitFeedbackResponse extends h implements SubmitFeedbackResponseOrBuilder {
    private static final SubmitFeedbackResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_ACKNOWLEDGEMENT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String messageAcknowledgement_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponse$1, reason: invalid class name */
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
        SubmitFeedbackResponse submitFeedbackResponse = new SubmitFeedbackResponse();
        DEFAULT_INSTANCE = submitFeedbackResponse;
        h.registerDefaultInstance(SubmitFeedbackResponse.class, submitFeedbackResponse);
    }

    private SubmitFeedbackResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageAcknowledgement() {
        this.messageAcknowledgement_ = DEFAULT_INSTANCE.messageAcknowledgement_;
    }

    public static SubmitFeedbackResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SubmitFeedbackResponse parseDelimitedFrom(InputStream inputStream) {
        return (SubmitFeedbackResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitFeedbackResponse parseFrom(ByteBuffer byteBuffer) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageAcknowledgement(String str) {
        str.getClass();
        this.messageAcknowledgement_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageAcknowledgementBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.messageAcknowledgement_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"messageAcknowledgement_"});
        }
        if (iOrdinal == 3) {
            return new SubmitFeedbackResponse();
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
        synchronized (SubmitFeedbackResponse.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponseOrBuilder
    public final String getMessageAcknowledgement() {
        return this.messageAcknowledgement_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponseOrBuilder
    public final phc getMessageAcknowledgementBytes() {
        return phc.i(this.messageAcknowledgement_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SubmitFeedbackResponseOrBuilder {
        private Builder() {
            super(SubmitFeedbackResponse.DEFAULT_INSTANCE);
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

        public final Builder clearMessageAcknowledgement() {
            copyOnWrite();
            ((SubmitFeedbackResponse) ((g) this).instance).clearMessageAcknowledgement();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponseOrBuilder
        public final String getMessageAcknowledgement() {
            return ((SubmitFeedbackResponse) ((g) this).instance).getMessageAcknowledgement();
        }

        @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponseOrBuilder
        public final phc getMessageAcknowledgementBytes() {
            return ((SubmitFeedbackResponse) ((g) this).instance).getMessageAcknowledgementBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m76mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setMessageAcknowledgement(String str) {
            copyOnWrite();
            ((SubmitFeedbackResponse) ((g) this).instance).setMessageAcknowledgement(str);
            return this;
        }

        public final Builder setMessageAcknowledgementBytes(phc phcVar) {
            copyOnWrite();
            ((SubmitFeedbackResponse) ((g) this).instance).setMessageAcknowledgementBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m75clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m77mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m74clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m78mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(SubmitFeedbackResponse submitFeedbackResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(submitFeedbackResponse);
    }

    public static SubmitFeedbackResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitFeedbackResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitFeedbackResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SubmitFeedbackResponse parseFrom(phc phcVar) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SubmitFeedbackResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SubmitFeedbackResponse parseFrom(byte[] bArr) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubmitFeedbackResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SubmitFeedbackResponse parseFrom(InputStream inputStream) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitFeedbackResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitFeedbackResponse parseFrom(lwg lwgVar) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SubmitFeedbackResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SubmitFeedbackResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

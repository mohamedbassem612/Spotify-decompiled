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
public final class ReportProblemRequest extends h implements ReportProblemRequestOrBuilder {
    private static final ReportProblemRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROBLEM_DETAIL_FIELD_NUMBER = 4;
    public static final int PROBLEM_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int problem_;
    private String sessionId_ = "";
    private String messageId_ = "";
    private String problemDetail_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ReportProblemRequest$1, reason: invalid class name */
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
        ReportProblemRequest reportProblemRequest = new ReportProblemRequest();
        DEFAULT_INSTANCE = reportProblemRequest;
        h.registerDefaultInstance(ReportProblemRequest.class, reportProblemRequest);
    }

    private ReportProblemRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
    }

    private void clearProblem() {
        this.problem_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProblemDetail() {
        this.problemDetail_ = DEFAULT_INSTANCE.problemDetail_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static ReportProblemRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(ReportProblemRequest reportProblemRequest) {
        reportProblemRequest.problem_ = 0;
    }

    public static ReportProblemRequest parseDelimitedFrom(InputStream inputStream) {
        return (ReportProblemRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReportProblemRequest parseFrom(ByteBuffer byteBuffer) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblem(Problem problem) {
        this.problem_ = problem.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemDetail(String str) {
        str.getClass();
        this.problemDetail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemDetailBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.problemDetail_ = phcVar.v();
    }

    private void setProblemValue(int i) {
        this.problem_ = i;
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

    public static void w(ReportProblemRequest reportProblemRequest, int i) {
        reportProblemRequest.problem_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"sessionId_", "messageId_", "problem_", "problemDetail_"});
        }
        if (iOrdinal == 3) {
            return new ReportProblemRequest();
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
        synchronized (ReportProblemRequest.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final phc getMessageIdBytes() {
        return phc.i(this.messageId_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final Problem getProblem() {
        Problem problemForNumber = Problem.forNumber(this.problem_);
        return problemForNumber == null ? Problem.UNRECOGNIZED : problemForNumber;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final String getProblemDetail() {
        return this.problemDetail_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final phc getProblemDetailBytes() {
        return phc.i(this.problemDetail_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final int getProblemValue() {
        return this.problem_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
    public final phc getSessionIdBytes() {
        return phc.i(this.sessionId_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ReportProblemRequestOrBuilder {
        private Builder() {
            super(ReportProblemRequest.DEFAULT_INSTANCE);
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
            ((ReportProblemRequest) ((g) this).instance).clearMessageId();
            return this;
        }

        public final Builder clearProblem() {
            copyOnWrite();
            ReportProblemRequest.o((ReportProblemRequest) ((g) this).instance);
            return this;
        }

        public final Builder clearProblemDetail() {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).clearProblemDetail();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).clearSessionId();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final String getMessageId() {
            return ((ReportProblemRequest) ((g) this).instance).getMessageId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final phc getMessageIdBytes() {
            return ((ReportProblemRequest) ((g) this).instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final Problem getProblem() {
            return ((ReportProblemRequest) ((g) this).instance).getProblem();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final String getProblemDetail() {
            return ((ReportProblemRequest) ((g) this).instance).getProblemDetail();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final phc getProblemDetailBytes() {
            return ((ReportProblemRequest) ((g) this).instance).getProblemDetailBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final int getProblemValue() {
            return ((ReportProblemRequest) ((g) this).instance).getProblemValue();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final String getSessionId() {
            return ((ReportProblemRequest) ((g) this).instance).getSessionId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ReportProblemRequestOrBuilder
        public final phc getSessionIdBytes() {
            return ((ReportProblemRequest) ((g) this).instance).getSessionIdBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m551mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(phc phcVar) {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).setMessageIdBytes(phcVar);
            return this;
        }

        public final Builder setProblem(Problem problem) {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).setProblem(problem);
            return this;
        }

        public final Builder setProblemDetail(String str) {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).setProblemDetail(str);
            return this;
        }

        public final Builder setProblemDetailBytes(phc phcVar) {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).setProblemDetailBytes(phcVar);
            return this;
        }

        public final Builder setProblemValue(int i) {
            copyOnWrite();
            ReportProblemRequest.w((ReportProblemRequest) ((g) this).instance, i);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(phc phcVar) {
            copyOnWrite();
            ((ReportProblemRequest) ((g) this).instance).setSessionIdBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m550clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m552mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m549clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m553mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ReportProblemRequest reportProblemRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(reportProblemRequest);
    }

    public static ReportProblemRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ReportProblemRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ReportProblemRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ReportProblemRequest parseFrom(phc phcVar) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ReportProblemRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ReportProblemRequest parseFrom(byte[] bArr) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReportProblemRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ReportProblemRequest parseFrom(InputStream inputStream) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReportProblemRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ReportProblemRequest parseFrom(lwg lwgVar) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ReportProblemRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ReportProblemRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

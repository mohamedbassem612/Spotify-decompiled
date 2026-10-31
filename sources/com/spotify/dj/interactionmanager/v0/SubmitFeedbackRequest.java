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
public final class SubmitFeedbackRequest extends h implements SubmitFeedbackRequestOrBuilder {
    private static final SubmitFeedbackRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROBLEM_DETAIL_FIELD_NUMBER = 2;
    public static final int PROBLEM_FIELD_NUMBER = 1;
    private String problemDetail_ = "";
    private int problem_;

    static {
        SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest();
        DEFAULT_INSTANCE = submitFeedbackRequest;
        h.registerDefaultInstance(SubmitFeedbackRequest.class, submitFeedbackRequest);
    }

    private SubmitFeedbackRequest() {
    }

    private void clearProblem() {
        this.problem_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProblemDetail() {
        this.problemDetail_ = DEFAULT_INSTANCE.problemDetail_;
    }

    public static SubmitFeedbackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void n(SubmitFeedbackRequest submitFeedbackRequest) {
        submitFeedbackRequest.problem_ = 0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SubmitFeedbackRequest parseDelimitedFrom(InputStream inputStream) {
        return (SubmitFeedbackRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitFeedbackRequest parseFrom(ByteBuffer byteBuffer) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void s(SubmitFeedbackRequest submitFeedbackRequest, int i) {
        submitFeedbackRequest.problem_ = i;
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

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"problem_", "problemDetail_"});
        }
        if (iOrdinal == 3) {
            return new SubmitFeedbackRequest();
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
        synchronized (SubmitFeedbackRequest.class) {
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
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackRequestOrBuilder
    public final Problem getProblem() {
        Problem problemForNumber = Problem.forNumber(this.problem_);
        return problemForNumber == null ? Problem.UNRECOGNIZED : problemForNumber;
    }

    @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackRequestOrBuilder
    public final String getProblemDetail() {
        return this.problemDetail_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackRequestOrBuilder
    public final phc getProblemDetailBytes() {
        return phc.i(this.problemDetail_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.SubmitFeedbackRequestOrBuilder
    public final int getProblemValue() {
        return this.problem_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(SubmitFeedbackRequest submitFeedbackRequest) {
        return DEFAULT_INSTANCE.createBuilder(submitFeedbackRequest);
    }

    public static SubmitFeedbackRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitFeedbackRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitFeedbackRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SubmitFeedbackRequest parseFrom(phc phcVar) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SubmitFeedbackRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SubmitFeedbackRequest parseFrom(byte[] bArr) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubmitFeedbackRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SubmitFeedbackRequest parseFrom(InputStream inputStream) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitFeedbackRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SubmitFeedbackRequest parseFrom(lwg lwgVar) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SubmitFeedbackRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SubmitFeedbackRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}

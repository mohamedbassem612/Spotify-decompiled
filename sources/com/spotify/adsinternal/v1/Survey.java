package com.spotify.adsinternal.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4d1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Survey extends h implements v2j0 {
    private static final Survey DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SURVEY_QUESTION_ANSWERS_FIELD_NUMBER = 1;
    private h290 surveyQuestionAnswers_ = h.emptyProtobufList();

    static {
        Survey survey = new Survey();
        DEFAULT_INSTANCE = survey;
        h.registerDefaultInstance(Survey.class, survey);
    }

    private Survey() {
    }

    public static r4d1 o() {
        return (r4d1) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"surveyQuestionAnswers_", SurveyQuestionAnswer.class});
        }
        if (iOrdinal == 3) {
            return new Survey();
        }
        if (iOrdinal == 4) {
            return new r4d1(DEFAULT_INSTANCE);
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
        synchronized (Survey.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n(SurveyQuestionAnswer surveyQuestionAnswer) {
        surveyQuestionAnswer.getClass();
        h290 h290VarMutableCopy = this.surveyQuestionAnswers_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.surveyQuestionAnswers_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(surveyQuestionAnswer);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

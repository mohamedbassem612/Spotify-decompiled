package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.p7d1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.usc1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class SurveyQuestion extends h implements v2j0 {
    private static final SurveyQuestion DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_TEXT_FIELD_NUMBER = 3;
    public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
    public static final int SURVEY_QUESTION_OPTIONS_FIELD_NUMBER = 5;
    public static final int SURVEY_QUESTION_TYPE_FIELD_NUMBER = 2;
    private String id_ = "";
    private String primaryText_ = "";
    private String secondaryText_ = "";
    private h290 surveyQuestionOptions_ = h.emptyProtobufList();
    private int surveyQuestionType_;

    static {
        SurveyQuestion surveyQuestion = new SurveyQuestion();
        DEFAULT_INSTANCE = surveyQuestion;
        h.registerDefaultInstance(SurveyQuestion.class, surveyQuestion);
    }

    private SurveyQuestion() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"id_", "surveyQuestionType_", "primaryText_", "secondaryText_", "surveyQuestionOptions_", SurveyQuestionOption.class});
        }
        if (iOrdinal == 3) {
            return new SurveyQuestion();
        }
        if (iOrdinal == 4) {
            return new usc1(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (SurveyQuestion.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String n() {
        return this.primaryText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.secondaryText_;
    }

    public final h290 p() {
        return this.surveyQuestionOptions_;
    }

    public final p7d1 q() {
        p7d1 p7d1Var;
        int i = this.surveyQuestionType_;
        if (i == 0) {
            p7d1Var = p7d1.SURVEY_QUESTION_TYPE_UNKNOWN;
        } else if (i != 1) {
            p7d1Var = i != 2 ? null : p7d1.MULTI_SELECT;
        } else {
            p7d1Var = p7d1.SINGLE_SELECT;
        }
        return p7d1Var == null ? p7d1.UNRECOGNIZED : p7d1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

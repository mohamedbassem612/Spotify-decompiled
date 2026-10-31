package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.usc1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class Survey extends h implements v2j0 {
    private static final Survey DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SURVEY_QUESTIONS_FIELD_NUMBER = 1;
    public static final int SURVEY_TRANSPARENCY_CONTENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 surveyQuestions_ = h.emptyProtobufList();
    private SurveyTransparencyContent surveyTransparencyContent_;

    static {
        Survey survey = new Survey();
        DEFAULT_INSTANCE = survey;
        h.registerDefaultInstance(Survey.class, survey);
    }

    private Survey() {
    }

    public static Survey n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "surveyQuestions_", SurveyQuestion.class, "surveyTransparencyContent_"});
        }
        if (iOrdinal == 3) {
            return new Survey();
        }
        if (iOrdinal == 4) {
            return new usc1(DEFAULT_INSTANCE, (byte) 9);
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.surveyQuestions_;
    }

    public final SurveyTransparencyContent p() {
        SurveyTransparencyContent surveyTransparencyContent = this.surveyTransparencyContent_;
        return surveyTransparencyContent == null ? SurveyTransparencyContent.n() : surveyTransparencyContent;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

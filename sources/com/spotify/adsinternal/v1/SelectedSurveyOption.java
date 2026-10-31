package com.spotify.adsinternal.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ew51;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class SelectedSurveyOption extends h implements v2j0 {
    private static final SelectedSurveyOption DEFAULT_INSTANCE;
    public static final int OPTION_POSITION_INDEX_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SELECTED_SURVEY_QUESTION_OPTION_ID_FIELD_NUMBER = 1;
    private long optionPositionIndex_;
    private String selectedSurveyQuestionOptionId_ = "";

    static {
        SelectedSurveyOption selectedSurveyOption = new SelectedSurveyOption();
        DEFAULT_INSTANCE = selectedSurveyOption;
        h.registerDefaultInstance(SelectedSurveyOption.class, selectedSurveyOption);
    }

    private SelectedSurveyOption() {
    }

    public static ew51 n() {
        return (ew51) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"selectedSurveyQuestionOptionId_", "optionPositionIndex_"});
        }
        if (iOrdinal == 3) {
            return new SelectedSurveyOption();
        }
        if (iOrdinal == 4) {
            return new ew51(DEFAULT_INSTANCE);
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
        synchronized (SelectedSurveyOption.class) {
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

    public final void o(long j) {
        this.optionPositionIndex_ = j;
    }

    public final void p(String str) {
        this.selectedSurveyQuestionOptionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

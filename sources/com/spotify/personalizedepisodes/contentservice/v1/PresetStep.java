package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PresetStep extends h implements v2j0 {
    private static final PresetStep DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int LOCATION_STEP_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_STEP_FIELD_NUMBER = 6;
    public static final int RECOMMENDED_TOOLS_STEP_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TOPICS_STEP_FIELD_NUMBER = 4;
    public static final int VISIBLE_IF_ANY_ANSWER_SELECTED_FIELD_NUMBER = 7;
    private Object step_;
    private int stepCase_ = 0;
    private String title_ = "";
    private String description_ = "";
    private h290 visibleIfAnyAnswerSelected_ = h.emptyProtobufList();

    static {
        PresetStep presetStep = new PresetStep();
        DEFAULT_INSTANCE = presetStep;
        h.registerDefaultInstance(PresetStep.class, presetStep);
    }

    private PresetStep() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ț", new Object[]{"step_", "stepCase_", "title_", "description_", LocationStep.class, TopicsStep.class, RecommendedToolsStep.class, QuestionStep.class, "visibleIfAnyAnswerSelected_"});
        }
        if (iOrdinal == 3) {
            return new PresetStep();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (PresetStep.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final QuestionStep n() {
        return this.stepCase_ == 6 ? (QuestionStep) this.step_ : QuestionStep.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RecommendedToolsStep o() {
        return this.stepCase_ == 5 ? (RecommendedToolsStep) this.step_ : RecommendedToolsStep.n();
    }

    public final int p() {
        int i = this.stepCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    public final TopicsStep q() {
        return this.stepCase_ == 4 ? (TopicsStep) this.step_ : TopicsStep.o();
    }

    public final h290 r() {
        return this.visibleIfAnyAnswerSelected_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

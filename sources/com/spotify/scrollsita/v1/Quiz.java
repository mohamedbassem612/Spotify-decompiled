package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nhz0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Quiz extends h implements v2j0 {
    public static final int CALL_TO_ACTION_TEXT_FIELD_NUMBER = 8;
    public static final int CONTENT_VARIANT_FIELD_NUMBER = 10;
    private static final Quiz DEFAULT_INSTANCE;
    public static final int ENTITY_WITH_OVERLAY_FIELD_NUMBER = 6;
    public static final int INFO_TEXT_FIELD_NUMBER = 9;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 1;
    public static final int SINGLE_ENTITY_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TWO_ENTITY_FIELD_NUMBER = 5;
    private int bitField0_;
    private int contentVariant_;
    private QuizInfoText infoText_;
    private Object quizCardVariant_;
    private int quizCardVariantCase_ = 0;
    private String quizUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String logoImageUrl_ = "";
    private String callToActionText_ = "";

    static {
        Quiz quiz = new Quiz();
        DEFAULT_INSTANCE = quiz;
        h.registerDefaultInstance(Quiz.class, quiz);
    }

    private Quiz() {
    }

    public static Quiz p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ\bȈ\tဉ\u0000\n\f", new Object[]{"quizCardVariant_", "quizCardVariantCase_", "bitField0_", "quizUri_", "title_", "subtitle_", QuizSingleEntity.class, QuizTwoEntity.class, QuizEntityWithOverlay.class, "logoImageUrl_", "callToActionText_", "infoText_", "contentVariant_"});
        }
        if (iOrdinal == 3) {
            return new Quiz();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (Quiz.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.callToActionText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final nhz0 o() {
        nhz0 nhz0Var;
        int i = this.contentVariant_;
        if (i == 0) {
            nhz0Var = nhz0.QUIZ_CONTENT_VARIANT_UNSPECIFIED;
        } else if (i == 1) {
            nhz0Var = nhz0.QUIZ_CONTENT_VARIANT_PLAY_QUIZ;
        } else if (i != 2) {
            nhz0Var = i != 3 ? null : nhz0.QUIZ_CONTENT_VARIANT_CHALLENGE_FRIEND;
        } else {
            nhz0Var = nhz0.QUIZ_CONTENT_VARIANT_SCORE_SHARE;
        }
        return nhz0Var == null ? nhz0.UNRECOGNIZED : nhz0Var;
    }

    public final QuizEntityWithOverlay q() {
        return this.quizCardVariantCase_ == 6 ? (QuizEntityWithOverlay) this.quizCardVariant_ : QuizEntityWithOverlay.o();
    }

    public final QuizInfoText r() {
        QuizInfoText quizInfoText = this.infoText_;
        return quizInfoText == null ? QuizInfoText.n() : quizInfoText;
    }

    public final String s() {
        return this.logoImageUrl_;
    }

    public final String t() {
        return this.quizUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final QuizSingleEntity u() {
        return this.quizCardVariantCase_ == 4 ? (QuizSingleEntity) this.quizCardVariant_ : QuizSingleEntity.n();
    }

    public final QuizTwoEntity v() {
        return this.quizCardVariantCase_ == 5 ? (QuizTwoEntity) this.quizCardVariant_ : QuizTwoEntity.o();
    }

    public final boolean w() {
        return this.quizCardVariantCase_ == 6;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean y() {
        return this.quizCardVariantCase_ == 4;
    }

    public final boolean z() {
        return this.quizCardVariantCase_ == 5;
    }
}

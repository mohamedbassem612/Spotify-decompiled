package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$BespokeListeningAgeContent$Card2 extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 7;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 5;
    private static final SceneTemplate$BespokeListeningAgeContent$Card2 DEFAULT_INSTANCE;
    public static final int LISTENING_AGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_FLOW_FIELD_NUMBER = 1;
    public static final int RESULT_SUBTITLE_FIELD_NUMBER = 4;
    public static final int RESULT_TITLE_FIELD_NUMBER = 2;
    public static final int REVEAL_AGE_ACCESSIBILITY_LABEL_FIELD_NUMBER = 8;
    public static final int REVEAL_NUMBER_ANIMATION_FIELD_NUMBER = 6;
    private AudioPreview audioPreview_;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private int listeningAge_;
    private QuizFlow quizFlow_;
    private Paragraph resultSubtitle_;
    private Paragraph resultTitle_;
    private String revealAgeAccessibilityLabel_ = "";
    private RiveAnimation revealNumberAnimation_;

    public static final class QuizButton extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
        private static final QuizButton DEFAULT_INSTANCE;
        public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 5;
        public static final int LABEL_FIELD_NUMBER = 1;
        public static final int OUTLINE_COLOR_FIELD_NUMBER = 3;
        public static final int OUTLINE_WIDTH_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int SELECTED_BACKGROUND_COLOR_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean hasHapticFeedback_;
        private Paragraph label_;
        private int outlineWidth_;
        private String backgroundColor_ = "";
        private String outlineColor_ = "";
        private String selectedBackgroundColor_ = "";

        static {
            QuizButton quizButton = new QuizButton();
            DEFAULT_INSTANCE = quizButton;
            com.google.protobuf.h.registerDefaultInstance(QuizButton.class, quizButton);
        }

        private QuizButton() {
        }

        public static QuizButton o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0007\u0006Ȉ", new Object[]{"bitField0_", "label_", "backgroundColor_", "outlineColor_", "outlineWidth_", "hasHapticFeedback_", "selectedBackgroundColor_"});
            }
            if (iOrdinal == 3) {
                return new QuizButton();
            }
            if (iOrdinal == 4) {
                return new t0(DEFAULT_INSTANCE);
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
            synchronized (QuizButton.class) {
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

        public final String n() {
            return this.backgroundColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final boolean p() {
            return this.hasHapticFeedback_;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.label_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final String r() {
            return this.outlineColor_;
        }

        public final String s() {
            return this.selectedBackgroundColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class QuizFlow extends com.google.protobuf.h implements v2j0 {
        private static final QuizFlow DEFAULT_INSTANCE;
        public static final int FEEDBACK_CORRECT_FIELD_NUMBER = 7;
        public static final int FEEDBACK_WRONG_FIELD_NUMBER = 8;
        public static final int LAST_YEAR_LISTENING_AGE_FIELD_NUMBER = 2;
        public static final int OLDER_QUIZ_BUTTON_FIELD_NUMBER = 12;
        private static volatile qzr0 PARSER = null;
        public static final int QUIZ_NUMBER_ANIMATION_FIELD_NUMBER = 9;
        public static final int QUIZ_PROMPT_FIELD_NUMBER = 3;
        public static final int QUIZ_TITLE_FIELD_NUMBER = 1;
        public static final int SAME_AGE_QUIZ_BUTTON_FIELD_NUMBER = 11;
        public static final int YOUNGER_QUIZ_BUTTON_FIELD_NUMBER = 10;
        private int bitField0_;
        private Paragraph feedbackCorrect_;
        private Paragraph feedbackWrong_;
        private int lastYearListeningAge_;
        private QuizButton olderQuizButton_;
        private RiveAnimation quizNumberAnimation_;
        private Paragraph quizPrompt_;
        private Paragraph quizTitle_;
        private QuizButton sameAgeQuizButton_;
        private QuizButton youngerQuizButton_;

        static {
            QuizFlow quizFlow = new QuizFlow();
            DEFAULT_INSTANCE = quizFlow;
            com.google.protobuf.h.registerDefaultInstance(QuizFlow.class, quizFlow);
        }

        private QuizFlow() {
        }

        public static QuizFlow n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fဉ\u0007", new Object[]{"bitField0_", "quizTitle_", "lastYearListeningAge_", "quizPrompt_", "feedbackCorrect_", "feedbackWrong_", "quizNumberAnimation_", "youngerQuizButton_", "sameAgeQuizButton_", "olderQuizButton_"});
            }
            if (iOrdinal == 3) {
                return new QuizFlow();
            }
            if (iOrdinal == 4) {
                return new u0(DEFAULT_INSTANCE);
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
            synchronized (QuizFlow.class) {
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

        public final Paragraph o() {
            Paragraph paragraph = this.feedbackCorrect_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.feedbackWrong_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final int q() {
            return this.lastYearListeningAge_;
        }

        public final QuizButton r() {
            QuizButton quizButton = this.olderQuizButton_;
            return quizButton == null ? QuizButton.o() : quizButton;
        }

        public final RiveAnimation s() {
            RiveAnimation riveAnimation = this.quizNumberAnimation_;
            return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
        }

        public final Paragraph t() {
            Paragraph paragraph = this.quizPrompt_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Paragraph u() {
            Paragraph paragraph = this.quizTitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final QuizButton v() {
            QuizButton quizButton = this.sameAgeQuizButton_;
            return quizButton == null ? QuizButton.o() : quizButton;
        }

        public final QuizButton w() {
            QuizButton quizButton = this.youngerQuizButton_;
            return quizButton == null ? QuizButton.o() : quizButton;
        }
    }

    static {
        SceneTemplate$BespokeListeningAgeContent$Card2 sceneTemplate$BespokeListeningAgeContent$Card2 = new SceneTemplate$BespokeListeningAgeContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$BespokeListeningAgeContent$Card2;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$BespokeListeningAgeContent$Card2.class, sceneTemplate$BespokeListeningAgeContent$Card2);
    }

    private SceneTemplate$BespokeListeningAgeContent$Card2() {
    }

    public static SceneTemplate$BespokeListeningAgeContent$Card2 p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0004\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bȈ", new Object[]{"bitField0_", "quizFlow_", "resultTitle_", "listeningAge_", "resultSubtitle_", "backgroundAnimation_", "revealNumberAnimation_", "audioPreview_", "revealAgeAccessibilityLabel_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$BespokeListeningAgeContent$Card2();
        }
        if (iOrdinal == 4) {
            return new s0(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$BespokeListeningAgeContent$Card2.class) {
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

    public final AudioPreview n() {
        AudioPreview audioPreview = this.audioPreview_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation o() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final int q() {
        return this.listeningAge_;
    }

    public final QuizFlow r() {
        QuizFlow quizFlow = this.quizFlow_;
        return quizFlow == null ? QuizFlow.n() : quizFlow;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.resultSubtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph t() {
        Paragraph paragraph = this.resultTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.revealAgeAccessibilityLabel_;
    }

    public final RiveAnimation v() {
        RiveAnimation riveAnimation = this.revealNumberAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final boolean w() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }
}

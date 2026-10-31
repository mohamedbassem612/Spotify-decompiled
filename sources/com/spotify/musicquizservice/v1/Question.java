package com.spotify.musicquizservice.v1;

import com.google.protobuf.Duration;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Question extends com.google.protobuf.h implements v2j0 {
    public static final int ANSWER_EXPLANATION_FIELD_NUMBER = 8;
    private static final Question DEFAULT_INSTANCE;
    public static final int HINT_TEXT_FIELD_NUMBER = 7;
    public static final int IMAGE_QUESTION_FIELD_NUMBER = 4;
    public static final int MULTIPLE_CHOICE_FIELD_NUMBER = 5;
    public static final int MUSIC_IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRETITLE_FIELD_NUMBER = 9;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    public static final int QUESTION_URI_FIELD_NUMBER = 11;
    public static final int QUOTATION_FIELD_NUMBER = 10;
    public static final int TEXT_QUESTION_FIELD_NUMBER = 3;
    public static final int TIME_LIMIT_FIELD_NUMBER = 6;
    private AnswerExplanation answerExplanation_;
    private Object answerType_;
    private int bitField0_;
    private Object questionType_;
    private Duration timeLimit_;
    private int questionTypeCase_ = 0;
    private int answerTypeCase_ = 0;
    private String questionId_ = "";
    private String questionUri_ = "";
    private String hintText_ = "";
    private String pretitle_ = "";

    static {
        Question question = new Question();
        DEFAULT_INSTANCE = question;
        com.google.protobuf.h.registerDefaultInstance(Question.class, question);
    }

    private Question() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final boolean A() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean B() {
        return (this.bitField0_ & 8) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0002\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0001\u0006ဉ\u0000\u0007ለ\u0001\bဉ\u0002\tለ\u0003\n<\u0000\u000bȈ", new Object[]{"questionType_", "questionTypeCase_", "answerType_", "answerTypeCase_", "bitField0_", "questionId_", MusicIdentifierQuestion.class, TextQuestion.class, ImageQuestion.class, MultipleChoiceAnswer.class, "timeLimit_", "hintText_", "answerExplanation_", "pretitle_", QuotationQuestion.class, "questionUri_"});
        }
        if (iOrdinal == 3) {
            return new Question();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (Question.class) {
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

    public final AnswerExplanation n() {
        AnswerExplanation answerExplanation = this.answerExplanation_;
        return answerExplanation == null ? AnswerExplanation.p() : answerExplanation;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.answerTypeCase_;
        if (i != 0) {
            return i != 5 ? 0 : 1;
        }
        return 2;
    }

    public final String p() {
        return this.hintText_;
    }

    public final ImageQuestion q() {
        return this.questionTypeCase_ == 4 ? (ImageQuestion) this.questionType_ : ImageQuestion.n();
    }

    public final MultipleChoiceAnswer r() {
        return this.answerTypeCase_ == 5 ? (MultipleChoiceAnswer) this.answerType_ : MultipleChoiceAnswer.o();
    }

    public final MusicIdentifierQuestion s() {
        return this.questionTypeCase_ == 2 ? (MusicIdentifierQuestion) this.questionType_ : MusicIdentifierQuestion.p();
    }

    public final String t() {
        return this.pretitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.questionId_;
    }

    public final int v() {
        int i = this.questionTypeCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 10) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public final String w() {
        return this.questionUri_;
    }

    public final QuotationQuestion x() {
        return this.questionTypeCase_ == 10 ? (QuotationQuestion) this.questionType_ : QuotationQuestion.n();
    }

    public final TextQuestion y() {
        return this.questionTypeCase_ == 3 ? (TextQuestion) this.questionType_ : TextQuestion.n();
    }

    public final Duration z() {
        Duration duration = this.timeLimit_;
        return duration == null ? Duration.n() : duration;
    }
}

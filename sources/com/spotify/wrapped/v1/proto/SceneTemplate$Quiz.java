package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$Quiz extends com.google.protobuf.h implements v2j0 {
    public static final int CORRECT_ANSWER_AUDIO_OVERRIDE_FIELD_NUMBER = 10;
    public static final int CORRECT_ANSWER_FIELD_NUMBER = 7;
    public static final int CORRECT_ANSWER_HEADER_FIELD_NUMBER = 2;
    private static final SceneTemplate$Quiz DEFAULT_INSTANCE;
    public static final int DEFAULT_ITEM_BACKGROUND_FIELD_NUMBER = 6;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 9;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int INCORRECT_ANSWER_FIELD_NUMBER = 8;
    public static final int INCORRECT_ANSWER_HEADER_FIELD_NUMBER = 3;
    public static final int LIST_ITEMS_FIELD_NUMBER = 4;
    public static final int NO_ANSWER_AUDIO_OVERRIDE_FIELD_NUMBER = 11;
    public static final int OUTLINE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private AudioPreview correctAnswerAudioOverride_;
    private Paragraph correctAnswerHeader_;
    private AnswerDecoration correctAnswer_;
    private boolean hasHapticFeedback_;
    private Paragraph header_;
    private Paragraph incorrectAnswerHeader_;
    private AnswerDecoration incorrectAnswer_;
    private AudioPreview noAnswerAudioOverride_;
    private Outline outline_;
    private h290 listItems_ = com.google.protobuf.h.emptyProtobufList();
    private String defaultItemBackground_ = "";

    public static final class AnswerDecoration extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
        public static final int CHECKMARK_COLOR_FIELD_NUMBER = 2;
        private static final AnswerDecoration DEFAULT_INSTANCE;
        public static final int OUTLINE_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private Outline outline_;
        private String backgroundColor_ = "";
        private String checkmarkColor_ = "";

        static {
            AnswerDecoration answerDecoration = new AnswerDecoration();
            DEFAULT_INSTANCE = answerDecoration;
            com.google.protobuf.h.registerDefaultInstance(AnswerDecoration.class, answerDecoration);
        }

        private AnswerDecoration() {
        }

        public static AnswerDecoration p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "backgroundColor_", "checkmarkColor_", "outline_"});
            }
            if (iOrdinal == 3) {
                return new AnswerDecoration();
            }
            if (iOrdinal == 4) {
                return new d1(DEFAULT_INSTANCE);
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
            synchronized (AnswerDecoration.class) {
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

        public final String o() {
            return this.checkmarkColor_;
        }

        public final Outline q() {
            Outline outline = this.outline_;
            return outline == null ? Outline.o() : outline;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Item extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_ACTION_FIELD_NUMBER = 9;
        public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 8;
        public static final int ANSWERED_SUBTITLE_FIELD_NUMBER = 6;
        public static final int ANSWERED_TITLE_FIELD_NUMBER = 5;
        public static final int CORRECT_FIELD_NUMBER = 7;
        private static final Item DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int URI_FIELD_NUMBER = 1;
        private Paragraph answeredSubtitle_;
        private Paragraph answeredTitle_;
        private int bitField0_;
        private boolean correct_;
        private Image image_;
        private Paragraph subtitle_;
        private Paragraph title_;
        private String uri_ = "";
        private String accessibilityDescription_ = "";
        private String accessibilityAction_ = "";

        static {
            Item item = new Item();
            DEFAULT_INSTANCE = item;
            com.google.protobuf.h.registerDefaultInstance(Item.class, item);
        }

        private Item() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u0007\bȈ\tȈ", new Object[]{"bitField0_", "uri_", "image_", "title_", "subtitle_", "answeredTitle_", "answeredSubtitle_", "correct_", "accessibilityDescription_", "accessibilityAction_"});
            }
            if (iOrdinal == 3) {
                return new Item();
            }
            if (iOrdinal == 4) {
                return new f1(DEFAULT_INSTANCE);
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
            synchronized (Item.class) {
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

        public final String getUri() {
            return this.uri_;
        }

        public final String n() {
            return this.accessibilityAction_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.accessibilityDescription_;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.answeredSubtitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.answeredTitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean r() {
            return this.correct_;
        }

        public final Image s() {
            Image image = this.image_;
            return image == null ? Image.o() : image;
        }

        public final Paragraph t() {
            Paragraph paragraph = this.subtitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Paragraph u() {
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }
    }

    static {
        SceneTemplate$Quiz sceneTemplate$Quiz = new SceneTemplate$Quiz();
        DEFAULT_INSTANCE = sceneTemplate$Quiz;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$Quiz.class, sceneTemplate$Quiz);
    }

    private SceneTemplate$Quiz() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SceneTemplate$Quiz q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006Ȉ\u0007ဉ\u0004\bဉ\u0005\t\u0007\nဉ\u0006\u000bဉ\u0007", new Object[]{"bitField0_", "header_", "correctAnswerHeader_", "incorrectAnswerHeader_", "listItems_", Item.class, "outline_", "defaultItemBackground_", "correctAnswer_", "incorrectAnswer_", "hasHapticFeedback_", "correctAnswerAudioOverride_", "noAnswerAudioOverride_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$Quiz();
        }
        if (iOrdinal == 4) {
            return new e1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$Quiz.class) {
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

    public final AnswerDecoration n() {
        AnswerDecoration answerDecoration = this.correctAnswer_;
        return answerDecoration == null ? AnswerDecoration.p() : answerDecoration;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AudioPreview o() {
        AudioPreview audioPreview = this.correctAnswerAudioOverride_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.correctAnswerHeader_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final String r() {
        return this.defaultItemBackground_;
    }

    public final boolean s() {
        return this.hasHapticFeedback_;
    }

    public final Paragraph t() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final AnswerDecoration u() {
        AnswerDecoration answerDecoration = this.incorrectAnswer_;
        return answerDecoration == null ? AnswerDecoration.p() : answerDecoration;
    }

    public final Paragraph v() {
        Paragraph paragraph = this.incorrectAnswerHeader_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final h290 w() {
        return this.listItems_;
    }

    public final AudioPreview x() {
        AudioPreview audioPreview = this.noAnswerAudioOverride_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final Outline y() {
        Outline outline = this.outline_;
        return outline == null ? Outline.o() : outline;
    }
}

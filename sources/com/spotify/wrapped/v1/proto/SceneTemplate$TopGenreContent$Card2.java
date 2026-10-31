package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopGenreContent$Card2 extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 4;
    private static final SceneTemplate$TopGenreContent$Card2 DEFAULT_INSTANCE;
    public static final int GENRES_FIELD_NUMBER = 3;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SELECTED_COLOR_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private RiveAnimation background_;
    private int bitField0_;
    private boolean hasHapticFeedback_;
    private Paragraph subtitle_;
    private Paragraph title_;
    private h290 genres_ = com.google.protobuf.h.emptyProtobufList();
    private String selectedColor_ = "";

    public static final class GenreRow extends com.google.protobuf.h implements v2j0 {
        public static final int ACCENT_COLOR_FIELD_NUMBER = 5;
        public static final int AUDIO_PREVIEWS_FIELD_NUMBER = 3;
        private static final GenreRow DEFAULT_INSTANCE;
        public static final int GENRE_NAME_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int RANK_LABEL_FIELD_NUMBER = 1;
        public static final int RETUNE_ACCESSIBILITY_LABEL_FIELD_NUMBER = 6;
        public static final int RETUNE_TEXT_FIELD_NUMBER = 4;
        private int bitField0_;
        private Paragraph genreName_;
        private Paragraph rankLabel_;
        private Paragraph retuneText_;
        private h290 audioPreviews_ = com.google.protobuf.h.emptyProtobufList();
        private String accentColor_ = "";
        private String retuneAccessibilityLabel_ = "";

        static {
            GenreRow genreRow = new GenreRow();
            DEFAULT_INSTANCE = genreRow;
            com.google.protobuf.h.registerDefaultInstance(GenreRow.class, genreRow);
        }

        private GenreRow() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "rankLabel_", "genreName_", "audioPreviews_", AudioPreview.class, "retuneText_", "accentColor_", "retuneAccessibilityLabel_"});
            }
            if (iOrdinal == 3) {
                return new GenreRow();
            }
            if (iOrdinal == 4) {
                return new e2(DEFAULT_INSTANCE);
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
            synchronized (GenreRow.class) {
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
            return this.accentColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.audioPreviews_;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.genreName_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.rankLabel_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final String r() {
            return this.retuneAccessibilityLabel_;
        }

        public final Paragraph s() {
            Paragraph paragraph = this.retuneText_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean t() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$TopGenreContent$Card2 sceneTemplate$TopGenreContent$Card2 = new SceneTemplate$TopGenreContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$TopGenreContent$Card2;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopGenreContent$Card2.class, sceneTemplate$TopGenreContent$Card2);
    }

    private SceneTemplate$TopGenreContent$Card2() {
    }

    public static SceneTemplate$TopGenreContent$Card2 o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005Ȉ\u0006\u0007", new Object[]{"bitField0_", "title_", "subtitle_", "genres_", GenreRow.class, "background_", "selectedColor_", "hasHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopGenreContent$Card2();
        }
        if (iOrdinal == 4) {
            return new d2(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TopGenreContent$Card2.class) {
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

    public final RiveAnimation n() {
        RiveAnimation riveAnimation = this.background_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.genres_;
    }

    public final boolean q() {
        return this.hasHapticFeedback_;
    }

    public final String r() {
        return this.selectedColor_;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

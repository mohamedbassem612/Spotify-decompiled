package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopAlbumsContent$Carousel extends com.google.protobuf.h implements v2j0 {
    public static final int ALBUMS_FIELD_NUMBER = 1;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 2;
    private static final SceneTemplate$TopAlbumsContent$Carousel DEFAULT_INSTANCE;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 5;
    public static final int NEXT_ALBUM_ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SWIPE_HINT_FIELD_NUMBER = 4;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private boolean hasHapticFeedback_;
    private SwipeHint swipeHint_;
    private h290 albums_ = com.google.protobuf.h.emptyProtobufList();
    private String nextAlbumAccessibilityText_ = "";

    public static final class RankedAlbum extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 9;
        public static final int ALBUM_IMAGE_FIELD_NUMBER = 4;
        public static final int ALBUM_NAME_FIELD_NUMBER = 2;
        public static final int ALBUM_TYPE_FIELD_NUMBER = 10;
        public static final int ARTIST_NAME_FIELD_NUMBER = 3;
        public static final int ASSOCIATED_DATA_POINT_FIELD_NUMBER = 5;
        public static final int AUDIO_PREVIEW_FIELD_NUMBER = 6;
        private static final RankedAlbum DEFAULT_INSTANCE;
        public static final int HIGHLIGHT_FIELD_NUMBER = 1;
        public static final int IS_SHAREABLE_FIELD_NUMBER = 7;
        private static volatile qzr0 PARSER;
        private String accessibilityText_ = "";
        private Image albumImage_;
        private Paragraph albumName_;
        private int albumType_;
        private Paragraph artistName_;
        private Paragraph associatedDataPoint_;
        private AudioPreview audioPreview_;
        private int bitField0_;
        private Paragraph highlight_;
        private boolean isShareable_;

        static {
            RankedAlbum rankedAlbum = new RankedAlbum();
            DEFAULT_INSTANCE = rankedAlbum;
            com.google.protobuf.h.registerDefaultInstance(RankedAlbum.class, rankedAlbum);
        }

        private RankedAlbum() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u0007\tለ\u0006\n\f", new Object[]{"bitField0_", "highlight_", "albumName_", "artistName_", "albumImage_", "associatedDataPoint_", "audioPreview_", "isShareable_", "accessibilityText_", "albumType_"});
            }
            if (iOrdinal == 3) {
                return new RankedAlbum();
            }
            if (iOrdinal == 4) {
                return new r1(DEFAULT_INSTANCE);
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
            synchronized (RankedAlbum.class) {
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
            return this.accessibilityText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Image o() {
            Image image = this.albumImage_;
            return image == null ? Image.o() : image;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.albumName_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final q1 q() {
            q1 q1Var;
            switch (this.albumType_) {
                case 0:
                    q1Var = q1.ALBUM_TYPE_UNSPECIFIED;
                    break;
                case 1:
                    q1Var = q1.RANK_1;
                    break;
                case 2:
                    q1Var = q1.RANK_2;
                    break;
                case 3:
                    q1Var = q1.RANK_3;
                    break;
                case 4:
                    q1Var = q1.RANK_4;
                    break;
                case 5:
                    q1Var = q1.RANK_5;
                    break;
                case 6:
                    q1Var = q1.HONORABLE_MENTION;
                    break;
                case 7:
                    q1Var = q1.BRAND;
                    break;
                default:
                    q1Var = null;
                    break;
            }
            return q1Var == null ? q1.UNRECOGNIZED : q1Var;
        }

        public final Paragraph r() {
            Paragraph paragraph = this.artistName_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph s() {
            Paragraph paragraph = this.associatedDataPoint_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final AudioPreview t() {
            AudioPreview audioPreview = this.audioPreview_;
            return audioPreview == null ? AudioPreview.p() : audioPreview;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Paragraph u() {
            Paragraph paragraph = this.highlight_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean v() {
            return this.isShareable_;
        }

        public final boolean w() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean x() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean y() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public static final class SwipeHint extends com.google.protobuf.h implements v2j0 {
        private static final SwipeHint DEFAULT_INSTANCE;
        public static final int LEADING_ICON_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int TRAILING_ICON_FIELD_NUMBER = 3;
        private int bitField0_;
        private IconConfiguration leadingIcon_;
        private Paragraph text_;
        private IconConfiguration trailingIcon_;

        public static final class IconConfiguration extends com.google.protobuf.h implements v2j0 {
            public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
            private static final IconConfiguration DEFAULT_INSTANCE;
            public static final int ICON_COLOR_FIELD_NUMBER = 2;
            public static final int ICON_FIELD_NUMBER = 1;
            public static final int OUTLINE_FIELD_NUMBER = 4;
            private static volatile qzr0 PARSER;
            private int bitField0_;
            private Outline outline_;
            private String icon_ = "";
            private String iconColor_ = "";
            private String backgroundColor_ = "";

            static {
                IconConfiguration iconConfiguration = new IconConfiguration();
                DEFAULT_INSTANCE = iconConfiguration;
                com.google.protobuf.h.registerDefaultInstance(IconConfiguration.class, iconConfiguration);
            }

            private IconConfiguration() {
            }

            public static IconConfiguration n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "icon_", "iconColor_", "backgroundColor_", "outline_"});
                }
                if (iOrdinal == 3) {
                    return new IconConfiguration();
                }
                if (iOrdinal == 4) {
                    return new t1(DEFAULT_INSTANCE);
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
                synchronized (IconConfiguration.class) {
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

            public final String o() {
                return this.icon_;
            }

            public final String p() {
                return this.iconColor_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            SwipeHint swipeHint = new SwipeHint();
            DEFAULT_INSTANCE = swipeHint;
            com.google.protobuf.h.registerDefaultInstance(SwipeHint.class, swipeHint);
        }

        private SwipeHint() {
        }

        public static SwipeHint n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "leadingIcon_", "text_", "trailingIcon_"});
            }
            if (iOrdinal == 3) {
                return new SwipeHint();
            }
            if (iOrdinal == 4) {
                return new s1(DEFAULT_INSTANCE);
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
            synchronized (SwipeHint.class) {
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

        public final IconConfiguration o() {
            IconConfiguration iconConfiguration = this.leadingIcon_;
            return iconConfiguration == null ? IconConfiguration.n() : iconConfiguration;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.text_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final IconConfiguration q() {
            IconConfiguration iconConfiguration = this.trailingIcon_;
            return iconConfiguration == null ? IconConfiguration.n() : iconConfiguration;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$TopAlbumsContent$Carousel sceneTemplate$TopAlbumsContent$Carousel = new SceneTemplate$TopAlbumsContent$Carousel();
        DEFAULT_INSTANCE = sceneTemplate$TopAlbumsContent$Carousel;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopAlbumsContent$Carousel.class, sceneTemplate$TopAlbumsContent$Carousel);
    }

    private SceneTemplate$TopAlbumsContent$Carousel() {
    }

    public static SceneTemplate$TopAlbumsContent$Carousel p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005\u0007", new Object[]{"bitField0_", "albums_", RankedAlbum.class, "backgroundAnimation_", "nextAlbumAccessibilityText_", "swipeHint_", "hasHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopAlbumsContent$Carousel();
        }
        if (iOrdinal == 4) {
            return new p1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TopAlbumsContent$Carousel.class) {
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

    public final h290 n() {
        return this.albums_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation o() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final boolean q() {
        return this.hasHapticFeedback_;
    }

    public final String r() {
        return this.nextAlbumAccessibilityText_;
    }

    public final SwipeHint s() {
        SwipeHint swipeHint = this.swipeHint_;
        return swipeHint == null ? SwipeHint.n() : swipeHint;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

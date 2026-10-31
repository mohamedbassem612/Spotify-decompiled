package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopAlbumsContent$List extends com.google.protobuf.h implements v2j0 {
    public static final int ALBUMS_FIELD_NUMBER = 2;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 4;
    private static final SceneTemplate$TopAlbumsContent$List DEFAULT_INSTANCE;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private h290 albums_ = com.google.protobuf.h.emptyProtobufList();
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private boolean hasHapticFeedback_;
    private Paragraph title_;

    public static final class RankedAlbumSummary extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_ACTION_FIELD_NUMBER = 5;
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
        public static final int ALBUM_IMAGE_FIELD_NUMBER = 6;
        public static final int ALBUM_NAME_FIELD_NUMBER = 2;
        public static final int ARTIST_NAME_FIELD_NUMBER = 3;
        public static final int AUDIO_PREVIEW_FIELD_NUMBER = 7;
        private static final RankedAlbumSummary DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int RANK_FIELD_NUMBER = 1;
        private Image albumImage_;
        private Paragraph albumName_;
        private Paragraph artistName_;
        private AudioPreview audioPreview_;
        private int bitField0_;
        private Paragraph rank_;
        private String accessibilityText_ = "";
        private String accessibilityAction_ = "";

        static {
            RankedAlbumSummary rankedAlbumSummary = new RankedAlbumSummary();
            DEFAULT_INSTANCE = rankedAlbumSummary;
            com.google.protobuf.h.registerDefaultInstance(RankedAlbumSummary.class, rankedAlbumSummary);
        }

        private RankedAlbumSummary() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005Ȉ\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "rank_", "albumName_", "artistName_", "accessibilityText_", "accessibilityAction_", "albumImage_", "audioPreview_"});
            }
            if (iOrdinal == 3) {
                return new RankedAlbumSummary();
            }
            if (iOrdinal == 4) {
                return new v1(DEFAULT_INSTANCE);
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
            synchronized (RankedAlbumSummary.class) {
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
            return this.accessibilityAction_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.accessibilityText_;
        }

        public final Image p() {
            Image image = this.albumImage_;
            return image == null ? Image.o() : image;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.albumName_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph r() {
            Paragraph paragraph = this.artistName_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final AudioPreview s() {
            AudioPreview audioPreview = this.audioPreview_;
            return audioPreview == null ? AudioPreview.p() : audioPreview;
        }

        public final Paragraph t() {
            Paragraph paragraph = this.rank_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final boolean u() {
            return (this.bitField0_ & 16) != 0;
        }
    }

    static {
        SceneTemplate$TopAlbumsContent$List sceneTemplate$TopAlbumsContent$List = new SceneTemplate$TopAlbumsContent$List();
        DEFAULT_INSTANCE = sceneTemplate$TopAlbumsContent$List;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopAlbumsContent$List.class, sceneTemplate$TopAlbumsContent$List);
    }

    private SceneTemplate$TopAlbumsContent$List() {
    }

    public static SceneTemplate$TopAlbumsContent$List p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0007\u0004ဉ\u0001", new Object[]{"bitField0_", "title_", "albums_", RankedAlbumSummary.class, "hasHapticFeedback_", "backgroundAnimation_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopAlbumsContent$List();
        }
        if (iOrdinal == 4) {
            return new u1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TopAlbumsContent$List.class) {
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

    public final Paragraph r() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

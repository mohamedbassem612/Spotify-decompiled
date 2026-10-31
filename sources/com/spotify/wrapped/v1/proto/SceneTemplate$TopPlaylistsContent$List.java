package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopPlaylistsContent$List extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 5;
    public static final int BUTTON_CONFIGURATION_FIELD_NUMBER = 4;
    private static final SceneTemplate$TopPlaylistsContent$List DEFAULT_INSTANCE;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 3;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private ButtonConfiguration buttonConfiguration_;
    private boolean hasHapticFeedback_;
    private h290 playlists_ = com.google.protobuf.h.emptyProtobufList();
    private Paragraph subtitle_;
    private Paragraph title_;

    public static final class PlaylistItem extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_NAME_FIELD_NUMBER = 9;
        public static final int ASSOCIATED_DATA_POINT_2_FIELD_NUMBER = 10;
        public static final int ASSOCIATED_DATA_POINT_FIELD_NUMBER = 6;
        public static final int AUDIO_PREVIEW_FIELD_NUMBER = 7;
        public static final int COVER_IMAGE_FIELD_NUMBER = 5;
        private static final PlaylistItem DEFAULT_INSTANCE;
        public static final int EXPANDED_NAME_FIELD_NUMBER = 4;
        public static final int EXPANDED_RANK_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int RANK_FIELD_NUMBER = 1;
        private String accessibilityName_ = "";
        private Paragraph associatedDataPoint2_;
        private Paragraph associatedDataPoint_;
        private AudioPreview audioPreview_;
        private int bitField0_;
        private Image coverImage_;
        private Paragraph expandedName_;
        private Paragraph expandedRank_;
        private Paragraph name_;
        private Paragraph rank_;

        static {
            PlaylistItem playlistItem = new PlaylistItem();
            DEFAULT_INSTANCE = playlistItem;
            com.google.protobuf.h.registerDefaultInstance(PlaylistItem.class, playlistItem);
        }

        private PlaylistItem() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\tȈ\nဉ\u0007", new Object[]{"bitField0_", "rank_", "expandedRank_", "name_", "expandedName_", "coverImage_", "associatedDataPoint_", "audioPreview_", "accessibilityName_", "associatedDataPoint2_"});
            }
            if (iOrdinal == 3) {
                return new PlaylistItem();
            }
            if (iOrdinal == 4) {
                return new g2(DEFAULT_INSTANCE);
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
            synchronized (PlaylistItem.class) {
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
            return this.accessibilityName_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Paragraph o() {
            Paragraph paragraph = this.associatedDataPoint_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.associatedDataPoint2_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final AudioPreview q() {
            AudioPreview audioPreview = this.audioPreview_;
            return audioPreview == null ? AudioPreview.p() : audioPreview;
        }

        public final Image r() {
            Image image = this.coverImage_;
            return image == null ? Image.o() : image;
        }

        public final Paragraph s() {
            Paragraph paragraph = this.expandedName_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph t() {
            Paragraph paragraph = this.expandedRank_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Paragraph u() {
            Paragraph paragraph = this.name_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph v() {
            Paragraph paragraph = this.rank_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean w() {
            return (this.bitField0_ & 64) != 0;
        }
    }

    static {
        SceneTemplate$TopPlaylistsContent$List sceneTemplate$TopPlaylistsContent$List = new SceneTemplate$TopPlaylistsContent$List();
        DEFAULT_INSTANCE = sceneTemplate$TopPlaylistsContent$List;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopPlaylistsContent$List.class, sceneTemplate$TopPlaylistsContent$List);
    }

    private SceneTemplate$TopPlaylistsContent$List() {
    }

    public static SceneTemplate$TopPlaylistsContent$List o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u0007", new Object[]{"bitField0_", "title_", "subtitle_", "playlists_", PlaylistItem.class, "buttonConfiguration_", "backgroundAnimation_", "hasHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopPlaylistsContent$List();
        }
        if (iOrdinal == 4) {
            return new f2(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TopPlaylistsContent$List.class) {
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
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.hasHapticFeedback_;
    }

    public final h290 q() {
        return this.playlists_;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

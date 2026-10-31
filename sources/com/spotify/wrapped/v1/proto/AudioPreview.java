package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AudioPreview extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_FADE_IN_DURATION_FIELD_NUMBER = 5;
    public static final int BEATS_FIELD_NUMBER = 6;
    private static final AudioPreview DEFAULT_INSTANCE;
    public static final int DISPLAY_INFO_FIELD_NUMBER = 7;
    public static final int GROUP_ID_FIELD_NUMBER = 2;
    public static final int IS_INITIALLY_PAUSED_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int ROYALTY_REPORTING_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 1;
    private float audioFadeInDuration_;
    private Beats beats_;
    private int bitField0_;
    private DisplayInfo displayInfo_;
    private boolean isInitiallyPaused_;
    private RoyaltyReporting royaltyReporting_;
    private String url_ = "";
    private String groupId_ = "";

    public static final class Beat extends com.google.protobuf.h implements v2j0 {
        private static final Beat DEFAULT_INSTANCE;
        public static final int DURATION_TILL_NEXT_BEAT_FIELD_NUMBER = 2;
        public static final int LOUDNESS_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int POSITION_IN_BAR_FIELD_NUMBER = 3;
        public static final int TIME_FIELD_NUMBER = 1;
        private float durationTillNextBeat_;
        private float loudness_;
        private int positionInBar_;
        private float time_;

        static {
            Beat beat = new Beat();
            DEFAULT_INSTANCE = beat;
            com.google.protobuf.h.registerDefaultInstance(Beat.class, beat);
        }

        private Beat() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u000b\u0004\u0001", new Object[]{"time_", "durationTillNextBeat_", "positionInBar_", "loudness_"});
            }
            if (iOrdinal == 3) {
                return new Beat();
            }
            if (iOrdinal == 4) {
                return new h(DEFAULT_INSTANCE);
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
            synchronized (Beat.class) {
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

        public final float n() {
            return this.durationTillNextBeat_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final float o() {
            return this.loudness_;
        }

        public final float p() {
            return this.time_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Beats extends com.google.protobuf.h implements v2j0 {
        public static final int BEATS_FIELD_NUMBER = 2;
        public static final int BEATS_PER_BAR_FIELD_NUMBER = 1;
        public static final int BPM_FIELD_NUMBER = 3;
        private static final Beats DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int beatsPerBar_;
        private h290 beats_ = com.google.protobuf.h.emptyProtobufList();
        private float bpm_;

        static {
            Beats beats = new Beats();
            DEFAULT_INSTANCE = beats;
            com.google.protobuf.h.registerDefaultInstance(Beats.class, beats);
        }

        private Beats() {
        }

        public static Beats p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b\u0003\u0001", new Object[]{"beatsPerBar_", "beats_", Beat.class, "bpm_"});
            }
            if (iOrdinal == 3) {
                return new Beats();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (Beats.class) {
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
            return this.beats_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final float o() {
            return this.bpm_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class DisplayInfo extends com.google.protobuf.h implements v2j0 {
        public static final int CARD_STYLE_FIELD_NUMBER = 6;
        public static final int CHIP_ACCESSIBILITY_FIELD_NUMBER = 7;
        public static final int CHIP_ACCESSIBILITY_LABEL_FIELD_NUMBER = 5;
        private static final DisplayInfo DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TRACK_URI_FIELD_NUMBER = 3;
        private int bitField0_;
        private AudioPreviewCardStyle cardStyle_;
        private AccessibilityDefinition chipAccessibility_;
        private String title_ = "";
        private String subtitle_ = "";
        private String trackUri_ = "";
        private String imageUrl_ = "";
        private String chipAccessibilityLabel_ = "";

        public static final class AudioPreviewCardStyle extends com.google.protobuf.h implements v2j0 {
            public static final int ACCESSIBILITY_LABEL_FIELD_NUMBER = 3;
            public static final int ADD_TO_LIKED_SONGS_LABEL_FIELD_NUMBER = 4;
            public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
            public static final int BORDER_COLOR_FIELD_NUMBER = 2;
            private static final AudioPreviewCardStyle DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int REMOVE_FROM_LIKED_SONGS_LABEL_FIELD_NUMBER = 5;
            private String backgroundColor_ = "";
            private String borderColor_ = "";
            private String accessibilityLabel_ = "";
            private String addToLikedSongsLabel_ = "";
            private String removeFromLikedSongsLabel_ = "";

            static {
                AudioPreviewCardStyle audioPreviewCardStyle = new AudioPreviewCardStyle();
                DEFAULT_INSTANCE = audioPreviewCardStyle;
                com.google.protobuf.h.registerDefaultInstance(AudioPreviewCardStyle.class, audioPreviewCardStyle);
            }

            private AudioPreviewCardStyle() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static AudioPreviewCardStyle r() {
                return DEFAULT_INSTANCE;
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"backgroundColor_", "borderColor_", "accessibilityLabel_", "addToLikedSongsLabel_", "removeFromLikedSongsLabel_"});
                }
                if (iOrdinal == 3) {
                    return new AudioPreviewCardStyle();
                }
                if (iOrdinal == 4) {
                    return new k(DEFAULT_INSTANCE);
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
                synchronized (AudioPreviewCardStyle.class) {
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
                return this.accessibilityLabel_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.addToLikedSongsLabel_;
            }

            public final String p() {
                return this.backgroundColor_;
            }

            public final String q() {
                return this.borderColor_;
            }

            public final String s() {
                return this.removeFromLikedSongsLabel_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            DisplayInfo displayInfo = new DisplayInfo();
            DEFAULT_INSTANCE = displayInfo;
            com.google.protobuf.h.registerDefaultInstance(DisplayInfo.class, displayInfo);
        }

        private DisplayInfo() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static DisplayInfo q() {
            return DEFAULT_INSTANCE;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007ဉ\u0001", new Object[]{"bitField0_", "title_", "subtitle_", "trackUri_", "imageUrl_", "chipAccessibilityLabel_", "cardStyle_", "chipAccessibility_"});
            }
            if (iOrdinal == 3) {
                return new DisplayInfo();
            }
            if (iOrdinal == 4) {
                return new l(DEFAULT_INSTANCE);
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
            synchronized (DisplayInfo.class) {
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

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        public final AudioPreviewCardStyle n() {
            AudioPreviewCardStyle audioPreviewCardStyle = this.cardStyle_;
            return audioPreviewCardStyle == null ? AudioPreviewCardStyle.r() : audioPreviewCardStyle;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final AccessibilityDefinition o() {
            AccessibilityDefinition accessibilityDefinition = this.chipAccessibility_;
            return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
        }

        public final String p() {
            return this.chipAccessibilityLabel_;
        }

        public final String r() {
            return this.trackUri_;
        }

        public final boolean s() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean t() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class RoyaltyReporting extends com.google.protobuf.h implements v2j0 {
        public static final int CONTENT_DECISION_ID_FIELD_NUMBER = 2;
        private static final RoyaltyReporting DEFAULT_INSTANCE;
        public static final int ENTITY_URL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private String entityUrl_ = "";
        private String contentDecisionId_ = "";

        static {
            RoyaltyReporting royaltyReporting = new RoyaltyReporting();
            DEFAULT_INSTANCE = royaltyReporting;
            com.google.protobuf.h.registerDefaultInstance(RoyaltyReporting.class, royaltyReporting);
        }

        private RoyaltyReporting() {
        }

        public static RoyaltyReporting o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "entityUrl_", "contentDecisionId_"});
            }
            if (iOrdinal == 3) {
                return new RoyaltyReporting();
            }
            if (iOrdinal == 4) {
                return new m(DEFAULT_INSTANCE);
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
            synchronized (RoyaltyReporting.class) {
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
            return this.contentDecisionId_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.entityUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AudioPreview audioPreview = new AudioPreview();
        DEFAULT_INSTANCE = audioPreview;
        com.google.protobuf.h.registerDefaultInstance(AudioPreview.class, audioPreview);
    }

    private AudioPreview() {
    }

    public static AudioPreview p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0007\u0005\u0001\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"bitField0_", "url_", "groupId_", "royaltyReporting_", "isInitiallyPaused_", "audioFadeInDuration_", "beats_", "displayInfo_"});
        }
        if (iOrdinal == 3) {
            return new AudioPreview();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE);
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
        synchronized (AudioPreview.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final float n() {
        return this.audioFadeInDuration_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Beats o() {
        Beats beats = this.beats_;
        return beats == null ? Beats.p() : beats;
    }

    public final DisplayInfo q() {
        DisplayInfo displayInfo = this.displayInfo_;
        return displayInfo == null ? DisplayInfo.q() : displayInfo;
    }

    public final String r() {
        return this.groupId_;
    }

    public final boolean s() {
        return this.isInitiallyPaused_;
    }

    public final RoyaltyReporting t() {
        RoyaltyReporting royaltyReporting = this.royaltyReporting_;
        return royaltyReporting == null ? RoyaltyReporting.o() : royaltyReporting;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }
}

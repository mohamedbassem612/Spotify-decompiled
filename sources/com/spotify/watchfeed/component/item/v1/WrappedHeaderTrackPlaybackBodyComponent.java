package com.spotify.watchfeed.component.item.v1;

import com.spotify.wrapped.v1.proto.AccessibilityDefinition;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WrappedHeaderTrackPlaybackBodyComponent extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_PREVIEW_CARD_STYLE_FIELD_NUMBER = 4;
    public static final int AUDIO_PREVIEW_CHIP_STYLE_FIELD_NUMBER = 6;
    public static final int AUDIO_PREVIEW_LIKED_SONGS_ACTION_FIELD_NUMBER = 5;
    public static final int CHIP_ELIGIBLE_FIELD_NUMBER = 1;
    private static final WrappedHeaderTrackPlaybackBodyComponent DEFAULT_INSTANCE;
    public static final int HAS_CHIP_TAP_HAPTIC_FEEDBACK_FIELD_NUMBER = 2;
    public static final int HAS_SAVE_SONG_HAPTIC_FEEDBACK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private AudioPreviewCardStyle audioPreviewCardStyle_;
    private AudioPreviewChipStyle audioPreviewChipStyle_;
    private AudioPreviewLikedSongsAction audioPreviewLikedSongsAction_;
    private int bitField0_;
    private boolean chipEligible_;
    private boolean hasChipTapHapticFeedback_;
    private boolean hasSaveSongHapticFeedback_;

    public static final class AudioPreviewCardStyle extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_FIELD_NUMBER = 5;
        public static final int ACCESSIBILITY_LABEL_FIELD_NUMBER = 4;
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
        public static final int BORDER_COLOR_FIELD_NUMBER = 2;
        private static final AudioPreviewCardStyle DEFAULT_INSTANCE;
        public static final int FOREGROUND_COLOR_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private AccessibilityDefinition accessibility_;
        private int bitField0_;
        private String backgroundColor_ = "";
        private String borderColor_ = "";
        private String foregroundColor_ = "";
        private String accessibilityLabel_ = "";

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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000", new Object[]{"bitField0_", "backgroundColor_", "borderColor_", "foregroundColor_", "accessibilityLabel_", "accessibility_"});
            }
            if (iOrdinal == 3) {
                return new AudioPreviewCardStyle();
            }
            if (iOrdinal == 4) {
                return new o(DEFAULT_INSTANCE);
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

        public final AccessibilityDefinition n() {
            AccessibilityDefinition accessibilityDefinition = this.accessibility_;
            return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.accessibilityLabel_;
        }

        public final String p() {
            return this.backgroundColor_;
        }

        public final String q() {
            return this.borderColor_;
        }

        public final String s() {
            return this.foregroundColor_;
        }

        public final boolean t() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class AudioPreviewChipStyle extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_FIELD_NUMBER = 4;
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
        public static final int BORDER_COLOR_FIELD_NUMBER = 2;
        private static final AudioPreviewChipStyle DEFAULT_INSTANCE;
        public static final int FOREGROUND_COLOR_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private AccessibilityDefinition accessibility_;
        private int bitField0_;
        private String backgroundColor_ = "";
        private String borderColor_ = "";
        private String foregroundColor_ = "";

        static {
            AudioPreviewChipStyle audioPreviewChipStyle = new AudioPreviewChipStyle();
            DEFAULT_INSTANCE = audioPreviewChipStyle;
            com.google.protobuf.h.registerDefaultInstance(AudioPreviewChipStyle.class, audioPreviewChipStyle);
        }

        private AudioPreviewChipStyle() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static AudioPreviewChipStyle q() {
            return DEFAULT_INSTANCE;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "backgroundColor_", "borderColor_", "foregroundColor_", "accessibility_"});
            }
            if (iOrdinal == 3) {
                return new AudioPreviewChipStyle();
            }
            if (iOrdinal == 4) {
                return new p(DEFAULT_INSTANCE);
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
            synchronized (AudioPreviewChipStyle.class) {
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

        public final AccessibilityDefinition n() {
            AccessibilityDefinition accessibilityDefinition = this.accessibility_;
            return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.backgroundColor_;
        }

        public final String p() {
            return this.borderColor_;
        }

        public final String r() {
            return this.foregroundColor_;
        }

        public final boolean s() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class AudioPreviewLikedSongsAction extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_FIELD_NUMBER = 3;
        public static final int ADD_TO_LIKED_SONGS_LABEL_FIELD_NUMBER = 1;
        private static final AudioPreviewLikedSongsAction DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int REMOVE_FROM_LIKED_SONGS_LABEL_FIELD_NUMBER = 2;
        private AccessibilityDefinition accessibility_;
        private int bitField0_;
        private String addToLikedSongsLabel_ = "";
        private String removeFromLikedSongsLabel_ = "";

        static {
            AudioPreviewLikedSongsAction audioPreviewLikedSongsAction = new AudioPreviewLikedSongsAction();
            DEFAULT_INSTANCE = audioPreviewLikedSongsAction;
            com.google.protobuf.h.registerDefaultInstance(AudioPreviewLikedSongsAction.class, audioPreviewLikedSongsAction);
        }

        private AudioPreviewLikedSongsAction() {
        }

        public static AudioPreviewLikedSongsAction p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "addToLikedSongsLabel_", "removeFromLikedSongsLabel_", "accessibility_"});
            }
            if (iOrdinal == 3) {
                return new AudioPreviewLikedSongsAction();
            }
            if (iOrdinal == 4) {
                return new q(DEFAULT_INSTANCE);
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
            synchronized (AudioPreviewLikedSongsAction.class) {
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

        public final AccessibilityDefinition n() {
            AccessibilityDefinition accessibilityDefinition = this.accessibility_;
            return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.addToLikedSongsLabel_;
        }

        public final String q() {
            return this.removeFromLikedSongsLabel_;
        }

        public final boolean r() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        WrappedHeaderTrackPlaybackBodyComponent wrappedHeaderTrackPlaybackBodyComponent = new WrappedHeaderTrackPlaybackBodyComponent();
        DEFAULT_INSTANCE = wrappedHeaderTrackPlaybackBodyComponent;
        com.google.protobuf.h.registerDefaultInstance(WrappedHeaderTrackPlaybackBodyComponent.class, wrappedHeaderTrackPlaybackBodyComponent);
    }

    private WrappedHeaderTrackPlaybackBodyComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WrappedHeaderTrackPlaybackBodyComponent w(phc phcVar) {
        return (WrappedHeaderTrackPlaybackBodyComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "chipEligible_", "hasChipTapHapticFeedback_", "hasSaveSongHapticFeedback_", "audioPreviewCardStyle_", "audioPreviewLikedSongsAction_", "audioPreviewChipStyle_"});
        }
        if (iOrdinal == 3) {
            return new WrappedHeaderTrackPlaybackBodyComponent();
        }
        if (iOrdinal == 4) {
            return new r(DEFAULT_INSTANCE);
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
        synchronized (WrappedHeaderTrackPlaybackBodyComponent.class) {
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

    public final AudioPreviewCardStyle n() {
        AudioPreviewCardStyle audioPreviewCardStyle = this.audioPreviewCardStyle_;
        return audioPreviewCardStyle == null ? AudioPreviewCardStyle.r() : audioPreviewCardStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AudioPreviewChipStyle o() {
        AudioPreviewChipStyle audioPreviewChipStyle = this.audioPreviewChipStyle_;
        return audioPreviewChipStyle == null ? AudioPreviewChipStyle.q() : audioPreviewChipStyle;
    }

    public final AudioPreviewLikedSongsAction p() {
        AudioPreviewLikedSongsAction audioPreviewLikedSongsAction = this.audioPreviewLikedSongsAction_;
        return audioPreviewLikedSongsAction == null ? AudioPreviewLikedSongsAction.p() : audioPreviewLikedSongsAction;
    }

    public final boolean q() {
        return this.chipEligible_;
    }

    public final boolean r() {
        return this.hasChipTapHapticFeedback_;
    }

    public final boolean s() {
        return this.hasSaveSongHapticFeedback_;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }
}

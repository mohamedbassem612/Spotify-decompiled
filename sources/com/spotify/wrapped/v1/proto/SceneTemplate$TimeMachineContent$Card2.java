package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TimeMachineContent$Card2 extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 3;
    private static final SceneTemplate$TimeMachineContent$Card2 DEFAULT_INSTANCE;
    public static final int HAS_REVEAL_YEAR_HAPTICS_FEEDBACK_FIELD_NUMBER = 12;
    public static final int HAS_SWIPE_THROUGH_YEARS_HAPTICS_FEEDBACK_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int RIVE_BACKGROUND_ANIMATION_FIELD_NUMBER = 1;
    public static final int RIVE_ENTITY_VARIANTS_ANIMATION_FIELD_NUMBER = 10;
    public static final int UNSELECTED_CHIP_BACKGROUND_COLOR_FIELD_NUMBER = 7;
    public static final int UNSELECTED_CHIP_LABEL_FIELD_NUMBER = 9;
    public static final int UNSELECTED_CHIP_OUTLINE_COLOR_FIELD_NUMBER = 8;
    public static final int YEARS_FIELD_NUMBER = 6;
    public static final int YEAR_SELECTOR_ACCESSIBILITY_LABEL_FIELD_NUMBER = 13;
    private AudioPreview audioPreview_;
    private int bitField0_;
    private boolean hasRevealYearHapticsFeedback_;
    private boolean hasSwipeThroughYearsHapticsFeedback_;
    private RiveAnimation riveBackgroundAnimation_;
    private RiveAnimation riveEntityVariantsAnimation_;
    private Paragraph unselectedChipLabel_;
    private h290 years_ = com.google.protobuf.h.emptyProtobufList();
    private String unselectedChipBackgroundColor_ = "";
    private String unselectedChipOutlineColor_ = "";
    private String yearSelectorAccessibilityLabel_ = "";

    public static final class YearEntry extends com.google.protobuf.h implements v2j0 {
        public static final int ASSET_COMBO_FIELD_NUMBER = 8;
        public static final int AUDIO_PREVIEW_FIELD_NUMBER = 5;
        public static final int BORDER_COLOR_FIELD_NUMBER = 7;
        public static final int CHIP_LABEL_FIELD_NUMBER = 11;
        private static final YearEntry DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 4;
        public static final int ENTITIES_FIELD_NUMBER = 9;
        public static final int GLOWBOX_COLOR_FIELD_NUMBER = 6;
        public static final int HEADER_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int RIVE_ENTITY_ANIMATION_FIELD_NUMBER = 13;
        public static final int SELECTED_CHIP_BACKGROUND_COLOR_FIELD_NUMBER = 12;
        public static final int YEAR_ASSETS_FIELD_NUMBER = 10;
        public static final int YEAR_FIELD_NUMBER = 1;
        public static final int YEAR_THEME_FIELD_NUMBER = 14;
        public static final int YEAR_TITLE_FIELD_NUMBER = 3;
        private int assetCombo_;
        private AudioPreview audioPreview_;
        private int bitField0_;
        private Paragraph chipLabel_;
        private Paragraph description_;
        private Paragraph header_;
        private RiveAnimation riveEntityAnimation_;
        private Paragraph yearTitle_;
        private int year_;
        private String glowboxColor_ = "";
        private String borderColor_ = "";
        private h290 entities_ = com.google.protobuf.h.emptyProtobufList();
        private h290 yearAssets_ = com.google.protobuf.h.emptyProtobufList();
        private String selectedChipBackgroundColor_ = "";
        private String yearTheme_ = "";

        static {
            YearEntry yearEntry = new YearEntry();
            DEFAULT_INSTANCE = yearEntry;
            com.google.protobuf.h.registerDefaultInstance(YearEntry.class, yearEntry);
        }

        private YearEntry() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ\u0007Ȉ\b\f\t\u001b\n\u001b\u000bဉ\u0004\fȈ\rဉ\u0005\u000eȈ", new Object[]{"bitField0_", "year_", "header_", "yearTitle_", "description_", "audioPreview_", "glowboxColor_", "borderColor_", "assetCombo_", "entities_", Image.class, "yearAssets_", Image.class, "chipLabel_", "selectedChipBackgroundColor_", "riveEntityAnimation_", "yearTheme_"});
            }
            if (iOrdinal == 3) {
                return new YearEntry();
            }
            if (iOrdinal == 4) {
                return new o1(DEFAULT_INSTANCE);
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
            synchronized (YearEntry.class) {
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

        public final int getYear() {
            return this.year_;
        }

        public final AudioPreview n() {
            AudioPreview audioPreview = this.audioPreview_;
            return audioPreview == null ? AudioPreview.p() : audioPreview;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.borderColor_;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.chipLabel_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.description_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph r() {
            Paragraph paragraph = this.header_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final RiveAnimation s() {
            RiveAnimation riveAnimation = this.riveEntityAnimation_;
            return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
        }

        public final String t() {
            return this.selectedChipBackgroundColor_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final String u() {
            return this.yearTheme_;
        }

        public final Paragraph v() {
            Paragraph paragraph = this.yearTitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean w() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean x() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean y() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    static {
        SceneTemplate$TimeMachineContent$Card2 sceneTemplate$TimeMachineContent$Card2 = new SceneTemplate$TimeMachineContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$TimeMachineContent$Card2;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TimeMachineContent$Card2.class, sceneTemplate$TimeMachineContent$Card2);
    }

    private SceneTemplate$TimeMachineContent$Card2() {
    }

    public static SceneTemplate$TimeMachineContent$Card2 n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\r\n\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0006\u001b\u0007Ȉ\bȈ\tဉ\u0002\nဉ\u0003\u000b\u0007\f\u0007\rȈ", new Object[]{"bitField0_", "riveBackgroundAnimation_", "audioPreview_", "years_", YearEntry.class, "unselectedChipBackgroundColor_", "unselectedChipOutlineColor_", "unselectedChipLabel_", "riveEntityVariantsAnimation_", "hasSwipeThroughYearsHapticsFeedback_", "hasRevealYearHapticsFeedback_", "yearSelectorAccessibilityLabel_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TimeMachineContent$Card2();
        }
        if (iOrdinal == 4) {
            return new n1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TimeMachineContent$Card2.class) {
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

    public final boolean o() {
        return this.hasRevealYearHapticsFeedback_;
    }

    public final boolean p() {
        return this.hasSwipeThroughYearsHapticsFeedback_;
    }

    public final RiveAnimation q() {
        RiveAnimation riveAnimation = this.riveBackgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final String r() {
        return this.unselectedChipBackgroundColor_;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.unselectedChipLabel_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final String t() {
        return this.unselectedChipOutlineColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.yearSelectorAccessibilityLabel_;
    }

    public final h290 v() {
        return this.years_;
    }
}

package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.ik41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$SummaryShare extends com.google.protobuf.h implements v2j0 {
    public static final int BUTTON_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int CARDS_FIELD_NUMBER = 2;
    private static final SceneTemplate$SummaryShare DEFAULT_INSTANCE;
    public static final int FOOTER_CONTENT_FIELD_NUMBER = 3;
    public static final int HAS_HAPTIC_FEEDBACK_FIELD_NUMBER = 6;
    public static final int PAGE_INDICATOR_ACTIVE_COLOR_FIELD_NUMBER = 4;
    public static final int PAGE_INDICATOR_INACTIVE_COLOR_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ButtonConfiguration buttonConfiguration_;
    private FooterContent footerContent_;
    private boolean hasHapticFeedback_;
    private h290 cards_ = com.google.protobuf.h.emptyProtobufList();
    private String pageIndicatorActiveColor_ = "";
    private String pageIndicatorInactiveColor_ = "";

    public static final class Card extends com.google.protobuf.h implements v2j0 {
        public static final int ACCESSIBILITY_NAME_FIELD_NUMBER = 22;
        public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 19;
        public static final int BACKGROUND_OVERLAY_FIELD_NUMBER = 24;
        public static final int BOTTOM_LEFT_SECTION_FIELD_NUMBER = 17;
        public static final int BOTTOM_RIGHT_SECTION_FIELD_NUMBER = 18;
        private static final Card DEFAULT_INSTANCE;
        public static final int ENABLE_ROW_FILLING_FIELD_NUMBER = 23;
        public static final int FOREGROUND_COLOR_FIELD_NUMBER = 20;
        public static final int HASH_TAG_TEXT_FIELD_NUMBER = 10;
        public static final int HEADER_FIELD_NUMBER = 13;
        public static final int HERO_IMAGE_FIELD_NUMBER = 14;
        private static volatile qzr0 PARSER = null;
        public static final int SHARE_SCHEME_FIELD_NUMBER = 21;
        public static final int TOP_LEFT_SECTION_FIELD_NUMBER = 15;
        public static final int TOP_RIGHT_SECTION_FIELD_NUMBER = 16;
        private Image backgroundImage_;
        private Image backgroundOverlay_;
        private int bitField0_;
        private Section bottomLeftSection_;
        private Section bottomRightSection_;
        private boolean enableRowFilling_;
        private Paragraph header_;
        private HeroImage heroImage_;
        private Section topLeftSection_;
        private Section topRightSection_;
        private String hashTagText_ = "";
        private String foregroundColor_ = "";
        private String shareScheme_ = "";
        private String accessibilityName_ = "";

        static {
            Card card = new Card();
            DEFAULT_INSTANCE = card;
            com.google.protobuf.h.registerDefaultInstance(Card.class, card);
        }

        private Card() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static Card s() {
            return DEFAULT_INSTANCE;
        }

        public final Section A() {
            Section section = this.topRightSection_;
            return section == null ? Section.n() : section;
        }

        public final boolean B() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean C() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean D() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean E() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean F() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean G() {
            return (this.bitField0_ & 8) != 0;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\n\u0018\r\u0000\u0000\u0000\nȈ\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003\u0011ဉ\u0004\u0012ဉ\u0005\u0013ဉ\u0006\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017\u0007\u0018ဉ\u0007", new Object[]{"bitField0_", "hashTagText_", "header_", "heroImage_", "topLeftSection_", "topRightSection_", "bottomLeftSection_", "bottomRightSection_", "backgroundImage_", "foregroundColor_", "shareScheme_", "accessibilityName_", "enableRowFilling_", "backgroundOverlay_"});
            }
            if (iOrdinal == 3) {
                return new Card();
            }
            if (iOrdinal == 4) {
                return new h1(DEFAULT_INSTANCE);
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
            synchronized (Card.class) {
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

        public final Image o() {
            Image image = this.backgroundImage_;
            return image == null ? Image.o() : image;
        }

        public final Image p() {
            Image image = this.backgroundOverlay_;
            return image == null ? Image.o() : image;
        }

        public final Section q() {
            Section section = this.bottomLeftSection_;
            return section == null ? Section.n() : section;
        }

        public final Section r() {
            Section section = this.bottomRightSection_;
            return section == null ? Section.n() : section;
        }

        public final boolean t() {
            return this.enableRowFilling_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final String u() {
            return this.foregroundColor_;
        }

        public final String v() {
            return this.hashTagText_;
        }

        public final Paragraph w() {
            Paragraph paragraph = this.header_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final HeroImage x() {
            HeroImage heroImage = this.heroImage_;
            return heroImage == null ? HeroImage.n() : heroImage;
        }

        public final String y() {
            return this.shareScheme_;
        }

        public final Section z() {
            Section section = this.topLeftSection_;
            return section == null ? Section.n() : section;
        }
    }

    public static final class Fallback extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
        private static final Fallback DEFAULT_INSTANCE;
        public static final int FOREGROUND_COLOR_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String backgroundColor_ = "";
        private String foregroundColor_ = "";

        static {
            Fallback fallback = new Fallback();
            DEFAULT_INSTANCE = fallback;
            com.google.protobuf.h.registerDefaultInstance(Fallback.class, fallback);
        }

        private Fallback() {
        }

        public static Fallback o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "backgroundColor_", "foregroundColor_"});
            }
            if (iOrdinal == 3) {
                return new Fallback();
            }
            if (iOrdinal == 4) {
                return new i1(DEFAULT_INSTANCE);
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
            synchronized (Fallback.class) {
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

        public final String p() {
            return this.foregroundColor_;
        }

        public final String q() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class FooterContent extends com.google.protobuf.h implements v2j0 {
        private static final FooterContent DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private Paragraph subtitle_;

        static {
            FooterContent footerContent = new FooterContent();
            DEFAULT_INSTANCE = footerContent;
            com.google.protobuf.h.registerDefaultInstance(FooterContent.class, footerContent);
        }

        private FooterContent() {
        }

        public static FooterContent n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "subtitle_"});
            }
            if (iOrdinal == 3) {
                return new FooterContent();
            }
            if (iOrdinal == 4) {
                return new j1(DEFAULT_INSTANCE);
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
            synchronized (FooterContent.class) {
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
            Paragraph paragraph = this.subtitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class HeroImage extends com.google.protobuf.h implements v2j0 {
        private static final HeroImage DEFAULT_INSTANCE;
        public static final int FALLBACK_FIELD_NUMBER = 4;
        public static final int HERO_CONTAINER_BACKGROUND_IMAGE_FIELD_NUMBER = 3;
        public static final int IMAGES_FIELD_NUMBER = 1;
        public static final int IMAGE_LAYOUT_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private Fallback fallback_;
        private Image heroContainerBackgroundImage_;
        private int imageLayout_;
        private h290 images_ = com.google.protobuf.h.emptyProtobufList();

        static {
            HeroImage heroImage = new HeroImage();
            DEFAULT_INSTANCE = heroImage;
            com.google.protobuf.h.registerDefaultInstance(HeroImage.class, heroImage);
        }

        private HeroImage() {
        }

        public static HeroImage n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "images_", Image.class, "imageLayout_", "heroContainerBackgroundImage_", "fallback_"});
            }
            if (iOrdinal == 3) {
                return new HeroImage();
            }
            if (iOrdinal == 4) {
                return new k1(DEFAULT_INSTANCE);
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
            synchronized (HeroImage.class) {
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

        public final Fallback o() {
            Fallback fallback = this.fallback_;
            return fallback == null ? Fallback.o() : fallback;
        }

        public final Image p() {
            Image image = this.heroContainerBackgroundImage_;
            return image == null ? Image.o() : image;
        }

        public final ik41 q() {
            ik41 ik41Var;
            int i = this.imageLayout_;
            if (i == 0) {
                ik41Var = ik41.IMAGE_LAYOUT_UNSPECIFIED;
            } else if (i == 1) {
                ik41Var = ik41.IMAGE_LAYOUT_SINGLE;
            } else if (i == 2) {
                ik41Var = ik41.IMAGE_LAYOUT_IDENTITY;
            } else if (i != 3) {
                ik41Var = i != 4 ? null : ik41.IMAGE_LAYOUT_MULTI_4;
            } else {
                ik41Var = ik41.IMAGE_LAYOUT_MULTI_3;
            }
            return ik41Var == null ? ik41.UNRECOGNIZED : ik41Var;
        }

        public final h290 r() {
            return this.images_;
        }

        public final boolean s() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean t() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class RankedItem extends com.google.protobuf.h implements v2j0 {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final RankedItem DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int RANK_FIELD_NUMBER = 1;
        private int bitField0_;
        private Paragraph content_;
        private Paragraph rank_;

        static {
            RankedItem rankedItem = new RankedItem();
            DEFAULT_INSTANCE = rankedItem;
            com.google.protobuf.h.registerDefaultInstance(RankedItem.class, rankedItem);
        }

        private RankedItem() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "rank_", "content_"});
            }
            if (iOrdinal == 3) {
                return new RankedItem();
            }
            if (iOrdinal == 4) {
                return new l1(DEFAULT_INSTANCE);
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
            synchronized (RankedItem.class) {
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

        public final Paragraph n() {
            Paragraph paragraph = this.content_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Paragraph o() {
            Paragraph paragraph = this.rank_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean p() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean q() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Section extends com.google.protobuf.h implements v2j0 {
        private static final Section DEFAULT_INSTANCE;
        public static final int ITEMS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int RANKED_ITEMS_FIELD_NUMBER = 4;
        public static final int SUBTITLE_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private h290 items_ = com.google.protobuf.h.emptyProtobufList();
        private h290 rankedItems_ = com.google.protobuf.h.emptyProtobufList();
        private Paragraph subtitle_;
        private Paragraph title_;

        static {
            Section section = new Section();
            DEFAULT_INSTANCE = section;
            com.google.protobuf.h.registerDefaultInstance(Section.class, section);
        }

        private Section() {
        }

        public static Section n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "title_", "items_", Paragraph.class, "subtitle_", "rankedItems_", RankedItem.class});
            }
            if (iOrdinal == 3) {
                return new Section();
            }
            if (iOrdinal == 4) {
                return new m1(DEFAULT_INSTANCE);
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
            synchronized (Section.class) {
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

        public final h290 o() {
            return this.rankedItems_;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.subtitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean r() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean s() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$SummaryShare sceneTemplate$SummaryShare = new SceneTemplate$SummaryShare();
        DEFAULT_INSTANCE = sceneTemplate$SummaryShare;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$SummaryShare.class, sceneTemplate$SummaryShare);
    }

    private SceneTemplate$SummaryShare() {
    }

    public static SceneTemplate$SummaryShare p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006\u0007", new Object[]{"bitField0_", "buttonConfiguration_", "cards_", Card.class, "footerContent_", "pageIndicatorActiveColor_", "pageIndicatorInactiveColor_", "hasHapticFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$SummaryShare();
        }
        if (iOrdinal == 4) {
            return new g1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$SummaryShare.class) {
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

    public final ButtonConfiguration n() {
        ButtonConfiguration buttonConfiguration = this.buttonConfiguration_;
        return buttonConfiguration == null ? ButtonConfiguration.o() : buttonConfiguration;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.cards_;
    }

    public final FooterContent q() {
        FooterContent footerContent = this.footerContent_;
        return footerContent == null ? FooterContent.n() : footerContent;
    }

    public final boolean r() {
        return this.hasHapticFeedback_;
    }

    public final String s() {
        return this.pageIndicatorActiveColor_;
    }

    public final String t() {
        return this.pageIndicatorInactiveColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}

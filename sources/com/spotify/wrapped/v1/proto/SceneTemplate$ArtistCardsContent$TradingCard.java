package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$TradingCard extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_CARD_FIELD_NUMBER = 21;
    public static final int ARTIST_IMAGE_FIELD_NUMBER = 3;
    public static final int ARTIST_STICKER_FIELD_NUMBER = 13;
    public static final int ARTIST_URI_FIELD_NUMBER = 26;
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 15;
    public static final int BACK_ACCESSIBILITY_TEXT_FIELD_NUMBER = 24;
    public static final int BACK_CARD_BACKGROUND_COLORS_FIELD_NUMBER = 25;
    public static final int BONUS_CARD_FIELD_NUMBER = 22;
    public static final int CARD_BACKGROUND_COLORS_FIELD_NUMBER = 11;
    public static final int CAROUSEL_TITLE_FIELD_NUMBER = 14;
    private static final SceneTemplate$ArtistCardsContent$TradingCard DEFAULT_INSTANCE;
    public static final int FRONT_ACCESSIBILITY_TEXT_FIELD_NUMBER = 23;
    public static final int FRONT_LEFT_STAT_FIELD_NUMBER = 4;
    public static final int NAME_AUTO_LINE_HEIGHT_FIELD_NUMBER = 20;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RANK_FIELD_NUMBER = 2;
    public static final int SIDEBAR_FIELD_NUMBER = 12;
    public static final int SPARKLES_ENABLED_FIELD_NUMBER = 19;
    public static final int TEXT_COLOR_FIELD_NUMBER = 18;
    public static final int TEXT_FOIL_FIELD_NUMBER = 17;
    private Image artistImage_;
    private Image artistSticker_;
    private AudioPreview audioPreview_;
    private int bitField0_;
    private Object cardVariant_;
    private Paragraph carouselTitle_;
    private SceneTemplate$ArtistCardsContent$Stat frontLeftStat_;
    private boolean nameAutoLineHeight_;
    private int rank_;
    private SceneTemplate$ArtistCardsContent$Sidebar sidebar_;
    private boolean sparklesEnabled_;
    private Image textFoil_;
    private int cardVariantCase_ = 0;
    private String name_ = "";
    private h290 cardBackgroundColors_ = com.google.protobuf.h.emptyProtobufList();
    private String textColor_ = "";
    private String frontAccessibilityText_ = "";
    private String backAccessibilityText_ = "";
    private h290 backCardBackgroundColors_ = com.google.protobuf.h.emptyProtobufList();
    private String artistUri_ = "";

    static {
        SceneTemplate$ArtistCardsContent$TradingCard sceneTemplate$ArtistCardsContent$TradingCard = new SceneTemplate$ArtistCardsContent$TradingCard();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$TradingCard;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$TradingCard.class, sceneTemplate$ArtistCardsContent$TradingCard);
    }

    private SceneTemplate$ArtistCardsContent$TradingCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final int A() {
        return this.rank_;
    }

    public final SceneTemplate$ArtistCardsContent$Sidebar B() {
        SceneTemplate$ArtistCardsContent$Sidebar sceneTemplate$ArtistCardsContent$Sidebar = this.sidebar_;
        return sceneTemplate$ArtistCardsContent$Sidebar == null ? SceneTemplate$ArtistCardsContent$Sidebar.p() : sceneTemplate$ArtistCardsContent$Sidebar;
    }

    public final boolean C() {
        return this.sparklesEnabled_;
    }

    public final String D() {
        return this.textColor_;
    }

    public final Image E() {
        Image image = this.textFoil_;
        return image == null ? Image.o() : image;
    }

    public final boolean F() {
        return this.cardVariantCase_ == 21;
    }

    public final boolean G() {
        return this.cardVariantCase_ == 22;
    }

    public final boolean H() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 64) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0001\u0001\u0001\u001a\u0013\u0000\u0002\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u000bȚ\fဉ\u0002\rဉ\u0003\u000eဉ\u0004\u000fဉ\u0005\u0011ဉ\u0006\u0012Ȉ\u0013\u0007\u0014\u0007\u0015<\u0000\u0016<\u0000\u0017Ȉ\u0018Ȉ\u0019Ț\u001aȈ", new Object[]{"cardVariant_", "cardVariantCase_", "bitField0_", "name_", "rank_", "artistImage_", "frontLeftStat_", "cardBackgroundColors_", "sidebar_", "artistSticker_", "carouselTitle_", "audioPreview_", "textFoil_", "textColor_", "sparklesEnabled_", "nameAutoLineHeight_", SceneTemplate$ArtistCardsContent$ArtistCard.class, SceneTemplate$ArtistCardsContent$BonusCard.class, "frontAccessibilityText_", "backAccessibilityText_", "backCardBackgroundColors_", "artistUri_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$TradingCard();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (SceneTemplate$ArtistCardsContent$TradingCard.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final SceneTemplate$ArtistCardsContent$ArtistCard n() {
        return this.cardVariantCase_ == 21 ? (SceneTemplate$ArtistCardsContent$ArtistCard) this.cardVariant_ : SceneTemplate$ArtistCardsContent$ArtistCard.s();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Image o() {
        Image image = this.artistImage_;
        return image == null ? Image.o() : image;
    }

    public final String p() {
        return this.artistUri_;
    }

    public final AudioPreview q() {
        AudioPreview audioPreview = this.audioPreview_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final String r() {
        return this.backAccessibilityText_;
    }

    public final h290 s() {
        return this.backCardBackgroundColors_;
    }

    public final SceneTemplate$ArtistCardsContent$BonusCard t() {
        return this.cardVariantCase_ == 22 ? (SceneTemplate$ArtistCardsContent$BonusCard) this.cardVariant_ : SceneTemplate$ArtistCardsContent$BonusCard.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.cardBackgroundColors_;
    }

    public final int v() {
        int i = this.cardVariantCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 21) {
            return i != 22 ? 0 : 2;
        }
        return 1;
    }

    public final Paragraph w() {
        Paragraph paragraph = this.carouselTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final String x() {
        return this.frontAccessibilityText_;
    }

    public final SceneTemplate$ArtistCardsContent$Stat y() {
        SceneTemplate$ArtistCardsContent$Stat sceneTemplate$ArtistCardsContent$Stat = this.frontLeftStat_;
        return sceneTemplate$ArtistCardsContent$Stat == null ? SceneTemplate$ArtistCardsContent$Stat.n() : sceneTemplate$ArtistCardsContent$Stat;
    }

    public final boolean z() {
        return this.nameAutoLineHeight_;
    }
}

package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bnp0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PremiumOfferCard extends h implements v2j0 {
    public static final int BADGE_TEXT_FIELD_NUMBER = 1;
    public static final int BENEFITS_FIELD_NUMBER = 6;
    public static final int COLOR_SET_FIELD_NUMBER = 8;
    private static final PremiumOfferCard DEFAULT_INSTANCE;
    public static final int FOOT_NOTE_TEXT_FIELD_NUMBER = 7;
    public static final int GBB_TAGLINE_FIELD_NUMBER = 12;
    public static final int GRADIENT_END_COLOR_FIELD_NUMBER = 15;
    public static final int GRADIENT_START_COLOR_FIELD_NUMBER = 14;
    public static final int HEADER_IMAGE_URL_FIELD_NUMBER = 13;
    public static final int LOGGING_INFO_FIELD_NUMBER = 11;
    public static final int OFFER_CARD_VERSION_FIELD_NUMBER = 16;
    private static volatile qzr0 PARSER = null;
    public static final int PERIOD_TEXT_FIELD_NUMBER = 4;
    public static final int PLAN_ADDITIONAL_PRICE_PERIOD_TEXT_FIELD_NUMBER = 5;
    public static final int PRICE_TEXT_FIELD_NUMBER = 3;
    public static final int PRIMARY_OFFER_CTA_FIELD_NUMBER = 9;
    public static final int SECONDARY_OFFER_CTA_FIELD_NUMBER = 10;
    public static final int TITLE_TEXT_FIELD_NUMBER = 2;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private int offerCardVersion_;
    private PremiumOfferCTA primaryOfferCta_;
    private PremiumOfferCTA secondaryOfferCta_;
    private String badgeText_ = "";
    private String titleText_ = "";
    private String priceText_ = "";
    private String periodText_ = "";
    private String planAdditionalPricePeriodText_ = "";
    private h290 benefits_ = h.emptyProtobufList();
    private String footNoteText_ = "";
    private String colorSet_ = "";
    private String gbbTagline_ = "";
    private String headerImageUrl_ = "";
    private String gradientStartColor_ = "";
    private String gradientEndColor_ = "";

    static {
        PremiumOfferCard premiumOfferCard = new PremiumOfferCard();
        DEFAULT_INSTANCE = premiumOfferCard;
        h.registerDefaultInstance(PremiumOfferCard.class, premiumOfferCard);
    }

    private PremiumOfferCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PremiumOfferCard q() {
        return DEFAULT_INSTANCE;
    }

    public final PremiumOfferCTA A() {
        PremiumOfferCTA premiumOfferCTA = this.secondaryOfferCta_;
        return premiumOfferCTA == null ? PremiumOfferCTA.o() : premiumOfferCTA;
    }

    public final String B() {
        return this.titleText_;
    }

    public final boolean C() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 256) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006\u001b\u0007ለ\u0005\bለ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fለ\n\rለ\u000b\u000eለ\f\u000fለ\r\u0010\f", new Object[]{"bitField0_", "badgeText_", "titleText_", "priceText_", "periodText_", "planAdditionalPricePeriodText_", "benefits_", OfferCardBenefitItem.class, "footNoteText_", "colorSet_", "primaryOfferCta_", "secondaryOfferCta_", "loggingInfo_", "gbbTagline_", "headerImageUrl_", "gradientStartColor_", "gradientEndColor_", "offerCardVersion_"});
        }
        if (iOrdinal == 3) {
            return new PremiumOfferCard();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (PremiumOfferCard.class) {
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
        return this.badgeText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.benefits_;
    }

    public final String p() {
        return this.colorSet_;
    }

    public final String r() {
        return this.footNoteText_;
    }

    public final String s() {
        return this.gbbTagline_;
    }

    public final String t() {
        return this.headerImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final LoggingInfo u() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.o() : loggingInfo;
    }

    public final bnp0 v() {
        bnp0 bnp0Var;
        int i = this.offerCardVersion_;
        if (i == 0) {
            bnp0Var = bnp0.b;
        } else if (i == 1) {
            bnp0Var = bnp0.c;
        } else if (i != 2) {
            bnp0Var = i != 3 ? null : bnp0.e;
        } else {
            bnp0Var = bnp0.d;
        }
        return bnp0Var == null ? bnp0.f : bnp0Var;
    }

    public final String w() {
        return this.periodText_;
    }

    public final String x() {
        return this.planAdditionalPricePeriodText_;
    }

    public final String y() {
        return this.priceText_;
    }

    public final PremiumOfferCTA z() {
        PremiumOfferCTA premiumOfferCTA = this.primaryOfferCta_;
        return premiumOfferCTA == null ? PremiumOfferCTA.o() : premiumOfferCTA;
    }
}

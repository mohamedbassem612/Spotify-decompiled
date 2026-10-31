package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class BenefitsSubscriptionCard extends h implements v2j0 {
    public static final int BADGE_FIELD_NUMBER = 3;
    public static final int BANNER_FIELD_NUMBER = 8;
    public static final int BENEFITS_FIELD_NUMBER = 4;
    private static final BenefitsSubscriptionCard DEFAULT_INSTANCE;
    public static final int HEADER_COLORS_FIELD_NUMBER = 11;
    public static final int HEADER_DIVIDER_FIELD_NUMBER = 12;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ACTIVE_FIELD_NUMBER = 6;
    public static final int LINKS_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PRICING_FIELD_NUMBER = 5;
    public static final int PRIMARY_CTA_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TOPLINE_TEXT_FIELD_NUMBER = 7;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private Badge badge_;
    private Banner banner_;
    private int bitField0_;
    private Colors headerColors_;
    private Separator headerDivider_;
    private boolean isActive_;
    private Pricing pricing_;
    private Cta primaryCta_;
    private ColorizedString toplineText_;
    private String id_ = "";
    private String title_ = "";
    private h290 benefits_ = h.emptyProtobufList();
    private h290 links_ = h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        BenefitsSubscriptionCard benefitsSubscriptionCard = new BenefitsSubscriptionCard();
        DEFAULT_INSTANCE = benefitsSubscriptionCard;
        h.registerDefaultInstance(BenefitsSubscriptionCard.class, benefitsSubscriptionCard);
    }

    private BenefitsSubscriptionCard() {
    }

    public static BenefitsSubscriptionCard p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001d\r\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005ဉ\u0001\u0006\u0007\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\n\u001b\u000bဉ\u0005\fဉ\u0006dለ\u0007", new Object[]{"bitField0_", "id_", "title_", "badge_", "benefits_", BenefitsListItem.class, "pricing_", "isActive_", "toplineText_", "banner_", "primaryCta_", "links_", Cta.class, "headerColors_", "headerDivider_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new BenefitsSubscriptionCard();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (BenefitsSubscriptionCard.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final Badge n() {
        Badge badge = this.badge_;
        return badge == null ? Badge.o() : badge;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.benefits_;
    }

    public final h290 q() {
        return this.links_;
    }

    public final Pricing r() {
        Pricing pricing = this.pricing_;
        return pricing == null ? Pricing.n() : pricing;
    }

    public final Cta s() {
        Cta cta = this.primaryCta_;
        return cta == null ? Cta.p() : cta;
    }

    public final ColorizedString t() {
        ColorizedString colorizedString = this.toplineText_;
        return colorizedString == null ? ColorizedString.o() : colorizedString;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.ubiId_;
    }
}

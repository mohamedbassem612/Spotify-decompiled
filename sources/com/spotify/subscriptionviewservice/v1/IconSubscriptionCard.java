package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class IconSubscriptionCard extends h implements v2j0 {
    private static final IconSubscriptionCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISCLAIMER_FIELD_NUMBER = 8;
    public static final int HEADER_COLORS_FIELD_NUMBER = 10;
    public static final int ICON_URL_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ACTIVE_FIELD_NUMBER = 9;
    public static final int LINKS_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PRICING_FIELD_NUMBER = 5;
    public static final int PRIMARY_CTA_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private Colors headerColors_;
    private boolean isActive_;
    private Pricing pricing_;
    private Cta primaryCta_;
    private String id_ = "";
    private String title_ = "";
    private String description_ = "";
    private String iconUrl_ = "";
    private h290 links_ = h.emptyProtobufList();
    private String disclaimer_ = "";
    private String ubiId_ = "";

    static {
        IconSubscriptionCard iconSubscriptionCard = new IconSubscriptionCard();
        DEFAULT_INSTANCE = iconSubscriptionCard;
        h.registerDefaultInstance(IconSubscriptionCard.class, iconSubscriptionCard);
    }

    private IconSubscriptionCard() {
    }

    public static IconSubscriptionCard n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001d\u000b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007\u001b\bለ\u0003\t\u0007\nဉ\u0004dለ\u0005", new Object[]{"bitField0_", "id_", "title_", "description_", "iconUrl_", "pricing_", "primaryCta_", "links_", Cta.class, "disclaimer_", "isActive_", "headerColors_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new IconSubscriptionCard();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (IconSubscriptionCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Colors o() {
        Colors colors = this.headerColors_;
        return colors == null ? Colors.o() : colors;
    }

    public final String p() {
        return this.iconUrl_;
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

    public final String t() {
        return this.ubiId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }
}

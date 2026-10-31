package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.boc1;
import p.h290;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SubscriptionCard extends h implements v2j0 {
    public static final int AVATARS_FIELD_NUMBER = 5;
    public static final int BADGE_FIELD_NUMBER = 1;
    public static final int CTAS_FIELD_NUMBER = 6;
    private static final SubscriptionCard DEFAULT_INSTANCE;
    public static final int HEADING_ICON_FIELD_NUMBER = 9;
    public static final int LAYOUT_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int SUBSCRIPTION_ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int SUBSCRIPTION_NAME_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 10;
    public static final int TOPLINE_ICON_FIELD_NUMBER = 2;
    public static final int TOPLINE_TEXT_FIELD_NUMBER = 3;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private Badge badge_;
    private int bitField0_;
    private Icon headingIcon_;
    private int layout_;
    private ColorizedString subscriptionName_;
    private Icon toplineIcon_;
    private ColorizedString toplineText_;
    private h290 avatars_ = h.emptyProtobufList();
    private h290 ctas_ = h.emptyProtobufList();
    private h290 subscriptionAttributes_ = h.emptyProtobufList();
    private String subtitle_ = "";
    private String ubiId_ = "";

    static {
        SubscriptionCard subscriptionCard = new SubscriptionCard();
        DEFAULT_INSTANCE = subscriptionCard;
        h.registerDefaultInstance(SubscriptionCard.class, subscriptionCard);
    }

    private SubscriptionCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SubscriptionCard q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001d\u000b\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\f\tဉ\u0004\nለ\u0005dለ\u0006", new Object[]{"bitField0_", "badge_", "toplineIcon_", "toplineText_", "subscriptionName_", "avatars_", Avatar.class, "ctas_", Cta.class, "subscriptionAttributes_", SubscriptionAttribute.class, "layout_", "headingIcon_", "subtitle_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new SubscriptionCard();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (SubscriptionCard.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final h290 n() {
        return this.avatars_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Badge o() {
        Badge badge = this.badge_;
        return badge == null ? Badge.o() : badge;
    }

    public final h290 p() {
        return this.ctas_;
    }

    public final Icon r() {
        Icon icon = this.headingIcon_;
        return icon == null ? Icon.o() : icon;
    }

    public final boc1 s() {
        boc1 boc1Var;
        int i = this.layout_;
        if (i == 0) {
            boc1Var = boc1.SUBSCRIPTION_CARD_LAYOUT_UNSPECIFIED;
        } else if (i != 1) {
            boc1Var = i != 2 ? null : boc1.SUBSCRIPTION_CARD_LAYOUT_ICON_HEADING;
        } else {
            boc1Var = boc1.SUBSCRIPTION_CARD_LAYOUT_STANDARD;
        }
        return boc1Var == null ? boc1.UNRECOGNIZED : boc1Var;
    }

    public final h290 t() {
        return this.subscriptionAttributes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final ColorizedString u() {
        ColorizedString colorizedString = this.subscriptionName_;
        return colorizedString == null ? ColorizedString.o() : colorizedString;
    }

    public final Icon v() {
        Icon icon = this.toplineIcon_;
        return icon == null ? Icon.o() : icon;
    }

    public final ColorizedString w() {
        ColorizedString colorizedString = this.toplineText_;
        return colorizedString == null ? ColorizedString.o() : colorizedString;
    }

    public final String x() {
        return this.ubiId_;
    }
}

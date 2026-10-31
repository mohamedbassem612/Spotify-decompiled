package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlanCard extends h implements v2j0 {
    public static final int BADGE_FIELD_NUMBER = 1;
    public static final int BENEFITS_FIELD_NUMBER = 8;
    private static final PlanCard DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_FIELD_NUMBER = 4;
    public static final int PRICE_CAPTION_FIELD_NUMBER = 7;
    public static final int PRICE_FIELD_NUMBER = 6;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 9;
    public static final int PRIMARY_URI_FIELD_NUMBER = 10;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 11;
    public static final int SECONDARY_URI_FIELD_NUMBER = 12;
    public static final int TIER_FIELD_NUMBER = 2;
    public static final int TIER_ICON_FIELD_NUMBER = 3;
    public static final int VISUAL_IDENTITY_COLOR_FIELD_NUMBER = 5;
    private String badge_ = "";
    private String tier_ = "";
    private String tierIcon_ = "";
    private String plan_ = "";
    private String visualIdentityColor_ = "";
    private String price_ = "";
    private String priceCaption_ = "";
    private h290 benefits_ = h.emptyProtobufList();
    private String primaryButton_ = "";
    private String primaryUri_ = "";
    private String secondaryButton_ = "";
    private String secondaryUri_ = "";
    private String disclaimer_ = "";

    static {
        PlanCard planCard = new PlanCard();
        DEFAULT_INSTANCE = planCard;
        h.registerDefaultInstance(PlanCard.class, planCard);
    }

    private PlanCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȚ\tȈ\nȈ\u000bȈ\fȈ\rȈ", new Object[]{"badge_", "tier_", "tierIcon_", "plan_", "visualIdentityColor_", "price_", "priceCaption_", "benefits_", "primaryButton_", "primaryUri_", "secondaryButton_", "secondaryUri_", "disclaimer_"});
        }
        if (iOrdinal == 3) {
            return new PlanCard();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (PlanCard.class) {
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
        return this.badge_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.benefits_;
    }

    public final String p() {
        return this.disclaimer_;
    }

    public final String q() {
        return this.plan_;
    }

    public final String r() {
        return this.price_;
    }

    public final String s() {
        return this.priceCaption_;
    }

    public final String t() {
        return this.primaryButton_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.primaryUri_;
    }

    public final String v() {
        return this.secondaryButton_;
    }

    public final String w() {
        return this.secondaryUri_;
    }

    public final String x() {
        return this.tier_;
    }

    public final String y() {
        return this.tierIcon_;
    }

    public final String z() {
        return this.visualIdentityColor_;
    }
}

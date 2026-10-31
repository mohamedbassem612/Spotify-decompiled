package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetAvailablePlansViewResponse extends h implements v2j0 {
    public static final int AOS_FIELD_NUMBER = 5;
    public static final int ASTRO_ONS_FIELD_NUMBER = 8;
    public static final int ASTRO_ON_TERMS_DISCLAIMER_FIELD_NUMBER = 10;
    public static final int CURRENT_PLAN_FIELD_NUMBER = 1;
    private static final GetAvailablePlansViewResponse DEFAULT_INSTANCE;
    public static final int FEATURED_PLANS_FIELD_NUMBER = 4;
    public static final int NEMO_PLANS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_CARDS_ENABLED_FIELD_NUMBER = 11;
    public static final int PLAN_CARDS_FIELD_NUMBER = 12;
    public static final int PREMIUM_PLANS_FIELD_NUMBER = 2;
    public static final int TAB_NAMES_FIELD_NUMBER = 9;
    public static final int TERMS_DISCLAIMER_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 6;
    private int bitField0_;
    private Plan currentPlan_;
    private boolean planCardsEnabled_;
    private h290 premiumPlans_ = h.emptyProtobufList();
    private h290 nemoPlans_ = h.emptyProtobufList();
    private h290 featuredPlans_ = h.emptyProtobufList();
    private h290 aos_ = h.emptyProtobufList();
    private String title_ = "";
    private String termsDisclaimer_ = "";
    private h290 astroOns_ = h.emptyProtobufList();
    private h290 tabNames_ = h.emptyProtobufList();
    private String astroOnTermsDisclaimer_ = "";
    private h290 planCards_ = h.emptyProtobufList();

    static {
        GetAvailablePlansViewResponse getAvailablePlansViewResponse = new GetAvailablePlansViewResponse();
        DEFAULT_INSTANCE = getAvailablePlansViewResponse;
        h.registerDefaultInstance(GetAvailablePlansViewResponse.class, getAvailablePlansViewResponse);
    }

    private GetAvailablePlansViewResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0007\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006Ȉ\u0007Ȉ\b\u001b\tȚ\nȈ\u000b\u0007\f\u001b", new Object[]{"bitField0_", "currentPlan_", "premiumPlans_", Plan.class, "nemoPlans_", Plan.class, "featuredPlans_", Plan.class, "aos_", Ao.class, "title_", "termsDisclaimer_", "astroOns_", AstroOn.class, "tabNames_", "astroOnTermsDisclaimer_", "planCardsEnabled_", "planCards_", PlanCard.class});
        }
        if (iOrdinal == 3) {
            return new GetAvailablePlansViewResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (GetAvailablePlansViewResponse.class) {
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

    public final h290 n() {
        return this.astroOns_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.planCardsEnabled_;
    }

    public final h290 p() {
        return this.planCards_;
    }

    public final h290 q() {
        return this.premiumPlans_;
    }

    public final h290 r() {
        return this.tabNames_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

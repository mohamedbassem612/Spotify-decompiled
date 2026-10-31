package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PlanDetailViewModel extends h implements v2j0 {
    public static final int CHECKOUT_URL_FIELD_NUMBER = 2;
    private static final PlanDetailViewModel DEFAULT_INSTANCE;
    public static final int OFFER_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OFFER_DISCOUNT_BADGE_FIELD_NUMBER = 5;
    public static final int OFFER_SAVINGS_BADGE_FIELD_NUMBER = 1;
    public static final int OFFER_TITLE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_COMPARISON_TEXT_FIELD_NUMBER = 6;
    private int bitField0_;
    private String offerSavingsBadge_ = "";
    private String checkoutUrl_ = "";
    private String offerTitle_ = "";
    private String offerDescription_ = "";
    private String offerDiscountBadge_ = "";
    private String priceComparisonText_ = "";

    static {
        PlanDetailViewModel planDetailViewModel = new PlanDetailViewModel();
        DEFAULT_INSTANCE = planDetailViewModel;
        h.registerDefaultInstance(PlanDetailViewModel.class, planDetailViewModel);
    }

    private PlanDetailViewModel() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0003Ȉ\u0004ለ\u0001\u0005ለ\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "offerSavingsBadge_", "checkoutUrl_", "offerTitle_", "offerDescription_", "offerDiscountBadge_", "priceComparisonText_"});
        }
        if (iOrdinal == 3) {
            return new PlanDetailViewModel();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (PlanDetailViewModel.class) {
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
        return this.checkoutUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.offerDescription_;
    }

    public final String p() {
        return this.offerDiscountBadge_;
    }

    public final String q() {
        return this.offerSavingsBadge_;
    }

    public final String r() {
        return this.offerTitle_;
    }

    public final String s() {
        return this.priceComparisonText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

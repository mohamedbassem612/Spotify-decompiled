package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.btw0;
import p.dct0;
import p.ets0;
import p.gct0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Plan extends h implements v2j0 {
    public static final int ACTION_URI_FIELD_NUMBER = 18;
    public static final int BENEFITS_FIELD_NUMBER = 17;
    public static final int CHANGE_PLAN_URI_FIELD_NUMBER = 12;
    public static final int CTA_ICON_FIELD_NUMBER = 23;
    public static final int CTA_TEXT_FIELD_NUMBER = 22;
    private static final Plan DEFAULT_INSTANCE;
    public static final int DETAILED_BENEFITS_FIELD_NUMBER = 20;
    public static final int ENCORE_COLOR_SET_FIELD_NUMBER = 13;
    public static final int IOS_SUPPORT_URL_FIELD_NUMBER = 21;
    public static final int IS_ACTIVE_FIELD_NUMBER = 16;
    public static final int IS_DISCOUNTED_FIELD_NUMBER = 26;
    public static final int IS_RECOMMENDED_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_BACKGROUND_URI_FIELD_NUMBER = 19;
    public static final int PLAN_COLOR_FIELD_NUMBER = 5;
    public static final int PLAN_DETAILS_URI_FIELD_NUMBER = 11;
    public static final int PLAN_NAME_FIELD_NUMBER = 3;
    public static final int PLAN_PRICE_FIELD_NUMBER = 6;
    public static final int PLAN_TIER_FIELD_NUMBER = 2;
    public static final int PLAN_TYPE_FIELD_NUMBER = 1;
    public static final int PLAN_UPSELL_FIELD_NUMBER = 15;
    public static final int PRIMARY_ACCOUNT_DESCRIPTION_FIELD_NUMBER = 9;
    public static final int PRODUCT_COMPOSER_TIER_FIELD_NUMBER = 25;
    public static final int SHORT_PLAN_NAME_FIELD_NUMBER = 4;
    public static final int SUBACCOUNT_DESCRIPTION_FIELD_NUMBER = 10;
    private int bitField0_;
    private boolean isActive_;
    private boolean isDiscounted_;
    private boolean isRecommended_;
    private int planTier_;
    private int planType_;
    private int productComposerTier_;
    private String planName_ = "";
    private String shortPlanName_ = "";
    private String planColor_ = "";
    private String planPrice_ = "";
    private String primaryAccountDescription_ = "";
    private String subaccountDescription_ = "";
    private String planDetailsUri_ = "";
    private String changePlanUri_ = "";
    private String encoreColorSet_ = "";
    private String planUpsell_ = "";
    private h290 benefits_ = h.emptyProtobufList();
    private String actionUri_ = "";
    private String planBackgroundUri_ = "";
    private h290 detailedBenefits_ = h.emptyProtobufList();
    private String iosSupportUrl_ = "";
    private String ctaText_ = "";
    private String ctaIcon_ = "";

    static {
        Plan plan = new Plan();
        DEFAULT_INSTANCE = plan;
        h.registerDefaultInstance(Plan.class, plan);
    }

    private Plan() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Plan q() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.primaryAccountDescription_;
    }

    public final btw0 B() {
        btw0 btw0Var;
        switch (this.productComposerTier_) {
            case 0:
                btw0Var = btw0.DEFAULT_TIER;
                break;
            case 1:
                btw0Var = btw0.PREMIUM_TIER;
                break;
            case 2:
            case 7:
            case 16:
            case 17:
            default:
                btw0Var = null;
                break;
            case 3:
                btw0Var = btw0.BASIC_TIER;
                break;
            case 4:
                btw0Var = btw0.PREMIUM_LITE_TIER;
                break;
            case 5:
                btw0Var = btw0.PREMIUM_MINI_TIER;
                break;
            case 6:
                btw0Var = btw0.PREMIUM_BASIC_TIER;
                break;
            case 8:
                btw0Var = btw0.AUDIOBOOK_ACCESS_TIER;
                break;
            case 9:
                btw0Var = btw0.NO_FREE_TIER;
                break;
            case 10:
                btw0Var = btw0.UNKNOWN_TIER;
                break;
            case 11:
                btw0Var = btw0.MFT_TIER;
                break;
            case 12:
                btw0Var = btw0.MFT_PLUS_TIER;
                break;
            case 13:
                btw0Var = btw0.FREE_TIER_DISABLED_TIER;
                break;
            case 14:
                btw0Var = btw0.ON_DEMAND_TRIAL_TIER;
                break;
            case 15:
                btw0Var = btw0.PLATINUM_TIER;
                break;
            case 18:
                btw0Var = btw0.LITE_TIER;
                break;
            case 19:
                btw0Var = btw0.STANDARD_TIER;
                break;
            case 20:
                btw0Var = btw0.BASIC_PLATINUM_TIER;
                break;
        }
        return btw0Var == null ? btw0.UNRECOGNIZED : btw0Var;
    }

    public final String C() {
        return this.shortPlanName_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0002\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\tȈ\nለ\u0000\u000bȈ\fȈ\rȈ\u000fለ\u0001\u0010\u0007\u0011Ț\u0012Ȉ\u0013Ȉ\u0014\u001b\u0015Ȉ\u0016ለ\u0002\u0017ለ\u0003\u0019\f\u001a\u0007", new Object[]{"bitField0_", "planType_", "planTier_", "planName_", "shortPlanName_", "planColor_", "planPrice_", "isRecommended_", "primaryAccountDescription_", "subaccountDescription_", "planDetailsUri_", "changePlanUri_", "encoreColorSet_", "planUpsell_", "isActive_", "benefits_", "actionUri_", "planBackgroundUri_", "detailedBenefits_", Benefit.class, "iosSupportUrl_", "ctaText_", "ctaIcon_", "productComposerTier_", "isDiscounted_"});
        }
        if (iOrdinal == 3) {
            return new Plan();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (Plan.class) {
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

    public final String getPlanName() {
        return this.planName_;
    }

    public final String n() {
        return this.actionUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.benefits_;
    }

    public final String p() {
        return this.ctaText_;
    }

    public final h290 r() {
        return this.detailedBenefits_;
    }

    public final String s() {
        return this.encoreColorSet_;
    }

    public final boolean t() {
        return this.isActive_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.isDiscounted_;
    }

    public final String v() {
        return this.planBackgroundUri_;
    }

    public final String w() {
        return this.planColor_;
    }

    public final String x() {
        return this.planPrice_;
    }

    public final dct0 y() {
        dct0 dct0VarA = dct0.a(this.planTier_);
        return dct0VarA == null ? dct0.UNRECOGNIZED : dct0VarA;
    }

    public final gct0 z() {
        gct0 gct0VarA = gct0.a(this.planType_);
        return gct0VarA == null ? gct0.UNRECOGNIZED : gct0VarA;
    }
}

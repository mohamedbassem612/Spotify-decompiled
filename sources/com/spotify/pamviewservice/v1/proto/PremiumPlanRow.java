package com.spotify.pamviewservice.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cct0;
import p.h290;
import p.jf40;
import p.joc1;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;
import p.vvv0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PremiumPlanRow extends h implements v2j0 {
    public static final int ACTION_REQUIRED_SUBTITLE_FIELD_NUMBER = 20;
    public static final int AO_NAME_FIELD_NUMBER = 17;
    public static final int AVAILABLE_PLANS_FIELD_NUMBER = 12;
    public static final int AVAILABLE_PLANS_NAMES_FIELD_NUMBER = 7;
    private static final PremiumPlanRow DEFAULT_INSTANCE;
    public static final int IS_AAT_FIELD_NUMBER = 22;
    public static final int IS_ACTION_REQUIRED_FIELD_NUMBER = 19;
    public static final int IS_EMPLOYEE_FIELD_NUMBER = 23;
    public static final int IS_KID_ACCOUNT_FIELD_NUMBER = 21;
    public static final int IS_NEMO_EARLY_ADOPTER_FIELD_NUMBER = 15;
    public static final int IS_PREPAID_FIELD_NUMBER = 2;
    public static final int IS_TRIAL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_FAILED_FIELD_NUMBER = 11;
    public static final int PAYMENT_ROW_SUBTITLE_FIELD_NUMBER = 9;
    public static final int PAYMENT_ROW_TITLE_FIELD_NUMBER = 8;
    public static final int PLAN_TIER_FIELD_NUMBER = 16;
    public static final int PREMIUM_PLAN_COLOR_FIELD_NUMBER = 4;
    public static final int PREMIUM_PLAN_FIELD_NUMBER = 3;
    public static final int PREMIUM_PLAN_SHORT_NAME_FIELD_NUMBER = 18;
    public static final int PREPAID_DAYS_REMAINING_FIELD_NUMBER = 5;
    public static final int PREPAID_DURATION_FIELD_NUMBER = 14;
    public static final int SIGN_UP_DATE_FIELD_NUMBER = 13;
    public static final int SUBSCRIPTION_PROVIDER_FIELD_NUMBER = 10;
    public static final int SUBSCRIPTION_TYPE_FIELD_NUMBER = 6;
    private AvailablePlans availablePlans_;
    private int bitField0_;
    private boolean isAat_;
    private boolean isActionRequired_;
    private boolean isEmployee_;
    private boolean isKidAccount_;
    private boolean isNemoEarlyAdopter_;
    private boolean isPrepaid_;
    private boolean isTrial_;
    private boolean paymentFailed_;
    private int planTier_;
    private int prepaidDaysRemaining_;
    private int subscriptionProvider_;
    private int subscriptionType_;
    private String premiumPlan_ = "";
    private String premiumPlanColor_ = "";
    private h290 availablePlansNames_ = h.emptyProtobufList();
    private String paymentRowTitle_ = "";
    private String paymentRowSubtitle_ = "";
    private String signUpDate_ = "";
    private String prepaidDuration_ = "";
    private String aoName_ = "";
    private String premiumPlanShortName_ = "";
    private String actionRequiredSubtitle_ = "";

    static {
        PremiumPlanRow premiumPlanRow = new PremiumPlanRow();
        DEFAULT_INSTANCE = premiumPlanRow;
        h.registerDefaultInstance(PremiumPlanRow.class, premiumPlanRow);
    }

    private PremiumPlanRow() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\f\u0007Ț\bȈ\tȈ\n\f\u000b\u0007\fဉ\u0000\rለ\u0001\u000eለ\u0002\u000f\u0007\u0010\f\u0011Ȉ\u0012ለ\u0003\u0013\u0007\u0014ለ\u0004\u0015\u0007\u0016\u0007\u0017\u0007", new Object[]{"bitField0_", "isTrial_", "isPrepaid_", "premiumPlan_", "premiumPlanColor_", "prepaidDaysRemaining_", "subscriptionType_", "availablePlansNames_", "paymentRowTitle_", "paymentRowSubtitle_", "subscriptionProvider_", "paymentFailed_", "availablePlans_", "signUpDate_", "prepaidDuration_", "isNemoEarlyAdopter_", "planTier_", "aoName_", "premiumPlanShortName_", "isActionRequired_", "actionRequiredSubtitle_", "isKidAccount_", "isAat_", "isEmployee_"});
        }
        if (iOrdinal == 3) {
            return new PremiumPlanRow();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (PremiumPlanRow.class) {
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
        return this.aoName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AvailablePlans o() {
        AvailablePlans availablePlans = this.availablePlans_;
        return availablePlans == null ? AvailablePlans.n() : availablePlans;
    }

    public final boolean p() {
        return this.paymentFailed_;
    }

    public final String q() {
        return this.paymentRowSubtitle_;
    }

    public final String r() {
        return this.paymentRowTitle_;
    }

    public final cct0 s() {
        cct0 cct0Var;
        int i = this.planTier_;
        if (i == 0) {
            cct0Var = cct0.PLAN_TIER_UNSPECIFIED;
        } else if (i == 1) {
            cct0Var = cct0.PLAN_TIER_FREE;
        } else if (i != 2) {
            cct0Var = i != 3 ? null : cct0.PLAN_TIER_NEMO;
        } else {
            cct0Var = cct0.PLAN_TIER_PREMIUM;
        }
        return cct0Var == null ? cct0.UNRECOGNIZED : cct0Var;
    }

    public final String t() {
        return this.premiumPlan_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.premiumPlanColor_;
    }

    public final int v() {
        return this.prepaidDaysRemaining_;
    }

    public final String w() {
        return this.signUpDate_;
    }

    public final joc1 x() {
        joc1 joc1Var;
        int i = this.subscriptionProvider_;
        if (i == 0) {
            joc1Var = joc1.UNKNOWN;
        } else if (i != 1) {
            joc1Var = i != 2 ? null : joc1.GOOGLE;
        } else {
            joc1Var = joc1.SPOTIFY;
        }
        return joc1Var == null ? joc1.UNRECOGNIZED : joc1Var;
    }

    public final vvv0 y() {
        vvv0 vvv0Var;
        int i = this.subscriptionType_;
        if (i == 0) {
            vvv0Var = vvv0.UNKNOWN;
        } else if (i == 1) {
            vvv0Var = vvv0.RECURRING_MONTHLY;
        } else if (i != 2) {
            vvv0Var = i != 3 ? null : vvv0.PREPAID;
        } else {
            vvv0Var = vvv0.TRIAL;
        }
        return vvv0Var == null ? vvv0.UNRECOGNIZED : vvv0Var;
    }
}

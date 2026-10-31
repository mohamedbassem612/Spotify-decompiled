package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AccountFlags extends h implements v2j0 {
    public static final int CAN_ADD_SUBACCOUNT_FIELD_NUMBER = 7;
    public static final int CAN_CANCEL_SUBSCRIPTION_FIELD_NUMBER = 1;
    public static final int CAN_CHANGE_PIN_FIELD_NUMBER = 4;
    public static final int CAN_REMOVE_EXPIRING_ACCOUNT_FIELD_NUMBER = 11;
    public static final int CAN_REMOVE_SUBACCOUNT_FIELD_NUMBER = 8;
    public static final int CAN_SEE_ALL_PLANS_FIELD_NUMBER = 2;
    public static final int CAN_TOP_UP_PREPAID_FIELD_NUMBER = 3;
    private static final AccountFlags DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_ALTERNATE_AUDIOBOOK_ENTRY_FIELD_NUMBER = 6;
    public static final int SHOW_AUDIOBOOK_PROGRESS_FIELD_NUMBER = 12;
    public static final int SHOW_CONSENT_CARD_FIELD_NUMBER = 10;
    public static final int SHOW_FALLBACK_FIELD_NUMBER = 5;
    public static final int SHOW_LARGE_BENEFITS_HUB_ENTRY_FIELD_NUMBER = 13;
    public static final int SHOW_PARENTAL_CONTROLS_ENTRY_FIELD_NUMBER = 17;
    public static final int SHOW_RENEW_BUTTON_FIELD_NUMBER = 9;
    public static final int SHOW_SMALL_BENEFITS_HUB_ENTRY_FIELD_NUMBER = 14;
    public static final int SHOW_UPSELL_BELOW_BENEFITS_FIELD_NUMBER = 16;
    public static final int SHOW_UPSELL_BELOW_SUBSCRIPTION_FIELD_NUMBER = 15;
    private boolean canAddSubaccount_;
    private boolean canCancelSubscription_;
    private boolean canChangePin_;
    private boolean canRemoveExpiringAccount_;
    private boolean canRemoveSubaccount_;
    private boolean canSeeAllPlans_;
    private boolean canTopUpPrepaid_;
    private boolean showAlternateAudiobookEntry_;
    private boolean showAudiobookProgress_;
    private boolean showConsentCard_;
    private boolean showFallback_;
    private boolean showLargeBenefitsHubEntry_;
    private boolean showParentalControlsEntry_;
    private boolean showRenewButton_;
    private boolean showSmallBenefitsHubEntry_;
    private boolean showUpsellBelowBenefits_;
    private boolean showUpsellBelowSubscription_;

    static {
        AccountFlags accountFlags = new AccountFlags();
        DEFAULT_INSTANCE = accountFlags;
        h.registerDefaultInstance(AccountFlags.class, accountFlags);
    }

    private AccountFlags() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AccountFlags u() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.showSmallBenefitsHubEntry_;
    }

    public final boolean B() {
        return this.showUpsellBelowBenefits_;
    }

    public final boolean C() {
        return this.showUpsellBelowSubscription_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007", new Object[]{"canCancelSubscription_", "canSeeAllPlans_", "canTopUpPrepaid_", "canChangePin_", "showFallback_", "showAlternateAudiobookEntry_", "canAddSubaccount_", "canRemoveSubaccount_", "showRenewButton_", "showConsentCard_", "canRemoveExpiringAccount_", "showAudiobookProgress_", "showLargeBenefitsHubEntry_", "showSmallBenefitsHubEntry_", "showUpsellBelowSubscription_", "showUpsellBelowBenefits_", "showParentalControlsEntry_"});
        }
        if (iOrdinal == 3) {
            return new AccountFlags();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (AccountFlags.class) {
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

    public final boolean n() {
        return this.canAddSubaccount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canCancelSubscription_;
    }

    public final boolean p() {
        return this.canChangePin_;
    }

    public final boolean q() {
        return this.canRemoveExpiringAccount_;
    }

    public final boolean r() {
        return this.canRemoveSubaccount_;
    }

    public final boolean s() {
        return this.canSeeAllPlans_;
    }

    public final boolean t() {
        return this.canTopUpPrepaid_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean v() {
        return this.showAlternateAudiobookEntry_;
    }

    public final boolean w() {
        return this.showFallback_;
    }

    public final boolean x() {
        return this.showLargeBenefitsHubEntry_;
    }

    public final boolean y() {
        return this.showParentalControlsEntry_;
    }

    public final boolean z() {
        return this.showRenewButton_;
    }
}

package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetPlanOverviewViewResponse extends h implements v2j0 {
    public static final int ACCOUNT_FIELD_NUMBER = 2;
    public static final int ACTION_MAP_FIELD_NUMBER = 3;
    public static final int ASTRO_CARD_SUBTITLE_FIELD_NUMBER = 6;
    public static final int ASTRO_CARD_TITLE_FIELD_NUMBER = 5;
    public static final int ASTRO_ONS_FIELD_NUMBER = 4;
    public static final int AUDIOBOOK_PROGRESS_FIELD_NUMBER = 8;
    public static final int CONSENT_CARD_FIELD_NUMBER = 7;
    public static final int CONSUMPTION_TRACKING_ENTRY_POINTS_FIELD_NUMBER = 9;
    private static final GetPlanOverviewViewResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_FIELD_NUMBER = 1;
    public static final int REFERRAL_ENTRYPOINT_FIELD_NUMBER = 10;
    private Account account_;
    private AudiobookProgress audiobookProgress_;
    private int bitField0_;
    private ConsentCard consentCard_;
    private Plan plan_;
    private ReferralEntrypoint referralEntrypoint_;
    private h290 actionMap_ = h.emptyProtobufList();
    private h290 astroOns_ = h.emptyProtobufList();
    private String astroCardTitle_ = "";
    private String astroCardSubtitle_ = "";
    private h290 consumptionTrackingEntryPoints_ = h.emptyProtobufList();

    static {
        GetPlanOverviewViewResponse getPlanOverviewViewResponse = new GetPlanOverviewViewResponse();
        DEFAULT_INSTANCE = getPlanOverviewViewResponse;
        h.registerDefaultInstance(GetPlanOverviewViewResponse.class, getPlanOverviewViewResponse);
    }

    private GetPlanOverviewViewResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005ለ\u0002\u0006ለ\u0003\u0007ဉ\u0004\bဉ\u0005\t\u001b\nဉ\u0006", new Object[]{"bitField0_", "plan_", "account_", "actionMap_", ActionTypeMap.class, "astroOns_", AstroOn.class, "astroCardTitle_", "astroCardSubtitle_", "consentCard_", "audiobookProgress_", "consumptionTrackingEntryPoints_", Action.class, "referralEntrypoint_"});
        }
        if (iOrdinal == 3) {
            return new GetPlanOverviewViewResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (GetPlanOverviewViewResponse.class) {
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

    public final Account n() {
        Account account = this.account_;
        return account == null ? Account.p() : account;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.actionMap_;
    }

    public final String p() {
        return this.astroCardSubtitle_;
    }

    public final String q() {
        return this.astroCardTitle_;
    }

    public final h290 r() {
        return this.astroOns_;
    }

    public final h290 s() {
        return this.consumptionTrackingEntryPoints_;
    }

    public final Plan t() {
        Plan plan = this.plan_;
        return plan == null ? Plan.q() : plan;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final ReferralEntrypoint u() {
        ReferralEntrypoint referralEntrypoint = this.referralEntrypoint_;
        return referralEntrypoint == null ? ReferralEntrypoint.o() : referralEntrypoint;
    }

    public final boolean v() {
        return (this.bitField0_ & 64) != 0;
    }
}

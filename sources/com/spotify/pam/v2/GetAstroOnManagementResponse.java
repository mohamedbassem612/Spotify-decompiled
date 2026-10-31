package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class GetAstroOnManagementResponse extends h implements v2j0 {
    public static final int ASTRO_BENEFITS_FIELD_NUMBER = 5;
    public static final int AUDIOBOOK_PROGRESS_FIELD_NUMBER = 9;
    public static final int CONSUMPTION_TRACKING_ACTION_FIELD_NUMBER = 8;
    private static final GetAstroOnManagementResponse DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISCLAIMER_FIELD_NUMBER = 6;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int MEMBER_CARD_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_CARD_FIELD_NUMBER = 10;
    public static final int REMOVE_ASTRO_ON_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int V2_ENABLED_FIELD_NUMBER = 11;
    private BenefitListCard astroBenefits_;
    private AudiobookProgress audiobookProgress_;
    private int bitField0_;
    private ActionTypeMap consumptionTrackingAction_;
    private AstroMemberCard memberCard_;
    private PaymentCard paymentCard_;
    private Action removeAstroOn_;
    private boolean v2Enabled_;
    private String title_ = "";
    private String description_ = "";
    private String icon_ = "";
    private String disclaimer_ = "";

    static {
        GetAstroOnManagementResponse getAstroOnManagementResponse = new GetAstroOnManagementResponse();
        DEFAULT_INSTANCE = getAstroOnManagementResponse;
        h.registerDefaultInstance(GetAstroOnManagementResponse.class, getAstroOnManagementResponse);
    }

    private GetAstroOnManagementResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000b\u0007", new Object[]{"bitField0_", "title_", "description_", "icon_", "memberCard_", "astroBenefits_", "disclaimer_", "removeAstroOn_", "consumptionTrackingAction_", "audiobookProgress_", "paymentCard_", "v2Enabled_"});
        }
        if (iOrdinal == 3) {
            return new GetAstroOnManagementResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (GetAstroOnManagementResponse.class) {
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

    public final BenefitListCard n() {
        BenefitListCard benefitListCard = this.astroBenefits_;
        return benefitListCard == null ? BenefitListCard.q() : benefitListCard;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ActionTypeMap o() {
        ActionTypeMap actionTypeMap = this.consumptionTrackingAction_;
        return actionTypeMap == null ? ActionTypeMap.p() : actionTypeMap;
    }

    public final String p() {
        return this.disclaimer_;
    }

    public final String q() {
        return this.icon_;
    }

    public final AstroMemberCard r() {
        AstroMemberCard astroMemberCard = this.memberCard_;
        return astroMemberCard == null ? AstroMemberCard.p() : astroMemberCard;
    }

    public final PaymentCard s() {
        PaymentCard paymentCard = this.paymentCard_;
        return paymentCard == null ? PaymentCard.n() : paymentCard;
    }

    public final Action t() {
        Action action = this.removeAstroOn_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.v2Enabled_;
    }
}

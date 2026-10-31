package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetSignupFlagsResponse extends h implements v2j0 {
    public static final int ALLOWED_CALLING_CODES_FIELD_NUMBER = 15;
    public static final int CAN_ACCEPT_LICENSES_IN_ONE_STEP_FIELD_NUMBER = 2;
    public static final int COUNTRY_FIELD_NUMBER = 1;
    private static final GetSignupFlagsResponse DEFAULT_INSTANCE;
    public static final int MINIMUM_AGE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PRIVACY_POLICY_ACCEPTANCE_FIELD_NUMBER = 8;
    public static final int REQUIRES_MARKETING_OPT_IN_FIELD_NUMBER = 3;
    public static final int REQUIRES_MARKETING_OPT_IN_TEXT_FIELD_NUMBER = 4;
    public static final int REQUIRES_TAILORED_ADS_OPT_IN_FIELD_NUMBER = 5;
    public static final int SHOW_COLLECT_PERSONAL_INFO_FIELD_NUMBER = 10;
    public static final int SHOW_NON_REQUIRED_FIELDS_AS_OPTIONAL_FIELD_NUMBER = 14;
    public static final int SPOTIFY_MARKETING_MESSAGES_OPTION_FIELD_NUMBER = 9;
    public static final int TERMS_CONDITIONS_ACCEPTANCE_FIELD_NUMBER = 7;
    public static final int USE_ALL_GENDERS_FIELD_NUMBER = 11;
    public static final int USE_OTHER_GENDER_FIELD_NUMBER = 12;
    public static final int USE_PREFER_NOT_TO_SAY_GENDER_FIELD_NUMBER = 13;
    private boolean canAcceptLicensesInOneStep_;
    private int minimumAge_;
    private boolean requiresMarketingOptInText_;
    private boolean requiresMarketingOptIn_;
    private boolean requiresTailoredAdsOptIn_;
    private boolean showCollectPersonalInfo_;
    private boolean showNonRequiredFieldsAsOptional_;
    private boolean useAllGenders_;
    private boolean useOtherGender_;
    private boolean usePreferNotToSayGender_;
    private String country_ = "";
    private String termsConditionsAcceptance_ = "";
    private String privacyPolicyAcceptance_ = "";
    private String spotifyMarketingMessagesOption_ = "";
    private h290 allowedCallingCodes_ = h.emptyProtobufList();

    static {
        GetSignupFlagsResponse getSignupFlagsResponse = new GetSignupFlagsResponse();
        DEFAULT_INSTANCE = getSignupFlagsResponse;
        h.registerDefaultInstance(GetSignupFlagsResponse.class, getSignupFlagsResponse);
    }

    private GetSignupFlagsResponse() {
    }

    public static b C() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final boolean A() {
        return this.useOtherGender_;
    }

    public final boolean B() {
        return this.usePreferNotToSayGender_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u000b\u0007Ȉ\bȈ\tȈ\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u001b", new Object[]{"country_", "canAcceptLicensesInOneStep_", "requiresMarketingOptIn_", "requiresMarketingOptInText_", "requiresTailoredAdsOptIn_", "minimumAge_", "termsConditionsAcceptance_", "privacyPolicyAcceptance_", "spotifyMarketingMessagesOption_", "showCollectPersonalInfo_", "useAllGenders_", "useOtherGender_", "usePreferNotToSayGender_", "showNonRequiredFieldsAsOptional_", "allowedCallingCodes_", AllowedCallingCodes.class});
        }
        if (iOrdinal == 3) {
            return new GetSignupFlagsResponse();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (GetSignupFlagsResponse.class) {
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

    public final h290 n() {
        return this.allowedCallingCodes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canAcceptLicensesInOneStep_;
    }

    public final String p() {
        return this.country_;
    }

    public final int q() {
        return this.minimumAge_;
    }

    public final String r() {
        return this.privacyPolicyAcceptance_;
    }

    public final boolean s() {
        return this.requiresMarketingOptIn_;
    }

    public final boolean t() {
        return this.requiresMarketingOptInText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.requiresTailoredAdsOptIn_;
    }

    public final boolean v() {
        return this.showCollectPersonalInfo_;
    }

    public final boolean w() {
        return this.showNonRequiredFieldsAsOptional_;
    }

    public final String x() {
        return this.spotifyMarketingMessagesOption_;
    }

    public final String y() {
        return this.termsConditionsAcceptance_;
    }

    public final boolean z() {
        return this.useAllGenders_;
    }
}

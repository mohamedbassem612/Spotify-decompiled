package com.spotify.kidsaccount.api.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fc80;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class InitChildAccountConfigResponse extends h implements v2j0 {
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 3;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 2;
    private static final InitChildAccountConfigResponse DEFAULT_INSTANCE;
    public static final int ENFORCED_DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 6;
    public static final int ENFORCED_DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 5;
    public static final int FAMILY_PLAN_MANAGER_HAS_PIN_FIELD_NUMBER = 1;
    public static final int HAS_CHILDREN_ALLOWED_IN_MUSIC_APP_FIELD_NUMBER = 7;
    public static final int PARENTAL_CONTROL_CONNECT_FIELD_NUMBER = 8;
    public static final int PARENTAL_CONTROL_EXPLICIT_CONTENT_FIELD_NUMBER = 9;
    public static final int PARENTAL_CONTROL_VIDEO_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PRIVACY_POLICY_CONSENT_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean familyPlanManagerHasPin_;
    private boolean hasChildrenAllowedInMusicApp_;
    private ParentalControl parentalControlConnect_;
    private ParentalControl parentalControlExplicitContent_;
    private ParentalControl parentalControlVideo_;
    private int privacyPolicyConsentType_;
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";
    private String enforcedDateOfBirthMinDate_ = "";
    private String enforcedDateOfBirthMaxDate_ = "";

    static {
        InitChildAccountConfigResponse initChildAccountConfigResponse = new InitChildAccountConfigResponse();
        DEFAULT_INSTANCE = initChildAccountConfigResponse;
        h.registerDefaultInstance(InitChildAccountConfigResponse.class, initChildAccountConfigResponse);
    }

    private InitChildAccountConfigResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ\u0007\u0007\bဉ\u0000\tဉ\u0001\nဉ\u0002", new Object[]{"bitField0_", "familyPlanManagerHasPin_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_", "privacyPolicyConsentType_", "enforcedDateOfBirthMinDate_", "enforcedDateOfBirthMaxDate_", "hasChildrenAllowedInMusicApp_", "parentalControlConnect_", "parentalControlExplicitContent_", "parentalControlVideo_"});
        }
        if (iOrdinal == 3) {
            return new InitChildAccountConfigResponse();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (InitChildAccountConfigResponse.class) {
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

    public final String getDateOfBirthMaxDate() {
        return this.dateOfBirthMaxDate_;
    }

    public final String getDateOfBirthMinDate() {
        return this.dateOfBirthMinDate_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean n() {
        return this.familyPlanManagerHasPin_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.hasChildrenAllowedInMusicApp_;
    }

    public final ParentalControl p() {
        ParentalControl parentalControl = this.parentalControlExplicitContent_;
        return parentalControl == null ? ParentalControl.n() : parentalControl;
    }

    public final ParentalControl q() {
        ParentalControl parentalControl = this.parentalControlVideo_;
        return parentalControl == null ? ParentalControl.n() : parentalControl;
    }

    public final fc80 r() {
        fc80 fc80Var;
        int i = this.privacyPolicyConsentType_;
        if (i == 0) {
            fc80Var = fc80.UNKNOWN;
        } else if (i == 1) {
            fc80Var = fc80.COPPA;
        } else if (i == 2) {
            fc80Var = fc80.NON;
        } else if (i != 3) {
            fc80Var = i != 4 ? null : fc80.EXPLICIT;
        } else {
            fc80Var = fc80.IMPLICIT;
        }
        return fc80Var == null ? fc80.UNRECOGNIZED : fc80Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

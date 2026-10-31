package com.spotify.kidsaccount.api.v3.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.spw0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ParentRequirements extends h implements v2j0 {
    private static final ParentRequirements DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRIVACY_POLICY_CONSENT_TYPE_FIELD_NUMBER = 2;
    public static final int REQUIRE_PARENTAL_VERIFICATION_FIELD_NUMBER = 3;
    public static final int REQUIRE_PIN_SETUP_FIELD_NUMBER = 1;
    public static final int VERIFICATION_METHODS_FIELD_NUMBER = 4;
    private int privacyPolicyConsentType_;
    private boolean requireParentalVerification_;
    private boolean requirePinSetup_;
    private h290 verificationMethods_ = h.emptyProtobufList();

    static {
        ParentRequirements parentRequirements = new ParentRequirements();
        DEFAULT_INSTANCE = parentRequirements;
        h.registerDefaultInstance(ParentRequirements.class, parentRequirements);
    }

    private ParentRequirements() {
    }

    public static ParentRequirements n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0002\f\u0003\u0007\u0004\u001b", new Object[]{"requirePinSetup_", "privacyPolicyConsentType_", "requireParentalVerification_", "verificationMethods_", ParentalVerificationMethod.class});
        }
        if (iOrdinal == 3) {
            return new ParentRequirements();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (ParentRequirements.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final spw0 o() {
        spw0 spw0Var;
        int i = this.privacyPolicyConsentType_;
        if (i == 0) {
            spw0Var = spw0.PRIVACY_POLICY_CONSENT_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            spw0Var = spw0.PRIVACY_POLICY_CONSENT_TYPE_NON;
        } else if (i == 2) {
            spw0Var = spw0.PRIVACY_POLICY_CONSENT_TYPE_COPPA;
        } else if (i != 3) {
            spw0Var = i != 4 ? null : spw0.PRIVACY_POLICY_CONSENT_TYPE_EXPLICIT;
        } else {
            spw0Var = spw0.PRIVACY_POLICY_CONSENT_TYPE_IMPLICIT;
        }
        return spw0Var == null ? spw0.UNRECOGNIZED : spw0Var;
    }

    public final boolean p() {
        return this.requireParentalVerification_;
    }

    public final boolean q() {
        return this.requirePinSetup_;
    }

    public final h290 r() {
        return this.verificationMethods_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

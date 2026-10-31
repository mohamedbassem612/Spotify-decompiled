package com.spotify.kidsaccount.api.v3.proto;

import com.google.protobuf.h;
import p.bat;
import p.bf40;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetCreateChildConfigResponse extends h implements v2j0 {
    public static final int AGE_REQUIREMENTS_FIELD_NUMBER = 2;
    private static final GetCreateChildConfigResponse DEFAULT_INSTANCE;
    public static final int DENIAL_REASON_FIELD_NUMBER = 5;
    public static final int EXPECTED_ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 3;
    public static final int PARENT_REQUIREMENTS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private AgeRequirements ageRequirements_;
    private int bitField0_;
    private int denialReason_;
    private ExpectedAccountType expectedAccountType_;
    private ParentRequirements parentRequirements_;
    private ParentalControls parentalControls_;

    static {
        GetCreateChildConfigResponse getCreateChildConfigResponse = new GetCreateChildConfigResponse();
        DEFAULT_INSTANCE = getCreateChildConfigResponse;
        h.registerDefaultInstance(GetCreateChildConfigResponse.class, getCreateChildConfigResponse);
    }

    private GetCreateChildConfigResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\f", new Object[]{"bitField0_", "parentRequirements_", "ageRequirements_", "parentalControls_", "expectedAccountType_", "denialReason_"});
        }
        if (iOrdinal == 3) {
            return new GetCreateChildConfigResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (GetCreateChildConfigResponse.class) {
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

    public final AgeRequirements n() {
        AgeRequirements ageRequirements = this.ageRequirements_;
        return ageRequirements == null ? AgeRequirements.p() : ageRequirements;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final bat o() {
        bat batVarA = bat.a(this.denialReason_);
        return batVarA == null ? bat.f : batVarA;
    }

    public final ExpectedAccountType p() {
        ExpectedAccountType expectedAccountType = this.expectedAccountType_;
        return expectedAccountType == null ? ExpectedAccountType.n() : expectedAccountType;
    }

    public final ParentRequirements q() {
        ParentRequirements parentRequirements = this.parentRequirements_;
        return parentRequirements == null ? ParentRequirements.n() : parentRequirements;
    }

    public final ParentalControls r() {
        ParentalControls parentalControls = this.parentalControls_;
        return parentalControls == null ? ParentalControls.n() : parentalControls;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

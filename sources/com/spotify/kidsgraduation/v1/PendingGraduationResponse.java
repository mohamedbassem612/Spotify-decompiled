package com.spotify.kidsgraduation.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PendingGraduationResponse extends h implements v2j0 {
    private static final PendingGraduationResponse DEFAULT_INSTANCE;
    public static final int EXPECTED_ACCOUNT_TYPE_FIELD_NUMBER = 6;
    public static final int FORCED_GRADUATION_AGE_FIELD_NUMBER = 4;
    public static final int HAS_A_PENDING_REQUEST_FIELD_NUMBER = 1;
    public static final int MIN_GRADUATION_AGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_MANAGER_ADDRESS_FIELD_NUMBER = 5;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private ExpectedAccountType expectedAccountType_;
    private int forcedGraduationAge_;
    private boolean hasAPendingRequest_;
    private int minGraduationAge_;
    private String planManagerAddress_ = "";
    private Profile profile_;

    static {
        PendingGraduationResponse pendingGraduationResponse = new PendingGraduationResponse();
        DEFAULT_INSTANCE = pendingGraduationResponse;
        h.registerDefaultInstance(PendingGraduationResponse.class, pendingGraduationResponse);
    }

    private PendingGraduationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003\u000b\u0004\u000b\u0005ለ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "hasAPendingRequest_", "profile_", "minGraduationAge_", "forcedGraduationAge_", "planManagerAddress_", "expectedAccountType_"});
        }
        if (iOrdinal == 3) {
            return new PendingGraduationResponse();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (PendingGraduationResponse.class) {
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

    public final int getMinGraduationAge() {
        return this.minGraduationAge_;
    }

    public final ExpectedAccountType n() {
        ExpectedAccountType expectedAccountType = this.expectedAccountType_;
        return expectedAccountType == null ? ExpectedAccountType.n() : expectedAccountType;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.forcedGraduationAge_;
    }

    public final Profile p() {
        Profile profile = this.profile_;
        return profile == null ? Profile.n() : profile;
    }

    public final boolean q() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

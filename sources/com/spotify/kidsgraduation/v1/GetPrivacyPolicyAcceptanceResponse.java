package com.spotify.kidsgraduation.v1;

import com.google.protobuf.h;
import p.bf40;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.upw0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetPrivacyPolicyAcceptanceResponse extends h implements v2j0 {
    private static final GetPrivacyPolicyAcceptanceResponse DEFAULT_INSTANCE;
    public static final int GRADUATION_AGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRIVACY_POLICY_TYPE_FIELD_NUMBER = 1;
    private int graduationAge_;
    private int privacyPolicyType_;

    static {
        GetPrivacyPolicyAcceptanceResponse getPrivacyPolicyAcceptanceResponse = new GetPrivacyPolicyAcceptanceResponse();
        DEFAULT_INSTANCE = getPrivacyPolicyAcceptanceResponse;
        h.registerDefaultInstance(GetPrivacyPolicyAcceptanceResponse.class, getPrivacyPolicyAcceptanceResponse);
    }

    private GetPrivacyPolicyAcceptanceResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"privacyPolicyType_", "graduationAge_"});
        }
        if (iOrdinal == 3) {
            return new GetPrivacyPolicyAcceptanceResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (GetPrivacyPolicyAcceptanceResponse.class) {
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

    public final int n() {
        return this.graduationAge_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final upw0 o() {
        upw0 upw0Var;
        int i = this.privacyPolicyType_;
        if (i == 0) {
            upw0Var = upw0.PRIVACY_POLICY_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            upw0Var = upw0.PRIVACY_POLICY_TYPE_NON;
        } else if (i != 2) {
            upw0Var = i != 3 ? null : upw0.PRIVACY_POLICY_TYPE_IMPLICIT;
        } else {
            upw0Var = upw0.PRIVACY_POLICY_TYPE_EXPLICIT;
        }
        return upw0Var == null ? upw0.UNRECOGNIZED : upw0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

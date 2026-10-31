package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.dct0;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetYourPremiumBadgeResponse extends h implements v2j0 {
    private static final GetYourPremiumBadgeResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_COLOR_FIELD_NUMBER = 3;
    public static final int PLAN_NAME_SHORT_FIELD_NUMBER = 1;
    public static final int PLAN_TIER_FIELD_NUMBER = 2;
    private int planTier_;
    private String planNameShort_ = "";
    private String planColor_ = "";

    static {
        GetYourPremiumBadgeResponse getYourPremiumBadgeResponse = new GetYourPremiumBadgeResponse();
        DEFAULT_INSTANCE = getYourPremiumBadgeResponse;
        h.registerDefaultInstance(GetYourPremiumBadgeResponse.class, getYourPremiumBadgeResponse);
    }

    private GetYourPremiumBadgeResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"planNameShort_", "planTier_", "planColor_"});
        }
        if (iOrdinal == 3) {
            return new GetYourPremiumBadgeResponse();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (GetYourPremiumBadgeResponse.class) {
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
        return this.planColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.planNameShort_;
    }

    public final dct0 p() {
        dct0 dct0VarA = dct0.a(this.planTier_);
        return dct0VarA == null ? dct0.UNRECOGNIZED : dct0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

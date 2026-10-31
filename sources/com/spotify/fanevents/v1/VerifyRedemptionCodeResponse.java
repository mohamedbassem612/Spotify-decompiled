package com.spotify.fanevents.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.j711;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VerifyRedemptionCodeResponse extends h implements v2j0 {
    private static final VerifyRedemptionCodeResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        VerifyRedemptionCodeResponse verifyRedemptionCodeResponse = new VerifyRedemptionCodeResponse();
        DEFAULT_INSTANCE = verifyRedemptionCodeResponse;
        h.registerDefaultInstance(VerifyRedemptionCodeResponse.class, verifyRedemptionCodeResponse);
    }

    private VerifyRedemptionCodeResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new VerifyRedemptionCodeResponse();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (VerifyRedemptionCodeResponse.class) {
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

    public final j711 n() {
        j711 j711Var;
        int i = this.result_;
        if (i == 0) {
            j711Var = j711.REDEMPTION_STATE_UNSPECIFIED;
        } else if (i == 1) {
            j711Var = j711.REDEMPTION_STATE_PENDING;
        } else if (i == 2) {
            j711Var = j711.REDEMPTION_STATE_SUCCESS;
        } else if (i != 3) {
            j711Var = i != 4 ? null : j711.REDEMPTION_STATE_REDEEMED;
        } else {
            j711Var = j711.REDEMPTION_STATE_INVALID_CODE;
        }
        return j711Var == null ? j711.UNRECOGNIZED : j711Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.fanevents.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.q3j1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VerifyRedemptionCodeRequest extends h implements v2j0 {
    public static final int CODE_FIELD_NUMBER = 2;
    private static final VerifyRedemptionCodeRequest DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String eventId_ = "";
    private String code_ = "";

    static {
        VerifyRedemptionCodeRequest verifyRedemptionCodeRequest = new VerifyRedemptionCodeRequest();
        DEFAULT_INSTANCE = verifyRedemptionCodeRequest;
        h.registerDefaultInstance(VerifyRedemptionCodeRequest.class, verifyRedemptionCodeRequest);
    }

    private VerifyRedemptionCodeRequest() {
    }

    public static q3j1 n() {
        return (q3j1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"eventId_", "code_"});
        }
        if (iOrdinal == 3) {
            return new VerifyRedemptionCodeRequest();
        }
        if (iOrdinal == 4) {
            return new q3j1(DEFAULT_INSTANCE);
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
        synchronized (VerifyRedemptionCodeRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.code_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

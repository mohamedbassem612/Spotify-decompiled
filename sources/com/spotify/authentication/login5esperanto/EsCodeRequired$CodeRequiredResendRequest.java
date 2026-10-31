package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.slz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsCodeRequired$CodeRequiredResendRequest extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsCodeRequired$CodeRequiredResendRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EsAuthenticateContext$AuthenticateContext context_;

    static {
        EsCodeRequired$CodeRequiredResendRequest esCodeRequired$CodeRequiredResendRequest = new EsCodeRequired$CodeRequiredResendRequest();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequiredResendRequest;
        h.registerDefaultInstance(EsCodeRequired$CodeRequiredResendRequest.class, esCodeRequired$CodeRequiredResendRequest);
    }

    private EsCodeRequired$CodeRequiredResendRequest() {
    }

    public static slz n() {
        return (slz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "context_"});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequiredResendRequest();
        }
        if (iOrdinal == 4) {
            return new slz(DEFAULT_INSTANCE);
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
        synchronized (EsCodeRequired$CodeRequiredResendRequest.class) {
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

    public final void o(EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext) {
        this.context_ = esAuthenticateContext$AuthenticateContext;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

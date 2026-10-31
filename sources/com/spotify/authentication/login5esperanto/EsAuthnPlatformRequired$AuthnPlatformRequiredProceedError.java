package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.blz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError extends h implements v2j0 {
    private static final EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int error_;

    static {
        EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError esAuthnPlatformRequired$AuthnPlatformRequiredProceedError = new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError();
        DEFAULT_INSTANCE = esAuthnPlatformRequired$AuthnPlatformRequiredProceedError;
        h.registerDefaultInstance(EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError.class, esAuthnPlatformRequired$AuthnPlatformRequiredProceedError);
    }

    private EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError() {
    }

    public static EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"error_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (EsAuthnPlatformRequired$AuthnPlatformRequiredProceedError.class) {
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

    public final blz o() {
        blz blzVar = this.error_ != 0 ? null : blz.unknownContext;
        return blzVar == null ? blz.UNRECOGNIZED : blzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

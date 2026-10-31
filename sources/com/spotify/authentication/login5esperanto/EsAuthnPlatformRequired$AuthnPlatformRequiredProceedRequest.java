package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.clz;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_ASSERTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EsAuthenticateContext$AuthenticateContext context_;
    private phc identityAssertion_ = phc.b;

    static {
        EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest = new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest();
        DEFAULT_INSTANCE = esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest;
        h.registerDefaultInstance(EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.class, esAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest);
    }

    private EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest() {
    }

    public static clz n() {
        return (clz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n", new Object[]{"bitField0_", "context_", "identityAssertion_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest();
        }
        if (iOrdinal == 4) {
            return new clz(DEFAULT_INSTANCE);
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
        synchronized (EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.class) {
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

    public final void p(hhc hhcVar) {
        this.identityAssertion_ = hhcVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

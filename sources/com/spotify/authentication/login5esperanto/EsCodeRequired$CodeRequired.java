package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsCodeRequired$CodeRequired extends h implements v2j0 {
    public static final int CHALLENGECODE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsCodeRequired$CodeRequired DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EsCodeRequired.CodeRequiredCode challengeCode_;
    private EsAuthenticateContext.AuthenticateContext context_;

    static {
        EsCodeRequired$CodeRequired esCodeRequired$CodeRequired = new EsCodeRequired$CodeRequired();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequired;
        h.registerDefaultInstance(EsCodeRequired$CodeRequired.class, esCodeRequired$CodeRequired);
    }

    private EsCodeRequired$CodeRequired() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsCodeRequired$CodeRequired q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "context_", "challengeCode_"});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequired();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 10);
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
        synchronized (EsCodeRequired$CodeRequired.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsCodeRequired.CodeRequiredCode o() {
        EsCodeRequired.CodeRequiredCode codeRequiredCode = this.challengeCode_;
        return codeRequiredCode == null ? EsCodeRequired.CodeRequiredCode.p() : codeRequiredCode;
    }

    public final EsAuthenticateContext.AuthenticateContext p() {
        EsAuthenticateContext.AuthenticateContext authenticateContext = this.context_;
        return authenticateContext == null ? EsAuthenticateContext.AuthenticateContext.n() : authenticateContext;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

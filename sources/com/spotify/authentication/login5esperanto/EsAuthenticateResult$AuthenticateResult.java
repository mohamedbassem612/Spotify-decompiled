package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;
import p.zjy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateResult$AuthenticateResult extends h implements v2j0 {
    public static final int AUTHNPLATFORMREQUIRED_FIELD_NUMBER = 6;
    public static final int CODEREQUIRED_FIELD_NUMBER = 3;
    private static final EsAuthenticateResult$AuthenticateResult DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 2;
    public static final int INTERACTIONREQUIRED_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNUPREQUIRED_FIELD_NUMBER = 4;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsAuthenticateResult$AuthenticateResult esAuthenticateResult$AuthenticateResult = new EsAuthenticateResult$AuthenticateResult();
        DEFAULT_INSTANCE = esAuthenticateResult$AuthenticateResult;
        h.registerDefaultInstance(EsAuthenticateResult$AuthenticateResult.class, esAuthenticateResult$AuthenticateResult);
    }

    private EsAuthenticateResult$AuthenticateResult() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsAuthenticateResult$AuthenticateResult v(byte[] bArr) {
        return (EsAuthenticateResult$AuthenticateResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"result_", "resultCase_", EsAuthenticateResult$AuthenticateSuccess.class, EsAuthenticateResult$AuthenticateFailure.class, EsCodeRequired$CodeRequired.class, EsSignupRequired$SignupRequired.class, EsInteractionRequired$InteractionRequired.class, EsAuthnPlatformRequired.AuthnPlatformRequired.class});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateResult$AuthenticateResult();
        }
        if (iOrdinal == 4) {
            return new rdz((byte) 15);
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
        synchronized (EsAuthenticateResult$AuthenticateResult.class) {
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

    public final EsAuthnPlatformRequired.AuthnPlatformRequired o() {
        return this.resultCase_ == 6 ? (EsAuthnPlatformRequired.AuthnPlatformRequired) this.result_ : EsAuthnPlatformRequired.AuthnPlatformRequired.o();
    }

    public final EsCodeRequired$CodeRequired p() {
        return this.resultCase_ == 3 ? (EsCodeRequired$CodeRequired) this.result_ : EsCodeRequired$CodeRequired.q();
    }

    public final EsAuthenticateResult$AuthenticateFailure q() {
        return this.resultCase_ == 2 ? (EsAuthenticateResult$AuthenticateFailure) this.result_ : EsAuthenticateResult$AuthenticateFailure.o();
    }

    public final EsInteractionRequired$InteractionRequired r() {
        return this.resultCase_ == 5 ? (EsInteractionRequired$InteractionRequired) this.result_ : EsInteractionRequired$InteractionRequired.p();
    }

    public final int s() {
        return zjy.c(this.resultCase_);
    }

    public final EsSignupRequired$SignupRequired t() {
        return this.resultCase_ == 4 ? (EsSignupRequired$SignupRequired) this.result_ : EsSignupRequired$SignupRequired.p();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final EsAuthenticateResult$AuthenticateSuccess u() {
        return this.resultCase_ == 1 ? (EsAuthenticateResult$AuthenticateSuccess) this.result_ : EsAuthenticateResult$AuthenticateSuccess.q();
    }
}

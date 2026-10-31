package com.spotify.passkeys.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class FinishAuthenticationResponse extends h implements v2j0 {
    private static final FinishAuthenticationResponse DEFAULT_INSTANCE;
    public static final int IDENTITY_ASSERTION_FIELD_NUMBER = 2;
    public static final int ONE_TIME_TOKEN_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int loginCredentialCase_ = 0;
    private Object loginCredential_;

    static {
        FinishAuthenticationResponse finishAuthenticationResponse = new FinishAuthenticationResponse();
        DEFAULT_INSTANCE = finishAuthenticationResponse;
        h.registerDefaultInstance(FinishAuthenticationResponse.class, finishAuthenticationResponse);
    }

    private FinishAuthenticationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"loginCredential_", "loginCredentialCase_", OneTimeToken.class, IdentityAssertion.class});
        }
        if (iOrdinal == 3) {
            return new FinishAuthenticationResponse();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (FinishAuthenticationResponse.class) {
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

    public final IdentityAssertion n() {
        return this.loginCredentialCase_ == 2 ? (IdentityAssertion) this.loginCredential_ : IdentityAssertion.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.loginCredentialCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

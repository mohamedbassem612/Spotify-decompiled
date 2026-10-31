package com.spotify.passkeys.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.hi20;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FinishAuthenticationRequest extends h implements v2j0 {
    public static final int AUTHENTICATOR_DATA_FIELD_NUMBER = 5;
    public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 4;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 3;
    private static final FinishAuthenticationRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_ASSERTION_OPTIONS_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 1;
    public static final int SIGNATURE_FIELD_NUMBER = 6;
    public static final int USER_HANDLE_FIELD_NUMBER = 7;
    private phc authenticatorData_;
    private int bitField0_;
    private phc clientDataJson_;
    private phc credentialId_;
    private IdentityAssertionOptions identityAssertionOptions_;
    private String sessionId_ = "";
    private Signals signals_;
    private phc signature_;
    private phc userHandle_;

    static {
        FinishAuthenticationRequest finishAuthenticationRequest = new FinishAuthenticationRequest();
        DEFAULT_INSTANCE = finishAuthenticationRequest;
        h.registerDefaultInstance(FinishAuthenticationRequest.class, finishAuthenticationRequest);
    }

    private FinishAuthenticationRequest() {
        hhc hhcVar = phc.b;
        this.credentialId_ = hhcVar;
        this.clientDataJson_ = hhcVar;
        this.authenticatorData_ = hhcVar;
        this.signature_ = hhcVar;
        this.userHandle_ = hhcVar;
    }

    public static hi20 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\bဉ\u0001", new Object[]{"bitField0_", "signals_", "sessionId_", "credentialId_", "clientDataJson_", "authenticatorData_", "signature_", "userHandle_", "identityAssertionOptions_"});
        }
        if (iOrdinal == 3) {
            return new FinishAuthenticationRequest();
        }
        if (iOrdinal == 4) {
            return new hi20();
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
        synchronized (FinishAuthenticationRequest.class) {
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

    public final void p(hhc hhcVar) {
        this.authenticatorData_ = hhcVar;
    }

    public final void q(hhc hhcVar) {
        this.clientDataJson_ = hhcVar;
    }

    public final void r(hhc hhcVar) {
        this.credentialId_ = hhcVar;
    }

    public final void s(IdentityAssertionOptions identityAssertionOptions) {
        identityAssertionOptions.getClass();
        this.identityAssertionOptions_ = identityAssertionOptions;
        this.bitField0_ |= 2;
    }

    public final void t(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(Signals signals) {
        signals.getClass();
        this.signals_ = signals;
        this.bitField0_ |= 1;
    }

    public final void v(hhc hhcVar) {
        this.signature_ = hhcVar;
    }

    public final void w(hhc hhcVar) {
        this.userHandle_ = hhcVar;
    }
}

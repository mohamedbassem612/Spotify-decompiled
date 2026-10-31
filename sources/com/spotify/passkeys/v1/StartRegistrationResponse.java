package com.spotify.passkeys.v1;

import com.google.protobuf.h;
import p.am7;
import p.bf40;
import p.h290;
import p.jf40;
import p.o9b1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class StartRegistrationResponse extends h implements v2j0 {
    public static final int ATTESTATION_FIELD_NUMBER = 8;
    public static final int AUTHENTICATOR_SELECTION_FIELD_NUMBER = 7;
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    private static final StartRegistrationResponse DEFAULT_INSTANCE;
    public static final int EXCLUDE_CREDENTIALS_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PUB_KEY_CRED_PARAMS_FIELD_NUMBER = 5;
    public static final int RP_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 9;
    public static final int USER_FIELD_NUMBER = 4;
    private int attestation_;
    private AuthenticatorSelection authenticatorSelection_;
    private int bitField0_;
    private RelyingParty rp_;
    private long timeoutMs_;
    private PasskeyUser user_;
    private String sessionId_ = "";
    private phc challenge_ = phc.b;
    private h290 pubKeyCredParams_ = h.emptyProtobufList();
    private h290 excludeCredentials_ = h.emptyProtobufList();

    static {
        StartRegistrationResponse startRegistrationResponse = new StartRegistrationResponse();
        DEFAULT_INSTANCE = startRegistrationResponse;
        h.registerDefaultInstance(StartRegistrationResponse.class, startRegistrationResponse);
    }

    private StartRegistrationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002\n\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0006\u001b\u0007ဉ\u0002\b\f\t\u0003", new Object[]{"bitField0_", "sessionId_", "challenge_", "rp_", "user_", "pubKeyCredParams_", PubKeyCredParam.class, "excludeCredentials_", ExcludedCredential.class, "authenticatorSelection_", "attestation_", "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new StartRegistrationResponse();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (StartRegistrationResponse.class) {
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

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final am7 n() {
        am7 am7Var;
        int i = this.attestation_;
        if (i == 0) {
            am7Var = am7.ATTESTATION_UNSPECIFIED;
        } else if (i == 1) {
            am7Var = am7.ATTESTATION_NONE;
        } else if (i == 2) {
            am7Var = am7.ATTESTATION_INDIRECT;
        } else if (i != 3) {
            am7Var = i != 4 ? null : am7.ATTESTATION_ENTERPRISE;
        } else {
            am7Var = am7.ATTESTATION_DIRECT;
        }
        return am7Var == null ? am7.UNRECOGNIZED : am7Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AuthenticatorSelection o() {
        AuthenticatorSelection authenticatorSelection = this.authenticatorSelection_;
        return authenticatorSelection == null ? AuthenticatorSelection.o() : authenticatorSelection;
    }

    public final phc p() {
        return this.challenge_;
    }

    public final h290 q() {
        return this.excludeCredentials_;
    }

    public final h290 r() {
        return this.pubKeyCredParams_;
    }

    public final RelyingParty s() {
        RelyingParty relyingParty = this.rp_;
        return relyingParty == null ? RelyingParty.n() : relyingParty;
    }

    public final long t() {
        return this.timeoutMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final PasskeyUser u() {
        PasskeyUser passkeyUser = this.user_;
        return passkeyUser == null ? PasskeyUser.n() : passkeyUser;
    }
}

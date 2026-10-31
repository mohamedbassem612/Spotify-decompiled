package com.spotify.passkeys.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jji1;
import p.o9b1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class StartAuthenticationResponse extends h implements v2j0 {
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    private static final StartAuthenticationResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RP_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 5;
    public static final int USER_VERIFICATION_FIELD_NUMBER = 4;
    private long timeoutMs_;
    private int userVerification_;
    private String sessionId_ = "";
    private phc challenge_ = phc.b;
    private String rpId_ = "";

    static {
        StartAuthenticationResponse startAuthenticationResponse = new StartAuthenticationResponse();
        DEFAULT_INSTANCE = startAuthenticationResponse;
        h.registerDefaultInstance(StartAuthenticationResponse.class, startAuthenticationResponse);
    }

    private StartAuthenticationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ\u0004\f\u0005\u0003", new Object[]{"sessionId_", "challenge_", "rpId_", "userVerification_", "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new StartAuthenticationResponse();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (StartAuthenticationResponse.class) {
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

    public final phc n() {
        return this.challenge_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.rpId_;
    }

    public final long p() {
        return this.timeoutMs_;
    }

    public final jji1 q() {
        jji1 jji1VarA = jji1.a(this.userVerification_);
        return jji1VarA == null ? jji1.UNRECOGNIZED : jji1VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

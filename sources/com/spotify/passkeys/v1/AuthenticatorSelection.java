package com.spotify.passkeys.v1;

import com.google.protobuf.h;
import p.bf40;
import p.dm8;
import p.jf40;
import p.jf8;
import p.jji1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vs21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AuthenticatorSelection extends h implements v2j0 {
    public static final int AUTHENTICATOR_ATTACHMENT_FIELD_NUMBER = 1;
    private static final AuthenticatorSelection DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESIDENT_KEY_FIELD_NUMBER = 2;
    public static final int USER_VERIFICATION_FIELD_NUMBER = 3;
    private int authenticatorAttachment_;
    private int residentKey_;
    private int userVerification_;

    static {
        AuthenticatorSelection authenticatorSelection = new AuthenticatorSelection();
        DEFAULT_INSTANCE = authenticatorSelection;
        h.registerDefaultInstance(AuthenticatorSelection.class, authenticatorSelection);
    }

    private AuthenticatorSelection() {
    }

    public static AuthenticatorSelection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"authenticatorAttachment_", "residentKey_", "userVerification_"});
        }
        if (iOrdinal == 3) {
            return new AuthenticatorSelection();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (AuthenticatorSelection.class) {
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

    public final dm8 n() {
        dm8 dm8Var;
        int i = this.authenticatorAttachment_;
        if (i == 0) {
            dm8Var = dm8.AUTHENTICATOR_ATTACHMENT_UNSPECIFIED;
        } else if (i != 1) {
            dm8Var = i != 2 ? null : dm8.AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM;
        } else {
            dm8Var = dm8.AUTHENTICATOR_ATTACHMENT_PLATFORM;
        }
        return dm8Var == null ? dm8.UNRECOGNIZED : dm8Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final vs21 p() {
        vs21 vs21Var;
        int i = this.residentKey_;
        if (i == 0) {
            vs21Var = vs21.RESIDENT_KEY_UNSPECIFIED;
        } else if (i == 1) {
            vs21Var = vs21.RESIDENT_KEY_REQUIRED;
        } else if (i != 2) {
            vs21Var = i != 3 ? null : vs21.RESIDENT_KEY_DISCOURAGED;
        } else {
            vs21Var = vs21.RESIDENT_KEY_PREFERRED;
        }
        return vs21Var == null ? vs21.UNRECOGNIZED : vs21Var;
    }

    public final jji1 q() {
        jji1 jji1VarA = jji1.a(this.userVerification_);
        return jji1VarA == null ? jji1.UNRECOGNIZED : jji1VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

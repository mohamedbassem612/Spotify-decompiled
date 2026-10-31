package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qkz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateCredentials$GoogleSignInCredentials extends h implements v2j0 {
    public static final int AUTHCODE_FIELD_NUMBER = 1;
    private static final EsAuthenticateCredentials$GoogleSignInCredentials DEFAULT_INSTANCE;
    public static final int IDTOKEN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECTURI_FIELD_NUMBER = 2;
    private String authCode_ = "";
    private String redirectUri_ = "";
    private String idToken_ = "";

    static {
        EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials = new EsAuthenticateCredentials$GoogleSignInCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$GoogleSignInCredentials;
        h.registerDefaultInstance(EsAuthenticateCredentials$GoogleSignInCredentials.class, esAuthenticateCredentials$GoogleSignInCredentials);
    }

    private EsAuthenticateCredentials$GoogleSignInCredentials() {
    }

    public static qkz o() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"authCode_", "redirectUri_", "idToken_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$GoogleSignInCredentials();
        }
        if (iOrdinal == 4) {
            return new qkz();
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
        synchronized (EsAuthenticateCredentials$GoogleSignInCredentials.class) {
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

    public final void p(String str) {
        str.getClass();
        this.authCode_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.idToken_ = str;
    }

    public final void r(String str) {
        this.redirectUri_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

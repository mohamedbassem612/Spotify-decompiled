package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import p.bf40;
import p.jf40;
import p.nkz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateCredentials$AuthenticateCredentials extends h implements v2j0 {
    public static final int APPLESIGNINCREDENTIALS_FIELD_NUMBER = 8;
    public static final int AUTHNPLATFORMCREDENTIAL_FIELD_NUMBER = 14;
    private static final EsAuthenticateCredentials$AuthenticateCredentials DEFAULT_INSTANCE;
    public static final int EMAILADDRESS_FIELD_NUMBER = 13;
    public static final int FACEBOOKACCESSTOKEN_FIELD_NUMBER = 9;
    public static final int GOOGLESIGNINCREDENTIALS_FIELD_NUMBER = 7;
    public static final int LEGACYV3PASSWORD_FIELD_NUMBER = 10;
    public static final int NATIVEPASSWORD_FIELD_NUMBER = 11;
    public static final int NAVERSIGNINCREDENTIALS_FIELD_NUMBER = 12;
    public static final int ONETIMETOKEN_FIELD_NUMBER = 2;
    public static final int PARENTCHILDCREDENTIALS_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 1;
    public static final int PHONENUMBER_FIELD_NUMBER = 3;
    public static final int SAMSUNGSIGNINCREDENTIALS_FIELD_NUMBER = 5;
    public static final int UNENCRYPTEDSTOREDCREDENTIALS_FIELD_NUMBER = 4;
    private int credentialsCase_ = 0;
    private Object credentials_;

    static {
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = new EsAuthenticateCredentials$AuthenticateCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$AuthenticateCredentials;
        h.registerDefaultInstance(EsAuthenticateCredentials$AuthenticateCredentials.class, esAuthenticateCredentials$AuthenticateCredentials);
    }

    private EsAuthenticateCredentials$AuthenticateCredentials() {
    }

    public static nkz n() {
        return (nkz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials) {
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        this.credentials_ = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        this.credentialsCase_ = 4;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"credentials_", "credentialsCase_", EsAuthenticateCredentials$Password.class, EsAuthenticateCredentials$OneTimeToken.class, EsAuthenticateCredentials$PhoneNumber.class, EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class, EsAuthenticateCredentials$SamsungSignInCredentials.class, EsAuthenticateCredentials$ParentChildCredentials.class, EsAuthenticateCredentials$GoogleSignInCredentials.class, EsAuthenticateCredentials$AppleSignInCredentials.class, EsAuthenticateCredentials$FacebookAccessToken.class, EsAuthenticateCredentials$LegacyV3Password.class, EsAuthenticateCredentials$NativePassword.class, EsAuthenticateCredentials$NaverSignInCredentials.class, EsAuthenticateCredentials$EmailAddress.class, EsAuthenticateCredentials.AuthnPlatformCredential.class});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$AuthenticateCredentials();
        }
        if (iOrdinal == 4) {
            return new nkz(DEFAULT_INSTANCE);
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
        synchronized (EsAuthenticateCredentials$AuthenticateCredentials.class) {
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

    public final void o(EsAuthenticateCredentials.AuthnPlatformCredential authnPlatformCredential) {
        authnPlatformCredential.getClass();
        this.credentials_ = authnPlatformCredential;
        this.credentialsCase_ = 14;
    }

    public final void p(EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress) {
        esAuthenticateCredentials$EmailAddress.getClass();
        this.credentials_ = esAuthenticateCredentials$EmailAddress;
        this.credentialsCase_ = 13;
    }

    public final void q(EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken) {
        esAuthenticateCredentials$FacebookAccessToken.getClass();
        this.credentials_ = esAuthenticateCredentials$FacebookAccessToken;
        this.credentialsCase_ = 9;
    }

    public final void r(EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials) {
        esAuthenticateCredentials$GoogleSignInCredentials.getClass();
        this.credentials_ = esAuthenticateCredentials$GoogleSignInCredentials;
        this.credentialsCase_ = 7;
    }

    public final void s(EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password) {
        esAuthenticateCredentials$LegacyV3Password.getClass();
        this.credentials_ = esAuthenticateCredentials$LegacyV3Password;
        this.credentialsCase_ = 10;
    }

    public final void t(EsAuthenticateCredentials$NativePassword esAuthenticateCredentials$NativePassword) {
        esAuthenticateCredentials$NativePassword.getClass();
        this.credentials_ = esAuthenticateCredentials$NativePassword;
        this.credentialsCase_ = 11;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials) {
        esAuthenticateCredentials$NaverSignInCredentials.getClass();
        this.credentials_ = esAuthenticateCredentials$NaverSignInCredentials;
        this.credentialsCase_ = 12;
    }

    public final void v(EsAuthenticateCredentials$OneTimeToken esAuthenticateCredentials$OneTimeToken) {
        esAuthenticateCredentials$OneTimeToken.getClass();
        this.credentials_ = esAuthenticateCredentials$OneTimeToken;
        this.credentialsCase_ = 2;
    }

    public final void w(EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials) {
        esAuthenticateCredentials$ParentChildCredentials.getClass();
        this.credentials_ = esAuthenticateCredentials$ParentChildCredentials;
        this.credentialsCase_ = 6;
    }

    public final void x(EsAuthenticateCredentials$Password esAuthenticateCredentials$Password) {
        esAuthenticateCredentials$Password.getClass();
        this.credentials_ = esAuthenticateCredentials$Password;
        this.credentialsCase_ = 1;
    }

    public final void y(EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber) {
        esAuthenticateCredentials$PhoneNumber.getClass();
        this.credentials_ = esAuthenticateCredentials$PhoneNumber;
        this.credentialsCase_ = 3;
    }

    public final void z(EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials) {
        esAuthenticateCredentials$SamsungSignInCredentials.getClass();
        this.credentials_ = esAuthenticateCredentials$SamsungSignInCredentials;
        this.credentialsCase_ = 5;
    }
}

package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eo70;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class IdentityProviderIdentifier extends h implements v2j0 {
    public static final int APPLE_PROVIDER_FIELD_NUMBER = 102;
    private static final IdentityProviderIdentifier DEFAULT_INSTANCE;
    public static final int EMAIL_OTP_PROVIDER_FIELD_NUMBER = 105;
    public static final int GOOGLE_PROVIDER_FIELD_NUMBER = 101;
    public static final int NAVER_PROVIDER_FIELD_NUMBER = 104;
    private static volatile qzr0 PARSER = null;
    public static final int PHONE_NUMBER_PROVIDER_FIELD_NUMBER = 103;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private Object provider_;
    private int providerCase_ = 0;
    private String token_ = "";

    static {
        IdentityProviderIdentifier identityProviderIdentifier = new IdentityProviderIdentifier();
        DEFAULT_INSTANCE = identityProviderIdentifier;
        h.registerDefaultInstance(IdentityProviderIdentifier.class, identityProviderIdentifier);
    }

    private IdentityProviderIdentifier() {
    }

    public static eo70 n() {
        return (eo70) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001i\u0006\u0000\u0000\u0000\u0001Ȉe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000", new Object[]{"provider_", "providerCase_", "token_", GoogleProvider.class, AppleProvider.class, PhoneNumberProvider.class, NaverProvider.class, EmailOtpProvider.class});
        }
        if (iOrdinal == 3) {
            return new IdentityProviderIdentifier();
        }
        if (iOrdinal == 4) {
            return new eo70(DEFAULT_INSTANCE);
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
        synchronized (IdentityProviderIdentifier.class) {
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

    public final void o(EmailOtpProvider emailOtpProvider) {
        emailOtpProvider.getClass();
        this.provider_ = emailOtpProvider;
        this.providerCase_ = 105;
    }

    public final void p(GoogleProvider googleProvider) {
        googleProvider.getClass();
        this.provider_ = googleProvider;
        this.providerCase_ = 101;
    }

    public final void q(NaverProvider naverProvider) {
        naverProvider.getClass();
        this.provider_ = naverProvider;
        this.providerCase_ = 104;
    }

    public final void r(PhoneNumberProvider phoneNumberProvider) {
        phoneNumberProvider.getClass();
        this.provider_ = phoneNumberProvider;
        this.providerCase_ = 103;
    }

    public final void s(String str) {
        str.getClass();
        this.token_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

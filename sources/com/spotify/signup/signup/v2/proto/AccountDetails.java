package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ll;
import p.ml;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class AccountDetails extends h implements v2j0 {
    public static final int BIRTHDATE_FIELD_NUMBER = 2;
    public static final int CONSENT_FLAGS_FIELD_NUMBER = 4;
    private static final AccountDetails DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int EMAIL_AND_PASSWORD_IDENTIFIER_FIELD_NUMBER = 101;
    public static final int GENDER_FIELD_NUMBER = 3;
    public static final int GRADUATION_IDENTIFIER_FIELD_NUMBER = 102;
    public static final int IDENTITY_PROVIDER_IDENTIFIER_FIELD_NUMBER = 103;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ConsentFlags consentFlags_;
    private int gender_;
    private Object identifier_;
    private int identifierCase_ = 0;
    private String displayName_ = "";
    private String birthdate_ = "";

    static {
        AccountDetails accountDetails = new AccountDetails();
        DEFAULT_INSTANCE = accountDetails;
        h.registerDefaultInstance(AccountDetails.class, accountDetails);
    }

    private AccountDetails() {
    }

    public static ll p() {
        return (ll) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001g\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဉ\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"identifier_", "identifierCase_", "bitField0_", "displayName_", "birthdate_", "gender_", "consentFlags_", EmailAndPasswordIdentifier.class, GraduationIdentifier.class, IdentityProviderIdentifier.class});
        }
        if (iOrdinal == 3) {
            return new AccountDetails();
        }
        if (iOrdinal == 4) {
            return new ll(DEFAULT_INSTANCE);
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
        synchronized (AccountDetails.class) {
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

    public final EmailAndPasswordIdentifier n() {
        return this.identifierCase_ == 101 ? (EmailAndPasswordIdentifier) this.identifier_ : EmailAndPasswordIdentifier.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.identifierCase_ == 101;
    }

    public final void q(String str) {
        str.getClass();
        this.birthdate_ = str;
    }

    public final void r(ConsentFlags consentFlags) {
        consentFlags.getClass();
        this.consentFlags_ = consentFlags;
        this.bitField0_ |= 1;
    }

    public final void s(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    public final void t(EmailAndPasswordIdentifier emailAndPasswordIdentifier) {
        emailAndPasswordIdentifier.getClass();
        this.identifier_ = emailAndPasswordIdentifier;
        this.identifierCase_ = 101;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(ml mlVar) {
        this.gender_ = mlVar.getNumber();
    }

    public final void v(GraduationIdentifier graduationIdentifier) {
        graduationIdentifier.getClass();
        this.identifier_ = graduationIdentifier;
        this.identifierCase_ = 102;
    }

    public final void w(IdentityProviderIdentifier identityProviderIdentifier) {
        identityProviderIdentifier.getClass();
        this.identifier_ = identityProviderIdentifier;
        this.identifierCase_ = 103;
    }
}

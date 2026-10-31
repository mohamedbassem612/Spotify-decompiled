package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.trz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsSignupRequired$SignupRequired extends h implements v2j0 {
    public static final int BIRTHDATE_FIELD_NUMBER = 4;
    private static final EsSignupRequired$SignupRequired DEFAULT_INSTANCE;
    public static final int EMAILALREADYREGISTERED_FIELD_NUMBER = 8;
    public static final int EMAIL_FIELD_NUMBER = 2;
    public static final int GENDER_FIELD_NUMBER = 5;
    public static final int IDENTIFIERTOKEN_FIELD_NUMBER = 9;
    public static final int ISEMAILVERIFIED_FIELD_NUMBER = 3;
    public static final int ISPHONENUMBERVERIFIED_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PHONENUMBER_FIELD_NUMBER = 6;
    private boolean emailAlreadyRegistered_;
    private int gender_;
    private boolean isEmailVerified_;
    private boolean isPhoneNumberVerified_;
    private String name_ = "";
    private String email_ = "";
    private String birthdate_ = "";
    private String phoneNumber_ = "";
    private String identifierToken_ = "";

    static {
        EsSignupRequired$SignupRequired esSignupRequired$SignupRequired = new EsSignupRequired$SignupRequired();
        DEFAULT_INSTANCE = esSignupRequired$SignupRequired;
        h.registerDefaultInstance(EsSignupRequired$SignupRequired.class, esSignupRequired$SignupRequired);
    }

    private EsSignupRequired$SignupRequired() {
    }

    public static EsSignupRequired$SignupRequired p() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\f\u0006Ȉ\u0007\u0007\b\u0007\tȈ", new Object[]{"name_", "email_", "isEmailVerified_", "birthdate_", "gender_", "phoneNumber_", "isPhoneNumberVerified_", "emailAlreadyRegistered_", "identifierToken_"});
        }
        if (iOrdinal == 3) {
            return new EsSignupRequired$SignupRequired();
        }
        if (iOrdinal == 4) {
            return new lrz((byte) 4);
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
        synchronized (EsSignupRequired$SignupRequired.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.birthdate_;
    }

    public final String q() {
        return this.email_;
    }

    public final boolean r() {
        return this.emailAlreadyRegistered_;
    }

    public final trz s() {
        trz trzVar;
        int i = this.gender_;
        if (i == 0) {
            trzVar = trz.UNKNOWN;
        } else if (i == 1) {
            trzVar = trz.MALE;
        } else if (i != 2) {
            trzVar = i != 3 ? null : trz.NEUTRAL;
        } else {
            trzVar = trz.FEMALE;
        }
        return trzVar == null ? trz.UNRECOGNIZED : trzVar;
    }

    public final String t() {
        return this.identifierToken_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.isEmailVerified_;
    }

    public final boolean v() {
        return this.isPhoneNumberVerified_;
    }

    public final String w() {
        return this.phoneNumber_;
    }
}

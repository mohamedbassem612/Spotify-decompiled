package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.okz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateCredentials$EmailAddress extends h implements v2j0 {
    private static final EsAuthenticateCredentials$EmailAddress DEFAULT_INSTANCE;
    public static final int EMAILADDRESS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String emailAddress_ = "";

    static {
        EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress = new EsAuthenticateCredentials$EmailAddress();
        DEFAULT_INSTANCE = esAuthenticateCredentials$EmailAddress;
        h.registerDefaultInstance(EsAuthenticateCredentials$EmailAddress.class, esAuthenticateCredentials$EmailAddress);
    }

    private EsAuthenticateCredentials$EmailAddress() {
    }

    public static okz o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"emailAddress_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$EmailAddress();
        }
        if (iOrdinal == 4) {
            return new okz();
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
        synchronized (EsAuthenticateCredentials$EmailAddress.class) {
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
        this.emailAddress_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

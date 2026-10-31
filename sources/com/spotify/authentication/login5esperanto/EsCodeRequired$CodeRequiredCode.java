package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.olz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsCodeRequired$CodeRequiredCode extends h implements v2j0 {
    public static final int CANONICALPHONENUMBER_FIELD_NUMBER = 3;
    public static final int CODELENGTH_FIELD_NUMBER = 2;
    private static final EsCodeRequired$CodeRequiredCode DEFAULT_INSTANCE;
    public static final int EMAILADDRESS_FIELD_NUMBER = 7;
    public static final int EXPIRES_AT_FIELD_NUMBER = 4;
    public static final int EXPIRES_IN_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RETRY_NUMBER_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int codeLength_;
    private long expiresAt_;
    private long expiresIn_;
    private int retryNumber_;
    private int type_;
    private String canonicalPhoneNumber_ = "";
    private String emailAddress_ = "";

    static {
        EsCodeRequired$CodeRequiredCode esCodeRequired$CodeRequiredCode = new EsCodeRequired$CodeRequiredCode();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequiredCode;
        h.registerDefaultInstance(EsCodeRequired$CodeRequiredCode.class, esCodeRequired$CodeRequiredCode);
    }

    private EsCodeRequired$CodeRequiredCode() {
    }

    public static EsCodeRequired$CodeRequiredCode p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003Ȉ\u0004\u0002\u0005\u0002\u0006\u0004\u0007Ȉ", new Object[]{"type_", "codeLength_", "canonicalPhoneNumber_", "expiresAt_", "expiresIn_", "retryNumber_", "emailAddress_"});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequiredCode();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (EsCodeRequired$CodeRequiredCode.class) {
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

    public final String n() {
        return this.canonicalPhoneNumber_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.codeLength_;
    }

    public final String q() {
        return this.emailAddress_;
    }

    public final long r() {
        return this.expiresAt_;
    }

    public final long s() {
        return this.expiresIn_;
    }

    public final int t() {
        return this.retryNumber_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final olz u() {
        olz olzVar;
        int i = this.type_;
        if (i == 0) {
            olzVar = olz.b;
        } else if (i != 1) {
            olzVar = i != 2 ? null : olz.d;
        } else {
            olzVar = olz.c;
        }
        return olzVar == null ? olz.e : olzVar;
    }
}

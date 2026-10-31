package com.spotify.kidsaccount.api.v3.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ParentalVerificationMethod extends h implements v2j0 {
    public static final int CARD_FIELD_NUMBER = 2;
    private static final ParentalVerificationMethod DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int YOTI_FIELD_NUMBER = 1;
    private int methodDataCase_ = 0;
    private Object methodData_;

    static {
        ParentalVerificationMethod parentalVerificationMethod = new ParentalVerificationMethod();
        DEFAULT_INSTANCE = parentalVerificationMethod;
        h.registerDefaultInstance(ParentalVerificationMethod.class, parentalVerificationMethod);
    }

    private ParentalVerificationMethod() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"methodData_", "methodDataCase_", YotiParentalVerification.class, CardParentalVerification.class});
        }
        if (iOrdinal == 3) {
            return new ParentalVerificationMethod();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (ParentalVerificationMethod.class) {
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

    public final CardParentalVerification n() {
        return this.methodDataCase_ == 2 ? (CardParentalVerification) this.methodData_ : CardParentalVerification.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.methodDataCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final YotiParentalVerification p() {
        return this.methodDataCase_ == 1 ? (YotiParentalVerification) this.methodData_ : YotiParentalVerification.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

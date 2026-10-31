package com.spotify.kidsaccount.api.v3.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.gnm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class YotiParentalVerification extends h implements v2j0 {
    private static final YotiParentalVerification DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        YotiParentalVerification yotiParentalVerification = new YotiParentalVerification();
        DEFAULT_INSTANCE = yotiParentalVerification;
        h.registerDefaultInstance(YotiParentalVerification.class, yotiParentalVerification);
    }

    private YotiParentalVerification() {
    }

    public static YotiParentalVerification n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new YotiParentalVerification();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (YotiParentalVerification.class) {
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

    public final gnm1 o() {
        gnm1 gnm1Var;
        int i = this.type_;
        if (i == 0) {
            gnm1Var = gnm1.YOTI_VERIFICATION_TYPE_UNKNOWN;
        } else if (i != 1) {
            gnm1Var = i != 2 ? null : gnm1.YOTI_VERIFICATION_TYPE_ID_ONLY;
        } else {
            gnm1Var = gnm1.YOTI_VERIFICATION_TYPE_ID_AND_SELFIE;
        }
        return gnm1Var == null ? gnm1.UNRECOGNIZED : gnm1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

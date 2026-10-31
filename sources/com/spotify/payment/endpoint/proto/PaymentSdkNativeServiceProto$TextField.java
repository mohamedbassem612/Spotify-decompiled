package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.scs0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$TextField extends com.google.protobuf.h implements v2j0 {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final PaymentSdkNativeServiceProto$TextField DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VARIANT_FIELD_NUMBER = 2;
    private String content_ = "";
    private int variant_;

    static {
        PaymentSdkNativeServiceProto$TextField paymentSdkNativeServiceProto$TextField = new PaymentSdkNativeServiceProto$TextField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$TextField;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$TextField.class, paymentSdkNativeServiceProto$TextField);
    }

    private PaymentSdkNativeServiceProto$TextField() {
    }

    public static PaymentSdkNativeServiceProto$TextField o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"content_", "variant_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$TextField();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (PaymentSdkNativeServiceProto$TextField.class) {
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
        return this.content_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final scs0 p() {
        scs0 scs0Var;
        int i = this.variant_;
        if (i == 0) {
            scs0Var = scs0.TEXT_VARIANT_UNKNOWN;
        } else if (i == 1) {
            scs0Var = scs0.TEXT_VARIANT_BODY_MEDIUM;
        } else if (i != 2) {
            scs0Var = i != 3 ? null : scs0.TEXT_VARIANT_BODY_SMALL;
        } else {
            scs0Var = scs0.TEXT_VARIANT_MARGINAL;
        }
        return scs0Var == null ? scs0.UNRECOGNIZED : scs0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

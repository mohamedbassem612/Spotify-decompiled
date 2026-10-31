package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$GetPaymentSessionResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ABORT_SESSION_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$GetPaymentSessionResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int GET_NEW_PAYMENT_SESSION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_SESSION_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        PaymentSdkNativeServiceProto$GetPaymentSessionResponse paymentSdkNativeServiceProto$GetPaymentSessionResponse = new PaymentSdkNativeServiceProto$GetPaymentSessionResponse();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$GetPaymentSessionResponse;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$GetPaymentSessionResponse.class, paymentSdkNativeServiceProto$GetPaymentSessionResponse);
    }

    private PaymentSdkNativeServiceProto$GetPaymentSessionResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"response_", "responseCase_", PaymentSdkNativeServiceProto$PaymentSessionResponse.class, PaymentSdkNativeServiceProto$ResponseAction.GetNewSession.class, PaymentSdkNativeServiceProto$ResponseAction.AbortSession.class, PaymentSdkNativeServiceProto$ResponseAction.Error.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$GetPaymentSessionResponse();
        }
        if (iOrdinal == 4) {
            return new l(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$GetPaymentSessionResponse.class) {
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

    public final PaymentSdkNativeServiceProto$ResponseAction.Error n() {
        return this.responseCase_ == 4 ? (PaymentSdkNativeServiceProto$ResponseAction.Error) this.response_ : PaymentSdkNativeServiceProto$ResponseAction.Error.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PaymentSdkNativeServiceProto$PaymentSessionResponse o() {
        return this.responseCase_ == 1 ? (PaymentSdkNativeServiceProto$PaymentSessionResponse) this.response_ : PaymentSdkNativeServiceProto$PaymentSessionResponse.n();
    }

    public final int p() {
        int i = this.responseCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

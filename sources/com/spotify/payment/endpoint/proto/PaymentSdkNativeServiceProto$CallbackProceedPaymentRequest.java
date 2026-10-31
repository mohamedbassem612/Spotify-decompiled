package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.lcs0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest extends com.google.protobuf.h implements v2j0 {
    public static final int ATTEMPT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_PROVIDER_ID_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int PROCEED_DATA_FIELD_NUMBER = 4;
    private int attempt_;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$CallbackProceedData proceedData_;
    private String paymentSessionId_ = "";
    private String paymentProviderId_ = "";

    static {
        PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest paymentSdkNativeServiceProto$CallbackProceedPaymentRequest = new PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CallbackProceedPaymentRequest;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest.class, paymentSdkNativeServiceProto$CallbackProceedPaymentRequest);
    }

    private PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest() {
    }

    public static lcs0 n() {
        return (lcs0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "paymentSessionId_", "attempt_", "paymentProviderId_", "proceedData_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest();
        }
        if (iOrdinal == 4) {
            return new lcs0(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest.class) {
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

    public final void o(int i) {
        this.attempt_ = i;
    }

    public final void p(String str) {
        str.getClass();
        this.paymentProviderId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.paymentSessionId_ = str;
    }

    public final void r(PaymentSdkNativeServiceProto$CallbackProceedData paymentSdkNativeServiceProto$CallbackProceedData) {
        paymentSdkNativeServiceProto$CallbackProceedData.getClass();
        this.proceedData_ = paymentSdkNativeServiceProto$CallbackProceedData;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

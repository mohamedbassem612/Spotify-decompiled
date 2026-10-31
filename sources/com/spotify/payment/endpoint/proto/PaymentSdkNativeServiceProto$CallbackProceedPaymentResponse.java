package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private PaymentSdkNativeServiceProto$CallbackResponseAction action_;
    private int bitField0_;

    static {
        PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse paymentSdkNativeServiceProto$CallbackProceedPaymentResponse = new PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CallbackProceedPaymentResponse;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse.class, paymentSdkNativeServiceProto$CallbackProceedPaymentResponse);
    }

    private PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "action_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse.class) {
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

    public final PaymentSdkNativeServiceProto$CallbackResponseAction n() {
        PaymentSdkNativeServiceProto$CallbackResponseAction paymentSdkNativeServiceProto$CallbackResponseAction = this.action_;
        return paymentSdkNativeServiceProto$CallbackResponseAction == null ? PaymentSdkNativeServiceProto$CallbackResponseAction.o() : paymentSdkNativeServiceProto$CallbackResponseAction;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

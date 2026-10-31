package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$PreparePaymentResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int ATTEMPT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$PreparePaymentResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private PaymentSdkNativeServiceProto$ResponseAction action_;
    private int attempt_;
    private int bitField0_;

    static {
        PaymentSdkNativeServiceProto$PreparePaymentResponse paymentSdkNativeServiceProto$PreparePaymentResponse = new PaymentSdkNativeServiceProto$PreparePaymentResponse();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PreparePaymentResponse;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$PreparePaymentResponse.class, paymentSdkNativeServiceProto$PreparePaymentResponse);
    }

    private PaymentSdkNativeServiceProto$PreparePaymentResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "action_", "attempt_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PreparePaymentResponse();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (PaymentSdkNativeServiceProto$PreparePaymentResponse.class) {
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

    public final PaymentSdkNativeServiceProto$ResponseAction n() {
        PaymentSdkNativeServiceProto$ResponseAction paymentSdkNativeServiceProto$ResponseAction = this.action_;
        return paymentSdkNativeServiceProto$ResponseAction == null ? PaymentSdkNativeServiceProto$ResponseAction.p() : paymentSdkNativeServiceProto$ResponseAction;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.attempt_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

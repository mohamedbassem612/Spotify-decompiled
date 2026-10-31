package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.pcs0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$PreparePaymentRequest extends com.google.protobuf.h implements v2j0 {
    public static final int APP_SWITCH_ELIGIBLE_FIELD_NUMBER = 9;
    public static final int ATTEMPT_ID_FIELD_NUMBER = 5;
    public static final int CANCEL_URL_FIELD_NUMBER = 7;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 4;
    public static final int CLIENT_CONTEXT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$PreparePaymentRequest DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_PROVIDER_ID_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int PROCEED_DATA_FIELD_NUMBER = 10;
    public static final int RISK_DEVICE_ID_FIELD_NUMBER = 8;
    private boolean appSwitchEligible_;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$ProceedData proceedData_;
    private String paymentSessionId_ = "";
    private String clientContext_ = "";
    private String paymentProviderId_ = "";
    private String checkoutViewId_ = "";
    private String attemptId_ = "";
    private String flowId_ = "";
    private String cancelUrl_ = "";
    private String riskDeviceId_ = "";

    static {
        PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest = new PaymentSdkNativeServiceProto$PreparePaymentRequest();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PreparePaymentRequest;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$PreparePaymentRequest.class, paymentSdkNativeServiceProto$PreparePaymentRequest);
    }

    private PaymentSdkNativeServiceProto$PreparePaymentRequest() {
    }

    public static pcs0 n() {
        return (pcs0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\nဉ\u0000", new Object[]{"bitField0_", "paymentSessionId_", "clientContext_", "paymentProviderId_", "checkoutViewId_", "attemptId_", "flowId_", "cancelUrl_", "riskDeviceId_", "appSwitchEligible_", "proceedData_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PreparePaymentRequest();
        }
        if (iOrdinal == 4) {
            return new pcs0(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$PreparePaymentRequest.class) {
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

    public final void o(boolean z) {
        this.appSwitchEligible_ = z;
    }

    public final void p(String str) {
        str.getClass();
        this.attemptId_ = str;
    }

    public final void q(String str) {
        this.cancelUrl_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.checkoutViewId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.clientContext_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.flowId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.paymentProviderId_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.paymentSessionId_ = str;
    }

    public final void w(PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData) {
        paymentSdkNativeServiceProto$ProceedData.getClass();
        this.proceedData_ = paymentSdkNativeServiceProto$ProceedData;
        this.bitField0_ |= 1;
    }

    public final void x(String str) {
        str.getClass();
        this.riskDeviceId_ = str;
    }
}

package com.spotify.checkout.proto.model.v1.proto;

import p.amc1;
import p.bf40;
import p.bmc1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SubmitCheckoutRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final SubmitCheckoutRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REUSE_SUBSCRIPTION_PAYMENT_DETAILS_FIELD_NUMBER = 3;
    public static final int SELECTED_PROVIDER_FIELD_NUMBER = 2;
    private String checkoutSessionId_ = "";
    private boolean reuseSubscriptionPaymentDetails_;
    private int selectedProvider_;

    static {
        SubmitCheckoutRequest submitCheckoutRequest = new SubmitCheckoutRequest();
        DEFAULT_INSTANCE = submitCheckoutRequest;
        com.google.protobuf.h.registerDefaultInstance(SubmitCheckoutRequest.class, submitCheckoutRequest);
    }

    private SubmitCheckoutRequest() {
    }

    public static amc1 n() {
        return (amc1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007", new Object[]{"checkoutSessionId_", "selectedProvider_", "reuseSubscriptionPaymentDetails_"});
        }
        if (iOrdinal == 3) {
            return new SubmitCheckoutRequest();
        }
        if (iOrdinal == 4) {
            return new amc1(DEFAULT_INSTANCE);
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
        synchronized (SubmitCheckoutRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.checkoutSessionId_ = str;
    }

    public final void p(boolean z) {
        this.reuseSubscriptionPaymentDetails_ = z;
    }

    public final void q(bmc1 bmc1Var) {
        this.selectedProvider_ = bmc1Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

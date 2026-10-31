package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mwf;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CheckoutPaymentAppSwitchAttempt extends h implements v2j0 {
    public static final int ATTEMPT_ID_FIELD_NUMBER = 8;
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 2;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 6;
    private static final CheckoutPaymentAppSwitchAttempt DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_METHOD_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int RESOLVED_TARGET_FIELD_NUMBER = 5;
    public static final int URL_IS_APP_SWITCH_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean urlIsAppSwitch_;
    private String paymentSessionId_ = "";
    private String checkoutSessionId_ = "";
    private String paymentMethod_ = "";
    private String resolvedTarget_ = "";
    private String checkoutViewId_ = "";
    private String flowId_ = "";
    private String attemptId_ = "";

    static {
        CheckoutPaymentAppSwitchAttempt checkoutPaymentAppSwitchAttempt = new CheckoutPaymentAppSwitchAttempt();
        DEFAULT_INSTANCE = checkoutPaymentAppSwitchAttempt;
        h.registerDefaultInstance(CheckoutPaymentAppSwitchAttempt.class, checkoutPaymentAppSwitchAttempt);
    }

    private CheckoutPaymentAppSwitchAttempt() {
    }

    public static mwf n() {
        return (mwf) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"bitField0_", "paymentSessionId_", "checkoutSessionId_", "paymentMethod_", "urlIsAppSwitch_", "resolvedTarget_", "checkoutViewId_", "flowId_", "attemptId_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutPaymentAppSwitchAttempt();
        }
        if (iOrdinal == 4) {
            return new mwf(DEFAULT_INSTANCE);
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
        synchronized (CheckoutPaymentAppSwitchAttempt.class) {
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
        this.bitField0_ |= 128;
        this.attemptId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.checkoutSessionId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.checkoutViewId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.flowId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.paymentMethod_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.paymentSessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 16;
        this.resolvedTarget_ = str;
    }

    public final void v(boolean z) {
        this.bitField0_ |= 8;
        this.urlIsAppSwitch_ = z;
    }
}

package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iwf;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CheckoutFormView extends h implements v2j0 {
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    private static final CheckoutFormView DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 2;
    public static final int FORM_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private String checkoutViewId_ = "";
    private String flowId_ = "";
    private String formId_ = "";
    private String paymentSessionId_ = "";

    static {
        CheckoutFormView checkoutFormView = new CheckoutFormView();
        DEFAULT_INSTANCE = checkoutFormView;
        h.registerDefaultInstance(CheckoutFormView.class, checkoutFormView);
    }

    private CheckoutFormView() {
    }

    public static iwf n() {
        return (iwf) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "checkoutViewId_", "flowId_", "formId_", "paymentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutFormView();
        }
        if (iOrdinal == 4) {
            return new iwf(DEFAULT_INSTANCE);
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
        synchronized (CheckoutFormView.class) {
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
        this.bitField0_ |= 1;
        this.checkoutViewId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.flowId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.formId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

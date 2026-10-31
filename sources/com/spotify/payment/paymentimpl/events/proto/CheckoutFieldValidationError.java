package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gwf;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CheckoutFieldValidationError extends h implements v2j0 {
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    private static final CheckoutFieldValidationError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 4;
    public static final int FLOW_ID_FIELD_NUMBER = 3;
    public static final int FORM_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 6;
    private int bitField0_;
    private String checkoutViewId_ = "";
    private String formId_ = "";
    private String flowId_ = "";
    private String field_ = "";
    private String errorCode_ = "";
    private String paymentSessionId_ = "";

    static {
        CheckoutFieldValidationError checkoutFieldValidationError = new CheckoutFieldValidationError();
        DEFAULT_INSTANCE = checkoutFieldValidationError;
        h.registerDefaultInstance(CheckoutFieldValidationError.class, checkoutFieldValidationError);
    }

    private CheckoutFieldValidationError() {
    }

    public static gwf n() {
        return (gwf) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "checkoutViewId_", "formId_", "flowId_", "field_", "errorCode_", "paymentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutFieldValidationError();
        }
        if (iOrdinal == 4) {
            return new gwf(DEFAULT_INSTANCE);
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
        synchronized (CheckoutFieldValidationError.class) {
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
        this.bitField0_ |= 16;
        this.errorCode_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.field_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.flowId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.formId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

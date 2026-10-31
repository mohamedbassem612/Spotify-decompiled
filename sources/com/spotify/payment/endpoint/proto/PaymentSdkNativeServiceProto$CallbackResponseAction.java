package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$CallbackResponseAction extends com.google.protobuf.h implements v2j0 {
    public static final int ABORT_SESSION_FIELD_NUMBER = 4;
    public static final int COUNTRY_MISMATCH_ERROR_FIELD_NUMBER = 8;
    private static final PaymentSdkNativeServiceProto$CallbackResponseAction DEFAULT_INSTANCE;
    public static final int DELIVERED_FIELD_NUMBER = 2;
    public static final int DISCOUNT_BLOCKER_ERROR_FIELD_NUMBER = 6;
    public static final int ERROR_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_METHOD_DISCOUNT_BLOCKER_ERROR_FIELD_NUMBER = 7;
    public static final int REDIRECT_FIELD_NUMBER = 1;
    public static final int WAIT_FIELD_NUMBER = 3;
    private int responseActionCase_ = 0;
    private Object responseAction_;

    public static final class Delivered extends com.google.protobuf.h implements v2j0 {
        private static final Delivered DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            Delivered delivered = new Delivered();
            DEFAULT_INSTANCE = delivered;
            com.google.protobuf.h.registerDefaultInstance(Delivered.class, delivered);
        }

        private Delivered() {
        }

        public static Delivered n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            }
            if (iOrdinal == 3) {
                return new Delivered();
            }
            if (iOrdinal == 4) {
                return new g(DEFAULT_INSTANCE);
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
            synchronized (Delivered.class) {
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

        public final String getUrl() {
            return this.url_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$CallbackResponseAction paymentSdkNativeServiceProto$CallbackResponseAction = new PaymentSdkNativeServiceProto$CallbackResponseAction();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CallbackResponseAction;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$CallbackResponseAction.class, paymentSdkNativeServiceProto$CallbackResponseAction);
    }

    private PaymentSdkNativeServiceProto$CallbackResponseAction() {
    }

    public static PaymentSdkNativeServiceProto$CallbackResponseAction o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"responseAction_", "responseActionCase_", PaymentSdkNativeServiceProto$ResponseAction.Redirect.class, Delivered.class, PaymentSdkNativeServiceProto$ResponseAction.Wait.class, PaymentSdkNativeServiceProto$ResponseAction.AbortSession.class, PaymentSdkNativeServiceProto$ResponseAction.Error.class, PaymentSdkNativeServiceProto$ResponseAction.DiscountBlockerError.class, PaymentSdkNativeServiceProto$ResponseAction.PaymentMethodDiscountBlockerError.class, PaymentSdkNativeServiceProto$ResponseAction.CountryMismatchError.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CallbackResponseAction();
        }
        if (iOrdinal == 4) {
            return new f(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$CallbackResponseAction.class) {
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

    public final PaymentSdkNativeServiceProto$ResponseAction.CountryMismatchError n() {
        return this.responseActionCase_ == 8 ? (PaymentSdkNativeServiceProto$ResponseAction.CountryMismatchError) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.CountryMismatchError.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Delivered p() {
        return this.responseActionCase_ == 2 ? (Delivered) this.responseAction_ : Delivered.n();
    }

    public final PaymentSdkNativeServiceProto$ResponseAction.DiscountBlockerError q() {
        return this.responseActionCase_ == 6 ? (PaymentSdkNativeServiceProto$ResponseAction.DiscountBlockerError) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.DiscountBlockerError.n();
    }

    public final PaymentSdkNativeServiceProto$ResponseAction.Error r() {
        return this.responseActionCase_ == 5 ? (PaymentSdkNativeServiceProto$ResponseAction.Error) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.Error.n();
    }

    public final PaymentSdkNativeServiceProto$ResponseAction.PaymentMethodDiscountBlockerError s() {
        return this.responseActionCase_ == 7 ? (PaymentSdkNativeServiceProto$ResponseAction.PaymentMethodDiscountBlockerError) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.PaymentMethodDiscountBlockerError.n();
    }

    public final PaymentSdkNativeServiceProto$ResponseAction.Redirect t() {
        return this.responseActionCase_ == 1 ? (PaymentSdkNativeServiceProto$ResponseAction.Redirect) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.Redirect.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        switch (this.responseActionCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final PaymentSdkNativeServiceProto$ResponseAction.Wait v() {
        return this.responseActionCase_ == 3 ? (PaymentSdkNativeServiceProto$ResponseAction.Wait) this.responseAction_ : PaymentSdkNativeServiceProto$ResponseAction.Wait.n();
    }
}

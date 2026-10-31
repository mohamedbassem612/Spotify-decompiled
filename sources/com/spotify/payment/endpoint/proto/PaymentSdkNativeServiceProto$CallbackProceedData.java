package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$CallbackProceedData extends com.google.protobuf.h implements v2j0 {
    private static final PaymentSdkNativeServiceProto$CallbackProceedData DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PENDING_FIELD_NUMBER = 1;
    public static final int URL_PROCEED_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    public static final class UrlProceedData extends com.google.protobuf.h implements v2j0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final UrlProceedData DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private qng0 data_ = qng0.b;

        static {
            UrlProceedData urlProceedData = new UrlProceedData();
            DEFAULT_INSTANCE = urlProceedData;
            com.google.protobuf.h.registerDefaultInstance(UrlProceedData.class, urlProceedData);
        }

        private UrlProceedData() {
        }

        public static d o() {
            return (d) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"data_", e.a});
            }
            if (iOrdinal == 3) {
                return new UrlProceedData();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (UrlProceedData.class) {
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

        public final qng0 n() {
            qng0 qng0Var = this.data_;
            if (qng0Var.a) {
                return qng0Var;
            }
            qng0 qng0VarH = qng0Var.h();
            this.data_ = qng0VarH;
            return qng0VarH;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$CallbackProceedData paymentSdkNativeServiceProto$CallbackProceedData = new PaymentSdkNativeServiceProto$CallbackProceedData();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CallbackProceedData;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$CallbackProceedData.class, paymentSdkNativeServiceProto$CallbackProceedData);
    }

    private PaymentSdkNativeServiceProto$CallbackProceedData() {
    }

    public static c n() {
        return (c) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000", new Object[]{"value_", "valueCase_", PaymentSdkNativeServiceProto$ProceedData.PendingData.class, UrlProceedData.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CallbackProceedData();
        }
        if (iOrdinal == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$CallbackProceedData.class) {
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

    public final void o(PaymentSdkNativeServiceProto$ProceedData.PendingData pendingData) {
        pendingData.getClass();
        this.value_ = pendingData;
        this.valueCase_ = 1;
    }

    public final void p(UrlProceedData urlProceedData) {
        urlProceedData.getClass();
        this.value_ = urlProceedData;
        this.valueCase_ = 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$ProceedData extends com.google.protobuf.h implements v2j0 {
    private static final PaymentSdkNativeServiceProto$ProceedData DEFAULT_INSTANCE;
    public static final int FORM_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PENDING_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    public static final class FormData extends com.google.protobuf.h implements v2j0 {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final FormData DEFAULT_INSTANCE;
        public static final int FORM_ID_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private qng0 data_ = qng0.b;
        private String formId_ = "";

        static {
            FormData formData = new FormData();
            DEFAULT_INSTANCE = formData;
            com.google.protobuf.h.registerDefaultInstance(FormData.class, formData);
        }

        private FormData() {
        }

        public static a0 o() {
            return (a0) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"formId_", "data_", b0.a});
            }
            if (iOrdinal == 3) {
                return new FormData();
            }
            if (iOrdinal == 4) {
                return new a0(DEFAULT_INSTANCE);
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
            synchronized (FormData.class) {
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

        public final void p(String str) {
            str.getClass();
            this.formId_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PendingData extends com.google.protobuf.h implements v2j0 {
        private static final PendingData DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            PendingData pendingData = new PendingData();
            DEFAULT_INSTANCE = pendingData;
            com.google.protobuf.h.registerDefaultInstance(PendingData.class, pendingData);
        }

        private PendingData() {
        }

        public static c0 n() {
            return (c0) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new PendingData();
            }
            if (iOrdinal == 4) {
                return new c0(DEFAULT_INSTANCE);
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
            synchronized (PendingData.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData = new PaymentSdkNativeServiceProto$ProceedData();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$ProceedData;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$ProceedData.class, paymentSdkNativeServiceProto$ProceedData);
    }

    private PaymentSdkNativeServiceProto$ProceedData() {
    }

    public static z n() {
        return (z) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"value_", "valueCase_", PendingData.class, FormData.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$ProceedData();
        }
        if (iOrdinal == 4) {
            return new z(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$ProceedData.class) {
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

    public final void o(FormData formData) {
        formData.getClass();
        this.value_ = formData;
        this.valueCase_ = 2;
    }

    public final void p(PendingData pendingData) {
        pendingData.getClass();
        this.value_ = pendingData;
        this.valueCase_ = 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

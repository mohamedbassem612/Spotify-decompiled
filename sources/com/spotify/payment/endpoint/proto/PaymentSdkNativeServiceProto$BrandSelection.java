package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$BrandSelection extends com.google.protobuf.h implements v2j0 {
    private static final PaymentSdkNativeServiceProto$BrandSelection DEFAULT_INSTANCE;
    public static final int FORM_KEY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 2;
    private String formKey_ = "";
    private h290 values_ = com.google.protobuf.h.emptyProtobufList();

    public static final class BrandSelectionValue extends com.google.protobuf.h implements v2j0 {
        public static final int BIN_REGEX_FIELD_NUMBER = 2;
        private static final BrandSelectionValue DEFAULT_INSTANCE;
        public static final int LOGO_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private String value_ = "";
        private String binRegex_ = "";
        private String logo_ = "";

        static {
            BrandSelectionValue brandSelectionValue = new BrandSelectionValue();
            DEFAULT_INSTANCE = brandSelectionValue;
            com.google.protobuf.h.registerDefaultInstance(BrandSelectionValue.class, brandSelectionValue);
        }

        private BrandSelectionValue() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"value_", "binRegex_", "logo_"});
            }
            if (iOrdinal == 3) {
                return new BrandSelectionValue();
            }
            if (iOrdinal == 4) {
                return new a(DEFAULT_INSTANCE);
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
            synchronized (BrandSelectionValue.class) {
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
        PaymentSdkNativeServiceProto$BrandSelection paymentSdkNativeServiceProto$BrandSelection = new PaymentSdkNativeServiceProto$BrandSelection();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$BrandSelection;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$BrandSelection.class, paymentSdkNativeServiceProto$BrandSelection);
    }

    private PaymentSdkNativeServiceProto$BrandSelection() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"formKey_", "values_", BrandSelectionValue.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$BrandSelection();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$BrandSelection.class) {
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

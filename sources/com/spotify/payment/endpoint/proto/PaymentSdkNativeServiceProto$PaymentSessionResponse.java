package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$PaymentSessionResponse extends com.google.protobuf.h implements v2j0 {
    private static final PaymentSdkNativeServiceProto$PaymentSessionResponse DEFAULT_INSTANCE;
    public static final int INITIAL_ERROR_FIELD_NUMBER = 6;
    public static final int INITIAL_PROVIDER_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_METHODS_FIELD_NUMBER = 1;
    public static final int SESSION_FIELD_NUMBER = 5;
    public static final int STRINGS_FIELD_NUMBER = 4;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$ResponseAction.Error initialError_;
    private PaymentSdkNativeServiceProto$PaymentSessionData session_;
    private Strings strings_;
    private h290 paymentMethods_ = com.google.protobuf.h.emptyProtobufList();
    private String initialProviderId_ = "";

    public static final class Strings extends com.google.protobuf.h implements v2j0 {
        public static final int BACK_TO_PAYMENT_DETAILS_LABEL_FIELD_NUMBER = 6;
        public static final int CHANGE_PAYMENT_METHOD_LABEL_FIELD_NUMBER = 4;
        private static final Strings DEFAULT_INSTANCE;
        public static final int FALLBACK_CTA_LABEL_FIELD_NUMBER = 1;
        public static final int GLOBAL_ERROR_MESSAGE_FIELD_NUMBER = 3;
        public static final int MORE_PROVIDER_LOGOS_LABEL_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int REDIRECT_MESSAGE_FIELD_NUMBER = 2;
        private String fallbackCtaLabel_ = "";
        private String redirectMessage_ = "";
        private String globalErrorMessage_ = "";
        private String changePaymentMethodLabel_ = "";
        private String moreProviderLogosLabel_ = "";
        private String backToPaymentDetailsLabel_ = "";

        static {
            Strings strings = new Strings();
            DEFAULT_INSTANCE = strings;
            com.google.protobuf.h.registerDefaultInstance(Strings.class, strings);
        }

        private Strings() {
        }

        public static Strings p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"fallbackCtaLabel_", "redirectMessage_", "globalErrorMessage_", "changePaymentMethodLabel_", "moreProviderLogosLabel_", "backToPaymentDetailsLabel_"});
            }
            if (iOrdinal == 3) {
                return new Strings();
            }
            if (iOrdinal == 4) {
                return new u(DEFAULT_INSTANCE);
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
            synchronized (Strings.class) {
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

        public final String n() {
            return this.backToPaymentDetailsLabel_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.changePaymentMethodLabel_;
        }

        public final String q() {
            return this.fallbackCtaLabel_;
        }

        public final String r() {
            return this.globalErrorMessage_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$PaymentSessionResponse paymentSdkNativeServiceProto$PaymentSessionResponse = new PaymentSdkNativeServiceProto$PaymentSessionResponse();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PaymentSessionResponse;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$PaymentSessionResponse.class, paymentSdkNativeServiceProto$PaymentSessionResponse);
    }

    private PaymentSdkNativeServiceProto$PaymentSessionResponse() {
    }

    public static PaymentSdkNativeServiceProto$PaymentSessionResponse n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "paymentMethods_", PaymentSdkNativeServiceProto$PaymentMethod.class, "initialProviderId_", "strings_", "session_", "initialError_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PaymentSessionResponse();
        }
        if (iOrdinal == 4) {
            return new t(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$PaymentSessionResponse.class) {
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

    public final PaymentSdkNativeServiceProto$ResponseAction.Error o() {
        PaymentSdkNativeServiceProto$ResponseAction.Error error = this.initialError_;
        return error == null ? PaymentSdkNativeServiceProto$ResponseAction.Error.n() : error;
    }

    public final h290 p() {
        return this.paymentMethods_;
    }

    public final PaymentSdkNativeServiceProto$PaymentSessionData q() {
        PaymentSdkNativeServiceProto$PaymentSessionData paymentSdkNativeServiceProto$PaymentSessionData = this.session_;
        return paymentSdkNativeServiceProto$PaymentSessionData == null ? PaymentSdkNativeServiceProto$PaymentSessionData.p() : paymentSdkNativeServiceProto$PaymentSessionData;
    }

    public final Strings r() {
        Strings strings = this.strings_;
        return strings == null ? Strings.p() : strings;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rcs0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$ResponseAction extends com.google.protobuf.h implements v2j0 {
    public static final int ABORT_SESSION_FIELD_NUMBER = 9;
    public static final int AUTHENTICATED_REDIRECT_FIELD_NUMBER = 17;
    public static final int COUNTRY_MISMATCH_ERROR_FIELD_NUMBER = 15;
    private static final PaymentSdkNativeServiceProto$ResponseAction DEFAULT_INSTANCE;
    public static final int DELIVERED_FIELD_NUMBER = 2;
    public static final int DISCOUNT_BLOCKER_ERROR_FIELD_NUMBER = 13;
    public static final int DISPLAY_PENDING_FIELD_NUMBER = 16;
    public static final int EJECT_TO_WEB_FIELD_NUMBER = 12;
    public static final int ERROR_FIELD_NUMBER = 1;
    public static final int FORM_FIELD_NUMBER = 4;
    public static final int GET_NEW_PAYMENT_SESSION_FIELD_NUMBER = 8;
    public static final int LAUNCH_INTENT_AND_WAIT_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_METHOD_DISCOUNT_BLOCKER_ERROR_FIELD_NUMBER = 14;
    public static final int QR_CODE_FIELD_NUMBER = 7;
    public static final int REDIRECT_FIELD_NUMBER = 11;
    public static final int WAIT_FIELD_NUMBER = 5;
    public static final int WAIT_WITH_COUNTDOWN_FIELD_NUMBER = 6;
    private int responseActionCase_ = 0;
    private Object responseAction_;

    public static final class AbortSession extends com.google.protobuf.h implements v2j0 {
        private static final AbortSession DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            AbortSession abortSession = new AbortSession();
            DEFAULT_INSTANCE = abortSession;
            com.google.protobuf.h.registerDefaultInstance(AbortSession.class, abortSession);
        }

        private AbortSession() {
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
                return new AbortSession();
            }
            if (iOrdinal == 4) {
                return new d0(DEFAULT_INSTANCE);
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
            synchronized (AbortSession.class) {
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

    public static final class AuthenticatedRedirect extends com.google.protobuf.h implements v2j0 {
        private static final AuthenticatedRedirect DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            AuthenticatedRedirect authenticatedRedirect = new AuthenticatedRedirect();
            DEFAULT_INSTANCE = authenticatedRedirect;
            com.google.protobuf.h.registerDefaultInstance(AuthenticatedRedirect.class, authenticatedRedirect);
        }

        private AuthenticatedRedirect() {
        }

        public static AuthenticatedRedirect n() {
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
                return new AuthenticatedRedirect();
            }
            if (iOrdinal == 4) {
                return new e0(DEFAULT_INSTANCE);
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
            synchronized (AuthenticatedRedirect.class) {
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

    public static final class CountryMismatchError extends com.google.protobuf.h implements v2j0 {
        private static final CountryMismatchError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int MESSAGE_WITH_COUNTRY_PICKER_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String messageWithCountryPicker_ = "";
        private String message_ = "";

        static {
            CountryMismatchError countryMismatchError = new CountryMismatchError();
            DEFAULT_INSTANCE = countryMismatchError;
            com.google.protobuf.h.registerDefaultInstance(CountryMismatchError.class, countryMismatchError);
        }

        private CountryMismatchError() {
        }

        public static CountryMismatchError n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageWithCountryPicker_", "message_"});
            }
            if (iOrdinal == 3) {
                return new CountryMismatchError();
            }
            if (iOrdinal == 4) {
                return new g0(DEFAULT_INSTANCE);
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
            synchronized (CountryMismatchError.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.messageWithCountryPicker_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Delivered extends com.google.protobuf.h implements v2j0 {
        private static final Delivered DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Delivered delivered = new Delivered();
            DEFAULT_INSTANCE = delivered;
            com.google.protobuf.h.registerDefaultInstance(Delivered.class, delivered);
        }

        private Delivered() {
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
                return new Delivered();
            }
            if (iOrdinal == 4) {
                return new h0(DEFAULT_INSTANCE);
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

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class DiscountBlockerError extends com.google.protobuf.h implements v2j0 {
        private static final DiscountBlockerError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int MESSAGE_WITH_ALTERNATIVE_OFFER_PLACEHOLDER_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String messageWithAlternativeOfferPlaceholder_ = "";
        private String message_ = "";

        static {
            DiscountBlockerError discountBlockerError = new DiscountBlockerError();
            DEFAULT_INSTANCE = discountBlockerError;
            com.google.protobuf.h.registerDefaultInstance(DiscountBlockerError.class, discountBlockerError);
        }

        private DiscountBlockerError() {
        }

        public static DiscountBlockerError n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageWithAlternativeOfferPlaceholder_", "message_"});
            }
            if (iOrdinal == 3) {
                return new DiscountBlockerError();
            }
            if (iOrdinal == 4) {
                return new i0(DEFAULT_INSTANCE);
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
            synchronized (DiscountBlockerError.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.messageWithAlternativeOfferPlaceholder_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class DisplayPending extends com.google.protobuf.h implements v2j0 {
        public static final int CANCEL_BUTTON_LABEL_FIELD_NUMBER = 2;
        private static final DisplayPending DEFAULT_INSTANCE;
        public static final int DEFERRED_REQUEST_FIELD_NUMBER = 4;
        public static final int DISCLAIMER_FIELD_NUMBER = 7;
        public static final int FORM_FIELD_NUMBER = 6;
        public static final int HEADER_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int QR_CODE_FIELD_NUMBER = 5;
        public static final int STEPS_FIELD_NUMBER = 3;
        private int bitField0_;
        private DeferredRequest deferredRequest_;
        private Form form_;
        private QrCode qrCode_;
        private String header_ = "";
        private String cancelButtonLabel_ = "";
        private h290 steps_ = com.google.protobuf.h.emptyProtobufList();
        private String disclaimer_ = "";

        public static final class DeferredRequest extends com.google.protobuf.h implements v2j0 {
            public static final int COUNTDOWN_FIELD_NUMBER = 2;
            private static final DeferredRequest DEFAULT_INSTANCE;
            public static final int DELAY_MILLIS_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private int bitField0_;
            private Countdown countdown_;
            private long delayMillis_;

            public static final class Countdown extends com.google.protobuf.h implements v2j0 {
                public static final int BODY_FIELD_NUMBER = 2;
                public static final int DEADLINE_SECONDS_FIELD_NUMBER = 1;
                private static final Countdown DEFAULT_INSTANCE;
                private static volatile qzr0 PARSER;
                private String body_ = "";
                private long deadlineSeconds_;

                static {
                    Countdown countdown = new Countdown();
                    DEFAULT_INSTANCE = countdown;
                    com.google.protobuf.h.registerDefaultInstance(Countdown.class, countdown);
                }

                private Countdown() {
                }

                public static Countdown p() {
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"deadlineSeconds_", "body_"});
                    }
                    if (iOrdinal == 3) {
                        return new Countdown();
                    }
                    if (iOrdinal == 4) {
                        return new l0(DEFAULT_INSTANCE);
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
                    synchronized (Countdown.class) {
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
                    return this.body_;
                }

                public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                    return newBuilderForType();
                }

                public final long o() {
                    return this.deadlineSeconds_;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                DeferredRequest deferredRequest = new DeferredRequest();
                DEFAULT_INSTANCE = deferredRequest;
                com.google.protobuf.h.registerDefaultInstance(DeferredRequest.class, deferredRequest);
            }

            private DeferredRequest() {
            }

            public static DeferredRequest o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002ဉ\u0000", new Object[]{"bitField0_", "delayMillis_", "countdown_"});
                }
                if (iOrdinal == 3) {
                    return new DeferredRequest();
                }
                if (iOrdinal == 4) {
                    return new k0(DEFAULT_INSTANCE);
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
                synchronized (DeferredRequest.class) {
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

            public final Countdown n() {
                Countdown countdown = this.countdown_;
                return countdown == null ? Countdown.p() : countdown;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final long p() {
                return this.delayMillis_;
            }

            public final boolean q() {
                return (this.bitField0_ & 1) != 0;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Form extends com.google.protobuf.h implements v2j0 {
            public static final int CTA_LABEL_FIELD_NUMBER = 2;
            private static final Form DEFAULT_INSTANCE;
            public static final int ERROR_MESSAGE_FIELD_NUMBER = 4;
            public static final int FIELDS_FIELD_NUMBER = 3;
            public static final int ID_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private String id_ = "";
            private String ctaLabel_ = "";
            private h290 fields_ = com.google.protobuf.h.emptyProtobufList();
            private String errorMessage_ = "";

            static {
                Form form = new Form();
                DEFAULT_INSTANCE = form;
                com.google.protobuf.h.registerDefaultInstance(Form.class, form);
            }

            private Form() {
            }

            public static Form o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ", new Object[]{"id_", "ctaLabel_", "fields_", PaymentSdkNativeServiceProto$FormField.class, "errorMessage_"});
                }
                if (iOrdinal == 3) {
                    return new Form();
                }
                if (iOrdinal == 4) {
                    return new m0(DEFAULT_INSTANCE);
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
                synchronized (Form.class) {
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

            public final String getId() {
                return this.id_;
            }

            public final String n() {
                return this.ctaLabel_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String p() {
                return this.errorMessage_;
            }

            public final h290 q() {
                return this.fields_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class QrCode extends com.google.protobuf.h implements v2j0 {
            private static final QrCode DEFAULT_INSTANCE;
            public static final int IMAGE_DATA_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int TEXT_CODE_FIELD_NUMBER = 2;
            private String imageData_ = "";
            private String textCode_ = "";

            static {
                QrCode qrCode = new QrCode();
                DEFAULT_INSTANCE = qrCode;
                com.google.protobuf.h.registerDefaultInstance(QrCode.class, qrCode);
            }

            private QrCode() {
            }

            public static QrCode n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"imageData_", "textCode_"});
                }
                if (iOrdinal == 3) {
                    return new QrCode();
                }
                if (iOrdinal == 4) {
                    return new n0(DEFAULT_INSTANCE);
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
                synchronized (QrCode.class) {
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

            public final String o() {
                return this.imageData_;
            }

            public final String p() {
                return this.textCode_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Step extends com.google.protobuf.h implements v2j0 {
            public static final int BODY_FIELD_NUMBER = 2;
            private static final Step DEFAULT_INSTANCE;
            public static final int ICON_FIELD_NUMBER = 3;
            private static volatile qzr0 PARSER = null;
            public static final int TITLE_FIELD_NUMBER = 1;
            private int icon_;
            private String title_ = "";
            private String body_ = "";

            static {
                Step step = new Step();
                DEFAULT_INSTANCE = step;
                com.google.protobuf.h.registerDefaultInstance(Step.class, step);
            }

            private Step() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"title_", "body_", "icon_"});
                }
                if (iOrdinal == 3) {
                    return new Step();
                }
                if (iOrdinal == 4) {
                    return new o0(DEFAULT_INSTANCE);
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
                synchronized (Step.class) {
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

            public final String getTitle() {
                return this.title_;
            }

            public final String n() {
                return this.body_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final rcs0 o() {
                rcs0 rcs0Var;
                int i = this.icon_;
                if (i == 0) {
                    rcs0Var = rcs0.ENCORE_ICON_UNKNOWN;
                } else if (i == 1) {
                    rcs0Var = rcs0.ENCORE_ICON_CHECK_ALT;
                } else if (i == 2) {
                    rcs0Var = rcs0.ENCORE_ICON_UNDO;
                } else if (i == 3) {
                    rcs0Var = rcs0.ENCORE_ICON_EXTERNAL_LINK;
                } else if (i != 4) {
                    rcs0Var = i != 5 ? null : rcs0.ENCORE_ICON_MESSAGES;
                } else {
                    rcs0Var = rcs0.ENCORE_ICON_CAMERA;
                }
                return rcs0Var == null ? rcs0.UNRECOGNIZED : rcs0Var;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            DisplayPending displayPending = new DisplayPending();
            DEFAULT_INSTANCE = displayPending;
            com.google.protobuf.h.registerDefaultInstance(DisplayPending.class, displayPending);
        }

        private DisplayPending() {
        }

        public static DisplayPending o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ለ\u0003", new Object[]{"bitField0_", "header_", "cancelButtonLabel_", "steps_", Step.class, "deferredRequest_", "qrCode_", "form_", "disclaimer_"});
            }
            if (iOrdinal == 3) {
                return new DisplayPending();
            }
            if (iOrdinal == 4) {
                return new j0(DEFAULT_INSTANCE);
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
            synchronized (DisplayPending.class) {
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
            return this.cancelButtonLabel_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final DeferredRequest p() {
            DeferredRequest deferredRequest = this.deferredRequest_;
            return deferredRequest == null ? DeferredRequest.o() : deferredRequest;
        }

        public final String q() {
            return this.disclaimer_;
        }

        public final Form r() {
            Form form = this.form_;
            return form == null ? Form.o() : form;
        }

        public final String s() {
            return this.header_;
        }

        public final QrCode t() {
            QrCode qrCode = this.qrCode_;
            return qrCode == null ? QrCode.n() : qrCode;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final h290 u() {
            return this.steps_;
        }

        public final boolean v() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean w() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean x() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean y() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public static final class EjectToWeb extends com.google.protobuf.h implements v2j0 {
        private static final EjectToWeb DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            EjectToWeb ejectToWeb = new EjectToWeb();
            DEFAULT_INSTANCE = ejectToWeb;
            com.google.protobuf.h.registerDefaultInstance(EjectToWeb.class, ejectToWeb);
        }

        private EjectToWeb() {
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
                return new EjectToWeb();
            }
            if (iOrdinal == 4) {
                return new p0(DEFAULT_INSTANCE);
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
            synchronized (EjectToWeb.class) {
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

    public static final class Error extends com.google.protobuf.h implements v2j0 {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String errorMessage_ = "";

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            com.google.protobuf.h.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        public static Error n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"errorMessage_"});
            }
            if (iOrdinal == 3) {
                return new Error();
            }
            if (iOrdinal == 4) {
                return new q0(DEFAULT_INSTANCE);
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
            synchronized (Error.class) {
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

        public final String o() {
            return this.errorMessage_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class FormAction extends com.google.protobuf.h implements v2j0 {
        private static final FormAction DEFAULT_INSTANCE;
        public static final int FORM_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private PaymentSdkNativeServiceProto$Form form_;

        static {
            FormAction formAction = new FormAction();
            DEFAULT_INSTANCE = formAction;
            com.google.protobuf.h.registerDefaultInstance(FormAction.class, formAction);
        }

        private FormAction() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "form_"});
            }
            if (iOrdinal == 3) {
                return new FormAction();
            }
            if (iOrdinal == 4) {
                return new r0(DEFAULT_INSTANCE);
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
            synchronized (FormAction.class) {
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

    public static final class GetNewSession extends com.google.protobuf.h implements v2j0 {
        private static final GetNewSession DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TRIGGER_AUTOMATIC_RETRY_FIELD_NUMBER = 1;
        private boolean triggerAutomaticRetry_;

        static {
            GetNewSession getNewSession = new GetNewSession();
            DEFAULT_INSTANCE = getNewSession;
            com.google.protobuf.h.registerDefaultInstance(GetNewSession.class, getNewSession);
        }

        private GetNewSession() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"triggerAutomaticRetry_"});
            }
            if (iOrdinal == 3) {
                return new GetNewSession();
            }
            if (iOrdinal == 4) {
                return new s0(DEFAULT_INSTANCE);
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
            synchronized (GetNewSession.class) {
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

    public static final class LaunchIntentAndWait extends com.google.protobuf.h implements v2j0 {
        public static final int APP_UNAVAILABLE_ERROR_MESSAGE_FIELD_NUMBER = 3;
        private static final LaunchIntentAndWait DEFAULT_INSTANCE;
        public static final int INTENT_URI_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private long period_;
        private String intentUri_ = "";
        private String appUnavailableErrorMessage_ = "";

        static {
            LaunchIntentAndWait launchIntentAndWait = new LaunchIntentAndWait();
            DEFAULT_INSTANCE = launchIntentAndWait;
            com.google.protobuf.h.registerDefaultInstance(LaunchIntentAndWait.class, launchIntentAndWait);
        }

        private LaunchIntentAndWait() {
        }

        public static LaunchIntentAndWait o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"period_", "intentUri_", "appUnavailableErrorMessage_"});
            }
            if (iOrdinal == 3) {
                return new LaunchIntentAndWait();
            }
            if (iOrdinal == 4) {
                return new t0(DEFAULT_INSTANCE);
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
            synchronized (LaunchIntentAndWait.class) {
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
            return this.appUnavailableErrorMessage_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.intentUri_;
        }

        public final long q() {
            return this.period_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PaymentMethodDiscountBlockerError extends com.google.protobuf.h implements v2j0 {
        private static final PaymentMethodDiscountBlockerError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int MESSAGE_WITH_ALTERNATIVE_OFFER_PLACEHOLDER_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String messageWithAlternativeOfferPlaceholder_ = "";
        private String message_ = "";

        static {
            PaymentMethodDiscountBlockerError paymentMethodDiscountBlockerError = new PaymentMethodDiscountBlockerError();
            DEFAULT_INSTANCE = paymentMethodDiscountBlockerError;
            com.google.protobuf.h.registerDefaultInstance(PaymentMethodDiscountBlockerError.class, paymentMethodDiscountBlockerError);
        }

        private PaymentMethodDiscountBlockerError() {
        }

        public static PaymentMethodDiscountBlockerError n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageWithAlternativeOfferPlaceholder_", "message_"});
            }
            if (iOrdinal == 3) {
                return new PaymentMethodDiscountBlockerError();
            }
            if (iOrdinal == 4) {
                return new u0(DEFAULT_INSTANCE);
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
            synchronized (PaymentMethodDiscountBlockerError.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.messageWithAlternativeOfferPlaceholder_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class QrCode extends com.google.protobuf.h implements v2j0 {
        private static final QrCode DEFAULT_INSTANCE;
        public static final int EXPLANATION_FIELD_NUMBER = 2;
        public static final int IMAGE_DATA_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private String explanation_ = "";
        private String imageData_ = "";
        private long period_;

        static {
            QrCode qrCode = new QrCode();
            DEFAULT_INSTANCE = qrCode;
            com.google.protobuf.h.registerDefaultInstance(QrCode.class, qrCode);
        }

        private QrCode() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"period_", "explanation_", "imageData_"});
            }
            if (iOrdinal == 3) {
                return new QrCode();
            }
            if (iOrdinal == 4) {
                return new v0(DEFAULT_INSTANCE);
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
            synchronized (QrCode.class) {
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

    public static final class Redirect extends com.google.protobuf.h implements v2j0 {
        public static final int AUTHENTICATION_URL_FIELD_NUMBER = 2;
        private static final Redirect DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";
        private String authenticationUrl_ = "";

        static {
            Redirect redirect = new Redirect();
            DEFAULT_INSTANCE = redirect;
            com.google.protobuf.h.registerDefaultInstance(Redirect.class, redirect);
        }

        private Redirect() {
        }

        public static Redirect o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"url_", "authenticationUrl_"});
            }
            if (iOrdinal == 3) {
                return new Redirect();
            }
            if (iOrdinal == 4) {
                return new w0(DEFAULT_INSTANCE);
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
            synchronized (Redirect.class) {
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

        public final String n() {
            return this.authenticationUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Wait extends com.google.protobuf.h implements v2j0 {
        private static final Wait DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private long period_;

        static {
            Wait wait = new Wait();
            DEFAULT_INSTANCE = wait;
            com.google.protobuf.h.registerDefaultInstance(Wait.class, wait);
        }

        private Wait() {
        }

        public static Wait n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"period_"});
            }
            if (iOrdinal == 3) {
                return new Wait();
            }
            if (iOrdinal == 4) {
                return new x0(DEFAULT_INSTANCE);
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
            synchronized (Wait.class) {
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

        public final long o() {
            return this.period_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class WaitWithCountdown extends com.google.protobuf.h implements v2j0 {
        public static final int BODY_APPROVE_FIELD_NUMBER = 7;
        public static final int BODY_COME_BACK_FIELD_NUMBER = 9;
        public static final int BODY_OPEN_FIELD_NUMBER = 5;
        public static final int BODY_TIME_REMAINING_FIELD_NUMBER = 10;
        private static final WaitWithCountdown DEFAULT_INSTANCE;
        public static final int HEADER_APPROVE_FIELD_NUMBER = 6;
        public static final int HEADER_COME_BACK_FIELD_NUMBER = 8;
        public static final int HEADER_FIELD_NUMBER = 3;
        public static final int HEADER_OPEN_FIELD_NUMBER = 4;
        public static final int MAX_WAIT_SECONDS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private long maxWaitSeconds_;
        private long period_;
        private String header_ = "";
        private String headerOpen_ = "";
        private String bodyOpen_ = "";
        private String headerApprove_ = "";
        private String bodyApprove_ = "";
        private String headerComeBack_ = "";
        private String bodyComeBack_ = "";
        private String bodyTimeRemaining_ = "";

        static {
            WaitWithCountdown waitWithCountdown = new WaitWithCountdown();
            DEFAULT_INSTANCE = waitWithCountdown;
            com.google.protobuf.h.registerDefaultInstance(WaitWithCountdown.class, waitWithCountdown);
        }

        private WaitWithCountdown() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"period_", "maxWaitSeconds_", "header_", "headerOpen_", "bodyOpen_", "headerApprove_", "bodyApprove_", "headerComeBack_", "bodyComeBack_", "bodyTimeRemaining_"});
            }
            if (iOrdinal == 3) {
                return new WaitWithCountdown();
            }
            if (iOrdinal == 4) {
                return new y0(DEFAULT_INSTANCE);
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
            synchronized (WaitWithCountdown.class) {
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
        PaymentSdkNativeServiceProto$ResponseAction paymentSdkNativeServiceProto$ResponseAction = new PaymentSdkNativeServiceProto$ResponseAction();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$ResponseAction;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$ResponseAction.class, paymentSdkNativeServiceProto$ResponseAction);
    }

    private PaymentSdkNativeServiceProto$ResponseAction() {
    }

    public static PaymentSdkNativeServiceProto$ResponseAction p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0000\u0001\u0011\u0010\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"responseAction_", "responseActionCase_", Error.class, Delivered.class, FormAction.class, Wait.class, WaitWithCountdown.class, QrCode.class, GetNewSession.class, AbortSession.class, LaunchIntentAndWait.class, Redirect.class, EjectToWeb.class, DiscountBlockerError.class, PaymentMethodDiscountBlockerError.class, CountryMismatchError.class, DisplayPending.class, AuthenticatedRedirect.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$ResponseAction();
        }
        if (iOrdinal == 4) {
            return new f0(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$ResponseAction.class) {
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

    public final AuthenticatedRedirect n() {
        return this.responseActionCase_ == 17 ? (AuthenticatedRedirect) this.responseAction_ : AuthenticatedRedirect.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CountryMismatchError o() {
        return this.responseActionCase_ == 15 ? (CountryMismatchError) this.responseAction_ : CountryMismatchError.n();
    }

    public final DiscountBlockerError q() {
        return this.responseActionCase_ == 13 ? (DiscountBlockerError) this.responseAction_ : DiscountBlockerError.n();
    }

    public final DisplayPending r() {
        return this.responseActionCase_ == 16 ? (DisplayPending) this.responseAction_ : DisplayPending.o();
    }

    public final Error s() {
        return this.responseActionCase_ == 1 ? (Error) this.responseAction_ : Error.n();
    }

    public final LaunchIntentAndWait t() {
        return this.responseActionCase_ == 10 ? (LaunchIntentAndWait) this.responseAction_ : LaunchIntentAndWait.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final PaymentMethodDiscountBlockerError u() {
        return this.responseActionCase_ == 14 ? (PaymentMethodDiscountBlockerError) this.responseAction_ : PaymentMethodDiscountBlockerError.n();
    }

    public final Redirect v() {
        return this.responseActionCase_ == 11 ? (Redirect) this.responseAction_ : Redirect.o();
    }

    public final int w() {
        switch (this.responseActionCase_) {
            case 0:
                return 17;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
            default:
                return 0;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
        }
    }

    public final Wait x() {
        return this.responseActionCase_ == 5 ? (Wait) this.responseAction_ : Wait.n();
    }
}

package com.spotify.checkout.proto.model.v1.proto;

import com.google.protobuf.Any;
import p.bf40;
import p.bhn0;
import p.h290;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SpotifyCheckoutNative extends com.google.protobuf.h implements v2j0 {
    public static final int ADDRESS_SECTION_FIELD_NUMBER = 4;
    public static final int BANNER_FIELD_NUMBER = 10;
    public static final int CHANGE_COUNTRY_FIELD_NUMBER = 5;
    public static final int CHANGE_PRODUCT_FOLLOW_LINK_FIELD_NUMBER = 2;
    private static final SpotifyCheckoutNative DEFAULT_INSTANCE;
    public static final int LINE_ITEM_FIELD_NUMBER = 3;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAYMENT_SECTION_FIELD_NUMBER = 6;
    public static final int SUCCESS_URL_FIELD_NUMBER = 8;
    public static final int SUMMARY_SECTION_FIELD_NUMBER = 7;
    public static final int UPDATE_SUBSCRIPTION_CTA_FIELD_NUMBER = 9;
    private AddressSection addressSection_;
    private Banner banner_;
    private int bitField0_;
    private ChangeCountry changeCountry_;
    private Object changeProductAction_;
    private LineItem lineItem_;
    private PaymentSection paymentSection_;
    private SummarySection summarySection_;
    private UpdateSubscriptionCta updateSubscriptionCta_;
    private int changeProductActionCase_ = 0;
    private String pageTitle_ = "";
    private String successUrl_ = "";

    public static final class AddressSection extends com.google.protobuf.h implements v2j0 {
        public static final int ADDRESS_COLLECTION_FIELD_NUMBER = 3;
        private static final AddressSection DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private Any addressCollection_;
        private int bitField0_;
        private String title_ = "";
        private String subtitle_ = "";

        static {
            AddressSection addressSection = new AddressSection();
            DEFAULT_INSTANCE = addressSection;
            com.google.protobuf.h.registerDefaultInstance(AddressSection.class, addressSection);
        }

        private AddressSection() {
        }

        public static AddressSection o() {
            return DEFAULT_INSTANCE;
        }

        public static u0 p() {
            return (u0) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "title_", "subtitle_", "addressCollection_"});
            }
            if (iOrdinal == 3) {
                return new AddressSection();
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
            synchronized (AddressSection.class) {
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

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        public final Any n() {
            Any any = this.addressCollection_;
            return any == null ? Any.o() : any;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final void q(Any any) {
            any.getClass();
            this.addressCollection_ = any;
            this.bitField0_ |= 1;
        }

        public final void r() {
            this.subtitle_ = "Sales tax is calculated based on your address.";
        }

        public final void s() {
            this.title_ = "Address";
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PaymentSection extends com.google.protobuf.h implements v2j0 {
        public static final int CURRENT_PAYMENT_DETAILS_FIELD_NUMBER = 4;
        private static final PaymentSection DEFAULT_INSTANCE;
        public static final int LEGAL_TERMS_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int PAYMENT_ARGS_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int WEB_EJECTION_URLS_FIELD_NUMBER = 3;
        private int bitField0_;
        private CurrentPaymentDetails currentPaymentDetails_;
        private PaymentArgs paymentArgs_;
        private qng0 webEjectionUrls_ = qng0.b;
        private String title_ = "";
        private h290 legalTerms_ = com.google.protobuf.h.emptyProtobufList();

        public static final class CurrentPaymentDetails extends com.google.protobuf.h implements v2j0 {
            private static final CurrentPaymentDetails DEFAULT_INSTANCE;
            public static final int IMAGE_FIELD_NUMBER = 1;
            public static final int NATIVE_FIELD_NUMBER = 5;
            private static volatile qzr0 PARSER = null;
            public static final int SUBTITLE_FIELD_NUMBER = 3;
            public static final int TITLE_FIELD_NUMBER = 2;
            public static final int WEB_VIEW_FIELD_NUMBER = 4;
            private int bitField0_;
            private Object changePayment_;
            private Image image_;
            private int changePaymentCase_ = 0;
            private String title_ = "";
            private String subtitle_ = "";

            public static final class NativePaymentCta extends com.google.protobuf.h implements v2j0 {
                private static final NativePaymentCta DEFAULT_INSTANCE;
                public static final int LABEL_FIELD_NUMBER = 1;
                public static final int NEW_PAYMENT_FIELD_NUMBER = 3;
                private static volatile qzr0 PARSER;
                private int bitField0_;
                private String label_ = "";
                private PaymentArgs newPayment_;

                static {
                    NativePaymentCta nativePaymentCta = new NativePaymentCta();
                    DEFAULT_INSTANCE = nativePaymentCta;
                    com.google.protobuf.h.registerDefaultInstance(NativePaymentCta.class, nativePaymentCta);
                }

                private NativePaymentCta() {
                }

                public static NativePaymentCta n() {
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "label_", "newPayment_"});
                    }
                    if (iOrdinal == 3) {
                        return new NativePaymentCta();
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
                    synchronized (NativePaymentCta.class) {
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
                    return this.label_;
                }

                public final PaymentArgs p() {
                    PaymentArgs paymentArgs = this.newPayment_;
                    return paymentArgs == null ? PaymentArgs.p() : paymentArgs;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                CurrentPaymentDetails currentPaymentDetails = new CurrentPaymentDetails();
                DEFAULT_INSTANCE = currentPaymentDetails;
                com.google.protobuf.h.registerDefaultInstance(CurrentPaymentDetails.class, currentPaymentDetails);
            }

            private CurrentPaymentDetails() {
            }

            public static CurrentPaymentDetails o() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static x0 u() {
                return (x0) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000", new Object[]{"changePayment_", "changePaymentCase_", "bitField0_", "image_", "title_", "subtitle_", FollowLinkCta.class, NativePaymentCta.class});
                }
                if (iOrdinal == 3) {
                    return new CurrentPaymentDetails();
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
                synchronized (CurrentPaymentDetails.class) {
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

            public final String getSubtitle() {
                return this.subtitle_;
            }

            public final String getTitle() {
                return this.title_;
            }

            public final int n() {
                int i = this.changePaymentCase_;
                if (i == 0) {
                    return 3;
                }
                if (i != 4) {
                    return i != 5 ? 0 : 2;
                }
                return 1;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final Image p() {
                Image image = this.image_;
                return image == null ? Image.o() : image;
            }

            public final NativePaymentCta q() {
                return this.changePaymentCase_ == 5 ? (NativePaymentCta) this.changePayment_ : NativePaymentCta.n();
            }

            public final FollowLinkCta r() {
                return this.changePaymentCase_ == 4 ? (FollowLinkCta) this.changePayment_ : FollowLinkCta.n();
            }

            public final boolean s() {
                return this.changePaymentCase_ == 5;
            }

            public final boolean t() {
                return this.changePaymentCase_ == 4;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final void v(Image image) {
                image.getClass();
                this.image_ = image;
                this.bitField0_ |= 1;
            }

            public final void w() {
                this.subtitle_ = "Expires: 10/30";
            }

            public final void x() {
                this.title_ = "Visa ending in 1111";
            }

            public final void y(FollowLinkCta followLinkCta) {
                followLinkCta.getClass();
                this.changePayment_ = followLinkCta;
                this.changePaymentCase_ = 4;
            }
        }

        public static final class LegalTerm extends com.google.protobuf.h implements v2j0 {
            private static final LegalTerm DEFAULT_INSTANCE;
            public static final int ERROR_FIELD_NUMBER = 3;
            public static final int HTML_FIELD_NUMBER = 2;
            private static volatile qzr0 PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int type_;
            private String html_ = "";
            private String error_ = "";

            static {
                LegalTerm legalTerm = new LegalTerm();
                DEFAULT_INSTANCE = legalTerm;
                com.google.protobuf.h.registerDefaultInstance(LegalTerm.class, legalTerm);
            }

            private LegalTerm() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static z0 q() {
                return (z0) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "html_", "error_"});
                }
                if (iOrdinal == 3) {
                    return new LegalTerm();
                }
                if (iOrdinal == 4) {
                    return new z0(DEFAULT_INSTANCE);
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
                synchronized (LegalTerm.class) {
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
                return this.error_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.html_;
            }

            public final a1 p() {
                a1 a1Var;
                int i = this.type_;
                if (i == 0) {
                    a1Var = a1.CHECKBOX;
                } else if (i == 1) {
                    a1Var = a1.TEXT;
                } else if (i != 2) {
                    a1Var = i != 3 ? null : a1.CONSPICUOUS_CHECKBOX;
                } else {
                    a1Var = a1.CONSPICUOUS_TEXT;
                }
                return a1Var == null ? a1.UNRECOGNIZED : a1Var;
            }

            public final void r(String str) {
                this.error_ = str;
            }

            public final void s(String str) {
                this.html_ = str;
            }

            public final void t(a1 a1Var) {
                this.type_ = a1Var.getNumber();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class PaymentArgs extends com.google.protobuf.h implements v2j0 {
            public static final int CLIENT_CONTEXT_FIELD_NUMBER = 2;
            public static final int CTA_LABEL_FIELD_NUMBER = 3;
            private static final PaymentArgs DEFAULT_INSTANCE;
            public static final int DISCOUNT_BLOCKER_FIELD_NUMBER = 4;
            private static volatile qzr0 PARSER = null;
            public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private DiscountBlocker discountBlocker_;
            private String paymentSessionId_ = "";
            private String clientContext_ = "";
            private String ctaLabel_ = "";

            public static final class DiscountBlocker extends com.google.protobuf.h implements v2j0 {
                private static final DiscountBlocker DEFAULT_INSTANCE;
                public static final int FULL_PRICE_URL_FIELD_NUMBER = 1;
                private static volatile qzr0 PARSER = null;
                public static final int PRODUCT_NAME_FIELD_NUMBER = 2;
                private String fullPriceUrl_ = "";
                private String productName_ = "";

                static {
                    DiscountBlocker discountBlocker = new DiscountBlocker();
                    DEFAULT_INSTANCE = discountBlocker;
                    com.google.protobuf.h.registerDefaultInstance(DiscountBlocker.class, discountBlocker);
                }

                private DiscountBlocker() {
                }

                public static DiscountBlocker n() {
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"fullPriceUrl_", "productName_"});
                    }
                    if (iOrdinal == 3) {
                        return new DiscountBlocker();
                    }
                    if (iOrdinal == 4) {
                        return new c1(DEFAULT_INSTANCE);
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
                    synchronized (DiscountBlocker.class) {
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
                    return this.fullPriceUrl_;
                }

                public final String p() {
                    return this.productName_;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                PaymentArgs paymentArgs = new PaymentArgs();
                DEFAULT_INSTANCE = paymentArgs;
                com.google.protobuf.h.registerDefaultInstance(PaymentArgs.class, paymentArgs);
            }

            private PaymentArgs() {
            }

            public static PaymentArgs p() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static b1 t() {
                return (b1) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "paymentSessionId_", "clientContext_", "ctaLabel_", "discountBlocker_"});
                }
                if (iOrdinal == 3) {
                    return new PaymentArgs();
                }
                if (iOrdinal == 4) {
                    return new b1(DEFAULT_INSTANCE);
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
                synchronized (PaymentArgs.class) {
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
                return this.clientContext_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.ctaLabel_;
            }

            public final DiscountBlocker q() {
                DiscountBlocker discountBlocker = this.discountBlocker_;
                return discountBlocker == null ? DiscountBlocker.n() : discountBlocker;
            }

            public final String r() {
                return this.paymentSessionId_;
            }

            public final boolean s() {
                return (this.bitField0_ & 1) != 0;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final void u() {
                this.paymentSessionId_ = "002b8389-c56f-456c-8006-c72d9fad77cc";
            }
        }

        static {
            PaymentSection paymentSection = new PaymentSection();
            DEFAULT_INSTANCE = paymentSection;
            com.google.protobuf.h.registerDefaultInstance(PaymentSection.class, paymentSection);
        }

        private PaymentSection() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static PaymentSection q() {
            return DEFAULT_INSTANCE;
        }

        public static w0 w() {
            return (w0) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u00032\u0004ဉ\u0001\u0005\u001b", new Object[]{"bitField0_", "title_", "paymentArgs_", "webEjectionUrls_", d1.a, "currentPaymentDetails_", "legalTerms_", LegalTerm.class});
            }
            if (iOrdinal == 3) {
                return new PaymentSection();
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
            synchronized (PaymentSection.class) {
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

        public final void n(Iterable iterable) {
            h290 h290VarMutableCopy = this.legalTerms_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.legalTerms_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final boolean o(String str) {
            str.getClass();
            return this.webEjectionUrls_.containsKey(str);
        }

        public final CurrentPaymentDetails p() {
            CurrentPaymentDetails currentPaymentDetails = this.currentPaymentDetails_;
            return currentPaymentDetails == null ? CurrentPaymentDetails.o() : currentPaymentDetails;
        }

        public final h290 r() {
            return this.legalTerms_;
        }

        public final PaymentArgs s() {
            PaymentArgs paymentArgs = this.paymentArgs_;
            return paymentArgs == null ? PaymentArgs.p() : paymentArgs;
        }

        public final String t(String str) {
            str.getClass();
            qng0 qng0Var = this.webEjectionUrls_;
            if (qng0Var.containsKey(str)) {
                return (String) qng0Var.get(str);
            }
            bhn0.q();
            return null;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final boolean u() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean v() {
            return (this.bitField0_ & 1) != 0;
        }

        public final void x(CurrentPaymentDetails currentPaymentDetails) {
            currentPaymentDetails.getClass();
            this.currentPaymentDetails_ = currentPaymentDetails;
            this.bitField0_ |= 2;
        }

        public final void y(PaymentArgs paymentArgs) {
            paymentArgs.getClass();
            this.paymentArgs_ = paymentArgs;
            this.bitField0_ |= 1;
        }

        public final void z(String str) {
            this.title_ = str;
        }
    }

    public static final class SummarySection extends com.google.protobuf.h implements v2j0 {
        public static final int ADDITIONAL_PRODUCT_INFORMATION_FIELD_NUMBER = 9;
        public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 5;
        public static final int ADDRESS_ROW_FIELD_NUMBER = 4;
        private static final SummarySection DEFAULT_INSTANCE;
        public static final int ITEM_ROW_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int TIMELINEV2_FIELD_NUMBER = 8;
        public static final int TIMELINE_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TOTAL_LABEL_FIELD_NUMBER = 6;
        public static final int TOTAL_PRICE_FIELD_NUMBER = 7;
        private AddressRow addressRow_;
        private int bitField0_;
        private ItemRow itemRow_;
        private Object tl_;
        private int tlCase_ = 0;
        private String title_ = "";
        private String additionalTaxLabel_ = "";
        private String totalLabel_ = "";
        private String totalPrice_ = "";
        private h290 additionalProductInformation_ = com.google.protobuf.h.emptyProtobufList();

        public static final class AddressRow extends com.google.protobuf.h implements v2j0 {
            public static final int ADDRESS_FIELD_NUMBER = 2;
            private static final AddressRow DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 4;
            public static final int ROW_TITLE_FIELD_NUMBER = 1;
            public static final int TAX_LABEL_FIELD_NUMBER = 3;
            private String rowTitle_ = "";
            private String address_ = "";
            private String taxLabel_ = "";
            private String price_ = "";

            static {
                AddressRow addressRow = new AddressRow();
                DEFAULT_INSTANCE = addressRow;
                com.google.protobuf.h.registerDefaultInstance(AddressRow.class, addressRow);
            }

            private AddressRow() {
            }

            public static AddressRow o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"rowTitle_", "address_", "taxLabel_", "price_"});
                }
                if (iOrdinal == 3) {
                    return new AddressRow();
                }
                if (iOrdinal == 4) {
                    return new e1(DEFAULT_INSTANCE);
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
                synchronized (AddressRow.class) {
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
                return this.address_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String p() {
                return this.price_;
            }

            public final String q() {
                return this.rowTitle_;
            }

            public final String r() {
                return this.taxLabel_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class ItemRow extends com.google.protobuf.h implements v2j0 {
            private static final ItemRow DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int PRODUCT_IMAGE_FIELD_NUMBER = 2;
            public static final int PRODUCT_PRICE_DURATION_FIELD_NUMBER = 5;
            public static final int PRODUCT_PRICE_FIELD_NUMBER = 4;
            public static final int PRODUCT_TITLE_FIELD_NUMBER = 3;
            public static final int ROW_TITLE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Image productImage_;
            private String rowTitle_ = "";
            private String productTitle_ = "";
            private String productPrice_ = "";
            private String productPriceDuration_ = "";

            static {
                ItemRow itemRow = new ItemRow();
                DEFAULT_INSTANCE = itemRow;
                com.google.protobuf.h.registerDefaultInstance(ItemRow.class, itemRow);
            }

            private ItemRow() {
            }

            public static ItemRow n() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static g1 t() {
                return (g1) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "rowTitle_", "productImage_", "productTitle_", "productPrice_", "productPriceDuration_"});
                }
                if (iOrdinal == 3) {
                    return new ItemRow();
                }
                if (iOrdinal == 4) {
                    return new g1(DEFAULT_INSTANCE);
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
                synchronized (ItemRow.class) {
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

            public final Image o() {
                Image image = this.productImage_;
                return image == null ? Image.o() : image;
            }

            public final String p() {
                return this.productPrice_;
            }

            public final String q() {
                return this.productPriceDuration_;
            }

            public final String r() {
                return this.productTitle_;
            }

            public final String s() {
                return this.rowTitle_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final void u(Image image) {
                image.getClass();
                this.productImage_ = image;
                this.bitField0_ |= 1;
            }

            public final void v() {
                this.productPrice_ = "$9.99";
            }

            public final void w() {
                this.productPriceDuration_ = "For 3 months";
            }

            public final void x() {
                this.productTitle_ = "LineItemV2 title";
            }

            public final void y() {
                this.rowTitle_ = "Items";
            }
        }

        static {
            SummarySection summarySection = new SummarySection();
            DEFAULT_INSTANCE = summarySection;
            com.google.protobuf.h.registerDefaultInstance(SummarySection.class, summarySection);
        }

        private SummarySection() {
        }

        public static f1 A() {
            return (f1) DEFAULT_INSTANCE.createBuilder();
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static SummarySection r() {
            return DEFAULT_INSTANCE;
        }

        public final void B(ItemRow itemRow) {
            itemRow.getClass();
            this.itemRow_ = itemRow;
            this.bitField0_ |= 1;
        }

        public final void C(TimelineV2 timelineV2) {
            this.tl_ = timelineV2;
            this.tlCase_ = 8;
        }

        public final void D() {
            this.title_ = "Summary";
        }

        public final void E() {
            this.totalLabel_ = "Total now";
        }

        public final void F() {
            this.totalPrice_ = "$9.99";
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ\b<\u0000\tȚ", new Object[]{"tl_", "tlCase_", "bitField0_", "title_", "itemRow_", Timeline.class, "addressRow_", "additionalTaxLabel_", "totalLabel_", "totalPrice_", TimelineV2.class, "additionalProductInformation_"});
            }
            if (iOrdinal == 3) {
                return new SummarySection();
            }
            if (iOrdinal == 4) {
                return new f1(DEFAULT_INSTANCE);
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
            synchronized (SummarySection.class) {
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

        public final void n(Iterable iterable) {
            h290 h290VarMutableCopy = this.additionalProductInformation_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.additionalProductInformation_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.additionalProductInformation_;
        }

        public final String p() {
            return this.additionalTaxLabel_;
        }

        public final AddressRow q() {
            AddressRow addressRow = this.addressRow_;
            return addressRow == null ? AddressRow.o() : addressRow;
        }

        public final ItemRow s() {
            ItemRow itemRow = this.itemRow_;
            return itemRow == null ? ItemRow.n() : itemRow;
        }

        public final Timeline t() {
            return this.tlCase_ == 3 ? (Timeline) this.tl_ : Timeline.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final TimelineV2 u() {
            return this.tlCase_ == 8 ? (TimelineV2) this.tl_ : TimelineV2.o();
        }

        public final int v() {
            int i = this.tlCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 3) {
                return i != 8 ? 0 : 2;
            }
            return 1;
        }

        public final String w() {
            return this.totalLabel_;
        }

        public final String x() {
            return this.totalPrice_;
        }

        public final boolean y() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean z() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public static final class UpdateSubscriptionCta extends com.google.protobuf.h implements v2j0 {
        public static final int ACTION_CLOSE_FIELD_NUMBER = 2;
        public static final int ACTION_LINK_FIELD_NUMBER = 3;
        private static final UpdateSubscriptionCta DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PRIMARY_CTA_FIELD_NUMBER = 1;
        private Object secondaryCta_;
        private int secondaryCtaCase_ = 0;
        private String primaryCta_ = "";

        static {
            UpdateSubscriptionCta updateSubscriptionCta = new UpdateSubscriptionCta();
            DEFAULT_INSTANCE = updateSubscriptionCta;
            com.google.protobuf.h.registerDefaultInstance(UpdateSubscriptionCta.class, updateSubscriptionCta);
        }

        private UpdateSubscriptionCta() {
        }

        public static UpdateSubscriptionCta p() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static h1 t() {
            return (h1) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"secondaryCta_", "secondaryCtaCase_", "primaryCta_", Error.CloseCta.class, FollowLinkCta.class});
            }
            if (iOrdinal == 3) {
                return new UpdateSubscriptionCta();
            }
            if (iOrdinal == 4) {
                return new h1(DEFAULT_INSTANCE);
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
            synchronized (UpdateSubscriptionCta.class) {
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

        public final Error.CloseCta n() {
            return this.secondaryCtaCase_ == 2 ? (Error.CloseCta) this.secondaryCta_ : Error.CloseCta.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final FollowLinkCta o() {
            return this.secondaryCtaCase_ == 3 ? (FollowLinkCta) this.secondaryCta_ : FollowLinkCta.n();
        }

        public final String q() {
            return this.primaryCta_;
        }

        public final boolean r() {
            return this.secondaryCtaCase_ == 2;
        }

        public final boolean s() {
            return this.secondaryCtaCase_ == 3;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final void u(Error.CloseCta closeCta) {
            closeCta.getClass();
            this.secondaryCta_ = closeCta;
            this.secondaryCtaCase_ = 2;
        }

        public final void v(String str) {
            this.primaryCta_ = str;
        }
    }

    static {
        SpotifyCheckoutNative spotifyCheckoutNative = new SpotifyCheckoutNative();
        DEFAULT_INSTANCE = spotifyCheckoutNative;
        com.google.protobuf.h.registerDefaultInstance(SpotifyCheckoutNative.class, spotifyCheckoutNative);
    }

    private SpotifyCheckoutNative() {
    }

    public static v0 E() {
        return (v0) DEFAULT_INSTANCE.createBuilder();
    }

    public static v0 F(SpotifyCheckoutNative spotifyCheckoutNative) {
        return (v0) DEFAULT_INSTANCE.createBuilder(spotifyCheckoutNative);
    }

    public static SpotifyCheckoutNative G(byte[] bArr) {
        return (SpotifyCheckoutNative) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SpotifyCheckoutNative r() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.changeProductActionCase_ == 2;
    }

    public final boolean B() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 32) != 0;
    }

    public final void H(AddressSection addressSection) {
        addressSection.getClass();
        this.addressSection_ = addressSection;
        this.bitField0_ |= 2;
    }

    public final void I(ChangeCountry changeCountry) {
        changeCountry.getClass();
        this.changeCountry_ = changeCountry;
        this.bitField0_ |= 4;
    }

    public final void J(FollowLinkCta followLinkCta) {
        followLinkCta.getClass();
        this.changeProductAction_ = followLinkCta;
        this.changeProductActionCase_ = 2;
    }

    public final void K(LineItem lineItem) {
        lineItem.getClass();
        this.lineItem_ = lineItem;
        this.bitField0_ |= 1;
    }

    public final void L(String str) {
        this.pageTitle_ = str;
    }

    public final void M(PaymentSection paymentSection) {
        paymentSection.getClass();
        this.paymentSection_ = paymentSection;
        this.bitField0_ |= 8;
    }

    public final void N() {
        this.successUrl_ = "https://www.success.com/";
    }

    public final void O(SummarySection summarySection) {
        summarySection.getClass();
        this.summarySection_ = summarySection;
        this.bitField0_ |= 16;
    }

    public final void P(UpdateSubscriptionCta updateSubscriptionCta) {
        updateSubscriptionCta.getClass();
        this.updateSubscriptionCta_ = updateSubscriptionCta;
        this.bitField0_ |= 32;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bȈ\tဉ\u0005\nဉ\u0006", new Object[]{"changeProductAction_", "changeProductActionCase_", "bitField0_", "pageTitle_", FollowLinkCta.class, "lineItem_", "addressSection_", "changeCountry_", "paymentSection_", "summarySection_", "successUrl_", "updateSubscriptionCta_", "banner_"});
        }
        if (iOrdinal == 3) {
            return new SpotifyCheckoutNative();
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
        synchronized (SpotifyCheckoutNative.class) {
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

    public final AddressSection n() {
        AddressSection addressSection = this.addressSection_;
        return addressSection == null ? AddressSection.o() : addressSection;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ChangeCountry o() {
        ChangeCountry changeCountry = this.changeCountry_;
        return changeCountry == null ? ChangeCountry.n() : changeCountry;
    }

    public final int p() {
        int i = this.changeProductActionCase_;
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    public final FollowLinkCta q() {
        return this.changeProductActionCase_ == 2 ? (FollowLinkCta) this.changeProductAction_ : FollowLinkCta.n();
    }

    public final LineItem s() {
        LineItem lineItem = this.lineItem_;
        return lineItem == null ? LineItem.n() : lineItem;
    }

    public final String t() {
        return this.pageTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final PaymentSection u() {
        PaymentSection paymentSection = this.paymentSection_;
        return paymentSection == null ? PaymentSection.q() : paymentSection;
    }

    public final String v() {
        return this.successUrl_;
    }

    public final SummarySection w() {
        SummarySection summarySection = this.summarySection_;
        return summarySection == null ? SummarySection.r() : summarySection;
    }

    public final UpdateSubscriptionCta x() {
        UpdateSubscriptionCta updateSubscriptionCta = this.updateSubscriptionCta_;
        return updateSubscriptionCta == null ? UpdateSubscriptionCta.p() : updateSubscriptionCta;
    }

    public final boolean y() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 4) != 0;
    }
}

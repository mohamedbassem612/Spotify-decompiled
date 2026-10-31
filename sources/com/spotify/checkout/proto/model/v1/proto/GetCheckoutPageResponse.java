package com.spotify.checkout.proto.model.v1.proto;

import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetCheckoutPageResponse extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKOUT_ITEM_UNAVAILABLE_FIELD_NUMBER = 4;
    public static final int CHECKOUT_STATUS_FIELD_NUMBER = 5;
    private static final GetCheckoutPageResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 7;
    public static final int GPB_CHECKOUT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECT_FIELD_NUMBER = 6;
    public static final int SPOTIFY_CHECKOUT_FIELD_NUMBER = 2;
    public static final int SPOTIFY_CHECKOUT_NATIVE_FIELD_NUMBER = 8;
    public static final int UCB_CHECKOUT_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    public static final class GpbCheckout extends com.google.protobuf.h implements v2j0 {
        private static final GpbCheckout DEFAULT_INSTANCE;
        public static final int OBFUSCATED_PROFILE_ID_FIELD_NUMBER = 4;
        public static final int OTP_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int SUBSCRIPTIONS_FIELD_NUMBER = 5;
        public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
        public static final int SUCCESS_URL_FIELD_NUMBER = 3;
        public static final int TRACKING_DATA_FIELD_NUMBER = 10;
        private int bitField0_;
        private Object product_;
        private GpbCheckoutTrackingData trackingData_;
        private int productCase_ = 0;
        private String successUrl_ = "";
        private String obfuscatedProfileId_ = "";

        public static final class GpbCheckoutTrackingData extends com.google.protobuf.h implements v2j0 {
            public static final int CONTEXT_FIELD_NUMBER = 1;
            private static final GpbCheckoutTrackingData DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;
            private String context_ = "";

            static {
                GpbCheckoutTrackingData gpbCheckoutTrackingData = new GpbCheckoutTrackingData();
                DEFAULT_INSTANCE = gpbCheckoutTrackingData;
                com.google.protobuf.h.registerDefaultInstance(GpbCheckoutTrackingData.class, gpbCheckoutTrackingData);
            }

            private GpbCheckoutTrackingData() {
            }

            public static GpbCheckoutTrackingData o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"context_"});
                }
                if (iOrdinal == 3) {
                    return new GpbCheckoutTrackingData();
                }
                if (iOrdinal == 4) {
                    return new p(DEFAULT_INSTANCE);
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
                synchronized (GpbCheckoutTrackingData.class) {
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
                return this.context_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class GpbOtp extends com.google.protobuf.h implements v2j0 {
            private static final GpbOtp DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int PRODUCT_IDS_FIELD_NUMBER = 1;
            private h290 productIds_ = com.google.protobuf.h.emptyProtobufList();

            static {
                GpbOtp gpbOtp = new GpbOtp();
                DEFAULT_INSTANCE = gpbOtp;
                com.google.protobuf.h.registerDefaultInstance(GpbOtp.class, gpbOtp);
            }

            private GpbOtp() {
            }

            public static GpbOtp o() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static q q() {
                return (q) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"productIds_"});
                }
                if (iOrdinal == 3) {
                    return new GpbOtp();
                }
                if (iOrdinal == 4) {
                    return new q(DEFAULT_INSTANCE);
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
                synchronized (GpbOtp.class) {
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

            public final void n(Iterable iterable) {
                h290 h290VarMutableCopy = this.productIds_;
                if (!((i9) h290VarMutableCopy).a) {
                    h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                    this.productIds_ = h290VarMutableCopy;
                }
                s8.addAll(iterable, h290VarMutableCopy);
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final h290 p() {
                return this.productIds_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class GpbSubscription extends com.google.protobuf.h implements v2j0 {
            public static final int BASE_PLAN_ID_FIELD_NUMBER = 5;
            public static final int CHANGE_SUB_FIELD_NUMBER = 4;
            private static final GpbSubscription DEFAULT_INSTANCE;
            public static final int OFFER_ID_FIELD_NUMBER = 6;
            private static volatile qzr0 PARSER = null;
            public static final int PRODUCT_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private GpbChangeSub changeSub_;
            private String productId_ = "";
            private String basePlanId_ = "";
            private String offerId_ = "";

            public static final class GpbChangeSub extends com.google.protobuf.h implements v2j0 {
                private static final GpbChangeSub DEFAULT_INSTANCE;
                public static final int OLD_PURCHASE_TOKEN_FIELD_NUMBER = 1;
                private static volatile qzr0 PARSER = null;
                public static final int PRORATION_MODE_FIELD_NUMBER = 2;
                private String oldPurchaseToken_ = "";
                private String prorationMode_ = "";

                static {
                    GpbChangeSub gpbChangeSub = new GpbChangeSub();
                    DEFAULT_INSTANCE = gpbChangeSub;
                    com.google.protobuf.h.registerDefaultInstance(GpbChangeSub.class, gpbChangeSub);
                }

                private GpbChangeSub() {
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"oldPurchaseToken_", "prorationMode_"});
                    }
                    if (iOrdinal == 3) {
                        return new GpbChangeSub();
                    }
                    if (iOrdinal == 4) {
                        return new s(DEFAULT_INSTANCE);
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
                    synchronized (GpbChangeSub.class) {
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
                GpbSubscription gpbSubscription = new GpbSubscription();
                DEFAULT_INSTANCE = gpbSubscription;
                com.google.protobuf.h.registerDefaultInstance(GpbSubscription.class, gpbSubscription);
            }

            private GpbSubscription() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "productId_", "changeSub_", "basePlanId_", "offerId_"});
                }
                if (iOrdinal == 3) {
                    return new GpbSubscription();
                }
                if (iOrdinal == 4) {
                    return new r(DEFAULT_INSTANCE);
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
                synchronized (GpbSubscription.class) {
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

        public static final class GpbSubscriptions extends com.google.protobuf.h implements v2j0 {
            public static final int CHANGE_SUB_FIELD_NUMBER = 1;
            public static final int CHANGE_SUB_PER_PRODUCT_FIELD_NUMBER = 3;
            private static final GpbSubscriptions DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int SUBSCRIPTION_ITEMS_FIELD_NUMBER = 2;
            private Object changeSubVariant_;
            private int changeSubVariantCase_ = 0;
            private h290 subscriptionItems_ = com.google.protobuf.h.emptyProtobufList();

            public static final class GpbChangeSub extends com.google.protobuf.h implements v2j0 {
                private static final GpbChangeSub DEFAULT_INSTANCE;
                public static final int OLD_PURCHASE_TOKEN_FIELD_NUMBER = 1;
                private static volatile qzr0 PARSER = null;
                public static final int PRORATION_MODE_FIELD_NUMBER = 2;
                private String oldPurchaseToken_ = "";
                private String prorationMode_ = "";

                static {
                    GpbChangeSub gpbChangeSub = new GpbChangeSub();
                    DEFAULT_INSTANCE = gpbChangeSub;
                    com.google.protobuf.h.registerDefaultInstance(GpbChangeSub.class, gpbChangeSub);
                }

                private GpbChangeSub() {
                }

                public static GpbChangeSub n() {
                    return DEFAULT_INSTANCE;
                }

                public static qzr0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                public static u q() {
                    return (u) DEFAULT_INSTANCE.createBuilder();
                }

                public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                    bf40 bf40Var;
                    int iOrdinal = jf40Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"oldPurchaseToken_", "prorationMode_"});
                    }
                    if (iOrdinal == 3) {
                        return new GpbChangeSub();
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
                    synchronized (GpbChangeSub.class) {
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
                    return this.oldPurchaseToken_;
                }

                public final String p() {
                    return this.prorationMode_;
                }

                public final void r(String str) {
                    str.getClass();
                    this.oldPurchaseToken_ = str;
                }

                public final void s(String str) {
                    this.prorationMode_ = str;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            public static final class GpbChangeSubPerProduct extends com.google.protobuf.h implements v2j0 {
                private static final GpbChangeSubPerProduct DEFAULT_INSTANCE;
                public static final int OLD_PURCHASE_TOKEN_FIELD_NUMBER = 1;
                private static volatile qzr0 PARSER = null;
                public static final int PRODUCT_REPLACEMENT_FIELD_NUMBER = 2;
                private String oldPurchaseToken_ = "";
                private h290 productReplacement_ = com.google.protobuf.h.emptyProtobufList();

                public static final class ProductReplacement extends com.google.protobuf.h implements v2j0 {
                    private static final ProductReplacement DEFAULT_INSTANCE;
                    public static final int OLD_PRODUCT_ID_FIELD_NUMBER = 1;
                    private static volatile qzr0 PARSER = null;
                    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
                    public static final int REPLACEMENT_MODE_FIELD_NUMBER = 3;
                    private String oldProductId_ = "";
                    private String productId_ = "";
                    private String replacementMode_ = "";

                    static {
                        ProductReplacement productReplacement = new ProductReplacement();
                        DEFAULT_INSTANCE = productReplacement;
                        com.google.protobuf.h.registerDefaultInstance(ProductReplacement.class, productReplacement);
                    }

                    private ProductReplacement() {
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
                            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"oldProductId_", "productId_", "replacementMode_"});
                        }
                        if (iOrdinal == 3) {
                            return new ProductReplacement();
                        }
                        if (iOrdinal == 4) {
                            return new w(DEFAULT_INSTANCE);
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
                        synchronized (ProductReplacement.class) {
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
                        return this.oldProductId_;
                    }

                    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                        return newBuilderForType();
                    }

                    public final String o() {
                        return this.productId_;
                    }

                    public final String p() {
                        return this.replacementMode_;
                    }

                    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                        return toBuilder();
                    }
                }

                static {
                    GpbChangeSubPerProduct gpbChangeSubPerProduct = new GpbChangeSubPerProduct();
                    DEFAULT_INSTANCE = gpbChangeSubPerProduct;
                    com.google.protobuf.h.registerDefaultInstance(GpbChangeSubPerProduct.class, gpbChangeSubPerProduct);
                }

                private GpbChangeSubPerProduct() {
                }

                public static GpbChangeSubPerProduct n() {
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"oldPurchaseToken_", "productReplacement_", ProductReplacement.class});
                    }
                    if (iOrdinal == 3) {
                        return new GpbChangeSubPerProduct();
                    }
                    if (iOrdinal == 4) {
                        return new v(DEFAULT_INSTANCE);
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
                    synchronized (GpbChangeSubPerProduct.class) {
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
                    return this.oldPurchaseToken_;
                }

                public final h290 p() {
                    return this.productReplacement_;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            public static final class GpbIdentifiers extends com.google.protobuf.h implements v2j0 {
                public static final int BASE_PLAN_ID_FIELD_NUMBER = 2;
                private static final GpbIdentifiers DEFAULT_INSTANCE;
                public static final int OFFER_ID_FIELD_NUMBER = 3;
                private static volatile qzr0 PARSER = null;
                public static final int PRODUCT_ID_FIELD_NUMBER = 1;
                private String productId_ = "";
                private String basePlanId_ = "";
                private String offerId_ = "";

                static {
                    GpbIdentifiers gpbIdentifiers = new GpbIdentifiers();
                    DEFAULT_INSTANCE = gpbIdentifiers;
                    com.google.protobuf.h.registerDefaultInstance(GpbIdentifiers.class, gpbIdentifiers);
                }

                private GpbIdentifiers() {
                }

                public static qzr0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                public static x q() {
                    return (x) DEFAULT_INSTANCE.createBuilder();
                }

                public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                    bf40 bf40Var;
                    int iOrdinal = jf40Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"productId_", "basePlanId_", "offerId_"});
                    }
                    if (iOrdinal == 3) {
                        return new GpbIdentifiers();
                    }
                    if (iOrdinal == 4) {
                        return new x(DEFAULT_INSTANCE);
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
                    synchronized (GpbIdentifiers.class) {
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
                    return this.basePlanId_;
                }

                public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                    return newBuilderForType();
                }

                public final String o() {
                    return this.offerId_;
                }

                public final String p() {
                    return this.productId_;
                }

                public final void r(String str) {
                    str.getClass();
                    this.basePlanId_ = str;
                }

                public final void s(String str) {
                    str.getClass();
                    this.offerId_ = str;
                }

                public final void t(String str) {
                    str.getClass();
                    this.productId_ = str;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                GpbSubscriptions gpbSubscriptions = new GpbSubscriptions();
                DEFAULT_INSTANCE = gpbSubscriptions;
                com.google.protobuf.h.registerDefaultInstance(GpbSubscriptions.class, gpbSubscriptions);
            }

            private GpbSubscriptions() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static GpbSubscriptions r() {
                return DEFAULT_INSTANCE;
            }

            public static t v() {
                return (t) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001<\u0000\u0002\u001b\u0003<\u0000", new Object[]{"changeSubVariant_", "changeSubVariantCase_", GpbChangeSub.class, "subscriptionItems_", GpbIdentifiers.class, GpbChangeSubPerProduct.class});
                }
                if (iOrdinal == 3) {
                    return new GpbSubscriptions();
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
                synchronized (GpbSubscriptions.class) {
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

            public final void n(ArrayList arrayList) {
                h290 h290VarMutableCopy = this.subscriptionItems_;
                if (!((i9) h290VarMutableCopy).a) {
                    h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                    this.subscriptionItems_ = h290VarMutableCopy;
                }
                s8.addAll(arrayList, h290VarMutableCopy);
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final GpbChangeSub o() {
                return this.changeSubVariantCase_ == 1 ? (GpbChangeSub) this.changeSubVariant_ : GpbChangeSub.n();
            }

            public final GpbChangeSubPerProduct p() {
                return this.changeSubVariantCase_ == 3 ? (GpbChangeSubPerProduct) this.changeSubVariant_ : GpbChangeSubPerProduct.n();
            }

            public final int q() {
                int i = this.changeSubVariantCase_;
                if (i == 0) {
                    return 3;
                }
                if (i != 1) {
                    return i != 3 ? 0 : 2;
                }
                return 1;
            }

            public final h290 s() {
                return this.subscriptionItems_;
            }

            public final boolean t() {
                return this.changeSubVariantCase_ == 1;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final boolean u() {
                return this.changeSubVariantCase_ == 3;
            }

            public final void w(GpbChangeSub gpbChangeSub) {
                gpbChangeSub.getClass();
                this.changeSubVariant_ = gpbChangeSub;
                this.changeSubVariantCase_ = 1;
            }
        }

        static {
            GpbCheckout gpbCheckout = new GpbCheckout();
            DEFAULT_INSTANCE = gpbCheckout;
            com.google.protobuf.h.registerDefaultInstance(GpbCheckout.class, gpbCheckout);
        }

        private GpbCheckout() {
        }

        public static GpbCheckout n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static o u() {
            return (o) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ\u0004Ȉ\u0005<\u0000\nဉ\u0000", new Object[]{"product_", "productCase_", "bitField0_", GpbSubscription.class, GpbOtp.class, "successUrl_", "obfuscatedProfileId_", GpbSubscriptions.class, "trackingData_"});
            }
            if (iOrdinal == 3) {
                return new GpbCheckout();
            }
            if (iOrdinal == 4) {
                return new o(DEFAULT_INSTANCE);
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
            synchronized (GpbCheckout.class) {
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
            return this.obfuscatedProfileId_;
        }

        public final GpbOtp p() {
            return this.productCase_ == 2 ? (GpbOtp) this.product_ : GpbOtp.o();
        }

        public final int q() {
            int i = this.productCase_;
            if (i == 0) {
                return 4;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return i != 5 ? 0 : 3;
                }
            }
            return i2;
        }

        public final GpbSubscriptions r() {
            return this.productCase_ == 5 ? (GpbSubscriptions) this.product_ : GpbSubscriptions.r();
        }

        public final String s() {
            return this.successUrl_;
        }

        public final GpbCheckoutTrackingData t() {
            GpbCheckoutTrackingData gpbCheckoutTrackingData = this.trackingData_;
            return gpbCheckoutTrackingData == null ? GpbCheckoutTrackingData.o() : gpbCheckoutTrackingData;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final void v(GpbOtp gpbOtp) {
            gpbOtp.getClass();
            this.product_ = gpbOtp;
            this.productCase_ = 2;
        }

        public final void w(GpbSubscriptions gpbSubscriptions) {
            gpbSubscriptions.getClass();
            this.product_ = gpbSubscriptions;
            this.productCase_ = 5;
        }

        public final void x(String str) {
            this.successUrl_ = str;
        }
    }

    public static final class GpbUnavailable extends com.google.protobuf.h implements v2j0 {
        public static final int CTA_FIELD_NUMBER = 2;
        private static final GpbUnavailable DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private FollowLinkCta cta_;
        private String message_ = "";

        static {
            GpbUnavailable gpbUnavailable = new GpbUnavailable();
            DEFAULT_INSTANCE = gpbUnavailable;
            com.google.protobuf.h.registerDefaultInstance(GpbUnavailable.class, gpbUnavailable);
        }

        private GpbUnavailable() {
        }

        public static GpbUnavailable o() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static y q() {
            return (y) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "message_", "cta_"});
            }
            if (iOrdinal == 3) {
                return new GpbUnavailable();
            }
            if (iOrdinal == 4) {
                return new y(DEFAULT_INSTANCE);
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
            synchronized (GpbUnavailable.class) {
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

        public final FollowLinkCta n() {
            FollowLinkCta followLinkCta = this.cta_;
            return followLinkCta == null ? FollowLinkCta.n() : followLinkCta;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final boolean p() {
            return (this.bitField0_ & 1) != 0;
        }

        public final void r(FollowLinkCta followLinkCta) {
            followLinkCta.getClass();
            this.cta_ = followLinkCta;
            this.bitField0_ |= 1;
        }

        public final void s() {
            this.message_ = "Google Play is unavailable as your Google Play country or region doesn't match Spotify's.";
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SpotifyCheckout extends com.google.protobuf.h implements v2j0 {
        public static final int CHECKOUT_URL_FIELD_NUMBER = 1;
        private static final SpotifyCheckout DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private String checkoutUrl_ = "";

        static {
            SpotifyCheckout spotifyCheckout = new SpotifyCheckout();
            DEFAULT_INSTANCE = spotifyCheckout;
            com.google.protobuf.h.registerDefaultInstance(SpotifyCheckout.class, spotifyCheckout);
        }

        private SpotifyCheckout() {
        }

        public static SpotifyCheckout o() {
            return DEFAULT_INSTANCE;
        }

        public static z p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"checkoutUrl_"});
            }
            if (iOrdinal == 3) {
                return new SpotifyCheckout();
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
            synchronized (SpotifyCheckout.class) {
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
            return this.checkoutUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final void q(String str) {
            this.checkoutUrl_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class UcbCheckout extends com.google.protobuf.h implements v2j0 {
        public static final int BILLING_PROVIDER_SELECTOR_SUBTITLE_FIELD_NUMBER = 3;
        public static final int BILLING_PROVIDER_SELECTOR_TITLE_FIELD_NUMBER = 2;
        public static final int CHANGE_COUNTRY_FIELD_NUMBER = 10;
        public static final int CHANGE_PRODUCT_FOLLOW_LINK_FIELD_NUMBER = 11;
        private static final UcbCheckout DEFAULT_INSTANCE;
        public static final int EXPANSION_STATE_FIELD_NUMBER = 4;
        public static final int GOOGLE_PLAY_BILLING_FIELD_NUMBER = 5;
        public static final int GPB_CHECKOUT_FIELD_NUMBER = 8;
        public static final int GPB_UNAVAILABLE_FIELD_NUMBER = 9;
        public static final int PAGE_TITLE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int SPOTIFY_CHECKOUT_NATIVE_FIELD_NUMBER = 12;
        public static final int SPOTIFY_CHECKOUT_URL_FIELD_NUMBER = 7;
        public static final int SPOTIFY_FIELD_NUMBER = 6;
        private int bitField0_;
        private ChangeCountry changeCountry_;
        private Object changeProductAction_;
        private int expansionState_;
        private BillingProvider googlePlayBilling_;
        private Object gpbCheckoutAction_;
        private Object spotifyCheckoutAction_;
        private BillingProvider spotify_;
        private int spotifyCheckoutActionCase_ = 0;
        private int gpbCheckoutActionCase_ = 0;
        private int changeProductActionCase_ = 0;
        private String pageTitle_ = "";
        private String billingProviderSelectorTitle_ = "";
        private String billingProviderSelectorSubtitle_ = "";

        public static final class AndMorePaymentMethodLogos extends com.google.protobuf.h implements v2j0 {
            public static final int ADDITIONAL_METHODS_LABEL_FIELD_NUMBER = 2;
            private static final AndMorePaymentMethodLogos DEFAULT_INSTANCE;
            public static final int LOGOS_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private h290 logos_ = com.google.protobuf.h.emptyProtobufList();
            private String additionalMethodsLabel_ = "";

            static {
                AndMorePaymentMethodLogos andMorePaymentMethodLogos = new AndMorePaymentMethodLogos();
                DEFAULT_INSTANCE = andMorePaymentMethodLogos;
                com.google.protobuf.h.registerDefaultInstance(AndMorePaymentMethodLogos.class, andMorePaymentMethodLogos);
            }

            private AndMorePaymentMethodLogos() {
            }

            public static AndMorePaymentMethodLogos p() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static a0 r() {
                return (a0) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"logos_", Image.class, "additionalMethodsLabel_"});
                }
                if (iOrdinal == 3) {
                    return new AndMorePaymentMethodLogos();
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
                synchronized (AndMorePaymentMethodLogos.class) {
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

            public final void n(Iterable iterable) {
                h290 h290VarMutableCopy = this.logos_;
                if (!((i9) h290VarMutableCopy).a) {
                    h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                    this.logos_ = h290VarMutableCopy;
                }
                s8.addAll(iterable, h290VarMutableCopy);
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.additionalMethodsLabel_;
            }

            public final h290 q() {
                return this.logos_;
            }

            public final void s() {
                this.additionalMethodsLabel_ = "and more";
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class BillingProvider extends com.google.protobuf.h implements v2j0 {
            public static final int AND_MORE_PAYMENT_METHOD_LOGOS_FIELD_NUMBER = 4;
            public static final int BANNER_FIELD_NUMBER = 10;
            public static final int BANNER_WARNINGS_FIELD_NUMBER = 9;
            private static final BillingProvider DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 2;
            public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
            public static final int LINE_ITEM_FIELD_NUMBER = 8;
            private static volatile qzr0 PARSER = null;
            public static final int POP_OVER_PAYMENT_METHOD_LOGOS_FIELD_NUMBER = 5;
            public static final int PROCEED_BUTTON_LABEL_FIELD_NUMBER = 6;
            public static final int PROVIDER_LEGAL_TERMS_FIELD_NUMBER = 7;
            public static final int QUEBEC_STUDENT_TRIAL_TERM_FIELD_NUMBER = 100;
            public static final int SHOW_ALL_PAYMENT_METHOD_LOGOS_FIELD_NUMBER = 3;
            public static final int TRACKING_DATA_FIELD_NUMBER = 15;
            private Banner banner_;
            private int bitField0_;
            private LineItem lineItem_;
            private Object paymentMethodLogos_;
            private BillingProviderTrackingData trackingData_;
            private int paymentMethodLogosCase_ = 0;
            private String displayName_ = "";
            private String description_ = "";
            private String proceedButtonLabel_ = "";
            private h290 providerLegalTerms_ = com.google.protobuf.h.emptyProtobufList();
            private h290 bannerWarnings_ = com.google.protobuf.h.emptyProtobufList();
            private String quebecStudentTrialTerm_ = "";

            public static final class BillingProviderTrackingData extends com.google.protobuf.h implements v2j0 {
                private static final BillingProviderTrackingData DEFAULT_INSTANCE;
                public static final int ID_FIELD_NUMBER = 1;
                private static volatile qzr0 PARSER;
                private String id_ = "";

                static {
                    BillingProviderTrackingData billingProviderTrackingData = new BillingProviderTrackingData();
                    DEFAULT_INSTANCE = billingProviderTrackingData;
                    com.google.protobuf.h.registerDefaultInstance(BillingProviderTrackingData.class, billingProviderTrackingData);
                }

                private BillingProviderTrackingData() {
                }

                public static BillingProviderTrackingData n() {
                    return DEFAULT_INSTANCE;
                }

                public static b0 o() {
                    return (b0) DEFAULT_INSTANCE.createBuilder();
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"id_"});
                    }
                    if (iOrdinal == 3) {
                        return new BillingProviderTrackingData();
                    }
                    if (iOrdinal == 4) {
                        return new b0(DEFAULT_INSTANCE);
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
                    synchronized (BillingProviderTrackingData.class) {
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

                public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                    return newBuilderForType();
                }

                public final void p(String str) {
                    this.id_ = str;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                BillingProvider billingProvider = new BillingProvider();
                DEFAULT_INSTANCE = billingProvider;
                com.google.protobuf.h.registerDefaultInstance(BillingProvider.class, billingProvider);
            }

            private BillingProvider() {
            }

            public static c0 A() {
                return (c0) DEFAULT_INSTANCE.createBuilder();
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static BillingProvider q() {
                return DEFAULT_INSTANCE;
            }

            public final void B(AndMorePaymentMethodLogos andMorePaymentMethodLogos) {
                this.paymentMethodLogos_ = andMorePaymentMethodLogos;
                this.paymentMethodLogosCase_ = 4;
            }

            public final void C(Banner banner) {
                banner.getClass();
                this.banner_ = banner;
                this.bitField0_ |= 2;
            }

            public final void D(String str) {
                this.description_ = str;
            }

            public final void E(String str) {
                this.displayName_ = str;
            }

            public final void F(LineItem lineItem) {
                this.lineItem_ = lineItem;
                this.bitField0_ |= 1;
            }

            public final void G(PopOverPaymentMethodLogos popOverPaymentMethodLogos) {
                this.paymentMethodLogos_ = popOverPaymentMethodLogos;
                this.paymentMethodLogosCase_ = 5;
            }

            public final void H(String str) {
                this.proceedButtonLabel_ = str;
            }

            public final void I() {
                this.quebecStudentTrialTerm_ = "I confirm that I am not a resident of the province of Quebec";
            }

            public final void J(BillingProviderTrackingData billingProviderTrackingData) {
                billingProviderTrackingData.getClass();
                this.trackingData_ = billingProviderTrackingData;
                this.bitField0_ |= 4;
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0001\u0001d\f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006Ȉ\u0007Ț\bဉ\u0000\tȚ\nဉ\u0001\u000fဉ\u0002dȈ", new Object[]{"paymentMethodLogos_", "paymentMethodLogosCase_", "bitField0_", "displayName_", "description_", ShowAllPaymentMethodLogos.class, AndMorePaymentMethodLogos.class, PopOverPaymentMethodLogos.class, "proceedButtonLabel_", "providerLegalTerms_", "lineItem_", "bannerWarnings_", "banner_", "trackingData_", "quebecStudentTrialTerm_"});
                }
                if (iOrdinal == 3) {
                    return new BillingProvider();
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
                synchronized (BillingProvider.class) {
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

            public final String getDescription() {
                return this.description_;
            }

            public final String getDisplayName() {
                return this.displayName_;
            }

            public final void n(Iterable iterable) {
                h290 h290VarMutableCopy = this.providerLegalTerms_;
                if (!((i9) h290VarMutableCopy).a) {
                    h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                    this.providerLegalTerms_ = h290VarMutableCopy;
                }
                s8.addAll(iterable, h290VarMutableCopy);
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final AndMorePaymentMethodLogos o() {
                return this.paymentMethodLogosCase_ == 4 ? (AndMorePaymentMethodLogos) this.paymentMethodLogos_ : AndMorePaymentMethodLogos.p();
            }

            public final Banner p() {
                Banner banner = this.banner_;
                return banner == null ? Banner.o() : banner;
            }

            public final LineItem r() {
                LineItem lineItem = this.lineItem_;
                return lineItem == null ? LineItem.n() : lineItem;
            }

            public final int s() {
                int i = this.paymentMethodLogosCase_;
                if (i == 0) {
                    return 4;
                }
                if (i == 3) {
                    return 1;
                }
                if (i != 4) {
                    return i != 5 ? 0 : 3;
                }
                return 2;
            }

            public final PopOverPaymentMethodLogos t() {
                return this.paymentMethodLogosCase_ == 5 ? (PopOverPaymentMethodLogos) this.paymentMethodLogos_ : PopOverPaymentMethodLogos.p();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final String u() {
                return this.proceedButtonLabel_;
            }

            public final h290 v() {
                return this.providerLegalTerms_;
            }

            public final String w() {
                return this.quebecStudentTrialTerm_;
            }

            public final ShowAllPaymentMethodLogos x() {
                return this.paymentMethodLogosCase_ == 3 ? (ShowAllPaymentMethodLogos) this.paymentMethodLogos_ : ShowAllPaymentMethodLogos.n();
            }

            public final BillingProviderTrackingData y() {
                BillingProviderTrackingData billingProviderTrackingData = this.trackingData_;
                return billingProviderTrackingData == null ? BillingProviderTrackingData.n() : billingProviderTrackingData;
            }

            public final boolean z() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public static final class PopOverPaymentMethodLogos extends com.google.protobuf.h implements v2j0 {
            private static final PopOverPaymentMethodLogos DEFAULT_INSTANCE;
            public static final int INITIAL_LOGOS_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int POP_OVER_LOGOS_FIELD_NUMBER = 2;
            private h290 initialLogos_ = com.google.protobuf.h.emptyProtobufList();
            private h290 popOverLogos_ = com.google.protobuf.h.emptyProtobufList();

            static {
                PopOverPaymentMethodLogos popOverPaymentMethodLogos = new PopOverPaymentMethodLogos();
                DEFAULT_INSTANCE = popOverPaymentMethodLogos;
                com.google.protobuf.h.registerDefaultInstance(PopOverPaymentMethodLogos.class, popOverPaymentMethodLogos);
            }

            private PopOverPaymentMethodLogos() {
            }

            public static PopOverPaymentMethodLogos p() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static f0 t() {
                return (f0) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"initialLogos_", Image.class, "popOverLogos_", Image.class});
                }
                if (iOrdinal == 3) {
                    return new PopOverPaymentMethodLogos();
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
                synchronized (PopOverPaymentMethodLogos.class) {
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

            public final void n(Iterable iterable) {
                h290 h290VarMutableCopy = this.initialLogos_;
                if (!((i9) h290VarMutableCopy).a) {
                    h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                    this.initialLogos_ = h290VarMutableCopy;
                }
                s8.addAll(iterable, h290VarMutableCopy);
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final void o(Iterable iterable) {
                h290 h290VarMutableCopy = this.popOverLogos_;
                if (!((i9) h290VarMutableCopy).a) {
                    h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                    this.popOverLogos_ = h290VarMutableCopy;
                }
                s8.addAll(iterable, h290VarMutableCopy);
            }

            public final h290 q() {
                return this.initialLogos_;
            }

            public final int r() {
                return this.popOverLogos_.size();
            }

            public final h290 s() {
                return this.popOverLogos_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class ShowAllPaymentMethodLogos extends com.google.protobuf.h implements v2j0 {
            private static final ShowAllPaymentMethodLogos DEFAULT_INSTANCE;
            public static final int LOGOS_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private h290 logos_ = com.google.protobuf.h.emptyProtobufList();

            static {
                ShowAllPaymentMethodLogos showAllPaymentMethodLogos = new ShowAllPaymentMethodLogos();
                DEFAULT_INSTANCE = showAllPaymentMethodLogos;
                com.google.protobuf.h.registerDefaultInstance(ShowAllPaymentMethodLogos.class, showAllPaymentMethodLogos);
            }

            private ShowAllPaymentMethodLogos() {
            }

            public static ShowAllPaymentMethodLogos n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"logos_", Image.class});
                }
                if (iOrdinal == 3) {
                    return new ShowAllPaymentMethodLogos();
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
                synchronized (ShowAllPaymentMethodLogos.class) {
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

            public final h290 o() {
                return this.logos_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            UcbCheckout ucbCheckout = new UcbCheckout();
            DEFAULT_INSTANCE = ucbCheckout;
            com.google.protobuf.h.registerDefaultInstance(UcbCheckout.class, ucbCheckout);
        }

        private UcbCheckout() {
        }

        public static d0 E() {
            return (d0) DEFAULT_INSTANCE.createBuilder();
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static UcbCheckout s() {
            return DEFAULT_INSTANCE;
        }

        public final int A() {
            int i = this.spotifyCheckoutActionCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 7) {
                return i != 12 ? 0 : 2;
            }
            return 1;
        }

        public final SpotifyCheckoutNative B() {
            return this.spotifyCheckoutActionCase_ == 12 ? (SpotifyCheckoutNative) this.spotifyCheckoutAction_ : SpotifyCheckoutNative.r();
        }

        public final SpotifyCheckout C() {
            return this.spotifyCheckoutActionCase_ == 7 ? (SpotifyCheckout) this.spotifyCheckoutAction_ : SpotifyCheckout.o();
        }

        public final boolean D() {
            return (this.bitField0_ & 4) != 0;
        }

        public final void F() {
            this.billingProviderSelectorSubtitle_ = "You can pay directly through Spotify or using your Google Play account";
        }

        public final void G() {
            this.billingProviderSelectorTitle_ = "Choose how to pay";
        }

        public final void H(ChangeCountry changeCountry) {
            changeCountry.getClass();
            this.changeCountry_ = changeCountry;
            this.bitField0_ |= 4;
        }

        public final void I(FollowLinkCta followLinkCta) {
            followLinkCta.getClass();
            this.changeProductAction_ = followLinkCta;
            this.changeProductActionCase_ = 11;
        }

        public final void J(e0 e0Var) {
            this.expansionState_ = e0Var.getNumber();
        }

        public final void K(BillingProvider billingProvider) {
            billingProvider.getClass();
            this.googlePlayBilling_ = billingProvider;
            this.bitField0_ |= 1;
        }

        public final void L(GpbCheckout gpbCheckout) {
            this.gpbCheckoutAction_ = gpbCheckout;
            this.gpbCheckoutActionCase_ = 8;
        }

        public final void M(GpbUnavailable gpbUnavailable) {
            gpbUnavailable.getClass();
            this.gpbCheckoutAction_ = gpbUnavailable;
            this.gpbCheckoutActionCase_ = 9;
        }

        public final void N() {
            this.pageTitle_ = "Checkout";
        }

        public final void O(BillingProvider billingProvider) {
            billingProvider.getClass();
            this.spotify_ = billingProvider;
            this.bitField0_ |= 2;
        }

        public final void P(SpotifyCheckoutNative spotifyCheckoutNative) {
            spotifyCheckoutNative.getClass();
            this.spotifyCheckoutAction_ = spotifyCheckoutNative;
            this.spotifyCheckoutActionCase_ = 12;
        }

        public final void Q(SpotifyCheckout spotifyCheckout) {
            this.spotifyCheckoutAction_ = spotifyCheckout;
            this.spotifyCheckoutActionCase_ = 7;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0003\u0001\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005ဉ\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0001\t<\u0001\nဉ\u0002\u000b<\u0002\f<\u0000", new Object[]{"spotifyCheckoutAction_", "spotifyCheckoutActionCase_", "gpbCheckoutAction_", "gpbCheckoutActionCase_", "changeProductAction_", "changeProductActionCase_", "bitField0_", "pageTitle_", "billingProviderSelectorTitle_", "billingProviderSelectorSubtitle_", "expansionState_", "googlePlayBilling_", "spotify_", SpotifyCheckout.class, GpbCheckout.class, GpbUnavailable.class, "changeCountry_", FollowLinkCta.class, SpotifyCheckoutNative.class});
            }
            if (iOrdinal == 3) {
                return new UcbCheckout();
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
            synchronized (UcbCheckout.class) {
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
            return this.billingProviderSelectorSubtitle_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.billingProviderSelectorTitle_;
        }

        public final ChangeCountry p() {
            ChangeCountry changeCountry = this.changeCountry_;
            return changeCountry == null ? ChangeCountry.n() : changeCountry;
        }

        public final int q() {
            int i = this.changeProductActionCase_;
            if (i != 0) {
                return i != 11 ? 0 : 1;
            }
            return 2;
        }

        public final FollowLinkCta r() {
            return this.changeProductActionCase_ == 11 ? (FollowLinkCta) this.changeProductAction_ : FollowLinkCta.n();
        }

        public final e0 t() {
            e0 e0Var;
            int i = this.expansionState_;
            if (i == 0) {
                e0Var = e0.EXPANSION_STATE_UNKNOWN;
            } else if (i == 1) {
                e0Var = e0.EXPANSION_STATE_SPOTIFY_EXPANDED;
            } else if (i != 2) {
                e0Var = i != 3 ? null : e0.EXPANSION_STATE_NONE_EXPANDED;
            } else {
                e0Var = e0.EXPANSION_STATE_GOOGLE_EXPANDED;
            }
            return e0Var == null ? e0.UNRECOGNIZED : e0Var;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final BillingProvider u() {
            BillingProvider billingProvider = this.googlePlayBilling_;
            return billingProvider == null ? BillingProvider.q() : billingProvider;
        }

        public final GpbCheckout v() {
            return this.gpbCheckoutActionCase_ == 8 ? (GpbCheckout) this.gpbCheckoutAction_ : GpbCheckout.n();
        }

        public final int w() {
            int i = this.gpbCheckoutActionCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 8) {
                return i != 9 ? 0 : 2;
            }
            return 1;
        }

        public final GpbUnavailable x() {
            return this.gpbCheckoutActionCase_ == 9 ? (GpbUnavailable) this.gpbCheckoutAction_ : GpbUnavailable.o();
        }

        public final String y() {
            return this.pageTitle_;
        }

        public final BillingProvider z() {
            BillingProvider billingProvider = this.spotify_;
            return billingProvider == null ? BillingProvider.q() : billingProvider;
        }
    }

    static {
        GetCheckoutPageResponse getCheckoutPageResponse = new GetCheckoutPageResponse();
        DEFAULT_INSTANCE = getCheckoutPageResponse;
        com.google.protobuf.h.registerDefaultInstance(GetCheckoutPageResponse.class, getCheckoutPageResponse);
    }

    private GetCheckoutPageResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static n w() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(GpbCheckout gpbCheckout) {
        this.response_ = gpbCheckout;
        this.responseCase_ = 3;
    }

    public final void B(Redirect redirect) {
        redirect.getClass();
        this.response_ = redirect;
        this.responseCase_ = 6;
    }

    public final void C(SpotifyCheckout spotifyCheckout) {
        this.response_ = spotifyCheckout;
        this.responseCase_ = 2;
    }

    public final void D(SpotifyCheckoutNative spotifyCheckoutNative) {
        spotifyCheckoutNative.getClass();
        this.response_ = spotifyCheckoutNative;
        this.responseCase_ = 8;
    }

    public final void E(UcbCheckout ucbCheckout) {
        ucbCheckout.getClass();
        this.response_ = ucbCheckout;
        this.responseCase_ = 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"response_", "responseCase_", UcbCheckout.class, SpotifyCheckout.class, GpbCheckout.class, CheckoutItemUnavailable.class, CheckoutStatus.class, Redirect.class, Error.class, SpotifyCheckoutNative.class});
        }
        if (iOrdinal == 3) {
            return new GetCheckoutPageResponse();
        }
        if (iOrdinal == 4) {
            return new n(DEFAULT_INSTANCE);
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
        synchronized (GetCheckoutPageResponse.class) {
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

    public final CheckoutItemUnavailable n() {
        return this.responseCase_ == 4 ? (CheckoutItemUnavailable) this.response_ : CheckoutItemUnavailable.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CheckoutStatus o() {
        return this.responseCase_ == 5 ? (CheckoutStatus) this.response_ : CheckoutStatus.p();
    }

    public final Error p() {
        return this.responseCase_ == 7 ? (Error) this.response_ : Error.s();
    }

    public final GpbCheckout q() {
        return this.responseCase_ == 3 ? (GpbCheckout) this.response_ : GpbCheckout.n();
    }

    public final Redirect r() {
        return this.responseCase_ == 6 ? (Redirect) this.response_ : Redirect.n();
    }

    public final int s() {
        switch (this.responseCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 3;
            default:
                return 0;
        }
    }

    public final SpotifyCheckout t() {
        return this.responseCase_ == 2 ? (SpotifyCheckout) this.response_ : SpotifyCheckout.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SpotifyCheckoutNative u() {
        return this.responseCase_ == 8 ? (SpotifyCheckoutNative) this.response_ : SpotifyCheckoutNative.r();
    }

    public final UcbCheckout v() {
        return this.responseCase_ == 1 ? (UcbCheckout) this.response_ : UcbCheckout.s();
    }

    public final void x(CheckoutItemUnavailable checkoutItemUnavailable) {
        this.response_ = checkoutItemUnavailable;
        this.responseCase_ = 4;
    }

    public final void y(CheckoutStatus checkoutStatus) {
        checkoutStatus.getClass();
        this.response_ = checkoutStatus;
        this.responseCase_ = 5;
    }

    public final void z(Error error) {
        error.getClass();
        this.response_ = error;
        this.responseCase_ = 7;
    }
}

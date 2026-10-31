package com.spotify.checkout.proto.model.v1.proto;

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
public final class LineItem extends com.google.protobuf.h implements v2j0 {
    private static final LineItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SIMPLE_FIELD_NUMBER = 1;
    public static final int V2_FIELD_NUMBER = 2;
    private int typeCase_ = 0;
    private Object type_;

    public static final class LineItemV2 extends com.google.protobuf.h implements v2j0 {
        public static final int ADDITIONAL_PRODUCT_INFORMATION_FIELD_NUMBER = 4;
        private static final LineItemV2 DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 1;
        public static final int OVERLAY_MESSAGE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int TIMELINE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Header header_;
        private TimelineV2 timeline_;
        private String overlayMessage_ = "";
        private h290 additionalProductInformation_ = com.google.protobuf.h.emptyProtobufList();

        public static final class Header extends com.google.protobuf.h implements v2j0 {
            private static final Header DEFAULT_INSTANCE;
            public static final int IMAGE_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 5;
            public static final int RECEIVING_USER_FIELD_NUMBER = 2;
            public static final int SUBTITLE_FIELD_NUMBER = 4;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private Image image_;
            private PriceInfo price_;
            private Face receivingUser_;
            private String title_ = "";
            private String subtitle_ = "";

            static {
                Header header = new Header();
                DEFAULT_INSTANCE = header;
                com.google.protobuf.h.registerDefaultInstance(Header.class, header);
            }

            private Header() {
            }

            public static Header n() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static j0 u() {
                return (j0) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005ဉ\u0002", new Object[]{"bitField0_", "image_", "receivingUser_", "title_", "subtitle_", "price_"});
                }
                if (iOrdinal == 3) {
                    return new Header();
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
                synchronized (Header.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final Image o() {
                Image image = this.image_;
                return image == null ? Image.o() : image;
            }

            public final PriceInfo p() {
                PriceInfo priceInfo = this.price_;
                return priceInfo == null ? PriceInfo.n() : priceInfo;
            }

            public final Face q() {
                Face face = this.receivingUser_;
                return face == null ? Face.o() : face;
            }

            public final boolean r() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean s() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean t() {
                return (this.bitField0_ & 2) != 0;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final void v(Image image) {
                image.getClass();
                this.image_ = image;
                this.bitField0_ |= 1;
            }

            public final void w(PriceInfo priceInfo) {
                priceInfo.getClass();
                this.price_ = priceInfo;
                this.bitField0_ |= 4;
            }

            public final void x() {
                this.subtitle_ = "1 Premium account that will hopefully also take two lines";
            }

            public final void y() {
                this.title_ = "LineItemV2 title";
            }
        }

        static {
            LineItemV2 lineItemV2 = new LineItemV2();
            DEFAULT_INSTANCE = lineItemV2;
            com.google.protobuf.h.registerDefaultInstance(LineItemV2.class, lineItemV2);
        }

        private LineItemV2() {
        }

        public static LineItemV2 p() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static i0 u() {
            return (i0) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ț", new Object[]{"bitField0_", "header_", "overlayMessage_", "timeline_", "additionalProductInformation_"});
            }
            if (iOrdinal == 3) {
                return new LineItemV2();
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
            synchronized (LineItemV2.class) {
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

        public final Header q() {
            Header header = this.header_;
            return header == null ? Header.n() : header;
        }

        public final String r() {
            return this.overlayMessage_;
        }

        public final TimelineV2 s() {
            TimelineV2 timelineV2 = this.timeline_;
            return timelineV2 == null ? TimelineV2.o() : timelineV2;
        }

        public final boolean t() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final void v(Header header) {
            header.getClass();
            this.header_ = header;
            this.bitField0_ |= 1;
        }

        public final void w(TimelineV2 timelineV2) {
            this.timeline_ = timelineV2;
            this.bitField0_ |= 2;
        }
    }

    public static final class PriceInfo extends com.google.protobuf.h implements v2j0 {
        private static final PriceInfo DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int V1_FIELD_NUMBER = 1;
        private int variationCase_ = 0;
        private Object variation_;

        public static final class PriceInfoV1 extends com.google.protobuf.h implements v2j0 {
            private static final PriceInfoV1 DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int SUBTITLE_FIELD_NUMBER = 2;
            public static final int TITLE_FIELD_NUMBER = 1;
            public static final int TITLE_SUFFIX_FIELD_NUMBER = 3;
            private String title_ = "";
            private String subtitle_ = "";
            private String titleSuffix_ = "";

            static {
                PriceInfoV1 priceInfoV1 = new PriceInfoV1();
                DEFAULT_INSTANCE = priceInfoV1;
                com.google.protobuf.h.registerDefaultInstance(PriceInfoV1.class, priceInfoV1);
            }

            private PriceInfoV1() {
            }

            public static PriceInfoV1 n() {
                return DEFAULT_INSTANCE;
            }

            public static l0 p() {
                return (l0) DEFAULT_INSTANCE.createBuilder();
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "subtitle_", "titleSuffix_"});
                }
                if (iOrdinal == 3) {
                    return new PriceInfoV1();
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
                synchronized (PriceInfoV1.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.titleSuffix_;
            }

            public final void q() {
                this.subtitle_ = "For 3 months";
            }

            public final void r() {
                this.title_ = "$9.99";
            }

            public final void s() {
                this.titleSuffix_ = "+ tax";
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            PriceInfo priceInfo = new PriceInfo();
            DEFAULT_INSTANCE = priceInfo;
            com.google.protobuf.h.registerDefaultInstance(PriceInfo.class, priceInfo);
        }

        private PriceInfo() {
        }

        public static PriceInfo n() {
            return DEFAULT_INSTANCE;
        }

        public static k0 p() {
            return (k0) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"variation_", "variationCase_", PriceInfoV1.class});
            }
            if (iOrdinal == 3) {
                return new PriceInfo();
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
            synchronized (PriceInfo.class) {
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

        public final PriceInfoV1 o() {
            return this.variationCase_ == 1 ? (PriceInfoV1) this.variation_ : PriceInfoV1.n();
        }

        public final void q(PriceInfoV1 priceInfoV1) {
            priceInfoV1.getClass();
            this.variation_ = priceInfoV1;
            this.variationCase_ = 1;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SimpleLineItem extends com.google.protobuf.h implements v2j0 {
        public static final int ADDITIONAL_PRODUCT_INFORMATION_FIELD_NUMBER = 4;
        public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 6;
        private static final SimpleLineItem DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 11;
        public static final int IMAGE_FIELD_NUMBER = 1;
        public static final int OVERLAY_MESSAGE_FIELD_NUMBER = 7;
        private static volatile qzr0 PARSER = null;
        public static final int PRICE_DETAILS_FIELD_NUMBER = 10;
        public static final int PRICE_FIELD_NUMBER = 5;
        public static final int PRODUCT_BREAKDOWN_FIELD_NUMBER = 12;
        public static final int RECEIVING_USER_FIELD_NUMBER = 9;
        public static final int SUBTITLE_FIELD_NUMBER = 3;
        public static final int TIMELINE_FIELD_NUMBER = 8;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Header header_;
        private Image image_;
        private ProductBreakdown productBreakdown_;
        private Face receivingUser_;
        private Timeline timeline_;
        private String title_ = "";
        private String subtitle_ = "";
        private h290 additionalProductInformation_ = com.google.protobuf.h.emptyProtobufList();
        private String price_ = "";
        private String additionalTaxLabel_ = "";
        private String overlayMessage_ = "";
        private String priceDetails_ = "";

        public static final class Header extends com.google.protobuf.h implements v2j0 {
            private static final Header DEFAULT_INSTANCE;
            public static final int IMAGE_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 5;
            public static final int RECEIVING_USER_FIELD_NUMBER = 2;
            public static final int SUBTITLE_FIELD_NUMBER = 4;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private Image image_;
            private Price price_;
            private Face receivingUser_;
            private String title_ = "";
            private String subtitle_ = "";

            public static final class Price extends com.google.protobuf.h implements v2j0 {
                public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 2;
                private static final Price DEFAULT_INSTANCE;
                private static volatile qzr0 PARSER = null;
                public static final int PRICE_DETAILS_FIELD_NUMBER = 3;
                public static final int PRICE_FIELD_NUMBER = 1;
                private String price_ = "";
                private String additionalTaxLabel_ = "";
                private String priceDetails_ = "";

                static {
                    Price price = new Price();
                    DEFAULT_INSTANCE = price;
                    com.google.protobuf.h.registerDefaultInstance(Price.class, price);
                }

                private Price() {
                }

                public static Price o() {
                    return DEFAULT_INSTANCE;
                }

                public static qzr0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                public static o0 r() {
                    return (o0) DEFAULT_INSTANCE.createBuilder();
                }

                public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                    bf40 bf40Var;
                    int iOrdinal = jf40Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"price_", "additionalTaxLabel_", "priceDetails_"});
                    }
                    if (iOrdinal == 3) {
                        return new Price();
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
                    synchronized (Price.class) {
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
                    return this.additionalTaxLabel_;
                }

                public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                    return newBuilderForType();
                }

                public final String p() {
                    return this.price_;
                }

                public final String q() {
                    return this.priceDetails_;
                }

                public final void s() {
                    this.additionalTaxLabel_ = "+ tax";
                }

                public final void t() {
                    this.price_ = "$9.99";
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }

                public final void u() {
                    this.priceDetails_ = "For 3 months";
                }
            }

            static {
                Header header = new Header();
                DEFAULT_INSTANCE = header;
                com.google.protobuf.h.registerDefaultInstance(Header.class, header);
            }

            private Header() {
            }

            public static Header n() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static n0 t() {
                return (n0) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005ဉ\u0002", new Object[]{"bitField0_", "image_", "receivingUser_", "title_", "subtitle_", "price_"});
                }
                if (iOrdinal == 3) {
                    return new Header();
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
                synchronized (Header.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final Image o() {
                Image image = this.image_;
                return image == null ? Image.o() : image;
            }

            public final Price p() {
                Price price = this.price_;
                return price == null ? Price.o() : price;
            }

            public final Face q() {
                Face face = this.receivingUser_;
                return face == null ? Face.o() : face;
            }

            public final boolean r() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean s() {
                return (this.bitField0_ & 2) != 0;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final void u(Image image) {
                image.getClass();
                this.image_ = image;
                this.bitField0_ |= 1;
            }

            public final void v(Price price) {
                price.getClass();
                this.price_ = price;
                this.bitField0_ |= 4;
            }

            public final void w(Face face) {
                face.getClass();
                this.receivingUser_ = face;
                this.bitField0_ |= 2;
            }

            public final void x(String str) {
                this.subtitle_ = str;
            }

            public final void y(String str) {
                this.title_ = str;
            }
        }

        static {
            SimpleLineItem simpleLineItem = new SimpleLineItem();
            DEFAULT_INSTANCE = simpleLineItem;
            com.google.protobuf.h.registerDefaultInstance(SimpleLineItem.class, simpleLineItem);
        }

        private SimpleLineItem() {
        }

        public static SimpleLineItem p() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static m0 w() {
            return (m0) DEFAULT_INSTANCE.createBuilder();
        }

        public final void A(Timeline timeline) {
            timeline.getClass();
            this.timeline_ = timeline;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0001\tဉ\u0002\nȈ\u000bဉ\u0003\fဉ\u0004", new Object[]{"bitField0_", "image_", "title_", "subtitle_", "additionalProductInformation_", "price_", "additionalTaxLabel_", "overlayMessage_", "timeline_", "receivingUser_", "priceDetails_", "header_", "productBreakdown_"});
            }
            if (iOrdinal == 3) {
                return new SimpleLineItem();
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
            synchronized (SimpleLineItem.class) {
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

        public final Header q() {
            Header header = this.header_;
            return header == null ? Header.n() : header;
        }

        public final String r() {
            return this.overlayMessage_;
        }

        public final ProductBreakdown s() {
            ProductBreakdown productBreakdown = this.productBreakdown_;
            return productBreakdown == null ? ProductBreakdown.p() : productBreakdown;
        }

        public final Timeline t() {
            Timeline timeline = this.timeline_;
            return timeline == null ? Timeline.n() : timeline;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final boolean u() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean v() {
            return (this.bitField0_ & 16) != 0;
        }

        public final void x(Header header) {
            header.getClass();
            this.header_ = header;
            this.bitField0_ |= 8;
        }

        public final void y() {
            this.overlayMessage_ = "This item is no longer available";
        }

        public final void z(ProductBreakdown productBreakdown) {
            productBreakdown.getClass();
            this.productBreakdown_ = productBreakdown;
            this.bitField0_ |= 16;
        }
    }

    static {
        LineItem lineItem = new LineItem();
        DEFAULT_INSTANCE = lineItem;
        com.google.protobuf.h.registerDefaultInstance(LineItem.class, lineItem);
    }

    private LineItem() {
    }

    public static LineItem n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static h0 r() {
        return (h0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", SimpleLineItem.class, LineItemV2.class});
        }
        if (iOrdinal == 3) {
            return new LineItem();
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
        synchronized (LineItem.class) {
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

    public final SimpleLineItem o() {
        return this.typeCase_ == 1 ? (SimpleLineItem) this.type_ : SimpleLineItem.p();
    }

    public final int p() {
        int i = this.typeCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final LineItemV2 q() {
        return this.typeCase_ == 2 ? (LineItemV2) this.type_ : LineItemV2.p();
    }

    public final void s(SimpleLineItem simpleLineItem) {
        simpleLineItem.getClass();
        this.type_ = simpleLineItem;
        this.typeCase_ = 1;
    }

    public final void t(LineItemV2 lineItemV2) {
        lineItemV2.getClass();
        this.type_ = lineItemV2;
        this.typeCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

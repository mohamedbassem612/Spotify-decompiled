package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Receipt extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int BODY_FIELD_NUMBER = 3;
    private static final Receipt DEFAULT_INSTANCE;
    public static final int ENTITY_DATA_ROW_ACCESSIBILITY_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private AccessibilityDefinition entityDataRowAccessibility_;
    private Header header_;
    private String backgroundColor_ = "";
    private h290 body_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Bar extends com.google.protobuf.h implements v2j0 {
        public static final int BOTTOM_LABEL_FIELD_NUMBER = 3;
        public static final int COLOR_FIELD_NUMBER = 1000;
        private static final Bar DEFAULT_INSTANCE;
        public static final int GRADIENT_FIELD_NUMBER = 1002;
        public static final int HEIGHT_FIELD_NUMBER = 1;
        public static final int IMAGE_URL_FIELD_NUMBER = 1001;
        private static volatile qzr0 PARSER = null;
        public static final int TOP_LABEL_FIELD_NUMBER = 2;
        private int backgroundCase_ = 0;
        private Object background_;
        private int bitField0_;
        private Paragraph bottomLabel_;
        private float height_;
        private Paragraph topLabel_;

        static {
            Bar bar = new Bar();
            DEFAULT_INSTANCE = bar;
            com.google.protobuf.h.registerDefaultInstance(Bar.class, bar);
        }

        private Bar() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001Ϫ\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဉ\u0002ϨȻ\u0000ϩȻ\u0000Ϫ<\u0000", new Object[]{"background_", "backgroundCase_", "bitField0_", "height_", "topLabel_", "bottomLabel_", Gradient.class});
            }
            if (iOrdinal == 3) {
                return new Bar();
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
            synchronized (Bar.class) {
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

        public final String getImageUrl() {
            return this.backgroundCase_ == 1001 ? (String) this.background_ : "";
        }

        public final int n() {
            int i = this.backgroundCase_;
            if (i == 0) {
                return 4;
            }
            switch (i) {
                case 1000:
                    return 1;
                case 1001:
                    return 2;
                case 1002:
                    return 3;
                default:
                    return 0;
            }
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Paragraph o() {
            Paragraph paragraph = this.bottomLabel_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final String p() {
            return this.backgroundCase_ == 1000 ? (String) this.background_ : "";
        }

        public final Gradient q() {
            return this.backgroundCase_ == 1002 ? (Gradient) this.background_ : Gradient.o();
        }

        public final float r() {
            return this.height_;
        }

        public final Paragraph s() {
            Paragraph paragraph = this.topLabel_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean t() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final boolean u() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public static final class Component extends com.google.protobuf.h implements v2j0 {
        private static final Component DEFAULT_INSTANCE;
        public static final int DIVIDER_FIELD_NUMBER = 1001;
        public static final int ENTITY_DATA_ROW_FIELD_NUMBER = 1004;
        public static final int ENTITY_HEADER_ROW_FIELD_NUMBER = 1003;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int SPACER_FIELD_NUMBER = 1000;
        public static final int TEXT_FIELD_NUMBER = 1002;
        private int bitField0_;
        private Object content_;
        private int contentCase_ = 0;
        private String id_ = "";

        public static final class Divider extends com.google.protobuf.h implements v2j0 {
            public static final int COLOR_FIELD_NUMBER = 1;
            private static final Divider DEFAULT_INSTANCE;
            public static final int HORIZONTAL_MARGIN_POINTS_FIELD_NUMBER = 2;
            private static volatile qzr0 PARSER;
            private String color_ = "";
            private int horizontalMarginPoints_;

            static {
                Divider divider = new Divider();
                DEFAULT_INSTANCE = divider;
                com.google.protobuf.h.registerDefaultInstance(Divider.class, divider);
            }

            private Divider() {
            }

            public static Divider o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"color_", "horizontalMarginPoints_"});
                }
                if (iOrdinal == 3) {
                    return new Divider();
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
                synchronized (Divider.class) {
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
                return this.color_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final int p() {
                return this.horizontalMarginPoints_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class EntityDataRow extends com.google.protobuf.h implements v2j0 {
            public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 8;
            public static final int BARS_FIELD_NUMBER = 6;
            public static final int CHART_ACCESSIBILITY_TEXT_FIELD_NUMBER = 9;
            public static final int CHEVRON_ICON_COLOR_FIELD_NUMBER = 7;
            public static final int COUNT_LABEL_FIELD_NUMBER = 5;
            private static final EntityDataRow DEFAULT_INSTANCE;
            public static final int ENTITY_URI_FIELD_NUMBER = 10;
            public static final int IMAGE_FIELD_NUMBER = 2;
            public static final int NUMBER_LABEL_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int SUBTITLE_FIELD_NUMBER = 4;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private Paragraph countLabel_;
            private Image image_;
            private Paragraph numberLabel_;
            private Paragraph subtitle_;
            private Paragraph title_;
            private h290 bars_ = com.google.protobuf.h.emptyProtobufList();
            private String chevronIconColor_ = "";
            private String accessibilityText_ = "";
            private String chartAccessibilityText_ = "";
            private String entityUri_ = "";

            static {
                EntityDataRow entityDataRow = new EntityDataRow();
                DEFAULT_INSTANCE = entityDataRow;
                com.google.protobuf.h.registerDefaultInstance(EntityDataRow.class, entityDataRow);
            }

            private EntityDataRow() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static EntityDataRow s() {
                return DEFAULT_INSTANCE;
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\u001b\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"bitField0_", "numberLabel_", "image_", "title_", "subtitle_", "countLabel_", "bars_", Bar.class, "chevronIconColor_", "accessibilityText_", "chartAccessibilityText_", "entityUri_"});
                }
                if (iOrdinal == 3) {
                    return new EntityDataRow();
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
                synchronized (EntityDataRow.class) {
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

            public final String getEntityUri() {
                return this.entityUri_;
            }

            public final String n() {
                return this.accessibilityText_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final h290 o() {
                return this.bars_;
            }

            public final String p() {
                return this.chartAccessibilityText_;
            }

            public final String q() {
                return this.chevronIconColor_;
            }

            public final Paragraph r() {
                Paragraph paragraph = this.countLabel_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final Image t() {
                Image image = this.image_;
                return image == null ? Image.n() : image;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final Paragraph u() {
                Paragraph paragraph = this.numberLabel_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final Paragraph v() {
                Paragraph paragraph = this.subtitle_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final Paragraph w() {
                Paragraph paragraph = this.title_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final boolean x() {
                return (this.bitField0_ & 8) != 0;
            }
        }

        public static final class EntityHeaderRow extends com.google.protobuf.h implements v2j0 {
            private static final EntityHeaderRow DEFAULT_INSTANCE;
            public static final int METRIC_LABEL_FIELD_NUMBER = 3;
            public static final int NUMERAL_LABEL_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int TYPE_LABEL_FIELD_NUMBER = 2;
            private int bitField0_;
            private Paragraph metricLabel_;
            private Paragraph numeralLabel_;
            private Paragraph typeLabel_;

            static {
                EntityHeaderRow entityHeaderRow = new EntityHeaderRow();
                DEFAULT_INSTANCE = entityHeaderRow;
                com.google.protobuf.h.registerDefaultInstance(EntityHeaderRow.class, entityHeaderRow);
            }

            private EntityHeaderRow() {
            }

            public static EntityHeaderRow n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "numeralLabel_", "typeLabel_", "metricLabel_"});
                }
                if (iOrdinal == 3) {
                    return new EntityHeaderRow();
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
                synchronized (EntityHeaderRow.class) {
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

            public final Paragraph o() {
                Paragraph paragraph = this.metricLabel_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final Paragraph p() {
                Paragraph paragraph = this.numeralLabel_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final Paragraph q() {
                Paragraph paragraph = this.typeLabel_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Spacer extends com.google.protobuf.h implements v2j0 {
            private static final Spacer DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int POINTS_FIELD_NUMBER = 1;
            private int points_;

            static {
                Spacer spacer = new Spacer();
                DEFAULT_INSTANCE = spacer;
                com.google.protobuf.h.registerDefaultInstance(Spacer.class, spacer);
            }

            private Spacer() {
            }

            public static Spacer n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"points_"});
                }
                if (iOrdinal == 3) {
                    return new Spacer();
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
                synchronized (Spacer.class) {
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

            public final int o() {
                return this.points_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Text extends com.google.protobuf.h implements v2j0 {
            private static final Text DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int SEE_MORE_TEXT_FIELD_NUMBER = 2;
            public static final int TEXT_FIELD_NUMBER = 1;
            private int bitField0_;
            private Paragraph seeMoreText_;
            private Paragraph text_;

            static {
                Text text = new Text();
                DEFAULT_INSTANCE = text;
                com.google.protobuf.h.registerDefaultInstance(Text.class, text);
            }

            private Text() {
            }

            public static Text n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "text_", "seeMoreText_"});
                }
                if (iOrdinal == 3) {
                    return new Text();
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
                synchronized (Text.class) {
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

            public final Paragraph o() {
                Paragraph paragraph = this.seeMoreText_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final Paragraph p() {
                Paragraph paragraph = this.text_;
                return paragraph == null ? Paragraph.n() : paragraph;
            }

            public final boolean q() {
                return (this.bitField0_ & 2) != 0;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Component component = new Component();
            DEFAULT_INSTANCE = component;
            com.google.protobuf.h.registerDefaultInstance(Component.class, component);
        }

        private Component() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001Ϭ\u0006\u0000\u0000\u0000\u0001ለ\u0000Ϩ<\u0000ϩ<\u0000Ϫ<\u0000ϫ<\u0000Ϭ<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "id_", Spacer.class, Divider.class, Text.class, EntityHeaderRow.class, EntityDataRow.class});
            }
            if (iOrdinal == 3) {
                return new Component();
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
            synchronized (Component.class) {
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

        public final int n() {
            int i = this.contentCase_;
            if (i == 0) {
                return 6;
            }
            switch (i) {
                case 1000:
                    return 1;
                case 1001:
                    return 2;
                case 1002:
                    return 3;
                case ENTITY_HEADER_ROW_FIELD_NUMBER /* 1003 */:
                    return 4;
                case ENTITY_DATA_ROW_FIELD_NUMBER /* 1004 */:
                    return 5;
                default:
                    return 0;
            }
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Divider o() {
            return this.contentCase_ == 1001 ? (Divider) this.content_ : Divider.o();
        }

        public final EntityDataRow p() {
            return this.contentCase_ == 1004 ? (EntityDataRow) this.content_ : EntityDataRow.s();
        }

        public final EntityHeaderRow q() {
            return this.contentCase_ == 1003 ? (EntityHeaderRow) this.content_ : EntityHeaderRow.n();
        }

        public final Spacer r() {
            return this.contentCase_ == 1000 ? (Spacer) this.content_ : Spacer.n();
        }

        public final Text s() {
            return this.contentCase_ == 1002 ? (Text) this.content_ : Text.n();
        }

        public final boolean t() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Header extends com.google.protobuf.h implements v2j0 {
        public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 1;
        public static final int COMPONENTS_FIELD_NUMBER = 2;
        private static final Header DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private String backgroundImageUrl_ = "";
        private h290 components_ = com.google.protobuf.h.emptyProtobufList();

        static {
            Header header = new Header();
            DEFAULT_INSTANCE = header;
            com.google.protobuf.h.registerDefaultInstance(Header.class, header);
        }

        private Header() {
        }

        public static Header p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"backgroundImageUrl_", "components_", Component.class});
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

        public final String n() {
            return this.backgroundImageUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.components_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Image extends com.google.protobuf.h implements v2j0 {
        private static final Image DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SHAPE_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        private int shape_;
        private String url_ = "";

        static {
            Image image = new Image();
            DEFAULT_INSTANCE = image;
            com.google.protobuf.h.registerDefaultInstance(Image.class, image);
        }

        private Image() {
        }

        public static Image n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"url_", "shape_"});
            }
            if (iOrdinal == 3) {
                return new Image();
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
            synchronized (Image.class) {
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

        public final p0 o() {
            p0 p0Var;
            int i = this.shape_;
            if (i == 0) {
                p0Var = p0.SHAPE_SQUARE;
            } else if (i != 1) {
                p0Var = i != 2 ? null : p0.SHAPE_ROUNDED;
            } else {
                p0Var = p0.SHAPE_CIRCLE;
            }
            return p0Var == null ? p0.UNRECOGNIZED : p0Var;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Receipt receipt = new Receipt();
        DEFAULT_INSTANCE = receipt;
        com.google.protobuf.h.registerDefaultInstance(Receipt.class, receipt);
    }

    private Receipt() {
    }

    public static Receipt p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "header_", "backgroundColor_", "body_", Component.class, "entityDataRowAccessibility_"});
        }
        if (iOrdinal == 3) {
            return new Receipt();
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
        synchronized (Receipt.class) {
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
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.body_;
    }

    public final Header q() {
        Header header = this.header_;
        return header == null ? Header.p() : header;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

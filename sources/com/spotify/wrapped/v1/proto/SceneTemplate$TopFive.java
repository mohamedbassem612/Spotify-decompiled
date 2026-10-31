package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.jk41;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopFive extends com.google.protobuf.h implements v2j0 {
    public static final int BUTTON_CONFIGURATION_FIELD_NUMBER = 4;
    private static final SceneTemplate$TopFive DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LIST_ITEMS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ButtonConfiguration buttonConfiguration_;
    private Paragraph header_;
    private Layout layout_;
    private h290 listItems_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Item extends com.google.protobuf.h implements v2j0 {
        private static final Item DEFAULT_INSTANCE;
        public static final int EXPRESSIVE_POSITION_LABEL_FIELD_NUMBER = 5;
        public static final int IMAGE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Paragraph expressivePositionLabel_;
        private Image image_;
        private Paragraph position_;
        private Paragraph subtitle_;
        private Paragraph title_;

        static {
            Item item = new Item();
            DEFAULT_INSTANCE = item;
            com.google.protobuf.h.registerDefaultInstance(Item.class, item);
        }

        private Item() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "position_", "image_", "title_", "subtitle_", "expressivePositionLabel_"});
            }
            if (iOrdinal == 3) {
                return new Item();
            }
            if (iOrdinal == 4) {
                return new x1(DEFAULT_INSTANCE);
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
            synchronized (Item.class) {
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

        public final Paragraph n() {
            Paragraph paragraph = this.expressivePositionLabel_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Image o() {
            Image image = this.image_;
            return image == null ? Image.o() : image;
        }

        public final Paragraph p() {
            Paragraph paragraph = this.position_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph q() {
            Paragraph paragraph = this.subtitle_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final Paragraph r() {
            Paragraph paragraph = this.title_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final boolean s() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean t() {
            return (this.bitField0_ & 8) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Layout extends com.google.protobuf.h implements v2j0 {
        private static final Layout DEFAULT_INSTANCE;
        public static final int EXPRESSIVE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int STANDARD_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 3;
        private int typeCase_ = 0;
        private Object type_;

        static {
            Layout layout = new Layout();
            DEFAULT_INSTANCE = layout;
            com.google.protobuf.h.registerDefaultInstance(Layout.class, layout);
        }

        private Layout() {
        }

        public static Layout n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000", new Object[]{"type_", "typeCase_"});
            }
            if (iOrdinal == 3) {
                return new Layout();
            }
            if (iOrdinal == 4) {
                return new y1(DEFAULT_INSTANCE);
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
            synchronized (Layout.class) {
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

        public final jk41 o() {
            int i = this.typeCase_;
            jk41 jk41Var = jk41.STANDARD_VARIATION_UNSPECIFIED;
            if (i == 1) {
                int iIntValue = ((Integer) this.type_).intValue();
                if (iIntValue != 0) {
                    if (iIntValue == 1) {
                        jk41Var = jk41.UNIFORM;
                    } else if (iIntValue != 2) {
                        jk41Var = iIntValue != 3 ? null : jk41.TILTED;
                    } else {
                        jk41Var = jk41.SCALED;
                    }
                }
                if (jk41Var == null) {
                    return jk41.UNRECOGNIZED;
                }
            }
            return jk41Var;
        }

        public final int p() {
            int i = this.typeCase_;
            if (i == 0) {
                return 4;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        return 0;
                    }
                }
            }
            return i2;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SceneTemplate$TopFive sceneTemplate$TopFive = new SceneTemplate$TopFive();
        DEFAULT_INSTANCE = sceneTemplate$TopFive;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopFive.class, sceneTemplate$TopFive);
    }

    private SceneTemplate$TopFive() {
    }

    public static SceneTemplate$TopFive n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"bitField0_", "layout_", "header_", "listItems_", Item.class, "buttonConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopFive();
        }
        if (iOrdinal == 4) {
            return new w1(DEFAULT_INSTANCE);
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
        synchronized (SceneTemplate$TopFive.class) {
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
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Layout p() {
        Layout layout = this.layout_;
        return layout == null ? Layout.n() : layout;
    }

    public final h290 q() {
        return this.listItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

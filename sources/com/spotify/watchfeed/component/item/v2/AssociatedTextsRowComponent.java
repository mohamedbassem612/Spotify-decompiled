package com.spotify.watchfeed.component.item.v2;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import java.util.List;
import p.bf40;
import p.e47;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AssociatedTextsRowComponent extends h implements v2j0 {
    private static final AssociatedTextsRowComponent DEFAULT_INSTANCE;
    public static final int DURATION_PER_ITEM_FIELD_NUMBER = 2;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int durationPerItem_;
    private h290 items_ = h.emptyProtobufList();

    public static final class Item extends h implements v2j0 {
        public static final int ATTRIBUTION_FIELD_NUMBER = 3;
        private static final Item DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private Attribution attribution_;
        private int bitField0_;
        private String text_ = "";

        public static final class Attribution extends h implements v2j0 {
            public static final int ACCESSIBILITY_FIELD_NUMBER = 5;
            public static final int AUTHOR_IMAGE_FIELD_NUMBER = 1;
            public static final int AUTHOR_NAME_FIELD_NUMBER = 3;
            public static final int AUTHOR_TYPE_FIELD_NUMBER = 2;
            public static final int DATE_TEXT_FIELD_NUMBER = 4;
            private static final Attribution DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;
            private Image authorImage_;
            private int authorType_;
            private int bitField0_;
            private String authorName_ = "";
            private String dateText_ = "";
            private String accessibility_ = "";

            static {
                Attribution attribution = new Attribution();
                DEFAULT_INSTANCE = attribution;
                h.registerDefaultInstance(Attribution.class, attribution);
            }

            private Attribution() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static Attribution r() {
                return DEFAULT_INSTANCE;
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "authorImage_", "authorType_", "authorName_", "dateText_", "accessibility_"});
                }
                if (iOrdinal == 3) {
                    return new Attribution();
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
                synchronized (Attribution.class) {
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

            public final Image n() {
                Image image = this.authorImage_;
                return image == null ? Image.n() : image;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.authorName_;
            }

            public final e47 p() {
                e47 e47Var;
                int i = this.authorType_;
                if (i == 0) {
                    e47Var = e47.DEFAULT;
                } else if (i == 1) {
                    e47Var = e47.ARTIST;
                } else if (i != 2) {
                    e47Var = i != 3 ? null : e47.USER;
                } else {
                    e47Var = e47.SHOW;
                }
                return e47Var == null ? e47.UNRECOGNIZED : e47Var;
            }

            public final String q() {
                return this.dateText_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Item item = new Item();
            DEFAULT_INSTANCE = item;
            h.registerDefaultInstance(Item.class, item);
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "text_", "attribution_"});
            }
            if (iOrdinal == 3) {
                return new Item();
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

        public final Attribution n() {
            Attribution attribution = this.attribution_;
            return attribution == null ? Attribution.r() : attribution;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AssociatedTextsRowComponent associatedTextsRowComponent = new AssociatedTextsRowComponent();
        DEFAULT_INSTANCE = associatedTextsRowComponent;
        h.registerDefaultInstance(AssociatedTextsRowComponent.class, associatedTextsRowComponent);
    }

    private AssociatedTextsRowComponent() {
    }

    public static AssociatedTextsRowComponent o(phc phcVar) {
        return (AssociatedTextsRowComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"items_", Item.class, "durationPerItem_"});
        }
        if (iOrdinal == 3) {
            return new AssociatedTextsRowComponent();
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
        synchronized (AssociatedTextsRowComponent.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final int n() {
        return this.durationPerItem_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

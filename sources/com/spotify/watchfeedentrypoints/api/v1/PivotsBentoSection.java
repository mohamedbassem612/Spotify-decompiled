package com.spotify.watchfeedentrypoints.api.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PivotsBentoSection extends h implements v2j0 {
    private static final PivotsBentoSection DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 items_ = h.emptyProtobufList();

    public static final class Item extends h implements v2j0 {
        private static final Item DEFAULT_INSTANCE;
        public static final int EXPLORER_ITEM_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int VIDEO_ITEM_FIELD_NUMBER = 1;
        private int itemTypeCase_ = 0;
        private Object itemType_;

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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"itemType_", "itemTypeCase_", VideoItem.class, ExplorerItem.class});
            }
            if (iOrdinal == 3) {
                return new Item();
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

        public final ExplorerItem n() {
            return this.itemTypeCase_ == 2 ? (ExplorerItem) this.itemType_ : ExplorerItem.o();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int o() {
            int i = this.itemTypeCase_;
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

        public final VideoItem p() {
            return this.itemTypeCase_ == 1 ? (VideoItem) this.itemType_ : VideoItem.p();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PivotsBentoSection pivotsBentoSection = new PivotsBentoSection();
        DEFAULT_INSTANCE = pivotsBentoSection;
        h.registerDefaultInstance(PivotsBentoSection.class, pivotsBentoSection);
    }

    private PivotsBentoSection() {
    }

    public static PivotsBentoSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"items_", Item.class});
        }
        if (iOrdinal == 3) {
            return new PivotsBentoSection();
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
        synchronized (PivotsBentoSection.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

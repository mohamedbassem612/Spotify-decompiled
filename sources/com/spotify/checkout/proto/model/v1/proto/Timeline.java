package com.spotify.checkout.proto.model.v1.proto;

import java.util.List;
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
public final class Timeline extends com.google.protobuf.h implements v2j0 {
    private static final Timeline DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 items_ = com.google.protobuf.h.emptyProtobufList();

    public static final class TimelineItem extends com.google.protobuf.h implements v2j0 {
        private static final TimelineItem DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int IS_ACTIVE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String description_ = "";
        private boolean isActive_;

        static {
            TimelineItem timelineItem = new TimelineItem();
            DEFAULT_INSTANCE = timelineItem;
            com.google.protobuf.h.registerDefaultInstance(TimelineItem.class, timelineItem);
        }

        private TimelineItem() {
        }

        public static n1 o() {
            return (n1) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003Ȉ", new Object[]{"isActive_", "description_"});
            }
            if (iOrdinal == 3) {
                return new TimelineItem();
            }
            if (iOrdinal == 4) {
                return new n1(DEFAULT_INSTANCE);
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
            synchronized (TimelineItem.class) {
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

        public final boolean n() {
            return this.isActive_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final void p(String str) {
            this.description_ = str;
        }

        public final void q(boolean z) {
            this.isActive_ = z;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Timeline timeline = new Timeline();
        DEFAULT_INSTANCE = timeline;
        com.google.protobuf.h.registerDefaultInstance(Timeline.class, timeline);
    }

    private Timeline() {
    }

    public static Timeline n() {
        return DEFAULT_INSTANCE;
    }

    public static m1 o() {
        return (m1) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void addAllItems(Iterable iterable) {
        h290 h290VarMutableCopy = this.items_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.items_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", TimelineItem.class});
        }
        if (iOrdinal == 3) {
            return new Timeline();
        }
        if (iOrdinal == 4) {
            return new m1(DEFAULT_INSTANCE);
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
        synchronized (Timeline.class) {
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

    public final int getItemsCount() {
        return this.items_.size();
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

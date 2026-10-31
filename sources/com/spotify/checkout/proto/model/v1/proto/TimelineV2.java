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
public final class TimelineV2 extends com.google.protobuf.h implements v2j0 {
    private static final TimelineV2 DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 groups_ = com.google.protobuf.h.emptyProtobufList();

    public static final class TimelineGroup extends com.google.protobuf.h implements v2j0 {
        private static final TimelineGroup DEFAULT_INSTANCE;
        public static final int DETAILS_FIELD_NUMBER = 2;
        public static final int ITEMS_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String details_ = "";
        private h290 items_ = com.google.protobuf.h.emptyProtobufList();

        public static final class TimelineItem extends com.google.protobuf.h implements v2j0 {
            private static final TimelineItem DEFAULT_INSTANCE;
            public static final int DETAILS_FIELD_NUMBER = 2;
            public static final int NESTED_ITEMS_FIELD_NUMBER = 3;
            private static volatile qzr0 PARSER = null;
            public static final int TITLE_FIELD_NUMBER = 1;
            private String title_ = "";
            private String details_ = "";
            private h290 nestedItems_ = com.google.protobuf.h.emptyProtobufList();

            public static final class NestedTimelineItem extends com.google.protobuf.h implements v2j0 {
                private static final NestedTimelineItem DEFAULT_INSTANCE;
                public static final int DETAILS_FIELD_NUMBER = 2;
                private static volatile qzr0 PARSER = null;
                public static final int TITLE_FIELD_NUMBER = 1;
                private String title_ = "";
                private String details_ = "";

                static {
                    NestedTimelineItem nestedTimelineItem = new NestedTimelineItem();
                    DEFAULT_INSTANCE = nestedTimelineItem;
                    com.google.protobuf.h.registerDefaultInstance(NestedTimelineItem.class, nestedTimelineItem);
                }

                private NestedTimelineItem() {
                }

                public static r1 o() {
                    return (r1) DEFAULT_INSTANCE.createBuilder();
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"title_", "details_"});
                    }
                    if (iOrdinal == 3) {
                        return new NestedTimelineItem();
                    }
                    if (iOrdinal == 4) {
                        return new r1(DEFAULT_INSTANCE);
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
                    synchronized (NestedTimelineItem.class) {
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
                    return this.details_;
                }

                public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                    return newBuilderForType();
                }

                public final void p() {
                    this.details_ = "$9.99/month";
                }

                public final void q(String str) {
                    this.title_ = str;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                TimelineItem timelineItem = new TimelineItem();
                DEFAULT_INSTANCE = timelineItem;
                com.google.protobuf.h.registerDefaultInstance(TimelineItem.class, timelineItem);
            }

            private TimelineItem() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static q1 q() {
                return (q1) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"title_", "details_", "nestedItems_", NestedTimelineItem.class});
                }
                if (iOrdinal == 3) {
                    return new TimelineItem();
                }
                if (iOrdinal == 4) {
                    return new q1(DEFAULT_INSTANCE);
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

            public final String getTitle() {
                return this.title_;
            }

            public final void n(Iterable iterable) {
                h290 h290VarMutableCopy = this.nestedItems_;
                if (!((i9) h290VarMutableCopy).a) {
                    h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                    this.nestedItems_ = h290VarMutableCopy;
                }
                s8.addAll(iterable, h290VarMutableCopy);
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.details_;
            }

            public final h290 p() {
                return this.nestedItems_;
            }

            public final void r() {
                this.details_ = "$9.99/month";
            }

            public final void s(String str) {
                this.title_ = str;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            TimelineGroup timelineGroup = new TimelineGroup();
            DEFAULT_INSTANCE = timelineGroup;
            com.google.protobuf.h.registerDefaultInstance(TimelineGroup.class, timelineGroup);
        }

        private TimelineGroup() {
        }

        public static p1 p() {
            return (p1) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"title_", "details_", "items_", TimelineItem.class});
            }
            if (iOrdinal == 3) {
                return new TimelineGroup();
            }
            if (iOrdinal == 4) {
                return new p1(DEFAULT_INSTANCE);
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
            synchronized (TimelineGroup.class) {
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

        public final String getTitle() {
            return this.title_;
        }

        public final void n(Iterable iterable) {
            h290 h290VarMutableCopy = this.items_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.items_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.details_;
        }

        public final void q(String str) {
            this.details_ = str;
        }

        public final void r(String str) {
            this.title_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TimelineV2 timelineV2 = new TimelineV2();
        DEFAULT_INSTANCE = timelineV2;
        com.google.protobuf.h.registerDefaultInstance(TimelineV2.class, timelineV2);
    }

    private TimelineV2() {
    }

    public static TimelineV2 o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static o1 r() {
        return (o1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"groups_", TimelineGroup.class});
        }
        if (iOrdinal == 3) {
            return new TimelineV2();
        }
        if (iOrdinal == 4) {
            return new o1(DEFAULT_INSTANCE);
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
        synchronized (TimelineV2.class) {
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
        h290 h290VarMutableCopy = this.groups_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.groups_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        return this.groups_.size();
    }

    public final h290 q() {
        return this.groups_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

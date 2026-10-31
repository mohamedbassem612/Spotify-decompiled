package com.spotify.show_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oia1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetShowRequest extends h implements v2j0 {
    private static final GetShowRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 6;
    public static final int FORCE_INCLUDE_CONTEXT_FIELD_NUMBER = 8;
    public static final int HEADER_POLICY_FIELD_NUMBER = 9;
    public static final int INCLUDE_EXTENSIONS_ON_ERROR_FIELD_NUMBER = 15;
    public static final int INCLUDE_IN_RANGE_FIELD_NUMBER = 7;
    public static final int LIST_POLICY_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PREFER_CACHE_FIELD_NUMBER = 16;
    public static final int QUERY_FILTER_FIELD_NUMBER = 14;
    public static final int RANGE_FIELD_NUMBER = 13;
    public static final int RANGE_LENGTH_FIELD_NUMBER = 4;
    public static final int RANGE_START_FIELD_NUMBER = 3;
    public static final int SECTIONS_POLICY_FIELD_NUMBER = 11;
    public static final int SHOW_ID_FIELD_NUMBER = 1;
    public static final int SORT_FIELD_NUMBER = 5;
    public static final int SORT_ORDER_FIELD_NUMBER = 12;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 2;
    private int bitField0_;
    private int forceIncludeContext_;
    private HeaderPolicy headerPolicy_;
    private boolean includeExtensionsOnError_;
    private ListPolicy listPolicy_;
    private boolean preferCache_;
    private QueryFilter queryFilter_;
    private int rangeLength_;
    private int rangeStart_;
    private Range range_;
    private SectionsPolicy sectionsPolicy_;
    private int sortOrder_;
    private int updateThrottling_;
    private String showId_ = "";
    private String sort_ = "";
    private String filter_ = "";
    private String includeInRange_ = "";

    public static final class Range extends h implements v2j0 {
        private static final Range DEFAULT_INSTANCE;
        public static final int FOCUS_FIELD_NUMBER = 2;
        public static final int LIMIT_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int limit_;
        private int selectionCase_ = 0;
        private Object selection_;

        public static final class Focus extends h implements v2j0 {
            public static final int DATA_FIELD_NUMBER = 2;
            private static final Focus DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private String data_ = "";
            private int type_;

            static {
                Focus focus = new Focus();
                DEFAULT_INSTANCE = focus;
                h.registerDefaultInstance(Focus.class, focus);
            }

            private Focus() {
            }

            public static c n() {
                return (c) DEFAULT_INSTANCE.createBuilder();
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
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "data_"});
                }
                if (iOrdinal == 3) {
                    return new Focus();
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
                synchronized (Focus.class) {
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

            public final void o(String str) {
                str.getClass();
                this.data_ = str;
            }

            public final void p(d dVar) {
                this.type_ = dVar.getNumber();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            h.registerDefaultInstance(Range.class, range);
        }

        private Range() {
        }

        public static b n() {
            return (b) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001>\u0000\u0002<\u0000\u0003\u000b", new Object[]{"selection_", "selectionCase_", Focus.class, "limit_"});
            }
            if (iOrdinal == 3) {
                return new Range();
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
            synchronized (Range.class) {
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

        public final void o(Focus focus) {
            this.selection_ = focus;
            this.selectionCase_ = 2;
        }

        public final void p(int i) {
            this.limit_ = i;
        }

        public final void q(int i) {
            this.selectionCase_ = 1;
            this.selection_ = Integer.valueOf(i);
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GetShowRequest getShowRequest = new GetShowRequest();
        DEFAULT_INSTANCE = getShowRequest;
        h.registerDefaultInstance(GetShowRequest.class, getShowRequest);
    }

    private GetShowRequest() {
    }

    public static a n() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u0004\u0004င\u0000\u0005Ȉ\u0006Ȉ\u0007Ȉ\bင\u0001\tဉ\u0002\nဉ\u0003\u000bဉ\u0004\f\f\rဉ\u0005\u000eဉ\u0006\u000f\u0007\u0010\u0007", new Object[]{"bitField0_", "showId_", "updateThrottling_", "rangeStart_", "rangeLength_", "sort_", "filter_", "includeInRange_", "forceIncludeContext_", "headerPolicy_", "listPolicy_", "sectionsPolicy_", "sortOrder_", "range_", "queryFilter_", "includeExtensionsOnError_", "preferCache_"});
        }
        if (iOrdinal == 3) {
            return new GetShowRequest();
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
        synchronized (GetShowRequest.class) {
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

    public final void o(HeaderPolicy headerPolicy) {
        headerPolicy.getClass();
        this.headerPolicy_ = headerPolicy;
        this.bitField0_ |= 4;
    }

    public final void p() {
        this.includeExtensionsOnError_ = true;
    }

    public final void q(ListPolicy listPolicy) {
        this.listPolicy_ = listPolicy;
        this.bitField0_ |= 8;
    }

    public final void r(boolean z) {
        this.preferCache_ = z;
    }

    public final void s(QueryFilter queryFilter) {
        this.queryFilter_ = queryFilter;
        this.bitField0_ |= 64;
    }

    public final void t(Range range) {
        range.getClass();
        this.range_ = range;
        this.bitField0_ |= 32;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(SectionsPolicy sectionsPolicy) {
        this.sectionsPolicy_ = sectionsPolicy;
        this.bitField0_ |= 16;
    }

    public final void v(String str) {
        str.getClass();
        this.showId_ = str;
    }

    public final void w(oia1 oia1Var) {
        this.sortOrder_ = oia1Var.getNumber();
    }

    public final void x(int i) {
        this.updateThrottling_ = i;
    }
}

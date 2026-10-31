package com.spotify.searchview.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class NativeViewResponse extends com.google.protobuf.h implements v2j0 {
    public static final int BANNER_CONTENT_FIELD_NUMBER = 2;
    private static final NativeViewResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 1;
    private BannerContent bannerContent_;
    private int bitField0_;
    private h290 rows_ = com.google.protobuf.h.emptyProtobufList();

    public static final class EntityRow extends com.google.protobuf.h implements v2j0 {
        private static final EntityRow DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int RECENT_SEARCH_FIELD_NUMBER = 3;
        public static final int SNIPPET_FIELD_NUMBER = 2;
        public static final int URI_FIELD_NUMBER = 1;
        private int bitField0_;
        private Object highlightType_;
        private Snippet snippet_;
        private int highlightTypeCase_ = 0;
        private String uri_ = "";

        static {
            EntityRow entityRow = new EntityRow();
            DEFAULT_INSTANCE = entityRow;
            com.google.protobuf.h.registerDefaultInstance(EntityRow.class, entityRow);
        }

        private EntityRow() {
        }

        public static EntityRow n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000", new Object[]{"highlightType_", "highlightTypeCase_", "bitField0_", "uri_", "snippet_", HighlightTypeRecentSearch.class});
            }
            if (iOrdinal == 3) {
                return new EntityRow();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (EntityRow.class) {
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

        public final String getUri() {
            return this.uri_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int o() {
            int i = this.highlightTypeCase_;
            if (i != 0) {
                return i != 3 ? 0 : 1;
            }
            return 2;
        }

        public final Snippet p() {
            Snippet snippet = this.snippet_;
            return snippet == null ? Snippet.n() : snippet;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SearchRow extends com.google.protobuf.h implements v2j0 {
        private static final SearchRow DEFAULT_INSTANCE;
        public static final int ENTITY_ROW_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int typeCase_ = 0;
        private Object type_;

        static {
            SearchRow searchRow = new SearchRow();
            DEFAULT_INSTANCE = searchRow;
            com.google.protobuf.h.registerDefaultInstance(SearchRow.class, searchRow);
        }

        private SearchRow() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"type_", "typeCase_", EntityRow.class});
            }
            if (iOrdinal == 3) {
                return new SearchRow();
            }
            if (iOrdinal == 4) {
                return new j(DEFAULT_INSTANCE);
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
            synchronized (SearchRow.class) {
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

        public final EntityRow n() {
            return this.typeCase_ == 1 ? (EntityRow) this.type_ : EntityRow.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        NativeViewResponse nativeViewResponse = new NativeViewResponse();
        DEFAULT_INSTANCE = nativeViewResponse;
        com.google.protobuf.h.registerDefaultInstance(NativeViewResponse.class, nativeViewResponse);
    }

    private NativeViewResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "rows_", SearchRow.class, "bannerContent_"});
        }
        if (iOrdinal == 3) {
            return new NativeViewResponse();
        }
        if (iOrdinal == 4) {
            return new h(DEFAULT_INSTANCE);
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
        synchronized (NativeViewResponse.class) {
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

    public final BannerContent n() {
        BannerContent bannerContent = this.bannerContent_;
        return bannerContent == null ? BannerContent.o() : bannerContent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.rows_;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

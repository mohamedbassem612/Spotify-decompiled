package com.spotify.searchview.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class MainViewResponse extends com.google.protobuf.h implements v2j0 {
    public static final int BANNER_CONTENT_FIELD_NUMBER = 5;
    private static final MainViewResponse DEFAULT_INSTANCE;
    public static final int FILTER_CATALOG_FIELD_NUMBER = 12;
    public static final int FLAT_FILTERS_FIELD_NUMBER = 10;
    public static final int HITS_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RECOMMENDATIONS_FIELD_NUMBER = 2;
    private BannerContent bannerContent_;
    private int bitField0_;
    private FilterCatalog filterCatalog_;
    private Filters flatFilters_;
    private h290 hits_ = com.google.protobuf.h.emptyProtobufList();
    private String nextPageToken_ = "";
    private Recommendations recommendations_;

    static {
        MainViewResponse mainViewResponse = new MainViewResponse();
        DEFAULT_INSTANCE = mainViewResponse;
        com.google.protobuf.h.registerDefaultInstance(MainViewResponse.class, mainViewResponse);
    }

    private MainViewResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\f\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\nဉ\u0002\fဉ\u0003", new Object[]{"bitField0_", "hits_", Entity.class, "recommendations_", "nextPageToken_", "bannerContent_", "flatFilters_", "filterCatalog_"});
        }
        if (iOrdinal == 3) {
            return new MainViewResponse();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (MainViewResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    public final BannerContent n() {
        BannerContent bannerContent = this.bannerContent_;
        return bannerContent == null ? BannerContent.o() : bannerContent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final FilterCatalog o() {
        FilterCatalog filterCatalog = this.filterCatalog_;
        return filterCatalog == null ? FilterCatalog.n() : filterCatalog;
    }

    public final Filters p() {
        Filters filters = this.flatFilters_;
        return filters == null ? Filters.n() : filters;
    }

    public final h290 q() {
        return this.hits_;
    }

    public final Recommendations r() {
        Recommendations recommendations = this.recommendations_;
        return recommendations == null ? Recommendations.n() : recommendations;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 8) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 1) != 0;
    }
}

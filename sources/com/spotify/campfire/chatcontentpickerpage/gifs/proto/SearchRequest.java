package com.spotify.campfire.chatcontentpickerpage.gifs.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g851;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SearchRequest extends h implements v2j0 {
    private static final SearchRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 4;
    public static final int LIMIT_FIELD_NUMBER = 2;
    public static final int OFFSET_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    private int bitField0_;
    private Filter filter_;
    private int limit_;
    private int offset_;
    private String query_ = "";

    static {
        SearchRequest searchRequest = new SearchRequest();
        DEFAULT_INSTANCE = searchRequest;
        h.registerDefaultInstance(SearchRequest.class, searchRequest);
    }

    private SearchRequest() {
    }

    public static g851 n() {
        return (g851) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004ဉ\u0000", new Object[]{"bitField0_", "query_", "limit_", "offset_", "filter_"});
        }
        if (iOrdinal == 3) {
            return new SearchRequest();
        }
        if (iOrdinal == 4) {
            return new g851(DEFAULT_INSTANCE);
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
        synchronized (SearchRequest.class) {
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

    public final void o() {
        this.limit_ = 30;
    }

    public final void p(int i) {
        this.offset_ = i;
    }

    public final void q(String str) {
        str.getClass();
        this.query_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

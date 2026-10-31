package com.spotify.campfire.chatcontentpickerpage.gifs.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SearchResponse extends h implements v2j0 {
    private static final SearchResponse DEFAULT_INSTANCE;
    public static final int GIFS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 gifs_ = h.emptyProtobufList();

    static {
        SearchResponse searchResponse = new SearchResponse();
        DEFAULT_INSTANCE = searchResponse;
        h.registerDefaultInstance(SearchResponse.class, searchResponse);
    }

    private SearchResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"gifs_", GifMedia.class});
        }
        if (iOrdinal == 3) {
            return new SearchResponse();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (SearchResponse.class) {
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

    public final h290 n() {
        return this.gifs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

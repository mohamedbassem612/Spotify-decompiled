package com.spotify.watchfeed.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResponsePagination extends h implements v2j0 {
    private static final ResponsePagination DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    public static final int NEXT_PAGE_REQUEST_OFFSET_FIELD_NUMBER = 3;
    public static final int OFFSET_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int limit_;
    private int nextPageRequestOffset_;
    private int offset_;

    static {
        ResponsePagination responsePagination = new ResponsePagination();
        DEFAULT_INSTANCE = responsePagination;
        h.registerDefaultInstance(ResponsePagination.class, responsePagination);
    }

    private ResponsePagination() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"offset_", "limit_", "nextPageRequestOffset_"});
        }
        if (iOrdinal == 3) {
            return new ResponsePagination();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (ResponsePagination.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

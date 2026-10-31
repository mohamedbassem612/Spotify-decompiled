package com.spotify.search.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dwp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class OfflineSearchRequest extends h implements v2j0 {
    private static final OfflineSearchRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_CHAPTERS_FIELD_NUMBER = 3;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    private boolean includeChapters_;
    private int limit_;
    private String query_ = "";

    static {
        OfflineSearchRequest offlineSearchRequest = new OfflineSearchRequest();
        DEFAULT_INSTANCE = offlineSearchRequest;
        h.registerDefaultInstance(OfflineSearchRequest.class, offlineSearchRequest);
    }

    private OfflineSearchRequest() {
    }

    public static dwp0 n() {
        return (dwp0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0007", new Object[]{"query_", "limit_", "includeChapters_"});
        }
        if (iOrdinal == 3) {
            return new OfflineSearchRequest();
        }
        if (iOrdinal == 4) {
            return new dwp0(DEFAULT_INSTANCE);
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
        synchronized (OfflineSearchRequest.class) {
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
        this.limit_ = 20;
    }

    public final void p(String str) {
        str.getClass();
        this.query_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

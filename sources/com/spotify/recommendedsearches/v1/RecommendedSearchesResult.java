package com.spotify.recommendedsearches.v1;

import com.google.protobuf.h;
import p.a311;
import p.b311;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecommendedSearchesResult extends h implements b311 {
    private static final RecommendedSearchesResult DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUGGESTION_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private String suggestion_ = "";
    private String uri_ = "";

    static {
        RecommendedSearchesResult recommendedSearchesResult = new RecommendedSearchesResult();
        DEFAULT_INSTANCE = recommendedSearchesResult;
        h.registerDefaultInstance(RecommendedSearchesResult.class, recommendedSearchesResult);
    }

    private RecommendedSearchesResult() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final String d() {
        return this.suggestion_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"suggestion_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new RecommendedSearchesResult();
        }
        if (iOrdinal == 4) {
            return new a311(DEFAULT_INSTANCE);
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
        synchronized (RecommendedSearchesResult.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hoz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsMediaPrefetch$ProgressiveVideoResource extends h implements v2j0 {
    private static final EsMediaPrefetch$ProgressiveVideoResource DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";

    static {
        EsMediaPrefetch$ProgressiveVideoResource esMediaPrefetch$ProgressiveVideoResource = new EsMediaPrefetch$ProgressiveVideoResource();
        DEFAULT_INSTANCE = esMediaPrefetch$ProgressiveVideoResource;
        h.registerDefaultInstance(EsMediaPrefetch$ProgressiveVideoResource.class, esMediaPrefetch$ProgressiveVideoResource);
    }

    private EsMediaPrefetch$ProgressiveVideoResource() {
    }

    public static hoz n() {
        return (hoz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$ProgressiveVideoResource();
        }
        if (iOrdinal == 4) {
            return new hoz(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$ProgressiveVideoResource.class) {
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
        this.url_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

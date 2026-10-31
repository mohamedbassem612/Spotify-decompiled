package com.spotify.offline_playable_cache_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsOfflinePlayableCache$ResponseStatus extends h implements v2j0 {
    private static final EsOfflinePlayableCache$ResponseStatus DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private String reason_ = "";
    private int statusCode_;

    static {
        EsOfflinePlayableCache$ResponseStatus esOfflinePlayableCache$ResponseStatus = new EsOfflinePlayableCache$ResponseStatus();
        DEFAULT_INSTANCE = esOfflinePlayableCache$ResponseStatus;
        h.registerDefaultInstance(EsOfflinePlayableCache$ResponseStatus.class, esOfflinePlayableCache$ResponseStatus);
    }

    private EsOfflinePlayableCache$ResponseStatus() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"statusCode_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlayableCache$ResponseStatus();
        }
        if (iOrdinal == 4) {
            return new xoz(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (EsOfflinePlayableCache$ResponseStatus.class) {
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

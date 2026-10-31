package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsContextPlayerState$ContextIndex extends h implements v2j0 {
    private static final EsContextPlayerState$ContextIndex DEFAULT_INSTANCE;
    public static final int PAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 2;
    private long page_;
    private long track_;

    static {
        EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = new EsContextPlayerState$ContextIndex();
        DEFAULT_INSTANCE = esContextPlayerState$ContextIndex;
        h.registerDefaultInstance(EsContextPlayerState$ContextIndex.class, esContextPlayerState$ContextIndex);
    }

    private EsContextPlayerState$ContextIndex() {
    }

    public static EsContextPlayerState$ContextIndex o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0003", new Object[]{"page_", "track_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerState$ContextIndex();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 22);
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
        synchronized (EsContextPlayerState$ContextIndex.class) {
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

    public final long p() {
        return this.page_;
    }

    public final long q() {
        return this.track_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

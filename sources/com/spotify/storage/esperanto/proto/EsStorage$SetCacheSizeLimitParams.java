package com.spotify.storage.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yrz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EsStorage$SetCacheSizeLimitParams extends h implements v2j0 {
    private static final EsStorage$SetCacheSizeLimitParams DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_LIMIT_BYTES_FIELD_NUMBER = 2;
    public static final int USER_LIMIT_MB_FIELD_NUMBER = 1;
    private int bitField0_;
    private long userLimitBytes_;
    private long userLimitMb_;

    static {
        EsStorage$SetCacheSizeLimitParams esStorage$SetCacheSizeLimitParams = new EsStorage$SetCacheSizeLimitParams();
        DEFAULT_INSTANCE = esStorage$SetCacheSizeLimitParams;
        h.registerDefaultInstance(EsStorage$SetCacheSizeLimitParams.class, esStorage$SetCacheSizeLimitParams);
    }

    private EsStorage$SetCacheSizeLimitParams() {
    }

    public static EsStorage$SetCacheSizeLimitParams n() {
        return DEFAULT_INSTANCE;
    }

    public static yrz o() {
        return (yrz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "userLimitMb_", "userLimitBytes_"});
        }
        if (iOrdinal == 3) {
            return new EsStorage$SetCacheSizeLimitParams();
        }
        if (iOrdinal == 4) {
            return new yrz(DEFAULT_INSTANCE);
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
        synchronized (EsStorage$SetCacheSizeLimitParams.class) {
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

    public final void p(long j) {
        this.bitField0_ |= 2;
        this.userLimitBytes_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.storage.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsStorage$Stats extends h implements v2j0 {
    public static final int CACHE_ID_FIELD_NUMBER = 1;
    public static final int CREATION_DATE_SEC_FIELD_NUMBER = 2;
    public static final int CURRENT_LOCKED_SIZE_FIELD_NUMBER = 5;
    public static final int CURRENT_NUMFILES_FIELD_NUMBER = 8;
    public static final int CURRENT_SIZE_FIELD_NUMBER = 4;
    private static final EsStorage$Stats DEFAULT_INSTANCE;
    public static final int FREE_SPACE_FIELD_NUMBER = 6;
    public static final int MAX_CACHE_SIZE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REALM_STATS_FIELD_NUMBER = 9;
    public static final int TOTAL_SPACE_FIELD_NUMBER = 7;
    private long creationDateSec_;
    private long currentLockedSize_;
    private long currentNumfiles_;
    private long currentSize_;
    private long freeSpace_;
    private long maxCacheSize_;
    private long totalSpace_;
    private String cacheId_ = "";
    private h290 realmStats_ = h.emptyProtobufList();

    static {
        EsStorage$Stats esStorage$Stats = new EsStorage$Stats();
        DEFAULT_INSTANCE = esStorage$Stats;
        h.registerDefaultInstance(EsStorage$Stats.class, esStorage$Stats);
    }

    private EsStorage$Stats() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsStorage$Stats r(byte[] bArr) {
        return (EsStorage$Stats) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u001b", new Object[]{"cacheId_", "creationDateSec_", "maxCacheSize_", "currentSize_", "currentLockedSize_", "freeSpace_", "totalSpace_", "currentNumfiles_", "realmStats_", EsStorage$RealmStats.class});
        }
        if (iOrdinal == 3) {
            return new EsStorage$Stats();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (EsStorage$Stats.class) {
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

    public final long n() {
        return this.currentLockedSize_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.currentSize_;
    }

    public final long p() {
        return this.freeSpace_;
    }

    public final long q() {
        return this.totalSpace_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.storage.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EsStorage$CacheSizeLimit extends h implements v2j0 {
    private static final EsStorage$CacheSizeLimit DEFAULT_INSTANCE;
    public static final int EFFECTIVE_LIMIT_BYTES_FIELD_NUMBER = 5;
    public static final int EFFECTIVE_LIMIT_MB_FIELD_NUMBER = 1;
    public static final int MAXIMUM_SELECTABLE_LIMIT_BYTES_FIELD_NUMBER = 8;
    public static final int MAXIMUM_SELECTABLE_LIMIT_MB_FIELD_NUMBER = 4;
    public static final int MINIMUM_SELECTABLE_LIMIT_BYTES_FIELD_NUMBER = 7;
    public static final int MINIMUM_SELECTABLE_LIMIT_MB_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int USER_LIMIT_BYTES_FIELD_NUMBER = 6;
    public static final int USER_LIMIT_MB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long effectiveLimitBytes_;
    private long effectiveLimitMb_;
    private long maximumSelectableLimitBytes_;
    private long maximumSelectableLimitMb_;
    private long minimumSelectableLimitBytes_;
    private long minimumSelectableLimitMb_;
    private long userLimitBytes_;
    private long userLimitMb_;

    static {
        EsStorage$CacheSizeLimit esStorage$CacheSizeLimit = new EsStorage$CacheSizeLimit();
        DEFAULT_INSTANCE = esStorage$CacheSizeLimit;
        h.registerDefaultInstance(EsStorage$CacheSizeLimit.class, esStorage$CacheSizeLimit);
    }

    private EsStorage$CacheSizeLimit() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsStorage$CacheSizeLimit s(byte[] bArr) {
        return (EsStorage$CacheSizeLimit) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002ဂ\u0000\u0003\u0002\u0004\u0002\u0005\u0002\u0006ဂ\u0001\u0007\u0002\b\u0002", new Object[]{"bitField0_", "effectiveLimitMb_", "userLimitMb_", "minimumSelectableLimitMb_", "maximumSelectableLimitMb_", "effectiveLimitBytes_", "userLimitBytes_", "minimumSelectableLimitBytes_", "maximumSelectableLimitBytes_"});
        }
        if (iOrdinal == 3) {
            return new EsStorage$CacheSizeLimit();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (EsStorage$CacheSizeLimit.class) {
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
        return this.effectiveLimitBytes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.maximumSelectableLimitBytes_;
    }

    public final long p() {
        return this.minimumSelectableLimitBytes_;
    }

    public final long q() {
        return this.userLimitBytes_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

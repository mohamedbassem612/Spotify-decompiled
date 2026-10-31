package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xmz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class EsDownload$RequestDataResponse extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 5;
    private static final EsDownload$RequestDataResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int FINAL_FIELD_NUMBER = 3;
    public static final int FROM_NETWORK_FIELD_NUMBER = 7;
    public static final int HAD_CACHE_ERROR_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int PREVIOUSLY_CACHED_FIELD_NUMBER = 6;
    public static final int TOTAL_SIZE_FIELD_NUMBER = 2;
    private phc data_ = phc.b;
    private int error_;
    private boolean final_;
    private long fromNetwork_;
    private boolean hadCacheError_;
    private long position_;
    private long previouslyCached_;
    private long totalSize_;

    static {
        EsDownload$RequestDataResponse esDownload$RequestDataResponse = new EsDownload$RequestDataResponse();
        DEFAULT_INSTANCE = esDownload$RequestDataResponse;
        h.registerDefaultInstance(EsDownload$RequestDataResponse.class, esDownload$RequestDataResponse);
    }

    private EsDownload$RequestDataResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsDownload$RequestDataResponse t(byte[] bArr) {
        return (EsDownload$RequestDataResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0007\u0004\f\u0005\n\u0006\u0003\u0007\u0003\b\u0007", new Object[]{"position_", "totalSize_", "final_", "error_", "data_", "previouslyCached_", "fromNetwork_", "hadCacheError_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$RequestDataResponse();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (EsDownload$RequestDataResponse.class) {
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

    public final phc getData() {
        return this.data_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final xmz n() {
        xmz xmzVar;
        int i = this.error_;
        if (i != 0) {
            xmzVar = i != 1 ? null : xmz.GENERIC;
        } else {
            xmzVar = xmz.SUCCESS;
        }
        return xmzVar == null ? xmz.UNRECOGNIZED : xmzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.final_;
    }

    public final long p() {
        return this.fromNetwork_;
    }

    public final boolean q() {
        return this.hadCacheError_;
    }

    public final long r() {
        return this.position_;
    }

    public final long s() {
        return this.totalSize_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

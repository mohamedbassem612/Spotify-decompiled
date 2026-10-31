package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsOffline$EstimateMusicVideoDownloadSizeResponse extends h implements v2j0 {
    private static final EsOffline$EstimateMusicVideoDownloadSizeResponse DEFAULT_INSTANCE;
    public static final int ESTIMATED_TOTAL_BYTES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private long estimatedTotalBytes_;

    static {
        EsOffline$EstimateMusicVideoDownloadSizeResponse esOffline$EstimateMusicVideoDownloadSizeResponse = new EsOffline$EstimateMusicVideoDownloadSizeResponse();
        DEFAULT_INSTANCE = esOffline$EstimateMusicVideoDownloadSizeResponse;
        h.registerDefaultInstance(EsOffline$EstimateMusicVideoDownloadSizeResponse.class, esOffline$EstimateMusicVideoDownloadSizeResponse);
    }

    private EsOffline$EstimateMusicVideoDownloadSizeResponse() {
    }

    public static EsOffline$EstimateMusicVideoDownloadSizeResponse p(byte[] bArr) {
        return (EsOffline$EstimateMusicVideoDownloadSizeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "estimatedTotalBytes_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$EstimateMusicVideoDownloadSizeResponse();
        }
        if (iOrdinal == 4) {
            return new onz(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (EsOffline$EstimateMusicVideoDownloadSizeResponse.class) {
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
        return this.estimatedTotalBytes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

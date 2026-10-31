package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsOffline$BulkRedownloadPreflightResponse extends h implements v2j0 {
    public static final int CURRENT_DOWNLOADED_BYTES_FIELD_NUMBER = 7;
    private static final EsOffline$BulkRedownloadPreflightResponse DEFAULT_INSTANCE;
    public static final int DOWNLOADS_IN_PROGRESS_FIELD_NUMBER = 6;
    public static final int HAS_SUFFICIENT_STORAGE_FIELD_NUMBER = 5;
    public static final int IS_ON_CELLULAR_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_OVER_CELLULAR_ALLOWED_FIELD_NUMBER = 4;
    public static final int TOTAL_DOWNLOAD_BYTES_FIELD_NUMBER = 1;
    public static final int TOTAL_TRACKS_FIELD_NUMBER = 2;
    private long currentDownloadedBytes_;
    private int downloadsInProgress_;
    private boolean hasSufficientStorage_;
    private boolean isOnCellular_;
    private boolean syncOverCellularAllowed_;
    private long totalDownloadBytes_;
    private int totalTracks_;

    static {
        EsOffline$BulkRedownloadPreflightResponse esOffline$BulkRedownloadPreflightResponse = new EsOffline$BulkRedownloadPreflightResponse();
        DEFAULT_INSTANCE = esOffline$BulkRedownloadPreflightResponse;
        h.registerDefaultInstance(EsOffline$BulkRedownloadPreflightResponse.class, esOffline$BulkRedownloadPreflightResponse);
    }

    private EsOffline$BulkRedownloadPreflightResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsOffline$BulkRedownloadPreflightResponse u(byte[] bArr) {
        return (EsOffline$BulkRedownloadPreflightResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0004\u0007\u0002", new Object[]{"totalDownloadBytes_", "totalTracks_", "isOnCellular_", "syncOverCellularAllowed_", "hasSufficientStorage_", "downloadsInProgress_", "currentDownloadedBytes_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$BulkRedownloadPreflightResponse();
        }
        if (iOrdinal == 4) {
            return new onz((byte) 19);
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
        synchronized (EsOffline$BulkRedownloadPreflightResponse.class) {
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

    public final long o() {
        return this.currentDownloadedBytes_;
    }

    public final boolean p() {
        return this.hasSufficientStorage_;
    }

    public final boolean q() {
        return this.isOnCellular_;
    }

    public final boolean r() {
        return this.syncOverCellularAllowed_;
    }

    public final long s() {
        return this.totalDownloadBytes_;
    }

    public final int t() {
        return this.totalTracks_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

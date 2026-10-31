package com.spotify.offline.offlineplugin_proto;

import p.bf40;
import p.jf40;
import p.kpz;
import p.lpz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOfflinePlugin$DownloadResponse extends com.google.protobuf.h implements v2j0 {
    public static final int BYTES_DOWNLOADED_FIELD_NUMBER = 4;
    public static final int COMPLETE_FIELD_NUMBER = 2;
    private static final EsOfflinePlugin$DownloadResponse DEFAULT_INSTANCE;
    public static final int ERROR_DETAILS_FIELD_NUMBER = 6;
    public static final int ERROR_FIELD_NUMBER = 5;
    public static final int FILE_SIZE_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private long bytesDownloaded_;
    private boolean complete_;
    private int error_;
    private long fileSize_;
    private String link_ = "";
    private String errorDetails_ = "";

    static {
        EsOfflinePlugin$DownloadResponse esOfflinePlugin$DownloadResponse = new EsOfflinePlugin$DownloadResponse();
        DEFAULT_INSTANCE = esOfflinePlugin$DownloadResponse;
        com.google.protobuf.h.registerDefaultInstance(EsOfflinePlugin$DownloadResponse.class, esOfflinePlugin$DownloadResponse);
    }

    private EsOfflinePlugin$DownloadResponse() {
    }

    public static kpz n() {
        return (kpz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0002\u0004\u0002\u0005\f\u0006Ȉ", new Object[]{"link_", "complete_", "fileSize_", "bytesDownloaded_", "error_", "errorDetails_"});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$DownloadResponse();
        }
        if (iOrdinal == 4) {
            return new kpz(DEFAULT_INSTANCE);
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
        synchronized (EsOfflinePlugin$DownloadResponse.class) {
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

    public final void o(long j) {
        this.bytesDownloaded_ = j;
    }

    public final void p() {
        this.complete_ = true;
    }

    public final void q(lpz lpzVar) {
        this.error_ = lpzVar.getNumber();
    }

    public final void r(String str) {
        this.errorDetails_ = str;
    }

    public final void s(long j) {
        this.fileSize_ = j;
    }

    public final void t(String str) {
        str.getClass();
        this.link_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

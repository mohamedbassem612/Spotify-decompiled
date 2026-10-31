package com.spotify.betamax.offlinecoordinator.proto;

import p.bf40;
import p.hup0;
import p.iup0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class OfflinePlugin$DownloadResponse extends com.google.protobuf.h implements v2j0 {
    public static final int BYTES_DOWNLOADED_FIELD_NUMBER = 4;
    public static final int COMPLETE_FIELD_NUMBER = 2;
    private static final OfflinePlugin$DownloadResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 5;
    public static final int FILE_SIZE_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private long bytesDownloaded_;
    private boolean complete_;
    private int error_;
    private long fileSize_;
    private String link_ = "";

    static {
        OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse = new OfflinePlugin$DownloadResponse();
        DEFAULT_INSTANCE = offlinePlugin$DownloadResponse;
        com.google.protobuf.h.registerDefaultInstance(OfflinePlugin$DownloadResponse.class, offlinePlugin$DownloadResponse);
    }

    private OfflinePlugin$DownloadResponse() {
    }

    public static hup0 n() {
        return (hup0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0002\u0004\u0002\u0005\f", new Object[]{"link_", "complete_", "fileSize_", "bytesDownloaded_", "error_"});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$DownloadResponse();
        }
        if (iOrdinal == 4) {
            return new hup0(DEFAULT_INSTANCE);
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
        synchronized (OfflinePlugin$DownloadResponse.class) {
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

    public final void p(boolean z) {
        this.complete_ = z;
    }

    public final void q(iup0 iup0Var) {
        this.error_ = iup0Var.getNumber();
    }

    public final void r(long j) {
        this.fileSize_ = j;
    }

    public final void setLink(String str) {
        this.link_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

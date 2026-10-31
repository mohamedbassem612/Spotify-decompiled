package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnz;
import p.jf40;
import p.jlz;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsDownload$MediaManifestResponse extends h implements v2j0 {
    public static final int BYTES_FROM_NETWORK_FIELD_NUMBER = 3;
    private static final EsDownload$MediaManifestResponse DEFAULT_INSTANCE;
    public static final int HAD_CACHE_ERROR_FIELD_NUMBER = 2;
    public static final int MANIFEST_DATA_FIELD_NUMBER = 1;
    public static final int MANIFEST_ERROR_FIELD_NUMBER = 4;
    public static final int MANIFEST_URL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private long bytesFromNetwork_;
    private boolean hadCacheError_;
    private int manifestError_;
    private phc manifestData_ = phc.b;
    private String manifestUrl_ = "";

    static {
        EsDownload$MediaManifestResponse esDownload$MediaManifestResponse = new EsDownload$MediaManifestResponse();
        DEFAULT_INSTANCE = esDownload$MediaManifestResponse;
        h.registerDefaultInstance(EsDownload$MediaManifestResponse.class, esDownload$MediaManifestResponse);
    }

    private EsDownload$MediaManifestResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsDownload$MediaManifestResponse q(byte[] bArr) {
        return (EsDownload$MediaManifestResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0007\u0003\u0003\u0004\f\u0005Ȉ", new Object[]{"manifestData_", "hadCacheError_", "bytesFromNetwork_", "manifestError_", "manifestUrl_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$MediaManifestResponse();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (EsDownload$MediaManifestResponse.class) {
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
        return this.bytesFromNetwork_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final phc o() {
        return this.manifestData_;
    }

    public final dnz p() {
        dnz dnzVar;
        int i = this.manifestError_;
        if (i == 0) {
            dnzVar = dnz.MEDIA_MANIFEST_SUCCESS;
        } else if (i == 1) {
            dnzVar = dnz.MEDIA_MANIFEST_INVALID_MANIFEST_ID;
        } else if (i == 2) {
            dnzVar = dnz.MEDIA_MANIFEST_CONNECTION_ERROR;
        } else if (i == 3) {
            dnzVar = dnz.MEDIA_MANIFEST_HTTP_ERROR;
        } else if (i != 4) {
            dnzVar = i != 5 ? null : dnz.MEDIA_MANIFEST_HTTP_FORBIDDEN;
        } else {
            dnzVar = dnz.MEDIA_MANIFEST_CONNECTION_TIMEOUT;
        }
        return dnzVar == null ? dnz.UNRECOGNIZED : dnzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

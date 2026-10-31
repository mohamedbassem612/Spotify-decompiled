package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class EsDownload$VideoBandwidthResponse extends h implements v2j0 {
    public static final int ADVISED_MAX_BITRATE_FIELD_NUMBER = 1;
    private static final EsDownload$VideoBandwidthResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private long advisedMaxBitrate_;

    static {
        EsDownload$VideoBandwidthResponse esDownload$VideoBandwidthResponse = new EsDownload$VideoBandwidthResponse();
        DEFAULT_INSTANCE = esDownload$VideoBandwidthResponse;
        h.registerDefaultInstance(EsDownload$VideoBandwidthResponse.class, esDownload$VideoBandwidthResponse);
    }

    private EsDownload$VideoBandwidthResponse() {
    }

    public static EsDownload$VideoBandwidthResponse o(byte[] bArr) {
        return (EsDownload$VideoBandwidthResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"advisedMaxBitrate_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$VideoBandwidthResponse();
        }
        if (iOrdinal == 4) {
            return new onz(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (EsDownload$VideoBandwidthResponse.class) {
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
        return this.advisedMaxBitrate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

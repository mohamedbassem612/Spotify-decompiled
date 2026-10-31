package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zmz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsDownload$FinishSegmentDataRequestParams extends h implements v2j0 {
    private static final EsDownload$FinishSegmentDataRequestParams DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENT_FILE_STREAMER_FIELD_NUMBER = 1;
    public static final int URL_PATH_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsDownload$SegmentFileStreamerId segmentFileStreamer_;
    private String urlPath_ = "";

    static {
        EsDownload$FinishSegmentDataRequestParams esDownload$FinishSegmentDataRequestParams = new EsDownload$FinishSegmentDataRequestParams();
        DEFAULT_INSTANCE = esDownload$FinishSegmentDataRequestParams;
        h.registerDefaultInstance(EsDownload$FinishSegmentDataRequestParams.class, esDownload$FinishSegmentDataRequestParams);
    }

    private EsDownload$FinishSegmentDataRequestParams() {
    }

    public static zmz n() {
        return (zmz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "segmentFileStreamer_", "urlPath_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$FinishSegmentDataRequestParams();
        }
        if (iOrdinal == 4) {
            return new zmz(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$FinishSegmentDataRequestParams.class) {
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

    public final void o(EsDownload$SegmentFileStreamerId esDownload$SegmentFileStreamerId) {
        esDownload$SegmentFileStreamerId.getClass();
        this.segmentFileStreamer_ = esDownload$SegmentFileStreamerId;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        str.getClass();
        this.urlPath_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

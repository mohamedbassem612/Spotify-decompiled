package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.jnz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsDownload$RequestSegmentDataParams extends h implements v2j0 {
    public static final int CDN_BASE_URL_FIELD_NUMBER = 3;
    private static final EsDownload$RequestSegmentDataParams DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENT_FILE_STREAMER_FIELD_NUMBER = 1;
    public static final int START_FIELD_NUMBER = 4;
    public static final int URL_PATH_FIELD_NUMBER = 2;
    private int bitField0_;
    private long end_;
    private EsDownload$SegmentRequestMetadata metadata_;
    private EsDownload$SegmentFileStreamerId segmentFileStreamer_;
    private long start_;
    private String urlPath_ = "";
    private h290 cdnBaseUrl_ = h.emptyProtobufList();

    static {
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = new EsDownload$RequestSegmentDataParams();
        DEFAULT_INSTANCE = esDownload$RequestSegmentDataParams;
        h.registerDefaultInstance(EsDownload$RequestSegmentDataParams.class, esDownload$RequestSegmentDataParams);
    }

    private EsDownload$RequestSegmentDataParams() {
    }

    public static jnz o() {
        return (jnz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț\u0004\u0003\u0005\u0003\u0006ဉ\u0001", new Object[]{"bitField0_", "segmentFileStreamer_", "urlPath_", "cdnBaseUrl_", "start_", "end_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$RequestSegmentDataParams();
        }
        if (iOrdinal == 4) {
            return new jnz(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$RequestSegmentDataParams.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.cdnBaseUrl_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.cdnBaseUrl_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(long j) {
        this.end_ = j;
    }

    public final void q(EsDownload$SegmentRequestMetadata esDownload$SegmentRequestMetadata) {
        esDownload$SegmentRequestMetadata.getClass();
        this.metadata_ = esDownload$SegmentRequestMetadata;
        this.bitField0_ |= 2;
    }

    public final void r(EsDownload$SegmentFileStreamerId esDownload$SegmentFileStreamerId) {
        esDownload$SegmentFileStreamerId.getClass();
        this.segmentFileStreamer_ = esDownload$SegmentFileStreamerId;
        this.bitField0_ |= 1;
    }

    public final void s(long j) {
        this.start_ = j;
    }

    public final void t(String str) {
        str.getClass();
        this.urlPath_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

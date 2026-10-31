package com.spotify.share.formats.common.clippingdialog.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y5k1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class VideoTranscodingResult extends h implements v2j0 {
    private static final VideoTranscodingResult DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ERROR_REASON_FIELD_NUMBER = 6;
    public static final int IS_SUCCESS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PROCESSING_TIME_MS_FIELD_NUMBER = 3;
    public static final int PROGRESS_FIELD_NUMBER = 4;
    public static final int TRANSCODING_ID_FIELD_NUMBER = 7;
    public static final int VIDEO_DURATION_MS_FIELD_NUMBER = 8;
    public static final int VIDEO_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isSuccess_;
    private int processingTimeMs_;
    private int progress_;
    private int videoDurationMs_;
    private String entityUri_ = "";
    private String videoUri_ = "";
    private String errorReason_ = "";
    private String transcodingId_ = "";

    static {
        VideoTranscodingResult videoTranscodingResult = new VideoTranscodingResult();
        DEFAULT_INSTANCE = videoTranscodingResult;
        h.registerDefaultInstance(VideoTranscodingResult.class, videoTranscodingResult);
    }

    private VideoTranscodingResult() {
    }

    public static y5k1 n() {
        return (y5k1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007", new Object[]{"bitField0_", "entityUri_", "videoUri_", "processingTimeMs_", "progress_", "isSuccess_", "errorReason_", "transcodingId_", "videoDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new VideoTranscodingResult();
        }
        if (iOrdinal == 4) {
            return new y5k1(DEFAULT_INSTANCE);
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
        synchronized (VideoTranscodingResult.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.entityUri_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.errorReason_ = str;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 16;
        this.isSuccess_ = z;
    }

    public final void r(int i) {
        this.bitField0_ |= 4;
        this.processingTimeMs_ = i;
    }

    public final void s(int i) {
        this.bitField0_ |= 8;
        this.progress_ = i;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.transcodingId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 128;
        this.videoDurationMs_ = i;
    }

    public final void v(String str) {
        this.bitField0_ |= 2;
        this.videoUri_ = str;
    }
}

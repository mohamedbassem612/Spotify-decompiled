package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r5u0;
import p.s2j0;
import p.v2j0;
import p.x2k1;
import p.zdc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StreamProgressRequestOuterClass$StreamProgressRequest extends h implements v2j0 {
    public static final int AUDIO_FORMAT_FIELD_NUMBER = 12;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int CONTENT_IS_DOWNLOADED_FIELD_NUMBER = 11;
    public static final int CONTENT_URI_FIELD_NUMBER = 13;
    public static final int CURRENT_POSITION_FIELD_NUMBER = 2;
    private static final StreamProgressRequestOuterClass$StreamProgressRequest DEFAULT_INSTANCE;
    public static final int IS_AUDIO_ON_FIELD_NUMBER = 16;
    public static final int IS_BACKGROUND_FIELD_NUMBER = 6;
    public static final int IS_EXTERNAL_FIELD_NUMBER = 8;
    public static final int IS_FULLSCREEN_FIELD_NUMBER = 7;
    public static final int IS_OVERLAPPING_FIELD_NUMBER = 5;
    public static final int IS_PAUSED_FIELD_NUMBER = 3;
    public static final int IS_PLAYING_VIDEO_FIELD_NUMBER = 4;
    public static final int MEDIA_ID_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 9;
    public static final int PLAYBACK_STATE_FIELD_NUMBER = 15;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 1;
    public static final int VIDEO_SURFACE_V2_FIELD_NUMBER = 18;
    private int audioFormat_;
    private int bitField0_;
    private Timestamp clientTimestamp_;
    private boolean contentIsDownloaded_;
    private long currentPosition_;
    private boolean isAudioOn_;
    private boolean isBackground_;
    private boolean isExternal_;
    private boolean isFullscreen_;
    private boolean isOverlapping_;
    private boolean isPaused_;
    private boolean isPlayingVideo_;
    private double playbackSpeed_;
    private int playbackState_;
    private StreamHandleOuterClass$StreamHandle streamHandle_;
    private int videoSurfaceV2_;
    private String mediaId_ = "";
    private String contentUri_ = "";

    static {
        StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest = new StreamProgressRequestOuterClass$StreamProgressRequest();
        DEFAULT_INSTANCE = streamProgressRequestOuterClass$StreamProgressRequest;
        h.registerDefaultInstance(StreamProgressRequestOuterClass$StreamProgressRequest.class, streamProgressRequestOuterClass$StreamProgressRequest);
    }

    private StreamProgressRequestOuterClass$StreamProgressRequest() {
    }

    public static zdc1 n() {
        return (zdc1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003\u0007\u0004\u0007\u0005\u0007\u0006ဇ\u0001\u0007\u0007\b\u0007\t\u0000\nለ\u0002\u000bဇ\u0003\fဌ\u0004\rለ\u0005\u000eဉ\u0006\u000f\f\u0010ဇ\u0007\u0012ဌ\b", new Object[]{"bitField0_", "streamHandle_", "currentPosition_", "isPaused_", "isPlayingVideo_", "isOverlapping_", "isBackground_", "isFullscreen_", "isExternal_", "playbackSpeed_", "mediaId_", "contentIsDownloaded_", "audioFormat_", "contentUri_", "clientTimestamp_", "playbackState_", "isAudioOn_", "videoSurfaceV2_"});
        }
        if (iOrdinal == 3) {
            return new StreamProgressRequestOuterClass$StreamProgressRequest();
        }
        if (iOrdinal == 4) {
            return new zdc1(DEFAULT_INSTANCE);
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
        synchronized (StreamProgressRequestOuterClass$StreamProgressRequest.class) {
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

    public final void o(Timestamp timestamp) {
        this.clientTimestamp_ = timestamp;
        this.bitField0_ |= 64;
    }

    public final void p(long j) {
        this.currentPosition_ = j;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 128;
        this.isAudioOn_ = z;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 2;
        this.isBackground_ = z;
    }

    public final void s(boolean z) {
        this.isFullscreen_ = z;
    }

    public final void t(boolean z) {
        this.isPaused_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.isPlayingVideo_ = z;
    }

    public final void v(double d) {
        this.playbackSpeed_ = d;
    }

    public final void w(r5u0 r5u0Var) {
        this.playbackState_ = r5u0Var.getNumber();
    }

    public final void x(StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle) {
        streamHandleOuterClass$StreamHandle.getClass();
        this.streamHandle_ = streamHandleOuterClass$StreamHandle;
        this.bitField0_ |= 1;
    }

    public final void y(x2k1 x2k1Var) {
        this.videoSurfaceV2_ = x2k1Var.getNumber();
        this.bitField0_ |= 256;
    }
}

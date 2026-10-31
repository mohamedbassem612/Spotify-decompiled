package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.lyl1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class WorkoutCuePipelineEvent extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_BYTE_COUNT_FIELD_NUMBER = 10;
    public static final int CANCELLED_DURING_STAGE_FIELD_NUMBER = 15;
    public static final int CANCEL_REASON_FIELD_NUMBER = 14;
    public static final int CONTEXT_URI_FIELD_NUMBER = 7;
    public static final int CUE_TYPE_FIELD_NUMBER = 5;
    private static final WorkoutCuePipelineEvent DEFAULT_INSTANCE;
    public static final int ERROR_REASON_FIELD_NUMBER = 8;
    public static final int HTTP_STATUS_FIELD_NUMBER = 9;
    public static final int IS_PLAYLIST_DOWNLOADED_FIELD_NUMBER = 18;
    public static final int NETWORK_STATE_FIELD_NUMBER = 19;
    private static volatile qzr0 PARSER = null;
    public static final int PIPELINE_ELAPSED_MS_FIELD_NUMBER = 4;
    public static final int PIPELINE_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ELAPSED_MS_FIELD_NUMBER = 11;
    public static final int SESSION_ID_FIELD_NUMBER = 16;
    public static final int STAGE_DURATION_MS_FIELD_NUMBER = 3;
    public static final int STAGE_FIELD_NUMBER = 2;
    public static final int TRACK_URI_FIELD_NUMBER = 17;
    public static final int TTS_PROVIDER_FIELD_NUMBER = 12;
    public static final int TTS_VOICE_FIELD_NUMBER = 13;
    public static final int WORKOUT_TYPE_FIELD_NUMBER = 6;
    private long audioByteCount_;
    private int bitField0_;
    private long httpStatus_;
    private boolean isPlaylistDownloaded_;
    private long pipelineElapsedMs_;
    private long sessionElapsedMs_;
    private long stageDurationMs_;
    private String pipelineId_ = "";
    private String stage_ = "";
    private String cueType_ = "";
    private String workoutType_ = "";
    private String contextUri_ = "";
    private String errorReason_ = "";
    private String ttsProvider_ = "";
    private String ttsVoice_ = "";
    private String cancelReason_ = "";
    private String cancelledDuringStage_ = "";
    private String sessionId_ = "";
    private String trackUri_ = "";
    private String networkState_ = "";

    static {
        WorkoutCuePipelineEvent workoutCuePipelineEvent = new WorkoutCuePipelineEvent();
        DEFAULT_INSTANCE = workoutCuePipelineEvent;
        com.google.protobuf.h.registerDefaultInstance(WorkoutCuePipelineEvent.class, workoutCuePipelineEvent);
    }

    private WorkoutCuePipelineEvent() {
    }

    public static lyl1 n() {
        return (lyl1) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.sessionId_ = str;
    }

    public final void B(String str) {
        this.bitField0_ |= 2;
        this.stage_ = str;
    }

    public final void C(long j) {
        this.bitField0_ |= 4;
        this.stageDurationMs_ = j;
    }

    public final void D(String str) {
        this.bitField0_ |= 65536;
        this.trackUri_ = str;
    }

    public final void E(String str) {
        this.bitField0_ |= 2048;
        this.ttsProvider_ = str;
    }

    public final void F(String str) {
        this.bitField0_ |= 4096;
        this.ttsVoice_ = str;
    }

    public final void G(String str) {
        this.bitField0_ |= 32;
        this.workoutType_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဇ\u0011\u0013ဈ\u0012", new Object[]{"bitField0_", "pipelineId_", "stage_", "stageDurationMs_", "pipelineElapsedMs_", "cueType_", "workoutType_", "contextUri_", "errorReason_", "httpStatus_", "audioByteCount_", "sessionElapsedMs_", "ttsProvider_", "ttsVoice_", "cancelReason_", "cancelledDuringStage_", "sessionId_", "trackUri_", "isPlaylistDownloaded_", "networkState_"});
        }
        if (iOrdinal == 3) {
            return new WorkoutCuePipelineEvent();
        }
        if (iOrdinal == 4) {
            return new lyl1(DEFAULT_INSTANCE);
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
        synchronized (WorkoutCuePipelineEvent.class) {
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
        this.bitField0_ |= 512;
        this.audioByteCount_ = j;
    }

    public final void p(String str) {
        this.bitField0_ |= 8192;
        this.cancelReason_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 16384;
        this.cancelledDuringStage_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.contextUri_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.cueType_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 128;
        this.errorReason_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 256;
        this.httpStatus_ = j;
    }

    public final void v(boolean z) {
        this.bitField0_ |= 131072;
        this.isPlaylistDownloaded_ = z;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 262144;
        this.networkState_ = str;
    }

    public final void x(long j) {
        this.bitField0_ |= 8;
        this.pipelineElapsedMs_ = j;
    }

    public final void y(String str) {
        this.bitField0_ |= 1;
        this.pipelineId_ = str;
    }

    public final void z(long j) {
        this.bitField0_ |= 1024;
        this.sessionElapsedMs_ = j;
    }
}

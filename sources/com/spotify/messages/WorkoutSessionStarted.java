package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u1m1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class WorkoutSessionStarted extends com.google.protobuf.h implements v2j0 {
    public static final int ADJUST_SPEED_ENABLED_FIELD_NUMBER = 8;
    public static final int BEAT_MATCHING_ENABLED_FIELD_NUMBER = 7;
    public static final int COACHING_ENABLED_FIELD_NUMBER = 6;
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    private static final WorkoutSessionStarted DEFAULT_INSTANCE;
    public static final int INTENSITY_FIELD_NUMBER = 5;
    public static final int IS_PLAYLIST_DOWNLOADED_FIELD_NUMBER = 10;
    public static final int NETWORK_STATE_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PLANNED_DURATION_MS_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TARGET_BPM_FIELD_NUMBER = 9;
    public static final int WORKOUT_TYPE_FIELD_NUMBER = 3;
    private boolean adjustSpeedEnabled_;
    private boolean beatMatchingEnabled_;
    private int bitField0_;
    private boolean coachingEnabled_;
    private boolean isPlaylistDownloaded_;
    private long plannedDurationMs_;
    private long targetBpm_;
    private String sessionId_ = "";
    private String contextUri_ = "";
    private String workoutType_ = "";
    private String intensity_ = "";
    private String networkState_ = "";

    static {
        WorkoutSessionStarted workoutSessionStarted = new WorkoutSessionStarted();
        DEFAULT_INSTANCE = workoutSessionStarted;
        com.google.protobuf.h.registerDefaultInstance(WorkoutSessionStarted.class, workoutSessionStarted);
    }

    private WorkoutSessionStarted() {
    }

    public static u1m1 n() {
        return (u1m1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဂ\b\nဇ\t\u000bဈ\n", new Object[]{"bitField0_", "sessionId_", "contextUri_", "workoutType_", "plannedDurationMs_", "intensity_", "coachingEnabled_", "beatMatchingEnabled_", "adjustSpeedEnabled_", "targetBpm_", "isPlaylistDownloaded_", "networkState_"});
        }
        if (iOrdinal == 3) {
            return new WorkoutSessionStarted();
        }
        if (iOrdinal == 4) {
            return new u1m1(DEFAULT_INSTANCE);
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
        synchronized (WorkoutSessionStarted.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 128;
        this.adjustSpeedEnabled_ = z;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 64;
        this.beatMatchingEnabled_ = z;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 32;
        this.coachingEnabled_ = z;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.contextUri_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.intensity_ = str;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 512;
        this.isPlaylistDownloaded_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.networkState_ = str;
    }

    public final void v(long j) {
        this.bitField0_ |= 8;
        this.plannedDurationMs_ = j;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final void x(long j) {
        this.bitField0_ |= 256;
        this.targetBpm_ = j;
    }

    public final void y(String str) {
        this.bitField0_ |= 4;
        this.workoutType_ = str;
    }
}

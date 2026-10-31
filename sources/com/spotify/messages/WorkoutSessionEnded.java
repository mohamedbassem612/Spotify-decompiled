package com.spotify.messages;

import p.b1m1;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class WorkoutSessionEnded extends com.google.protobuf.h implements v2j0 {
    private static final WorkoutSessionEnded DEFAULT_INSTANCE;
    public static final int ELAPSED_MS_FIELD_NUMBER = 3;
    public static final int END_REASON_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLANNED_DURATION_MS_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private long elapsedMs_;
    private long plannedDurationMs_;
    private String sessionId_ = "";
    private String endReason_ = "";

    static {
        WorkoutSessionEnded workoutSessionEnded = new WorkoutSessionEnded();
        DEFAULT_INSTANCE = workoutSessionEnded;
        com.google.protobuf.h.registerDefaultInstance(WorkoutSessionEnded.class, workoutSessionEnded);
    }

    private WorkoutSessionEnded() {
    }

    public static b1m1 n() {
        return (b1m1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "sessionId_", "endReason_", "elapsedMs_", "plannedDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new WorkoutSessionEnded();
        }
        if (iOrdinal == 4) {
            return new b1m1(DEFAULT_INSTANCE);
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
        synchronized (WorkoutSessionEnded.class) {
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
        this.bitField0_ |= 4;
        this.elapsedMs_ = j;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.endReason_ = str;
    }

    public final void q(long j) {
        this.bitField0_ |= 8;
        this.plannedDurationMs_ = j;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

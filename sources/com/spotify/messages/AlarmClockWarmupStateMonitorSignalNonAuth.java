package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.v43;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AlarmClockWarmupStateMonitorSignalNonAuth extends com.google.protobuf.h implements v2j0 {
    private static final AlarmClockWarmupStateMonitorSignalNonAuth DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int WARMUP_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String warmupId_ = "";

    static {
        AlarmClockWarmupStateMonitorSignalNonAuth alarmClockWarmupStateMonitorSignalNonAuth = new AlarmClockWarmupStateMonitorSignalNonAuth();
        DEFAULT_INSTANCE = alarmClockWarmupStateMonitorSignalNonAuth;
        com.google.protobuf.h.registerDefaultInstance(AlarmClockWarmupStateMonitorSignalNonAuth.class, alarmClockWarmupStateMonitorSignalNonAuth);
    }

    private AlarmClockWarmupStateMonitorSignalNonAuth() {
    }

    public static v43 n() {
        return (v43) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "warmupId_"});
        }
        if (iOrdinal == 3) {
            return new AlarmClockWarmupStateMonitorSignalNonAuth();
        }
        if (iOrdinal == 4) {
            return new v43(DEFAULT_INSTANCE);
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
        synchronized (AlarmClockWarmupStateMonitorSignalNonAuth.class) {
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
        this.bitField0_ |= 1;
        this.warmupId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

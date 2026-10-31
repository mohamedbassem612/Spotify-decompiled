package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r43;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AlarmClockWarmupCachePlaylistNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    private static final AlarmClockWarmupCachePlaylistNonAuth DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int WARMUP_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String warmupId_ = "";
    private String contextUri_ = "";

    static {
        AlarmClockWarmupCachePlaylistNonAuth alarmClockWarmupCachePlaylistNonAuth = new AlarmClockWarmupCachePlaylistNonAuth();
        DEFAULT_INSTANCE = alarmClockWarmupCachePlaylistNonAuth;
        com.google.protobuf.h.registerDefaultInstance(AlarmClockWarmupCachePlaylistNonAuth.class, alarmClockWarmupCachePlaylistNonAuth);
    }

    private AlarmClockWarmupCachePlaylistNonAuth() {
    }

    public static r43 n() {
        return (r43) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "warmupId_", "contextUri_"});
        }
        if (iOrdinal == 3) {
            return new AlarmClockWarmupCachePlaylistNonAuth();
        }
        if (iOrdinal == 4) {
            return new r43(DEFAULT_INSTANCE);
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
        synchronized (AlarmClockWarmupCachePlaylistNonAuth.class) {
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
        this.bitField0_ |= 2;
        this.contextUri_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.warmupId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.offline.playbacktimeout;

import com.google.protobuf.h;
import p.a8r;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DeadEndsPlaybackTimeoutEvent extends h implements v2j0 {
    private static final DeadEndsPlaybackTimeoutEvent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int SIGNAL_FIELD_NUMBER = 1;
    private int bitField0_;
    private String signal_ = "";
    private String playbackId_ = "";

    static {
        DeadEndsPlaybackTimeoutEvent deadEndsPlaybackTimeoutEvent = new DeadEndsPlaybackTimeoutEvent();
        DEFAULT_INSTANCE = deadEndsPlaybackTimeoutEvent;
        h.registerDefaultInstance(DeadEndsPlaybackTimeoutEvent.class, deadEndsPlaybackTimeoutEvent);
    }

    private DeadEndsPlaybackTimeoutEvent() {
    }

    public static a8r n() {
        return (a8r) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "signal_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new DeadEndsPlaybackTimeoutEvent();
        }
        if (iOrdinal == 4) {
            return new a8r(DEFAULT_INSTANCE);
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
        synchronized (DeadEndsPlaybackTimeoutEvent.class) {
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
        this.playbackId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.signal_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.contentagnostic.v2;

import com.google.protobuf.Duration;
import p.bf40;
import p.dzt0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class PlaybackOffsets extends com.google.protobuf.h implements v2j0 {
    private static final PlaybackOffsets DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration end_;
    private Duration start_;

    static {
        PlaybackOffsets playbackOffsets = new PlaybackOffsets();
        DEFAULT_INSTANCE = playbackOffsets;
        com.google.protobuf.h.registerDefaultInstance(PlaybackOffsets.class, playbackOffsets);
    }

    private PlaybackOffsets() {
    }

    public static PlaybackOffsets n() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackOffsets();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (PlaybackOffsets.class) {
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

    public final Duration o() {
        Duration duration = this.end_;
        return duration == null ? Duration.n() : duration;
    }

    public final Duration p() {
        Duration duration = this.start_;
        return duration == null ? Duration.n() : duration;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

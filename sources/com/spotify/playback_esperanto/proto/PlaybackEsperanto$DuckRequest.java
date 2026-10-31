package com.spotify.playback_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bzt0;
import p.czt0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackEsperanto$DuckRequest extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final PlaybackEsperanto$DuckRequest DEFAULT_INSTANCE;
    public static final int FADE_DURATION_MS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int VOLUME_FIELD_NUMBER = 3;
    private int action_;
    private int fadeDurationMs_;
    private double volume_;

    static {
        PlaybackEsperanto$DuckRequest playbackEsperanto$DuckRequest = new PlaybackEsperanto$DuckRequest();
        DEFAULT_INSTANCE = playbackEsperanto$DuckRequest;
        h.registerDefaultInstance(PlaybackEsperanto$DuckRequest.class, playbackEsperanto$DuckRequest);
    }

    private PlaybackEsperanto$DuckRequest() {
    }

    public static czt0 n() {
        return (czt0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\f\u0003\u0000\u0004\u000b", new Object[]{"action_", "volume_", "fadeDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackEsperanto$DuckRequest();
        }
        if (iOrdinal == 4) {
            return new czt0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackEsperanto$DuckRequest.class) {
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

    public final void o(bzt0 bzt0Var) {
        this.action_ = bzt0Var.getNumber();
    }

    public final void p(int i) {
        this.fadeDurationMs_ = i;
    }

    public final void q(double d) {
        this.volume_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

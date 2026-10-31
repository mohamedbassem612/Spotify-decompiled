package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.jlz;
import p.kmz;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsContextPlayerOptions$ContextPlayerOptions extends h implements v2j0 {
    private static final EsContextPlayerOptions$ContextPlayerOptions DEFAULT_INSTANCE;
    public static final int MODES_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 4;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER = 2;
    public static final int REPEATING_TRACK_FIELD_NUMBER = 3;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private qng0 modes_ = qng0.b;
    private float playbackSpeed_;
    private boolean repeatingContext_;
    private boolean repeatingTrack_;
    private boolean shufflingContext_;

    static {
        EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = new EsContextPlayerOptions$ContextPlayerOptions();
        DEFAULT_INSTANCE = esContextPlayerOptions$ContextPlayerOptions;
        h.registerDefaultInstance(EsContextPlayerOptions$ContextPlayerOptions.class, esContextPlayerOptions$ContextPlayerOptions);
    }

    private EsContextPlayerOptions$ContextPlayerOptions() {
    }

    public static EsContextPlayerOptions$ContextPlayerOptions o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004ခ\u0000\u00052", new Object[]{"bitField0_", "shufflingContext_", "repeatingContext_", "repeatingTrack_", "playbackSpeed_", "modes_", kmz.a});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerOptions$ContextPlayerOptions();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 21);
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
        synchronized (EsContextPlayerOptions$ContextPlayerOptions.class) {
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

    public final Map p() {
        return Collections.unmodifiableMap(this.modes_);
    }

    public final float q() {
        return this.playbackSpeed_;
    }

    public final boolean r() {
        return this.repeatingContext_;
    }

    public final boolean s() {
        return this.repeatingTrack_;
    }

    public final boolean t() {
        return this.shufflingContext_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

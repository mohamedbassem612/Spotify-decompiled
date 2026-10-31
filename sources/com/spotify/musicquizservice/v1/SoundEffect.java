package com.spotify.musicquizservice.v1;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class SoundEffect extends com.google.protobuf.h implements v2j0 {
    private static final SoundEffect DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RANDOM_SELECTION_FIELD_NUMBER = 3;
    public static final int URLS_FIELD_NUMBER = 1;
    public static final int VOLUME_FIELD_NUMBER = 2;
    private int delayMs_;
    private boolean randomSelection_;
    private h290 urls_ = com.google.protobuf.h.emptyProtobufList();
    private int volume_;

    static {
        SoundEffect soundEffect = new SoundEffect();
        DEFAULT_INSTANCE = soundEffect;
        com.google.protobuf.h.registerDefaultInstance(SoundEffect.class, soundEffect);
    }

    private SoundEffect() {
    }

    public static SoundEffect n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002\u0004\u0003\u0007\u0004\u0004", new Object[]{"urls_", "volume_", "randomSelection_", "delayMs_"});
        }
        if (iOrdinal == 3) {
            return new SoundEffect();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (SoundEffect.class) {
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

    public final int o() {
        return this.delayMs_;
    }

    public final boolean p() {
        return this.randomSelection_;
    }

    public final h290 q() {
        return this.urls_;
    }

    public final int r() {
        return this.volume_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

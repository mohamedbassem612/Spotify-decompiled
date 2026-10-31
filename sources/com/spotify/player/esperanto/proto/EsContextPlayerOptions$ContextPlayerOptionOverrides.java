package com.spotify.player.esperanto.proto;

import p.bf40;
import p.imz;
import p.jf40;
import p.jmz;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsContextPlayerOptions$ContextPlayerOptionOverrides extends com.google.protobuf.h implements v2j0 {
    private static final EsContextPlayerOptions$ContextPlayerOptionOverrides DEFAULT_INSTANCE;
    public static final int MODES_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 4;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER = 2;
    public static final int REPEATING_TRACK_FIELD_NUMBER = 3;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private qng0 modes_ = qng0.b;
    private float playbackSpeed_;
    private EsOptional$OptionalBoolean repeatingContext_;
    private EsOptional$OptionalBoolean repeatingTrack_;
    private EsOptional$OptionalBoolean shufflingContext_;

    static {
        EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides = new EsContextPlayerOptions$ContextPlayerOptionOverrides();
        DEFAULT_INSTANCE = esContextPlayerOptions$ContextPlayerOptionOverrides;
        com.google.protobuf.h.registerDefaultInstance(EsContextPlayerOptions$ContextPlayerOptionOverrides.class, esContextPlayerOptions$ContextPlayerOptionOverrides);
    }

    private EsContextPlayerOptions$ContextPlayerOptionOverrides() {
    }

    public static imz o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u00052", new Object[]{"bitField0_", "shufflingContext_", "repeatingContext_", "repeatingTrack_", "playbackSpeed_", "modes_", jmz.a});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerOptions$ContextPlayerOptionOverrides();
        }
        if (iOrdinal == 4) {
            return new imz(DEFAULT_INSTANCE);
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
        synchronized (EsContextPlayerOptions$ContextPlayerOptionOverrides.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.modes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.modes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esOptional$OptionalBoolean.getClass();
        this.repeatingContext_ = esOptional$OptionalBoolean;
        this.bitField0_ |= 2;
    }

    public final void q(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esOptional$OptionalBoolean.getClass();
        this.repeatingTrack_ = esOptional$OptionalBoolean;
        this.bitField0_ |= 4;
    }

    public final void r(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esOptional$OptionalBoolean.getClass();
        this.shufflingContext_ = esOptional$OptionalBoolean;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

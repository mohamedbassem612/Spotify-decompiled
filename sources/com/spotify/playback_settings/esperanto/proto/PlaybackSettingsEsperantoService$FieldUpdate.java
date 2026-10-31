package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c4u0;
import p.d4u0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackSettingsEsperantoService$FieldUpdate extends h implements v2j0 {
    private static final PlaybackSettingsEsperantoService$FieldUpdate DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int id_;
    private PlaybackSettingsEsperantoService$FieldValue value_;

    static {
        PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate = new PlaybackSettingsEsperantoService$FieldUpdate();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$FieldUpdate;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$FieldUpdate.class, playbackSettingsEsperantoService$FieldUpdate);
    }

    private PlaybackSettingsEsperantoService$FieldUpdate() {
    }

    public static d4u0 n() {
        return (d4u0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "id_", "value_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$FieldUpdate();
        }
        if (iOrdinal == 4) {
            return new d4u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$FieldUpdate.class) {
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

    public final void o(c4u0 c4u0Var) {
        this.id_ = c4u0Var.getNumber();
    }

    public final void p(PlaybackSettingsEsperantoService$FieldValue playbackSettingsEsperantoService$FieldValue) {
        playbackSettingsEsperantoService$FieldValue.getClass();
        this.value_ = playbackSettingsEsperantoService$FieldValue;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

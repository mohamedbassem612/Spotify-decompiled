package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.e4u0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackSettingsEsperantoService$FieldValue extends h implements v2j0 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$FieldValue DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    static {
        PlaybackSettingsEsperantoService$FieldValue playbackSettingsEsperantoService$FieldValue = new PlaybackSettingsEsperantoService$FieldValue();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$FieldValue;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$FieldValue.class, playbackSettingsEsperantoService$FieldValue);
    }

    private PlaybackSettingsEsperantoService$FieldValue() {
    }

    public static e4u0 n() {
        return (e4u0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00037\u0000\u00044\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$FieldValue();
        }
        if (iOrdinal == 4) {
            return new e4u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$FieldValue.class) {
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

    public final void o(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void setBoolValue(boolean z) {
        this.valueCase_ = 2;
        this.value_ = Boolean.valueOf(z);
    }

    public final void setStringValue(String str) {
        this.valueCase_ = 1;
        this.value_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

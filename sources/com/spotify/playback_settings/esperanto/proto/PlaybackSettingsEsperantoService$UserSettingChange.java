package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dzt0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PlaybackSettingsEsperantoService$UserSettingChange extends h implements v2j0 {
    public static final int AUDIO_LANGUAGE_FIELD_NUMBER = 22;
    public static final int CROSSFADE_DURATION_MS_FIELD_NUMBER = 11;
    public static final int CROSSFADE_FIELD_NUMBER = 10;
    private static final PlaybackSettingsEsperantoService$UserSettingChange DEFAULT_INSTANCE;
    public static final int DISABLE_SMART_SHUFFLE_FIELD_NUMBER = 6;
    public static final int GAPLESS_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 23;
    private int fieldCase_ = 0;
    private Object field_;

    static {
        PlaybackSettingsEsperantoService$UserSettingChange playbackSettingsEsperantoService$UserSettingChange = new PlaybackSettingsEsperantoService$UserSettingChange();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$UserSettingChange;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$UserSettingChange.class, playbackSettingsEsperantoService$UserSettingChange);
    }

    private PlaybackSettingsEsperantoService$UserSettingChange() {
    }

    public static PlaybackSettingsEsperantoService$UserSettingChange p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0006\u0017\u0006\u0000\u0000\u0000\u0006:\u0000\t:\u0000\n:\u0000\u000b7\u0000\u0016Ȼ\u0000\u0017Ȼ\u0000", new Object[]{"field_", "fieldCase_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$UserSettingChange();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (PlaybackSettingsEsperantoService$UserSettingChange.class) {
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

    public final boolean n() {
        if (this.fieldCase_ == 10) {
            return ((Boolean) this.field_).booleanValue();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        if (this.fieldCase_ == 11) {
            return ((Integer) this.field_).intValue();
        }
        return 0;
    }

    public final boolean q() {
        if (this.fieldCase_ == 6) {
            return ((Boolean) this.field_).booleanValue();
        }
        return false;
    }

    public final boolean r() {
        if (this.fieldCase_ == 9) {
            return ((Boolean) this.field_).booleanValue();
        }
        return false;
    }

    public final boolean s() {
        return this.fieldCase_ == 10;
    }

    public final boolean t() {
        return this.fieldCase_ == 11;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.fieldCase_ == 6;
    }

    public final boolean v() {
        return this.fieldCase_ == 9;
    }
}

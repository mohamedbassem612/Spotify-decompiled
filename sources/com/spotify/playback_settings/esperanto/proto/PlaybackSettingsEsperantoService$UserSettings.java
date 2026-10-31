package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dzt0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PlaybackSettingsEsperantoService$UserSettings extends h implements v2j0 {
    public static final int AUDIO_LANGUAGE_FIELD_NUMBER = 22;
    public static final int CROSSFADE_DURATION_MS_FIELD_NUMBER = 11;
    public static final int CROSSFADE_FIELD_NUMBER = 10;
    private static final PlaybackSettingsEsperantoService$UserSettings DEFAULT_INSTANCE;
    public static final int DISABLE_SMART_SHUFFLE_FIELD_NUMBER = 6;
    public static final int GAPLESS_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 23;
    private int bitField0_;
    private int crossfadeDurationMs_;
    private boolean crossfade_;
    private boolean disableSmartShuffle_;
    private boolean gapless_;
    private String audioLanguage_ = "";
    private String subtitleLanguage_ = "";

    static {
        PlaybackSettingsEsperantoService$UserSettings playbackSettingsEsperantoService$UserSettings = new PlaybackSettingsEsperantoService$UserSettings();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$UserSettings;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$UserSettings.class, playbackSettingsEsperantoService$UserSettings);
    }

    private PlaybackSettingsEsperantoService$UserSettings() {
    }

    public static PlaybackSettingsEsperantoService$UserSettings p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0006\u0017\u0006\u0000\u0000\u0000\u0006ဇ\u0000\tဇ\u0001\nဇ\u0002\u000bင\u0003\u0016ለ\u0004\u0017ለ\u0005", new Object[]{"bitField0_", "disableSmartShuffle_", "gapless_", "crossfade_", "crossfadeDurationMs_", "audioLanguage_", "subtitleLanguage_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$UserSettings();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (PlaybackSettingsEsperantoService$UserSettings.class) {
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
        return this.crossfade_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.crossfadeDurationMs_;
    }

    public final boolean q() {
        return this.disableSmartShuffle_;
    }

    public final boolean r() {
        return this.gapless_;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 8) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }
}

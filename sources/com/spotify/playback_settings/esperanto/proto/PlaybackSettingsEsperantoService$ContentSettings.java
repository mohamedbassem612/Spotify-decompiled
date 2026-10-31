package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dzt0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackSettingsEsperantoService$ContentSettings extends h implements v2j0 {
    public static final int CONTEXT_ENHANCEMENT_FIELD_NUMBER = 5;
    private static final PlaybackSettingsEsperantoService$ContentSettings DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 3;
    public static final int SHUFFLE_FIELD_NUMBER = 4;
    public static final int SKIP_FINISHED_EPISODES_FIELD_NUMBER = 8;
    public static final int TRANSLATION_LANGUAGE_FIELD_NUMBER = 21;
    private int bitField0_;
    private int contextEnhancement_;
    private float playbackSpeed_;
    private boolean shuffle_;
    private boolean skipFinishedEpisodes_;
    private String translationLanguage_ = "";

    static {
        PlaybackSettingsEsperantoService$ContentSettings playbackSettingsEsperantoService$ContentSettings = new PlaybackSettingsEsperantoService$ContentSettings();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$ContentSettings;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$ContentSettings.class, playbackSettingsEsperantoService$ContentSettings);
    }

    private PlaybackSettingsEsperantoService$ContentSettings() {
    }

    public static PlaybackSettingsEsperantoService$ContentSettings n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0003\u0015\u0005\u0000\u0000\u0000\u0003\u0001\u0004\u0007\u0005\f\bဇ\u0000\u0015ለ\u0001", new Object[]{"bitField0_", "playbackSpeed_", "shuffle_", "contextEnhancement_", "skipFinishedEpisodes_", "translationLanguage_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$ContentSettings();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (PlaybackSettingsEsperantoService$ContentSettings.class) {
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

    public final boolean o() {
        return this.skipFinishedEpisodes_;
    }

    public final String p() {
        return this.translationLanguage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

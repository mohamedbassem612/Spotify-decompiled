package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackSettingsEsperantoService$DeviceSettings extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$DeviceSettings DEFAULT_INSTANCE;
    public static final int EQUALIZER_ENABLED_FIELD_NUMBER = 14;
    public static final int EQUALIZER_HIGH_MID_PEAK_GAIN_FIELD_NUMBER = 18;
    public static final int EQUALIZER_HIGH_PEAK_GAIN_FIELD_NUMBER = 19;
    public static final int EQUALIZER_HIGH_SHELF_GAIN_FIELD_NUMBER = 20;
    public static final int EQUALIZER_LOW_MID_PEAK_GAIN_FIELD_NUMBER = 17;
    public static final int EQUALIZER_LOW_PEAK_GAIN_FIELD_NUMBER = 16;
    public static final int EQUALIZER_LOW_SHELF_GAIN_FIELD_NUMBER = 15;
    public static final int MEDIA_MODE_FIELD_NUMBER = 7;
    public static final int NORMALIZE_FIELD_NUMBER = 12;
    public static final int NORMALIZE_LEVEL_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int STREAM_QUALITY_FIELD_NUMBER = 1;
    private int bitField0_;
    private DeviceCapabilities capabilities_;
    private boolean equalizerEnabled_;
    private float equalizerHighMidPeakGain_;
    private float equalizerHighPeakGain_;
    private float equalizerHighShelfGain_;
    private float equalizerLowMidPeakGain_;
    private float equalizerLowPeakGain_;
    private float equalizerLowShelfGain_;
    private int mediaMode_;
    private int normalizeLevel_;
    private boolean normalize_;
    private int streamQuality_;

    public static final class DeviceCapabilities extends h implements v2j0 {
        private static final DeviceCapabilities DEFAULT_INSTANCE;
        public static final int MAX_SUPPORTED_STREAM_QUALITY_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int maxSupportedStreamQuality_;

        static {
            DeviceCapabilities deviceCapabilities = new DeviceCapabilities();
            DEFAULT_INSTANCE = deviceCapabilities;
            h.registerDefaultInstance(DeviceCapabilities.class, deviceCapabilities);
        }

        private DeviceCapabilities() {
        }

        public static DeviceCapabilities n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"maxSupportedStreamQuality_"});
            }
            if (iOrdinal == 3) {
                return new DeviceCapabilities();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (DeviceCapabilities.class) {
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
            return this.maxSupportedStreamQuality_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PlaybackSettingsEsperantoService$DeviceSettings playbackSettingsEsperantoService$DeviceSettings = new PlaybackSettingsEsperantoService$DeviceSettings();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$DeviceSettings;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$DeviceSettings.class, playbackSettingsEsperantoService$DeviceSettings);
    }

    private PlaybackSettingsEsperantoService$DeviceSettings() {
    }

    public static PlaybackSettingsEsperantoService$DeviceSettings o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\u0014\f\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0007\f\f\u0007\r\u0004\u000e\u0007\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001", new Object[]{"bitField0_", "streamQuality_", "capabilities_", "mediaMode_", "normalize_", "normalizeLevel_", "equalizerEnabled_", "equalizerLowShelfGain_", "equalizerLowPeakGain_", "equalizerLowMidPeakGain_", "equalizerHighMidPeakGain_", "equalizerHighPeakGain_", "equalizerHighShelfGain_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$DeviceSettings();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$DeviceSettings.class) {
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

    public final DeviceCapabilities n() {
        DeviceCapabilities deviceCapabilities = this.capabilities_;
        return deviceCapabilities == null ? DeviceCapabilities.n() : deviceCapabilities;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        return this.streamQuality_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

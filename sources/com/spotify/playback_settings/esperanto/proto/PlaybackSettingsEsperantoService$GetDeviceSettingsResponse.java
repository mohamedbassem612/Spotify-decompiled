package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dzt0;
import p.jf40;
import p.l4u0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackSettingsEsperantoService$GetDeviceSettingsResponse extends h implements v2j0 {
    private static final PlaybackSettingsEsperantoService$GetDeviceSettingsResponse DEFAULT_INSTANCE;
    public static final int DEVICE_SETTINGS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaybackSettingsEsperantoService$DeviceSettings deviceSettings_;
    private int status_;

    static {
        PlaybackSettingsEsperantoService$GetDeviceSettingsResponse playbackSettingsEsperantoService$GetDeviceSettingsResponse = new PlaybackSettingsEsperantoService$GetDeviceSettingsResponse();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$GetDeviceSettingsResponse;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$GetDeviceSettingsResponse.class, playbackSettingsEsperantoService$GetDeviceSettingsResponse);
    }

    private PlaybackSettingsEsperantoService$GetDeviceSettingsResponse() {
    }

    public static PlaybackSettingsEsperantoService$GetDeviceSettingsResponse p(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$GetDeviceSettingsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "status_", "deviceSettings_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$GetDeviceSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (PlaybackSettingsEsperantoService$GetDeviceSettingsResponse.class) {
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

    public final PlaybackSettingsEsperantoService$DeviceSettings n() {
        PlaybackSettingsEsperantoService$DeviceSettings playbackSettingsEsperantoService$DeviceSettings = this.deviceSettings_;
        return playbackSettingsEsperantoService$DeviceSettings == null ? PlaybackSettingsEsperantoService$DeviceSettings.o() : playbackSettingsEsperantoService$DeviceSettings;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final l4u0 o() {
        l4u0 l4u0VarA = l4u0.a(this.status_);
        return l4u0VarA == null ? l4u0.UNRECOGNIZED : l4u0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

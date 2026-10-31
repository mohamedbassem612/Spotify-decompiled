package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.dzt0;
import p.h4u0;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaybackSettingsEsperantoService$GetSettingsResponse extends h implements v2j0 {
    public static final int CONTENT_SETTINGS_FIELD_NUMBER = 1;
    private static final PlaybackSettingsEsperantoService$GetSettingsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_SETTINGS_FIELD_NUMBER = 2;
    private int bitField0_;
    private qng0 contentSettings_ = qng0.b;
    private PlaybackSettingsEsperantoService.UserSettings userSettings_;

    static {
        PlaybackSettingsEsperantoService$GetSettingsResponse playbackSettingsEsperantoService$GetSettingsResponse = new PlaybackSettingsEsperantoService$GetSettingsResponse();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$GetSettingsResponse;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$GetSettingsResponse.class, playbackSettingsEsperantoService$GetSettingsResponse);
    }

    private PlaybackSettingsEsperantoService$GetSettingsResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaybackSettingsEsperantoService$GetSettingsResponse r(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$GetSettingsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဉ\u0000", new Object[]{"bitField0_", "contentSettings_", h4u0.a, "userSettings_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$GetSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new dzt0((byte) 5);
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
        synchronized (PlaybackSettingsEsperantoService$GetSettingsResponse.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.contentSettings_);
    }

    public final PlaybackSettingsEsperantoService.UserSettings p() {
        PlaybackSettingsEsperantoService.UserSettings userSettings = this.userSettings_;
        return userSettings == null ? PlaybackSettingsEsperantoService.UserSettings.p() : userSettings;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

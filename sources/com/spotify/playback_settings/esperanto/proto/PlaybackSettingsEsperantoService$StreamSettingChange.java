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
public final class PlaybackSettingsEsperantoService$StreamSettingChange extends h implements v2j0 {
    public static final int CONTENT_CHANGE_FIELD_NUMBER = 1;
    private static final PlaybackSettingsEsperantoService$StreamSettingChange DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_CHANGE_FIELD_NUMBER = 2;
    private int changeTypeCase_ = 0;
    private Object changeType_;

    static {
        PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = new PlaybackSettingsEsperantoService$StreamSettingChange();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$StreamSettingChange;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$StreamSettingChange.class, playbackSettingsEsperantoService$StreamSettingChange);
    }

    private PlaybackSettingsEsperantoService$StreamSettingChange() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaybackSettingsEsperantoService$StreamSettingChange q(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$StreamSettingChange) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"changeType_", "changeTypeCase_", PlaybackSettingsEsperantoService.ContentSettingChange.class, PlaybackSettingsEsperantoService$UserSettingChange.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$StreamSettingChange();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (PlaybackSettingsEsperantoService$StreamSettingChange.class) {
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

    public final PlaybackSettingsEsperantoService.ContentSettingChange n() {
        return this.changeTypeCase_ == 1 ? (PlaybackSettingsEsperantoService.ContentSettingChange) this.changeType_ : PlaybackSettingsEsperantoService.ContentSettingChange.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PlaybackSettingsEsperantoService$UserSettingChange o() {
        return this.changeTypeCase_ == 2 ? (PlaybackSettingsEsperantoService$UserSettingChange) this.changeType_ : PlaybackSettingsEsperantoService$UserSettingChange.p();
    }

    public final boolean p() {
        return this.changeTypeCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

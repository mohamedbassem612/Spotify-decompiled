package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.j4u0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackSettingsEsperantoService$SetSettingsRequest extends h implements v2j0 {
    public static final int CONTENT_SETTINGS_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$SetSettingsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_SETTINGS_FIELD_NUMBER = 1;
    private h290 userSettings_ = h.emptyProtobufList();
    private h290 contentSettings_ = h.emptyProtobufList();

    static {
        PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest = new PlaybackSettingsEsperantoService$SetSettingsRequest();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$SetSettingsRequest;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$SetSettingsRequest.class, playbackSettingsEsperantoService$SetSettingsRequest);
    }

    private PlaybackSettingsEsperantoService$SetSettingsRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static j4u0 q() {
        return (j4u0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"userSettings_", PlaybackSettingsEsperantoService$FieldUpdate.class, "contentSettings_", PlaybackSettingsEsperantoService$ContentSettingUpdate.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$SetSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new j4u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$SetSettingsRequest.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.userSettings_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.userSettings_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(PlaybackSettingsEsperantoService$ContentSettingUpdate playbackSettingsEsperantoService$ContentSettingUpdate) {
        playbackSettingsEsperantoService$ContentSettingUpdate.getClass();
        h290 h290VarMutableCopy = this.contentSettings_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.contentSettings_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(playbackSettingsEsperantoService$ContentSettingUpdate);
    }

    public final void p(PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate) {
        playbackSettingsEsperantoService$FieldUpdate.getClass();
        h290 h290VarMutableCopy = this.userSettings_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.userSettings_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(playbackSettingsEsperantoService$FieldUpdate);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

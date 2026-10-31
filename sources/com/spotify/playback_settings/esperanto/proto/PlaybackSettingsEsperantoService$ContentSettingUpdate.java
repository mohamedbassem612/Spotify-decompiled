package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.a4u0;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaybackSettingsEsperantoService$ContentSettingUpdate extends h implements v2j0 {
    public static final int CONTENT_ID_FIELD_NUMBER = 1;
    private static final PlaybackSettingsEsperantoService$ContentSettingUpdate DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String contentId_ = "";
    private h290 fields_ = h.emptyProtobufList();

    static {
        PlaybackSettingsEsperantoService$ContentSettingUpdate playbackSettingsEsperantoService$ContentSettingUpdate = new PlaybackSettingsEsperantoService$ContentSettingUpdate();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$ContentSettingUpdate;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$ContentSettingUpdate.class, playbackSettingsEsperantoService$ContentSettingUpdate);
    }

    private PlaybackSettingsEsperantoService$ContentSettingUpdate() {
    }

    public static a4u0 o() {
        return (a4u0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"contentId_", "fields_", PlaybackSettingsEsperantoService$FieldUpdate.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$ContentSettingUpdate();
        }
        if (iOrdinal == 4) {
            return new a4u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$ContentSettingUpdate.class) {
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

    public final void n(PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate) {
        playbackSettingsEsperantoService$FieldUpdate.getClass();
        h290 h290VarMutableCopy = this.fields_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.fields_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(playbackSettingsEsperantoService$FieldUpdate);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.contentId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

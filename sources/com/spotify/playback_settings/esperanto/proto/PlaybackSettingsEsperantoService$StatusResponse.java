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
public final class PlaybackSettingsEsperantoService$StatusResponse extends h implements v2j0 {
    private static final PlaybackSettingsEsperantoService$StatusResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        PlaybackSettingsEsperantoService$StatusResponse playbackSettingsEsperantoService$StatusResponse = new PlaybackSettingsEsperantoService$StatusResponse();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$StatusResponse;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$StatusResponse.class, playbackSettingsEsperantoService$StatusResponse);
    }

    private PlaybackSettingsEsperantoService$StatusResponse() {
    }

    public static PlaybackSettingsEsperantoService$StatusResponse o(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$StatusResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$StatusResponse();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (PlaybackSettingsEsperantoService$StatusResponse.class) {
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

    public final l4u0 n() {
        l4u0 l4u0VarA = l4u0.a(this.status_);
        return l4u0VarA == null ? l4u0.UNRECOGNIZED : l4u0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

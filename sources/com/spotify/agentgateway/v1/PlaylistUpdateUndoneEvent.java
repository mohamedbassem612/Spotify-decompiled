package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bxu0;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class PlaylistUpdateUndoneEvent extends h implements v2j0 {
    private static final PlaylistUpdateUndoneEvent DEFAULT_INSTANCE;
    public static final int FROM_VERSION_KEY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TO_VERSION_KEY_FIELD_NUMBER = 3;
    private phc fromVersionKey_;
    private String playlistUri_ = "";
    private phc toVersionKey_;

    static {
        PlaylistUpdateUndoneEvent playlistUpdateUndoneEvent = new PlaylistUpdateUndoneEvent();
        DEFAULT_INSTANCE = playlistUpdateUndoneEvent;
        h.registerDefaultInstance(PlaylistUpdateUndoneEvent.class, playlistUpdateUndoneEvent);
    }

    private PlaylistUpdateUndoneEvent() {
        hhc hhcVar = phc.b;
        this.fromVersionKey_ = hhcVar;
        this.toVersionKey_ = hhcVar;
    }

    public static bxu0 n() {
        return (bxu0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n", new Object[]{"playlistUri_", "fromVersionKey_", "toVersionKey_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistUpdateUndoneEvent();
        }
        if (iOrdinal == 4) {
            return new bxu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistUpdateUndoneEvent.class) {
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

    public final void o(hhc hhcVar) {
        this.fromVersionKey_ = hhcVar;
    }

    public final void p(hhc hhcVar) {
        this.toVersionKey_ = hhcVar;
    }

    public final void setPlaylistUri(String str) {
        str.getClass();
        this.playlistUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

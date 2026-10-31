package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.cxu0;
import p.dxu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class PlaylistUpdatedEvent extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final PlaylistUpdatedEvent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int action_;
    private String playlistUri_ = "";
    private String trackUri_ = "";

    static {
        PlaylistUpdatedEvent playlistUpdatedEvent = new PlaylistUpdatedEvent();
        DEFAULT_INSTANCE = playlistUpdatedEvent;
        h.registerDefaultInstance(PlaylistUpdatedEvent.class, playlistUpdatedEvent);
    }

    private PlaylistUpdatedEvent() {
    }

    public static dxu0 n() {
        return (dxu0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"playlistUri_", "trackUri_", "action_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistUpdatedEvent();
        }
        if (iOrdinal == 4) {
            return new dxu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistUpdatedEvent.class) {
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

    public final void o(cxu0 cxu0Var) {
        this.action_ = cxu0Var.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.playlistUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.trackUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

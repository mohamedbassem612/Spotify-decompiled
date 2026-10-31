package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import p.bf40;
import p.ep01;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedPlaylistDecorationPolicy extends h implements v2j0 {
    private static final RecentlyPlayedPlaylistDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_POLICY_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private PlaylistDecorationPolicy playlistPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedPlaylistDecorationPolicy recentlyPlayedPlaylistDecorationPolicy = new RecentlyPlayedPlaylistDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedPlaylistDecorationPolicy;
        h.registerDefaultInstance(RecentlyPlayedPlaylistDecorationPolicy.class, recentlyPlayedPlaylistDecorationPolicy);
    }

    private RecentlyPlayedPlaylistDecorationPolicy() {
    }

    public static ep01 n() {
        return (ep01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007", new Object[]{"bitField0_", "playlistPolicy_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedPlaylistDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new ep01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedPlaylistDecorationPolicy.class) {
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

    public final void o(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.getClass();
        this.playlistPolicy_ = playlistDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void p() {
        this.timestamp_ = true;
    }

    public final void q() {
        this.type_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

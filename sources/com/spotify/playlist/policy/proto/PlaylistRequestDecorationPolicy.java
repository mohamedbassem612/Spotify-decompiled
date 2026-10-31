package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hru0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequestDecorationPolicy extends h implements v2j0 {
    private static final PlaylistRequestDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 3;
    public static final int ITEM_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private PlaylistEpisodeDecorationPolicy episode_;
    private PlaylistItemDecorationPolicy item_;
    private PlaylistDecorationPolicy playlist_;
    private PlaylistTrackDecorationPolicy track_;

    static {
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = new PlaylistRequestDecorationPolicy();
        DEFAULT_INSTANCE = playlistRequestDecorationPolicy;
        h.registerDefaultInstance(PlaylistRequestDecorationPolicy.class, playlistRequestDecorationPolicy);
    }

    private PlaylistRequestDecorationPolicy() {
    }

    public static PlaylistRequestDecorationPolicy n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static hru0 s() {
        return (hru0) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlaylistRequestDecorationPolicy t(byte[] bArr) {
        return (PlaylistRequestDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "playlist_", "track_", "episode_", "item_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequestDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new hru0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistRequestDecorationPolicy.class) {
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

    public final PlaylistEpisodeDecorationPolicy o() {
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = this.episode_;
        return playlistEpisodeDecorationPolicy == null ? PlaylistEpisodeDecorationPolicy.o() : playlistEpisodeDecorationPolicy;
    }

    public final PlaylistItemDecorationPolicy p() {
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = this.item_;
        return playlistItemDecorationPolicy == null ? PlaylistItemDecorationPolicy.q() : playlistItemDecorationPolicy;
    }

    public final PlaylistDecorationPolicy q() {
        PlaylistDecorationPolicy playlistDecorationPolicy = this.playlist_;
        return playlistDecorationPolicy == null ? PlaylistDecorationPolicy.o() : playlistDecorationPolicy;
    }

    public final PlaylistTrackDecorationPolicy r() {
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = this.track_;
        return playlistTrackDecorationPolicy == null ? PlaylistTrackDecorationPolicy.p() : playlistTrackDecorationPolicy;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        playlistEpisodeDecorationPolicy.getClass();
        this.episode_ = playlistEpisodeDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void v(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistItemDecorationPolicy.getClass();
        this.item_ = playlistItemDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void w(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.getClass();
        this.playlist_ = playlistDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void x(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.getClass();
        this.track_ = playlistTrackDecorationPolicy;
        this.bitField0_ |= 2;
    }
}

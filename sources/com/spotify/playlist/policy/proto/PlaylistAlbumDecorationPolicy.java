package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import p.bf40;
import p.dgu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistAlbumDecorationPolicy extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 1;
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final PlaylistAlbumDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private AlbumDecorationPolicy album_;
    private ArtistDecorationPolicy artist_;
    private int bitField0_;

    static {
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = new PlaylistAlbumDecorationPolicy();
        DEFAULT_INSTANCE = playlistAlbumDecorationPolicy;
        h.registerDefaultInstance(PlaylistAlbumDecorationPolicy.class, playlistAlbumDecorationPolicy);
    }

    private PlaylistAlbumDecorationPolicy() {
    }

    public static PlaylistAlbumDecorationPolicy o() {
        return DEFAULT_INSTANCE;
    }

    public static dgu0 p() {
        return (dgu0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "album_", "artist_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistAlbumDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new dgu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistAlbumDecorationPolicy.class) {
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

    public final AlbumDecorationPolicy n() {
        AlbumDecorationPolicy albumDecorationPolicy = this.album_;
        return albumDecorationPolicy == null ? AlbumDecorationPolicy.getDefaultInstance() : albumDecorationPolicy;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(AlbumDecorationPolicy albumDecorationPolicy) {
        albumDecorationPolicy.getClass();
        this.album_ = albumDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

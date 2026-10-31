package com.spotify.profile.profile.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistlistResponse$PlaylistList extends h implements v2j0 {
    private static final PlaylistlistResponse$PlaylistList DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 1;
    public static final int TOTAL_PUBLIC_PLAYLISTS_COUNT_FIELD_NUMBER = 2;
    private h290 playlists_ = h.emptyProtobufList();
    private int totalPublicPlaylistsCount_;

    static {
        PlaylistlistResponse$PlaylistList playlistlistResponse$PlaylistList = new PlaylistlistResponse$PlaylistList();
        DEFAULT_INSTANCE = playlistlistResponse$PlaylistList;
        h.registerDefaultInstance(PlaylistlistResponse$PlaylistList.class, playlistlistResponse$PlaylistList);
    }

    private PlaylistlistResponse$PlaylistList() {
    }

    public static PlaylistlistResponse$PlaylistList n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"playlists_", PlaylistlistResponse$Playlist.class, "totalPublicPlaylistsCount_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistlistResponse$PlaylistList();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (PlaylistlistResponse$PlaylistList.class) {
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

    public final h290 o() {
        return this.playlists_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecentlyPlayedContext extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTIST_FIELD_NUMBER = 1;
    public static final int COLLECTION_TRACKS_FIELD_NUMBER = 7;
    private static final RecentlyPlayedContext DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 6;
    public static final int PROFILE_FIELD_NUMBER = 5;
    public static final int SHOW_FIELD_NUMBER = 4;
    public static final int TRACK_FIELD_NUMBER = 3;
    private int contextCase_ = 0;
    private Object context_;

    static {
        RecentlyPlayedContext recentlyPlayedContext = new RecentlyPlayedContext();
        DEFAULT_INSTANCE = recentlyPlayedContext;
        h.registerDefaultInstance(RecentlyPlayedContext.class, recentlyPlayedContext);
    }

    private RecentlyPlayedContext() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"context_", "contextCase_", RecentlyPlayedArtist.class, RecentlyPlayedAlbum.class, RecentlyPlayedTrack.class, RecentlyPlayedShow.class, RecentlyPlayedProfile.class, RecentlyPlayedPlaylist.class, RecentlyPlayedCollectionTracks.class, RecentlyPlayedEpisode.class});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedContext();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (RecentlyPlayedContext.class) {
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

    public final boolean hasAlbum() {
        return this.contextCase_ == 2;
    }

    public final boolean hasArtist() {
        return this.contextCase_ == 1;
    }

    public final boolean hasPlaylist() {
        return this.contextCase_ == 6;
    }

    public final boolean hasProfile() {
        return this.contextCase_ == 5;
    }

    public final boolean hasShow() {
        return this.contextCase_ == 4;
    }

    public final RecentlyPlayedAlbum n() {
        return this.contextCase_ == 2 ? (RecentlyPlayedAlbum) this.context_ : RecentlyPlayedAlbum.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RecentlyPlayedArtist o() {
        return this.contextCase_ == 1 ? (RecentlyPlayedArtist) this.context_ : RecentlyPlayedArtist.o();
    }

    public final RecentlyPlayedCollectionTracks p() {
        return this.contextCase_ == 7 ? (RecentlyPlayedCollectionTracks) this.context_ : RecentlyPlayedCollectionTracks.n();
    }

    public final RecentlyPlayedEpisode q() {
        return this.contextCase_ == 8 ? (RecentlyPlayedEpisode) this.context_ : RecentlyPlayedEpisode.n();
    }

    public final RecentlyPlayedPlaylist r() {
        return this.contextCase_ == 6 ? (RecentlyPlayedPlaylist) this.context_ : RecentlyPlayedPlaylist.n();
    }

    public final RecentlyPlayedProfile s() {
        return this.contextCase_ == 5 ? (RecentlyPlayedProfile) this.context_ : RecentlyPlayedProfile.n();
    }

    public final RecentlyPlayedShow t() {
        return this.contextCase_ == 4 ? (RecentlyPlayedShow) this.context_ : RecentlyPlayedShow.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final RecentlyPlayedTrack u() {
        return this.contextCase_ == 3 ? (RecentlyPlayedTrack) this.context_ : RecentlyPlayedTrack.n();
    }

    public final boolean v() {
        return this.contextCase_ == 7;
    }

    public final boolean w() {
        return this.contextCase_ == 8;
    }
}

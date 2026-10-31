package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jp40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetRecentlyPlayedRequest extends h implements v2j0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 13;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 12;
    public static final int COLLECTION_TRACKS_POLICY_FIELD_NUMBER = 17;
    private static final GetRecentlyPlayedRequest DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 19;
    public static final int EXCLUDE_SHOWS_AUDIO_FIELD_NUMBER = 4;
    public static final int EXCLUDE_SHOWS_MIXED_FIELD_NUMBER = 3;
    public static final int EXCLUDE_SHOWS_VIDEO_FIELD_NUMBER = 5;
    public static final int EXCLUDE_TRACK_CONTEXTS_FIELD_NUMBER = 6;
    public static final int INCLUDE_COLLECTION_SONGS_FIELD_NUMBER = 8;
    public static final int INCLUDE_HIDDEN_FIELD_NUMBER = 7;
    public static final int INCLUDE_OWN_DELETED_PLAYLISTS_FIELD_NUMBER = 10;
    public static final int INCLUDE_PODCAST_SHORTS_FIELD_NUMBER = 11;
    public static final int INCLUDE_YOUR_EPISODES_FIELD_NUMBER = 9;
    public static final int INITIAL_RESPONSE_FROM_CACHE_FIELD_NUMBER = 21;
    public static final int LIMIT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_POLICY_FIELD_NUMBER = 16;
    public static final int PLAYLIST_RESYNC_LIMIT_FIELD_NUMBER = 2;
    public static final int PROFILE_POLICY_FIELD_NUMBER = 18;
    public static final int SHOW_POLICY_FIELD_NUMBER = 15;
    public static final int TRACK_POLICY_FIELD_NUMBER = 14;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 20;
    private RecentlyPlayedAlbumDecorationPolicy albumPolicy_;
    private RecentlyPlayedArtistDecorationPolicy artistPolicy_;
    private int bitField0_;
    private RecentlyPlayedCollectionTracksDecorationPolicy collectionTracksPolicy_;
    private RecentlyPlayedEpisodeDecorationPolicy episodePolicy_;
    private boolean excludeShowsAudio_;
    private boolean excludeShowsMixed_;
    private boolean excludeShowsVideo_;
    private boolean excludeTrackContexts_;
    private boolean includeCollectionSongs_;
    private boolean includeHidden_;
    private boolean includeOwnDeletedPlaylists_;
    private boolean includePodcastShorts_;
    private boolean includeYourEpisodes_;
    private boolean initialResponseFromCache_;
    private int limit_;
    private RecentlyPlayedPlaylistDecorationPolicy playlistPolicy_;
    private int playlistResyncLimit_;
    private RecentlyPlayedProfileDecorationPolicy profilePolicy_;
    private RecentlyPlayedShowDecorationPolicy showPolicy_;
    private RecentlyPlayedTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;

    static {
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = new GetRecentlyPlayedRequest();
        DEFAULT_INSTANCE = getRecentlyPlayedRequest;
        h.registerDefaultInstance(GetRecentlyPlayedRequest.class, getRecentlyPlayedRequest);
    }

    private GetRecentlyPlayedRequest() {
    }

    public static jp40 n() {
        return (jp40) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(boolean z) {
        this.includeYourEpisodes_ = z;
    }

    public final void B() {
        this.limit_ = 15;
    }

    public final void C(RecentlyPlayedPlaylistDecorationPolicy recentlyPlayedPlaylistDecorationPolicy) {
        recentlyPlayedPlaylistDecorationPolicy.getClass();
        this.playlistPolicy_ = recentlyPlayedPlaylistDecorationPolicy;
        this.bitField0_ |= 16;
    }

    public final void D(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        recentlyPlayedProfileDecorationPolicy.getClass();
        this.profilePolicy_ = recentlyPlayedProfileDecorationPolicy;
        this.bitField0_ |= 64;
    }

    public final void E(RecentlyPlayedShowDecorationPolicy recentlyPlayedShowDecorationPolicy) {
        recentlyPlayedShowDecorationPolicy.getClass();
        this.showPolicy_ = recentlyPlayedShowDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void F(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy) {
        recentlyPlayedTrackDecorationPolicy.getClass();
        this.trackPolicy_ = recentlyPlayedTrackDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void G() {
        this.updateThrottling_ = 100;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\fဉ\u0000\rဉ\u0001\u000eဉ\u0002\u000fဉ\u0003\u0010ဉ\u0004\u0011ဉ\u0005\u0012ဉ\u0006\u0013ဉ\u0007\u0014\u000b\u0015\u0007", new Object[]{"bitField0_", "limit_", "playlistResyncLimit_", "excludeShowsMixed_", "excludeShowsAudio_", "excludeShowsVideo_", "excludeTrackContexts_", "includeHidden_", "includeCollectionSongs_", "includeYourEpisodes_", "includeOwnDeletedPlaylists_", "includePodcastShorts_", "artistPolicy_", "albumPolicy_", "trackPolicy_", "showPolicy_", "playlistPolicy_", "collectionTracksPolicy_", "profilePolicy_", "episodePolicy_", "updateThrottling_", "initialResponseFromCache_"});
        }
        if (iOrdinal == 3) {
            return new GetRecentlyPlayedRequest();
        }
        if (iOrdinal == 4) {
            return new jp40(DEFAULT_INSTANCE);
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
        synchronized (GetRecentlyPlayedRequest.class) {
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

    public final void o(RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy) {
        recentlyPlayedAlbumDecorationPolicy.getClass();
        this.albumPolicy_ = recentlyPlayedAlbumDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void p(RecentlyPlayedArtistDecorationPolicy recentlyPlayedArtistDecorationPolicy) {
        recentlyPlayedArtistDecorationPolicy.getClass();
        this.artistPolicy_ = recentlyPlayedArtistDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void q(RecentlyPlayedCollectionTracksDecorationPolicy recentlyPlayedCollectionTracksDecorationPolicy) {
        recentlyPlayedCollectionTracksDecorationPolicy.getClass();
        this.collectionTracksPolicy_ = recentlyPlayedCollectionTracksDecorationPolicy;
        this.bitField0_ |= 32;
    }

    public final void r(RecentlyPlayedEpisodeDecorationPolicy recentlyPlayedEpisodeDecorationPolicy) {
        recentlyPlayedEpisodeDecorationPolicy.getClass();
        this.episodePolicy_ = recentlyPlayedEpisodeDecorationPolicy;
        this.bitField0_ |= 128;
    }

    public final void s(boolean z) {
        this.excludeShowsAudio_ = z;
    }

    public final void t(boolean z) {
        this.excludeShowsMixed_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.excludeShowsVideo_ = z;
    }

    public final void v(boolean z) {
        this.excludeTrackContexts_ = z;
    }

    public final void w(boolean z) {
        this.includeCollectionSongs_ = z;
    }

    public final void x(boolean z) {
        this.includeHidden_ = z;
    }

    public final void y(boolean z) {
        this.includeOwnDeletedPlaylists_ = z;
    }

    public final void z(boolean z) {
        this.includePodcastShorts_ = z;
    }
}

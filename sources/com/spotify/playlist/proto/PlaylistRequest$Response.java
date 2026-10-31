package com.spotify.playlist.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.gz00;
import p.h290;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s2q0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$Response extends h implements v2j0 {
    public static final int AVAILABLE_CONCEPTS_FIELD_NUMBER = 28;
    public static final int AVAILABLE_LANGUAGES_FIELD_NUMBER = 30;
    public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 26;
    public static final int BASE_PERMISSION_FIELD_NUMBER = 23;
    public static final int COLLABORATORS_FIELD_NUMBER = 22;
    public static final int CONTAINS_AUDIO_EPISODES_FIELD_NUMBER = 15;
    public static final int CONTAINS_EPISODES_FIELD_NUMBER = 13;
    public static final int CONTAINS_MUSIC_VIDEOS_FIELD_NUMBER = 31;
    public static final int CONTAINS_SPOTIFY_TRACKS_FIELD_NUMBER = 12;
    public static final int CONTAINS_TRACKS_FIELD_NUMBER = 16;
    public static final int CONTENT_SIGNATURE_FIELD_NUMBER = 29;
    public static final int CREATED_AT_FIELD_NUMBER = 27;
    private static final PlaylistRequest$Response DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int HAS_EXPLICIT_CONTENT_FIELD_NUMBER = 11;
    public static final int IS_ON_DEMAND_IN_FREE_FIELD_NUMBER = 17;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LAST_MODIFICATION_FIELD_NUMBER = 7;
    public static final int LOADING_CONTENTS_FIELD_NUMBER = 6;
    public static final int NUMBER_OF_EPISODES_FIELD_NUMBER = 19;
    public static final int NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER = 25;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 18;
    public static final int NUM_FOLLOWERS_FIELD_NUMBER = 8;
    public static final int ONLY_CONTAINS_EXPLICIT_FIELD_NUMBER = 14;
    public static final int ON_DEMAND_IN_FREE_REASON_FIELD_NUMBER = 21;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABLE_FIELD_NUMBER = 9;
    public static final int PLAYLIST_FIELD_NUMBER = 2;
    public static final int PREFER_LINEAR_PLAYBACK_FIELD_NUMBER = 20;
    public static final int RECOMMENDATIONS_FIELD_NUMBER = 10;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 3;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 4;
    public static final int USER_CAPABILITIES_FIELD_NUMBER = 24;
    private Permission basePermission_;
    private int bitField0_;
    private PlaylistRequest$Collaborators collaborators_;
    private boolean containsAudioEpisodes_;
    private boolean containsEpisodes_;
    private boolean containsMusicVideos_;
    private boolean containsSpotifyTracks_;
    private boolean containsTracks_;
    private Timestamp createdAt_;
    private long duration_;
    private boolean hasExplicitContent_;
    private boolean isOnDemandInFree_;
    private long lastModification_;
    private boolean loadingContents_;
    private int numFollowers_;
    private int numberOfEpisodes_;
    private int numberOfTracks_;
    private int onDemandInFreeReason_;
    private boolean onlyContainsExplicit_;
    private boolean playable_;
    private PlaylistRequest$Playlist playlist_;
    private boolean preferLinearPlayback_;
    private int unfilteredLength_;
    private int unrangedLength_;
    private Capabilities userCapabilities_;
    private h290 item_ = h.emptyProtobufList();
    private h290 recommendations_ = h.emptyProtobufList();
    private h290 numberOfItemsPerLinkType_ = h.emptyProtobufList();
    private h290 availableSignals_ = h.emptyProtobufList();
    private h290 availableConcepts_ = h.emptyProtobufList();
    private String contentSignature_ = "";
    private h290 availableLanguages_ = h.emptyProtobufList();

    static {
        PlaylistRequest$Response playlistRequest$Response = new PlaylistRequest$Response();
        DEFAULT_INSTANCE = playlistRequest$Response;
        h.registerDefaultInstance(PlaylistRequest$Response.class, playlistRequest$Response);
    }

    private PlaylistRequest$Response() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaylistRequest$Response s() {
        return DEFAULT_INSTANCE;
    }

    public final h290 A() {
        return this.numberOfItemsPerLinkType_;
    }

    public final s2q0 B() {
        s2q0 s2q0VarA = s2q0.a(this.onDemandInFreeReason_);
        return s2q0VarA == null ? s2q0.UNKNOWN : s2q0VarA;
    }

    public final PlaylistRequest$Playlist C() {
        PlaylistRequest$Playlist playlistRequest$Playlist = this.playlist_;
        return playlistRequest$Playlist == null ? PlaylistRequest$Playlist.o() : playlistRequest$Playlist;
    }

    public final h290 D() {
        return this.recommendations_;
    }

    public final int E() {
        return this.unfilteredLength_;
    }

    public final int F() {
        return this.unrangedLength_;
    }

    public final Capabilities G() {
        Capabilities capabilities = this.userCapabilities_;
        return capabilities == null ? Capabilities.z() : capabilities;
    }

    public final boolean H() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 16384) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 262144) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0006\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဋ\u0001\u0004ဋ\u0002\u0005ဃ\u0003\u0006ဇ\u0004\u0007ဃ\u0005\bဋ\u0006\tဇ\u0007\n\u001b\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b\u000fဇ\f\u0010ဇ\r\u0011ဇ\u000e\u0012ဋ\u000f\u0013ဋ\u0010\u0014ဇ\u0011\u0015᠌\u0012\u0016ဉ\u0013\u0017ဉ\u0014\u0018ဉ\u0015\u0019\u001b\u001a\u001b\u001bဉ\u0016\u001c\u001b\u001dဈ\u0017\u001e\u001b\u001fဇ\u0018", new Object[]{"bitField0_", "item_", PlaylistRequest$Item.class, "playlist_", "unfilteredLength_", "unrangedLength_", "duration_", "loadingContents_", "lastModification_", "numFollowers_", "playable_", "recommendations_", PlaylistRequest$RecommendationItem.class, "hasExplicitContent_", "containsSpotifyTracks_", "containsEpisodes_", "onlyContainsExplicit_", "containsAudioEpisodes_", "containsTracks_", "isOnDemandInFree_", "numberOfTracks_", "numberOfEpisodes_", "preferLinearPlayback_", "onDemandInFreeReason_", gz00.c, "collaborators_", "basePermission_", "userCapabilities_", "numberOfItemsPerLinkType_", PlaylistRequest$NumberOfItemsForLinkType.class, "availableSignals_", PlaylistRequest$AvailableSignal.class, "createdAt_", "availableConcepts_", PlaylistRequest$AvailableConcepts.class, "contentSignature_", "availableLanguages_", PlaylistRequest$AvailableLanguage.class, "containsMusicVideos_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$Response();
        }
        if (iOrdinal == 4) {
            return new iqu0((byte) 13);
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
        synchronized (PlaylistRequest$Response.class) {
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

    public final List getAvailableSignalsList() {
        return this.availableSignals_;
    }

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getPlayable() {
        return this.playable_;
    }

    public final boolean hasPlayable() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasPlaylist() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.availableConcepts_;
    }

    public final Permission p() {
        Permission permission = this.basePermission_;
        return permission == null ? Permission.o() : permission;
    }

    public final PlaylistRequest$Collaborators q() {
        PlaylistRequest$Collaborators playlistRequest$Collaborators = this.collaborators_;
        return playlistRequest$Collaborators == null ? PlaylistRequest$Collaborators.q() : playlistRequest$Collaborators;
    }

    public final boolean r() {
        return this.containsMusicVideos_;
    }

    public final long t() {
        return this.duration_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.hasExplicitContent_;
    }

    public final boolean v() {
        return this.isOnDemandInFree_;
    }

    public final h290 w() {
        return this.item_;
    }

    public final long x() {
        return this.lastModification_;
    }

    public final boolean y() {
        return this.loadingContents_;
    }

    public final int z() {
        return this.numFollowers_;
    }
}

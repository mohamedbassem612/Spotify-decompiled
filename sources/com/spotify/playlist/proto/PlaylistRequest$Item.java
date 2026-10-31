package com.spotify.playlist.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.EpisodeCollectionState;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeSyncState;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import com.spotify.list_collection.save_source.proto.SaveSource;
import java.util.List;
import p.bf40;
import p.cru0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$Item extends h implements v2j0 {
    public static final int ADDED_BY_FIELD_NUMBER = 3;
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 15;
    public static final int COLLECTION_STATE_FIELD_NUMBER = 20;
    public static final int CURATION_STATE_FIELD_NUMBER = 22;
    private static final PlaylistRequest$Item DEFAULT_INSTANCE;
    public static final int DISPLAY_COVERS_FIELD_NUMBER = 14;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 12;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 10;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 11;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 13;
    public static final int EXTENSION_FIELD_NUMBER = 17;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 9;
    public static final int HEADER_FIELD_FIELD_NUMBER = 1;
    public static final int IS_RECOMMENDATION_FIELD_NUMBER = 16;
    public static final int METADATA_FIELD_NUMBER = 21;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 19;
    private static volatile qzr0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 7;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 24;
    public static final int SHOULD_BE_OBFUSCATED_FIELD_NUMBER = 23;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 5;
    public static final int TRACK_METADATA_FIELD_NUMBER = 4;
    public static final int TRACK_OFFLINE_STATE_FIELD_NUMBER = 6;
    public static final int TRACK_PLAY_STATE_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 18;
    public static final int VIDEO_OFFLINE_STATE_FIELD_NUMBER = 25;
    private int addTime_;
    private User addedBy_;
    private int bitField0_;
    private PlaylistRequest$ItemCollectionState collectionState_;
    private PlaylistRequest$ItemCurationState curationState_;
    private ImageGroup displayCovers_;
    private EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private EpisodeSyncState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private boolean isRecommendation_;
    private PlaylistRequest$ItemMetadata metadata_;
    private PlaylistRequest$ItemOfflineState offlineState_;
    private SaveSource saveSource_;
    private boolean shouldBeObfuscated_;
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private TrackOfflineState trackOfflineState_;
    private TrackPlayState trackPlayState_;
    private PlaylistRequest$ItemOfflineState videoOfflineState_;
    private String headerField_ = "";
    private String rowId_ = "";
    private h290 formatListAttributes_ = h.emptyProtobufList();
    private h290 availableSignals_ = h.emptyProtobufList();
    private h290 extension_ = h.emptyProtobufList();
    private String uri_ = "";

    static {
        PlaylistRequest$Item playlistRequest$Item = new PlaylistRequest$Item();
        DEFAULT_INSTANCE = playlistRequest$Item;
        h.registerDefaultInstance(PlaylistRequest$Item.class, playlistRequest$Item);
    }

    private PlaylistRequest$Item() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final PlaylistRequest$ItemOfflineState A() {
        PlaylistRequest$ItemOfflineState playlistRequest$ItemOfflineState = this.videoOfflineState_;
        return playlistRequest$ItemOfflineState == null ? PlaylistRequest$ItemOfflineState.o() : playlistRequest$ItemOfflineState;
    }

    public final boolean B() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 65536) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဉ\u0007\t\u001b\nဉ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000f\u001b\u0010ဇ\r\u0011\u001b\u0012ဈ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဇ\u0013\u0018ဉ\u0014\u0019ဉ\u0015", new Object[]{"bitField0_", "headerField_", "addTime_", "addedBy_", "trackMetadata_", "trackCollectionState_", "trackOfflineState_", "rowId_", "trackPlayState_", "formatListAttributes_", FormatListAttribute.class, "episodeMetadata_", "episodeOfflineState_", "episodeCollectionState_", "episodePlayState_", "displayCovers_", "availableSignals_", PlaylistRequest$AvailableSignal.class, "isRecommendation_", "extension_", Extension.class, "uri_", "offlineState_", "collectionState_", "metadata_", "curationState_", "shouldBeObfuscated_", "saveSource_", "videoOfflineState_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$Item();
        }
        if (iOrdinal == 4) {
            return new cru0();
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
        synchronized (PlaylistRequest$Item.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final List getExtensionList() {
        return this.extension_;
    }

    public final int getFormatListAttributesCount() {
        return this.formatListAttributes_.size();
    }

    public final List getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public final boolean getIsRecommendation() {
        return this.isRecommendation_;
    }

    public final SaveSource getSaveSource() {
        SaveSource saveSource = this.saveSource_;
        return saveSource == null ? SaveSource.n() : saveSource;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasAddedBy() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasSaveSource() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.addTime_;
    }

    public final User p() {
        User user = this.addedBy_;
        return user == null ? User.o() : user;
    }

    public final PlaylistRequest$ItemCollectionState q() {
        PlaylistRequest$ItemCollectionState playlistRequest$ItemCollectionState = this.collectionState_;
        return playlistRequest$ItemCollectionState == null ? PlaylistRequest$ItemCollectionState.o() : playlistRequest$ItemCollectionState;
    }

    public final PlaylistRequest$ItemCurationState r() {
        PlaylistRequest$ItemCurationState playlistRequest$ItemCurationState = this.curationState_;
        return playlistRequest$ItemCurationState == null ? PlaylistRequest$ItemCurationState.o() : playlistRequest$ItemCurationState;
    }

    public final EpisodeMetadata s() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    public final EpisodePlayState t() {
        EpisodePlayState episodePlayState = this.episodePlayState_;
        return episodePlayState == null ? EpisodePlayState.getDefaultInstance() : episodePlayState;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final PlaylistRequest$ItemMetadata u() {
        PlaylistRequest$ItemMetadata playlistRequest$ItemMetadata = this.metadata_;
        return playlistRequest$ItemMetadata == null ? PlaylistRequest$ItemMetadata.o() : playlistRequest$ItemMetadata;
    }

    public final PlaylistRequest$ItemOfflineState v() {
        PlaylistRequest$ItemOfflineState playlistRequest$ItemOfflineState = this.offlineState_;
        return playlistRequest$ItemOfflineState == null ? PlaylistRequest$ItemOfflineState.o() : playlistRequest$ItemOfflineState;
    }

    public final String w() {
        return this.rowId_;
    }

    public final boolean x() {
        return this.shouldBeObfuscated_;
    }

    public final TrackMetadata y() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    public final TrackPlayState z() {
        TrackPlayState trackPlayState = this.trackPlayState_;
        return trackPlayState == null ? TrackPlayState.getDefaultInstance() : trackPlayState;
    }
}

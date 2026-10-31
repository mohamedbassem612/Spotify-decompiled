package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.TrackCollectionState;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import com.spotify.cosmos.util.proto.TrackSyncState;
import p.bf40;
import p.h290;
import p.j7h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionTrack extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    public static final int ALBUM_FIELD_NUMBER = 8;
    public static final int ARTIST_COLLECTION_STATE_FIELD_NUMBER = 11;
    public static final int COVER_FIELD_NUMBER = 9;
    public static final int DECORATED_FIELD_NUMBER = 7;
    private static final CollectionTrack DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int LINK_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 4;
    public static final int TRACK_METADATA_FIELD_NUMBER = 3;
    public static final int TRACK_PLAY_STATE_FIELD_NUMBER = 5;
    public static final int TRACK_SYNC_STATE_FIELD_NUMBER = 6;
    private int addTime_;
    private CollectionAlbum album_;
    private int bitField0_;
    private boolean decorated_;
    private int index_;
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private TrackPlayState trackPlayState_;
    private TrackSyncState trackSyncState_;
    private String cover_ = "";
    private String link_ = "";
    private h290 artistCollectionState_ = h.emptyProtobufList();

    static {
        CollectionTrack collectionTrack = new CollectionTrack();
        DEFAULT_INSTANCE = collectionTrack;
        h.registerDefaultInstance(CollectionTrack.class, collectionTrack);
    }

    private CollectionTrack() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CollectionTrack q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007\u0007\bဉ\u0004\tȈ\nȈ\u000b\u001b", new Object[]{"bitField0_", "index_", "addTime_", "trackMetadata_", "trackCollectionState_", "trackPlayState_", "trackSyncState_", "decorated_", "album_", "cover_", "link_", "artistCollectionState_", ArtistCollectionState.class});
        }
        if (iOrdinal == 3) {
            return new CollectionTrack();
        }
        if (iOrdinal == 4) {
            return new j7h();
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
        synchronized (CollectionTrack.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CollectionAlbum o() {
        CollectionAlbum collectionAlbum = this.album_;
        return collectionAlbum == null ? CollectionAlbum.r() : collectionAlbum;
    }

    public final h290 p() {
        return this.artistCollectionState_;
    }

    public final TrackCollectionState r() {
        TrackCollectionState trackCollectionState = this.trackCollectionState_;
        return trackCollectionState == null ? TrackCollectionState.getDefaultInstance() : trackCollectionState;
    }

    public final TrackMetadata s() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    public final TrackPlayState t() {
        TrackPlayState trackPlayState = this.trackPlayState_;
        return trackPlayState == null ? TrackPlayState.getDefaultInstance() : trackPlayState;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final TrackSyncState u() {
        TrackSyncState trackSyncState = this.trackSyncState_;
        return trackSyncState == null ? TrackSyncState.getDefaultInstance() : trackSyncState;
    }
}

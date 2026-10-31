package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import p.bf40;
import p.jf40;
import p.k7h;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionTrackDecorationPolicy extends h implements v2j0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 5;
    public static final int ARTIST_COLLECTION_POLICY_FIELD_NUMBER = 8;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 6;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    public static final int DECORATED_FIELD_NUMBER = 7;
    private static final CollectionTrackDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    public static final int TRACK_POLICY_FIELD_NUMBER = 3;
    private CollectionAlbumDecorationPolicy albumPolicy_;
    private ArtistCollectionDecorationPolicy artistCollectionPolicy_;
    private ArtistDecorationPolicy artistPolicy_;
    private int bitField0_;
    private TrackCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private TrackPlayedStateDecorationPolicy playedStatePolicy_;
    private TrackSyncDecorationPolicy syncPolicy_;
    private TrackDecorationPolicy trackPolicy_;

    static {
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = new CollectionTrackDecorationPolicy();
        DEFAULT_INSTANCE = collectionTrackDecorationPolicy;
        h.registerDefaultInstance(CollectionTrackDecorationPolicy.class, collectionTrackDecorationPolicy);
    }

    private CollectionTrackDecorationPolicy() {
    }

    public static k7h n() {
        return (k7h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u0007\bဉ\u0006", new Object[]{"bitField0_", "collectionPolicy_", "syncPolicy_", "trackPolicy_", "playedStatePolicy_", "albumPolicy_", "artistPolicy_", "decorated_", "artistCollectionPolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionTrackDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new k7h(DEFAULT_INSTANCE);
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
        synchronized (CollectionTrackDecorationPolicy.class) {
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

    public final void o(CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy) {
        this.albumPolicy_ = collectionAlbumDecorationPolicy;
        this.bitField0_ |= 16;
    }

    public final void p(ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy) {
        artistCollectionDecorationPolicy.getClass();
        this.artistCollectionPolicy_ = artistCollectionDecorationPolicy;
        this.bitField0_ |= 64;
    }

    public final void q(ArtistDecorationPolicy artistDecorationPolicy) {
        artistDecorationPolicy.getClass();
        this.artistPolicy_ = artistDecorationPolicy;
        this.bitField0_ |= 32;
    }

    public final void r(TrackCollectionDecorationPolicy trackCollectionDecorationPolicy) {
        trackCollectionDecorationPolicy.getClass();
        this.collectionPolicy_ = trackCollectionDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void s(TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicy) {
        trackPlayedStateDecorationPolicy.getClass();
        this.playedStatePolicy_ = trackPlayedStateDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void t(TrackSyncDecorationPolicy trackSyncDecorationPolicy) {
        this.syncPolicy_ = trackSyncDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(TrackDecorationPolicy trackDecorationPolicy) {
        trackDecorationPolicy.getClass();
        this.trackPolicy_ = trackDecorationPolicy;
        this.bitField0_ |= 4;
    }
}

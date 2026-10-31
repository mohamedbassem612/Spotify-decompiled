package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.EpisodeCollectionState;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeSyncState;
import p.bf40;
import p.j3h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionEpisode extends h implements v2j0 {
    private static final CollectionEpisode DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 5;
    private int bitField0_;
    private EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private EpisodeSyncState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private String link_ = "";
    private CollectionShow show_;

    static {
        CollectionEpisode collectionEpisode = new CollectionEpisode();
        DEFAULT_INSTANCE = collectionEpisode;
        h.registerDefaultInstance(CollectionEpisode.class, collectionEpisode);
    }

    private CollectionEpisode() {
    }

    public static CollectionEpisode o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ȉ", new Object[]{"bitField0_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_", "show_", "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionEpisode();
        }
        if (iOrdinal == 4) {
            return new j3h();
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
        synchronized (CollectionEpisode.class) {
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

    public final EpisodeCollectionState p() {
        EpisodeCollectionState episodeCollectionState = this.episodeCollectionState_;
        return episodeCollectionState == null ? EpisodeCollectionState.getDefaultInstance() : episodeCollectionState;
    }

    public final EpisodeMetadata q() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    public final EpisodeSyncState r() {
        EpisodeSyncState episodeSyncState = this.episodeOfflineState_;
        return episodeSyncState == null ? EpisodeSyncState.getDefaultInstance() : episodeSyncState;
    }

    public final EpisodePlayState s() {
        EpisodePlayState episodePlayState = this.episodePlayState_;
        return episodePlayState == null ? EpisodePlayState.getDefaultInstance() : episodePlayState;
    }

    public final CollectionShow t() {
        CollectionShow collectionShow = this.show_;
        return collectionShow == null ? CollectionShow.o() : collectionShow;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

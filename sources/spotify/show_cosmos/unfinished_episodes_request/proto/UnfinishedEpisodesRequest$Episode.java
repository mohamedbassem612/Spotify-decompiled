package spotify.show_cosmos.unfinished_episodes_request.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.thh1;
import p.v2j0;
import spotify.show_cosmos.proto.ShowEpisodeState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UnfinishedEpisodesRequest$Episode extends h implements v2j0 {
    private static final UnfinishedEpisodesRequest$Episode DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ShowEpisodeState.EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private ShowEpisodeState.EpisodeOfflineState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private String link_ = "";

    static {
        UnfinishedEpisodesRequest$Episode unfinishedEpisodesRequest$Episode = new UnfinishedEpisodesRequest$Episode();
        DEFAULT_INSTANCE = unfinishedEpisodesRequest$Episode;
        h.registerDefaultInstance(UnfinishedEpisodesRequest$Episode.class, unfinishedEpisodesRequest$Episode);
    }

    private UnfinishedEpisodesRequest$Episode() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_", "link_"});
        }
        if (iOrdinal == 3) {
            return new UnfinishedEpisodesRequest$Episode();
        }
        if (iOrdinal == 4) {
            return new thh1(DEFAULT_INSTANCE);
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
        synchronized (UnfinishedEpisodesRequest$Episode.class) {
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

    public final ShowEpisodeState.EpisodeCollectionState n() {
        ShowEpisodeState.EpisodeCollectionState episodeCollectionState = this.episodeCollectionState_;
        return episodeCollectionState == null ? ShowEpisodeState.EpisodeCollectionState.n() : episodeCollectionState;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EpisodeMetadata o() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    public final ShowEpisodeState.EpisodeOfflineState p() {
        ShowEpisodeState.EpisodeOfflineState episodeOfflineState = this.episodeOfflineState_;
        return episodeOfflineState == null ? ShowEpisodeState.EpisodeOfflineState.n() : episodeOfflineState;
    }

    public final EpisodePlayState q() {
        EpisodePlayState episodePlayState = this.episodePlayState_;
        return episodePlayState == null ? EpisodePlayState.getDefaultInstance() : episodePlayState;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

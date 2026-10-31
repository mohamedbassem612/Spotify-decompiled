package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import p.bf40;
import p.jf40;
import p.k3h;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionEpisodeDecorationPolicy extends h implements v2j0 {
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 2;
    public static final int DECORATED_FIELD_NUMBER = 6;
    private static final CollectionEpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SHOW_POLICY_FIELD_NUMBER = 5;
    public static final int SYNC_POLICY_FIELD_NUMBER = 3;
    private int bitField0_;
    private EpisodeCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private EpisodeDecorationPolicy episodePolicy_;
    private EpisodePlayedStateDecorationPolicy playedStatePolicy_;
    private CollectionShowDecorationPolicy showPolicy_;
    private EpisodeSyncDecorationPolicy syncPolicy_;

    static {
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = new CollectionEpisodeDecorationPolicy();
        DEFAULT_INSTANCE = collectionEpisodeDecorationPolicy;
        h.registerDefaultInstance(CollectionEpisodeDecorationPolicy.class, collectionEpisodeDecorationPolicy);
    }

    private CollectionEpisodeDecorationPolicy() {
    }

    public static k3h o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\u0007", new Object[]{"bitField0_", "episodePolicy_", "collectionPolicy_", "syncPolicy_", "playedStatePolicy_", "showPolicy_", "decorated_"});
        }
        if (iOrdinal == 3) {
            return new CollectionEpisodeDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new k3h();
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
        synchronized (CollectionEpisodeDecorationPolicy.class) {
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

    public final void p(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        episodeCollectionDecorationPolicy.getClass();
        this.collectionPolicy_ = episodeCollectionDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void q() {
        this.decorated_ = true;
    }

    public final void r(EpisodeDecorationPolicy episodeDecorationPolicy) {
        episodeDecorationPolicy.getClass();
        this.episodePolicy_ = episodeDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void s(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        episodePlayedStateDecorationPolicy.getClass();
        this.playedStatePolicy_ = episodePlayedStateDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void t(CollectionShowDecorationPolicy collectionShowDecorationPolicy) {
        collectionShowDecorationPolicy.getClass();
        this.showPolicy_ = collectionShowDecorationPolicy;
        this.bitField0_ |= 16;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        episodeSyncDecorationPolicy.getClass();
        this.syncPolicy_ = episodeSyncDecorationPolicy;
        this.bitField0_ |= 4;
    }
}

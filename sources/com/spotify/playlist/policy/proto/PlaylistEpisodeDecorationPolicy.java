package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import p.bf40;
import p.jf40;
import p.llu0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistEpisodeDecorationPolicy extends h implements v2j0 {
    public static final int ADDED_BY_FIELD_NUMBER = 8;
    public static final int ADD_TIME_FIELD_NUMBER = 3;
    public static final int COLLECTION_FIELD_NUMBER = 5;
    private static final PlaylistEpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 1;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 4;
    public static final int IS_RECOMMENDATION_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYED_STATE_FIELD_NUMBER = 7;
    public static final int ROW_ID_FIELD_NUMBER = 2;
    public static final int SHOW_FIELD_NUMBER = 9;
    public static final int SIGNALS_FIELD_NUMBER = 10;
    public static final int SYNC_FIELD_NUMBER = 6;
    private boolean addTime_;
    private UserDecorationPolicy addedBy_;
    private int bitField0_;
    private EpisodeCollectionDecorationPolicy collection_;
    private EpisodeDecorationPolicy episode_;
    private boolean formatListAttributes_;
    private boolean isRecommendation_;
    private EpisodePlayedStateDecorationPolicy playedState_;
    private boolean rowId_;
    private ShowDecorationPolicy show_;
    private boolean signals_;
    private EpisodeSyncDecorationPolicy sync_;

    static {
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = new PlaylistEpisodeDecorationPolicy();
        DEFAULT_INSTANCE = playlistEpisodeDecorationPolicy;
        h.registerDefaultInstance(PlaylistEpisodeDecorationPolicy.class, playlistEpisodeDecorationPolicy);
    }

    private PlaylistEpisodeDecorationPolicy() {
    }

    public static PlaylistEpisodeDecorationPolicy o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static llu0 r() {
        return (llu0) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A() {
        this.signals_ = true;
    }

    public final void B(EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        episodeSyncDecorationPolicy.getClass();
        this.sync_ = episodeSyncDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007\u0004\u0007\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\n\u0007\u000b\u0007", new Object[]{"bitField0_", "episode_", "rowId_", "addTime_", "formatListAttributes_", "collection_", "sync_", "playedState_", "addedBy_", "show_", "signals_", "isRecommendation_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistEpisodeDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new llu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistEpisodeDecorationPolicy.class) {
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

    public final EpisodeCollectionDecorationPolicy n() {
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = this.collection_;
        return episodeCollectionDecorationPolicy == null ? EpisodeCollectionDecorationPolicy.getDefaultInstance() : episodeCollectionDecorationPolicy;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EpisodeDecorationPolicy p() {
        EpisodeDecorationPolicy episodeDecorationPolicy = this.episode_;
        return episodeDecorationPolicy == null ? EpisodeDecorationPolicy.getDefaultInstance() : episodeDecorationPolicy;
    }

    public final EpisodeSyncDecorationPolicy q() {
        EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = this.sync_;
        return episodeSyncDecorationPolicy == null ? EpisodeSyncDecorationPolicy.getDefaultInstance() : episodeSyncDecorationPolicy;
    }

    public final void s() {
        this.addTime_ = true;
    }

    public final void t(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.getClass();
        this.addedBy_ = userDecorationPolicy;
        this.bitField0_ |= 16;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        episodeCollectionDecorationPolicy.getClass();
        this.collection_ = episodeCollectionDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void v(EpisodeDecorationPolicy episodeDecorationPolicy) {
        episodeDecorationPolicy.getClass();
        this.episode_ = episodeDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void w() {
        this.formatListAttributes_ = true;
    }

    public final void x(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        episodePlayedStateDecorationPolicy.getClass();
        this.playedState_ = episodePlayedStateDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void y() {
        this.rowId_ = true;
    }

    public final void z(ShowDecorationPolicy showDecorationPolicy) {
        showDecorationPolicy.getClass();
        this.show_ = showDecorationPolicy;
        this.bitField0_ |= 32;
    }
}

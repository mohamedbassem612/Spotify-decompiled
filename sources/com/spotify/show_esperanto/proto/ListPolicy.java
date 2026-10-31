package com.spotify.show_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u0d0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ListPolicy extends h implements v2j0 {
    private static final ListPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_POLICY_FIELD_NUMBER = 2;
    public static final int EPISODE_PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    public static final int EPISODE_SYNC_POLICY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 5;
    public static final int SHOW_POLICY_FIELD_NUMBER = 6;
    private int bitField0_;
    private EpisodeCollectionDecorationPolicy episodeCollectionPolicy_;
    private EpisodePlayedStateDecorationPolicy episodePlayedStatePolicy_;
    private EpisodeDecorationPolicy episodePolicy_;
    private EpisodeSyncDecorationPolicy episodeSyncPolicy_;
    private boolean progress_;
    private HeaderPolicy showPolicy_;

    static {
        ListPolicy listPolicy = new ListPolicy();
        DEFAULT_INSTANCE = listPolicy;
        h.registerDefaultInstance(ListPolicy.class, listPolicy);
    }

    private ListPolicy() {
    }

    public static u0d0 n() {
        return (u0d0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0007\u0006ဉ\u0004", new Object[]{"bitField0_", "episodePolicy_", "episodeCollectionPolicy_", "episodeSyncPolicy_", "episodePlayedStatePolicy_", "progress_", "showPolicy_"});
        }
        if (iOrdinal == 3) {
            return new ListPolicy();
        }
        if (iOrdinal == 4) {
            return new u0d0(DEFAULT_INSTANCE);
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
        synchronized (ListPolicy.class) {
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

    public final void o(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        this.episodeCollectionPolicy_ = episodeCollectionDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void p(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        this.episodePlayedStatePolicy_ = episodePlayedStateDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void q(EpisodeDecorationPolicy episodeDecorationPolicy) {
        this.episodePolicy_ = episodeDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void r(EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        this.episodeSyncPolicy_ = episodeSyncDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void s(HeaderPolicy headerPolicy) {
        this.showPolicy_ = headerPolicy;
        this.bitField0_ |= 16;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

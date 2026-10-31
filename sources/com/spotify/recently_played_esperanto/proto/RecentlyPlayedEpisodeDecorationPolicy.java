package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import p.bf40;
import p.bp01;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedEpisodeDecorationPolicy extends h implements v2j0 {
    private static final RecentlyPlayedEpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SHOW_POLICY_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 6;
    private int bitField0_;
    private RecentlyPlayedEpisodeMetadataDecorationPolicy episodePolicy_;
    private RecentlyPlayedEpisodePlayedStateDecorationPolicy playedStatePolicy_;
    private ShowDecorationPolicy showPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedEpisodeDecorationPolicy recentlyPlayedEpisodeDecorationPolicy = new RecentlyPlayedEpisodeDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedEpisodeDecorationPolicy;
        h.registerDefaultInstance(RecentlyPlayedEpisodeDecorationPolicy.class, recentlyPlayedEpisodeDecorationPolicy);
    }

    private RecentlyPlayedEpisodeDecorationPolicy() {
    }

    public static bp01 n() {
        return (bp01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u0007\u0007\u0007", new Object[]{"bitField0_", "episodePolicy_", "playedStatePolicy_", "showPolicy_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedEpisodeDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new bp01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedEpisodeDecorationPolicy.class) {
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

    public final void o(RecentlyPlayedEpisodeMetadataDecorationPolicy recentlyPlayedEpisodeMetadataDecorationPolicy) {
        recentlyPlayedEpisodeMetadataDecorationPolicy.getClass();
        this.episodePolicy_ = recentlyPlayedEpisodeMetadataDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void p() {
        this.timestamp_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

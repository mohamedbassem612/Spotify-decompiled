package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import p.ap01;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecentlyPlayedEpisode extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 6;
    private static final RecentlyPlayedEpisode DEFAULT_INSTANCE;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_METADATA_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_STR_FIELD_NUMBER = 8;
    private int addTime_;
    private int bitField0_;
    private EpisodeMetadata episodeMetadata_;
    private EpisodePlayState episodePlayState_;
    private ShowMetadata showMetadata_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedEpisode recentlyPlayedEpisode = new RecentlyPlayedEpisode();
        DEFAULT_INSTANCE = recentlyPlayedEpisode;
        h.registerDefaultInstance(RecentlyPlayedEpisode.class, recentlyPlayedEpisode);
    }

    private RecentlyPlayedEpisode() {
    }

    public static RecentlyPlayedEpisode n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0001\u0005\u000b\u0006\u000b\u0007ဉ\u0002\bȈ", new Object[]{"bitField0_", "episodeMetadata_", "episodePlayState_", "type_", "addTime_", "showMetadata_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedEpisode();
        }
        if (iOrdinal == 4) {
            return new ap01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedEpisode.class) {
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

    public final EpisodeMetadata o() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    public final String p() {
        return this.typeStr_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

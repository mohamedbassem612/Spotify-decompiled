package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kp40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetRecentlyPlayedTracksRequest extends h implements v2j0 {
    private static final GetRecentlyPlayedTracksRequest DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 6;
    public static final int INCLUDE_EPISODES_FIELD_NUMBER = 2;
    public static final int INCLUDE_HIDDEN_FIELD_NUMBER = 1;
    public static final int INCLUDE_LOCAL_TRACKS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_POLICY_FIELD_NUMBER = 5;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 4;
    private int bitField0_;
    private RecentlyPlayedEpisodeDecorationPolicy episodePolicy_;
    private boolean includeEpisodes_;
    private boolean includeHidden_;
    private boolean includeLocalTracks_;
    private RecentlyPlayedTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;

    static {
        GetRecentlyPlayedTracksRequest getRecentlyPlayedTracksRequest = new GetRecentlyPlayedTracksRequest();
        DEFAULT_INSTANCE = getRecentlyPlayedTracksRequest;
        h.registerDefaultInstance(GetRecentlyPlayedTracksRequest.class, getRecentlyPlayedTracksRequest);
    }

    private GetRecentlyPlayedTracksRequest() {
    }

    public static kp40 n() {
        return (kp40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u000b\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "includeHidden_", "includeEpisodes_", "includeLocalTracks_", "updateThrottling_", "trackPolicy_", "episodePolicy_"});
        }
        if (iOrdinal == 3) {
            return new GetRecentlyPlayedTracksRequest();
        }
        if (iOrdinal == 4) {
            return new kp40(DEFAULT_INSTANCE);
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
        synchronized (GetRecentlyPlayedTracksRequest.class) {
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

    public final void o(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy) {
        recentlyPlayedTrackDecorationPolicy.getClass();
        this.trackPolicy_ = recentlyPlayedTrackDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

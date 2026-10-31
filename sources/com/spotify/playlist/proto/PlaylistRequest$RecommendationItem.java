package com.spotify.playlist.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import p.bf40;
import p.fru0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$RecommendationItem extends h implements v2j0 {
    private static final PlaylistRequest$RecommendationItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOULD_BE_OBFUSCATED_FIELD_NUMBER = 5;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int TRACK_METADATA_FIELD_NUMBER = 1;
    public static final int TRACK_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int TRACK_PLAY_STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean shouldBeObfuscated_;
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private TrackOfflineState trackOfflineState_;
    private TrackPlayState trackPlayState_;

    static {
        PlaylistRequest$RecommendationItem playlistRequest$RecommendationItem = new PlaylistRequest$RecommendationItem();
        DEFAULT_INSTANCE = playlistRequest$RecommendationItem;
        h.registerDefaultInstance(PlaylistRequest$RecommendationItem.class, playlistRequest$RecommendationItem);
    }

    private PlaylistRequest$RecommendationItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "trackMetadata_", "trackCollectionState_", "trackOfflineState_", "trackPlayState_", "shouldBeObfuscated_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$RecommendationItem();
        }
        if (iOrdinal == 4) {
            return new fru0();
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
        synchronized (PlaylistRequest$RecommendationItem.class) {
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

    public final boolean o() {
        return this.shouldBeObfuscated_;
    }

    public final TrackCollectionState p() {
        TrackCollectionState trackCollectionState = this.trackCollectionState_;
        return trackCollectionState == null ? TrackCollectionState.o() : trackCollectionState;
    }

    public final TrackMetadata q() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    public final TrackOfflineState r() {
        TrackOfflineState trackOfflineState = this.trackOfflineState_;
        return trackOfflineState == null ? TrackOfflineState.o() : trackOfflineState;
    }

    public final TrackPlayState s() {
        TrackPlayState trackPlayState = this.trackPlayState_;
        return trackPlayState == null ? TrackPlayState.getDefaultInstance() : trackPlayState;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

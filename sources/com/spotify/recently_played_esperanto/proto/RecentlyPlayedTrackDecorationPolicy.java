package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vp01;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedTrackDecorationPolicy extends h implements v2j0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 10;
    public static final int ARTISTS_POLICY_FIELD_NUMBER = 9;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    private static final RecentlyPlayedTrackDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    public static final int TRACK_POLICY_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 7;
    private AlbumDecorationPolicy albumPolicy_;
    private ArtistDecorationPolicy artistsPolicy_;
    private int bitField0_;
    private TrackCollectionDecorationPolicy collectionPolicy_;
    private boolean timestamp_;
    private TrackDecorationPolicy trackPolicy_;
    private boolean type_;

    static {
        RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy = new RecentlyPlayedTrackDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedTrackDecorationPolicy;
        h.registerDefaultInstance(RecentlyPlayedTrackDecorationPolicy.class, recentlyPlayedTrackDecorationPolicy);
    }

    private RecentlyPlayedTrackDecorationPolicy() {
    }

    public static vp01 n() {
        return (vp01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0007\u0007\b\u0007\tဉ\u0002\nဉ\u0003", new Object[]{"bitField0_", "collectionPolicy_", "trackPolicy_", "type_", "timestamp_", "artistsPolicy_", "albumPolicy_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedTrackDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new vp01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedTrackDecorationPolicy.class) {
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

    public final void o(AlbumDecorationPolicy albumDecorationPolicy) {
        albumDecorationPolicy.getClass();
        this.albumPolicy_ = albumDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void p(ArtistDecorationPolicy artistDecorationPolicy) {
        artistDecorationPolicy.getClass();
        this.artistsPolicy_ = artistDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void q() {
        this.timestamp_ = true;
    }

    public final void r(TrackDecorationPolicy trackDecorationPolicy) {
        trackDecorationPolicy.getClass();
        this.trackPolicy_ = trackDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void s() {
        this.type_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

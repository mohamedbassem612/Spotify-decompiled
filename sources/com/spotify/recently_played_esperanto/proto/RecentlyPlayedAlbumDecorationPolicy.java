package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import p.bf40;
import p.ho01;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedAlbumDecorationPolicy extends h implements v2j0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 3;
    public static final int ARTISTS_POLICY_FIELD_NUMBER = 9;
    private static final RecentlyPlayedAlbumDecorationPolicy DEFAULT_INSTANCE;
    public static final int IN_COLLECTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 7;
    private AlbumDecorationPolicy albumPolicy_;
    private ArtistDecorationPolicy artistsPolicy_;
    private int bitField0_;
    private boolean inCollection_;
    private AlbumSyncDecorationPolicy syncPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy = new RecentlyPlayedAlbumDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedAlbumDecorationPolicy;
        h.registerDefaultInstance(RecentlyPlayedAlbumDecorationPolicy.class, recentlyPlayedAlbumDecorationPolicy);
    }

    private RecentlyPlayedAlbumDecorationPolicy() {
    }

    public static ho01 n() {
        return (ho01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0007\u0007\b\u0007\tဉ\u0002", new Object[]{"bitField0_", "syncPolicy_", "albumPolicy_", "inCollection_", "type_", "timestamp_", "artistsPolicy_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedAlbumDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new ho01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedAlbumDecorationPolicy.class) {
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
        this.bitField0_ |= 2;
    }

    public final void p(ArtistDecorationPolicy artistDecorationPolicy) {
        artistDecorationPolicy.getClass();
        this.artistsPolicy_ = artistDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void q(AlbumSyncDecorationPolicy albumSyncDecorationPolicy) {
        albumSyncDecorationPolicy.getClass();
        this.syncPolicy_ = albumSyncDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void r() {
        this.timestamp_ = true;
    }

    public final void s() {
        this.type_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

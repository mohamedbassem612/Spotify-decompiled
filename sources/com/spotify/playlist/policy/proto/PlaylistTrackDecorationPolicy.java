package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vwu0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistTrackDecorationPolicy extends h implements v2j0 {
    public static final int ADDED_BY_FIELD_NUMBER = 12;
    public static final int ADD_TIME_FIELD_NUMBER = 3;
    public static final int ALBUM_FIELD_NUMBER = 13;
    public static final int ARTIST_FIELD_NUMBER = 14;
    public static final int CAN_ADD_TO_COLLECTION_FIELD_NUMBER = 5;
    public static final int CAN_BAN_FIELD_NUMBER = 7;
    private static final PlaylistTrackDecorationPolicy DEFAULT_INSTANCE;
    public static final int DISPLAY_COVERS_FIELD_NUMBER = 11;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 10;
    public static final int IN_COLLECTION_FIELD_NUMBER = 4;
    public static final int IS_BANNED_FIELD_NUMBER = 6;
    public static final int IS_RECOMMENDATION_FIELD_NUMBER = 16;
    public static final int LOCAL_FILE_FIELD_NUMBER = 8;
    public static final int OFFLINE_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 15;
    public static final int TRACK_FIELD_NUMBER = 1;
    private boolean addTime_;
    private UserDecorationPolicy addedBy_;
    private PlaylistAlbumDecorationPolicy album_;
    private ArtistDecorationPolicy artist_;
    private int bitField0_;
    private boolean canAddToCollection_;
    private boolean canBan_;
    private boolean displayCovers_;
    private boolean formatListAttributes_;
    private boolean inCollection_;
    private boolean isBanned_;
    private boolean isRecommendation_;
    private boolean localFile_;
    private boolean offline_;
    private boolean rowId_;
    private boolean signals_;
    private TrackDecorationPolicy track_;

    static {
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = new PlaylistTrackDecorationPolicy();
        DEFAULT_INSTANCE = playlistTrackDecorationPolicy;
        h.registerDefaultInstance(PlaylistTrackDecorationPolicy.class, playlistTrackDecorationPolicy);
    }

    private PlaylistTrackDecorationPolicy() {
    }

    public static PlaylistTrackDecorationPolicy p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static vwu0 r() {
        return (vwu0) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A() {
        this.offline_ = true;
    }

    public final void B() {
        this.rowId_ = true;
    }

    public final void C() {
        this.signals_ = true;
    }

    public final void D(TrackDecorationPolicy trackDecorationPolicy) {
        trackDecorationPolicy.getClass();
        this.track_ = trackDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\fဉ\u0001\rဉ\u0002\u000eဉ\u0003\u000f\u0007\u0010\u0007", new Object[]{"bitField0_", "track_", "rowId_", "addTime_", "inCollection_", "canAddToCollection_", "isBanned_", "canBan_", "localFile_", "offline_", "formatListAttributes_", "displayCovers_", "addedBy_", "album_", "artist_", "signals_", "isRecommendation_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistTrackDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new vwu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistTrackDecorationPolicy.class) {
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

    public final boolean getInCollection() {
        return this.inCollection_;
    }

    public final boolean getIsBanned() {
        return this.isBanned_;
    }

    public final boolean getOffline() {
        return this.offline_;
    }

    public final PlaylistAlbumDecorationPolicy n() {
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = this.album_;
        return playlistAlbumDecorationPolicy == null ? PlaylistAlbumDecorationPolicy.o() : playlistAlbumDecorationPolicy;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ArtistDecorationPolicy o() {
        ArtistDecorationPolicy artistDecorationPolicy = this.artist_;
        return artistDecorationPolicy == null ? ArtistDecorationPolicy.getDefaultInstance() : artistDecorationPolicy;
    }

    public final TrackDecorationPolicy q() {
        TrackDecorationPolicy trackDecorationPolicy = this.track_;
        return trackDecorationPolicy == null ? TrackDecorationPolicy.getDefaultInstance() : trackDecorationPolicy;
    }

    public final void s() {
        this.addTime_ = true;
    }

    public final void t(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.getClass();
        this.addedBy_ = userDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy) {
        playlistAlbumDecorationPolicy.getClass();
        this.album_ = playlistAlbumDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void v(ArtistDecorationPolicy artistDecorationPolicy) {
        artistDecorationPolicy.getClass();
        this.artist_ = artistDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void w(boolean z) {
        this.formatListAttributes_ = z;
    }

    public final void x() {
        this.isBanned_ = true;
    }

    public final void y() {
        this.isRecommendation_ = true;
    }

    public final void z() {
        this.localFile_ = true;
    }
}

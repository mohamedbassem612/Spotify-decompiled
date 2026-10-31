package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.AlbumMetadata;
import com.spotify.cosmos.util.proto.AlbumSyncState;
import p.bf40;
import p.go01;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecentlyPlayedAlbum extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 6;
    public static final int ALBUM_METADATA_FIELD_NUMBER = 1;
    public static final int ALBUM_SYNC_STATE_FIELD_NUMBER = 3;
    private static final RecentlyPlayedAlbum DEFAULT_INSTANCE;
    public static final int IN_COLLECTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_STR_FIELD_NUMBER = 7;
    private int addTime_;
    private AlbumMetadata albumMetadata_;
    private AlbumSyncState albumSyncState_;
    private int bitField0_;
    private boolean inCollection_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedAlbum recentlyPlayedAlbum = new RecentlyPlayedAlbum();
        DEFAULT_INSTANCE = recentlyPlayedAlbum;
        h.registerDefaultInstance(RecentlyPlayedAlbum.class, recentlyPlayedAlbum);
    }

    private RecentlyPlayedAlbum() {
    }

    public static RecentlyPlayedAlbum p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005\u000b\u0006\u000b\u0007Ȉ", new Object[]{"bitField0_", "albumMetadata_", "albumSyncState_", "inCollection_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedAlbum();
        }
        if (iOrdinal == 4) {
            return new go01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedAlbum.class) {
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

    public final AlbumMetadata n() {
        AlbumMetadata albumMetadata = this.albumMetadata_;
        return albumMetadata == null ? AlbumMetadata.getDefaultInstance() : albumMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AlbumSyncState o() {
        AlbumSyncState albumSyncState = this.albumSyncState_;
        return albumSyncState == null ? AlbumSyncState.getDefaultInstance() : albumSyncState;
    }

    public final String q() {
        return this.typeStr_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

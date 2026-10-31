package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.ArtistMetadata;
import com.spotify.cosmos.util.proto.ArtistSyncState;
import p.bf40;
import p.io01;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RecentlyPlayedArtist extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 5;
    public static final int ARTIST_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int ARTIST_METADATA_FIELD_NUMBER = 1;
    public static final int ARTIST_SYNC_STATE_FIELD_NUMBER = 3;
    private static final RecentlyPlayedArtist DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_STR_FIELD_NUMBER = 6;
    private int addTime_;
    private ArtistCollectionState artistCollectionState_;
    private ArtistMetadata artistMetadata_;
    private ArtistSyncState artistSyncState_;
    private int bitField0_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedArtist recentlyPlayedArtist = new RecentlyPlayedArtist();
        DEFAULT_INSTANCE = recentlyPlayedArtist;
        h.registerDefaultInstance(RecentlyPlayedArtist.class, recentlyPlayedArtist);
    }

    private RecentlyPlayedArtist() {
    }

    public static RecentlyPlayedArtist o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005\u000b\u0006Ȉ", new Object[]{"bitField0_", "artistMetadata_", "artistCollectionState_", "artistSyncState_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedArtist();
        }
        if (iOrdinal == 4) {
            return new io01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedArtist.class) {
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

    public final ArtistMetadata n() {
        ArtistMetadata artistMetadata = this.artistMetadata_;
        return artistMetadata == null ? ArtistMetadata.getDefaultInstance() : artistMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.typeStr_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

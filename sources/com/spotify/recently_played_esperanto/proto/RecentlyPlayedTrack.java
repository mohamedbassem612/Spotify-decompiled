package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.TrackCollectionState;
import com.spotify.cosmos.util.proto.TrackMetadata;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.up01;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecentlyPlayedTrack extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 6;
    private static final RecentlyPlayedTrack DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int TRACK_METADATA_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_STR_FIELD_NUMBER = 7;
    private int addTime_;
    private int bitField0_;
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedTrack recentlyPlayedTrack = new RecentlyPlayedTrack();
        DEFAULT_INSTANCE = recentlyPlayedTrack;
        h.registerDefaultInstance(RecentlyPlayedTrack.class, recentlyPlayedTrack);
    }

    private RecentlyPlayedTrack() {
    }

    public static RecentlyPlayedTrack n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005\u000b\u0006\u000b\u0007Ȉ", new Object[]{"bitField0_", "trackMetadata_", "trackCollectionState_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedTrack();
        }
        if (iOrdinal == 4) {
            return new up01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedTrack.class) {
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

    public final TrackMetadata o() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    public final String p() {
        return this.typeStr_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

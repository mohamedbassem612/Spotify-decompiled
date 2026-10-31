package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecentlyPlayedCollectionTracks extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 3;
    private static final RecentlyPlayedCollectionTracks DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int TYPE_STR_FIELD_NUMBER = 4;
    private int addTime_;
    private String link_ = "";
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedCollectionTracks recentlyPlayedCollectionTracks = new RecentlyPlayedCollectionTracks();
        DEFAULT_INSTANCE = recentlyPlayedCollectionTracks;
        h.registerDefaultInstance(RecentlyPlayedCollectionTracks.class, recentlyPlayedCollectionTracks);
    }

    private RecentlyPlayedCollectionTracks() {
    }

    public static RecentlyPlayedCollectionTracks n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"link_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedCollectionTracks();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (RecentlyPlayedCollectionTracks.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.typeStr_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

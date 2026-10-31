package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oo01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedCollectionTracksDecorationPolicy extends h implements v2j0 {
    private static final RecentlyPlayedCollectionTracksDecorationPolicy DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private boolean link_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedCollectionTracksDecorationPolicy recentlyPlayedCollectionTracksDecorationPolicy = new RecentlyPlayedCollectionTracksDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedCollectionTracksDecorationPolicy;
        h.registerDefaultInstance(RecentlyPlayedCollectionTracksDecorationPolicy.class, recentlyPlayedCollectionTracksDecorationPolicy);
    }

    private RecentlyPlayedCollectionTracksDecorationPolicy() {
    }

    public static oo01 n() {
        return (oo01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"link_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedCollectionTracksDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new oo01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedCollectionTracksDecorationPolicy.class) {
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

    public final void o() {
        this.link_ = true;
    }

    public final void p() {
        this.timestamp_ = true;
    }

    public final void q() {
        this.type_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

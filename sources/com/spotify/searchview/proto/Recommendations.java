package com.spotify.searchview.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.o111;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Recommendations extends com.google.protobuf.h implements v2j0 {
    private static final Recommendations DEFAULT_INSTANCE;
    public static final int ENTITIES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private h290 entities_ = com.google.protobuf.h.emptyProtobufList();
    private int type_;

    static {
        Recommendations recommendations = new Recommendations();
        DEFAULT_INSTANCE = recommendations;
        com.google.protobuf.h.registerDefaultInstance(Recommendations.class, recommendations);
    }

    private Recommendations() {
    }

    public static Recommendations n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"type_", "entities_", Entity.class});
        }
        if (iOrdinal == 3) {
            return new Recommendations();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (Recommendations.class) {
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

    public final h290 o() {
        return this.entities_;
    }

    public final o111 p() {
        o111 o111Var;
        int i = this.type_;
        if (i == 0) {
            o111Var = o111.RECOMMENDATIONS_TYPE_UNKNOWN;
        } else if (i == 1) {
            o111Var = o111.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST;
        } else if (i == 2) {
            o111Var = o111.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE;
        } else if (i == 3) {
            o111Var = o111.RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY;
        } else if (i != 4) {
            o111Var = i != 6 ? null : o111.RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY;
        } else {
            o111Var = o111.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK;
        }
        return o111Var == null ? o111.UNRECOGNIZED : o111Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

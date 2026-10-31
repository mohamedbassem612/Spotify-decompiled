package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.h290;
import p.jf40;
import p.qdz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeassociationsResponse$Album extends h implements v2j0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 1;
    private static final EpisodeassociationsResponse$Album DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private h290 artistName_ = h.emptyProtobufList();
    private int type_;

    static {
        EpisodeassociationsResponse$Album episodeassociationsResponse$Album = new EpisodeassociationsResponse$Album();
        DEFAULT_INSTANCE = episodeassociationsResponse$Album;
        h.registerDefaultInstance(EpisodeassociationsResponse$Album.class, episodeassociationsResponse$Album);
    }

    private EpisodeassociationsResponse$Album() {
    }

    public static EpisodeassociationsResponse$Album o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"artistName_", "type_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$Album();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (EpisodeassociationsResponse$Album.class) {
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

    public final h290 n() {
        return this.artistName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qdz p() {
        qdz qdzVar;
        int i = this.type_;
        if (i == 0) {
            qdzVar = qdz.ALBUM_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            qdzVar = qdz.ALBUM_TYPE_ALBUM;
        } else if (i != 2) {
            qdzVar = i != 3 ? null : qdz.ALBUM_TYPE_EP;
        } else {
            qdzVar = qdz.ALBUM_TYPE_SINGLE;
        }
        return qdzVar == null ? qdz.UNRECOGNIZED : qdzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

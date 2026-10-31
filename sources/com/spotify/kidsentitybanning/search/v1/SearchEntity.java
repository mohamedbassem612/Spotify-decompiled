package com.spotify.kidsentitybanning.search.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SearchEntity extends h implements v2j0 {
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final SearchEntity DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 1;
    private int entityCase_ = 0;
    private Object entity_;

    static {
        SearchEntity searchEntity = new SearchEntity();
        DEFAULT_INSTANCE = searchEntity;
        h.registerDefaultInstance(SearchEntity.class, searchEntity);
    }

    private SearchEntity() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"entity_", "entityCase_", TrackEntity.class, ArtistEntity.class});
        }
        if (iOrdinal == 3) {
            return new SearchEntity();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (SearchEntity.class) {
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

    public final ArtistEntity n() {
        return this.entityCase_ == 2 ? (ArtistEntity) this.entity_ : ArtistEntity.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.entityCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final TrackEntity p() {
        return this.entityCase_ == 1 ? (TrackEntity) this.entity_ : TrackEntity.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

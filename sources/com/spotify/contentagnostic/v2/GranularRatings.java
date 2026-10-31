package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class GranularRatings extends h implements v2j0 {
    private static final GranularRatings DEFAULT_INSTANCE;
    public static final int FIVE_STARS_FIELD_NUMBER = 5;
    public static final int FOUR_STARS_FIELD_NUMBER = 4;
    public static final int ONE_STAR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int THREE_STARS_FIELD_NUMBER = 3;
    public static final int TWO_STARS_FIELD_NUMBER = 2;
    private long fiveStars_;
    private long fourStars_;
    private long oneStar_;
    private long threeStars_;
    private long twoStars_;

    static {
        GranularRatings granularRatings = new GranularRatings();
        DEFAULT_INSTANCE = granularRatings;
        h.registerDefaultInstance(GranularRatings.class, granularRatings);
    }

    private GranularRatings() {
    }

    public static GranularRatings o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002", new Object[]{"oneStar_", "twoStars_", "threeStars_", "fourStars_", "fiveStars_"});
        }
        if (iOrdinal == 3) {
            return new GranularRatings();
        }
        if (iOrdinal == 4) {
            return new ir40((byte) 19);
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
        synchronized (GranularRatings.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long p() {
        return this.fiveStars_;
    }

    public final long q() {
        return this.fourStars_;
    }

    public final long r() {
        return this.oneStar_;
    }

    public final long s() {
        return this.threeStars_;
    }

    public final long t() {
        return this.twoStars_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

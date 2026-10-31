package com.spotify.extendedmetadata.extensions.podcastratingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jf8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AverageRating extends h implements v2j0 {
    public static final int AVERAGE_FIELD_NUMBER = 1;
    private static final AverageRating DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_AVERAGE_FIELD_NUMBER = 3;
    public static final int TOTAL_RATINGS_FIELD_NUMBER = 2;
    private double average_;
    private boolean showAverage_;
    private long totalRatings_;

    static {
        AverageRating averageRating = new AverageRating();
        DEFAULT_INSTANCE = averageRating;
        h.registerDefaultInstance(AverageRating.class, averageRating);
    }

    private AverageRating() {
    }

    public static AverageRating o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0002\u0003\u0007", new Object[]{"average_", "totalRatings_", "showAverage_"});
        }
        if (iOrdinal == 3) {
            return new AverageRating();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (AverageRating.class) {
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

    public final double n() {
        return this.average_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.showAverage_;
    }

    public final long q() {
        return this.totalRatings_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Rating extends h implements v2j0 {
    public static final int AVERAGE_FIELD_NUMBER = 1;
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final Rating DEFAULT_INSTANCE;
    public static final int GRANULAR_RATINGS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private double average_;
    private int bitField0_;
    private long count_;
    private GranularRatings granularRatings_;

    static {
        Rating rating = new Rating();
        DEFAULT_INSTANCE = rating;
        h.registerDefaultInstance(Rating.class, rating);
    }

    private Rating() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Rating q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0002\u0003ဉ\u0000", new Object[]{"bitField0_", "average_", "count_", "granularRatings_"});
        }
        if (iOrdinal == 3) {
            return new Rating();
        }
        if (iOrdinal == 4) {
            return new s3z0();
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
        synchronized (Rating.class) {
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

    public final double o() {
        return this.average_;
    }

    public final long p() {
        return this.count_;
    }

    public final GranularRatings r() {
        GranularRatings granularRatings = this.granularRatings_;
        return granularRatings == null ? GranularRatings.o() : granularRatings;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

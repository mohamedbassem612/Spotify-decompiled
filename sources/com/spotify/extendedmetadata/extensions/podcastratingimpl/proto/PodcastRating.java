package com.spotify.extendedmetadata.extensions.podcastratingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PodcastRating extends h implements v2j0 {
    public static final int AVERAGE_RATING_FIELD_NUMBER = 1;
    public static final int CAN_RATE_FIELD_NUMBER = 3;
    private static final PodcastRating DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 2;
    private AverageRating averageRating_;
    private int bitField0_;
    private boolean canRate_;
    private Rating rating_;

    static {
        PodcastRating podcastRating = new PodcastRating();
        DEFAULT_INSTANCE = podcastRating;
        h.registerDefaultInstance(PodcastRating.class, podcastRating);
    }

    private PodcastRating() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PodcastRating q(byte[] bArr) {
        return (PodcastRating) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007", new Object[]{"bitField0_", "averageRating_", "rating_", "canRate_"});
        }
        if (iOrdinal == 3) {
            return new PodcastRating();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (PodcastRating.class) {
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

    public final AverageRating n() {
        AverageRating averageRating = this.averageRating_;
        return averageRating == null ? AverageRating.o() : averageRating;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canRate_;
    }

    public final Rating p() {
        Rating rating = this.rating_;
        return rating == null ? Rating.n() : rating;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

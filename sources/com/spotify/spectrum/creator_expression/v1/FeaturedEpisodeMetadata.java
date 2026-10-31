package com.spotify.spectrum.creator_expression.v1;

import com.google.protobuf.h;
import p.ao10;
import p.bf40;
import p.fs00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FeaturedEpisodeMetadata extends h implements v2j0 {
    private static final FeaturedEpisodeMetadata DEFAULT_INSTANCE;
    public static final int FEATURED_EPISODE_URI_FIELD_NUMBER = 2;
    public static final int FEATURE_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int featureType_;
    private String featuredEpisodeUri_ = "";

    static {
        FeaturedEpisodeMetadata featuredEpisodeMetadata = new FeaturedEpisodeMetadata();
        DEFAULT_INSTANCE = featuredEpisodeMetadata;
        h.registerDefaultInstance(FeaturedEpisodeMetadata.class, featuredEpisodeMetadata);
    }

    private FeaturedEpisodeMetadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static FeaturedEpisodeMetadata q(byte[] bArr) {
        return (FeaturedEpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"featureType_", "featuredEpisodeUri_"});
        }
        if (iOrdinal == 3) {
            return new FeaturedEpisodeMetadata();
        }
        if (iOrdinal == 4) {
            return new fs00((byte) 13);
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
        synchronized (FeaturedEpisodeMetadata.class) {
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

    public final ao10 o() {
        ao10 ao10Var = this.featureType_ != 0 ? null : ao10.BEST_PLACE_TO_START;
        return ao10Var == null ? ao10.UNRECOGNIZED : ao10Var;
    }

    public final String p() {
        return this.featuredEpisodeUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

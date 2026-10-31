package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum GiphyAgeRating implements v190 {
    GIPHY_RATING_UNSPECIFIED(0),
    GIPHY_RATING_Y(1),
    GIPHY_RATING_G(2),
    GIPHY_RATING_PG(3),
    GIPHY_RATING_PG13(4),
    GIPHY_RATING_R(5),
    UNRECOGNIZED(-1);

    public static final int GIPHY_RATING_G_VALUE = 2;
    public static final int GIPHY_RATING_PG13_VALUE = 4;
    public static final int GIPHY_RATING_PG_VALUE = 3;
    public static final int GIPHY_RATING_R_VALUE = 5;
    public static final int GIPHY_RATING_UNSPECIFIED_VALUE = 0;
    public static final int GIPHY_RATING_Y_VALUE = 1;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.GiphyAgeRating.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public GiphyAgeRating m337findValueByNumber(int i) {
            return GiphyAgeRating.forNumber(i);
        }
    };
    private final int value;

    public static final class GiphyAgeRatingVerifier implements z190 {
        static final z190 INSTANCE = new GiphyAgeRatingVerifier();

        private GiphyAgeRatingVerifier() {
        }

        public boolean isInRange(int i) {
            return GiphyAgeRating.forNumber(i) != null;
        }
    }

    GiphyAgeRating(int i) {
        this.value = i;
    }

    public static GiphyAgeRating forNumber(int i) {
        if (i == 0) {
            return GIPHY_RATING_UNSPECIFIED;
        }
        if (i == 1) {
            return GIPHY_RATING_Y;
        }
        if (i == 2) {
            return GIPHY_RATING_G;
        }
        if (i == 3) {
            return GIPHY_RATING_PG;
        }
        if (i == 4) {
            return GIPHY_RATING_PG13;
        }
        if (i != 5) {
            return null;
        }
        return GIPHY_RATING_R;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return GiphyAgeRatingVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static GiphyAgeRating valueOf(int i) {
        return forNumber(i);
    }
}

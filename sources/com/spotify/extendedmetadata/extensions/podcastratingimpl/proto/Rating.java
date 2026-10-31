package com.spotify.extendedmetadata.extensions.podcastratingimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Rating extends h implements v2j0 {
    private static final Rating DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RATED_AT_FIELD_NUMBER = 4;
    public static final int RATING_FIELD_NUMBER = 3;
    public static final int SHOW_URI_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp ratedAt_;
    private int rating_;
    private String userId_ = "";
    private String showUri_ = "";

    static {
        Rating rating = new Rating();
        DEFAULT_INSTANCE = rating;
        h.registerDefaultInstance(Rating.class, rating);
    }

    private Rating() {
    }

    public static Rating n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004ဉ\u0000", new Object[]{"bitField0_", "userId_", "showUri_", "rating_", "ratedAt_"});
        }
        if (iOrdinal == 3) {
            return new Rating();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 13);
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.rating_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

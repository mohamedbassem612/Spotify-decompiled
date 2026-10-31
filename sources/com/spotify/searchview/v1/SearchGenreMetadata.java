package com.spotify.searchview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s351;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SearchGenreMetadata extends h implements v2j0 {
    private static final SearchGenreMetadata DEFAULT_INSTANCE;
    public static final int GATING_DECISION_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SPOTIFY_BRANDED_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private GatingDecision gatingDecision_;
    private boolean spotifyBranded_;
    private int type_;
    private String name_ = "";
    private String imageUrl_ = "";

    static {
        SearchGenreMetadata searchGenreMetadata = new SearchGenreMetadata();
        DEFAULT_INSTANCE = searchGenreMetadata;
        h.registerDefaultInstance(SearchGenreMetadata.class, searchGenreMetadata);
    }

    private SearchGenreMetadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SearchGenreMetadata r(byte[] bArr) {
        return (SearchGenreMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0007\u0005ဉ\u0000", new Object[]{"bitField0_", "name_", "imageUrl_", "type_", "spotifyBranded_", "gatingDecision_"});
        }
        if (iOrdinal == 3) {
            return new SearchGenreMetadata();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (SearchGenreMetadata.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getName() {
        return this.name_;
    }

    public final GatingDecision n() {
        GatingDecision gatingDecision = this.gatingDecision_;
        return gatingDecision == null ? GatingDecision.n() : gatingDecision;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.spotifyBranded_;
    }

    public final s351 p() {
        s351 s351Var;
        int i = this.type_;
        if (i == 0) {
            s351Var = s351.b;
        } else if (i != 1) {
            s351Var = i != 2 ? null : s351.d;
        } else {
            s351Var = s351.c;
        }
        return s351Var == null ? s351.e : s351Var;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

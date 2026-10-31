package com.spotify.watchfeed.component.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.d47;
import p.db6;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Artwork extends h implements v2j0 {
    public static final int ARTWORK_TYPE_FIELD_NUMBER = 2;
    private static final Artwork DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int artworkType_;
    private String uri_ = "";

    static {
        Artwork artwork = new Artwork();
        DEFAULT_INSTANCE = artwork;
        h.registerDefaultInstance(Artwork.class, artwork);
    }

    private Artwork() {
    }

    public static Artwork o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"uri_", "artworkType_"});
        }
        if (iOrdinal == 3) {
            return new Artwork();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (Artwork.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final d47 n() {
        d47 d47Var;
        int i = this.artworkType_;
        if (i == 0) {
            d47Var = d47.DEFAULT;
        } else if (i == 1) {
            d47Var = d47.ARTIST;
        } else if (i != 2) {
            d47Var = i != 3 ? null : d47.USER;
        } else {
            d47Var = d47.SHOW;
        }
        return d47Var == null ? d47.UNRECOGNIZED : d47Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

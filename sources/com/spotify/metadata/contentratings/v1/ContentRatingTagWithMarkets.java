package com.spotify.metadata.contentratings.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ContentRatingTagWithMarkets extends h implements v2j0 {
    private static final ContentRatingTagWithMarkets DEFAULT_INSTANCE;
    public static final int MARKETS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 1;
    private h290 markets_ = h.emptyProtobufList();
    private int tag_;

    static {
        ContentRatingTagWithMarkets contentRatingTagWithMarkets = new ContentRatingTagWithMarkets();
        DEFAULT_INSTANCE = contentRatingTagWithMarkets;
        h.registerDefaultInstance(ContentRatingTagWithMarkets.class, contentRatingTagWithMarkets);
    }

    private ContentRatingTagWithMarkets() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"tag_", "markets_"});
        }
        if (iOrdinal == 3) {
            return new ContentRatingTagWithMarkets();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (ContentRatingTagWithMarkets.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

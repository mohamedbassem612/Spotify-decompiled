package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sua;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ContentRatingTags extends h implements v2j0 {
    private static final ContentRatingTags DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 1;
    private static final c290 tags_converter_ = new sua((byte) 3);
    private int tagsMemoizedSerializedSize;
    private b290 tags_ = h.emptyIntList();

    static {
        ContentRatingTags contentRatingTags = new ContentRatingTags();
        DEFAULT_INSTANCE = contentRatingTags;
        h.registerDefaultInstance(ContentRatingTags.class, contentRatingTags);
    }

    private ContentRatingTags() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"tags_"});
        }
        if (iOrdinal == 3) {
            return new ContentRatingTags();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ContentRatingTags.class) {
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

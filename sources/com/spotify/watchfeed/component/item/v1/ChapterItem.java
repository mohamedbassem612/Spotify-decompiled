package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ChapterItem extends com.google.protobuf.h implements v2j0 {
    private static final ChapterItem DEFAULT_INSTANCE;
    public static final int DURATION_TEXT_FIELD_NUMBER = 3;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int FEED_ITEM_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String entityUri_ = "";
    private String title_ = "";
    private String durationText_ = "";
    private String feedItemId_ = "";

    static {
        ChapterItem chapterItem = new ChapterItem();
        DEFAULT_INSTANCE = chapterItem;
        com.google.protobuf.h.registerDefaultInstance(ChapterItem.class, chapterItem);
    }

    private ChapterItem() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"entityUri_", "title_", "durationText_", "feedItemId_"});
        }
        if (iOrdinal == 3) {
            return new ChapterItem();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ChapterItem.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.durationText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.feedItemId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

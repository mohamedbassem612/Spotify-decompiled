package com.spotify.searchview.proto;

import p.bf40;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SectionItem extends com.google.protobuf.h implements v2j0 {
    public static final int CHAT_STARTER_ITEM_FIELD_NUMBER = 6;
    private static final SectionItem DEFAULT_INSTANCE;
    public static final int DISCOVERY_FEED_ITEM_FIELD_NUMBER = 3;
    public static final int GENERIC_ITEM_FIELD_NUMBER = 2;
    public static final int INSTANT_MIX_ITEM_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RELATED_SEARCH_ITEM_FIELD_NUMBER = 5;
    public static final int VIDEO_CAROUSEL_ITEM_FIELD_NUMBER = 1;
    private int itemCase_ = 0;
    private Object item_;

    static {
        SectionItem sectionItem = new SectionItem();
        DEFAULT_INSTANCE = sectionItem;
        com.google.protobuf.h.registerDefaultInstance(SectionItem.class, sectionItem);
    }

    private SectionItem() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"item_", "itemCase_", VideoCarouselItem.class, GenericItem.class, DiscoveryFeedItem.class, InstantMixItem.class, RelatedSearchItem.class, ConversationStarterItem.class});
        }
        if (iOrdinal == 3) {
            return new SectionItem();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (SectionItem.class) {
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

    public final ConversationStarterItem n() {
        return this.itemCase_ == 6 ? (ConversationStarterItem) this.item_ : ConversationStarterItem.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final GenericItem o() {
        return this.itemCase_ == 2 ? (GenericItem) this.item_ : GenericItem.n();
    }

    public final InstantMixItem p() {
        return this.itemCase_ == 4 ? (InstantMixItem) this.item_ : InstantMixItem.n();
    }

    public final int q() {
        switch (this.itemCase_) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public final RelatedSearchItem r() {
        return this.itemCase_ == 5 ? (RelatedSearchItem) this.item_ : RelatedSearchItem.n();
    }

    public final VideoCarouselItem s() {
        return this.itemCase_ == 1 ? (VideoCarouselItem) this.item_ : VideoCarouselItem.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

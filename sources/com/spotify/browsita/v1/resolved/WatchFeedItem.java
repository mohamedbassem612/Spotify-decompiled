package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import com.spotify.browsita.v1.resolved.watchfeed.DecoratedEntrypointMetadata;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class WatchFeedItem extends h implements v2j0 {
    private static final WatchFeedItem DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int WATCH_FEED_ITEM_METADATA_FIELD_NUMBER = 3;
    private int bitField0_;
    private DecoratedEntrypointMetadata entrypoint_;
    private Item item_;
    private WatchFeedItemMetadata watchFeedItemMetadata_;

    static {
        WatchFeedItem watchFeedItem = new WatchFeedItem();
        DEFAULT_INSTANCE = watchFeedItem;
        h.registerDefaultInstance(WatchFeedItem.class, watchFeedItem);
    }

    private WatchFeedItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "item_", "entrypoint_", "watchFeedItemMetadata_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedItem();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (WatchFeedItem.class) {
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

    public final DecoratedEntrypointMetadata n() {
        DecoratedEntrypointMetadata decoratedEntrypointMetadata = this.entrypoint_;
        return decoratedEntrypointMetadata == null ? DecoratedEntrypointMetadata.r() : decoratedEntrypointMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Item o() {
        Item item = this.item_;
        return item == null ? Item.n() : item;
    }

    public final WatchFeedItemMetadata p() {
        WatchFeedItemMetadata watchFeedItemMetadata = this.watchFeedItemMetadata_;
        return watchFeedItemMetadata == null ? WatchFeedItemMetadata.o() : watchFeedItemMetadata;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class WatchFeed extends h implements v2j0 {
    private static final WatchFeed DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Heading heading_;
    private h290 items_ = h.emptyProtobufList();

    static {
        WatchFeed watchFeed = new WatchFeed();
        DEFAULT_INSTANCE = watchFeed;
        h.registerDefaultInstance(WatchFeed.class, watchFeed);
    }

    private WatchFeed() {
    }

    public static WatchFeed n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "heading_", "items_", WatchFeedItem.class});
        }
        if (iOrdinal == 3) {
            return new WatchFeed();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (WatchFeed.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Heading o() {
        Heading heading = this.heading_;
        return heading == null ? Heading.n() : heading;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

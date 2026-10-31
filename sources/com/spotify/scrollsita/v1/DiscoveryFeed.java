package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DiscoveryFeed extends h implements v2j0 {
    private static final DiscoveryFeed DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Heading heading_;
    private h290 items_ = h.emptyProtobufList();

    static {
        DiscoveryFeed discoveryFeed = new DiscoveryFeed();
        DEFAULT_INSTANCE = discoveryFeed;
        h.registerDefaultInstance(DiscoveryFeed.class, discoveryFeed);
    }

    private DiscoveryFeed() {
    }

    public static DiscoveryFeed n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "heading_", "items_", DiscoveryFeedItem.class});
        }
        if (iOrdinal == 3) {
            return new DiscoveryFeed();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (DiscoveryFeed.class) {
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

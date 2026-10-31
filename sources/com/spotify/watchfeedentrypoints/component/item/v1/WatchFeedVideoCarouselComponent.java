package com.spotify.watchfeedentrypoints.component.item.v1;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.ixk1;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class WatchFeedVideoCarouselComponent extends h implements v2j0 {
    private static final WatchFeedVideoCarouselComponent DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private h290 items_ = h.emptyProtobufList();

    static {
        WatchFeedVideoCarouselComponent watchFeedVideoCarouselComponent = new WatchFeedVideoCarouselComponent();
        DEFAULT_INSTANCE = watchFeedVideoCarouselComponent;
        h.registerDefaultInstance(WatchFeedVideoCarouselComponent.class, watchFeedVideoCarouselComponent);
    }

    private WatchFeedVideoCarouselComponent() {
    }

    public static WatchFeedVideoCarouselComponent n(phc phcVar) {
        return (WatchFeedVideoCarouselComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"title_", "items_", Any.class});
        }
        if (iOrdinal == 3) {
            return new WatchFeedVideoCarouselComponent();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (WatchFeedVideoCarouselComponent.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

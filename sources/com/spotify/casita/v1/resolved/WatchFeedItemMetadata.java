package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class WatchFeedItemMetadata extends h implements v2j0 {
    public static final int DECISION_ID_FIELD_NUMBER = 1;
    private static final WatchFeedItemMetadata DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 3;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String decisionId_ = "";
    private String navigationUri_ = "";
    private String firstItemUri_ = "";

    static {
        WatchFeedItemMetadata watchFeedItemMetadata = new WatchFeedItemMetadata();
        DEFAULT_INSTANCE = watchFeedItemMetadata;
        h.registerDefaultInstance(WatchFeedItemMetadata.class, watchFeedItemMetadata);
    }

    private WatchFeedItemMetadata() {
    }

    public static WatchFeedItemMetadata p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"decisionId_", "navigationUri_", "firstItemUri_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedItemMetadata();
        }
        if (iOrdinal == 4) {
            return new ixk1((byte) 8);
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
        synchronized (WatchFeedItemMetadata.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.decisionId_;
    }

    public final String q() {
        return this.firstItemUri_;
    }

    public final String r() {
        return this.navigationUri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

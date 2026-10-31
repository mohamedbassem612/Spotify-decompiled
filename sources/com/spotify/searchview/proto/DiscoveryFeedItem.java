package com.spotify.searchview.proto;

import p.bf40;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class DiscoveryFeedItem extends com.google.protobuf.h implements v2j0 {
    private static final DiscoveryFeedItem DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 6;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int THUMBNAILURI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEOURI_FIELD_NUMBER = 4;
    private String uri_ = "";
    private String title_ = "";
    private String thumbnailUri_ = "";
    private String videoUri_ = "";
    private String navigationUri_ = "";
    private String firstItemUri_ = "";

    static {
        DiscoveryFeedItem discoveryFeedItem = new DiscoveryFeedItem();
        DEFAULT_INSTANCE = discoveryFeedItem;
        com.google.protobuf.h.registerDefaultInstance(DiscoveryFeedItem.class, discoveryFeedItem);
    }

    private DiscoveryFeedItem() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"uri_", "title_", "thumbnailUri_", "videoUri_", "navigationUri_", "firstItemUri_"});
        }
        if (iOrdinal == 3) {
            return new DiscoveryFeedItem();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (DiscoveryFeedItem.class) {
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

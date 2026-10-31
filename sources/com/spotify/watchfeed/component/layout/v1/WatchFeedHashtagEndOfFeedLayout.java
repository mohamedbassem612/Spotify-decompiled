package com.spotify.watchfeed.component.layout.v1;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.HeaderOverrides;
import p.bf40;
import p.h290;
import p.ixk1;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WatchFeedHashtagEndOfFeedLayout extends h implements v2j0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final WatchFeedHashtagEndOfFeedLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 8;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 7;
    public static final int HIDE_HEADER_FIELD_NUMBER = 4;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    public static final int OVERLAYS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_OVERLAYS_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 5;
    private int bitField0_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private String itemId_ = "";
    private h290 overlays_ = h.emptyProtobufList();
    private String uri_ = "";
    private h290 topOverlays_ = h.emptyProtobufList();
    private String headerTitleOverride_ = "";

    static {
        WatchFeedHashtagEndOfFeedLayout watchFeedHashtagEndOfFeedLayout = new WatchFeedHashtagEndOfFeedLayout();
        DEFAULT_INSTANCE = watchFeedHashtagEndOfFeedLayout;
        h.registerDefaultInstance(WatchFeedHashtagEndOfFeedLayout.class, watchFeedHashtagEndOfFeedLayout);
    }

    private WatchFeedHashtagEndOfFeedLayout() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WatchFeedHashtagEndOfFeedLayout s(phc phcVar) {
        return (WatchFeedHashtagEndOfFeedLayout) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004\u0007\u0005Ȉ\u0006\u001b\u0007Ȉ\bဉ\u0001", new Object[]{"bitField0_", "itemId_", "overlays_", Any.class, "content_", "hideHeader_", "uri_", "topOverlays_", Any.class, "headerTitleOverride_", "headerOverrides_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedHashtagEndOfFeedLayout();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (WatchFeedHashtagEndOfFeedLayout.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final Any n() {
        Any any = this.content_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HeaderOverrides o() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.o() : headerOverrides;
    }

    public final h290 p() {
        return this.overlays_;
    }

    public final h290 q() {
        return this.topOverlays_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.watchfeed.component.layout.v1.proto;

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
public final class WatchFeedTwoColumnsLayout extends h implements v2j0 {
    public static final int ACTION_OVERLAYS_FIELD_NUMBER = 5;
    public static final int BOTTOM_CONTAINER_OVERLAYS_FIELD_NUMBER = 6;
    public static final int CONFIGURATION_FIELD_NUMBER = 750;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final WatchFeedTwoColumnsLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 10;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 9;
    public static final int HIDE_HEADER_FIELD_NUMBER = 7;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    public static final int MAIN_CONTENT_OVERLAYS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SEPARATED_BOTTOM_CONTAINER_OVERLAYS_FIELD_NUMBER = 11;
    public static final int TOP_CONTAINER_OVERLAYS_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 8;
    private int bitField0_;
    private Any configuration_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private String itemId_ = "";
    private h290 topContainerOverlays_ = h.emptyProtobufList();
    private h290 mainContentOverlays_ = h.emptyProtobufList();
    private h290 actionOverlays_ = h.emptyProtobufList();
    private h290 bottomContainerOverlays_ = h.emptyProtobufList();
    private String uri_ = "";
    private String headerTitleOverride_ = "";
    private h290 separatedBottomContainerOverlays_ = h.emptyProtobufList();

    static {
        WatchFeedTwoColumnsLayout watchFeedTwoColumnsLayout = new WatchFeedTwoColumnsLayout();
        DEFAULT_INSTANCE = watchFeedTwoColumnsLayout;
        h.registerDefaultInstance(WatchFeedTwoColumnsLayout.class, watchFeedTwoColumnsLayout);
    }

    private WatchFeedTwoColumnsLayout() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WatchFeedTwoColumnsLayout w(phc phcVar) {
        return (WatchFeedTwoColumnsLayout) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001ˮ\f\u0000\u0005\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u0007\bȈ\tȈ\nဉ\u0001\u000b\u001bˮဉ\u0002", new Object[]{"bitField0_", "itemId_", "content_", "topContainerOverlays_", Any.class, "mainContentOverlays_", Any.class, "actionOverlays_", Any.class, "bottomContainerOverlays_", Any.class, "hideHeader_", "uri_", "headerTitleOverride_", "headerOverrides_", "separatedBottomContainerOverlays_", Any.class, "configuration_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedTwoColumnsLayout();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (WatchFeedTwoColumnsLayout.class) {
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

    public final h290 n() {
        return this.actionOverlays_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.bottomContainerOverlays_;
    }

    public final Any p() {
        Any any = this.content_;
        return any == null ? Any.o() : any;
    }

    public final HeaderOverrides q() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.o() : headerOverrides;
    }

    public final String r() {
        return this.itemId_;
    }

    public final h290 s() {
        return this.mainContentOverlays_;
    }

    public final h290 t() {
        return this.separatedBottomContainerOverlays_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.topContainerOverlays_;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }
}

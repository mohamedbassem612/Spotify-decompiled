package com.spotify.widgets.recommendationswidget.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m9p0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class NpvRecommendationsWidgetViewBound extends h implements v2j0 {
    public static final int BOUND_VIEW_FIELD_NUMBER = 1;
    private static final NpvRecommendationsWidgetViewBound DEFAULT_INSTANCE;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int WIDGET_CATEGORY_FIELD_NUMBER = 6;
    public static final int WIDGET_HEIGHT_FIELD_NUMBER = 5;
    public static final int WIDGET_SIZE_LAYOUT_FIELD_NUMBER = 3;
    public static final int WIDGET_WIDTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private int widgetHeight_;
    private int widgetWidth_;
    private String boundView_ = "";
    private String mediaType_ = "";
    private String widgetSizeLayout_ = "";
    private String widgetCategory_ = "";

    static {
        NpvRecommendationsWidgetViewBound npvRecommendationsWidgetViewBound = new NpvRecommendationsWidgetViewBound();
        DEFAULT_INSTANCE = npvRecommendationsWidgetViewBound;
        h.registerDefaultInstance(NpvRecommendationsWidgetViewBound.class, npvRecommendationsWidgetViewBound);
    }

    private NpvRecommendationsWidgetViewBound() {
    }

    public static m9p0 n() {
        return (m9p0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "boundView_", "mediaType_", "widgetSizeLayout_", "widgetWidth_", "widgetHeight_", "widgetCategory_"});
        }
        if (iOrdinal == 3) {
            return new NpvRecommendationsWidgetViewBound();
        }
        if (iOrdinal == 4) {
            return new m9p0(DEFAULT_INSTANCE);
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
        synchronized (NpvRecommendationsWidgetViewBound.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.boundView_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mediaType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.widgetCategory_ = str;
    }

    public final void r(int i) {
        this.bitField0_ |= 16;
        this.widgetHeight_ = i;
    }

    public final void s() {
        this.bitField0_ |= 4;
        this.widgetSizeLayout_ = "glance";
    }

    public final void t(int i) {
        this.bitField0_ |= 8;
        this.widgetWidth_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

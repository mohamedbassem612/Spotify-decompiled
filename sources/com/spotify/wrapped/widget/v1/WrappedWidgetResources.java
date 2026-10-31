package com.spotify.wrapped.widget.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class WrappedWidgetResources extends h implements v2j0 {
    private static final WrappedWidgetResources DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_SONGS_PLAYLIST_COVER_URL_FIELD_NUMBER = 14;
    public static final int WIDGET_BG_ECHO_URL_FIELD_NUMBER = 22;
    public static final int WIDGET_BG_GRAIN_URL_FIELD_NUMBER = 21;
    public static final int WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER = 23;
    public static final int WIDGET_BG_WIFI_URL_FIELD_NUMBER = 20;
    public static final int WIDGET_CTA_FIELD_NUMBER = 19;
    public static final int WIDGET_DISMISS_ACCESSIBILITY_FIELD_NUMBER = 24;
    public static final int WIDGET_HEADER_LARGE_FIELD_NUMBER = 15;
    public static final int WIDGET_HEADER_PLAYLIST_FIELD_NUMBER = 18;
    public static final int WIDGET_HEADER_SMALL_FIELD_NUMBER = 17;
    public static final int WIDGET_SM_WIFI_URL_FIELD_NUMBER = 25;
    public static final int WIDGET_SUBHEAD_LARGE_FIELD_NUMBER = 16;
    private String topSongsPlaylistCoverUrl_ = "";
    private String widgetHeaderLarge_ = "";
    private String widgetSubheadLarge_ = "";
    private String widgetHeaderSmall_ = "";
    private String widgetHeaderPlaylist_ = "";
    private String widgetCta_ = "";
    private String widgetBgWifiUrl_ = "";
    private String widgetBgGrainUrl_ = "";
    private String widgetBgEchoUrl_ = "";
    private String widgetBgLosslessUrl_ = "";
    private String widgetDismissAccessibility_ = "";
    private String widgetSmWifiUrl_ = "";

    static {
        WrappedWidgetResources wrappedWidgetResources = new WrappedWidgetResources();
        DEFAULT_INSTANCE = wrappedWidgetResources;
        h.registerDefaultInstance(WrappedWidgetResources.class, wrappedWidgetResources);
    }

    private WrappedWidgetResources() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u000e\u0019\f\u0000\u0000\u0000\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019Ȉ", new Object[]{"topSongsPlaylistCoverUrl_", "widgetHeaderLarge_", "widgetSubheadLarge_", "widgetHeaderSmall_", "widgetHeaderPlaylist_", "widgetCta_", "widgetBgWifiUrl_", "widgetBgGrainUrl_", "widgetBgEchoUrl_", "widgetBgLosslessUrl_", "widgetDismissAccessibility_", "widgetSmWifiUrl_"});
        }
        if (iOrdinal == 3) {
            return new WrappedWidgetResources();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (WrappedWidgetResources.class) {
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

    public final String n() {
        return this.topSongsPlaylistCoverUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.widgetBgEchoUrl_;
    }

    public final String p() {
        return this.widgetBgGrainUrl_;
    }

    public final String q() {
        return this.widgetBgLosslessUrl_;
    }

    public final String r() {
        return this.widgetBgWifiUrl_;
    }

    public final String s() {
        return this.widgetCta_;
    }

    public final String t() {
        return this.widgetDismissAccessibility_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.widgetHeaderLarge_;
    }

    public final String v() {
        return this.widgetHeaderPlaylist_;
    }

    public final String w() {
        return this.widgetHeaderSmall_;
    }

    public final String x() {
        return this.widgetSmWifiUrl_;
    }

    public final String y() {
        return this.widgetSubheadLarge_;
    }
}

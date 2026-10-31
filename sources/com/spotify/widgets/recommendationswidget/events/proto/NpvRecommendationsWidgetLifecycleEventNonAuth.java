package com.spotify.widgets.recommendationswidget.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.k9p0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class NpvRecommendationsWidgetLifecycleEventNonAuth extends h implements v2j0 {
    private static final NpvRecommendationsWidgetLifecycleEventNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int IS_SYSTEM_LAUNCHER_FIELD_NUMBER = 8;
    public static final int LAUNCHER_NAME_FIELD_NUMBER = 6;
    public static final int LAUNCHER_PACKAGE_FIELD_NUMBER = 5;
    public static final int LAUNCHER_VERSION_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 4;
    public static final int WIDGET_CATEGORY_FIELD_NUMBER = 3;
    public static final int WIDGET_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isSystemLauncher_;
    private long widgetId_;
    private String eventType_ = "";
    private String widgetCategory_ = "";
    private String spotifyId_ = "";
    private String launcherPackage_ = "";
    private String launcherName_ = "";
    private String launcherVersion_ = "";

    static {
        NpvRecommendationsWidgetLifecycleEventNonAuth npvRecommendationsWidgetLifecycleEventNonAuth = new NpvRecommendationsWidgetLifecycleEventNonAuth();
        DEFAULT_INSTANCE = npvRecommendationsWidgetLifecycleEventNonAuth;
        h.registerDefaultInstance(NpvRecommendationsWidgetLifecycleEventNonAuth.class, npvRecommendationsWidgetLifecycleEventNonAuth);
    }

    private NpvRecommendationsWidgetLifecycleEventNonAuth() {
    }

    public static k9p0 n() {
        return (k9p0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"bitField0_", "eventType_", "widgetId_", "widgetCategory_", "spotifyId_", "launcherPackage_", "launcherName_", "launcherVersion_", "isSystemLauncher_"});
        }
        if (iOrdinal == 3) {
            return new NpvRecommendationsWidgetLifecycleEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new k9p0(DEFAULT_INSTANCE);
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
        synchronized (NpvRecommendationsWidgetLifecycleEventNonAuth.class) {
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
        this.eventType_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.launcherName_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 16;
        this.launcherPackage_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.launcherVersion_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.spotifyId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.widgetCategory_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 2;
        this.widgetId_ = j;
    }
}

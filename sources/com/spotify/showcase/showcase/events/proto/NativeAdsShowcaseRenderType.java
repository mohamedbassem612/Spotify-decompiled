package com.spotify.showcase.showcase.events.proto;

import com.google.protobuf.h;
import java.util.Iterator;
import p.a0b;
import p.b290;
import p.bf40;
import p.c290;
import p.cjj0;
import p.i9;
import p.jf40;
import p.nln0;
import p.oln0;
import p.qzr0;
import p.r2j0;
import p.rln0;
import p.s2j0;
import p.sln0;
import p.tln0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class NativeAdsShowcaseRenderType extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int CONTENT_URI_FIELD_NUMBER = 3;
    private static final NativeAdsShowcaseRenderType DEFAULT_INSTANCE;
    public static final int FALLBACK_REASONS_FIELD_NUMBER = 15;
    public static final int FLIGHT_ID_FIELD_NUMBER = 2;
    public static final int HAS_COMPANION_VIDEO_FIELD_NUMBER = 10;
    public static final int IS_MDC_ENABLED_FIELD_NUMBER = 7;
    public static final int IS_SINGLE_RELEASE_FIELD_NUMBER = 9;
    public static final int MUSIC_VIDEO_FALLBACK_REASON_FIELD_NUMBER = 13;
    public static final int MUSIC_VIDEO_TRAIT_RESOLVED_FIELD_NUMBER = 12;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 11;
    public static final int RENDERED_WITH_MDC_FIELD_NUMBER = 8;
    public static final int RENDER_MODE_FIELD_NUMBER = 14;
    public static final int SHOWCASE_TYPE_FIELD_NUMBER = 5;
    public static final int SURFACE_FIELD_NUMBER = 6;
    private static final c290 fallbackReasons_converter_ = new a0b((byte) 17);
    private int bitField0_;
    private boolean hasCompanionVideo_;
    private boolean isMdcEnabled_;
    private boolean isSingleRelease_;
    private int musicVideoFallbackReason_;
    private boolean musicVideoTraitResolved_;
    private int platform_;
    private int renderMode_;
    private boolean renderedWithMdc_;
    private int showcaseType_;
    private int surface_;
    private String adId_ = "";
    private String flightId_ = "";
    private String contentUri_ = "";
    private String navigationUri_ = "";
    private b290 fallbackReasons_ = h.emptyIntList();

    static {
        NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType = new NativeAdsShowcaseRenderType();
        DEFAULT_INSTANCE = nativeAdsShowcaseRenderType;
        h.registerDefaultInstance(NativeAdsShowcaseRenderType.class, nativeAdsShowcaseRenderType);
    }

    private NativeAdsShowcaseRenderType() {
    }

    public static nln0 o() {
        return (nln0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(tln0 tln0Var) {
        this.surface_ = tln0Var.a ? 1 : 0;
        this.bitField0_ |= 32;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000b᠌\n\fဇ\u000b\r᠌\f\u000e᠌\r\u000fࠞ", new Object[]{"bitField0_", "adId_", "flightId_", "contentUri_", "navigationUri_", "showcaseType_", cjj0.i, "surface_", cjj0.j, "isMdcEnabled_", "renderedWithMdc_", "isSingleRelease_", "hasCompanionVideo_", "platform_", cjj0.g, "musicVideoTraitResolved_", "musicVideoFallbackReason_", cjj0.f, "renderMode_", cjj0.h, "fallbackReasons_", cjj0.e});
        }
        if (iOrdinal == 3) {
            return new NativeAdsShowcaseRenderType();
        }
        if (iOrdinal == 4) {
            return new nln0(DEFAULT_INSTANCE);
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
        synchronized (NativeAdsShowcaseRenderType.class) {
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

    public final void n(Iterable iterable) {
        i9 i9Var = this.fallbackReasons_;
        if (!i9Var.a) {
            this.fallbackReasons_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            oln0 oln0Var = (oln0) it.next();
            this.fallbackReasons_.c(oln0Var.a);
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.adId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.contentUri_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.flightId_ = str;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 512;
        this.hasCompanionVideo_ = z;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 64;
        this.isMdcEnabled_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.bitField0_ |= 256;
        this.isSingleRelease_ = z;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.navigationUri_ = str;
    }

    public final void w() {
        this.platform_ = 1;
        this.bitField0_ |= 1024;
    }

    public final void x(rln0 rln0Var) {
        this.renderMode_ = rln0Var.a;
        this.bitField0_ |= 8192;
    }

    public final void y(boolean z) {
        this.bitField0_ |= 128;
        this.renderedWithMdc_ = z;
    }

    public final void z(sln0 sln0Var) {
        this.showcaseType_ = sln0Var.a;
        this.bitField0_ |= 16;
    }
}

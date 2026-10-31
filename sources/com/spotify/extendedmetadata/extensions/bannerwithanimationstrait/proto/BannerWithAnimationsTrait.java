package com.spotify.extendedmetadata.extensions.bannerwithanimationstrait.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class BannerWithAnimationsTrait extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 8;
    public static final int BOTTOM_ANIMATION_FIELD_NUMBER = 14;
    public static final int BOTTOM_ANIMATION_URL_FIELD_NUMBER = 6;
    public static final int CTA_BACKGROUND_COLOR_FIELD_NUMBER = 9;
    public static final int CTA_FOREGROUND_COLOR_FIELD_NUMBER = 10;
    public static final int CTA_TEXT_FIELD_NUMBER = 11;
    private static final BannerWithAnimationsTrait DEFAULT_INSTANCE;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 4;
    public static final int OVERLAY_ANIMATION_FIELD_NUMBER = 15;
    public static final int OVERLAY_ANIMATION_URL_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int STROKE_ANIMATION_FIELD_NUMBER = 16;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TOP_ANIMATION_FIELD_NUMBER = 13;
    public static final int TOP_ANIMATION_URL_FIELD_NUMBER = 5;
    private int bitField0_;
    private RiveAnimation bottomAnimation_;
    private RiveAnimation overlayAnimation_;
    private RiveAnimation strokeAnimation_;
    private RiveAnimation topAnimation_;
    private String title_ = "";
    private String subtitle_ = "";
    private String navigateUri_ = "";
    private String topAnimationUrl_ = "";
    private String bottomAnimationUrl_ = "";
    private String textColor_ = "";
    private String backgroundColor_ = "";
    private String ctaBackgroundColor_ = "";
    private String ctaForegroundColor_ = "";
    private String ctaText_ = "";
    private String overlayAnimationUrl_ = "";

    static {
        BannerWithAnimationsTrait bannerWithAnimationsTrait = new BannerWithAnimationsTrait();
        DEFAULT_INSTANCE = bannerWithAnimationsTrait;
        h.registerDefaultInstance(BannerWithAnimationsTrait.class, bannerWithAnimationsTrait);
    }

    private BannerWithAnimationsTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BannerWithAnimationsTrait z(byte[] bArr) {
        return (BannerWithAnimationsTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003", new Object[]{"bitField0_", "title_", "subtitle_", "navigateUri_", "topAnimationUrl_", "bottomAnimationUrl_", "textColor_", "backgroundColor_", "ctaBackgroundColor_", "ctaForegroundColor_", "ctaText_", "overlayAnimationUrl_", "topAnimation_", "bottomAnimation_", "overlayAnimation_", "strokeAnimation_"});
        }
        if (iOrdinal == 3) {
            return new BannerWithAnimationsTrait();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (BannerWithAnimationsTrait.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation o() {
        RiveAnimation riveAnimation = this.bottomAnimation_;
        return riveAnimation == null ? RiveAnimation.n() : riveAnimation;
    }

    public final String p() {
        return this.ctaBackgroundColor_;
    }

    public final String q() {
        return this.ctaForegroundColor_;
    }

    public final String r() {
        return this.ctaText_;
    }

    public final String s() {
        return this.navigateUri_;
    }

    public final RiveAnimation t() {
        RiveAnimation riveAnimation = this.overlayAnimation_;
        return riveAnimation == null ? RiveAnimation.n() : riveAnimation;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final RiveAnimation u() {
        RiveAnimation riveAnimation = this.strokeAnimation_;
        return riveAnimation == null ? RiveAnimation.n() : riveAnimation;
    }

    public final String v() {
        return this.textColor_;
    }

    public final RiveAnimation w() {
        RiveAnimation riveAnimation = this.topAnimation_;
        return riveAnimation == null ? RiveAnimation.n() : riveAnimation;
    }

    public final boolean x() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 8) != 0;
    }
}

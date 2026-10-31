package com.spotify.extendedmetadata.extensions.promov3trait.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PromoV3Trait extends h implements v2j0 {
    public static final int BACKGROUND_GRADIENT_FIELD_NUMBER = 9;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 5;
    private static final PromoV3Trait DEFAULT_INSTANCE;
    public static final int DISMISS_URI_FIELD_NUMBER = 11;
    public static final int LABEL_FIELD_NUMBER = 3;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_URI_FIELD_NUMBER = 8;
    public static final int STROKE_GRADIENT_FIELD_NUMBER = 10;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_COLOR_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Gradient backgroundGradient_;
    private int bitField0_;
    private Gradient strokeGradient_;
    private String title_ = "";
    private String subtitle_ = "";
    private String label_ = "";
    private String navigateUri_ = "";
    private String backgroundImageUrl_ = "";
    private String logoImageUrl_ = "";
    private String titleColor_ = "";
    private String playbackUri_ = "";
    private String dismissUri_ = "";

    static {
        PromoV3Trait promoV3Trait = new PromoV3Trait();
        DEFAULT_INSTANCE = promoV3Trait;
        h.registerDefaultInstance(PromoV3Trait.class, promoV3Trait);
    }

    private PromoV3Trait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PromoV3Trait w(byte[] bArr) {
        return (PromoV3Trait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0000\nဉ\u0001\u000bȈ", new Object[]{"bitField0_", "title_", "subtitle_", "label_", "navigateUri_", "backgroundImageUrl_", "logoImageUrl_", "titleColor_", "playbackUri_", "backgroundGradient_", "strokeGradient_", "dismissUri_"});
        }
        if (iOrdinal == 3) {
            return new PromoV3Trait();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (PromoV3Trait.class) {
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

    public final Gradient n() {
        Gradient gradient = this.backgroundGradient_;
        return gradient == null ? Gradient.n() : gradient;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundImageUrl_;
    }

    public final String p() {
        return this.dismissUri_;
    }

    public final String q() {
        return this.label_;
    }

    public final String r() {
        return this.logoImageUrl_;
    }

    public final String s() {
        return this.navigateUri_;
    }

    public final String t() {
        return this.playbackUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Gradient u() {
        Gradient gradient = this.strokeGradient_;
        return gradient == null ? Gradient.n() : gradient;
    }

    public final String v() {
        return this.titleColor_;
    }
}

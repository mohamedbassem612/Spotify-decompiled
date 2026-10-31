package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ImageSection extends h implements v2j0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int ASPECT_RATIO_FIELD_NUMBER = 5;
    public static final int CAPTION_FIELD_NUMBER = 3;
    private static final ImageSection DEFAULT_INSTANCE;
    public static final int EXTERNAL_URL_FIELD_NUMBER = 6;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LICENSE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private double aspectRatio_;
    private int bitField0_;
    private String imageUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";
    private String license_ = "";
    private String externalUrl_ = "";

    static {
        ImageSection imageSection = new ImageSection();
        DEFAULT_INSTANCE = imageSection;
        h.registerDefaultInstance(ImageSection.class, imageSection);
    }

    private ImageSection() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ImageSection q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ለ\u0001\u0005က\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "imageUrl_", "altText_", "caption_", "license_", "aspectRatio_", "externalUrl_"});
        }
        if (iOrdinal == 3) {
            return new ImageSection();
        }
        if (iOrdinal == 4) {
            return new np70(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ImageSection.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String n() {
        return this.altText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final double o() {
        return this.aspectRatio_;
    }

    public final String p() {
        return this.caption_;
    }

    public final String r() {
        return this.externalUrl_;
    }

    public final String s() {
        return this.license_;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 2) != 0;
    }
}

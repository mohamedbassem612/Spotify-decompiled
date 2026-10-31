package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class VisualIdentityTrait extends h implements v2j0 {
    public static final int CURATED_COLOR_FIELD_NUMBER = 7;
    private static final VisualIdentityTrait DEFAULT_INSTANCE;
    public static final int NINE_BY_SIXTEEN_COVER_VIDEO_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SIXTEEN_BY_NINE_COVER_IMAGE_FIELD_NUMBER = 2;
    public static final int SQUARE_COVER_IMAGE_FIELD_NUMBER = 1;
    public static final int SQUARE_FULL_BLEED_IMAGE_FIELD_NUMBER = 5;
    public static final int WIDE_FULL_BLEED_IMAGE_FIELD_NUMBER = 6;
    private int bitField0_;
    private ColorSetContrastOptions curatedColor_;
    private Video nineBySixteenCoverVideo_;
    private Image sixteenByNineCoverImage_;
    private Image squareCoverImage_;
    private Image squareFullBleedImage_;
    private Image wideFullBleedImage_;

    static {
        VisualIdentityTrait visualIdentityTrait = new VisualIdentityTrait();
        DEFAULT_INSTANCE = visualIdentityTrait;
        h.registerDefaultInstance(VisualIdentityTrait.class, visualIdentityTrait);
    }

    private VisualIdentityTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VisualIdentityTrait y(byte[] bArr) {
        return (VisualIdentityTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0004\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0005", new Object[]{"bitField0_", "squareCoverImage_", "sixteenByNineCoverImage_", "nineBySixteenCoverVideo_", "squareFullBleedImage_", "wideFullBleedImage_", "curatedColor_"});
        }
        if (iOrdinal == 3) {
            return new VisualIdentityTrait();
        }
        if (iOrdinal == 4) {
            return new ofj1((byte) 19);
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
        synchronized (VisualIdentityTrait.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ColorSetContrastOptions o() {
        ColorSetContrastOptions colorSetContrastOptions = this.curatedColor_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.o() : colorSetContrastOptions;
    }

    public final Video p() {
        Video video = this.nineBySixteenCoverVideo_;
        return video == null ? Video.p() : video;
    }

    public final Image q() {
        Image image = this.sixteenByNineCoverImage_;
        return image == null ? Image.o() : image;
    }

    public final Image r() {
        Image image = this.squareCoverImage_;
        return image == null ? Image.o() : image;
    }

    public final Image s() {
        Image image = this.squareFullBleedImage_;
        return image == null ? Image.o() : image;
    }

    public final Image t() {
        Image image = this.wideFullBleedImage_;
        return image == null ? Image.o() : image;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }
}

package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ColorSetContrastOptions extends h implements v2j0 {
    private static final ColorSetContrastOptions DEFAULT_INSTANCE;
    public static final int ENCORE_BASE_SET_TEXT_COLOR_FIELD_NUMBER = 4;
    public static final int HIGHER_CONTRAST_FIELD_NUMBER = 3;
    public static final int HIGH_CONTRAST_FIELD_NUMBER = 2;
    public static final int MIN_CONTRAST_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private RgbaColor encoreBaseSetTextColor_;
    private ColorSet highContrast_;
    private ColorSet higherContrast_;
    private ColorSet minContrast_;

    static {
        ColorSetContrastOptions colorSetContrastOptions = new ColorSetContrastOptions();
        DEFAULT_INSTANCE = colorSetContrastOptions;
        h.registerDefaultInstance(ColorSetContrastOptions.class, colorSetContrastOptions);
    }

    private ColorSetContrastOptions() {
    }

    public static ColorSetContrastOptions o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "minContrast_", "highContrast_", "higherContrast_", "encoreBaseSetTextColor_"});
        }
        if (iOrdinal == 3) {
            return new ColorSetContrastOptions();
        }
        if (iOrdinal == 4) {
            return new blg((byte) 29);
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
        synchronized (ColorSetContrastOptions.class) {
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

    public final RgbaColor p() {
        RgbaColor rgbaColor = this.encoreBaseSetTextColor_;
        return rgbaColor == null ? RgbaColor.q() : rgbaColor;
    }

    public final ColorSet q() {
        ColorSet colorSet = this.highContrast_;
        return colorSet == null ? ColorSet.q() : colorSet;
    }

    public final ColorSet r() {
        ColorSet colorSet = this.higherContrast_;
        return colorSet == null ? ColorSet.q() : colorSet;
    }

    public final ColorSet s() {
        ColorSet colorSet = this.minContrast_;
        return colorSet == null ? ColorSet.q() : colorSet;
    }

    public final boolean t() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }
}

package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.a8h0;
import p.bf40;
import p.h290;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Image extends h implements v2j0 {
    private static final Image DEFAULT_INSTANCE;
    public static final int EXTRACTED_COLOR_SET_FIELD_NUMBER = 2;
    public static final int INSTANCES_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ColorSetContrastOptions extractedColorSet_;
    private h290 instances_ = h.emptyProtobufList();
    private int mask_;

    static {
        Image image = new Image();
        DEFAULT_INSTANCE = image;
        h.registerDefaultInstance(Image.class, image);
    }

    private Image() {
    }

    public static Image o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"bitField0_", "instances_", ImageInstance.class, "extractedColorSet_", "mask_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new np70((byte) 2);
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
        synchronized (Image.class) {
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

    public final ColorSetContrastOptions p() {
        ColorSetContrastOptions colorSetContrastOptions = this.extractedColorSet_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.o() : colorSetContrastOptions;
    }

    public final h290 q() {
        return this.instances_;
    }

    public final a8h0 r() {
        a8h0 a8h0Var;
        int i = this.mask_;
        if (i != 0) {
            a8h0Var = i != 1 ? null : a8h0.MASK_CIRCULAR;
        } else {
            a8h0Var = a8h0.MASK_UNSPECIFIED;
        }
        return a8h0Var == null ? a8h0.UNRECOGNIZED : a8h0Var;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

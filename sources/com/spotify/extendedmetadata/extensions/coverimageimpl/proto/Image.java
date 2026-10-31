package com.spotify.extendedmetadata.extensions.coverimageimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tz70;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Image extends h implements v2j0 {
    private static final Image DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 1;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private phc fileId_ = phc.b;
    private int height_;
    private int size_;
    private int width_;

    static {
        Image image = new Image();
        DEFAULT_INSTANCE = image;
        h.registerDefaultInstance(Image.class, image);
    }

    private Image() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\f\u0003\u0004\u0004\u0004", new Object[]{"fileId_", "size_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 19);
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final phc n() {
        return this.fileId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final tz70 o() {
        tz70 tz70Var;
        int i = this.size_;
        if (i == 0) {
            tz70Var = tz70.IMAGE_SIZE_UNSPECIFIED;
        } else if (i == 1) {
            tz70Var = tz70.IMAGE_SIZE_DEFAULT;
        } else if (i == 2) {
            tz70Var = tz70.IMAGE_SIZE_SMALL;
        } else if (i != 3) {
            tz70Var = i != 4 ? null : tz70.IMAGE_SIZE_XLARGE;
        } else {
            tz70Var = tz70.IMAGE_SIZE_LARGE;
        }
        return tz70Var == null ? tz70.UNRECOGNIZED : tz70Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

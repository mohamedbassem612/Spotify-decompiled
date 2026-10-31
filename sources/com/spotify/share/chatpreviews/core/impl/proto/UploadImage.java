package com.spotify.share.chatpreviews.core.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ixh1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class UploadImage extends h implements v2j0 {
    private static final UploadImage DEFAULT_INSTANCE;
    public static final int IMAGE_UPLOAD_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int imageCase_ = 0;
    private Object image_;

    static {
        UploadImage uploadImage = new UploadImage();
        DEFAULT_INSTANCE = uploadImage;
        h.registerDefaultInstance(UploadImage.class, uploadImage);
    }

    private UploadImage() {
    }

    public static ixh1 n() {
        return (ixh1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"image_", "imageCase_", ImageBytes.class, Image.class});
        }
        if (iOrdinal == 3) {
            return new UploadImage();
        }
        if (iOrdinal == 4) {
            return new ixh1(DEFAULT_INSTANCE);
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
        synchronized (UploadImage.class) {
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

    public final void o(ImageBytes imageBytes) {
        imageBytes.getClass();
        this.image_ = imageBytes;
        this.imageCase_ = 1;
    }

    public final void p(Image image) {
        image.getClass();
        this.image_ = image;
        this.imageCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

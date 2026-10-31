package com.spotify.speechlessupload.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sw70;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ImageMedia extends h implements v2j0 {
    private static final ImageMedia DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 4;
    public static final int IMAGE_URLS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int THUMBNAIL_FIELD_NUMBER = 3;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private MediaResource thumbnail_;
    private String thumbnailUrl_ = "";
    private h290 imageUrls_ = h.emptyProtobufList();
    private h290 images_ = h.emptyProtobufList();

    static {
        ImageMedia imageMedia = new ImageMedia();
        DEFAULT_INSTANCE = imageMedia;
        h.registerDefaultInstance(ImageMedia.class, imageMedia);
    }

    private ImageMedia() {
    }

    public static sw70 o() {
        return (sw70) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "thumbnailUrl_", "imageUrls_", "thumbnail_", "images_", MediaResource.class});
        }
        if (iOrdinal == 3) {
            return new ImageMedia();
        }
        if (iOrdinal == 4) {
            return new sw70(DEFAULT_INSTANCE);
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
        synchronized (ImageMedia.class) {
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

    public final void n(MediaResource mediaResource) {
        mediaResource.getClass();
        h290 h290VarMutableCopy = this.images_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.images_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(mediaResource);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(MediaResource mediaResource) {
        mediaResource.getClass();
        this.thumbnail_ = mediaResource;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.share.chatpreviews.core.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yvh1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class UploadBackground extends h implements v2j0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final UploadBackground DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private Object format_;
    private int formatCase_ = 0;
    private String aspectRatio_ = "";

    static {
        UploadBackground uploadBackground = new UploadBackground();
        DEFAULT_INSTANCE = uploadBackground;
        h.registerDefaultInstance(UploadBackground.class, uploadBackground);
    }

    private UploadBackground() {
    }

    public static yvh1 n() {
        return (yvh1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"format_", "formatCase_", Color.class, Video.class, UploadImage.class, "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new UploadBackground();
        }
        if (iOrdinal == 4) {
            return new yvh1(DEFAULT_INSTANCE);
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
        synchronized (UploadBackground.class) {
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

    public final void o(String str) {
        this.aspectRatio_ = str;
    }

    public final void p(Color color) {
        this.format_ = color;
        this.formatCase_ = 1;
    }

    public final void q(UploadImage uploadImage) {
        uploadImage.getClass();
        this.format_ = uploadImage;
        this.formatCase_ = 3;
    }

    public final void r(Video video) {
        video.getClass();
        this.format_ = video;
        this.formatCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

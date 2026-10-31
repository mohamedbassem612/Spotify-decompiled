package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ImageAsset extends h implements v2j0 {
    private static final ImageAsset DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 3;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int bitField0_;
    private int height_;
    private int width_;
    private String url_ = "";
    private String logoImageUrl_ = "";

    static {
        ImageAsset imageAsset = new ImageAsset();
        DEFAULT_INSTANCE = imageAsset;
        h.registerDefaultInstance(ImageAsset.class, imageAsset);
    }

    private ImageAsset() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004ለ\u0000", new Object[]{"bitField0_", "width_", "height_", "url_", "logoImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ImageAsset();
        }
        if (iOrdinal == 4) {
            return new np70(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ImageAsset.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final int n() {
        return this.height_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.logoImageUrl_;
    }

    public final int p() {
        return this.width_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

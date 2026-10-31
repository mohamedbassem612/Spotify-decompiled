package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vr70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ImageComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int CAPTION_FIELD_NUMBER = 3;
    public static final int COLOR_EXTRACTION_FIELD_NUMBER = 5;
    private static final ImageComponent DEFAULT_INSTANCE;
    public static final int EXTERNAL_URL_FIELD_NUMBER = 6;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VIEW_MODE_FIELD_NUMBER = 4;
    private int bitField0_;
    private ColorExtraction colorExtraction_;
    private int viewMode_;
    private String imageUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";
    private String externalUrl_ = "";

    static {
        ImageComponent imageComponent = new ImageComponent();
        DEFAULT_INSTANCE = imageComponent;
        com.google.protobuf.h.registerDefaultInstance(ImageComponent.class, imageComponent);
    }

    private ImageComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ImageComponent q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\f\u0005ဉ\u0001\u0006ለ\u0002", new Object[]{"bitField0_", "imageUrl_", "altText_", "caption_", "viewMode_", "colorExtraction_", "externalUrl_"});
        }
        if (iOrdinal == 3) {
            return new ImageComponent();
        }
        if (iOrdinal == 4) {
            return new np70(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (ImageComponent.class) {
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

    public final String o() {
        return this.caption_;
    }

    public final ColorExtraction p() {
        ColorExtraction colorExtraction = this.colorExtraction_;
        return colorExtraction == null ? ColorExtraction.q() : colorExtraction;
    }

    public final String r() {
        return this.externalUrl_;
    }

    public final vr70 s() {
        vr70 vr70Var;
        int i = this.viewMode_;
        if (i == 0) {
            vr70Var = vr70.UNSPECIFIED;
        } else if (i != 1) {
            vr70Var = i != 2 ? null : vr70.FULL_SCREEN;
        } else {
            vr70Var = vr70.ARTWORK;
        }
        return vr70Var == null ? vr70.UNRECOGNIZED : vr70Var;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }
}

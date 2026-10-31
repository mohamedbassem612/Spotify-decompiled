package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class CanvasImage extends h implements v2j0 {
    private static final CanvasImage DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 4;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int height_;
    private Object mediaFile_;
    private int width_;
    private int mediaFileCase_ = 0;
    private String mediaType_ = "";

    static {
        CanvasImage canvasImage = new CanvasImage();
        DEFAULT_INSTANCE = canvasImage;
        h.registerDefaultInstance(CanvasImage.class, canvasImage);
    }

    private CanvasImage() {
    }

    public static CanvasImage n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004Ȼ\u0000", new Object[]{"mediaFile_", "mediaFileCase_", "mediaType_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new CanvasImage();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (CanvasImage.class) {
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
        return this.mediaFileCase_ == 4 ? (String) this.mediaFile_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.height_;
    }

    public final String p() {
        return this.mediaType_;
    }

    public final int q() {
        return this.width_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.pi;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AccessoryImage extends h implements v2j0 {
    private static final AccessoryImage DEFAULT_INSTANCE;
    public static final int IMAGE_STYLE_FIELD_NUMBER = 2;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int imageStyle_;
    private String imageUrl_ = "";

    static {
        AccessoryImage accessoryImage = new AccessoryImage();
        DEFAULT_INSTANCE = accessoryImage;
        h.registerDefaultInstance(AccessoryImage.class, accessoryImage);
    }

    private AccessoryImage() {
    }

    public static AccessoryImage o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"imageUrl_", "imageStyle_"});
        }
        if (iOrdinal == 3) {
            return new AccessoryImage();
        }
        if (iOrdinal == 4) {
            return new j((byte) 4);
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
        synchronized (AccessoryImage.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final pi p() {
        pi piVar;
        int i = this.imageStyle_;
        if (i == 0) {
            piVar = pi.UNKNOWN_IMAGE_STYLE;
        } else if (i == 1) {
            piVar = pi.CIRCLE;
        } else if (i != 2) {
            piVar = i != 3 ? null : pi.FULL_WIDTH;
        } else {
            piVar = pi.SQUARE;
        }
        return piVar == null ? pi.UNRECOGNIZED : piVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

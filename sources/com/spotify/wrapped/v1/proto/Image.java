package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Image extends com.google.protobuf.h implements v2j0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    private static final Image DEFAULT_INSTANCE;
    public static final int OUTLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private Outline outline_;
    private String url_ = "";
    private String altText_ = "";

    static {
        Image image = new Image();
        DEFAULT_INSTANCE = image;
        com.google.protobuf.h.registerDefaultInstance(Image.class, image);
    }

    private Image() {
    }

    public static Image o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "url_", "altText_", "outline_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 29);
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

    public final String getUrl() {
        return this.url_;
    }

    public final String n() {
        return this.altText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Outline p() {
        Outline outline = this.outline_;
        return outline == null ? Outline.o() : outline;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

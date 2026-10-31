package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.kr70;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ImageBytes extends h implements v2j0 {
    private static final ImageBytes DEFAULT_INSTANCE;
    public static final int IMAGE_BYTES_FIELD_NUMBER = 1;
    public static final int MIME_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private phc imageBytes_ = phc.b;
    private String mimeType_ = "";

    static {
        ImageBytes imageBytes = new ImageBytes();
        DEFAULT_INSTANCE = imageBytes;
        h.registerDefaultInstance(ImageBytes.class, imageBytes);
    }

    private ImageBytes() {
    }

    public static kr70 n() {
        return (kr70) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"imageBytes_", "mimeType_"});
        }
        if (iOrdinal == 3) {
            return new ImageBytes();
        }
        if (iOrdinal == 4) {
            return new kr70(DEFAULT_INSTANCE);
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
        synchronized (ImageBytes.class) {
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

    public final void o(hhc hhcVar) {
        this.imageBytes_ = hhcVar;
    }

    public final void p(String str) {
        this.mimeType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

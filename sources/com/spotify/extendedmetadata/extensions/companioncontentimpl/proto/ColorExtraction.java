package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ColorExtraction extends h implements v2j0 {
    public static final int COLOR_DARK_FIELD_NUMBER = 3;
    public static final int COLOR_LIGHT_FIELD_NUMBER = 2;
    public static final int COLOR_RAW_FIELD_NUMBER = 1;
    private static final ColorExtraction DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int colorDark_;
    private int colorLight_;
    private int colorRaw_;

    static {
        ColorExtraction colorExtraction = new ColorExtraction();
        DEFAULT_INSTANCE = colorExtraction;
        h.registerDefaultInstance(ColorExtraction.class, colorExtraction);
    }

    private ColorExtraction() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ColorExtraction q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"colorRaw_", "colorLight_", "colorDark_"});
        }
        if (iOrdinal == 3) {
            return new ColorExtraction();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ColorExtraction.class) {
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

    public final int n() {
        return this.colorDark_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.colorLight_;
    }

    public final int p() {
        return this.colorRaw_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

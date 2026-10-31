package com.spotify.extendedmetadata.extensions.chatsharepreviewimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jf8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Background extends h implements v2j0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final Background DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private Object format_;
    private int formatCase_ = 0;
    private String aspectRatio_ = "";

    static {
        Background background = new Background();
        DEFAULT_INSTANCE = background;
        h.registerDefaultInstance(Background.class, background);
    }

    private Background() {
    }

    public static Background p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"format_", "formatCase_", Color.class, Video.class, Image.class, "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new Background();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Background.class) {
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

    public final String n() {
        return this.aspectRatio_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Color o() {
        return this.formatCase_ == 1 ? (Color) this.format_ : Color.n();
    }

    public final int q() {
        int i = this.formatCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final Image r() {
        return this.formatCase_ == 3 ? (Image) this.format_ : Image.n();
    }

    public final Video s() {
        return this.formatCase_ == 2 ? (Video) this.format_ : Video.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class Companion extends h implements v2j0 {
    public static final int CANVAS_IMAGE_FIELD_NUMBER = 1;
    public static final int CANVAS_VIDEO_FIELD_NUMBER = 2;
    public static final int CAROUSEL_FIELD_NUMBER = 4;
    private static final Companion DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SURVEY_FIELD_NUMBER = 3;
    private int typeCase_ = 0;
    private Object type_;

    static {
        Companion companion = new Companion();
        DEFAULT_INSTANCE = companion;
        h.registerDefaultInstance(Companion.class, companion);
    }

    private Companion() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"type_", "typeCase_", CanvasImage.class, CanvasVideo.class, Survey.class, Carousel.class});
        }
        if (iOrdinal == 3) {
            return new Companion();
        }
        if (iOrdinal == 4) {
            return new wah(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (Companion.class) {
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

    public final CanvasImage n() {
        return this.typeCase_ == 1 ? (CanvasImage) this.type_ : CanvasImage.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CanvasVideo o() {
        return this.typeCase_ == 2 ? (CanvasVideo) this.type_ : CanvasVideo.n();
    }

    public final Carousel p() {
        return this.typeCase_ == 4 ? (Carousel) this.type_ : Carousel.o();
    }

    public final Survey q() {
        return this.typeCase_ == 3 ? (Survey) this.type_ : Survey.n();
    }

    public final boolean r() {
        return this.typeCase_ == 1;
    }

    public final boolean s() {
        return this.typeCase_ == 2;
    }

    public final boolean t() {
        return this.typeCase_ == 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.typeCase_ == 3;
    }
}

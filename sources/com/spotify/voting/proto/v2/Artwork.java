package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Artwork extends h implements v2j0 {
    private static final Artwork DEFAULT_INSTANCE;
    public static final int LOTTIE_ANIMATED_FIELD_NUMBER = 1;
    public static final int LOTTIE_STATIC_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int typeCase_ = 0;
    private Object type_;

    static {
        Artwork artwork = new Artwork();
        DEFAULT_INSTANCE = artwork;
        h.registerDefaultInstance(Artwork.class, artwork);
    }

    private Artwork() {
    }

    public static Artwork n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", LottieAnimated.class, LottieStatic.class});
        }
        if (iOrdinal == 3) {
            return new Artwork();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (Artwork.class) {
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

    public final LottieAnimated o() {
        return this.typeCase_ == 1 ? (LottieAnimated) this.type_ : LottieAnimated.o();
    }

    public final LottieStatic p() {
        return this.typeCase_ == 2 ? (LottieStatic) this.type_ : LottieStatic.o();
    }

    public final int q() {
        int i = this.typeCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.musicquizservice.v1;

import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.lbf0;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LottieAnimation extends com.google.protobuf.h implements v2j0 {
    private static final LottieAnimation DEFAULT_INSTANCE;
    public static final int IMAGE_MAPPINGS_FIELD_NUMBER = 2;
    public static final int LOTTIE_ANIMATION_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 imageMappings_ = qng0.b;
    private String lottieAnimationUrl_ = "";

    static {
        LottieAnimation lottieAnimation = new LottieAnimation();
        DEFAULT_INSTANCE = lottieAnimation;
        com.google.protobuf.h.registerDefaultInstance(LottieAnimation.class, lottieAnimation);
    }

    private LottieAnimation() {
    }

    public static LottieAnimation n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"lottieAnimationUrl_", "imageMappings_", lbf0.a});
        }
        if (iOrdinal == 3) {
            return new LottieAnimation();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (LottieAnimation.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.imageMappings_);
    }

    public final String p() {
        return this.lottieAnimationUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

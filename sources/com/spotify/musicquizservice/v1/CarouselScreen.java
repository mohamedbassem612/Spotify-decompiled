package com.spotify.musicquizservice.v1;

import java.util.Collections;
import java.util.Map;
import p.a0e;
import p.bf40;
import p.bid;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class CarouselScreen extends com.google.protobuf.h implements v2j0 {
    private static final CarouselScreen DEFAULT_INSTANCE;
    public static final int IMAGE_MAPPINGS_FIELD_NUMBER = 4;
    public static final int LOTTIE_ANIMATION_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private qng0 imageMappings_ = qng0.b;
    private String title_ = "";
    private String subtitle_ = "";
    private String lottieAnimationUrl_ = "";

    static {
        CarouselScreen carouselScreen = new CarouselScreen();
        DEFAULT_INSTANCE = carouselScreen;
        com.google.protobuf.h.registerDefaultInstance(CarouselScreen.class, carouselScreen);
    }

    private CarouselScreen() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"title_", "subtitle_", "lottieAnimationUrl_", "imageMappings_", a0e.a});
        }
        if (iOrdinal == 3) {
            return new CarouselScreen();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (CarouselScreen.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.imageMappings_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.lottieAnimationUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

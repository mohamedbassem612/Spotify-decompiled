package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class LottieAnimated extends h implements v2j0 {
    public static final int COLORS_FIELD_NUMBER = 2;
    private static final LottieAnimated DEFAULT_INSTANCE;
    public static final int HIDE_WHEN_STATIC_FIELD_NUMBER = 6;
    public static final int IMAGE_ASSET_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 3;
    public static final int STATIC_FRAME_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 1;
    private boolean hideWhenStatic_;
    private boolean shouldLoop_;
    private int staticFrame_;
    private String url_ = "";
    private h290 colors_ = h.emptyProtobufList();
    private String imageAssetId_ = "";

    static {
        LottieAnimated lottieAnimated = new LottieAnimated();
        DEFAULT_INSTANCE = lottieAnimated;
        h.registerDefaultInstance(LottieAnimated.class, lottieAnimated);
    }

    private LottieAnimated() {
    }

    public static LottieAnimated o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007\u0004\u0004\u0005Ȉ\u0006\u0007", new Object[]{"url_", "colors_", LottieColor.class, "shouldLoop_", "staticFrame_", "imageAssetId_", "hideWhenStatic_"});
        }
        if (iOrdinal == 3) {
            return new LottieAnimated();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (LottieAnimated.class) {
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

    public final h290 n() {
        return this.colors_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.hideWhenStatic_;
    }

    public final String q() {
        return this.imageAssetId_;
    }

    public final boolean r() {
        return this.shouldLoop_;
    }

    public final int s() {
        return this.staticFrame_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

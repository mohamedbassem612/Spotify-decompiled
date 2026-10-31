package com.spotify.watchfeed.component.content.v1;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.BackgroundAudioPreview;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class LottieAnimationContent extends h implements v2j0 {
    public static final int ANIMATION_URL_FIELD_NUMBER = 1;
    public static final int BACKGROUND_AUDIO_PREVIEW_FIELD_NUMBER = 2;
    private static final LottieAnimationContent DEFAULT_INSTANCE;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 4;
    private String animationUrl_ = "";
    private BackgroundAudioPreview backgroundAudioPreview_;
    private int bitField0_;
    private boolean increaseVolumeGradually_;
    private boolean shouldLoop_;

    static {
        LottieAnimationContent lottieAnimationContent = new LottieAnimationContent();
        DEFAULT_INSTANCE = lottieAnimationContent;
        h.registerDefaultInstance(LottieAnimationContent.class, lottieAnimationContent);
    }

    private LottieAnimationContent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LottieAnimationContent s(phc phcVar) {
        return (LottieAnimationContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004\u0007", new Object[]{"bitField0_", "animationUrl_", "backgroundAudioPreview_", "increaseVolumeGradually_", "shouldLoop_"});
        }
        if (iOrdinal == 3) {
            return new LottieAnimationContent();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (LottieAnimationContent.class) {
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
        return this.animationUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BackgroundAudioPreview o() {
        BackgroundAudioPreview backgroundAudioPreview = this.backgroundAudioPreview_;
        return backgroundAudioPreview == null ? BackgroundAudioPreview.o() : backgroundAudioPreview;
    }

    public final boolean p() {
        return this.increaseVolumeGradually_;
    }

    public final boolean q() {
        return this.shouldLoop_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.watchfeed.component.content.v1;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.BackgroundAudioPreview;
import p.bf40;
import p.ghc0;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class LinearGradientContent extends h implements v2j0 {
    public static final int BACKGROUND_AUDIO_PREVIEW_FIELD_NUMBER = 2;
    public static final int COLORS_FIELD_NUMBER = 1;
    private static final LinearGradientContent DEFAULT_INSTANCE;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private BackgroundAudioPreview backgroundAudioPreview_;
    private int bitField0_;
    private h290 colors_ = h.emptyProtobufList();
    private boolean increaseVolumeGradually_;

    static {
        LinearGradientContent linearGradientContent = new LinearGradientContent();
        DEFAULT_INSTANCE = linearGradientContent;
        h.registerDefaultInstance(LinearGradientContent.class, linearGradientContent);
    }

    private LinearGradientContent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LinearGradientContent r(phc phcVar) {
        return (LinearGradientContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0000\u0003\u0007", new Object[]{"bitField0_", "colors_", "backgroundAudioPreview_", "increaseVolumeGradually_"});
        }
        if (iOrdinal == 3) {
            return new LinearGradientContent();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (LinearGradientContent.class) {
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

    public final BackgroundAudioPreview n() {
        BackgroundAudioPreview backgroundAudioPreview = this.backgroundAudioPreview_;
        return backgroundAudioPreview == null ? BackgroundAudioPreview.o() : backgroundAudioPreview;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.colors_;
    }

    public final boolean p() {
        return this.increaseVolumeGradually_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

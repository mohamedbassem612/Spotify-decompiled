package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Video extends h implements v2j0 {
    public static final int ASSET_FIELD_NUMBER = 1;
    private static final Video DEFAULT_INSTANCE;
    public static final int FALLBACK_AUDIO_FIELD_NUMBER = 3;
    public static final int FALLBACK_IMAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSCRIPT_FIELD_NUMBER = 4;
    private VideoAsset asset_;
    private int bitField0_;
    private Audio fallbackAudio_;
    private Image fallbackImage_;
    private Transcript transcript_;

    static {
        Video video = new Video();
        DEFAULT_INSTANCE = video;
        h.registerDefaultInstance(Video.class, video);
    }

    private Video() {
    }

    public static Video p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "asset_", "fallbackImage_", "fallbackAudio_", "transcript_"});
        }
        if (iOrdinal == 3) {
            return new Video();
        }
        if (iOrdinal == 4) {
            return new gvi1((byte) 22);
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
        synchronized (Video.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final VideoAsset o() {
        VideoAsset videoAsset = this.asset_;
        return videoAsset == null ? VideoAsset.o() : videoAsset;
    }

    public final Audio q() {
        Audio audio = this.fallbackAudio_;
        return audio == null ? Audio.p() : audio;
    }

    public final Image r() {
        Image image = this.fallbackImage_;
        return image == null ? Image.o() : image;
    }

    public final Transcript s() {
        Transcript transcript = this.transcript_;
        return transcript == null ? Transcript.o() : transcript;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

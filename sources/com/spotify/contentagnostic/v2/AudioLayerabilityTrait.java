package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hw7;
import p.iba;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudioLayerabilityTrait extends h implements v2j0 {
    public static final int AUDIO_TRACKS_IN_BASE_LAYER_FIELD_NUMBER = 3;
    public static final int BASE_LAYER_TYPE_FIELD_NUMBER = 2;
    public static final int BASE_LAYER_VIDEO_ID_FIELD_NUMBER = 1;
    private static final AudioLayerabilityTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int baseLayerType_;
    private phc baseLayerVideoId_ = phc.b;
    private h290 audioTracksInBaseLayer_ = h.emptyProtobufList();

    static {
        AudioLayerabilityTrait audioLayerabilityTrait = new AudioLayerabilityTrait();
        DEFAULT_INSTANCE = audioLayerabilityTrait;
        h.registerDefaultInstance(AudioLayerabilityTrait.class, audioLayerabilityTrait);
    }

    private AudioLayerabilityTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AudioLayerabilityTrait q(byte[] bArr) {
        return (AudioLayerabilityTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\f\u0003\u001b", new Object[]{"baseLayerVideoId_", "baseLayerType_", "audioTracksInBaseLayer_", AudioLayerableTrackInfo.class});
        }
        if (iOrdinal == 3) {
            return new AudioLayerabilityTrait();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (AudioLayerabilityTrait.class) {
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

    public final h290 n() {
        return this.audioTracksInBaseLayer_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final iba o() {
        iba ibaVar;
        int i = this.baseLayerType_;
        if (i == 0) {
            ibaVar = iba.BASE_LAYER_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            ibaVar = i != 2 ? null : iba.BASE_LAYER_TYPE_MUSIC;
        } else {
            ibaVar = iba.BASE_LAYER_TYPE_TALK;
        }
        return ibaVar == null ? iba.UNRECOGNIZED : ibaVar;
    }

    public final phc p() {
        return this.baseLayerVideoId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

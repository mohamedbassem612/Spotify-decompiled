package com.spotify.audiorecognition.v1;

import com.google.protobuf.h;
import p.bf40;
import p.j48;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zt7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AudioSettings extends h implements v2j0 {
    public static final int AUDIO_ENCODING_FIELD_NUMBER = 4;
    public static final int CHANNELS_FIELD_NUMBER = 2;
    private static final AudioSettings DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 1;
    private int audioEncoding_;
    private int channels_;
    private int sampleRate_;

    static {
        AudioSettings audioSettings = new AudioSettings();
        DEFAULT_INSTANCE = audioSettings;
        h.registerDefaultInstance(AudioSettings.class, audioSettings);
    }

    private AudioSettings() {
    }

    public static AudioSettings o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static j48 q() {
        return (j48) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0004\f", new Object[]{"sampleRate_", "channels_", "audioEncoding_"});
        }
        if (iOrdinal == 3) {
            return new AudioSettings();
        }
        if (iOrdinal == 4) {
            return new j48(DEFAULT_INSTANCE);
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
        synchronized (AudioSettings.class) {
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

    public final int n() {
        return this.channels_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        return this.sampleRate_;
    }

    public final void r() {
        this.audioEncoding_ = zt7.AUDIO_ENCODING_S16LE.getNumber();
    }

    public final void s() {
        this.channels_ = 1;
    }

    public final void t(int i) {
        this.sampleRate_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

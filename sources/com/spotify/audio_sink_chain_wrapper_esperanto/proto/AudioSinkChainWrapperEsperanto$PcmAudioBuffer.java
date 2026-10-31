package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u48;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AudioSinkChainWrapperEsperanto$PcmAudioBuffer extends h implements v2j0 {
    private static final AudioSinkChainWrapperEsperanto$PcmAudioBuffer DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SAMPLES_FIELD_NUMBER = 1;
    private phc samples_ = phc.b;

    static {
        AudioSinkChainWrapperEsperanto$PcmAudioBuffer audioSinkChainWrapperEsperanto$PcmAudioBuffer = new AudioSinkChainWrapperEsperanto$PcmAudioBuffer();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$PcmAudioBuffer;
        h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$PcmAudioBuffer.class, audioSinkChainWrapperEsperanto$PcmAudioBuffer);
    }

    private AudioSinkChainWrapperEsperanto$PcmAudioBuffer() {
    }

    public static AudioSinkChainWrapperEsperanto$PcmAudioBuffer n() {
        return DEFAULT_INSTANCE;
    }

    public static u48 p() {
        return (u48) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"samples_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$PcmAudioBuffer();
        }
        if (iOrdinal == 4) {
            return new u48(DEFAULT_INSTANCE);
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
        synchronized (AudioSinkChainWrapperEsperanto$PcmAudioBuffer.class) {
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

    public final phc o() {
        return this.samples_;
    }

    public final void q(hhc hhcVar) {
        this.samples_ = hhcVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

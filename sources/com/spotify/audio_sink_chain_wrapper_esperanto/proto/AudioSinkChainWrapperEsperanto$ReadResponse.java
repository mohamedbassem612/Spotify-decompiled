package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AudioSinkChainWrapperEsperanto$ReadResponse extends h implements v2j0 {
    private static final AudioSinkChainWrapperEsperanto$ReadResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PCM_FIELD_NUMBER = 1;
    private int bitField0_;
    private AudioSinkChainWrapperEsperanto$PcmAudioBuffer pcm_;

    static {
        AudioSinkChainWrapperEsperanto$ReadResponse audioSinkChainWrapperEsperanto$ReadResponse = new AudioSinkChainWrapperEsperanto$ReadResponse();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$ReadResponse;
        h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$ReadResponse.class, audioSinkChainWrapperEsperanto$ReadResponse);
    }

    private AudioSinkChainWrapperEsperanto$ReadResponse() {
    }

    public static AudioSinkChainWrapperEsperanto$ReadResponse o(byte[] bArr) {
        return (AudioSinkChainWrapperEsperanto$ReadResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pcm_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$ReadResponse();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (AudioSinkChainWrapperEsperanto$ReadResponse.class) {
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

    public final AudioSinkChainWrapperEsperanto$PcmAudioBuffer n() {
        AudioSinkChainWrapperEsperanto$PcmAudioBuffer audioSinkChainWrapperEsperanto$PcmAudioBuffer = this.pcm_;
        return audioSinkChainWrapperEsperanto$PcmAudioBuffer == null ? AudioSinkChainWrapperEsperanto$PcmAudioBuffer.n() : audioSinkChainWrapperEsperanto$PcmAudioBuffer;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

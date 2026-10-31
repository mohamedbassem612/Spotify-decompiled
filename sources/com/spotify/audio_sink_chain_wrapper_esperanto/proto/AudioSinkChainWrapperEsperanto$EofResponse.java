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
public final class AudioSinkChainWrapperEsperanto$EofResponse extends h implements v2j0 {
    private static final AudioSinkChainWrapperEsperanto$EofResponse DEFAULT_INSTANCE;
    public static final int EOF_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean eof_;

    static {
        AudioSinkChainWrapperEsperanto$EofResponse audioSinkChainWrapperEsperanto$EofResponse = new AudioSinkChainWrapperEsperanto$EofResponse();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$EofResponse;
        h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$EofResponse.class, audioSinkChainWrapperEsperanto$EofResponse);
    }

    private AudioSinkChainWrapperEsperanto$EofResponse() {
    }

    public static AudioSinkChainWrapperEsperanto$EofResponse o(byte[] bArr) {
        return (AudioSinkChainWrapperEsperanto$EofResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"eof_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$EofResponse();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (AudioSinkChainWrapperEsperanto$EofResponse.class) {
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

    public final boolean n() {
        return this.eof_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

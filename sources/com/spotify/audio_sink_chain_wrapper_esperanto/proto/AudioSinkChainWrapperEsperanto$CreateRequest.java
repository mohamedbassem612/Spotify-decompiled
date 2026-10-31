package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.q48;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AudioSinkChainWrapperEsperanto$CreateRequest extends h implements v2j0 {
    private static final AudioSinkChainWrapperEsperanto$CreateRequest DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 1;
    public static final int IS_TALK_FIELD_NUMBER = 4;
    public static final int LOUDNESS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TRUE_PEAK_FIELD_NUMBER = 2;
    private int bitField0_;
    private AudioSinkChainWrapperEsperanto$AudioFormat format_;
    private boolean isTalk_;
    private float loudness_;
    private float truePeak_;

    static {
        AudioSinkChainWrapperEsperanto$CreateRequest audioSinkChainWrapperEsperanto$CreateRequest = new AudioSinkChainWrapperEsperanto$CreateRequest();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$CreateRequest;
        h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$CreateRequest.class, audioSinkChainWrapperEsperanto$CreateRequest);
    }

    private AudioSinkChainWrapperEsperanto$CreateRequest() {
    }

    public static q48 n() {
        return (q48) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004\u0007", new Object[]{"bitField0_", "format_", "truePeak_", "loudness_", "isTalk_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$CreateRequest();
        }
        if (iOrdinal == 4) {
            return new q48(DEFAULT_INSTANCE);
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
        synchronized (AudioSinkChainWrapperEsperanto$CreateRequest.class) {
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

    public final void o(AudioSinkChainWrapperEsperanto$AudioFormat audioSinkChainWrapperEsperanto$AudioFormat) {
        audioSinkChainWrapperEsperanto$AudioFormat.getClass();
        this.format_ = audioSinkChainWrapperEsperanto$AudioFormat;
        this.bitField0_ |= 1;
    }

    public final void p(boolean z) {
        this.isTalk_ = z;
    }

    public final void q(float f) {
        this.bitField0_ |= 4;
        this.loudness_ = f;
    }

    public final void r(float f) {
        this.bitField0_ |= 2;
        this.truePeak_ = f;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

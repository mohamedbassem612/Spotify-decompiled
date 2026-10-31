package com.spotify.audiorecognition.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x18;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AudioRecognitionRequest extends h implements v2j0 {
    public static final int CHUNK_FIELD_NUMBER = 2;
    private static final AudioRecognitionRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SETTINGS_FIELD_NUMBER = 1;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        AudioRecognitionRequest audioRecognitionRequest = new AudioRecognitionRequest();
        DEFAULT_INSTANCE = audioRecognitionRequest;
        h.registerDefaultInstance(AudioRecognitionRequest.class, audioRecognitionRequest);
    }

    private AudioRecognitionRequest() {
    }

    public static x18 p() {
        return (x18) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"payload_", "payloadCase_", AudioSettings.class, AudioChunk.class});
        }
        if (iOrdinal == 3) {
            return new AudioRecognitionRequest();
        }
        if (iOrdinal == 4) {
            return new x18(DEFAULT_INSTANCE);
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
        synchronized (AudioRecognitionRequest.class) {
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
        int i = this.payloadCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AudioSettings o() {
        return this.payloadCase_ == 1 ? (AudioSettings) this.payload_ : AudioSettings.o();
    }

    public final void q(AudioChunk audioChunk) {
        audioChunk.getClass();
        this.payload_ = audioChunk;
        this.payloadCase_ = 2;
    }

    public final void r(AudioSettings audioSettings) {
        this.payload_ = audioSettings;
        this.payloadCase_ = 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

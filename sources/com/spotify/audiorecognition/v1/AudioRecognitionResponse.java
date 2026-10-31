package com.spotify.audiorecognition.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AudioRecognitionResponse extends h implements v2j0 {
    private static final AudioRecognitionResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int MATCH_FIELD_NUMBER = 2;
    public static final int NO_MATCH_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROCESSING_FIELD_NUMBER = 1;
    public static final int REQUEST_ID_FIELD_NUMBER = 5;
    private Object result_;
    private int resultCase_ = 0;
    private String requestId_ = "";

    static {
        AudioRecognitionResponse audioRecognitionResponse = new AudioRecognitionResponse();
        DEFAULT_INSTANCE = audioRecognitionResponse;
        h.registerDefaultInstance(AudioRecognitionResponse.class, audioRecognitionResponse);
    }

    private AudioRecognitionResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AudioRecognitionResponse r(byte[] bArr) {
        return (AudioRecognitionResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005Ȉ", new Object[]{"result_", "resultCase_", RecognitionProcessing.class, RecognitionMatch.class, RecognitionNoMatch.class, RecognitionError.class, "requestId_"});
        }
        if (iOrdinal == 3) {
            return new AudioRecognitionResponse();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (AudioRecognitionResponse.class) {
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

    public final RecognitionError n() {
        return this.resultCase_ == 4 ? (RecognitionError) this.result_ : RecognitionError.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RecognitionMatch o() {
        return this.resultCase_ == 2 ? (RecognitionMatch) this.result_ : RecognitionMatch.n();
    }

    public final String p() {
        return this.requestId_;
    }

    public final int q() {
        int i = this.resultCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

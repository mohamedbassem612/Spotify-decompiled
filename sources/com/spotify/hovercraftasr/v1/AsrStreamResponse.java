package com.spotify.hovercraftasr.v1;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AsrStreamResponse extends h implements v2j0 {
    private static final AsrStreamResponse DEFAULT_INSTANCE;
    public static final int FINISHED_LISTENING_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSCRIPTION_UPDATE_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        AsrStreamResponse asrStreamResponse = new AsrStreamResponse();
        DEFAULT_INSTANCE = asrStreamResponse;
        h.registerDefaultInstance(AsrStreamResponse.class, asrStreamResponse);
    }

    private AsrStreamResponse() {
    }

    public static AsrStreamResponse p(byte[] bArr) {
        return (AsrStreamResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"response_", "responseCase_", TranscriptionUpdate.class, FinishedListening.class});
        }
        if (iOrdinal == 3) {
            return new AsrStreamResponse();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (AsrStreamResponse.class) {
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
        int i = this.responseCase_;
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

    public final TranscriptionUpdate o() {
        return this.responseCase_ == 1 ? (TranscriptionUpdate) this.response_ : TranscriptionUpdate.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.ljj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MusicIdentifierQuestion extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_DURATION_MS_FIELD_NUMBER = 3;
    public static final int AUDIO_START_OFFSET_MS_FIELD_NUMBER = 2;
    private static final MusicIdentifierQuestion DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_TEXT_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 5;
    private int audioDurationMs_;
    private int audioStartOffsetMs_;
    private String questionText_ = "";
    private String trackUri_ = "";

    static {
        MusicIdentifierQuestion musicIdentifierQuestion = new MusicIdentifierQuestion();
        DEFAULT_INSTANCE = musicIdentifierQuestion;
        com.google.protobuf.h.registerDefaultInstance(MusicIdentifierQuestion.class, musicIdentifierQuestion);
    }

    private MusicIdentifierQuestion() {
    }

    public static MusicIdentifierQuestion p() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"audioStartOffsetMs_", "audioDurationMs_", "questionText_", "trackUri_"});
        }
        if (iOrdinal == 3) {
            return new MusicIdentifierQuestion();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (MusicIdentifierQuestion.class) {
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
        return this.audioDurationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.audioStartOffsetMs_;
    }

    public final String q() {
        return this.questionText_;
    }

    public final String r() {
        return this.trackUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

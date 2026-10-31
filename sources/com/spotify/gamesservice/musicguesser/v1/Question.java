package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.h1y0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Question extends com.google.protobuf.h implements v2j0 {
    public static final int ANSWER_URI_FIELD_NUMBER = 1;
    public static final int CHOICE_URI_FIELD_NUMBER = 2;
    private static final Question DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_URI_FIELD_NUMBER = 3;
    private String answerUri_ = "";
    private h290 choiceUri_ = com.google.protobuf.h.emptyProtobufList();
    private String trackUri_ = "";

    static {
        Question question = new Question();
        DEFAULT_INSTANCE = question;
        com.google.protobuf.h.registerDefaultInstance(Question.class, question);
    }

    private Question() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ", new Object[]{"answerUri_", "choiceUri_", "trackUri_"});
        }
        if (iOrdinal == 3) {
            return new Question();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Question.class) {
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

    public final String n() {
        return this.answerUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.choiceUri_;
    }

    public final String p() {
        return this.trackUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.fyh;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CompleteGameRequest extends com.google.protobuf.h implements v2j0 {
    private static final CompleteGameRequest DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 2;
    private String gameId_ = "";
    private h290 score_ = com.google.protobuf.h.emptyProtobufList();

    static {
        CompleteGameRequest completeGameRequest = new CompleteGameRequest();
        DEFAULT_INSTANCE = completeGameRequest;
        com.google.protobuf.h.registerDefaultInstance(CompleteGameRequest.class, completeGameRequest);
    }

    private CompleteGameRequest() {
    }

    public static fyh p() {
        return (fyh) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CompleteGameRequest q(byte[] bArr) {
        return (CompleteGameRequest) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"gameId_", "score_", QuestionScore.class});
        }
        if (iOrdinal == 3) {
            return new CompleteGameRequest();
        }
        if (iOrdinal == 4) {
            return new fyh(DEFAULT_INSTANCE);
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
        synchronized (CompleteGameRequest.class) {
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

    public final void n(QuestionScore questionScore) {
        questionScore.getClass();
        h290 h290VarMutableCopy = this.score_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.score_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(questionScore);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.gameId_;
    }

    public final void r(String str) {
        str.getClass();
        this.gameId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

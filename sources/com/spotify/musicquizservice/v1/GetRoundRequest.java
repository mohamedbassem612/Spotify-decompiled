package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class GetRoundRequest extends com.google.protobuf.h implements v2j0 {
    private static final GetRoundRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_ROUND_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int ROUND_ID_FIELD_NUMBER = 1;
    private int roundIdentifierCase_ = 0;
    private Object roundIdentifier_;

    public static final class QuizRoundIdentifier extends com.google.protobuf.h implements v2j0 {
        private static final QuizRoundIdentifier DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int QUIZ_URI_FIELD_NUMBER = 1;
        public static final int ROUND_INDEX_FIELD_NUMBER = 2;
        private String quizUri_ = "";
        private int roundIndex_;

        static {
            QuizRoundIdentifier quizRoundIdentifier = new QuizRoundIdentifier();
            DEFAULT_INSTANCE = quizRoundIdentifier;
            com.google.protobuf.h.registerDefaultInstance(QuizRoundIdentifier.class, quizRoundIdentifier);
        }

        private QuizRoundIdentifier() {
        }

        public static l n() {
            return (l) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"quizUri_", "roundIndex_"});
            }
            if (iOrdinal == 3) {
                return new QuizRoundIdentifier();
            }
            if (iOrdinal == 4) {
                return new l(DEFAULT_INSTANCE);
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
            synchronized (QuizRoundIdentifier.class) {
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

        public final void o(String str) {
            str.getClass();
            this.quizUri_ = str;
        }

        public final void p(int i) {
            this.roundIndex_ = i;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GetRoundRequest getRoundRequest = new GetRoundRequest();
        DEFAULT_INSTANCE = getRoundRequest;
        com.google.protobuf.h.registerDefaultInstance(GetRoundRequest.class, getRoundRequest);
    }

    private GetRoundRequest() {
    }

    public static k n() {
        return (k) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000", new Object[]{"roundIdentifier_", "roundIdentifierCase_", QuizRoundIdentifier.class});
        }
        if (iOrdinal == 3) {
            return new GetRoundRequest();
        }
        if (iOrdinal == 4) {
            return new k(DEFAULT_INSTANCE);
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
        synchronized (GetRoundRequest.class) {
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

    public final void o(QuizRoundIdentifier quizRoundIdentifier) {
        quizRoundIdentifier.getClass();
        this.roundIdentifier_ = quizRoundIdentifier;
        this.roundIdentifierCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.musicquizservice.v1;

import p.bf40;
import p.fce;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ChallengeCompletion extends com.google.protobuf.h implements v2j0 {
    private static final ChallengeCompletion DEFAULT_INSTANCE;
    public static final int OTHER_USERNAME_FIELD_NUMBER = 2;
    public static final int OTHER_USER_RESULT_FIELD_NUMBER = 1;
    public static final int OUTCOME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int VISUAL_ASSETS_FIELD_NUMBER = 4;
    private int bitField0_;
    private Result otherUserResult_;
    private String otherUsername_ = "";
    private int outcome_;
    private VisualAssets visualAssets_;

    public static final class VisualAssets extends com.google.protobuf.h implements v2j0 {
        private static final VisualAssets DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int WINNER_MARKER_FIELD_NUMBER = 1;
        private String winnerMarker_ = "";

        static {
            VisualAssets visualAssets = new VisualAssets();
            DEFAULT_INSTANCE = visualAssets;
            com.google.protobuf.h.registerDefaultInstance(VisualAssets.class, visualAssets);
        }

        private VisualAssets() {
        }

        public static VisualAssets n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"winnerMarker_"});
            }
            if (iOrdinal == 3) {
                return new VisualAssets();
            }
            if (iOrdinal == 4) {
                return new h(DEFAULT_INSTANCE);
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
            synchronized (VisualAssets.class) {
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

        public final String o() {
            return this.winnerMarker_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ChallengeCompletion challengeCompletion = new ChallengeCompletion();
        DEFAULT_INSTANCE = challengeCompletion;
        com.google.protobuf.h.registerDefaultInstance(ChallengeCompletion.class, challengeCompletion);
    }

    private ChallengeCompletion() {
    }

    public static ChallengeCompletion n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f\u0004ဉ\u0001", new Object[]{"bitField0_", "otherUserResult_", "otherUsername_", "outcome_", "visualAssets_"});
        }
        if (iOrdinal == 3) {
            return new ChallengeCompletion();
        }
        if (iOrdinal == 4) {
            return new g(DEFAULT_INSTANCE);
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
        synchronized (ChallengeCompletion.class) {
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

    public final Result o() {
        Result result = this.otherUserResult_;
        return result == null ? Result.o() : result;
    }

    public final String p() {
        return this.otherUsername_;
    }

    public final fce q() {
        fce fceVar;
        int i = this.outcome_;
        if (i == 0) {
            fceVar = fce.OUTCOME_UNSPECIFIED;
        } else if (i == 1) {
            fceVar = fce.DRAW;
        } else if (i == 2) {
            fceVar = fce.WIN;
        } else if (i != 3) {
            fceVar = i != 4 ? null : fce.PERFECT_TIE;
        } else {
            fceVar = fce.LOSS;
        }
        return fceVar == null ? fce.UNRECOGNIZED : fceVar;
    }

    public final VisualAssets r() {
        VisualAssets visualAssets = this.visualAssets_;
        return visualAssets == null ? VisualAssets.n() : visualAssets;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

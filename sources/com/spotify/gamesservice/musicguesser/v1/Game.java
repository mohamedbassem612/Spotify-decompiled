package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.h290;
import p.jf40;
import p.jo41;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Game extends com.google.protobuf.h implements v2j0 {
    public static final int CONFIG_FIELD_NUMBER = 3;
    private static final Game DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private Config config_;
    private String id_ = "";
    private h290 question_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Config extends com.google.protobuf.h implements v2j0 {
        private static final Config DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SCORECRITERIA_FIELD_NUMBER = 1;
        private h290 scoreCriteria_ = com.google.protobuf.h.emptyProtobufList();

        public static final class ScoreCriteria extends com.google.protobuf.h implements v2j0 {
            private static final ScoreCriteria DEFAULT_INSTANCE;
            public static final int MAX_RESPONSE_TIME_MS_FIELD_NUMBER = 3;
            private static volatile qzr0 PARSER = null;
            public static final int SCORE_FIELD_NUMBER = 2;
            public static final int SCORE_THRESHOLD_FIELD_NUMBER = 1;
            private int maxResponseTimeMs_;
            private int scoreThreshold_;
            private int score_;

            static {
                ScoreCriteria scoreCriteria = new ScoreCriteria();
                DEFAULT_INSTANCE = scoreCriteria;
                com.google.protobuf.h.registerDefaultInstance(ScoreCriteria.class, scoreCriteria);
            }

            private ScoreCriteria() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"scoreThreshold_", "score_", "maxResponseTimeMs_"});
                }
                if (iOrdinal == 3) {
                    return new ScoreCriteria();
                }
                if (iOrdinal == 4) {
                    return new c(DEFAULT_INSTANCE);
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
                synchronized (ScoreCriteria.class) {
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
                return this.maxResponseTimeMs_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final int o() {
                return this.score_;
            }

            public final jo41 p() {
                jo41 jo41VarA = jo41.a(this.scoreThreshold_);
                return jo41VarA == null ? jo41.UNRECOGNIZED : jo41VarA;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Config config = new Config();
            DEFAULT_INSTANCE = config;
            com.google.protobuf.h.registerDefaultInstance(Config.class, config);
        }

        private Config() {
        }

        public static Config n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"scoreCriteria_", ScoreCriteria.class});
            }
            if (iOrdinal == 3) {
                return new Config();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (Config.class) {
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

        public final h290 o() {
            return this.scoreCriteria_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Game game = new Game();
        DEFAULT_INSTANCE = game;
        com.google.protobuf.h.registerDefaultInstance(Game.class, game);
    }

    private Game() {
    }

    public static Game o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "id_", "question_", Question.class, "config_"});
        }
        if (iOrdinal == 3) {
            return new Game();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (Game.class) {
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

    public final Config n() {
        Config config = this.config_;
        return config == null ? Config.n() : config;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.question_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

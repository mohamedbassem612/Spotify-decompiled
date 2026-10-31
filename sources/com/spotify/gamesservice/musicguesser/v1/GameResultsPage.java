package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GameResultsPage extends com.google.protobuf.h implements v2j0 {
    private static final GameResultsPage DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    public static final int PAGE_ELEMENTS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 2;
    public static final int STATS_FIELD_NUMBER = 4;
    private int bitField0_;
    private String gameId_ = "";
    private GameResultsPageElements pageElements_;
    private GameResults results_;
    private UserStats stats_;

    static {
        GameResultsPage gameResultsPage = new GameResultsPage();
        DEFAULT_INSTANCE = gameResultsPage;
        com.google.protobuf.h.registerDefaultInstance(GameResultsPage.class, gameResultsPage);
    }

    private GameResultsPage() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "gameId_", "results_", "pageElements_", "stats_"});
        }
        if (iOrdinal == 3) {
            return new GameResultsPage();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (GameResultsPage.class) {
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
        return this.gameId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final GameResultsPageElements o() {
        GameResultsPageElements gameResultsPageElements = this.pageElements_;
        return gameResultsPageElements == null ? GameResultsPageElements.q() : gameResultsPageElements;
    }

    public final GameResults p() {
        GameResults gameResults = this.results_;
        return gameResults == null ? GameResults.n() : gameResults;
    }

    public final UserStats q() {
        UserStats userStats = this.stats_;
        return userStats == null ? UserStats.n() : userStats;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

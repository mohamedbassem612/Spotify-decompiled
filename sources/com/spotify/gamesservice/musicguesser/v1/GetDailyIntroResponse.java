package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.eai1;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetDailyIntroResponse extends com.google.protobuf.h implements v2j0 {
    private static final GetDailyIntroResponse DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    public static final int PAGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int USER_GAME_STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String gameId_ = "";
    private DailyIntro page_;
    private int userGameState_;

    static {
        GetDailyIntroResponse getDailyIntroResponse = new GetDailyIntroResponse();
        DEFAULT_INSTANCE = getDailyIntroResponse;
        com.google.protobuf.h.registerDefaultInstance(GetDailyIntroResponse.class, getDailyIntroResponse);
    }

    private GetDailyIntroResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "gameId_", "userGameState_", "page_"});
        }
        if (iOrdinal == 3) {
            return new GetDailyIntroResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (GetDailyIntroResponse.class) {
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

    public final DailyIntro o() {
        DailyIntro dailyIntro = this.page_;
        return dailyIntro == null ? DailyIntro.q() : dailyIntro;
    }

    public final eai1 p() {
        eai1 eai1Var;
        int i = this.userGameState_;
        if (i == 0) {
            eai1Var = eai1.USER_GAME_STATE_UNSPECIFIED;
        } else if (i == 1) {
            eai1Var = eai1.USER_GAME_STATE_AVAILABLE_FIRST_GAME;
        } else if (i == 2) {
            eai1Var = eai1.USER_GAME_STATE_AVAILABLE;
        } else if (i != 3) {
            eai1Var = i != 4 ? null : eai1.USER_GAME_STATE_INELIGIBLE;
        } else {
            eai1Var = eai1.USER_GAME_STATE_COMPLETED;
        }
        return eai1Var == null ? eai1.UNRECOGNIZED : eai1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

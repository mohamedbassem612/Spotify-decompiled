package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetGameResponse extends com.google.protobuf.h implements v2j0 {
    private static final GetGameResponse DEFAULT_INSTANCE;
    public static final int GAME_FIELD_NUMBER = 2;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static final int PAGE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String gameId_ = "";
    private Game game_;
    private GameMetadata metadata_;
    private GamePageElements page_;

    static {
        GetGameResponse getGameResponse = new GetGameResponse();
        DEFAULT_INSTANCE = getGameResponse;
        com.google.protobuf.h.registerDefaultInstance(GetGameResponse.class, getGameResponse);
    }

    private GetGameResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "gameId_", "game_", "metadata_", "page_"});
        }
        if (iOrdinal == 3) {
            return new GetGameResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (GetGameResponse.class) {
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

    public final Game n() {
        Game game = this.game_;
        return game == null ? Game.o() : game;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final GameMetadata o() {
        GameMetadata gameMetadata = this.metadata_;
        return gameMetadata == null ? GameMetadata.o() : gameMetadata;
    }

    public final GamePageElements p() {
        GamePageElements gamePageElements = this.page_;
        return gamePageElements == null ? GamePageElements.r() : gamePageElements;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

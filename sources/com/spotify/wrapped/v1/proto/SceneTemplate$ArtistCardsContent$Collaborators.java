package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$Collaborators extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_IMAGES_FIELD_NUMBER = 2;
    private static final SceneTemplate$ArtistCardsContent$Collaborators DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String label_ = "";
    private h290 artistImages_ = com.google.protobuf.h.emptyProtobufList();

    static {
        SceneTemplate$ArtistCardsContent$Collaborators sceneTemplate$ArtistCardsContent$Collaborators = new SceneTemplate$ArtistCardsContent$Collaborators();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$Collaborators;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$Collaborators.class, sceneTemplate$ArtistCardsContent$Collaborators);
    }

    private SceneTemplate$ArtistCardsContent$Collaborators() {
    }

    public static SceneTemplate$ArtistCardsContent$Collaborators o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"label_", "artistImages_", Image.class});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$Collaborators();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (SceneTemplate$ArtistCardsContent$Collaborators.class) {
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

    public final h290 n() {
        return this.artistImages_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.label_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

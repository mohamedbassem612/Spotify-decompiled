package com.spotify.artistfacts.v1;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ArtistFact extends h implements v2j0 {
    public static final int AI_PERSONA_FIELD_NUMBER = 7;
    private static final ArtistFact DEFAULT_INSTANCE;
    public static final int EDITORIAL_PLAYLIST_PLACEMENTS_FIELD_NUMBER = 1;
    public static final int FRESH_FINDS_FORWARD_FIELD_NUMBER = 8;
    public static final int LOCALIZED_FACT_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REGISTERED_IN_SPOTIFY_FIELD_NUMBER = 2;
    public static final int RELEASES_FIELD_NUMBER = 3;
    public static final int TOURS_FIELD_NUMBER = 4;
    public static final int VERIFIED_BY_SPOTIFY_FIELD_NUMBER = 5;
    private Object fact_;
    private int factCase_ = 0;
    private String localizedFact_ = "";

    static {
        ArtistFact artistFact = new ArtistFact();
        DEFAULT_INSTANCE = artistFact;
        h.registerDefaultInstance(ArtistFact.class, artistFact);
    }

    private ArtistFact() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002:\u0000\u0003<\u0000\u0004<\u0000\u0005:\u0000\u0006Ȉ\u0007<\u0000\b<\u0000", new Object[]{"fact_", "factCase_", EditorialPlaylistPlacements.class, ReleaseFacts.class, TourFacts.class, "localizedFact_", AiPersonaFact.class, FreshFindsForwardFact.class});
        }
        if (iOrdinal == 3) {
            return new ArtistFact();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ArtistFact.class) {
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

    public final AiPersonaFact n() {
        return this.factCase_ == 7 ? (AiPersonaFact) this.fact_ : AiPersonaFact.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EditorialPlaylistPlacements o() {
        return this.factCase_ == 1 ? (EditorialPlaylistPlacements) this.fact_ : EditorialPlaylistPlacements.n();
    }

    public final int p() {
        switch (this.factCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
            default:
                return 0;
            case 7:
                return 6;
            case 8:
                return 7;
        }
    }

    public final String q() {
        return this.localizedFact_;
    }

    public final ReleaseFacts r() {
        return this.factCase_ == 3 ? (ReleaseFacts) this.fact_ : ReleaseFacts.n();
    }

    public final TourFacts s() {
        return this.factCase_ == 4 ? (TourFacts) this.fact_ : TourFacts.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.searchview.proto;

import p.bf40;
import p.ii40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Genre extends com.google.protobuf.h implements v2j0 {
    private static final Genre DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SPOTIFY_BRANDED_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean spotifyBranded_;
    private int type_;

    static {
        Genre genre = new Genre();
        DEFAULT_INSTANCE = genre;
        com.google.protobuf.h.registerDefaultInstance(Genre.class, genre);
    }

    private Genre() {
    }

    public static Genre n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"type_", "spotifyBranded_"});
        }
        if (iOrdinal == 3) {
            return new Genre();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (Genre.class) {
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

    public final boolean o() {
        return this.spotifyBranded_;
    }

    public final ii40 p() {
        ii40 ii40Var;
        int i = this.type_;
        if (i == 0) {
            ii40Var = ii40.UNKNOWN;
        } else if (i != 1) {
            ii40Var = i != 2 ? null : ii40.CONTENT;
        } else {
            ii40Var = ii40.DEFAULT;
        }
        return ii40Var == null ? ii40.UNRECOGNIZED : ii40Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

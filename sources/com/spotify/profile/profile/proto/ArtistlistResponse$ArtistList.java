package com.spotify.profile.profile.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.db6;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ArtistlistResponse$ArtistList extends h implements v2j0 {
    public static final int ARTISTS_FIELD_NUMBER = 1;
    private static final ArtistlistResponse$ArtistList DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 artists_ = h.emptyProtobufList();

    static {
        ArtistlistResponse$ArtistList artistlistResponse$ArtistList = new ArtistlistResponse$ArtistList();
        DEFAULT_INSTANCE = artistlistResponse$ArtistList;
        h.registerDefaultInstance(ArtistlistResponse$ArtistList.class, artistlistResponse$ArtistList);
    }

    private ArtistlistResponse$ArtistList() {
    }

    public static ArtistlistResponse$ArtistList n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"artists_", ArtistlistResponse$Artist.class});
        }
        if (iOrdinal == 3) {
            return new ArtistlistResponse$ArtistList();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (ArtistlistResponse$ArtistList.class) {
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

    public final List getArtistsList() {
        return this.artists_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

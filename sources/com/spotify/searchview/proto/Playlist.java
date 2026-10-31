package com.spotify.searchview.proto;

import java.util.List;
import p.bf40;
import p.dzt0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Playlist extends com.google.protobuf.h implements v2j0 {
    private static final Playlist DEFAULT_INSTANCE;
    public static final int FOLLOWERSCOUNT_FIELD_NUMBER = 4;
    public static final int MATS_FIELD_NUMBER = 7;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 3;
    public static final int OWNED_BY_SPOTIFY_FIELD_NUMBER = 2;
    public static final int OWNER_NAME_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PERSONALIZED_FIELD_NUMBER = 1;
    public static final int PROMPTED_FIELD_NUMBER = 8;
    public static final int TAGS_FIELD_NUMBER = 6;
    private long followersCount_;
    private boolean mats_;
    private int numberOfTracks_;
    private boolean ownedBySpotify_;
    private boolean personalized_;
    private boolean prompted_;
    private String ownerName_ = "";
    private h290 tags_ = com.google.protobuf.h.emptyProtobufList();

    static {
        Playlist playlist = new Playlist();
        DEFAULT_INSTANCE = playlist;
        com.google.protobuf.h.registerDefaultInstance(Playlist.class, playlist);
    }

    private Playlist() {
    }

    public static Playlist n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0002\u0005Ȉ\u0006Ț\u0007\u0007\b\u0007", new Object[]{"personalized_", "ownedBySpotify_", "numberOfTracks_", "followersCount_", "ownerName_", "tags_", "mats_", "prompted_"});
        }
        if (iOrdinal == 3) {
            return new Playlist();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (Playlist.class) {
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
        return this.mats_;
    }

    public final boolean p() {
        return this.ownedBySpotify_;
    }

    public final boolean q() {
        return this.personalized_;
    }

    public final boolean r() {
        return this.prompted_;
    }

    public final List s() {
        return this.tags_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

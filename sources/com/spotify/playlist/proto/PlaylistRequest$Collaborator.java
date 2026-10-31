package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistRequest$Collaborator extends h implements v2j0 {
    private static final PlaylistRequest$Collaborator DEFAULT_INSTANCE;
    public static final int IS_OWNER_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_EPISODES_FIELD_NUMBER = 4;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 2;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOwner_;
    private int numberOfEpisodes_;
    private int numberOfItems_;
    private int numberOfTracks_;
    private User user_;

    static {
        PlaylistRequest$Collaborator playlistRequest$Collaborator = new PlaylistRequest$Collaborator();
        DEFAULT_INSTANCE = playlistRequest$Collaborator;
        h.registerDefaultInstance(PlaylistRequest$Collaborator.class, playlistRequest$Collaborator);
    }

    private PlaylistRequest$Collaborator() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "user_", "numberOfItems_", "numberOfTracks_", "numberOfEpisodes_", "isOwner_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$Collaborator();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (PlaylistRequest$Collaborator.class) {
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

    public final boolean n() {
        return this.isOwner_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.numberOfEpisodes_;
    }

    public final int p() {
        return this.numberOfItems_;
    }

    public final int q() {
        return this.numberOfTracks_;
    }

    public final User r() {
        User user = this.user_;
        return user == null ? User.o() : user;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

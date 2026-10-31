package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$ItemCollectionState extends h implements v2j0 {
    private static final PlaylistRequest$ItemCollectionState DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 2;
    public static final int IS_IN_COLLECTION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean isBanned_;
    private boolean isInCollection_;

    static {
        PlaylistRequest$ItemCollectionState playlistRequest$ItemCollectionState = new PlaylistRequest$ItemCollectionState();
        DEFAULT_INSTANCE = playlistRequest$ItemCollectionState;
        h.registerDefaultInstance(PlaylistRequest$ItemCollectionState.class, playlistRequest$ItemCollectionState);
    }

    private PlaylistRequest$ItemCollectionState() {
    }

    public static PlaylistRequest$ItemCollectionState o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "isInCollection_", "isBanned_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$ItemCollectionState();
        }
        if (iOrdinal == 4) {
            return new iqu0((byte) 6);
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
        synchronized (PlaylistRequest$ItemCollectionState.class) {
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

    public final boolean getIsBanned() {
        return this.isBanned_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

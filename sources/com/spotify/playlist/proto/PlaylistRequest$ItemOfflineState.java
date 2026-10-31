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
public final class PlaylistRequest$ItemOfflineState extends h implements v2j0 {
    private static final PlaylistRequest$ItemOfflineState DEFAULT_INSTANCE;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 3;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean locallyPlayable_;
    private String offline_ = "";
    private int syncProgress_;

    static {
        PlaylistRequest$ItemOfflineState playlistRequest$ItemOfflineState = new PlaylistRequest$ItemOfflineState();
        DEFAULT_INSTANCE = playlistRequest$ItemOfflineState;
        h.registerDefaultInstance(PlaylistRequest$ItemOfflineState.class, playlistRequest$ItemOfflineState);
    }

    private PlaylistRequest$ItemOfflineState() {
    }

    public static PlaylistRequest$ItemOfflineState o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "offline_", "syncProgress_", "locallyPlayable_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$ItemOfflineState();
        }
        if (iOrdinal == 4) {
            return new iqu0((byte) 9);
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
        synchronized (PlaylistRequest$ItemOfflineState.class) {
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

    public final boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    public final String getOffline() {
        return this.offline_;
    }

    public final int getSyncProgress() {
        return this.syncProgress_;
    }

    public final boolean hasOffline() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

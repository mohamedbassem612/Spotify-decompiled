package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class PlaylistUpdate extends h implements v2j0 {
    private static final PlaylistUpdate DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESTORE_POINT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String description_ = "";
    private PlaylistRestorePoint restorePoint_;

    static {
        PlaylistUpdate playlistUpdate = new PlaylistUpdate();
        DEFAULT_INSTANCE = playlistUpdate;
        h.registerDefaultInstance(PlaylistUpdate.class, playlistUpdate);
    }

    private PlaylistUpdate() {
    }

    public static PlaylistUpdate n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "description_", "restorePoint_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistUpdate();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (PlaylistUpdate.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PlaylistRestorePoint o() {
        PlaylistRestorePoint playlistRestorePoint = this.restorePoint_;
        return playlistRestorePoint == null ? PlaylistRestorePoint.o() : playlistRestorePoint;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

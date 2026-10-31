package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EpisodeState$ProtoEpisodeOfflineState extends h implements v2j0 {
    private static final EpisodeState$ProtoEpisodeOfflineState DEFAULT_INSTANCE;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String offlineState_ = "";
    private int syncProgress_;

    static {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = new EpisodeState$ProtoEpisodeOfflineState();
        DEFAULT_INSTANCE = episodeState$ProtoEpisodeOfflineState;
        h.registerDefaultInstance(EpisodeState$ProtoEpisodeOfflineState.class, episodeState$ProtoEpisodeOfflineState);
    }

    private EpisodeState$ProtoEpisodeOfflineState() {
    }

    public static EpisodeState$ProtoEpisodeOfflineState n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "offlineState_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeState$ProtoEpisodeOfflineState();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (EpisodeState$ProtoEpisodeOfflineState.class) {
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

    public final String getOfflineState() {
        return this.offlineState_;
    }

    public final int getSyncProgress() {
        return this.syncProgress_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

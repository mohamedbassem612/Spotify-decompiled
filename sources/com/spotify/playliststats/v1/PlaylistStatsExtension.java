package com.spotify.playliststats.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PlaylistStatsExtension extends h implements v2j0 {
    private static final PlaylistStatsExtension DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATS_FIELD_NUMBER = 1;
    private h290 stats_ = h.emptyProtobufList();

    static {
        PlaylistStatsExtension playlistStatsExtension = new PlaylistStatsExtension();
        DEFAULT_INSTANCE = playlistStatsExtension;
        h.registerDefaultInstance(PlaylistStatsExtension.class, playlistStatsExtension);
    }

    private PlaylistStatsExtension() {
    }

    public static PlaylistStatsExtension o(byte[] bArr) {
        return (PlaylistStatsExtension) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stats_", PlaylistStat.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistStatsExtension();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (PlaylistStatsExtension.class) {
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
        return this.stats_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

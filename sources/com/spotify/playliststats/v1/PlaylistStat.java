package com.spotify.playliststats.v1;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.ry2;
import p.s2j0;
import p.v2j0;
import p.voj0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistStat extends h implements v2j0 {
    private static final PlaylistStat DEFAULT_INSTANCE;
    public static final int METRIC_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    public static final int WINDOW_FIELD_NUMBER = 2;
    private int metric_;
    private long value_;
    private int window_;

    static {
        PlaylistStat playlistStat = new PlaylistStat();
        DEFAULT_INSTANCE = playlistStat;
        h.registerDefaultInstance(PlaylistStat.class, playlistStat);
    }

    private PlaylistStat() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0002", new Object[]{"metric_", "window_", "value_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistStat();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (PlaylistStat.class) {
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

    public final voj0 n() {
        voj0 voj0Var;
        int i = this.metric_;
        if (i == 0) {
            voj0Var = voj0.METRIC_UNSPECIFIED;
        } else if (i == 1) {
            voj0Var = voj0.METRIC_PLAYLIST_SAVE_COUNT_DELTA;
        } else if (i != 2) {
            voj0Var = i != 3 ? null : voj0.METRIC_LISTENING_TIME_SECONDS;
        } else {
            voj0Var = voj0.METRIC_UNIQUE_LISTENER_COUNT;
        }
        return voj0Var == null ? voj0.UNRECOGNIZED : voj0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.value_;
    }

    public final ry2 p() {
        ry2 ry2Var;
        int i = this.window_;
        if (i == 0) {
            ry2Var = ry2.AGGREGATION_WINDOW_UNSPECIFIED;
        } else if (i == 1) {
            ry2Var = ry2.AGGREGATION_WINDOW_SEVEN_DAYS;
        } else if (i != 2) {
            ry2Var = i != 3 ? null : ry2.AGGREGATION_WINDOW_ALL_TIME;
        } else {
            ry2Var = ry2.AGGREGATION_WINDOW_THIRTY_DAYS;
        }
        return ry2Var == null ? ry2.UNRECOGNIZED : ry2Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

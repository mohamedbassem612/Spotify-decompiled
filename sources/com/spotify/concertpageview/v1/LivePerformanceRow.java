package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class LivePerformanceRow extends h implements v2j0 {
    private static final LivePerformanceRow DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTEXT_URI_FIELD_NUMBER = 3;
    public static final int TRACK_URIS_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 trackUris_ = h.emptyProtobufList();
    private String playbackContextUri_ = "";

    static {
        LivePerformanceRow livePerformanceRow = new LivePerformanceRow();
        DEFAULT_INSTANCE = livePerformanceRow;
        h.registerDefaultInstance(LivePerformanceRow.class, livePerformanceRow);
    }

    private LivePerformanceRow() {
    }

    public static LivePerformanceRow n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002Ț\u0003ለ\u0000", new Object[]{"bitField0_", "trackUris_", "playbackContextUri_"});
        }
        if (iOrdinal == 3) {
            return new LivePerformanceRow();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (LivePerformanceRow.class) {
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

    public final List getTrackUrisList() {
        return this.trackUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.playbackContextUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

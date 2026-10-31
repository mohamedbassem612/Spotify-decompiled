package com.spotify.offline.lyricsofflineplugin.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class TrackLyricsView extends h implements v2j0 {
    private static final TrackLyricsView DEFAULT_INSTANCE;
    public static final int HAS_LYRICS_FIELD_NUMBER = 18;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean hasLyrics_;

    static {
        TrackLyricsView trackLyricsView = new TrackLyricsView();
        DEFAULT_INSTANCE = trackLyricsView;
        h.registerDefaultInstance(TrackLyricsView.class, trackLyricsView);
    }

    private TrackLyricsView() {
    }

    public static TrackLyricsView n(phc phcVar) {
        return (TrackLyricsView) h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဇ\u0000", new Object[]{"bitField0_", "hasLyrics_"});
        }
        if (iOrdinal == 3) {
            return new TrackLyricsView();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (TrackLyricsView.class) {
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

    public final boolean getHasLyrics() {
        return this.hasLyrics_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

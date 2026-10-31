package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.l960;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class OverlappingHighlightArtwork extends h implements v2j0 {
    public static final int BOTTOM_COVER_ART_FIELD_NUMBER = 2;
    private static final OverlappingHighlightArtwork DEFAULT_INSTANCE;
    public static final int OVERLAP_STYLE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_COVER_ART_FIELD_NUMBER = 1;
    private int bitField0_;
    private HighlightArtworkItem bottomCoverArt_;
    private int overlapStyle_;
    private HighlightArtworkItem topCoverArt_;

    static {
        OverlappingHighlightArtwork overlappingHighlightArtwork = new OverlappingHighlightArtwork();
        DEFAULT_INSTANCE = overlappingHighlightArtwork;
        h.registerDefaultInstance(OverlappingHighlightArtwork.class, overlappingHighlightArtwork);
    }

    private OverlappingHighlightArtwork() {
    }

    public static OverlappingHighlightArtwork o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "topCoverArt_", "bottomCoverArt_", "overlapStyle_"});
        }
        if (iOrdinal == 3) {
            return new OverlappingHighlightArtwork();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (OverlappingHighlightArtwork.class) {
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

    public final HighlightArtworkItem n() {
        HighlightArtworkItem highlightArtworkItem = this.bottomCoverArt_;
        return highlightArtworkItem == null ? HighlightArtworkItem.o() : highlightArtworkItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final l960 p() {
        l960 l960Var;
        int i = this.overlapStyle_;
        if (i == 0) {
            l960Var = l960.b;
        } else if (i != 1) {
            l960Var = i != 2 ? null : l960.d;
        } else {
            l960Var = l960.c;
        }
        return l960Var == null ? l960.e : l960Var;
    }

    public final HighlightArtworkItem q() {
        HighlightArtworkItem highlightArtworkItem = this.topCoverArt_;
        return highlightArtworkItem == null ? HighlightArtworkItem.o() : highlightArtworkItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

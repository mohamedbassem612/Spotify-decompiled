package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.m960;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class HighlightArtworkItem extends h implements v2j0 {
    public static final int COVER_ART_FIELD_NUMBER = 1;
    private static final HighlightArtworkItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 2;
    private String coverArt_ = "";
    private int style_;

    static {
        HighlightArtworkItem highlightArtworkItem = new HighlightArtworkItem();
        DEFAULT_INSTANCE = highlightArtworkItem;
        h.registerDefaultInstance(HighlightArtworkItem.class, highlightArtworkItem);
    }

    private HighlightArtworkItem() {
    }

    public static HighlightArtworkItem o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"coverArt_", "style_"});
        }
        if (iOrdinal == 3) {
            return new HighlightArtworkItem();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (HighlightArtworkItem.class) {
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

    public final String n() {
        return this.coverArt_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final m960 p() {
        m960 m960Var;
        int i = this.style_;
        if (i == 0) {
            m960Var = m960.UNSPECIFIED_STYLE;
        } else if (i == 1) {
            m960Var = m960.ARTIST;
        } else if (i == 2) {
            m960Var = m960.TRACK;
        } else if (i != 3) {
            m960Var = i != 5 ? null : m960.MOOD;
        } else {
            m960Var = m960.PLAYLIST;
        }
        return m960Var == null ? m960.UNRECOGNIZED : m960Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

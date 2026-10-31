package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class HighlightsItem extends h implements v2j0 {
    public static final int BACKGROUND_PATTERN_FIELD_NUMBER = 2;
    public static final int COLOR_PALETTE_FIELD_NUMBER = 1;
    private static final HighlightsItem DEFAULT_INSTANCE;
    public static final int HERO_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int RANKED_LIST2_FIELD_NUMBER = 8;
    public static final int SHOULD_GLOW_FIELD_NUMBER = 9;
    public static final int STACKED1_FIELD_NUMBER = 4;
    public static final int STACKED2_FIELD_NUMBER = 5;
    public static final int STACKED3_FIELD_NUMBER = 6;
    private int bitField0_;
    private Palette colorPalette_;
    private Object content_;
    private boolean shouldGlow_;
    private int contentCase_ = 0;
    private String backgroundPattern_ = "";
    private String id_ = "";

    static {
        HighlightsItem highlightsItem = new HighlightsItem();
        DEFAULT_INSTANCE = highlightsItem;
        h.registerDefaultInstance(HighlightsItem.class, highlightsItem);
    }

    private HighlightsItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ\b<\u0000\t\u0007", new Object[]{"content_", "contentCase_", "bitField0_", "colorPalette_", "backgroundPattern_", Hero.class, Stacked1.class, Stacked2.class, Stacked3.class, "id_", RankedList2.class, "shouldGlow_"});
        }
        if (iOrdinal == 3) {
            return new HighlightsItem();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (HighlightsItem.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String n() {
        return this.backgroundPattern_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Palette o() {
        Palette palette = this.colorPalette_;
        return palette == null ? Palette.q() : palette;
    }

    public final int p() {
        int i = this.contentCase_;
        if (i == 0) {
            return 6;
        }
        if (i == 8) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    public final Hero q() {
        return this.contentCase_ == 3 ? (Hero) this.content_ : Hero.q();
    }

    public final RankedList2 r() {
        return this.contentCase_ == 8 ? (RankedList2) this.content_ : RankedList2.n();
    }

    public final boolean s() {
        return this.shouldGlow_;
    }

    public final Stacked1 t() {
        return this.contentCase_ == 4 ? (Stacked1) this.content_ : Stacked1.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Stacked2 u() {
        return this.contentCase_ == 5 ? (Stacked2) this.content_ : Stacked2.o();
    }

    public final Stacked3 v() {
        return this.contentCase_ == 6 ? (Stacked3) this.content_ : Stacked3.n();
    }
}

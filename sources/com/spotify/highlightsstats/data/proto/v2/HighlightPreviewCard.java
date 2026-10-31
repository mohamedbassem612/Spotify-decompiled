package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class HighlightPreviewCard extends h implements v2j0 {
    public static final int ARTWORK_FIELD_NUMBER = 3;
    public static final int BACKGROUND_PATTERN_FIELD_NUMBER = 4;
    public static final int COLOR_PALETTE_FIELD_NUMBER = 5;
    private static final HighlightPreviewCard DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SHOULD_GLOW_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Artwork artwork_;
    private int bitField0_;
    private Palette colorPalette_;
    private boolean shouldGlow_;
    private Object tapAction_;
    private int tapActionCase_ = 0;
    private String id_ = "";
    private String title_ = "";
    private String backgroundPattern_ = "";

    static {
        HighlightPreviewCard highlightPreviewCard = new HighlightPreviewCard();
        DEFAULT_INSTANCE = highlightPreviewCard;
        h.registerDefaultInstance(HighlightPreviewCard.class, highlightPreviewCard);
    }

    private HighlightPreviewCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006<\u0000\u0007\u0007", new Object[]{"tapAction_", "tapActionCase_", "bitField0_", "id_", "title_", "artwork_", "backgroundPattern_", "colorPalette_", Actions$NavigateAction.class, "shouldGlow_"});
        }
        if (iOrdinal == 3) {
            return new HighlightPreviewCard();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (HighlightPreviewCard.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final Artwork n() {
        Artwork artwork = this.artwork_;
        return artwork == null ? Artwork.p() : artwork;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundPattern_;
    }

    public final Palette p() {
        Palette palette = this.colorPalette_;
        return palette == null ? Palette.q() : palette;
    }

    public final Actions$NavigateAction q() {
        return this.tapActionCase_ == 6 ? (Actions$NavigateAction) this.tapAction_ : Actions$NavigateAction.n();
    }

    public final boolean r() {
        return this.shouldGlow_;
    }

    public final int s() {
        int i = this.tapActionCase_;
        if (i != 0) {
            return i != 6 ? 0 : 1;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

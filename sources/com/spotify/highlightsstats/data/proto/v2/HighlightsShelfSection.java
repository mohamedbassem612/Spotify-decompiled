package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class HighlightsShelfSection extends h implements v2j0 {
    private static final HighlightsShelfSection DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_CARDS_FIELD_NUMBER = 2;
    public static final int PROMO_CARDS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private h290 previewCards_ = h.emptyProtobufList();
    private h290 promoCards_ = h.emptyProtobufList();
    private Paragraph title_;

    static {
        HighlightsShelfSection highlightsShelfSection = new HighlightsShelfSection();
        DEFAULT_INSTANCE = highlightsShelfSection;
        h.registerDefaultInstance(HighlightsShelfSection.class, highlightsShelfSection);
    }

    private HighlightsShelfSection() {
    }

    public static HighlightsShelfSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"bitField0_", "title_", "previewCards_", HighlightPreviewCard.class, "promoCards_", PromoPreviewCard.class});
        }
        if (iOrdinal == 3) {
            return new HighlightsShelfSection();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (HighlightsShelfSection.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.previewCards_;
    }

    public final h290 p() {
        return this.promoCards_;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

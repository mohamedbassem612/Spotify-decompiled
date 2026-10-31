package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GraphSection extends h implements v2j0 {
    public static final int CHANGE_PREVIOUS_PERIOD_FIELD_NUMBER = 3;
    private static final GraphSection DEFAULT_INSTANCE;
    public static final int HIGHLIGHTED_ENTITY_HIGH_FIELD_NUMBER = 6;
    public static final int HIGHLIGHTED_ENTITY_LOW_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 4;
    public static final int RANGE_HIGHEST_VALUE_FIELD_NUMBER = 8;
    public static final int RANGE_LOWEST_VALUE_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int changePreviousPeriod_;
    private HighlightedEntity highlightedEntityHigh_;
    private HighlightedEntity highlightedEntityLow_;
    private Paragraph title_;
    private String subtitle_ = "";
    private h290 points_ = h.emptyProtobufList();
    private String rangeLowestValue_ = "";
    private String rangeHighestValue_ = "";

    static {
        GraphSection graphSection = new GraphSection();
        DEFAULT_INSTANCE = graphSection;
        h.registerDefaultInstance(GraphSection.class, graphSection);
    }

    private GraphSection() {
    }

    public static GraphSection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u0004\u0004\u001b\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ", new Object[]{"bitField0_", "title_", "subtitle_", "changePreviousPeriod_", "points_", GraphPoint.class, "highlightedEntityLow_", "highlightedEntityHigh_", "rangeLowestValue_", "rangeHighestValue_"});
        }
        if (iOrdinal == 3) {
            return new GraphSection();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (GraphSection.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final int n() {
        return this.changePreviousPeriod_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HighlightedEntity p() {
        HighlightedEntity highlightedEntity = this.highlightedEntityHigh_;
        return highlightedEntity == null ? HighlightedEntity.n() : highlightedEntity;
    }

    public final HighlightedEntity q() {
        HighlightedEntity highlightedEntity = this.highlightedEntityLow_;
        return highlightedEntity == null ? HighlightedEntity.n() : highlightedEntity;
    }

    public final h290 r() {
        return this.points_;
    }

    public final String s() {
        return this.rangeHighestValue_;
    }

    public final String t() {
        return this.rangeLowestValue_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Paragraph u() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }
}

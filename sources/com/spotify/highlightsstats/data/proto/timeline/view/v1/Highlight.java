package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Track;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Highlight extends h implements v2j0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 6;
    public static final int ANALYTICS_PARAMETERS_FIELD_NUMBER = 10;
    public static final int DATE_ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 15;
    public static final int DATE_FIELD_NUMBER = 3;
    private static final Highlight DEFAULT_INSTANCE;
    public static final int EMPTY_ARTWORK_FIELD_NUMBER = 17;
    public static final int GRID_ARTWORK_FIELD_NUMBER = 7;
    public static final int HIGHLIGHT_ID_FIELD_NUMBER = 13;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LANDSCAPE_ARTWORK_FIELD_NUMBER = 11;
    public static final int NAVIGATION_FIELD_NUMBER = 12;
    public static final int OVERLAPPING_ARTWORK_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 14;
    public static final int SINGLE_ARTWORK_FIELD_NUMBER = 8;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TRACK_FIELD_NUMBER = 16;
    private HighlightAnalyticsParameters analyticsParameters_;
    private Object artworkOneof_;
    private int bitField0_;
    private Navigation navigation_;
    private Signifier signifier_;
    private Paragraph subtitle_;
    private int artworkOneofCase_ = 0;
    private String id_ = "";
    private String highlightId_ = "";
    private String date_ = "";
    private String title_ = "";
    private String accentColor_ = "";
    private String dateAccessibilityDescription_ = "";
    private h290 track_ = h.emptyProtobufList();

    static {
        Highlight highlight = new Highlight();
        DEFAULT_INSTANCE = highlight;
        h.registerDefaultInstance(Highlight.class, highlight);
    }

    private Highlight() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0001\u0001\u0011\u0010\u0000\u0001\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006Ȉ\u0007<\u0000\b<\u0000\t<\u0000\nဉ\u0001\u000b<\u0000\fဉ\u0002\rȈ\u000eဉ\u0003\u000fȈ\u0010\u001b\u0011<\u0000", new Object[]{"artworkOneof_", "artworkOneofCase_", "bitField0_", "id_", "date_", "title_", "subtitle_", "accentColor_", HighlightGridArtwork.class, HighlightArtworkItem.class, OverlappingHighlightArtwork.class, "analyticsParameters_", LandscapeArtworkItem.class, "navigation_", "highlightId_", "signifier_", "dateAccessibilityDescription_", "track_", Track.class, EmptyHighlightArtwork.class});
        }
        if (iOrdinal == 3) {
            return new Highlight();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (Highlight.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final HighlightAnalyticsParameters n() {
        HighlightAnalyticsParameters highlightAnalyticsParameters = this.analyticsParameters_;
        return highlightAnalyticsParameters == null ? HighlightAnalyticsParameters.n() : highlightAnalyticsParameters;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.artworkOneofCase_;
        if (i == 0) {
            return 6;
        }
        if (i == 11) {
            return 4;
        }
        if (i == 17) {
            return 5;
        }
        if (i == 7) {
            return 1;
        }
        if (i != 8) {
            return i != 9 ? 0 : 3;
        }
        return 2;
    }

    public final String p() {
        return this.date_;
    }

    public final String q() {
        return this.dateAccessibilityDescription_;
    }

    public final HighlightGridArtwork r() {
        return this.artworkOneofCase_ == 7 ? (HighlightGridArtwork) this.artworkOneof_ : HighlightGridArtwork.n();
    }

    public final String s() {
        return this.highlightId_;
    }

    public final LandscapeArtworkItem t() {
        return this.artworkOneofCase_ == 11 ? (LandscapeArtworkItem) this.artworkOneof_ : LandscapeArtworkItem.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Navigation u() {
        Navigation navigation = this.navigation_;
        return navigation == null ? Navigation.o() : navigation;
    }

    public final OverlappingHighlightArtwork v() {
        return this.artworkOneofCase_ == 9 ? (OverlappingHighlightArtwork) this.artworkOneof_ : OverlappingHighlightArtwork.o();
    }

    public final Signifier w() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.o() : signifier;
    }

    public final HighlightArtworkItem x() {
        return this.artworkOneofCase_ == 8 ? (HighlightArtworkItem) this.artworkOneof_ : HighlightArtworkItem.o();
    }

    public final Paragraph y() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final h290 z() {
        return this.track_;
    }
}

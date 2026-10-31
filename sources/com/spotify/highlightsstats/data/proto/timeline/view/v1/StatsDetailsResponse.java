package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class StatsDetailsResponse extends h implements v2j0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 10;
    public static final int ARTIST_DETAILS_FIELD_NUMBER = 7;
    private static final StatsDetailsResponse DEFAULT_INSTANCE;
    public static final int HEADER_ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 11;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LISTENING_STATS_DETAILS_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIOUS_PERIOD_COMPARISON_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRACK_DETAILS_FIELD_NUMBER = 6;
    private int bitField0_;
    private Object detailsPageOneof_;
    private Paragraph header_;
    private int previousPeriodComparison_;
    private Paragraph title_;
    private int detailsPageOneofCase_ = 0;
    private String subtitle_ = "";
    private String accentColor_ = "";
    private String headerAccessibilityDescription_ = "";

    static {
        StatsDetailsResponse statsDetailsResponse = new StatsDetailsResponse();
        DEFAULT_INSTANCE = statsDetailsResponse;
        h.registerDefaultInstance(StatsDetailsResponse.class, statsDetailsResponse);
    }

    private StatsDetailsResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004\u0004\u0006<\u0000\u0007<\u0000\b<\u0000\nȈ\u000bȈ", new Object[]{"detailsPageOneof_", "detailsPageOneofCase_", "bitField0_", "header_", "title_", "subtitle_", "previousPeriodComparison_", TrackDetailsPage.class, ArtistsDetailsPage.class, ListeningStatsDetailsPage.class, "accentColor_", "headerAccessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new StatsDetailsResponse();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (StatsDetailsResponse.class) {
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

    public final String n() {
        return this.accentColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ArtistsDetailsPage o() {
        return this.detailsPageOneofCase_ == 7 ? (ArtistsDetailsPage) this.detailsPageOneof_ : ArtistsDetailsPage.n();
    }

    public final int p() {
        int i = this.detailsPageOneofCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 6) {
            return 1;
        }
        if (i != 7) {
            return i != 8 ? 0 : 3;
        }
        return 2;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final String r() {
        return this.headerAccessibilityDescription_;
    }

    public final ListeningStatsDetailsPage s() {
        return this.detailsPageOneofCase_ == 8 ? (ListeningStatsDetailsPage) this.detailsPageOneof_ : ListeningStatsDetailsPage.n();
    }

    public final int t() {
        return this.previousPeriodComparison_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Paragraph u() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final TrackDetailsPage v() {
        return this.detailsPageOneofCase_ == 6 ? (TrackDetailsPage) this.detailsPageOneof_ : TrackDetailsPage.n();
    }

    public final boolean w() {
        return (this.bitField0_ & 2) != 0;
    }
}

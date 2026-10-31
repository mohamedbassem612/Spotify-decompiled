package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Playlist;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListeningStatsDetailsPage extends h implements v2j0 {
    private static final ListeningStatsDetailsPage DEFAULT_INSTANCE;
    public static final int GRAPH_SECTION_FIELD_NUMBER = 1;
    public static final int MARKET_COMPARISON_SECTION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RECOMMENDATIONS_TITLE_FIELD_NUMBER = 4;
    public static final int RECOMMENDED_PLAYLIST_FIELD_NUMBER = 5;
    public static final int TIME_OF_THE_DAY_SECTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private ListeningTimeGraph graphSection_;
    private MarketComparisonSection marketComparisonSection_;
    private String recommendationsTitle_ = "";
    private Playlist recommendedPlaylist_;
    private TimeOfTheDaySection timeOfTheDaySection_;

    static {
        ListeningStatsDetailsPage listeningStatsDetailsPage = new ListeningStatsDetailsPage();
        DEFAULT_INSTANCE = listeningStatsDetailsPage;
        h.registerDefaultInstance(ListeningStatsDetailsPage.class, listeningStatsDetailsPage);
    }

    private ListeningStatsDetailsPage() {
    }

    public static ListeningStatsDetailsPage n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003", new Object[]{"bitField0_", "graphSection_", "timeOfTheDaySection_", "marketComparisonSection_", "recommendationsTitle_", "recommendedPlaylist_"});
        }
        if (iOrdinal == 3) {
            return new ListeningStatsDetailsPage();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ListeningStatsDetailsPage.class) {
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

    public final ListeningTimeGraph o() {
        ListeningTimeGraph listeningTimeGraph = this.graphSection_;
        return listeningTimeGraph == null ? ListeningTimeGraph.p() : listeningTimeGraph;
    }

    public final MarketComparisonSection p() {
        MarketComparisonSection marketComparisonSection = this.marketComparisonSection_;
        return marketComparisonSection == null ? MarketComparisonSection.o() : marketComparisonSection;
    }

    public final String q() {
        return this.recommendationsTitle_;
    }

    public final Playlist r() {
        Playlist playlist = this.recommendedPlaylist_;
        return playlist == null ? Playlist.o() : playlist;
    }

    public final TimeOfTheDaySection s() {
        TimeOfTheDaySection timeOfTheDaySection = this.timeOfTheDaySection_;
        return timeOfTheDaySection == null ? TimeOfTheDaySection.o() : timeOfTheDaySection;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

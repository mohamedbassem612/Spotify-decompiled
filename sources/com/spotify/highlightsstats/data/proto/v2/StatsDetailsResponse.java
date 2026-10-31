package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.highlightsstats.Chip;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class StatsDetailsResponse extends h implements v2j0 {
    public static final int ANALYTICS_PARAMETERS_FIELD_NUMBER = 9;
    public static final int CHIPS_FIELD_NUMBER = 11;
    public static final int DATE_FIELD_NUMBER = 8;
    private static final StatsDetailsResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOCIAL_ARTIST_DETAILS_FIELD_NUMBER = 7;
    public static final int SOCIAL_MINUTES_LISTENING_DETAILS_FIELD_NUMBER = 5;
    public static final int SOCIAL_TRACK_DETAILS_FIELD_NUMBER = 6;
    public static final int SOUND_TOWN_DETAILS_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TOP_ARTIST_DETAILS_FIELD_NUMBER = 4;
    public static final int TOP_TRACK_DETAILS_FIELD_NUMBER = 3;
    private PageAnalyticsParameters analyticsParameters_;
    private int bitField0_;
    private Timestamp date_;
    private Object detailsPageOneof_;
    private Paragraph header_;
    private Paragraph title_;
    private int detailsPageOneofCase_ = 0;
    private h290 chips_ = h.emptyProtobufList();

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

    public final boolean A() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean B() {
        return this.detailsPageOneofCase_ == 4;
    }

    public final boolean C() {
        return this.detailsPageOneofCase_ == 3;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဉ\u0002\tဉ\u0003\n<\u0000\u000b\u001b", new Object[]{"detailsPageOneof_", "detailsPageOneofCase_", "bitField0_", "header_", "title_", TopTrackDetailsPage.class, TopArtistsDetailsPage.class, SocialMinutesListenedDetailsPage.class, SocialTrackDetailsPage.class, SocialArtistsDetailsPage.class, "date_", "analyticsParameters_", SoundTownDetailsPage.class, "chips_", Chip.class});
        }
        if (iOrdinal == 3) {
            return new StatsDetailsResponse();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 22);
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

    public final Timestamp getDate() {
        Timestamp timestamp = this.date_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final PageAnalyticsParameters n() {
        PageAnalyticsParameters pageAnalyticsParameters = this.analyticsParameters_;
        return pageAnalyticsParameters == null ? PageAnalyticsParameters.n() : pageAnalyticsParameters;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.detailsPageOneofCase_;
        if (i == 0) {
            return 7;
        }
        if (i == 10) {
            return 6;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 5) {
            return 3;
        }
        if (i != 6) {
            return i != 7 ? 0 : 5;
        }
        return 4;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final SocialArtistsDetailsPage q() {
        return this.detailsPageOneofCase_ == 7 ? (SocialArtistsDetailsPage) this.detailsPageOneof_ : SocialArtistsDetailsPage.o();
    }

    public final SocialMinutesListenedDetailsPage r() {
        return this.detailsPageOneofCase_ == 5 ? (SocialMinutesListenedDetailsPage) this.detailsPageOneof_ : SocialMinutesListenedDetailsPage.n();
    }

    public final SocialTrackDetailsPage s() {
        return this.detailsPageOneofCase_ == 6 ? (SocialTrackDetailsPage) this.detailsPageOneof_ : SocialTrackDetailsPage.o();
    }

    public final SoundTownDetailsPage t() {
        return this.detailsPageOneofCase_ == 10 ? (SoundTownDetailsPage) this.detailsPageOneof_ : SoundTownDetailsPage.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Paragraph u() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final TopArtistsDetailsPage v() {
        return this.detailsPageOneofCase_ == 4 ? (TopArtistsDetailsPage) this.detailsPageOneof_ : TopArtistsDetailsPage.n();
    }

    public final TopTrackDetailsPage w() {
        return this.detailsPageOneofCase_ == 3 ? (TopTrackDetailsPage) this.detailsPageOneof_ : TopTrackDetailsPage.n();
    }

    public final boolean x() {
        return this.detailsPageOneofCase_ == 7;
    }

    public final boolean y() {
        return this.detailsPageOneofCase_ == 6;
    }

    public final boolean z() {
        return this.detailsPageOneofCase_ == 10;
    }
}

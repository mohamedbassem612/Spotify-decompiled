package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Row extends h implements v2j0 {
    public static final int ARTIST_BOTTOM_UP_SHEET_TRIGGER_ROW_FIELD_NUMBER = 13;
    public static final int ARTIST_ROW_FIELD_NUMBER = 6;
    public static final int CAMPAIGN_ROUTING_ROW_FIELD_NUMBER = 19;
    public static final int CONCERT_ROW_FIELD_NUMBER = 12;
    private static final Row DEFAULT_INSTANCE;
    public static final int DISCLAIMER_ROW_FIELD_NUMBER = 4;
    public static final int LEGAL_ROW_FIELD_NUMBER = 20;
    public static final int LIVE_PERFORMANCE_ROW_FIELD_NUMBER = 18;
    public static final int OFFERS_BLOCK_ROW_FIELD_NUMBER = 16;
    private static volatile qzr0 PARSER = null;
    public static final int PAST_EVENT_ROW_FIELD_NUMBER = 15;
    public static final int PLAYABLE_ITEM_BOTTOM_UP_SHEET_TRIGGER_ROW_FIELD_NUMBER = 14;
    public static final int PLAYABLE_ITEM_ROW_FIELD_NUMBER = 5;
    public static final int TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER = 21;
    public static final int TITLE_ROW_FIELD_NUMBER = 2;
    public static final int VENUE_ADDRESS_ROW_FIELD_NUMBER = 10;
    public static final int VENUE_INFO_ROW_FIELD_NUMBER = 9;
    public static final int VENUE_LINK_ROW_FIELD_NUMBER = 8;
    public static final int VENUE_MAP_ROW_FIELD_NUMBER = 11;
    private int contentCase_ = 0;
    private Object content_;

    static {
        Row row = new Row();
        DEFAULT_INSTANCE = row;
        h.registerDefaultInstance(Row.class, row);
    }

    private Row() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0000\u0002\u0015\u0011\u0000\u0000\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000", new Object[]{"content_", "contentCase_", TitleRow.class, DisclaimerRow.class, PlayableItemRow.class, ArtistRow.class, VenueLinkRow.class, VenueInfoRow.class, VenueAddressRow.class, VenueMapRow.class, ConcertRow.class, ArtistBottomUpSheetTriggerRow.class, PlayableItemBottomUpSheetTriggerRow.class, PastEventRow.class, OffersBlockRow.class, LivePerformanceRow.class, CampaignRoutingRow.class, LegalRow.class, TicketingTimelinePlaceholderRow.class});
        }
        if (iOrdinal == 3) {
            return new Row();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (Row.class) {
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

    public final ArtistBottomUpSheetTriggerRow n() {
        return this.contentCase_ == 13 ? (ArtistBottomUpSheetTriggerRow) this.content_ : ArtistBottomUpSheetTriggerRow.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ArtistRow o() {
        return this.contentCase_ == 6 ? (ArtistRow) this.content_ : ArtistRow.o();
    }

    public final ConcertRow p() {
        return this.contentCase_ == 12 ? (ConcertRow) this.content_ : ConcertRow.p();
    }

    public final int q() {
        switch (this.contentCase_) {
            case 0:
                return 18;
            case 1:
            case 3:
            case 7:
            case 17:
            default:
                return 0;
            case 2:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 8:
                return 5;
            case 9:
                return 6;
            case 10:
                return 7;
            case 11:
                return 8;
            case 12:
                return 9;
            case 13:
                return 10;
            case 14:
                return 11;
            case 15:
                return 12;
            case 16:
                return 13;
            case 18:
                return 14;
            case 19:
                return 15;
            case 20:
                return 16;
            case TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return 17;
        }
    }

    public final LivePerformanceRow r() {
        return this.contentCase_ == 18 ? (LivePerformanceRow) this.content_ : LivePerformanceRow.n();
    }

    public final PastEventRow s() {
        return this.contentCase_ == 15 ? (PastEventRow) this.content_ : PastEventRow.o();
    }

    public final PlayableItemBottomUpSheetTriggerRow t() {
        return this.contentCase_ == 14 ? (PlayableItemBottomUpSheetTriggerRow) this.content_ : PlayableItemBottomUpSheetTriggerRow.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final PlayableItemRow u() {
        return this.contentCase_ == 5 ? (PlayableItemRow) this.content_ : PlayableItemRow.n();
    }

    public final TitleRow v() {
        return this.contentCase_ == 2 ? (TitleRow) this.content_ : TitleRow.p();
    }

    public final VenueAddressRow w() {
        return this.contentCase_ == 10 ? (VenueAddressRow) this.content_ : VenueAddressRow.o();
    }

    public final VenueInfoRow x() {
        return this.contentCase_ == 9 ? (VenueInfoRow) this.content_ : VenueInfoRow.p();
    }

    public final VenueLinkRow y() {
        return this.contentCase_ == 8 ? (VenueLinkRow) this.content_ : VenueLinkRow.o();
    }

    public final VenueMapRow z() {
        return this.contentCase_ == 11 ? (VenueMapRow) this.content_ : VenueMapRow.p();
    }
}

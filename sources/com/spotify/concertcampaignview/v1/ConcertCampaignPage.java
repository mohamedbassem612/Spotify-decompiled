package com.spotify.concertcampaignview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ConcertCampaignPage extends h implements v2j0 {
    public static final int CONCERT_CAMPAIGN_URI_FIELD_NUMBER = 1;
    private static final ConcertCampaignPage DEFAULT_INSTANCE;
    public static final int LEGAL_TEXT_FIELD_NUMBER = 5;
    public static final int NEARBY_CONCERT_LOCATION_FIELD_NUMBER = 2;
    public static final int NEARBY_ROUTINGS_FIELD_NUMBER = 3;
    public static final int NEARBY_SECTION_SUBTITLE_FIELD_NUMBER = 7;
    public static final int NEARBY_SECTION_TITLE_FIELD_NUMBER = 6;
    public static final int OTHER_ROUTINGS_FIELD_NUMBER = 4;
    public static final int OTHER_SECTION_SUBTITLE_FIELD_NUMBER = 9;
    public static final int OTHER_SECTION_TITLE_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String concertCampaignUri_ = "";
    private String nearbyConcertLocation_ = "";
    private h290 nearbyRoutings_ = h.emptyProtobufList();
    private h290 otherRoutings_ = h.emptyProtobufList();
    private String legalText_ = "";
    private String nearbySectionTitle_ = "";
    private String nearbySectionSubtitle_ = "";
    private String otherSectionTitle_ = "";
    private String otherSectionSubtitle_ = "";

    static {
        ConcertCampaignPage concertCampaignPage = new ConcertCampaignPage();
        DEFAULT_INSTANCE = concertCampaignPage;
        h.registerDefaultInstance(ConcertCampaignPage.class, concertCampaignPage);
    }

    private ConcertCampaignPage() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b\u0004\u001b\u0005Ȉ\u0006ለ\u0001\u0007ለ\u0002\bለ\u0003\tለ\u0004", new Object[]{"bitField0_", "concertCampaignUri_", "nearbyConcertLocation_", "nearbyRoutings_", CampaignRoutingWithStatus.class, "otherRoutings_", CampaignRoutingWithStatus.class, "legalText_", "nearbySectionTitle_", "nearbySectionSubtitle_", "otherSectionTitle_", "otherSectionSubtitle_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignPage();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (ConcertCampaignPage.class) {
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
        return this.legalText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.nearbyRoutings_;
    }

    public final String p() {
        return this.nearbySectionSubtitle_;
    }

    public final String q() {
        return this.nearbySectionTitle_;
    }

    public final h290 r() {
        return this.otherRoutings_;
    }

    public final String s() {
        return this.otherSectionSubtitle_;
    }

    public final String t() {
        return this.otherSectionTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }
}

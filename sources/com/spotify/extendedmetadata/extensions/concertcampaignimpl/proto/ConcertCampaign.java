package com.spotify.extendedmetadata.extensions.concertcampaignimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.e7d;
import p.h290;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ConcertCampaign extends h implements v2j0 {
    public static final int ANNOUNCE_DATE_FIELD_NUMBER = 8;
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 1;
    private static final ConcertCampaign DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int FEATURED_PERFORMERS_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PERFORMERS_FIELD_NUMBER = 5;
    public static final int PRESENTATION_VERSION_FIELD_NUMBER = 9;
    public static final int ROUTINGS_FIELD_NUMBER = 6;
    public static final int STATE_FIELD_NUMBER = 4;
    private Timestamp announceDate_;
    private int bitField0_;
    private int presentationVersion_;
    private int state_;
    private String campaignUri_ = "";
    private String name_ = "";
    private String displayName_ = "";
    private h290 performers_ = h.emptyProtobufList();
    private h290 routings_ = h.emptyProtobufList();
    private String featuredPerformers_ = "";

    static {
        ConcertCampaign concertCampaign = new ConcertCampaign();
        DEFAULT_INSTANCE = concertCampaign;
        h.registerDefaultInstance(ConcertCampaign.class, concertCampaign);
    }

    private ConcertCampaign() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ConcertCampaign v(byte[] bArr) {
        return (ConcertCampaign) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b\u0006\u001b\u0007Ȉ\bဉ\u0000\t\u0004", new Object[]{"bitField0_", "campaignUri_", "name_", "displayName_", "state_", "performers_", CampaignPerformer.class, "routings_", CampaignRouting.class, "featuredPerformers_", "announceDate_", "presentationVersion_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaign();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ConcertCampaign.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getName() {
        return this.name_;
    }

    public final Timestamp n() {
        Timestamp timestamp = this.announceDate_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.campaignUri_;
    }

    public final String p() {
        return this.featuredPerformers_;
    }

    public final h290 q() {
        return this.performers_;
    }

    public final int r() {
        return this.presentationVersion_;
    }

    public final h290 s() {
        return this.routings_;
    }

    public final e7d t() {
        e7d e7dVar;
        int i = this.state_;
        if (i == 0) {
            e7dVar = e7d.CAMPAIGN_STATE_UNSPECIFIED;
        } else if (i == 1) {
            e7dVar = e7d.CAMPAIGN_STATE_ACTIVE;
        } else if (i == 2) {
            e7dVar = e7d.CAMPAIGN_STATE_PAUSED;
        } else if (i != 3) {
            e7dVar = i != 4 ? null : e7d.CAMPAIGN_STATE_COMPLETED;
        } else {
            e7dVar = e7d.CAMPAIGN_STATE_CANCELLED;
        }
        return e7dVar == null ? e7d.UNRECOGNIZED : e7dVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}

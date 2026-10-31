package com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ConcertCampaignRouting extends h implements v2j0 {
    private static final ConcertCampaignRouting DEFAULT_INSTANCE;
    public static final int FIRST_CONCERT_DATE_FIELD_NUMBER = 2;
    public static final int LAST_CONCERT_DATE_FIELD_NUMBER = 3;
    public static final int LOCATIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int ROUTING_DETAILS_FIELD_NUMBER = 4;
    private int bitField0_;
    private DateWithOffset firstConcertDate_;
    private DateWithOffset lastConcertDate_;
    private h290 locations_ = h.emptyProtobufList();
    private h290 routingDetails_ = h.emptyProtobufList();

    static {
        ConcertCampaignRouting concertCampaignRouting = new ConcertCampaignRouting();
        DEFAULT_INSTANCE = concertCampaignRouting;
        h.registerDefaultInstance(ConcertCampaignRouting.class, concertCampaignRouting);
    }

    private ConcertCampaignRouting() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ConcertCampaignRouting t(byte[] bArr) {
        return (ConcertCampaignRouting) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "locations_", Location.class, "firstConcertDate_", "lastConcertDate_", "routingDetails_", RoutingDetail.class});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignRouting();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (ConcertCampaignRouting.class) {
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

    public final DateWithOffset n() {
        DateWithOffset dateWithOffset = this.firstConcertDate_;
        return dateWithOffset == null ? DateWithOffset.o() : dateWithOffset;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DateWithOffset o() {
        DateWithOffset dateWithOffset = this.lastConcertDate_;
        return dateWithOffset == null ? DateWithOffset.o() : dateWithOffset;
    }

    public final h290 p() {
        return this.locations_;
    }

    public final h290 q() {
        return this.routingDetails_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RoutingDetail extends h implements v2j0 {
    public static final int CONCERT_URI_FIELD_NUMBER = 1;
    private static final RoutingDetail DEFAULT_INSTANCE;
    public static final int EVENT_DATE_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 4;
    public static final int OFFER_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private DateWithOffset eventDate_;
    private Location location_;
    private String concertUri_ = "";
    private String offerId_ = "";

    static {
        RoutingDetail routingDetail = new RoutingDetail();
        DEFAULT_INSTANCE = routingDetail;
        h.registerDefaultInstance(RoutingDetail.class, routingDetail);
    }

    private RoutingDetail() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "concertUri_", "offerId_", "eventDate_", "location_"});
        }
        if (iOrdinal == 3) {
            return new RoutingDetail();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (RoutingDetail.class) {
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
        return this.concertUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DateWithOffset o() {
        DateWithOffset dateWithOffset = this.eventDate_;
        return dateWithOffset == null ? DateWithOffset.o() : dateWithOffset;
    }

    public final Location p() {
        Location location = this.location_;
        return location == null ? Location.n() : location;
    }

    public final String q() {
        return this.offerId_;
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

package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import com.google.type.LatLng;
import p.bf40;
import p.gvi1;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class VenueMapRow extends h implements v2j0 {
    public static final int ATTRIBUTION_FIELD_NUMBER = 3;
    public static final int COORDINATES_FIELD_NUMBER = 1;
    private static final VenueMapRow DEFAULT_INSTANCE;
    public static final int MAP_LINKS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private Attribution attribution_;
    private int bitField0_;
    private LatLng coordinates_;
    private h290 mapLinks_ = h.emptyProtobufList();

    static {
        VenueMapRow venueMapRow = new VenueMapRow();
        DEFAULT_INSTANCE = venueMapRow;
        h.registerDefaultInstance(VenueMapRow.class, venueMapRow);
    }

    private VenueMapRow() {
    }

    public static VenueMapRow p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "coordinates_", "mapLinks_", VenueMapLink.class, "attribution_"});
        }
        if (iOrdinal == 3) {
            return new VenueMapRow();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (VenueMapRow.class) {
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

    public final Attribution n() {
        Attribution attribution = this.attribution_;
        return attribution == null ? Attribution.n() : attribution;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LatLng o() {
        LatLng latLng = this.coordinates_;
        return latLng == null ? LatLng.n() : latLng;
    }

    public final h290 q() {
        return this.mapLinks_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

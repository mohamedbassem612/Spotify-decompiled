package com.spotify.venueview.v1;

import com.google.protobuf.h;
import com.google.type.LatLng;
import p.bf40;
import p.eog0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MapRow extends h implements v2j0 {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int ATTRIBUTION_FIELD_NUMBER = 5;
    public static final int COORDINATES_FIELD_NUMBER = 3;
    private static final MapRow DEFAULT_INSTANCE;
    public static final int MAP_LINKS_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private Attribution attribution_;
    private int bitField0_;
    private LatLng coordinates_;
    private String name_ = "";
    private String address_ = "";
    private h290 mapLinks_ = h.emptyProtobufList();

    static {
        MapRow mapRow = new MapRow();
        DEFAULT_INSTANCE = mapRow;
        h.registerDefaultInstance(MapRow.class, mapRow);
    }

    private MapRow() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static MapRow q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005ဉ\u0001", new Object[]{"bitField0_", "name_", "address_", "coordinates_", "mapLinks_", MapLink.class, "attribution_"});
        }
        if (iOrdinal == 3) {
            return new MapRow();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (MapRow.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.address_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Attribution o() {
        Attribution attribution = this.attribution_;
        return attribution == null ? Attribution.n() : attribution;
    }

    public final LatLng p() {
        LatLng latLng = this.coordinates_;
        return latLng == null ? LatLng.n() : latLng;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

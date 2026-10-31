package com.spotify.extendedmetadata.extensions.venuelocationimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VenueLocation extends h implements v2j0 {
    public static final int ADDRESS_FIELD_NUMBER = 1;
    public static final int CITY_FIELD_NUMBER = 2;
    public static final int COUNTRY_FIELD_NUMBER = 3;
    private static final VenueLocation DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 6;
    public static final int LONGITUDE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int POSTALCODE_FIELD_NUMBER = 8;
    public static final int REGION_FIELD_NUMBER = 5;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TIMEZONE_FIELD_NUMBER = 9;
    private double latitude_;
    private double longitude_;
    private String address_ = "";
    private String city_ = "";
    private String country_ = "";
    private String region_ = "";
    private String state_ = "";
    private String postalcode_ = "";
    private String timezone_ = "";

    static {
        VenueLocation venueLocation = new VenueLocation();
        DEFAULT_INSTANCE = venueLocation;
        h.registerDefaultInstance(VenueLocation.class, venueLocation);
    }

    private VenueLocation() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VenueLocation w(byte[] bArr) {
        return (VenueLocation) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0000\u0007\u0000\bȈ\tȈ", new Object[]{"address_", "city_", "country_", "state_", "region_", "latitude_", "longitude_", "postalcode_", "timezone_"});
        }
        if (iOrdinal == 3) {
            return new VenueLocation();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (VenueLocation.class) {
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
        return this.address_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.city_;
    }

    public final String p() {
        return this.country_;
    }

    public final double q() {
        return this.latitude_;
    }

    public final double r() {
        return this.longitude_;
    }

    public final String s() {
        return this.postalcode_;
    }

    public final String t() {
        return this.region_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.state_;
    }

    public final String v() {
        return this.timezone_;
    }
}

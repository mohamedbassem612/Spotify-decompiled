package com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Location extends h implements v2j0 {
    private static final Location DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PHYSICAL_LOCATION_FIELD_NUMBER = 4;
    public static final int VENUE_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object details_;
    private int detailsCase_ = 0;
    private String venueUri_ = "";
    private String name_ = "";

    static {
        Location location = new Location();
        DEFAULT_INSTANCE = location;
        h.registerDefaultInstance(Location.class, location);
    }

    private Location() {
    }

    public static Location n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0004<\u0000", new Object[]{"details_", "detailsCase_", "bitField0_", "venueUri_", "name_", PhysicalLocation.class});
        }
        if (iOrdinal == 3) {
            return new Location();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (Location.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.detailsCase_;
        if (i != 0) {
            return i != 4 ? 0 : 1;
        }
        return 2;
    }

    public final PhysicalLocation p() {
        return this.detailsCase_ == 4 ? (PhysicalLocation) this.details_ : PhysicalLocation.o();
    }

    public final String q() {
        return this.venueUri_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

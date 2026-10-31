package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tqg0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class VenueMapLink extends h implements v2j0 {
    private static final VenueMapLink DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int provider_;
    private String uri_ = "";

    static {
        VenueMapLink venueMapLink = new VenueMapLink();
        DEFAULT_INSTANCE = venueMapLink;
        h.registerDefaultInstance(VenueMapLink.class, venueMapLink);
    }

    private VenueMapLink() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"provider_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new VenueMapLink();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (VenueMapLink.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final tqg0 n() {
        tqg0 tqg0Var;
        int i = this.provider_;
        if (i == 0) {
            tqg0Var = tqg0.MAPS_PROVIDER_UNSPECIFIED;
        } else if (i != 1) {
            tqg0Var = i != 2 ? null : tqg0.MAPS_PROVIDER_APPLE;
        } else {
            tqg0Var = tqg0.MAPS_PROVIDER_GOOGLE;
        }
        return tqg0Var == null ? tqg0.UNRECOGNIZED : tqg0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

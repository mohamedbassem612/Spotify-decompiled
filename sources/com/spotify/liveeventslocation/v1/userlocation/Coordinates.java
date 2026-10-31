package com.spotify.liveeventslocation.v1.userlocation;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Coordinates extends h implements v2j0 {
    private static final Coordinates DEFAULT_INSTANCE;
    public static final int LAT_FIELD_NUMBER = 6;
    public static final int LON_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER;
    private double lat_;
    private double lon_;

    static {
        Coordinates coordinates = new Coordinates();
        DEFAULT_INSTANCE = coordinates;
        h.registerDefaultInstance(Coordinates.class, coordinates);
    }

    private Coordinates() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0006\u0007\u0002\u0000\u0000\u0000\u0006\u0000\u0007\u0000", new Object[]{"lat_", "lon_"});
        }
        if (iOrdinal == 3) {
            return new Coordinates();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (Coordinates.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

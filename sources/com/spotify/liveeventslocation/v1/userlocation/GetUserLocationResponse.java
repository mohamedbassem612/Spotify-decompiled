package com.spotify.liveeventslocation.v1.userlocation;

import com.google.protobuf.h;
import p.bf40;
import p.et21;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetUserLocationResponse extends h implements v2j0 {
    private static final GetUserLocationResponse DEFAULT_INSTANCE;
    public static final int HAS_LOCATION_STORED_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESOLUTION_METHOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean hasLocationStored_;
    private Location location_;
    private int resolutionMethod_;

    static {
        GetUserLocationResponse getUserLocationResponse = new GetUserLocationResponse();
        DEFAULT_INSTANCE = getUserLocationResponse;
        h.registerDefaultInstance(GetUserLocationResponse.class, getUserLocationResponse);
    }

    private GetUserLocationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0007", new Object[]{"bitField0_", "location_", "resolutionMethod_", "hasLocationStored_"});
        }
        if (iOrdinal == 3) {
            return new GetUserLocationResponse();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (GetUserLocationResponse.class) {
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

    public final Location n() {
        Location location = this.location_;
        return location == null ? Location.n() : location;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final et21 o() {
        et21 et21Var;
        int i = this.resolutionMethod_;
        if (i == 0) {
            et21Var = et21.b;
        } else if (i == 1) {
            et21Var = et21.c;
        } else if (i == 2) {
            et21Var = et21.d;
        } else if (i != 3) {
            et21Var = i != 4 ? null : et21.f;
        } else {
            et21Var = et21.e;
        }
        return et21Var == null ? et21.g : et21Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

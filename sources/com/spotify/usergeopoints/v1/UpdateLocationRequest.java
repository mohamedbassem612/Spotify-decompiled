package com.spotify.usergeopoints.v1;

import com.google.protobuf.h;
import p.bf40;
import p.irh1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UpdateLocationRequest extends h implements v2j0 {
    public static final int ACCURACY_FIELD_NUMBER = 3;
    private static final UpdateLocationRequest DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LOCATION_CONTEXT_FIELD_NUMBER = 4;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private double accuracy_;
    private double latitude_;
    private String locationContext_ = "";
    private double longitude_;

    static {
        UpdateLocationRequest updateLocationRequest = new UpdateLocationRequest();
        DEFAULT_INSTANCE = updateLocationRequest;
        h.registerDefaultInstance(UpdateLocationRequest.class, updateLocationRequest);
    }

    private UpdateLocationRequest() {
    }

    public static irh1 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004Ȉ", new Object[]{"latitude_", "longitude_", "accuracy_", "locationContext_"});
        }
        if (iOrdinal == 3) {
            return new UpdateLocationRequest();
        }
        if (iOrdinal == 4) {
            return new irh1();
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
        synchronized (UpdateLocationRequest.class) {
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

    public final void p(double d) {
        this.accuracy_ = d;
    }

    public final void q(double d) {
        this.latitude_ = d;
    }

    public final void r(String str) {
        str.getClass();
        this.locationContext_ = str;
    }

    public final void s(double d) {
        this.longitude_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

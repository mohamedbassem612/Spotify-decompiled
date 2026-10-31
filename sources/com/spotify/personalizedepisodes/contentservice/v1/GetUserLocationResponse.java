package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetUserLocationResponse extends h implements v2j0 {
    public static final int COUNTRY_FIELD_NUMBER = 5;
    private static final GetUserLocationResponse DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private double latitude_;
    private double longitude_;
    private String displayName_ = "";
    private String name_ = "";
    private String country_ = "";

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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"latitude_", "longitude_", "displayName_", "name_", "country_"});
        }
        if (iOrdinal == 3) {
            return new GetUserLocationResponse();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 1);
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.country_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final double o() {
        return this.latitude_;
    }

    public final double p() {
        return this.longitude_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

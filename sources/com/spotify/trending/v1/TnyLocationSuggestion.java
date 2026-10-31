package com.spotify.trending.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class TnyLocationSuggestion extends h implements v2j0 {
    public static final int CITY_NAME_FIELD_NUMBER = 2;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 4;
    private static final TnyLocationSuggestion DEFAULT_INSTANCE;
    public static final int GEONAME_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 3;
    private int geonameId_;
    private String cityName_ = "";
    private String region_ = "";
    private String countryCode_ = "";

    static {
        TnyLocationSuggestion tnyLocationSuggestion = new TnyLocationSuggestion();
        DEFAULT_INSTANCE = tnyLocationSuggestion;
        h.registerDefaultInstance(TnyLocationSuggestion.class, tnyLocationSuggestion);
    }

    private TnyLocationSuggestion() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"geonameId_", "cityName_", "region_", "countryCode_"});
        }
        if (iOrdinal == 3) {
            return new TnyLocationSuggestion();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (TnyLocationSuggestion.class) {
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
        return this.cityName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.countryCode_;
    }

    public final int p() {
        return this.geonameId_;
    }

    public final String q() {
        return this.region_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

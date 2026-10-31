package com.spotify.liveroom.listeningparty.proto;

import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vhc;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetAllowedFeaturesResponse extends com.google.protobuf.h implements v2j0 {
    private static final GetAllowedFeaturesResponse DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private static final c290 features_converter_ = new vhc((byte) 11);
    private int featuresMemoizedSerializedSize;
    private b290 features_ = com.google.protobuf.h.emptyIntList();

    static {
        GetAllowedFeaturesResponse getAllowedFeaturesResponse = new GetAllowedFeaturesResponse();
        DEFAULT_INSTANCE = getAllowedFeaturesResponse;
        com.google.protobuf.h.registerDefaultInstance(GetAllowedFeaturesResponse.class, getAllowedFeaturesResponse);
    }

    private GetAllowedFeaturesResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"features_"});
        }
        if (iOrdinal == 3) {
            return new GetAllowedFeaturesResponse();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (GetAllowedFeaturesResponse.class) {
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

    public final d290 n() {
        return new d290(this.features_, features_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

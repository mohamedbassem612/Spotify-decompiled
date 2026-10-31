package com.spotify.devicepredictability.googledevicesuggestionsimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lut;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DevicePredictabilityIntentEngineSuggestion extends h implements v2j0 {
    public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 2;
    private static final DevicePredictabilityIntentEngineSuggestion DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RECOMMENDATION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String recommendationId_ = "";
    private String confidenceScore_ = "";
    private String deviceId_ = "";

    static {
        DevicePredictabilityIntentEngineSuggestion devicePredictabilityIntentEngineSuggestion = new DevicePredictabilityIntentEngineSuggestion();
        DEFAULT_INSTANCE = devicePredictabilityIntentEngineSuggestion;
        h.registerDefaultInstance(DevicePredictabilityIntentEngineSuggestion.class, devicePredictabilityIntentEngineSuggestion);
    }

    private DevicePredictabilityIntentEngineSuggestion() {
    }

    public static lut n() {
        return (lut) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "recommendationId_", "confidenceScore_", "deviceId_"});
        }
        if (iOrdinal == 3) {
            return new DevicePredictabilityIntentEngineSuggestion();
        }
        if (iOrdinal == 4) {
            return new lut(DEFAULT_INSTANCE);
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
        synchronized (DevicePredictabilityIntentEngineSuggestion.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.confidenceScore_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.deviceId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.recommendationId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

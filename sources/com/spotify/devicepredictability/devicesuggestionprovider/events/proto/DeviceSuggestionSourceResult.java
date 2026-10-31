package com.spotify.devicepredictability.devicesuggestionprovider.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c0u;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeviceSuggestionSourceResult extends h implements v2j0 {
    public static final int AVAILABLE_DEVICE_COUNT_FIELD_NUMBER = 8;
    public static final int CONFIDENCE_FIELD_NUMBER = 6;
    public static final int CORRELATION_ID_FIELD_NUMBER = 1;
    private static final DeviceSuggestionSourceResult DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 4;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 5;
    public static final int IS_PRIMARY_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int SUGGESTION_ID_FIELD_NUMBER = 7;
    private int availableDeviceCount_;
    private int bitField0_;
    private boolean isPrimary_;
    private String correlationId_ = "";
    private String source_ = "";
    private String status_ = "";
    private String deviceId_ = "";
    private String deviceType_ = "";
    private String confidence_ = "";
    private String suggestionId_ = "";

    static {
        DeviceSuggestionSourceResult deviceSuggestionSourceResult = new DeviceSuggestionSourceResult();
        DEFAULT_INSTANCE = deviceSuggestionSourceResult;
        h.registerDefaultInstance(DeviceSuggestionSourceResult.class, deviceSuggestionSourceResult);
    }

    private DeviceSuggestionSourceResult() {
    }

    public static c0u n() {
        return (c0u) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tဇ\b", new Object[]{"bitField0_", "correlationId_", "source_", "status_", "deviceId_", "deviceType_", "confidence_", "suggestionId_", "availableDeviceCount_", "isPrimary_"});
        }
        if (iOrdinal == 3) {
            return new DeviceSuggestionSourceResult();
        }
        if (iOrdinal == 4) {
            return new c0u(DEFAULT_INSTANCE);
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
        synchronized (DeviceSuggestionSourceResult.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 128;
        this.availableDeviceCount_ = i;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.confidence_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.correlationId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.deviceId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.deviceType_ = str;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 256;
        this.isPrimary_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 2;
        this.source_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 4;
        this.status_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.suggestionId_ = str;
    }
}

package com.spotify.devicepredictability.devicesuggestionprovider.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.wwt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeviceSuggestionProvided extends h implements v2j0 {
    public static final int CONFIDENCE_LEVEL_FIELD_NUMBER = 3;
    private static final DeviceSuggestionProvided DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 5;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 4;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUGGESTION_ID_FIELD_NUMBER = 1;
    public static final int SUGGESTION_PROVIDER_FIELD_NUMBER = 2;
    private int bitField0_;
    private String suggestionId_ = "";
    private String suggestionProvider_ = "";
    private String confidenceLevel_ = "";
    private String deviceType_ = "";
    private String deviceId_ = "";
    private h290 featureIdentifier_ = h.emptyProtobufList();

    static {
        DeviceSuggestionProvided deviceSuggestionProvided = new DeviceSuggestionProvided();
        DEFAULT_INSTANCE = deviceSuggestionProvided;
        h.registerDefaultInstance(DeviceSuggestionProvided.class, deviceSuggestionProvided);
    }

    private DeviceSuggestionProvided() {
    }

    public static wwt o() {
        return (wwt) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a", new Object[]{"bitField0_", "suggestionId_", "suggestionProvider_", "confidenceLevel_", "deviceType_", "deviceId_", "featureIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new DeviceSuggestionProvided();
        }
        if (iOrdinal == 4) {
            return new wwt(DEFAULT_INSTANCE);
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
        synchronized (DeviceSuggestionProvided.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.featureIdentifier_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.featureIdentifier_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.confidenceLevel_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.deviceId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 8;
        this.deviceType_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.suggestionId_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 2;
        this.suggestionProvider_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

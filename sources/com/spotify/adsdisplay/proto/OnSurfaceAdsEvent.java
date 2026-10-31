package com.spotify.adsdisplay.proto;

import com.google.protobuf.h;
import p.bf40;
import p.i8q0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class OnSurfaceAdsEvent extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 4;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 5;
    public static final int CONTEXT_URI_FIELD_NUMBER = 7;
    public static final int CONTROLLER_INSTANCE_ID_FIELD_NUMBER = 8;
    private static final OnSurfaceAdsEvent DEFAULT_INSTANCE;
    public static final int DEMAND_STATUS_FIELD_NUMBER = 9;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int FORMAT_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 10;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private long timeStamp_;
    private String eventName_ = "";
    private String eventData_ = "";
    private String adId_ = "";
    private String adPlaybackId_ = "";
    private String format_ = "";
    private String contextUri_ = "";
    private String controllerInstanceId_ = "";
    private String demandStatus_ = "";
    private String surface_ = "";

    static {
        OnSurfaceAdsEvent onSurfaceAdsEvent = new OnSurfaceAdsEvent();
        DEFAULT_INSTANCE = onSurfaceAdsEvent;
        h.registerDefaultInstance(OnSurfaceAdsEvent.class, onSurfaceAdsEvent);
    }

    private OnSurfaceAdsEvent() {
    }

    public static i8q0 n() {
        return (i8q0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "eventName_", "timeStamp_", "eventData_", "adId_", "adPlaybackId_", "format_", "contextUri_", "controllerInstanceId_", "demandStatus_", "surface_"});
        }
        if (iOrdinal == 3) {
            return new OnSurfaceAdsEvent();
        }
        if (iOrdinal == 4) {
            return new i8q0(DEFAULT_INSTANCE);
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
        synchronized (OnSurfaceAdsEvent.class) {
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
        this.bitField0_ |= 8;
        this.adId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.adPlaybackId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.eventName_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.format_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

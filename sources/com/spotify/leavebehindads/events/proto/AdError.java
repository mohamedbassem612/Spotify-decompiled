package com.spotify.leavebehindads.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AdError extends h implements v2j0 {
    public static final int AD_BREAK_ID_FIELD_NUMBER = 16;
    public static final int AD_CONTENT_ORIGIN_FIELD_NUMBER = 10;
    public static final int AD_ID_FIELD_NUMBER = 7;
    public static final int APP_STARTUP_ID_FIELD_NUMBER = 15;
    private static final AdError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int ERROR_TYPE_FIELD_NUMBER = 6;
    public static final int HTTP_ERROR_CODE_FIELD_NUMBER = 3;
    public static final int LINEITEM_ID_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 12;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int REQUEST_URL_FIELD_NUMBER = 4;
    public static final int SLOT_FIELD_NUMBER = 11;
    public static final int SLOT_IDS_FIELD_NUMBER = 13;
    public static final int SURFACE_FIELD_NUMBER = 9;
    public static final int TRACKING_EVENT_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 14;
    private int bitField0_;
    private long httpErrorCode_;
    private String requestType_ = "";
    private String errorMessage_ = "";
    private String requestUrl_ = "";
    private String trackingEvent_ = "";
    private String errorType_ = "";
    private String adId_ = "";
    private String lineitemId_ = "";
    private String surface_ = "";
    private String adContentOrigin_ = "";
    private String slot_ = "";
    private String requestId_ = "";
    private h290 slotIds_ = h.emptyProtobufList();
    private String type_ = "";
    private String appStartupId_ = "";
    private String adBreakId_ = "";

    static {
        AdError adError = new AdError();
        DEFAULT_INSTANCE = adError;
        h.registerDefaultInstance(AdError.class, adError);
    }

    private AdError() {
    }

    public static vn0 n() {
        return (vn0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\r\u001a\u000eဈ\f\u000fဈ\r\u0010ဈ\u000e", new Object[]{"bitField0_", "requestType_", "errorMessage_", "httpErrorCode_", "requestUrl_", "trackingEvent_", "errorType_", "adId_", "lineitemId_", "surface_", "adContentOrigin_", "slot_", "requestId_", "slotIds_", "type_", "appStartupId_", "adBreakId_"});
        }
        if (iOrdinal == 3) {
            return new AdError();
        }
        if (iOrdinal == 4) {
            return new vn0(DEFAULT_INSTANCE);
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
        synchronized (AdError.class) {
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
        this.bitField0_ |= 512;
        this.adContentOrigin_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorMessage_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.errorType_ = str;
    }

    public final void r(long j) {
        this.bitField0_ |= 4;
        this.httpErrorCode_ = j;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.lineitemId_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 2048;
        this.requestId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.bitField0_ |= 1;
        this.requestType_ = "leavebehindAds";
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.requestUrl_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.surface_ = str;
    }

    public final void x(String str) {
        this.bitField0_ |= 16;
        this.trackingEvent_ = str;
    }
}

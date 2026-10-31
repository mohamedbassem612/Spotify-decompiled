package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cq0;
import p.h290;
import p.i9;
import p.jf40;
import p.kjh1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class UnmanagedEventRequest extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int ASSET_ID_FIELD_NUMBER = 14;
    public static final int CREATIVE_ID_FIELD_NUMBER = 6;
    private static final UnmanagedEventRequest DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 13;
    public static final int EVENT_REASON_FIELD_NUMBER = 4;
    public static final int EVENT_SOURCE_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 2;
    public static final int FORMAT_FIELD_NUMBER = 11;
    public static final int LINEITEM_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_POSITION_FIELD_NUMBER = 3;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 8;
    public static final int REQUEST_ID_FIELD_NUMBER = 7;
    public static final int SLOT_ID_FIELD_NUMBER = 9;
    public static final int TRACKING_URLS_FIELD_NUMBER = 12;
    private int bitField0_;
    private int durationSeconds_;
    private int format_;
    private long playbackPosition_;
    private String adId_ = "";
    private String eventType_ = "";
    private String eventReason_ = "";
    private String lineitemId_ = "";
    private String creativeId_ = "";
    private String requestId_ = "";
    private String productName_ = "";
    private String slotId_ = "";
    private String eventSource_ = "";
    private h290 trackingUrls_ = h.emptyProtobufList();
    private String assetId_ = "";

    static {
        UnmanagedEventRequest unmanagedEventRequest = new UnmanagedEventRequest();
        DEFAULT_INSTANCE = unmanagedEventRequest;
        h.registerDefaultInstance(UnmanagedEventRequest.class, unmanagedEventRequest);
    }

    private UnmanagedEventRequest() {
    }

    public static kjh1 o() {
        return (kjh1) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        str.getClass();
        this.slotId_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဃ\u0000\u0004ለ\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nለ\u0002\u000bဌ\u0003\fȚ\rဋ\u0004\u000eለ\u0005", new Object[]{"bitField0_", "adId_", "eventType_", "playbackPosition_", "eventReason_", "lineitemId_", "creativeId_", "requestId_", "productName_", "slotId_", "eventSource_", "format_", "trackingUrls_", "durationSeconds_", "assetId_"});
        }
        if (iOrdinal == 3) {
            return new UnmanagedEventRequest();
        }
        if (iOrdinal == 4) {
            return new kjh1(DEFAULT_INSTANCE);
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
        synchronized (UnmanagedEventRequest.class) {
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
        h290 h290VarMutableCopy = this.trackingUrls_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.trackingUrls_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.adId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.assetId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    public final void s(int i) {
        this.bitField0_ |= 16;
        this.durationSeconds_ = i;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.eventReason_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.eventType_ = str;
    }

    public final void v(cq0 cq0Var) {
        this.format_ = cq0Var.getNumber();
        this.bitField0_ |= 8;
    }

    public final void w(String str) {
        str.getClass();
        this.lineitemId_ = str;
    }

    public final void x(long j) {
        this.bitField0_ |= 1;
        this.playbackPosition_ = j;
    }

    public final void y(String str) {
        str.getClass();
        this.productName_ = str;
    }

    public final void z(String str) {
        str.getClass();
        this.requestId_ = str;
    }
}

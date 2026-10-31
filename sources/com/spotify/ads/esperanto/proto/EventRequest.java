package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tb00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class EventRequest extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int ASSET_ID_FIELD_NUMBER = 9;
    public static final int CLIENT_PAYLOAD_FIELD_NUMBER = 7;
    private static final EventRequest DEFAULT_INSTANCE;
    public static final int EVENT_REASON_FIELD_NUMBER = 4;
    public static final int EVENT_SOURCE_FIELD_NUMBER = 5;
    public static final int EVENT_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_DURATION_FIELD_NUMBER = 8;
    public static final int PLAYBACK_POSITION_FIELD_NUMBER = 3;
    public static final int SLOT_ID_FIELD_NUMBER = 6;
    private int bitField0_;
    private long playbackDuration_;
    private long playbackPosition_;
    private String adId_ = "";
    private String eventType_ = "";
    private String eventReason_ = "";
    private String eventSource_ = "";
    private String slotId_ = "";
    private String clientPayload_ = "";
    private String assetId_ = "";

    static {
        EventRequest eventRequest = new EventRequest();
        DEFAULT_INSTANCE = eventRequest;
        h.registerDefaultInstance(EventRequest.class, eventRequest);
    }

    private EventRequest() {
    }

    public static tb00 n() {
        return (tb00) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဃ\u0000\u0004ለ\u0001\u0005ለ\u0002\u0006ለ\u0003\u0007ለ\u0004\bဃ\u0005\tለ\u0006", new Object[]{"bitField0_", "adId_", "eventType_", "playbackPosition_", "eventReason_", "eventSource_", "slotId_", "clientPayload_", "playbackDuration_", "assetId_"});
        }
        if (iOrdinal == 3) {
            return new EventRequest();
        }
        if (iOrdinal == 4) {
            return new tb00(DEFAULT_INSTANCE);
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
        synchronized (EventRequest.class) {
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
        this.adId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.assetId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.clientPayload_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.eventReason_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.eventSource_ = str;
    }

    public final void t(String str) {
        this.eventType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 1;
        this.playbackPosition_ = j;
    }
}

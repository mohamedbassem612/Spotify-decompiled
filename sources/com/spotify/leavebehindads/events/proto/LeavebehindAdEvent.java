package com.spotify.leavebehindads.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.ryb0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LeavebehindAdEvent extends h implements v2j0 {
    private static final LeavebehindAdEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 3;
    public static final int EVENT_REASON_FIELD_NUMBER = 4;
    public static final int LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER = 1;
    public static final int LEAVEBEHIND_REQUEST_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 5;
    public static final int SURFACE_POSITION_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 6;
    private int bitField0_;
    private int surfacePosition_;
    private String leavebehindLineitemId_ = "";
    private String leavebehindRequestId_ = "";
    private String event_ = "";
    private String eventReason_ = "";
    private String surface_ = "";
    private String uri_ = "";

    static {
        LeavebehindAdEvent leavebehindAdEvent = new LeavebehindAdEvent();
        DEFAULT_INSTANCE = leavebehindAdEvent;
        h.registerDefaultInstance(LeavebehindAdEvent.class, leavebehindAdEvent);
    }

    private LeavebehindAdEvent() {
    }

    public static ryb0 n() {
        return (ryb0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"bitField0_", "leavebehindLineitemId_", "leavebehindRequestId_", "event_", "eventReason_", "surface_", "uri_", "surfacePosition_"});
        }
        if (iOrdinal == 3) {
            return new LeavebehindAdEvent();
        }
        if (iOrdinal == 4) {
            return new ryb0(DEFAULT_INSTANCE);
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
        synchronized (LeavebehindAdEvent.class) {
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
        this.bitField0_ |= 4;
        this.event_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.eventReason_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.leavebehindLineitemId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.leavebehindRequestId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.surface_ = str;
    }

    public final void t(int i) {
        this.bitField0_ |= 64;
        this.surfacePosition_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.uri_ = str;
    }
}

package com.spotify.marquee.marquee.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dyg0;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MarqueeUserHoldoutEvent extends h implements v2j0 {
    public static final int ASSIGNMENT_METHODS_FIELD_NUMBER = 4;
    public static final int CONTENT_URI_FIELD_NUMBER = 3;
    private static final MarqueeUserHoldoutEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int FLIGHT_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String event_ = "";
    private String flightId_ = "";
    private String contentUri_ = "";
    private h290 assignmentMethods_ = h.emptyProtobufList();

    static {
        MarqueeUserHoldoutEvent marqueeUserHoldoutEvent = new MarqueeUserHoldoutEvent();
        DEFAULT_INSTANCE = marqueeUserHoldoutEvent;
        h.registerDefaultInstance(MarqueeUserHoldoutEvent.class, marqueeUserHoldoutEvent);
    }

    private MarqueeUserHoldoutEvent() {
    }

    public static dyg0 o() {
        return (dyg0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"bitField0_", "event_", "flightId_", "contentUri_", "assignmentMethods_"});
        }
        if (iOrdinal == 3) {
            return new MarqueeUserHoldoutEvent();
        }
        if (iOrdinal == 4) {
            return new dyg0(DEFAULT_INSTANCE);
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
        synchronized (MarqueeUserHoldoutEvent.class) {
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
        h290 h290VarMutableCopy = this.assignmentMethods_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.assignmentMethods_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.contentUri_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.event_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.flightId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

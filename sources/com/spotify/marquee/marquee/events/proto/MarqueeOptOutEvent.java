package com.spotify.marquee.marquee.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yug0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MarqueeOptOutEvent extends h implements v2j0 {
    public static final int ARTIST_FIELD_NUMBER = 3;
    private static final MarqueeOptOutEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int LINEITEM_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private String event_ = "";
    private String reason_ = "";
    private String artist_ = "";
    private String lineitemId_ = "";

    static {
        MarqueeOptOutEvent marqueeOptOutEvent = new MarqueeOptOutEvent();
        DEFAULT_INSTANCE = marqueeOptOutEvent;
        h.registerDefaultInstance(MarqueeOptOutEvent.class, marqueeOptOutEvent);
    }

    private MarqueeOptOutEvent() {
    }

    public static yug0 n() {
        return (yug0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "event_", "reason_", "artist_", "lineitemId_"});
        }
        if (iOrdinal == 3) {
            return new MarqueeOptOutEvent();
        }
        if (iOrdinal == 4) {
            return new yug0(DEFAULT_INSTANCE);
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
        synchronized (MarqueeOptOutEvent.class) {
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
        this.bitField0_ |= 1;
        this.event_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.lineitemId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.reason_ = str;
    }

    public final void setArtist(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.artist_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

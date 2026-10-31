package com.spotify.home.slotloading.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.md91;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SlotContentLoadingEvent extends h implements v2j0 {
    public static final int CACHE_HIT_FIELD_NUMBER = 5;
    private static final SlotContentLoadingEvent DEFAULT_INSTANCE;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int IS_OFFLINE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SLOT_RESPONSE_ID_FIELD_NUMBER = 3;
    public static final int SLOT_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean cacheHit_;
    private boolean isOffline_;
    private String feedId_ = "";
    private String slotResponseId_ = "";
    private String slotType_ = "";

    static {
        SlotContentLoadingEvent slotContentLoadingEvent = new SlotContentLoadingEvent();
        DEFAULT_INSTANCE = slotContentLoadingEvent;
        h.registerDefaultInstance(SlotContentLoadingEvent.class, slotContentLoadingEvent);
    }

    private SlotContentLoadingEvent() {
    }

    public static md91 n() {
        return (md91) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "feedId_", "slotResponseId_", "slotType_", "cacheHit_", "isOffline_"});
        }
        if (iOrdinal == 3) {
            return new SlotContentLoadingEvent();
        }
        if (iOrdinal == 4) {
            return new md91(DEFAULT_INSTANCE);
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
        synchronized (SlotContentLoadingEvent.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 8;
        this.cacheHit_ = z;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.feedId_ = str;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 16;
        this.isOffline_ = z;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.slotResponseId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.slotType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

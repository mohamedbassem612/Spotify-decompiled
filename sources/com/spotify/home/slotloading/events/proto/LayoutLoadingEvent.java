package com.spotify.home.slotloading.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.b290;
import p.bf40;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.tlb0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LayoutLoadingEvent extends h implements v2j0 {
    public static final int CACHE_HIT_FIELD_NUMBER = 4;
    private static final LayoutLoadingEvent DEFAULT_INSTANCE;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int IS_BACKGROUND_FIELD_NUMBER = 6;
    public static final int IS_OFFLINE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SLOT_TYPES_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean cacheHit_;
    private boolean isBackground_;
    private boolean isOffline_;
    private String feedId_ = "";
    private b290 slotTypes_ = h.emptyIntList();

    static {
        LayoutLoadingEvent layoutLoadingEvent = new LayoutLoadingEvent();
        DEFAULT_INSTANCE = layoutLoadingEvent;
        h.registerDefaultInstance(LayoutLoadingEvent.class, layoutLoadingEvent);
    }

    private LayoutLoadingEvent() {
    }

    public static tlb0 o() {
        return (tlb0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u0016\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"bitField0_", "feedId_", "slotTypes_", "cacheHit_", "isOffline_", "isBackground_"});
        }
        if (iOrdinal == 3) {
            return new LayoutLoadingEvent();
        }
        if (iOrdinal == 4) {
            return new tlb0(DEFAULT_INSTANCE);
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
        synchronized (LayoutLoadingEvent.class) {
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

    public final void n(ArrayList arrayList) {
        b290 b290VarMutableCopy = this.slotTypes_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.slotTypes_ = b290VarMutableCopy;
        }
        s8.addAll(arrayList, b290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(boolean z) {
        this.bitField0_ |= 2;
        this.cacheHit_ = z;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.feedId_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 8;
        this.isBackground_ = z;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 4;
        this.isOffline_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

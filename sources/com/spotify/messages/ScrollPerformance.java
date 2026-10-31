package com.spotify.messages;

import p.as41;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ScrollPerformance extends com.google.protobuf.h implements v2j0 {
    public static final int CONTAINER_ID_FIELD_NUMBER = 1;
    private static final ScrollPerformance DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int ENTITY_URI_FIELD_NUMBER = 5;
    public static final int LARGE_FRAME_DROPS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SMALL_FRAME_DROPS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int duration_;
    private long largeFrameDrops_;
    private long smallFrameDrops_;
    private String containerId_ = "";
    private String entityUri_ = "";

    static {
        ScrollPerformance scrollPerformance = new ScrollPerformance();
        DEFAULT_INSTANCE = scrollPerformance;
        com.google.protobuf.h.registerDefaultInstance(ScrollPerformance.class, scrollPerformance);
    }

    private ScrollPerformance() {
    }

    public static as41 n() {
        return (as41) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "containerId_", "duration_", "smallFrameDrops_", "largeFrameDrops_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new ScrollPerformance();
        }
        if (iOrdinal == 4) {
            return new as41(DEFAULT_INSTANCE);
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
        synchronized (ScrollPerformance.class) {
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
        this.containerId_ = str;
    }

    public final void p(long j) {
        this.bitField0_ |= 8;
        this.largeFrameDrops_ = j;
    }

    public final void q(long j) {
        this.bitField0_ |= 4;
        this.smallFrameDrops_ = j;
    }

    public final void setDuration(int i) {
        this.bitField0_ |= 2;
        this.duration_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

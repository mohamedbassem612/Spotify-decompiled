package com.spotify.campaigns.wrapped.content.impl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.ybm1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class WrappedLiveCounterShown extends h implements v2j0 {
    public static final int CARD_ID_FIELD_NUMBER = 1;
    public static final int COUNTER_DATA_AVAILABLE_FIELD_NUMBER = 2;
    public static final int COUNTER_DISPLAYED_FIELD_NUMBER = 7;
    private static final WrappedLiveCounterShown DEFAULT_INSTANCE;
    public static final int DISPLAYED_VALUE_FIELD_NUMBER = 6;
    public static final int INTERVAL_SECONDS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_END_FIELD_NUMBER = 4;
    public static final int VALUE_START_FIELD_NUMBER = 3;
    private int bitField0_;
    private String cardId_ = "";
    private boolean counterDataAvailable_;
    private boolean counterDisplayed_;
    private long displayedValue_;
    private int intervalSeconds_;
    private long valueEnd_;
    private long valueStart_;

    static {
        WrappedLiveCounterShown wrappedLiveCounterShown = new WrappedLiveCounterShown();
        DEFAULT_INSTANCE = wrappedLiveCounterShown;
        h.registerDefaultInstance(WrappedLiveCounterShown.class, wrappedLiveCounterShown);
    }

    private WrappedLiveCounterShown() {
    }

    public static ybm1 n() {
        return (ybm1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဂ\u0006\u0007ဇ\u0005", new Object[]{"bitField0_", "cardId_", "counterDataAvailable_", "valueStart_", "valueEnd_", "intervalSeconds_", "displayedValue_", "counterDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new WrappedLiveCounterShown();
        }
        if (iOrdinal == 4) {
            return new ybm1(DEFAULT_INSTANCE);
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
        synchronized (WrappedLiveCounterShown.class) {
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
        this.cardId_ = str;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 2;
        this.counterDataAvailable_ = z;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 32;
        this.counterDisplayed_ = z;
    }

    public final void r(long j) {
        this.bitField0_ |= 64;
        this.displayedValue_ = j;
    }

    public final void s(int i) {
        this.bitField0_ |= 16;
        this.intervalSeconds_ = i;
    }

    public final void t(long j) {
        this.bitField0_ |= 8;
        this.valueEnd_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 4;
        this.valueStart_ = j;
    }
}

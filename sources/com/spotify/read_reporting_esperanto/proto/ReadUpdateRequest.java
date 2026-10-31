package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ub01;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ReadUpdateRequest extends h implements v2j0 {
    private static final ReadUpdateRequest DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 2;
    public static final int IS_BACKGROUND_FIELD_NUMBER = 6;
    public static final int IS_VISIBLE_FIELD_NUMBER = 7;
    public static final int MONOTONIC_TIMESTAMP_MS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int WALL_TIMESTAMP_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private ReadInterval interval_;
    private boolean isBackground_;
    private boolean isVisible_;
    private long monotonicTimestampMs_;
    private phc sessionId_ = phc.b;
    private long wallTimestampMs_;

    static {
        ReadUpdateRequest readUpdateRequest = new ReadUpdateRequest();
        DEFAULT_INSTANCE = readUpdateRequest;
        h.registerDefaultInstance(ReadUpdateRequest.class, readUpdateRequest);
    }

    private ReadUpdateRequest() {
    }

    public static ub01 n() {
        return (ub01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000\u0004\u0002\u0005\u0002\u0006ဇ\u0001\u0007ဇ\u0002", new Object[]{"bitField0_", "sessionId_", "interval_", "wallTimestampMs_", "monotonicTimestampMs_", "isBackground_", "isVisible_"});
        }
        if (iOrdinal == 3) {
            return new ReadUpdateRequest();
        }
        if (iOrdinal == 4) {
            return new ub01(DEFAULT_INSTANCE);
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
        synchronized (ReadUpdateRequest.class) {
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

    public final void o(ReadInterval readInterval) {
        readInterval.getClass();
        this.interval_ = readInterval;
        this.bitField0_ |= 1;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 2;
        this.isBackground_ = z;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 4;
        this.isVisible_ = z;
    }

    public final void r(long j) {
        this.monotonicTimestampMs_ = j;
    }

    public final void s(phc phcVar) {
        phcVar.getClass();
        this.sessionId_ = phcVar;
    }

    public final void t(long j) {
        this.wallTimestampMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

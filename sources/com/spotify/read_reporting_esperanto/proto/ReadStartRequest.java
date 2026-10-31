package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tb01;
import p.v2j0;
import p.vg01;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ReadStartRequest extends h implements v2j0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final ReadStartRequest DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 2;
    public static final int IS_VISIBLE_FIELD_NUMBER = 8;
    public static final int MONOTONIC_TIMESTAMP_MS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_START_FIELD_NUMBER = 6;
    public static final int TOTAL_LENGTH_FIELD_NUMBER = 7;
    public static final int WALL_TIMESTAMP_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private String contentUri_ = "";
    private ReadInterval interval_;
    private boolean isVisible_;
    private long monotonicTimestampMs_;
    private int reasonStart_;
    private long totalLength_;
    private long wallTimestampMs_;

    static {
        ReadStartRequest readStartRequest = new ReadStartRequest();
        DEFAULT_INSTANCE = readStartRequest;
        h.registerDefaultInstance(ReadStartRequest.class, readStartRequest);
    }

    private ReadStartRequest() {
    }

    public static tb01 n() {
        return (tb01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0004\u0002\u0005\u0002\u0006\f\u0007\u0002\bဇ\u0001", new Object[]{"bitField0_", "contentUri_", "interval_", "wallTimestampMs_", "monotonicTimestampMs_", "reasonStart_", "totalLength_", "isVisible_"});
        }
        if (iOrdinal == 3) {
            return new ReadStartRequest();
        }
        if (iOrdinal == 4) {
            return new tb01(DEFAULT_INSTANCE);
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
        synchronized (ReadStartRequest.class) {
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
        this.contentUri_ = str;
    }

    public final void p(ReadInterval readInterval) {
        readInterval.getClass();
        this.interval_ = readInterval;
        this.bitField0_ |= 1;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 2;
        this.isVisible_ = z;
    }

    public final void r(long j) {
        this.monotonicTimestampMs_ = j;
    }

    public final void s() {
        this.reasonStart_ = vg01.REASON_START_OPEN.getNumber();
    }

    public final void t(long j) {
        this.wallTimestampMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

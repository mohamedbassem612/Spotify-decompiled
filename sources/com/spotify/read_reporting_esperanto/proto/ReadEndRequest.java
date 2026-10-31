package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ug01;
import p.v2j0;
import p.wa01;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ReadEndRequest extends h implements v2j0 {
    private static final ReadEndRequest DEFAULT_INSTANCE;
    public static final int MONOTONIC_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int WALL_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private long monotonicTimestampMs_;
    private int reasonEnd_;
    private phc sessionId_ = phc.b;
    private long wallTimestampMs_;

    static {
        ReadEndRequest readEndRequest = new ReadEndRequest();
        DEFAULT_INSTANCE = readEndRequest;
        h.registerDefaultInstance(ReadEndRequest.class, readEndRequest);
    }

    private ReadEndRequest() {
    }

    public static wa01 n() {
        return (wa01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u0002\u0003\u0002\u0004\f", new Object[]{"sessionId_", "wallTimestampMs_", "monotonicTimestampMs_", "reasonEnd_"});
        }
        if (iOrdinal == 3) {
            return new ReadEndRequest();
        }
        if (iOrdinal == 4) {
            return new wa01(DEFAULT_INSTANCE);
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
        synchronized (ReadEndRequest.class) {
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

    public final void o(long j) {
        this.monotonicTimestampMs_ = j;
    }

    public final void p() {
        this.reasonEnd_ = ug01.REASON_END_END_READ.getNumber();
    }

    public final void q(phc phcVar) {
        phcVar.getClass();
        this.sessionId_ = phcVar;
    }

    public final void r(long j) {
        this.wallTimestampMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hsz;
import p.jf40;
import p.nsz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficEvents$FailedEvent extends h implements v2j0 {
    private static final EsTrafficEvents$FailedEvent DEFAULT_INSTANCE;
    public static final int FAILURE_MESSAGE_FIELD_NUMBER = 2;
    public static final int FAILURE_REASON_FIELD_NUMBER = 5;
    public static final int METRICS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 1;
    private int bitField0_;
    private String failureMessage_ = "";
    private int failureReason_;
    private EsTrafficConnectionMetrics$ConnectionMetrics metrics_;
    private EsTrafficRequestInfo$RequestInfo request_;

    static {
        EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent = new EsTrafficEvents$FailedEvent();
        DEFAULT_INSTANCE = esTrafficEvents$FailedEvent;
        h.registerDefaultInstance(EsTrafficEvents$FailedEvent.class, esTrafficEvents$FailedEvent);
    }

    private EsTrafficEvents$FailedEvent() {
    }

    public static EsTrafficEvents$FailedEvent n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static hsz t() {
        return (hsz) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0004ဉ\u0001\u0005\f", new Object[]{"bitField0_", "request_", "failureMessage_", "metrics_", "failureReason_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$FailedEvent();
        }
        if (iOrdinal == 4) {
            return new hsz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$FailedEvent.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.failureMessage_;
    }

    public final nsz p() {
        nsz nszVar;
        int i = this.failureReason_;
        if (i == 0) {
            nszVar = nsz.FAILURE_REASON_UNSPECIFIED;
        } else if (i == 1) {
            nszVar = nsz.FAILURE_REASON_TRANSPORT_ERROR;
        } else if (i != 2) {
            nszVar = i != 3 ? null : nsz.FAILURE_REASON_CANCELLED;
        } else {
            nszVar = nsz.FAILURE_REASON_TIMEOUT;
        }
        return nszVar == null ? nsz.UNRECOGNIZED : nszVar;
    }

    public final EsTrafficConnectionMetrics$ConnectionMetrics q() {
        EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics = this.metrics_;
        return esTrafficConnectionMetrics$ConnectionMetrics == null ? EsTrafficConnectionMetrics$ConnectionMetrics.q() : esTrafficConnectionMetrics$ConnectionMetrics;
    }

    public final EsTrafficRequestInfo$RequestInfo r() {
        EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo = this.request_;
        return esTrafficRequestInfo$RequestInfo == null ? EsTrafficRequestInfo$RequestInfo.p() : esTrafficRequestInfo$RequestInfo;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.failureMessage_ = str;
    }

    public final void v(nsz nszVar) {
        this.failureReason_ = nszVar.getNumber();
    }

    public final void w(EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics) {
        this.metrics_ = esTrafficConnectionMetrics$ConnectionMetrics;
        this.bitField0_ |= 2;
    }

    public final void x(EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo) {
        this.request_ = esTrafficRequestInfo$RequestInfo;
        this.bitField0_ |= 1;
    }
}

package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.csz;
import p.jf40;
import p.osz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.usz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficTransactionMetrics$TransactionMetrics extends h implements v2j0 {
    public static final int BEARER_FIELD_NUMBER = 13;
    public static final int BODY_BYTES_SENT_FIELD_NUMBER = 2;
    public static final int BYTES_RECEIVED_FIELD_NUMBER = 3;
    public static final int BYTES_SENT_FIELD_NUMBER = 1;
    public static final int CONNECT_END_TIMESTAMP_FIELD_NUMBER = 8;
    public static final int CONNECT_START_TIMESTAMP_FIELD_NUMBER = 7;
    private static final EsTrafficTransactionMetrics$TransactionMetrics DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 16;
    public static final int IS_PROXY_CONNECTION_FIELD_NUMBER = 14;
    public static final int IS_REUSED_CONNECTION_FIELD_NUMBER = 15;
    private static volatile qzr0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 6;
    public static final int REQUEST_END_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int REQUEST_START_TIMESTAMP_FIELD_NUMBER = 9;
    public static final int REQUEST_URL_FIELD_NUMBER = 4;
    public static final int RESPONSE_END_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int RESPONSE_START_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int RESPONSE_STATUS_FIELD_NUMBER = 5;
    private int bearer_;
    private int bitField0_;
    private long bodyBytesSent_;
    private long bytesReceived_;
    private long bytesSent_;
    private long connectEndTimestamp_;
    private long connectStartTimestamp_;
    private int fetchType_;
    private boolean isProxyConnection_;
    private boolean isReusedConnection_;
    private long requestEndTimestamp_;
    private long requestStartTimestamp_;
    private long responseEndTimestamp_;
    private long responseStartTimestamp_;
    private int responseStatus_;
    private String requestUrl_ = "";
    private String protocol_ = "";

    static {
        EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics = new EsTrafficTransactionMetrics$TransactionMetrics();
        DEFAULT_INSTANCE = esTrafficTransactionMetrics$TransactionMetrics;
        h.registerDefaultInstance(EsTrafficTransactionMetrics$TransactionMetrics.class, esTrafficTransactionMetrics$TransactionMetrics);
    }

    private EsTrafficTransactionMetrics$TransactionMetrics() {
    }

    public static usz M() {
        return (usz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final long A() {
        return this.responseEndTimestamp_;
    }

    public final long B() {
        return this.responseStartTimestamp_;
    }

    public final int C() {
        return this.responseStatus_;
    }

    public final boolean D() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void N(csz cszVar) {
        this.bearer_ = cszVar.getNumber();
    }

    public final void O(long j) {
        this.bodyBytesSent_ = j;
    }

    public final void P(long j) {
        this.bytesReceived_ = j;
    }

    public final void Q(long j) {
        this.bytesSent_ = j;
    }

    public final void R(long j) {
        this.bitField0_ |= 16;
        this.connectEndTimestamp_ = j;
    }

    public final void S(long j) {
        this.bitField0_ |= 8;
        this.connectStartTimestamp_ = j;
    }

    public final void T(osz oszVar) {
        this.fetchType_ = oszVar.getNumber();
    }

    public final void U(boolean z) {
        this.isProxyConnection_ = z;
    }

    public final void V(boolean z) {
        this.isReusedConnection_ = z;
    }

    public final void W(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.protocol_ = str;
    }

    public final void X(long j) {
        this.bitField0_ |= 64;
        this.requestEndTimestamp_ = j;
    }

    public final void Y(long j) {
        this.bitField0_ |= 32;
        this.requestStartTimestamp_ = j;
    }

    public final void Z(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.requestUrl_ = str;
    }

    public final void a0(long j) {
        this.bitField0_ |= 256;
        this.responseEndTimestamp_ = j;
    }

    public final void b0(long j) {
        this.bitField0_ |= 128;
        this.responseStartTimestamp_ = j;
    }

    public final void c0(int i) {
        this.bitField0_ |= 2;
        this.responseStatus_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004ለ\u0000\u0005င\u0001\u0006ለ\u0002\u0007ဂ\u0003\bဂ\u0004\tဂ\u0005\nဂ\u0006\u000bဂ\u0007\fဂ\b\r\f\u000e\u0007\u000f\u0007\u0010\f", new Object[]{"bitField0_", "bytesSent_", "bodyBytesSent_", "bytesReceived_", "requestUrl_", "responseStatus_", "protocol_", "connectStartTimestamp_", "connectEndTimestamp_", "requestStartTimestamp_", "requestEndTimestamp_", "responseStartTimestamp_", "responseEndTimestamp_", "bearer_", "isProxyConnection_", "isReusedConnection_", "fetchType_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficTransactionMetrics$TransactionMetrics();
        }
        if (iOrdinal == 4) {
            return new usz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficTransactionMetrics$TransactionMetrics.class) {
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

    public final csz n() {
        csz cszVarA = csz.a(this.bearer_);
        return cszVarA == null ? csz.UNRECOGNIZED : cszVarA;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.bodyBytesSent_;
    }

    public final long p() {
        return this.bytesReceived_;
    }

    public final long q() {
        return this.bytesSent_;
    }

    public final long r() {
        return this.connectEndTimestamp_;
    }

    public final long s() {
        return this.connectStartTimestamp_;
    }

    public final osz t() {
        osz oszVar;
        int i = this.fetchType_;
        if (i == 0) {
            oszVar = osz.FETCH_TYPE_UNKNOWN;
        } else if (i != 1) {
            oszVar = i != 2 ? null : osz.FETCH_TYPE_LOCAL_CACHE;
        } else {
            oszVar = osz.FETCH_TYPE_NETWORK;
        }
        return oszVar == null ? osz.UNRECOGNIZED : oszVar;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.isProxyConnection_;
    }

    public final boolean v() {
        return this.isReusedConnection_;
    }

    public final String w() {
        return this.protocol_;
    }

    public final long x() {
        return this.requestEndTimestamp_;
    }

    public final long y() {
        return this.requestStartTimestamp_;
    }

    public final String z() {
        return this.requestUrl_;
    }
}

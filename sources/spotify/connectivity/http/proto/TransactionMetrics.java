package spotify.connectivity.http.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fia;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r7g1;
import p.s2j0;
import p.v2j0;
import p.w020;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class TransactionMetrics extends h implements v2j0 {
    public static final int BEARER_FIELD_NUMBER = 15;
    public static final int BYTERECEIVED_FIELD_NUMBER = 2;
    public static final int BYTESENT_FIELD_NUMBER = 1;
    public static final int CONNECTEND_FIELD_NUMBER = 7;
    public static final int CONNECTSTART_FIELD_NUMBER = 6;
    private static final TransactionMetrics DEFAULT_INSTANCE;
    public static final int FETCHTYPE_FIELD_NUMBER = 14;
    public static final int ISPROXYCONNECTION_FIELD_NUMBER = 12;
    public static final int ISREUSEDCONNECTION_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 5;
    public static final int REQUESTEND_FIELD_NUMBER = 9;
    public static final int REQUESTSTART_FIELD_NUMBER = 8;
    public static final int REQUESTURL_FIELD_NUMBER = 3;
    public static final int RESPONSEEND_FIELD_NUMBER = 11;
    public static final int RESPONSESTART_FIELD_NUMBER = 10;
    public static final int RESPONSESTATUS_FIELD_NUMBER = 4;
    private int bearer_;
    private int bitField0_;
    private long byteReceived_;
    private long byteSent_;
    private long connectEnd_;
    private long connectStart_;
    private int fetchType_;
    private boolean isProxyConnection_;
    private boolean isReusedConnection_;
    private long requestEnd_;
    private long requestStart_;
    private long responseEnd_;
    private long responseStart_;
    private int responseStatus_;
    private String requestURL_ = "";
    private String protocol_ = "";

    static {
        TransactionMetrics transactionMetrics = new TransactionMetrics();
        DEFAULT_INSTANCE = transactionMetrics;
        h.registerDefaultInstance(TransactionMetrics.class, transactionMetrics);
    }

    private TransactionMetrics() {
    }

    public static r7g1 n() {
        return (r7g1) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(long j) {
        this.bitField0_ |= 256;
        this.responseEnd_ = j;
    }

    public final void B(long j) {
        this.bitField0_ |= 128;
        this.responseStart_ = j;
    }

    public final void C(int i) {
        this.bitField0_ |= 2;
        this.responseStatus_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003ለ\u0000\u0004င\u0001\u0005ለ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\f\u0007\r\u0007\u000e\f\u000f\f", new Object[]{"bitField0_", "byteSent_", "byteReceived_", "requestURL_", "responseStatus_", "protocol_", "connectStart_", "connectEnd_", "requestStart_", "requestEnd_", "responseStart_", "responseEnd_", "isProxyConnection_", "isReusedConnection_", "fetchType_", "bearer_"});
        }
        if (iOrdinal == 3) {
            return new TransactionMetrics();
        }
        if (iOrdinal == 4) {
            return new r7g1(DEFAULT_INSTANCE);
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
        synchronized (TransactionMetrics.class) {
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

    public final void o(fia fiaVar) {
        this.bearer_ = fiaVar.getNumber();
    }

    public final void p(long j) {
        this.byteReceived_ = j;
    }

    public final void q(long j) {
        this.byteSent_ = j;
    }

    public final void r(long j) {
        this.bitField0_ |= 16;
        this.connectEnd_ = j;
    }

    public final void s(long j) {
        this.bitField0_ |= 8;
        this.connectStart_ = j;
    }

    public final void t(w020 w020Var) {
        this.fetchType_ = w020Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.isProxyConnection_ = z;
    }

    public final void v(boolean z) {
        this.isReusedConnection_ = z;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.protocol_ = str;
    }

    public final void x(long j) {
        this.bitField0_ |= 64;
        this.requestEnd_ = j;
    }

    public final void y(long j) {
        this.bitField0_ |= 32;
        this.requestStart_ = j;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.requestURL_ = str;
    }
}

package spotify.connectivity.http.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.v9l;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ConnectionMetrics extends h implements v2j0 {
    public static final int ADDITIONALCONTEXT_FIELD_NUMBER = 6;
    public static final int CONNECTIONTASKEND_FIELD_NUMBER = 4;
    public static final int CONNECTIONTASKSTART_FIELD_NUMBER = 3;
    private static final ConnectionMetrics DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECTCOUNT_FIELD_NUMBER = 2;
    public static final int TRANSACTIONMETRICS_FIELD_NUMBER = 5;
    private int bitField0_;
    private long connectionTaskEnd_;
    private long connectionTaskStart_;
    private double duration_;
    private int redirectCount_;
    private h290 transactionMetrics_ = h.emptyProtobufList();
    private String additionalContext_ = "";

    static {
        ConnectionMetrics connectionMetrics = new ConnectionMetrics();
        DEFAULT_INSTANCE = connectionMetrics;
        h.registerDefaultInstance(ConnectionMetrics.class, connectionMetrics);
    }

    private ConnectionMetrics() {
    }

    public static v9l p() {
        return (v9l) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0000\u0002င\u0000\u0003\u0002\u0004\u0002\u0005\u001b\u0006ለ\u0001", new Object[]{"bitField0_", "duration_", "redirectCount_", "connectionTaskStart_", "connectionTaskEnd_", "transactionMetrics_", TransactionMetrics.class, "additionalContext_"});
        }
        if (iOrdinal == 3) {
            return new ConnectionMetrics();
        }
        if (iOrdinal == 4) {
            return new v9l(DEFAULT_INSTANCE);
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
        synchronized (ConnectionMetrics.class) {
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
        h290 h290VarMutableCopy = this.transactionMetrics_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.transactionMetrics_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(TransactionMetrics transactionMetrics) {
        h290 h290VarMutableCopy = this.transactionMetrics_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.transactionMetrics_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(transactionMetrics);
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.additionalContext_ = str;
    }

    public final void r(long j) {
        this.connectionTaskEnd_ = j;
    }

    public final void s(long j) {
        this.connectionTaskStart_ = j;
    }

    public final void t(double d) {
        this.duration_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 1;
        this.redirectCount_ = i;
    }
}

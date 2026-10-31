package p;

import j$.time.Instant;
import j$.time.format.DateTimeParseException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m0i1 implements dwo {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public m0i1(q8n q8nVar, h0i1 h0i1Var, j0i1 j0i1Var, yqg yqgVar, zzh1 zzh1Var) {
        this.b = h0i1Var;
        this.c = j0i1Var;
        this.d = yqgVar;
        llm llmVarE = smo1.e(q8nVar);
        xab1 xab1Var = (xab1) this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (zzh1Var.a.b()) {
            this.e = fn31.T(llmVarE, (o8n) null, 0, new l0i1(this, (lnm) null), 3);
        }
    }

    public static final long a(m0i1 m0i1Var, Long l) {
        long jB = ((yqg) m0i1Var.d).b();
        long j = dqz0.b.j(7200000L);
        return l != null ? Math.min(jB + 86400000, l.longValue()) + j : jB + 86400000 + j;
    }

    public static final /* synthetic */ yqg b(m0i1 m0i1Var) {
        return (yqg) m0i1Var.d;
    }

    public static final /* synthetic */ j0i1 c(m0i1 m0i1Var) {
        return (j0i1) m0i1Var.c;
    }

    public static final /* synthetic */ h0i1 d(m0i1 m0i1Var) {
        return (h0i1) m0i1Var.b;
    }

    public static final Long e(m0i1 m0i1Var, String str) {
        if (str == null || ihc1.y0(str)) {
            return null;
        }
        try {
            return Long.valueOf(Instant.parse(str).toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final void shutdown() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = (xab1) this.e;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            default:
                ((y2g0) this.b).a(new bkk1(this, (byte) 14));
                break;
        }
    }

    public m0i1(kly0 kly0Var, kly0 kly0Var2, y2g0 y2g0Var) {
        this.b = y2g0Var;
        y2g0Var.a(new o8e1(this, kly0Var, kly0Var2, (byte) 29));
    }
}

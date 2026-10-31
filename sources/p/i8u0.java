package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i8u0 {
    public static final long m;
    public static final long n;
    public static final /* synthetic */ int o = 0;
    public final x2p1 a;
    public final yqg b;
    public final long c;
    public final long d;
    public final Function0 e;
    public int f = 1;
    public long g;
    public Long h;
    public jfv i;
    public xab1 j;
    public xab1 k;
    public xab1 l;

    static {
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.e;
        m = fdg1.k0(60, ngvVar);
        n = fdg1.k0(5, ngvVar);
    }

    public i8u0(x2p1 x2p1Var, yqg yqgVar, long j, long j2, jfv jfvVar, Function0 function0) {
        long j3;
        this.a = x2p1Var;
        this.b = yqgVar;
        this.c = j;
        this.d = j2;
        this.e = function0;
        if (jfvVar != null) {
            j3 = jfvVar.a;
        } else {
            ytw0 ytw0Var = jfv.b;
            j3 = 0;
        }
        this.g = j3;
    }

    public final void a() {
        Long l = this.h;
        if (l != null) {
            long jLongValue = l.longValue();
            ytw0 ytw0Var = jfv.b;
            yqg yqgVar = this.b;
            long jL0 = fdg1.l0(yqgVar.b() - jLongValue, ngv.d);
            if (jfv.c(jL0, 0L) > 0) {
                this.g = jfv.q(this.g, jL0);
            }
            this.h = Long.valueOf(yqgVar.b());
        }
    }

    public final void b() {
        xab1 xab1Var = this.j;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        xab1 xab1Var2 = this.k;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        xab1 xab1Var3 = this.l;
        if (xab1Var3 != null) {
            xab1Var3.d((CancellationException) null);
        }
        this.h = null;
    }

    public final void c() {
        long j;
        if (this.f != 2) {
            return;
        }
        long j2 = this.g;
        jfv jfvVar = this.i;
        x2p1 x2p1Var = this.a;
        if (x2p1Var instanceof e8u0) {
            j = this.c;
        } else {
            if (!(x2p1Var instanceof d8u0)) {
                eg.o();
                return;
            }
            jfv jfvVar2 = jfvVar != null ? new jfv(jfv.e(jfvVar.a)) : null;
            j = this.d;
            if (jfvVar2 != null && jfv.c(jfvVar2.a, 0L) > 0) {
                j = pap1.z(new jfv(j), jfvVar2).a;
            }
        }
        if (jfv.c(j2, j) >= 0) {
            this.f = 3;
            this.e.invoke();
            b();
        }
    }

    public final void d(llm llmVar) {
        int iC = l1d.C(this.f);
        yqg yqgVar = this.b;
        if (iC == 0) {
            this.f = 2;
            this.h = Long.valueOf(yqgVar.b());
            xab1 xab1Var = this.j;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.j = null;
            xab1 xab1Var2 = this.k;
            if (xab1Var2 == null || !xab1Var2.isActive()) {
                this.k = fn31.T(llmVar, (o8n) null, 0, new f3t0(this, (lnm) null, (byte) 17), 3);
                return;
            }
            return;
        }
        if (iC != 1) {
            if (iC == 2) {
                return;
            }
            eg.o();
            return;
        }
        a();
        this.h = Long.valueOf(yqgVar.b());
        xab1 xab1Var3 = this.j;
        if (xab1Var3 != null) {
            xab1Var3.d((CancellationException) null);
        }
        this.j = null;
        xab1 xab1Var4 = this.k;
        if (xab1Var4 == null || !xab1Var4.isActive()) {
            this.k = fn31.T(llmVar, (o8n) null, 0, new f3t0(this, (lnm) null, (byte) 17), 3);
        }
        c();
    }

    public final void e(llm llmVar) {
        xab1 xab1Var = this.j;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.j = null;
        this.j = fn31.T(llmVar, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 5), 3);
    }
}

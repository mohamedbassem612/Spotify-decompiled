package p;

import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import com.spotify.messages.BetamaxDownloadSession;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yma implements vma {
    public final t2j0 a;
    public final qyu b;
    public final swz0 c;
    public final llm d;
    public final xe01 e;
    public String f;
    public long g;
    public long h;
    public String i;

    public yma(t2j0 t2j0Var, qyu qyuVar, zwz0 zwz0Var, q8n q8nVar) {
        this.a = t2j0Var;
        this.b = qyuVar;
        swz0 swz0Var = new swz0(new eho0(false, false));
        this.c = swz0Var;
        llm llmVarE = smo1.e(q8nVar);
        this.d = llmVarE;
        this.e = d5p1.t(new lt20(zwz0Var.d(), new qt(this, (lnm) null, (byte) 25), (byte) 0), llmVarE, ey71.a, swz0Var);
        this.f = "unknown";
        this.i = "";
    }

    public final void a(swu swuVar, long j, long j2) {
        this.a.a(h(swuVar, j, 3, j2));
        smo1.p(this.d, (CancellationException) null);
    }

    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        this.i = str;
    }

    public final void c(swu swuVar, long j, long j2) {
        this.a.a(h(swuVar, j, 1, j2));
        smo1.p(this.d, (CancellationException) null);
    }

    public final void d(long j) {
        this.g = j;
        this.f = zod.A((uwz0) this.e.a.getValue());
    }

    public final void e(swu swuVar, long j, long j2) {
        this.a.a(h(swuVar, j, 2, j2));
        smo1.p(this.d, (CancellationException) null);
    }

    public final void f(swu swuVar, long j) {
        if (this.h == 0) {
            this.h = j;
        }
    }

    public final void g(swu swuVar, long j, BetamaxDownloadException betamaxDownloadException, long j2) {
        this.a.a(h(swuVar, j, 4, j2));
        smo1.p(this.d, (CancellationException) null);
    }

    public final BetamaxDownloadSession h(swu swuVar, long j, int i, long j2) {
        String str;
        long j3 = j2 - this.g;
        long j4 = (j - this.h) / 1000;
        long j5 = this.b.a;
        String strA = zod.A((uwz0) this.e.a.getValue());
        xma xmaVarN = BetamaxDownloadSession.n();
        xmaVarN.s();
        xmaVarN.u(swuVar.a.a);
        xmaVarN.x(swuVar.b);
        xmaVarN.t(j4);
        xmaVarN.v(j3);
        if (i == 1) {
            str = "completed";
        } else if (i == 2) {
            str = "cancelled";
        } else if (i == 3) {
            str = "stopped";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "error";
        }
        xmaVarN.w(str);
        xmaVarN.n(j5);
        xmaVarN.r(this.f);
        xmaVarN.q(strA);
        xmaVarN.y(this.i);
        return xmaVarN.build();
    }
}

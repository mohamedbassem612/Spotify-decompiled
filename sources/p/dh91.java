package p;

import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dh91 implements ewc1, nh91 {
    public boolean X;
    public hh91 Y;
    public final fvc1 a;
    public final ynb0 b;
    public final fd4 c;
    public r2a1 d;
    public final bpb1 e;
    public final bpb1 f;
    public final llm g;
    public faa0 h;
    public int i;
    public ccb1 t;

    public dh91(fvc1 fvc1Var, ynb0 ynb0Var, fd4 fd4Var, q8n q8nVar) {
        this.a = fvc1Var;
        this.b = ynb0Var;
        this.c = fd4Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.e = bpb1VarB;
        this.f = bpb1VarB;
        this.g = l1d.x(q8nVar);
    }

    @Override // p.ewc1
    public final void a(bxt bxtVar, Map map, ccb1 ccb1Var) {
        map.toString();
        Object obj = map.get("instrumentationId");
        iyk0 iyk0Var = obj instanceof iyk0 ? (iyk0) obj : null;
        if (iyk0Var == null) {
            n57.s("SmartControlNudgeRenderer missing required param: instrumentationId");
            ccb1Var.invoke(new md21(ffu.a));
            return;
        }
        Object obj2 = map.get("dismissTimeout");
        hh91 hh91Var = new hh91(new cvg1(bxtVar.getType(), bxtVar.c(), bxtVar.getName(), bxtVar.d(), bxtVar.b(), iyk0Var, bxtVar.e(), obj2 instanceof Long ? (Long) obj2 : null), this);
        synchronized (this) {
            try {
                d();
                this.t = ccb1Var;
                if (this.X) {
                    f(hh91Var);
                } else {
                    this.Y = hh91Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.ewc1
    public final void b() {
        synchronized (this) {
            d();
            this.Y = null;
            this.t = null;
            this.e.l((Object) null);
        }
    }

    @Override // p.nh91
    public final void c(int i) {
        us71.p(i);
        synchronized (this) {
            try {
                int iC = l1d.C(i);
                if (iC == 0) {
                    ccb1 ccb1Var = this.t;
                    if (ccb1Var != null) {
                        ccb1Var.invoke(nd21.a);
                    }
                } else if (iC == 1) {
                    e();
                } else {
                    if (iC != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ccb1 ccb1Var2 = this.t;
                    if (ccb1Var2 != null) {
                        ccb1Var2.invoke(new od21(new l7y("connect")));
                    }
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.h = null;
        this.i++;
    }

    public final void e() {
        ccb1 ccb1Var = this.t;
        if (ccb1Var != null) {
            ccb1Var.invoke(new md21());
        }
        this.t = null;
        this.e.l((Object) null);
    }

    public final void f(hh91 hh91Var) {
        long jA = this.c.a();
        if (jA == 0 || ((Boolean) ((qor) this.b.get()).l.a.getValue()).booleanValue()) {
            this.e.l(hh91Var);
        } else {
            this.h = c921.y(this.g, (o8n) null, 0, new ch91(jA, this, this.i, hh91Var, (lnm) null), 3);
        }
    }

    @Override // p.nh91
    public final mr20 getState() {
        return this.f;
    }

    @Override // p.ewc1
    public final jwc1 getSurface() {
        return eh91.a;
    }

    @Override // p.nh91
    public final void start() {
        this.d = this.a.d(this);
        synchronized (this) {
            this.X = true;
            hh91 hh91Var = this.Y;
            if (hh91Var != null) {
                this.Y = null;
                f(hh91Var);
            }
        }
    }

    @Override // p.nh91
    public final void stop() {
        synchronized (this) {
            d();
            boolean z = false;
            this.X = false;
            if (this.Y == null && this.t != null) {
                z = true;
            }
            if (z) {
                e();
            }
        }
        r2a1 r2a1Var = this.d;
        if (r2a1Var != null) {
            r2a1Var.e();
        }
        this.d = null;
    }
}

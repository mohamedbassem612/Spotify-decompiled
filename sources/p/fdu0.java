package p;

import android.os.Handler;
import com.spotify.player.model.SleepTimer;
import com.spotify.player.model.command.options.TimerType;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fdu0 implements ks50 {
    public final ocu0 a;
    public final yqg b;
    public final es50 c;
    public final her d;
    public final q8n e;
    public final g0l f;
    public final llm g;
    public faa0 h;
    public faa0 i;
    public final dt71 j;
    public Runnable k;
    public g991 l;
    public final phi0 m;
    public final Observable n;
    public final Observable o;

    public fdu0(ocu0 ocu0Var, yqg yqgVar, es50 es50Var, her herVar, q8n q8nVar, q8n q8nVar2, r0s0 r0s0Var, g0l g0lVar) {
        this.a = ocu0Var;
        this.b = yqgVar;
        this.c = es50Var;
        this.d = herVar;
        this.e = q8nVar2;
        this.f = g0lVar;
        this.g = cy30.t(q8nVar);
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.j = dt71VarE;
        phi0 phi0VarS = r0s0Var.s(rc11.a.b(SleepTimer.Timestamp.class));
        this.m = phi0VarS;
        xe01 xe01VarR = phi0VarS.r();
        o6x o6xVar = o6x.a;
        this.n = yoi1.i(xe01VarR, o6xVar);
        this.o = yoi1.i(dt71VarE, o6xVar);
    }

    @Override // p.ks50
    public final void a(g991 g991Var) {
        this.l = g991Var;
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.h = c921.y(this.g, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 7), 3);
    }

    @Override // p.ks50
    public final void b() {
        TimerType.Clear clear = TimerType.clear();
        ocu0 ocu0Var = this.a;
        faa0 faa0Var = ocu0Var.c;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        ocu0Var.c = c921.y(ocu0Var.b, (o8n) null, 0, new ncu0(ocu0Var, clear, (lnm) null), 3);
    }

    @Override // p.ks50
    public final void c(Object obj) {
        long jA = ((kke1) obj).a() / 1000;
        if (jA > 0) {
            TimerType.Duration durationCreate = TimerType.Duration.create(jA);
            ocu0 ocu0Var = this.a;
            faa0 faa0Var = ocu0Var.c;
            if (faa0Var != null) {
                faa0Var.d(null);
            }
            ocu0Var.c = c921.y(ocu0Var.b, (o8n) null, 0, new ncu0(ocu0Var, durationCreate, (lnm) null), 3);
        }
        l0l l0lVarC = this.f.c();
        if (l0lVarC == null || l0lVarC.C()) {
            return;
        }
        this.j.a(e991.a);
    }

    @Override // p.ks50
    public final boolean d() {
        return ((Boolean) this.m.r().a.getValue()).booleanValue();
    }

    @Override // p.ks50
    public final Observable e() {
        return this.n;
    }

    @Override // p.ks50
    public final long f() {
        SleepTimer.Timestamp timestamp = (SleepTimer.Timestamp) ((xe01) this.m.o()).a.getValue();
        if (timestamp != null) {
            return Math.max(timestamp.timestamp - this.b.b(), 0L);
        }
        return 0L;
    }

    @Override // p.ks50
    public final Observable g() {
        return this.o;
    }

    public final void h() {
        Runnable runnable = this.k;
        if (runnable != null) {
            Handler handler = this.c.a;
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
            this.k = null;
            faa0 faa0Var = this.i;
            if (faa0Var != null) {
                faa0Var.d(null);
            }
            g991 g991Var = this.l;
            if (g991Var != null) {
                g991Var.a(va91.f);
            } else {
                u890.C("statusHandler");
                throw null;
            }
        }
    }

    @Override // p.ks50
    public final void stop() {
        this.k = null;
        faa0 faa0Var = this.i;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        faa0 faa0Var2 = this.h;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
        faa0 faa0Var3 = this.a.c;
        if (faa0Var3 != null) {
            faa0Var3.d(null);
        }
    }
}

package p;

import com.spotify.player.model.SleepTimer;
import com.spotify.player.model.command.options.TimerType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class adu0 implements ks50 {
    public final ocu0 a;
    public final g0l b;
    public final llm c;
    public faa0 d;
    public final dt71 e;
    public final phi0 f;
    public final ve01 g;
    public final Observable h;
    public g991 i;
    public final Observable j;

    public adu0(ocu0 ocu0Var, Flowable flowable, q8n q8nVar, r0s0 r0s0Var, g0l g0lVar) {
        this.a = ocu0Var;
        this.b = g0lVar;
        llm llmVarT = cy30.t(q8nVar);
        this.c = llmVarT;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.e = dt71VarE;
        phi0 phi0VarS = r0s0Var.s(rc11.a.b(SleepTimer.EndOfTrack.class));
        this.f = phi0VarS;
        vbm[] vbmVarArr = q601.a;
        this.g = d5p1.r(new kge(flowable), llmVarT, ey71.a, 1);
        xe01 xe01VarR = phi0VarS.r();
        o6x o6xVar = o6x.a;
        this.h = yoi1.i(xe01VarR, o6xVar);
        this.j = yoi1.i(dt71VarE, o6xVar);
    }

    @Override // p.ks50
    public final void a(g991 g991Var) {
        this.i = g991Var;
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.d = c921.y(this.c, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 6), 3);
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
        g991 g991Var = this.i;
        if (g991Var != null) {
            g991Var.a(va91.f);
        } else {
            u890.C("statusHandler");
            throw null;
        }
    }

    @Override // p.ks50
    public final void c(Object obj) {
        TimerType.EndOfTrack endOfTrack = TimerType.endOfTrack();
        ocu0 ocu0Var = this.a;
        faa0 faa0Var = ocu0Var.c;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        ocu0Var.c = c921.y(ocu0Var.b, (o8n) null, 0, new ncu0(ocu0Var, endOfTrack, (lnm) null), 3);
        l0l l0lVarC = this.b.c();
        if (l0lVarC == null || l0lVarC.C()) {
            return;
        }
        this.e.a(e991.a);
    }

    @Override // p.ks50
    public final boolean d() {
        return ((Boolean) this.f.r().a.getValue()).booleanValue();
    }

    @Override // p.ks50
    public final Observable e() {
        return this.h;
    }

    @Override // p.ks50
    public final Observable g() {
        return this.j;
    }

    @Override // p.ks50
    public final void stop() {
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        faa0 faa0Var2 = this.a.c;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
    }
}

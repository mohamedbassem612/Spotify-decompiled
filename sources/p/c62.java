package p;

import android.view.ViewGroup;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c62 extends r3g1 {
    public final t4d1 N0;
    public final a42 O0;
    public final Observable P0;
    public final j62 Q0;
    public final xn0 R0;
    public final pxc S0;
    public final Flowable T0;
    public final Scheduler U0;
    public final vku V0 = new vku();
    public final gid X;
    public final kr60 Y;
    public final x5j1 Z;

    public c62(gid gidVar, kr60 kr60Var, x5j1 x5j1Var, t4d1 t4d1Var, a42 a42Var, Observable observable, j62 j62Var, xn0 xn0Var, pxc pxcVar, Flowable flowable, Scheduler scheduler) {
        this.X = gidVar;
        this.Y = kr60Var;
        this.Z = x5j1Var;
        this.N0 = t4d1Var;
        this.O0 = a42Var;
        this.P0 = observable;
        this.Q0 = j62Var;
        this.R0 = xn0Var;
        this.S0 = pxcVar;
        this.T0 = flowable;
        this.U0 = scheduler;
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void u(e711 e711Var) {
        e711Var.H();
        this.V0.c();
    }

    public final int g(int i) {
        ContextTrack contextTrackD = D(i);
        if (u890.j(contextTrackD.metadata().get("ad.companion.type"), "survey")) {
            return rc11.a.b(t4d1.class).hashCode();
        }
        if (y3o1.c0(contextTrackD) && ((hnl) this.X.c).a()) {
            return rc11.a.b(gid.class).hashCode();
        }
        if (l4o1.E(contextTrackD) && s3o1.v(contextTrackD, false) && y3o1.e0(contextTrackD)) {
            return rc11.a.b(x5j1.class).hashCode();
        }
        return (l4o1.E(contextTrackD) && s3o1.v(contextTrackD, false)) ? rc11.a.b(kr60.class).hashCode() : rc11.a.b(a42.class).hashCode();
    }

    public final void n(int i, w611 w611Var) {
        ((e711) w611Var).E(i, D(i));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        jd11 jd11Var = rc11.a;
        if (i != jd11Var.b(gid.class).hashCode()) {
            if (i == jd11Var.b(kr60.class).hashCode()) {
                return ((sxo) this.Y.b).a(viewGroup, null, new qr60(xoi1.c(viewGroup.getContext()) ? dlm.f : dlm.e, y2k1.c, false, false, false, false, false, false, true, false, false, false, false), hh60.g);
            }
            if (i == jd11Var.b(x5j1.class).hashCode()) {
                dxy dxyVar = (dxy) this.Z.b;
                return new y5j1((Observable) dxyVar.b, (w2k1) dxyVar.e, (gw70) dxyVar.c, (Scheduler) dxyVar.f, (zm4) dxyVar.g, viewGroup, (iac0) dxyVar.d);
            }
            if (i == jd11Var.b(t4d1.class).hashCode()) {
                ua91 ua91Var = (ua91) this.N0.b;
                return new k7d1(viewGroup, (Observable) ua91Var.b, (txo) ua91Var.c, (u601) ua91Var.d, (wx8) ua91Var.e);
            }
            this.V0.a(this.P0.firstOrError().subscribe(new b62(this, (byte) 0), nm.i));
            g3 g3Var = new g3(this, (byte) 28);
            ycc1 ycc1Var = (ycc1) this.O0.b;
            return new b42((gw70) ycc1Var.b, viewGroup, (u601) ycc1Var.c, g3Var);
        }
        rxo rxoVar = (rxo) this.X.b;
        rxoVar.getClass();
        wxo wxoVar = (wxo) rxoVar.a.c;
        Observable observable = (Observable) wxoVar.z.get();
        f62 f62Var = (f62) wxoVar.b;
        m2p m2pVarR0 = f62Var.R0();
        c8o.l(m2pVarR0);
        Single singleW0 = f62Var.W0();
        c8o.l(singleW0);
        kma kmaVarE0 = f62Var.e0();
        c8o.l(kmaVarE0);
        gw70 gw70Var = (gw70) wxoVar.h.get();
        u601 u601VarT = f62Var.t();
        c8o.l(u601VarT);
        return new kid(observable, m2pVarR0, singleW0, kmaVarE0, gw70Var, u601VarT, (Scheduler) wxoVar.d.get(), (iac0) wxoVar.A.get(), (zm4) wxoVar.e.get(), viewGroup);
    }
}

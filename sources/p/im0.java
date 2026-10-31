package p;

import android.os.Bundle;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class im0 implements wpw {
    public final Object X;
    public final rsw Y;
    public final rqw Z;
    public final /* synthetic */ byte a;
    public final Flowable b;
    public final mqw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public im0(Flowable flowable, xh71 xh71Var, fbm fbmVar, qzh qzhVar, poj0 poj0Var, q8n q8nVar, iac0 iac0Var, u601 u601Var, jge jgeVar, f771 f771Var, boolean z) {
        js20 js20VarY;
        this.a = (byte) 2;
        this.b = flowable;
        this.d = xh71Var;
        this.e = fbmVar;
        this.f = qzhVar;
        this.g = poj0Var;
        this.h = q8nVar;
        this.i = iac0Var;
        this.t = u601Var;
        this.X = f771Var;
        if (z) {
            vbm[] vbmVarArr = q601.a;
            js20VarY = w3p1.p(hu20.e(rqt0.u(new zo51(new kge(flowable), this, (byte) 11)), new af01((lnm) null, this, (byte) 17)), s571.c, qr51.d1, (o8n) null, new z671(this, (byte) 0), 8);
        } else {
            js20VarY = y3o1.Y(Flowable.h(flowable.s(pdx0.X), Flowable.F(q601.b(jgeVar)).U(Boolean.TRUE), rdx0.t), s571.d, new fk01(this, (byte) 20), new z671(this, (byte) 1), 8);
        }
        this.c = js20VarY;
        s571 s571Var = s571.e;
        this.Y = new kjv(new z671(this, (byte) 2), s571.f, new u841(this, (byte) 22), s571Var);
        this.Z = n3o1.q(this).a(vy61.t, vy61.X);
    }

    public static final /* synthetic */ ijr e(im0 im0Var) {
        return (ijr) im0Var.e;
    }

    public static boolean f(ContextTrack contextTrack) {
        return l4o1.W(contextTrack) || l4o1.P(contextTrack) || nhc1.Y(contextTrack.uri(), "spotify:room:", false) || l4o1.O(contextTrack) || l4o1.L(contextTrack);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.Z;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.Y;
    }

    public wa71 g(PlayerState playerState) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        contextTrack.getClass();
        if (l4o1.G(contextTrack) || l4o1.O(contextTrack)) {
            return new wa71(playerState.contextUri(), (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126);
        }
        if (l4o1.U(contextTrack)) {
            return new wa71(l4o1.b0(contextTrack), (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126);
        }
        return new wa71(contextTrack.uri(), ((fbm) this.e).invoke(playerState).booleanValue() ? playerState.contextUri() : null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 124);
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }

    public im0(Flowable flowable, Flowable flowable2, ijr ijrVar, h98 h98Var, ip91 ip91Var, mzr0 mzr0Var, k2q k2qVar, w9u0 w9u0Var, jo91 jo91Var) {
        this.a = (byte) 1;
        this.b = flowable;
        this.d = flowable2;
        this.e = ijrVar;
        this.f = h98Var;
        this.g = ip91Var;
        this.h = mzr0Var;
        this.i = k2qVar;
        this.t = w9u0Var;
        this.X = jo91Var;
        this.c = y3o1.Y(flowable.J(m9x0.g).s(n9x0.g).X(new rut0(this, (byte) 27)), i021.N0, rs11.N0, new r621(this, (byte) 0), 8);
        this.Y = lnn1.h(i021.O0, i021.P0, new r621(this, (byte) 1));
        this.Z = n3o1.q(this).a(ok11.a1, ok11.b1);
    }

    public im0(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, h691 h691Var, Flowable flowable3, o241 o241Var, kly0 kly0Var, fkf1 fkf1Var, dvs dvsVar) {
        this.a = (byte) 3;
        this.b = flowable;
        this.d = flowable2;
        this.e = w9u0Var;
        this.f = h691Var;
        this.g = o241Var;
        this.h = kly0Var;
        this.i = fkf1Var;
        this.t = dvsVar;
        this.X = new idd1(new j4f1(this, (byte) 7));
        this.c = y3o1.Y(Flowable.K(Flowable.h(flowable.s(bjx0.S0), ((p241) o241Var).a.map(mgx0.R0).distinctUntilChanged().onErrorReturnItem(Boolean.TRUE).toFlowable(BackpressureStrategy.d), y1x0.S0).J(a2x0.T0), flowable3.X(new dn81(this, (byte) 20))), udf1.N0, new rvd1(this, (byte) 11), new jkf1(this, (byte) 0), 8);
        this.Z = new eih1();
        this.Y = lnn1.h(udf1.O0, udf1.P0, new jkf1(this, (byte) 1));
    }

    public im0(Observable observable, Flowable flowable, Scheduler scheduler, a62 a62Var, ao0 ao0Var, j62 j62Var, xfx xfxVar, u601 u601Var, hnl hnlVar) {
        this.a = (byte) 0;
        this.d = observable;
        this.b = flowable;
        this.e = scheduler;
        this.f = a62Var;
        this.g = ao0Var;
        this.h = j62Var;
        this.i = xfxVar;
        this.t = u601Var;
        this.X = hnlVar;
        this.c = y3o1.Y(observable.toFlowable(BackpressureStrategy.d), di0.h, new ab(this, (byte) 13), new j2(this, (byte) 11), 8);
        this.Y = jch0.j(new gm0(this, (byte) 1));
        this.Z = new eih1();
    }
}

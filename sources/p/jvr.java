package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jvr implements a4l {
    public final apr a;
    public final idd1 b;
    public final rku c;
    public final PublishSubject d;

    public jvr(ynb0 ynb0Var, apr aprVar) {
        this.a = aprVar;
        idd1 idd1Var = new idd1(new dl3(ynb0Var, (byte) 2));
        this.b = idd1Var;
        this.c = new rku();
        this.d = ((ivr) idd1Var.getValue()).b.d.m();
    }

    @Override // p.a4l
    public final void a() {
        this.c.a();
    }

    @Override // p.a4l
    public final void b() {
        if (this.a.c()) {
            return;
        }
        lvr lvrVar = (lvr) ((ivr) this.b.getValue()).a;
        lvrVar.getClass();
        Observable observableNever = Observable.never();
        mvr mvrVar = lvrVar.c;
        MobiusLoop.Builder builderD = Mobius.d(kvr.a, RxConnectables.a(oou.a(mvrVar.d)));
        Observable observable = lvrVar.a;
        Flowable flowable = lvrVar.b;
        this.c.b(observableNever.compose(RxMobius.b(l1d.g(builderD.h(w2g0.t(observable, x0d.j(flowable, flowable), mvrVar.c.l(), hqq0.J(lvrVar.d)))), new xou(null, new r3l(false), new n0u0(false, false), new fa61(2), new fa61(3)))).distinctUntilChanged().subscribe());
    }
}

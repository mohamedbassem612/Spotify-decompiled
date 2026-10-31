package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zsk1 implements a4l {
    public final BehaviorSubject X;
    public final ynb0 a;
    public final BehaviorSubject b;
    public final BehaviorSubject c;
    public final BehaviorSubject d;
    public final bpb1 e;
    public final xe01 f;
    public final rku g;
    public xsk1 h;
    public final BehaviorSubject i;
    public final BehaviorSubject t;

    public zsk1(ynb0 ynb0Var) {
        this.a = ynb0Var;
        j5 j5Var = j5.a;
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(j5Var);
        this.b = behaviorSubjectG;
        BehaviorSubject behaviorSubjectG2 = BehaviorSubject.g(j5Var);
        this.c = behaviorSubjectG2;
        BehaviorSubject behaviorSubjectG3 = BehaviorSubject.g(j5Var);
        this.d = behaviorSubjectG3;
        bpb1 bpb1VarB = gio1.b(b7x.a);
        this.e = bpb1VarB;
        this.f = d5p1.h(bpb1VarB);
        this.g = new rku();
        this.i = behaviorSubjectG;
        this.t = behaviorSubjectG2;
        this.X = behaviorSubjectG3;
    }

    @Override // p.a4l
    public final void a() {
        this.g.a();
        BehaviorSubject behaviorSubject = this.b;
        j5 j5Var = j5.a;
        behaviorSubject.onNext(j5Var);
        this.c.onNext(j5Var);
        this.d.onNext(j5Var);
        this.e.m((Object) null, b7x.a);
        this.h = new xsk1(2047, false);
    }

    @Override // p.a4l
    public final void b() {
        jzs jzsVar = (jzs) ((rsk1) this.a.get());
        jzsVar.getClass();
        Observable observableNever = Observable.never();
        MobiusLoop.Builder builderD = Mobius.d(izs.a, RxConnectables.a(urk1.a(jzsVar.d, jzsVar.g, jzsVar.h, jzsVar.f, jzsVar.j, jzsVar.k)));
        q900 q900Var = jzsVar.a;
        q900Var.getClass();
        Observable observableSubscribeOn = Observable.defer(new o900(q900Var, (byte) 0)).subscribeOn(q900Var.a);
        agr agrVar = jzsVar.b;
        g0l g0lVar = jzsVar.c;
        onr onrVar = jzsVar.d;
        l6s l6sVar = jzsVar.e;
        jks jksVar = jzsVar.l;
        Scheduler scheduler = jzsVar.f;
        BehaviorSubject behaviorSubject = jzsVar.i.e;
        boolean zIsEnabled = jzsVar.f58p.isEnabled();
        o6x o6xVar = o6x.a;
        this.g.b(observableNever.compose(RxMobius.b(l1d.g(builderD.h(dro.H(observableSubscribeOn, agrVar, g0lVar, onrVar, l6sVar, jksVar, scheduler, behaviorSubject, zIsEnabled ? yoi1.i(jzsVar.n.h, o6xVar) : Observable.combineLatest(yoi1.i(jzsVar.m.b, o6xVar), ((inr) jzsVar.c).d(), new m4c(jzsVar, (byte) 7))))), new xsk1(1791, jzsVar.o.isEnabled()))).subscribe(new rdj1(this, (byte) 6)));
    }
}

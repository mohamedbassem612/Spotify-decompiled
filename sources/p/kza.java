package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kza implements vek1 {
    public final nfa0 a;
    public final Activity b;
    public final e3b c;
    public final it8 d;
    public final String e;
    public final koc0 f;
    public final bct g;
    public final Scheduler h;
    public final pp i;
    public final sb7 j;
    public final rku k = new rku();
    public final BehaviorSubject l;
    public qzh m;
    public final ezc n;
    public final jza o;

    public kza(nfa0 nfa0Var, Activity activity, e3b e3bVar, it8 it8Var, String str, koc0 koc0Var, bct bctVar, Scheduler scheduler, pp ppVar, sb7 sb7Var) {
        this.a = nfa0Var;
        this.b = activity;
        this.c = e3bVar;
        this.d = it8Var;
        this.e = str;
        this.f = koc0Var;
        this.g = bctVar;
        this.h = scheduler;
        this.i = ppVar;
        this.j = sb7Var;
        new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191);
        if ((15871 & 32) != 0) {
            new kby((String) null, -1);
        }
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.l = behaviorSubjectF;
        this.n = yoi1.g(behaviorSubjectF);
        this.o = new jza(this, (byte) 1);
    }

    @Override // p.anc0
    public final void a() {
        this.k.a();
    }

    @Override // p.anc0
    public final void b() {
        this.k.b(Observable.combineLatest(yoi1.i(new te1(d3p1.F(this.g.b, lvx.m(), rih1.a), (byte) 8), o6x.a), ((roc0) this.f).e(), s321.Z).observeOn(this.h).subscribe(new mba(this, (byte) 3)));
    }

    @Override // p.vek1
    public final mr20 getShow() {
        return this.n;
    }

    @Override // p.vek1
    public final iu30 m() {
        return this.o;
    }
}

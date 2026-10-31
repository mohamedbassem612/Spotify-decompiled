package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class apr implements a4l {
    public final o241 a;
    public final jo20 b;
    public final BehaviorSubject c;
    public final rku d;
    public final BehaviorSubject e;

    public apr(o241 o241Var, jo20 jo20Var) {
        this.a = o241Var;
        this.b = jo20Var;
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.c = behaviorSubjectF;
        this.d = new rku();
        this.e = behaviorSubjectF;
    }

    @Override // p.a4l
    public final void a() {
        this.d.a();
    }

    @Override // p.a4l
    public final void b() {
        this.d.b(((p241) this.a).a.map(new rmr(this, (byte) 1)).distinctUntilChanged().subscribe(new rc6(this.c, (byte) 4)));
    }

    public final boolean c() {
        return u890.j(this.c.h(), Boolean.TRUE);
    }
}

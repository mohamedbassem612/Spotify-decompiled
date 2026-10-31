package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uq6 implements hsw {
    public final w4b1 a;
    public final Scheduler b;
    public final rku c = new rku();
    public final BehaviorSubject d;
    public final ezc e;
    public final yd91 f;

    public uq6(w4b1 w4b1Var, yzo yzoVar, Scheduler scheduler) {
        this.a = w4b1Var;
        this.b = scheduler;
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.d = behaviorSubjectF;
        this.e = yoi1.g(behaviorSubjectF);
        this.f = new yd91(3, new i26(yzoVar, (byte) 7));
    }

    @Override // p.anc0
    public final void a() {
        this.c.a();
    }

    @Override // p.anc0
    public final void b() {
        this.d.onNext(Boolean.FALSE);
        this.c.b(((Observable) this.a.b).observeOn(this.b).subscribe(new tg(this, (byte) 19)));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.f;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.e;
    }
}

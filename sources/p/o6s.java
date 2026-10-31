package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o6s implements a4l {
    public final sor a;
    public final BehaviorSubject b = BehaviorSubject.f();
    public final rku c = new rku();

    public o6s(sor sorVar) {
        this.a = sorVar;
    }

    @Override // p.a4l
    public final void a() {
        this.c.a();
    }

    @Override // p.a4l
    public final void b() {
        this.c.b(this.a.e.map(mif1.Y0).flatMap(stf0.a1).distinctUntilChanged().subscribe(new rc6(this.b, (byte) 7)));
    }
}

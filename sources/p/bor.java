package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bor implements a4l {
    public final Observable a;
    public final BehaviorSubject b = BehaviorSubject.f();
    public final rku c = new rku();

    public bor(Observable observable) {
        this.a = observable;
    }

    @Override // p.a4l
    public final void a() {
        this.c.a();
    }

    @Override // p.a4l
    public final void b() {
        this.c.b(this.a.map(fkj0.O0).startWithItem(Boolean.FALSE).subscribe(new rc6(this.b, (byte) 2)));
    }
}

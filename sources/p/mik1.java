package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mik1 implements yte0 {
    public final bbr0 a;
    public final Scheduler b;
    public final Scheduler c;
    public final Observer d;
    public final rku e = new rku();

    public mik1(bbr0 bbr0Var, Scheduler scheduler, Scheduler scheduler2, Observer observer) {
        this.a = bbr0Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = observer;
    }

    public final void a() {
        this.e.a();
    }

    public final void b() {
        Observable map = j0p1.t(this.a).subscribeOn(this.b).observeOn(this.c).map(rtw0.i);
        Observer observer = this.d;
        this.e.b(map.subscribe(new dy40(observer, (byte) 29), new rdj1(observer, (byte) 4)));
    }
}

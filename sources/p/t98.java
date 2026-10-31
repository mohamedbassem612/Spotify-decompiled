package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t98 implements f961 {
    public final zrh a;
    public final ytp0 b;
    public final q54 c;
    public final ruz d;
    public final vku e = new vku();
    public final dt71 f = mgo1.e(1, 0, 0, 6);

    public t98(t8u0 t8u0Var, zrh zrhVar, ytp0 ytp0Var, q54 q54Var) {
        this.a = zrhVar;
        this.b = ytp0Var;
        this.c = q54Var;
        this.d = t8u0Var.a(new s98((byte) 0)).a();
        Observable observable = zrhVar.d;
        Scheduler scheduler = zrhVar.c;
        zrhVar.e.b(observable.observeOn(scheduler).switchMap(new fp8(zrhVar, (byte) 24)).distinctUntilChanged().subscribeOn(scheduler).observeOn(zrhVar.b).subscribe(new yrh(this, (byte) 0), new yrh(zrhVar, (byte) 1)));
        ytp0Var.I();
    }

    public final void shutdown() {
        this.e.c();
        this.a.e.a();
        this.b.J();
    }

    public final Object getApi() {
        return this;
    }
}

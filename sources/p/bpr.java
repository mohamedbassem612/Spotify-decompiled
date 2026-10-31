package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bpr implements a4l {
    public final wqk1 a;
    public final ifs b;
    public final Scheduler c;
    public final vku d = new vku();
    public final PublishSubject e = new PublishSubject();

    public bpr(bih1 bih1Var, wqk1 wqk1Var, ifs ifsVar, Scheduler scheduler, x6m0 x6m0Var) {
        this.a = wqk1Var;
        this.b = ifsVar;
        this.c = scheduler;
    }

    @Override // p.a4l
    public final void a() {
        this.d.c();
    }

    @Override // p.a4l
    public final void b() {
        Disposable disposableSubscribe = this.b.c.map(een.c1).subscribe(new wx91(this, (byte) 11));
        vku vkuVar = this.d;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(this.e.throttleLast(200L, TimeUnit.MILLISECONDS, this.c).subscribe(new yrh(this, (byte) 17)));
    }
}

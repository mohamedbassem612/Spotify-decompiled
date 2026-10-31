package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xi61 {
    public final qhn a;
    public final kly0 b;
    public final boolean c;
    public final dma1 d;
    public final zhq0 e;
    public final Scheduler f;
    public Disposable g = EmptyDisposable.a;
    public final bpb1 h;
    public final xe01 i;
    public final xe01 j;

    public xi61(qhn qhnVar, g5t g5tVar, boolean z, dma1 dma1Var, zhq0 zhq0Var, Scheduler scheduler) {
        this.a = qhnVar;
        this.b = g5tVar;
        this.c = z;
        this.d = dma1Var;
        this.e = zhq0Var;
        this.f = scheduler;
        bpb1 bpb1VarB = gio1.b(yai1.a);
        this.h = bpb1VarB;
        this.i = zhq0Var.i();
        this.j = d5p1.h(bpb1VarB);
        new CompletableFromAction(new ruz0(this, (byte) 9)).s(scheduler).subscribe();
    }
}

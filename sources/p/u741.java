package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u741 implements vuw {
    public final goq a;
    public final r0s0 b;
    public final eyh0 c;
    public final e741 d;
    public final y2u e;
    public final boolean f;

    public u741(goq goqVar, r0s0 r0s0Var, eyh0 eyh0Var, e741 e741Var, y2u y2uVar, boolean z) {
        this.a = goqVar;
        this.b = r0s0Var;
        this.c = eyh0Var;
        this.d = e741Var;
        this.e = y2uVar;
        this.f = z;
    }

    @Override // p.vuw
    public final Observable c() {
        if (this.f) {
            Observable observableJust = Observable.just(j5.a);
            observableJust.getClass();
            return observableJust;
        }
        eyh0 eyh0Var = this.c;
        ima1 ima1Var = (dma1) eyh0Var.b;
        bma1 bma1Var = pm.b;
        ima1 ima1Var2 = ima1Var;
        Observable observableDistinctUntilChanged = yoi1.i(c4p1.F(ima1Var2.o(), ima1Var2, bma1Var, h9a1.X0), o6x.a).startWithItem(new cma1(1, Integer.valueOf(ima1Var.l(bma1Var, 0)))).map(new kr60(eyh0Var, (byte) 1)).distinctUntilChanged().switchMap(new uqv0(this, (byte) 28)).map(new mlw0(this, (byte) 25)).map(new vqv0(this, (byte) 28)).distinctUntilChanged();
        observableDistinctUntilChanged.getClass();
        return observableDistinctUntilChanged;
    }
}

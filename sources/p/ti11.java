package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ti11 implements wpw {
    public final u7h1 N0;
    public final kjv O0;
    public final u4q0 X;
    public final a1r0 Y;
    public final poy0 Z;
    public final Flowable a;
    public final xbu0 b;
    public final sas c;
    public final kvs0 d;
    public final t8r0 e;
    public final hj11 f;
    public final ij11 g;
    public final qzh h;
    public final ywv0 i;
    public final pqs t;

    public ti11(Flowable flowable, xbu0 xbu0Var, sas sasVar, kvs0 kvs0Var, t8r0 t8r0Var, hj11 hj11Var, ij11 ij11Var, qzh qzhVar, ywv0 ywv0Var, pqs pqsVar, ynb0 ynb0Var, u4q0 u4q0Var, a1r0 a1r0Var) {
        this.a = flowable;
        this.b = xbu0Var;
        this.c = sasVar;
        this.d = kvs0Var;
        this.e = t8r0Var;
        this.f = hj11Var;
        this.g = ij11Var;
        this.h = qzhVar;
        this.i = ywv0Var;
        this.t = pqsVar;
        this.X = u4q0Var;
        this.Y = a1r0Var;
        dax daxVar = (dax) ynb0Var.get();
        Flowable flowable2 = daxVar.a;
        flowable2.getClass();
        Observable observableFlatMap = new ObservableFromPublisher(flowable2).take(1L).map(v560.a1).flatMap(new lmw(daxVar, (byte) 1));
        rp91 rp91Var = rp91.b;
        this.Z = y3o1.Y(observableFlatMap.onErrorReturnItem(new sp91(rp91Var, rp91Var, rp91Var)).toFlowable(BackpressureStrategy.d).X(new n801(this, (byte) 4)), fd11.Z0, new fk01(this, (byte) 5), new si11(this, (byte) 0), 8);
        this.N0 = eth.a0((vu30) null, new f2z0(this, (byte) 27), 1);
        this.O0 = lnn1.h(fd11.a1, fd11.b1, new si11(this, (byte) 1));
    }

    public final rqw a() {
        return this.N0;
    }

    public final rsw c() {
        return this.O0;
    }

    public final mqw getBehavior() {
        return this.Z;
    }
}

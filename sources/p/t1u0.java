package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t1u0 implements f961, n1u0 {
    public xbu0 X;
    public final vku Y = new vku();
    public final ReentrantLock Z;
    public final ywp a;
    public final ywp b;
    public final Flowable c;
    public final gae d;
    public final g0l e;
    public final yqg f;
    public final e6u0 g;
    public final FlowableSingleSingle h;
    public final FlowableSingleSingle i;
    public w9u0 t;

    public t1u0(ywp ywpVar, ywp ywpVar2, Flowable flowable, gae gaeVar, g0l g0lVar, yqg yqgVar, e6u0 e6u0Var) {
        this.a = ywpVar;
        this.b = ywpVar2;
        this.c = flowable;
        this.d = gaeVar;
        this.e = g0lVar;
        this.f = yqgVar;
        this.g = e6u0Var;
        this.h = new FlowableSingleSingle(new FlowableTake(flowable.j(mo9.Z).J(cj20.Y0)));
        this.i = new FlowableSingleSingle(new FlowableTake(flowable.J(new jxp0(this, (byte) 8))));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.Z = reentrantLock;
        d(reentrantLock, new u6j0(this, (byte) 29));
    }

    public static void d(ReentrantLock reentrantLock, Function0 function0) {
        reentrantLock.lock();
        try {
            function0.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String a() {
        l0l l0lVarC = this.e.c();
        return (l0lVarC == null || l0lVarC.l()) ? "local_device" : l0lVarC.G().a;
    }

    public final boolean b() {
        return this.t == null || this.X == null;
    }

    public final Single c(int i) {
        Flowable flowable = this.c;
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).map(new sw9(this, i, (byte) 25)).map(bj20.Y0).flatMap(new vgq0(this, (byte) 9));
    }

    @Override // p.dwo
    public final void shutdown() {
        d(this.Z, new kks0(this, (byte) 19));
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}

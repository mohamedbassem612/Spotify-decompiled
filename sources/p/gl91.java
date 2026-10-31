package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gl91 implements Supplier {
    public final /* synthetic */ il91 a;
    public final /* synthetic */ AtomicReference b;

    public gl91(il91 il91Var, AtomicReference atomicReference) {
        this.a = il91Var;
        this.b = atomicReference;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        Observable observableNever = Observable.never();
        dl91 dl91Var = new dl91();
        il91 il91Var = this.a;
        dk91 dk91Var = (dk91) ((ck91) il91Var.b.get());
        dk91Var.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(pj91.class, dk91Var.a);
        subtypeEffectHandlerBuilderC.g(oj91.class, dk91Var.b);
        subtypeEffectHandlerBuilderC.g(uj91.class, dk91Var.c);
        subtypeEffectHandlerBuilderC.g(vj91.class, dk91Var.d);
        subtypeEffectHandlerBuilderC.g(tj91.class, dk91Var.e);
        subtypeEffectHandlerBuilderC.g(ak91.class, dk91Var.f);
        subtypeEffectHandlerBuilderC.g(rj91.class, dk91Var.g);
        subtypeEffectHandlerBuilderC.g(qj91.class, dk91Var.h);
        subtypeEffectHandlerBuilderC.g(sj91.class, dk91Var.i);
        subtypeEffectHandlerBuilderC.c(wj91.class, dk91Var.j);
        subtypeEffectHandlerBuilderC.c(xj91.class, dk91Var.k);
        subtypeEffectHandlerBuilderC.c(yj91.class, dk91Var.l);
        subtypeEffectHandlerBuilderC.c(zj91.class, dk91Var.m);
        subtypeEffectHandlerBuilderC.g(lj91.class, dk91Var.n);
        subtypeEffectHandlerBuilderC.g(mj91.class, dk91Var.o);
        subtypeEffectHandlerBuilderC.c(nj91.class, dk91Var.f18p);
        MobiusLoop.Builder builderD = Mobius.d(dl91Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        zk91 zk91Var = (zk91) il91Var.c.get();
        MobiusLoop.Builder builderB = builderD.h(RxEventSources.a(il91Var.t, zk91Var.a, zk91Var.b, zk91Var.c, zk91Var.d, zk91Var.e, zk91Var.f, zk91Var.g, zk91Var.h)).d(new el91(il91Var)).b(new fl91(il91Var));
        AtomicReference atomicReference = this.b;
        return observableNever.compose(RxMobius.b(builderB, atomicReference.get())).doOnNext(new eg8(atomicReference, (byte) 3));
    }
}

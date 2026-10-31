package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gj91 implements Supplier {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ hj91 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ r961 d;

    public gj91(AtomicReference atomicReference, hj91 hj91Var, String str, r961 r961Var) {
        this.a = atomicReference;
        this.b = hj91Var;
        this.c = str;
        this.d = r961Var;
    }

    public final Object get() {
        skg skgVar;
        wrn wrnVar = wrn.g;
        AtomicReference atomicReference = this.a;
        ij91 ij91Var = (ij91) atomicReference.updateAndGet(wrnVar);
        Observable observableNever = Observable.never();
        dj91 dj91Var = new dj91();
        hj91 hj91Var = this.b;
        ri91 ri91Var = (ri91) hj91Var.b.get();
        pp91 pp91Var = hj91Var.a;
        nn61 nn61Var = pp91Var.a;
        qp91 qp91Var = pp91Var.b;
        ywv0 ywv0Var = pp91Var.e;
        ri91Var.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(mi91.class, ri91Var.a);
        Scheduler scheduler = (Scheduler) ((z0q) ((ip31) ri91Var.b.a.c).c).a.z1.get();
        c8o.l(scheduler);
        r961 r961Var = this.d;
        subtypeEffectHandlerBuilderC.g(ni91.class, new yx11(r961Var, nn61Var, qp91Var, scheduler));
        subtypeEffectHandlerBuilderC.g(pi91.class, ri91Var.c);
        ri91Var.d.getClass();
        subtypeEffectHandlerBuilderC.g(oi91.class, new yx11(ywv0Var));
        subtypeEffectHandlerBuilderC.g(qi91.class, ri91Var.e);
        MobiusLoop.Builder builderD = Mobius.d(dj91Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        bj91 bj91Var = (bj91) hj91Var.c.get();
        boolean z = nn61Var != null;
        boolean z2 = pp91Var.c;
        int iC = l1d.C(pp91Var.d);
        if (iC == 0) {
            skgVar = skg.a;
        } else if (iC == 1) {
            skgVar = skg.b;
        } else if (iC == 2) {
            skgVar = skg.c;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            skgVar = skg.d;
        }
        li91 li91Var = new li91(z, z2, ywv0Var != null, skgVar, false);
        bj91Var.getClass();
        return observableNever.compose(RxMobius.b(builderD.h(RxEventSources.a(new ObservableSource[]{Observable.defer(new aj91(r961Var, (byte) 0)), new pf90(this.c, li91Var, (il91) ((ip31) bj91Var.a.a.c).b)})).d(new ej91(hj91Var)).b(new fj91(hj91Var)), ij91Var)).doOnNext(new eg8(atomicReference, (byte) 2));
    }
}

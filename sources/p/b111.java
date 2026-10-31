package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b111 extends hab0 implements iu30 {
    public final /* synthetic */ c111 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b111(c111 c111Var) {
        super(1);
        this.a = c111Var;
    }

    public final Object invoke(Object obj) {
        c111 c111Var = this.a;
        cz01 cz01Var = c111Var.c;
        sjw0 sjw0Var = c111Var.a;
        lik1 lik1Var = nik1.J4;
        yy01 yy01Var = new yy01();
        zy01 zy01Var = new zy01();
        qz01 qz01Var = cz01Var.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(gz01.class, qz01Var.d);
        dsg dsgVar = qz01Var.b;
        Scheduler scheduler = qz01Var.a;
        subtypeEffectHandlerBuilderC.d(hz01.class, dsgVar, scheduler);
        subtypeEffectHandlerBuilderC.g(iz01.class, qz01Var.g);
        subtypeEffectHandlerBuilderC.d(jz01.class, qz01Var.c, scheduler);
        subtypeEffectHandlerBuilderC.d(kz01.class, qz01Var.h.a(lik1Var), scheduler);
        subtypeEffectHandlerBuilderC.g(lz01.class, qz01Var.i);
        subtypeEffectHandlerBuilderC.g(mz01.class, qz01Var.j.a(lik1Var));
        subtypeEffectHandlerBuilderC.g(nz01.class, qz01Var.f.a(sjw0Var));
        subtypeEffectHandlerBuilderC.c(oz01.class, qz01Var.e.a(sjw0Var));
        return l1d.g(Mobius.d(zy01Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).c(cz01Var.d.x(yy01Var), new EventSource[0]).d(new az01(cz01Var)).b(new bz01(cz01Var)));
    }
}

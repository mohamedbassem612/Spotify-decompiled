package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t030 implements q030 {
    public final td41 a;
    public final g2z b;
    public final q2u c;
    public final Scheduler d;
    public final ius e;
    public final q8n f;
    public final p5 g;

    public t030(td41 td41Var, g2z g2zVar, q2u q2uVar, Scheduler scheduler, ius iusVar, q8n q8nVar, p5 p5Var) {
        this.a = td41Var;
        this.b = g2zVar;
        this.c = q2uVar;
        this.d = scheduler;
        this.e = iusVar;
        this.f = q8nVar;
        this.g = p5Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(tn3.class, this.b.B());
        subtypeEffectHandlerBuilderC.g(on3.class, new wiw((ObservableTransformer) obj, (byte) 1));
        subtypeEffectHandlerBuilderC.c(bo3.class, new r030(this, (byte) 0));
        subtypeEffectHandlerBuilderC.c(co3.class, new r030(this, (byte) 1));
        subtypeEffectHandlerBuilderC.e(un3.class, sl10.f);
        subtypeEffectHandlerBuilderC.e(uo3.class, as10.c);
        s030 s030Var = new s030(this.c, (byte) 0);
        Scheduler scheduler = this.d;
        subtypeEffectHandlerBuilderC.b(eo3.class, s030Var, scheduler);
        subtypeEffectHandlerBuilderC.d(fo3.class, new r030(this, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.e(mn3.class, new h0y(this, (byte) 12));
        viw.a(subtypeEffectHandlerBuilderC, so3.class, new gi00(this, (byte) 22));
        subtypeEffectHandlerBuilderC.c(nn3.class, dxu.Y0);
        subtypeEffectHandlerBuilderC.c(xn3.class, dxu.Z0);
        subtypeEffectHandlerBuilderC.c(qo3.class, dxu.a1);
        subtypeEffectHandlerBuilderC.c(ao3.class, dxu.b1);
        subtypeEffectHandlerBuilderC.c(kn3.class, dxu.c1);
        subtypeEffectHandlerBuilderC.c(rn3.class, dxu.d1);
        return new wiw(subtypeEffectHandlerBuilderC.h(), (byte) 0);
    }
}

package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bk71 implements mqw {
    public final /* synthetic */ e7m0 a;

    public bk71(wh71 wh71Var, za71 za71Var, q8n q8nVar) {
        t7p0 t7p0Var = t7p0.D;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        xj71 xj71Var = new xj71(wh71Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wj71.class), runSequentially.a(xj71Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uj71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ak71(za71Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vj71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yj71(za71Var)));
        this.a = sbl.z(pk71.a, t7p0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), ea71.h, qi71.t);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((kk71) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((qk71) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (qk71) this.a.a.invoke((kk71) obj);
    }
}

package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xnf0 implements mqw {
    public final /* synthetic */ e7m0 a;

    public xnf0(sjb sjbVar, cof0 cof0Var, ykf0 ykf0Var, wh71 wh71Var, oud oudVar, flw0 flw0Var, boolean z, boolean z2) {
        b3s b3sVar = b3s.c;
        klf0 klf0Var = klf0.h;
        xxb0 xxb0Var = xxb0.m;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        tnf0 tnf0Var = new tnf0(sjbVar, wh71Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pdw.class), runSequentially.a(tnf0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new unf0(cof0Var, wh71Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vnf0(ykf0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wgw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wnf0(flw0Var)));
        this.a = sbl.A(klf0Var, xxb0Var, new a(b3sVar, coroutinesSubtypeEffectHandlerBuilderI), ujf0.f, new nxx(oudVar, z, z2));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((qnf0) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((rnf0) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (rnf0) this.a.a.invoke((qnf0) obj);
    }
}

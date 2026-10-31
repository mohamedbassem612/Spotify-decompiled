package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rcm1 {
    public final yfc0 a;
    public final MobiusLoop b;
    public boolean c;

    public rcm1(l9m0 l9m0Var, yfc0 yfc0Var, ilh1 ilh1Var) {
        this.a = yfc0Var;
        xxb0 xxb0Var = xxb0.y;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        r8m0 r8m0Var = new r8m0(l9m0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hcm1.class), runSequentially.a(r8m0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(icm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s8m0(l9m0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jcm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t8m0(l9m0Var, ilh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gcm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new v8m0(l9m0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kcm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new x8m0(l9m0Var)));
        this.b = Mobius.d(xxb0Var, new a(l9m0Var.f, coroutinesSubtypeEffectHandlerBuilderI)).d(kc20.P0).e(ud20.P0).g(new ucm1(scf.a, false));
        this.c = true;
    }
}

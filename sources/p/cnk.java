package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cnk {
    public final fnk a;
    public final utw0 b;
    public final xh71 c;
    public final v1k d;
    public final a1r0 e;
    public final lzn0 f;
    public final v1k g;
    public final lc20 h;
    public final q8n i;
    public final q8n j;

    public cnk(fnk fnkVar, utw0 utw0Var, xh71 xh71Var, v1k v1kVar, a1r0 a1r0Var, lzn0 lzn0Var, v1k v1kVar2, lc20 lc20Var, q8n q8nVar, q8n q8nVar2) {
        this.a = fnkVar;
        this.b = utw0Var;
        this.c = xh71Var;
        this.d = v1kVar;
        this.e = a1r0Var;
        this.f = lzn0Var;
        this.g = v1kVar2;
        this.h = lc20Var;
        this.i = q8nVar;
        this.j = q8nVar2;
    }

    public final a a() {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        zmk zmkVar = new zmk(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(emk.class), runSequentially.a(zmkVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(imk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bnk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pmk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qmk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xmk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rmk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new smk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tmk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new umk(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lmk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vmk(this)));
        return new a(this.j, coroutinesSubtypeEffectHandlerBuilderI);
    }
}

package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u040 {
    public final kba a;
    public final kt91 b;
    public final xh71 c;
    public final lzn0 d;
    public final v5n e;
    public final q8n f;
    public final kdy0 g;
    public final a h;

    public u040(kba kbaVar, kt91 kt91Var, xh71 xh71Var, lzn0 lzn0Var, v5n v5nVar, q8n q8nVar, q8n q8nVar2, kdy0 kdy0Var) {
        this.a = kbaVar;
        this.b = kt91Var;
        this.c = xh71Var;
        this.d = lzn0Var;
        this.e = v5nVar;
        this.f = q8nVar2;
        this.g = kdy0Var;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        p040 p040Var = new p040(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oz30.class), runSequentially.a(p040Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sz30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k040(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tz30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l040(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pz30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r040(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qz30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t040(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nz30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m040(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rz30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n040(this)));
        this.h = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }
}

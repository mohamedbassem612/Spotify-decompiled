package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zhz0 {
    public final i6n0 a;
    public final e5l0 b;
    public final lzn0 c;
    public final q8n d;
    public final a e;

    public zhz0(i6n0 i6n0Var, e5l0 e5l0Var, lzn0 lzn0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = i6n0Var;
        this.b = e5l0Var;
        this.c = lzn0Var;
        this.d = q8nVar;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        yhz0 yhz0Var = new yhz0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(thz0.class), runSequentially.a(yhz0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(shz0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new whz0(this)));
        this.e = new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI);
    }
}

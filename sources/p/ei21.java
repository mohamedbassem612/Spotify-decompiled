package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ei21 implements Connectable {
    public final kt91 a;
    public final a9m b;
    public final fj21 c;
    public final cir0 d;
    public final String e;
    public final hyy0 f;
    public final a g;

    public ei21(q8n q8nVar, kt91 kt91Var, a9m a9mVar, fj21 fj21Var, koq koqVar, cir0 cir0Var) {
        this.a = kt91Var;
        this.b = a9mVar;
        this.c = fj21Var;
        this.d = cir0Var;
        String str = fj21Var.a;
        this.e = str;
        i8h1 i8h1Var = (i8h1) ((dj21) ((jnq) koqVar.a.c).c).d.get();
        c8o.l(i8h1Var);
        this.f = new hyy0(str, i8h1Var);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        bi21 bi21Var = new bi21(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vh21.class), runSequentially.a(bi21Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yh21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new di21(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xh21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ci21(this)));
        this.g = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.g.L(consumer);
    }
}

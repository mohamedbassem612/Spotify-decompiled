package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m630 implements nve0 {
    public final ccc0 a;
    public final String b;
    public final a c;
    public final t2m d;

    public m630(ccc0 ccc0Var, String str, q8n q8nVar) {
        this.a = ccc0Var;
        this.b = str;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        k630 k630Var = new k630(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m430.class), runSequentially.a(k630Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n430.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l630(this)));
        this.c = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
        this.d = t2m.u;
    }

    public final Connectable a() {
        return this.c;
    }

    public final Update b() {
        return this.d;
    }
}

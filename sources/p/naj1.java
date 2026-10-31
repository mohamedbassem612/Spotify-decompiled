package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class naj1 implements Connectable {
    public final String a;
    public final vu30 b;
    public final vu30 c;
    public final gdj1 d;
    public final q8n e;
    public final ruz f;
    public final pxc g;
    public final ao0 h;
    public final a i;

    public naj1(String str, vu30 vu30Var, vu30 vu30Var2, gdj1 gdj1Var, q8n q8nVar, q8n q8nVar2, ruz ruzVar, pxc pxcVar, ao0 ao0Var) {
        this.a = str;
        this.b = vu30Var;
        this.c = vu30Var2;
        this.d = gdj1Var;
        this.e = q8nVar2;
        this.f = ruzVar;
        this.g = pxcVar;
        this.h = ao0Var;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        kaj1 kaj1Var = new kaj1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(heu.class), runSequentially.a(kaj1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jc80.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new laj1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x9s0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jaj1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mjb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new maj1(this)));
        this.i = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.i.L(consumer);
    }
}

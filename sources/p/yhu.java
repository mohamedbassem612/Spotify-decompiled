package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yhu implements Connectable {
    public final piu a;
    public final z6n b;
    public final i01 c;
    public final pxc d;
    public final ao0 e;
    public final gid f;
    public final a g;

    public yhu(piu piuVar, z6n z6nVar, i01 i01Var, q8n q8nVar, pxc pxcVar, ao0 ao0Var, gid gidVar) {
        this.a = piuVar;
        this.b = z6nVar;
        this.c = i01Var;
        this.d = pxcVar;
        this.e = ao0Var;
        this.f = gidVar;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        thu thuVar = new thu(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gc80.class), runSequentially.a(thuVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jjb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uhu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eeu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vhu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w57.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new whu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cl21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xhu(this)));
        this.g = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.g.L(consumer);
    }
}

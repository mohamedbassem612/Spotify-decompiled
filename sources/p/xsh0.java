package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xsh0 implements Connectable {
    public final k3i0 a;
    public final q8n b;
    public iu30 c = zdh0.V0;
    public Function0 d = lxf0.Z0;
    public Function0 e = lxf0.Y0;
    public Function0 f = lxf0.a1;
    public iu30 g = zdh0.U0;
    public iu30 h = zdh0.W0;
    public final a i;

    public xsh0(k3i0 k3i0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = k3i0Var;
        this.b = q8nVar2;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ush0 ush0Var = new ush0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(erh0.class), runSequentially.a(ush0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jrh0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsh0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hrh0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new osh0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(irh0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new psh0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(grh0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qsh0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(krh0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rsh0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(frh0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ssh0(this)));
        this.i = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.i.L(consumer);
    }
}

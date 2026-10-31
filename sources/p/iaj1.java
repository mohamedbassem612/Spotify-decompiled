package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iaj1 implements Connectable {
    public final /* synthetic */ a a;

    public iaj1(waj1 waj1Var, czs czsVar, q8n q8nVar, ruz ruzVar, pxc pxcVar, p2t p2tVar, ao0 ao0Var, r0s0 r0s0Var, lr0 lr0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        z9j1 z9j1Var = new z9j1(waj1Var, ao0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(geu.class), runSequentially.a(z9j1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ic80.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aaj1(waj1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gwo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r9j1(ruzVar, waj1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ljb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new baj1(pxcVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dkb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new caj1(waj1Var, ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fkb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new daj1(czsVar, p2tVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oy.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eaj1(waj1Var, czsVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(of21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new faj1(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dm21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gaj1(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gm21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new haj1(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fas0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s9j1(czsVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v631.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t9j1(czsVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(avf.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y9j1(czsVar, waj1Var, lr0Var, ruzVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eas0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v9j1(r0s0Var, lr0Var, ruzVar)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}

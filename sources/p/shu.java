package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class shu implements Connectable {
    public final /* synthetic */ a a;

    public shu(zhu zhuVar, i01 i01Var, q8n q8nVar, pxc pxcVar, ao0 ao0Var, gid gidVar, t2j0 t2j0Var, i44 i44Var, bju bjuVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ihu ihuVar = new ihu(t2j0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ate0.class), runSequentially.a(ihuVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(usk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jhu(gidVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uj21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new khu(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(deu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mhu(zhuVar, ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kc80.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nhu(i01Var, zhuVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ijb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ohu(pxcVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xk21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new phu(ao0Var, gidVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ct21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qhu(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(em21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rhu(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hm21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dhu(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dl21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ehu(i44Var, ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v57.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fhu(i44Var, i01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hib1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ghu(bjuVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wzb1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hhu(bjuVar)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}

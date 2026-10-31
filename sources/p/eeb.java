package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eeb implements Function {
    public final /* synthetic */ feb a;

    public eeb(feb febVar) {
        this.a = febVar;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        feb febVar = this.a;
        deb debVar = new deb(febVar);
        scb scbVar = febVar.b;
        consumer.getClass();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ncb ncbVar = new ncb(scbVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tbb.class), runSequentially.a(ncbVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ecb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fcb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wbb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(obb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xbb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gcb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ybb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zbb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new acb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bcb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hcb()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new icb(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jcb(consumer, scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ibb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kcb(consumer, scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lcb(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pcb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ubb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rcb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ebb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ccb(scbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gbb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dcb(scbVar)));
        return Mobius.d(debVar, new a(b3s.c, coroutinesSubtypeEffectHandlerBuilderI));
    }
}

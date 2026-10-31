package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p22 implements Function {
    public final /* synthetic */ q22 a;

    public p22(q22 q22Var) {
        this.a = q22Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        m22 m22Var = new m22();
        q22 q22Var = this.a;
        mmw mmwVar = q22Var.b;
        consumer.getClass();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        dmw dmwVar = new dmw(mmwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mbw.class), runSequentially.a(dmwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fmw(mmwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ecw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rlw(mmwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(acw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new slw(mmwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tlw(mmwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jhw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ulw(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ihw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vlw(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(thw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wlw(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ahw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xlw(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zhw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ylw(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(biw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zlw(consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new bmw(mmwVar)));
        return l1d.g(Mobius.d(m22Var, new a(mmwVar.d, coroutinesSubtypeEffectHandlerBuilderI))).b(new n22(q22Var)).d(new o22(q22Var));
    }
}

package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ym2 extends hab0 implements iu30 {
    public final /* synthetic */ an2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym2(an2 an2Var) {
        super(1);
        this.a = an2Var;
    }

    public final Object invoke(Object obj) {
        wl2 wl2Var = this.a.c.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        pl2 pl2Var = new pl2(wl2Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bl2.class), runSequentially.a(pl2Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dl2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kl2(wl2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sk2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ll2(wl2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(al2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ml2(wl2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cl2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rl2(wl2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vk2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tl2(wl2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uk2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vl2(wl2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wk2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nl2(wl2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tk2.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ol2(wl2Var)));
        return Mobius.d(qm2.a, new a(wl2Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}

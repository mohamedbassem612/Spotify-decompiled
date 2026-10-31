package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xme0 extends hab0 implements vu30 {
    public final /* synthetic */ ane0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xme0(ane0 ane0Var) {
        super(2);
        this.a = ane0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        tme0 tme0Var = this.a.b;
        lzn0 lzn0Var = tme0Var.a;
        im01 im01Var = tme0Var.b;
        kt91 kt91Var = tme0Var.c;
        zc80 zc80Var = tme0Var.d;
        uo5 uo5Var = tme0Var.e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        wke0 wke0Var = new wke0(new rke0(zc80Var, null));
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rje0.class), cancelPrevious.a(wke0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new ale0(im01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cle0(im01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eke0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ele0(uo5Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gle0(uo5Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xke0(uo5Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dke0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yke0(im01Var, uo5Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cke0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ske0(im01Var, (cir0) obj2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tke0(lzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uke0(kt91Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vke0(kt91Var)));
        return Mobius.d(rme0.a, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}

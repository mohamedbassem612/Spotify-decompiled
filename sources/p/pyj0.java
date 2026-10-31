package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pyj0 extends hab0 implements vu30 {
    public final /* synthetic */ qyj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyj0(qyj0 qyj0Var) {
        super(2);
        this.a = qyj0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        a0k0 a0k0Var = (a0k0) ((yzj0) this.a.b.get());
        a0k0Var.getClass();
        MobiusCoroutines.Companion companion = MobiusCoroutines.a;
        zzj0 zzj0Var = new zzj0();
        xzj0 xzj0Var = a0k0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(companion);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        ozj0 ozj0Var = new ozj0(xzj0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r0k0.class), cancelPrevious.a(ozj0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zyj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new azj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new czj0()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new jzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new qzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new szj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ezj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new syj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tyj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uyj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vyj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mzj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wyj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p0k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xyj0(xzj0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f1k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yyj0(xzj0Var)));
        MobiusLoop.Builder builderD = Mobius.d(zzj0Var, new a(xzj0Var.w, coroutinesSubtypeEffectHandlerBuilderI)).b(new t7m0(a0k0Var.c, (byte) 1)).d(new t7m0(a0k0Var.d, (byte) 0));
        l4k0 l4k0Var = a0k0Var.b;
        ((cir0) obj2).j(new pd8(l4k0Var, (byte) 10));
        FlowEventSources.Companion companion2 = FlowEventSources.a;
        q8n q8nVar = l4k0Var.b;
        mr20[] mr20VarArr = {l4k0Var.e, (buz) l4k0Var.a.b};
        companion2.getClass();
        return builderD.h(new b(q8nVar, mr20VarArr));
    }
}

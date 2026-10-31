package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class grf1 implements xpw {
    public final gw70 a;
    public final iff1 b;
    public final l6m0 c;
    public final e7m0 d;
    public final psw e;

    public grf1(gw70 gw70Var, vqf1 vqf1Var, iff1 iff1Var, l6m0 l6m0Var) {
        this.a = gw70Var;
        this.b = iff1Var;
        this.c = l6m0Var;
        erf1 erf1Var = new erf1(new drf1(z6x.a));
        gp71 gp71Var = gp71.o;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        tqf1 tqf1Var = new tqf1(vqf1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wqf1.class), runSequentially.a(tqf1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xqf1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uqf1(vqf1Var)));
        this.d = sbl.B(erf1Var, gp71Var, new a(vqf1Var.c, coroutinesSubtypeEffectHandlerBuilderI), ggf1.h, new ibf1(this, (byte) 12));
        j2i j2iVar = new j2i(-1433187762, new y2f1(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return n3o1.q(this).a(new nsb1(this, (byte) 28), kle1.e1);
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}

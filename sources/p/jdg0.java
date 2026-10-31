package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jdg0 implements xpw {
    public final lzn0 a;
    public final nwa b;
    public final ezc c;
    public final ezc d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final e7m0 h;
    public final ia00 i;
    public final psw t;

    public jdg0(lzn0 lzn0Var, nwa nwaVar, ncg0 ncg0Var, ezc ezcVar, ezc ezcVar2, boolean z, boolean z2, boolean z3) {
        this.a = lzn0Var;
        this.b = nwaVar;
        this.c = ezcVar;
        this.d = ezcVar2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        j2g0 j2g0Var = j2g0.Q0;
        xxb0 xxb0Var = xxb0.p;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        zbg0 zbg0Var = new zbg0(ncg0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qbg0.class), cancelPrevious.a(zbg0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ubg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new bcg0(ncg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tbg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new dcg0(ncg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sbg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new fcg0(ncg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rbg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new hcg0(ncg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pbg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wbg0(ncg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(obg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xbg0(ncg0Var)));
        this.h = new e7m0(j2g0Var, new w6m0(xxb0Var, (byte) 0), new a(ncg0Var.e, coroutinesSubtypeEffectHandlerBuilderI), ujf0.U0, new cas());
        this.i = n3o1.q(this).a(clf0.S0, clf0.T0);
        j2i j2iVar = new j2i(-805369003, new qcd0(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}

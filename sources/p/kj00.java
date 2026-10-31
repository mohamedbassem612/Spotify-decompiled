package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kj00 implements hs80 {
    public final jj00 a;
    public MobiusLoop b;

    public kj00(jj00 jj00Var) {
        this.a = jj00Var;
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new h0y(chm0Var, (byte) 6), r4u.a(new mjv(this, (byte) 9)));
    }

    @Override // p.hs80
    public final void dispose() {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.hs80
    public final void start() {
        rve0 rve0Var = rve0.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious();
        jj00 jj00Var = this.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(skl.class), coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious.a(new hj00(jj00Var)));
        this.b = l1d.g(Mobius.d(rve0Var, new com.spotify.mobius.coroutines.a(jj00Var.c, coroutinesSubtypeEffectHandlerBuilderI)).d(f331.Q0)).g(new whx0(b7x.a));
    }
}

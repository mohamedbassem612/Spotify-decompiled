package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cin0 extends hab0 implements vu30 {
    public final /* synthetic */ din0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cin0(din0 din0Var) {
        super(2);
        this.a = din0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ain0 ain0Var = this.a.c;
        zhn0 zhn0Var = new zhn0();
        mhn0 mhn0Var = ain0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently runConcurrently = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently();
        lhn0 lhn0Var = new lhn0(mhn0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ehn0.class), runConcurrently.a(lhn0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ghn0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ihn0(mhn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fhn0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jhn0(mhn0Var)));
        return Mobius.d(zhn0Var, new a(mhn0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}

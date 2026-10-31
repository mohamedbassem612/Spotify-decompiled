package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zgg0 extends hab0 implements vu30 {
    public final /* synthetic */ ahg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgg0(ahg0 ahg0Var) {
        super(2);
        this.a = ahg0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        qgg0 qgg0Var = this.a.b.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently runConcurrently = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently();
        ogg0 ogg0Var = new ogg0(qgg0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kgg0.class), runConcurrently.a(ogg0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(igg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lgg0(qgg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jgg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mgg0(qgg0Var)));
        return Mobius.d(wgg0.a, new a(qgg0Var.c, coroutinesSubtypeEffectHandlerBuilderI));
    }
}

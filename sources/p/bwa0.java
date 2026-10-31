package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bwa0 extends hab0 implements vu30 {
    public final /* synthetic */ cwa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwa0(cwa0 cwa0Var) {
        super(2);
        this.a = cwa0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        i8w i8wVar = this.a.d.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        g8w g8wVar = new g8w(i8wVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e8w.class), runSequentially.a(g8wVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f8w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h8w(i8wVar)));
        return Mobius.d(q8w.a, new a(i8wVar.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}

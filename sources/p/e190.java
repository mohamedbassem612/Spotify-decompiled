package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e190 extends hab0 implements vu30 {
    public final /* synthetic */ f190 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e190(f190 f190Var) {
        super(2);
        this.a = f190Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        f190 f190Var = this.a;
        lzn0 lzn0Var = f190Var.a;
        q8n q8nVar = f190Var.d;
        vb2 vb2Var = f190Var.b;
        boolean z = f190Var.c.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        x090 x090Var = new x090(lzn0Var, z);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rcw.class), runSequentially.a(x090Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y090(vb2Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a190(lzn0Var)));
        return Mobius.d(b190.a, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI)).d(new c190(f190Var)).b(new d190(f190Var));
    }
}

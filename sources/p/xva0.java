package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xva0 extends hab0 implements iu30 {
    public final /* synthetic */ yva0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xva0(yva0 yva0Var) {
        super(1);
        this.a = yva0Var;
    }

    public final Object invoke(Object obj) {
        s3n s3nVar = this.a.c.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        r3n r3nVar = new r3n(s3nVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p3n.class), runSequentially.a(r3nVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o3n.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q3n(s3nVar)));
        return Mobius.d(b4n.a, new a(s3nVar.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}

package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hog implements mqw {
    public final /* synthetic */ e7m0 a;

    public hog(q8n q8nVar, q8n q8nVar2, qo71 qo71Var, dmr dmrVar, ltf1 ltf1Var, yqg yqgVar, drj0 drj0Var, z1 z1Var, izj1 izj1Var, kx70 kx70Var) {
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        w9f w9fVar = new w9f(drj0Var, yqgVar, (byte) 15);
        dq7 dq7Var = new dq7(yqgVar, (byte) 5);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        gog gogVar = new gog(qo71Var, dt71VarE);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(iog.class), runSequentially.a(gogVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mog.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zng(dmrVar, ltf1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(log.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aog(z1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kog.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cog(qo71Var, izj1Var, yqgVar, dmrVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nog.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eog(yqgVar, dmrVar, qo71Var, kx70Var)));
        this.a = sbl.A(w9fVar, dq7Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), new qff(drj0Var, (byte) 10), new xng(q8nVar2, dt71VarE, drj0Var, yqgVar));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((uog) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((xog) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (xog) this.a.a.invoke((uog) obj);
    }
}

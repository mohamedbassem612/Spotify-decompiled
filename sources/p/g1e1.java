package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g1e1 implements mqw {
    public final /* synthetic */ e7m0 a;

    public g1e1(d0r d0rVar, xid xidVar, dc31 dc31Var) {
        d1e1 d1e1Var = d1e1.a;
        dq7 dq7Var = new dq7(new gsc1(xidVar, (byte) 13), (byte) 28);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(k1e1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f1e1(d0rVar, dc31Var)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        ppd1 ppd1Var = ppd1.i;
        w6m0 w6m0Var = new w6m0(dq7Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = ppd1.t;
        this.a = new e7m0(d1e1Var, w6m0Var, aVar, ppd1Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((a1e1) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((u1e1) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (u1e1) this.a.a.invoke((a1e1) obj);
    }
}

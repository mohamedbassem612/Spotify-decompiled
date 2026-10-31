package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wr7 implements mqw {
    public final /* synthetic */ e7m0 a;

    public wr7(d0r d0rVar, xid xidVar, dc31 dc31Var, vr51 vr51Var) {
        tr7 tr7Var = tr7.a;
        dq7 dq7Var = new dq7(new pp5(xidVar, vr51Var, (byte) 19), (byte) 1);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(as7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vr7(d0rVar, dc31Var)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        c37 c37Var = c37.Q0;
        w6m0 w6m0Var = new w6m0(dq7Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = c37.R0;
        this.a = new e7m0(tr7Var, w6m0Var, aVar, c37Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((sr7) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((ks7) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (ks7) this.a.a.invoke((sr7) obj);
    }
}

package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p3k1 implements mqw {
    public final /* synthetic */ e7m0 a;

    public p3k1(d0r d0rVar, dc31 dc31Var, xid xidVar, ewn0 ewn0Var, vi11 vi11Var, ptf1 ptf1Var, Context context) {
        l3k1 l3k1Var = l3k1.a;
        t7i1 t7i1Var = new t7i1(new eii1(xidVar, context, (byte) 18), (byte) 4);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(u3k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o3k1(d0rVar, dc31Var, ewn0Var, vi11Var, ptf1Var)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        m3k1 m3k1Var = m3k1.a;
        w6m0 w6m0Var = new w6m0(t7i1Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = olj1.N0;
        this.a = new e7m0(l3k1Var, w6m0Var, aVar, m3k1Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((k3k1) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((e4k1) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (e4k1) this.a.a.invoke((k3k1) obj);
    }
}

package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b9y0 implements mqw {
    public final /* synthetic */ e7m0 a;

    public b9y0(pux0 pux0Var) {
        x8y0 x8y0Var = x8y0.a;
        wam0 wam0Var = new wam0((byte) 7);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(e9y0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a9y0(pux0Var)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        y8y0 y8y0Var = y8y0.a;
        w6m0 w6m0Var = new w6m0(wam0Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = j8y0.d;
        this.a = new e7m0(x8y0Var, w6m0Var, aVar, y8y0Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((a3y0) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((n9y0) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (n9y0) this.a.a.invoke((a3y0) obj);
    }
}

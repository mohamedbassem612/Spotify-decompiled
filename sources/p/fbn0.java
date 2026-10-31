package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fbn0 implements mqw {
    public final /* synthetic */ e7m0 a;

    public fbn0(d0r d0rVar) {
        l9n0 l9n0Var = l9n0.Y0;
        xxb0 xxb0Var = xxb0.A;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(hbn0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ebn0(d0rVar)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        b5n0 b5n0Var = b5n0.P0;
        w6m0 w6m0Var = new w6m0(xxb0Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = b5n0.Q0;
        this.a = new e7m0(l9n0Var, w6m0Var, aVar, b5n0Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((bbn0) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((rbn0) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (rbn0) this.a.a.invoke((bbn0) obj);
    }
}

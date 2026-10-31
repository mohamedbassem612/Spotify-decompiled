package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ga71 implements mqw {
    public final /* synthetic */ e7m0 a;

    public ga71(ruz ruzVar) {
        ba71 ba71Var = ba71.a;
        t7p0 t7p0Var = t7p0.C;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(wdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fa71(ruzVar)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        ca71 ca71Var = ca71.a;
        w6m0 w6m0Var = new w6m0(t7p0Var, (byte) 0);
        cas casVar = new cas();
        casVar.d = w661.e1;
        casVar.e = da71.b;
        casVar.a = ea71.b;
        this.a = new e7m0(ba71Var, w6m0Var, aVar, ca71Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((z971) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((aa71) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (aa71) this.a.a.invoke((z971) obj);
    }
}

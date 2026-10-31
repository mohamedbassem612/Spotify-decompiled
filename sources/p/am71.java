package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class am71 implements mqw {
    public final /* synthetic */ e7m0 a;

    public am71(int i, ArrayList arrayList, q8n q8nVar, flw0 flw0Var, wh71 wh71Var) {
        s2k s2kVar = new s2k(arrayList, i, (byte) 9);
        t7p0 t7p0Var = t7p0.E;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(yl71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zl71(wh71Var)));
        this.a = sbl.A(s2kVar, t7p0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), new x6w0(arrayList, i, (byte) 1), new xl71(i, arrayList, q8nVar, flw0Var, wh71Var));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((jm71) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((km71) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (km71) this.a.a.invoke((jm71) obj);
    }
}

package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jz9 implements mqw {
    public static final kcx0 b = new kcx0((byte) 29);
    public final /* synthetic */ e7m0 a;

    public jz9(dg90 dg90Var, bhf bhfVar, gqg gqgVar, q8n q8nVar, boolean z, wh71 wh71Var, oud oudVar, Context context) {
        fr9 fr9Var = fr9.O0;
        n4 n4Var = n4.n;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        gz9 gz9Var = new gz9(oudVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fz9.class), runSequentially.a(gz9Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ez9.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new iz9(gqgVar, z, context, wh71Var, dg90Var, bhfVar)));
        this.a = sbl.A(fr9Var, n4Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), vq9.e, new cz9(oudVar, q8nVar, wh71Var, (byte) 0));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((a0a) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((b0a) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (b0a) this.a.a.invoke((a0a) obj);
    }
}

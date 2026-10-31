package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v6n0 implements mqw {
    public static final ulc b = new ulc((byte) 16);
    public final /* synthetic */ e7m0 a;

    public v6n0(q8n q8nVar, Context context, r961 r961Var, gqg gqgVar, eea0 eea0Var, t8r0 t8r0Var, wh71 wh71Var, oud oudVar) {
        k4n0 k4n0Var = k4n0.U0;
        xxb0 xxb0Var = xxb0.z;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        u6n0 u6n0Var = new u6n0(r961Var, context, t8r0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p6n0.class), runSequentially.a(u6n0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q6n0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s6n0(eea0Var, wh71Var, gqgVar)));
        this.a = sbl.A(k4n0Var, xxb0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), b5n0.g, new cz9(oudVar, q8nVar, wh71Var, (byte) 1));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((d7n0) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((h7n0) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (h7n0) this.a.a.invoke((d7n0) obj);
    }
}

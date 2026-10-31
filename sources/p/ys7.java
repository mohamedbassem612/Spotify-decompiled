package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ys7 implements mqw {
    public final /* synthetic */ e7m0 a;

    public ys7(q8n q8nVar, ps7 ps7Var, wh71 wh71Var, oud oudVar, o0g1 o0g1Var, Context context, vr51 vr51Var) {
        rq7 rq7Var = rq7.N0;
        qs7 qs7Var = new qs7(context, vr51Var, (byte) 0);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        us7 us7Var = new us7(o0g1Var, ps7Var, wh71Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bt7.class), runSequentially.a(us7Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ct7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vs7(wh71Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dt7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ws7(oudVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(et7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xs7(oudVar)));
        this.a = sbl.A(rq7Var, qs7Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), c37.S0, new ss7(oudVar, q8nVar, context, (byte) 0));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((kt7) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((lt7) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (lt7) this.a.a.invoke((kt7) obj);
    }
}

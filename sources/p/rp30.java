package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rp30 implements mqw {
    public final /* synthetic */ e7m0 a;

    public rp30(d0r d0rVar, vr51 vr51Var, Context context) {
        np30 np30Var = np30.a;
        dq7 dq7Var = new dq7(new eq7(vr51Var, context, (byte) 1), (byte) 9);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(vp30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qp30(d0rVar)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        op30 op30Var = op30.a;
        w6m0 w6m0Var = new w6m0(dq7Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = bp30.d;
        this.a = new e7m0(np30Var, w6m0Var, aVar, op30Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((mp30) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((fq30) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (fq30) this.a.a.invoke((mp30) obj);
    }
}

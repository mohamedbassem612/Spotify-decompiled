package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aq7 implements mqw {
    public final /* synthetic */ e7m0 a;

    public aq7(d0r d0rVar, wh41 wh41Var, vr51 vr51Var, Context context) {
        wp7 wp7Var = wp7.a;
        dq7 dq7Var = new dq7(new eq7(vr51Var, context, (byte) 0), (byte) 0);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(gq7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zp7(d0rVar, wh41Var)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        xp7 xp7Var = xp7.a;
        w6m0 w6m0Var = new w6m0(dq7Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = c37.Z;
        this.a = new e7m0(wp7Var, w6m0Var, aVar, xp7Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((vp7) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((qq7) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (qq7) this.a.a.invoke((vp7) obj);
    }
}

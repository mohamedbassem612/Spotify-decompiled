package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zfj1 implements mqw {
    public final /* synthetic */ e7m0 a;

    public zfj1(d0r d0rVar, wh41 wh41Var, vr51 vr51Var, Context context) {
        vfj1 vfj1Var = vfj1.a;
        t7i1 t7i1Var = new t7i1(new eq7(vr51Var, context, (byte) 3), (byte) 3);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(fgj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yfj1(d0rVar, wh41Var)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        wfj1 wfj1Var = wfj1.a;
        w6m0 w6m0Var = new w6m0(t7i1Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = zhi1.Y0;
        this.a = new e7m0(vfj1Var, w6m0Var, aVar, wfj1Var, casVar);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((ufj1) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((pgj1) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (pgj1) this.a.a.invoke((ufj1) obj);
    }
}

package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ihk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wmy a;

    public ihk(wmy wmyVar) {
        this.a = wmyVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        s700 s700Var;
        String str = ((ggk) obj).e;
        wmy wmyVar = this.a;
        if (!((AtomicBoolean) wmyVar.f).get() && (s700Var = (s700) wmyVar.e) != null) {
            r800 r800Var = s700Var.Z1;
            if (r800Var != null) {
                s700Var.Z1 = new r800(k1o1.y(str, r800Var.a), r800Var.b, r800Var.c, r800Var.d);
            }
            dg30 dg30VarF0 = s700Var.f0();
            if (dg30VarF0 != null) {
                dg30VarF0.runOnUiThread(new a6n(s700Var, (byte) 18));
            }
        }
        return rih1.a;
    }
}

package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r97 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bnj0 a;

    public r97(bnj0 bnj0Var) {
        this.a = bnj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        f97 f97Var = (f97) obj;
        o3w o3wVar = f97Var.a;
        bnj0 bnj0Var = this.a;
        if (o3wVar != null) {
            if (o3wVar.a <= 0) {
                o3wVar = null;
            }
            if (o3wVar != null) {
                ((ymu0) bnj0Var.c).a(o3wVar, f97Var.c, f97Var.b, false);
            }
        }
        s1q0 s1q0Var = (Activity) ((kly0) bnj0Var.b).get();
        if (s1q0Var instanceof s1q0) {
            s1q0Var.J().d();
        } else {
            l1d.z("NavigateBackEffectHandler: Activity ", s1q0Var.getClass().getName(), " does not implement OnBackPressedDispatcherOwner");
        }
        return rih1.a;
    }
}

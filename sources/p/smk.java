package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class smk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public smk(cnk cnkVar) {
        this.a = cnkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gmk gmkVar = (gmk) obj;
        Set set = s4b1.f;
        String strS = uic.x(gmkVar.a).s();
        if (strS != null) {
            cnk cnkVar = this.a;
            Object objY = fn31.Y(cnkVar.i, new gke(cnkVar, strS, gmkVar, (lnm) null, (byte) 9), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }
}

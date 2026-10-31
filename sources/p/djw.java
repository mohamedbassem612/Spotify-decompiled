package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class djw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dlw a;

    public djw(dlw dlwVar) {
        this.a = dlwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [p.cwn0] */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        efw efwVar = (efw) obj;
        wrg wrgVar = this.a.b;
        Set set = s4b1.f;
        String strZ = uic.w(efwVar.a).z();
        Object objC = null;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (strZ != null) {
            f1n0 f1n0Var = wrgVar.a;
            tv80 tv80Var = efwVar.g;
            objC = f1n0Var.c(new dwn0(strZ, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), mno1.h(new mmr0[]{new mmr0("entityUri", efwVar.b), new mmr0("contextUri", efwVar.c), new mmr0("isPlaying", Boolean.valueOf(efwVar.d)), new mmr0("timestamp", new Long(efwVar.e)), new mmr0("isOpenedFromChat", Boolean.FALSE), new mmr0("isFollowing", Boolean.valueOf(efwVar.f instanceof ko10))}), onmVar);
            if (objC != d9nVar) {
                objC = rih1Var;
            }
        }
        return objC == d9nVar ? objC : rih1Var;
    }
}

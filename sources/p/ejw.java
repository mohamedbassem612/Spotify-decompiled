package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ejw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ elw a;

    public ejw(elw elwVar) {
        this.a = elwVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0071 A[RETURN] */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objD;
        bdw bdwVar = (bdw) obj;
        yfc0 yfc0Var = this.a.c;
        String str = bdwVar.a;
        String strH0 = ihc1.H0(str, "spotify:chat:");
        if (strH0.equals(str) || strH0.length() <= 0) {
            strH0 = null;
        }
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (strH0 != null && strH0.length() != 0) {
            f1n0 f1n0Var = (f1n0) yfc0Var.b;
            String strConcat = "spotify:listening-activity:group-details:".concat(strH0);
            tv80 tv80Var = bdwVar.b;
            objD = f1n0.d(f1n0Var, new dwn0(strConcat, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), onmVar);
            if (objD != d9nVar) {
            }
            if (objD == d9nVar) {
                return objD;
            }
            return rih1Var;
        }
        Logger.k(f4i1.f("GroupFeedActivityCarouselItem: cannot route to group details — invalid conversation URI '", bdwVar.a, "'"), new Object[0]);
        objD = rih1Var;
        if (objD == d9nVar) {
            return objD;
        }
        return rih1Var;
    }
}

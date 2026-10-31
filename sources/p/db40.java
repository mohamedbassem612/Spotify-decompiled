package p;

import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class db40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ib40 a;

    public db40(ib40 ib40Var) {
        this.a = ib40Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        int i;
        sp00 sp00Var = this.a.d;
        int iC = l1d.C(((ya40) obj).e);
        if (iC == 0) {
            i = 2131956191;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            i = 2131956186;
        }
        Object objY = fn31.Y((q8n) sp00Var.d, new h210(sp00Var, ((Resources) sp00Var.b).getString(i), (lnm) null, (byte) 23), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}

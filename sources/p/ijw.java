package p;

import android.content.Context;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ijw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ alw a;

    public ijw(alw alwVar) {
        this.a = alwVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        r961 r961Var = this.a.d;
        Object objY = fn31.Y((q8n) r961Var.d, new wp41(r961Var, new er91((fs91) null, ((Context) r961Var.b).getString(2131952570), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), (lnm) null, (byte) 14), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}

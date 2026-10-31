package p;

import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mrv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lag a;

    public mrv(lag lagVar) {
        this.a = lagVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        arv arvVar = (arv) obj;
        o3w o3wVar = arvVar.b;
        lag lagVar = this.a;
        if (o3wVar == null || !((ymu0) lagVar.c).a(o3wVar, (String) lagVar.e, arvVar.c, false)) {
            Integer num = arvVar.a;
            kt91 kt91Var = (kt91) lagVar.d;
            if (num != null) {
                n57.k(num.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            } else {
                kt91Var.b();
            }
        }
        Object objA = ((f1n0) lagVar.b).a(onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}

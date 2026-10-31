package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z56 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ y66 a;

    public z56(y66 y66Var) {
        this.a = y66Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        l56 l56Var = (l56) obj;
        y66 y66Var = this.a;
        j46 j46Var = y66Var.f;
        String str = l56Var.a;
        hma1 hma1VarEdit = j46Var.a.edit();
        Object obj2 = j46.c.get(str);
        if (obj2 == null) {
            bhn0.f("No disclosure key registered for content type: ".concat(str));
            return null;
        }
        l1d.B(j46Var.b, hma1VarEdit, (bma1) obj2);
        Object objY = fn31.Y(y66Var.e, new ry5(y66Var, l56Var, (lnm) null, (byte) 6), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}

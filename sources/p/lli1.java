package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public lli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        int i;
        nn61 nn61Var = this.a.c;
        int iOrdinal = ((bli1) obj).a.ordinal();
        if (iOrdinal == 0) {
            i = 2131963646;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            i = 2131963645;
        }
        Object objY = fn31.Y((q8n) nn61Var.c, new nx5(nn61Var, i, (lnm) null, (byte) 11), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}

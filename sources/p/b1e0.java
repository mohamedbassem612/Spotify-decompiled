package p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b1e0 {
    public final v5n a;
    public final y8c b;
    public final xvo c;
    public final String d;

    public b1e0(v5n v5nVar, y8c y8cVar, xvo xvoVar, String str) {
        this.a = v5nVar;
        this.b = y8cVar;
        this.c = xvoVar;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BrowseEffect.Load load, onm onmVar) {
        y0e0 y0e0Var;
        BrowseEvent.StructureLoaded m231Var;
        if (onmVar instanceof y0e0) {
            y0e0Var = (y0e0) onmVar;
            int i = y0e0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0e0Var.d = i - Integer.MIN_VALUE;
            } else {
                y0e0Var = new y0e0(this, onmVar);
            }
        } else {
            y0e0Var = new y0e0(this, onmVar);
        }
        Object objS = y0e0Var.b;
        int i2 = y0e0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                a1e0 a1e0Var = new a1e0(this, load, null);
                y0e0Var.a = load;
                y0e0Var.d = 1;
                objS = smo1.s(a1e0Var, y0e0Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                load = y0e0Var.a;
                hm5.M(objS);
            }
            m231Var = (BrowseEvent.StructureLoaded) objS;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        return thA == null ? m231Var : new BrowseEvent.StructureLoadFailed(load.getLoadingStrategy(), thA);
    }
}

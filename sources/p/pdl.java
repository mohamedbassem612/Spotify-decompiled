package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pdl {
    public final /* synthetic */ qdl a;

    public pdl(qdl qdlVar) {
        this.a = qdlVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Uri uri, onm onmVar) {
        odl odlVar;
        if (onmVar instanceof odl) {
            odlVar = (odl) onmVar;
            int i = odlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                odlVar.c = i - Integer.MIN_VALUE;
            } else {
                odlVar = new odl(this, onmVar);
            }
        } else {
            odlVar = new odl(this, onmVar);
        }
        Object objJ = odlVar.a;
        int i2 = odlVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            g341 g341Var = this.a.c;
            Single singleFlatMap = g341Var.a().flatMap(new e341(g341Var, uri, (byte) 0));
            odlVar.c = 1;
            objJ = fc11.j(singleFlatMap, odlVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }
}

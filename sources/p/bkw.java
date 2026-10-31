package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bkw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ elw a;

    public bkw(elw elwVar) {
        this.a = elwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ujw ujwVar;
        huz lt20Var;
        if (onmVar instanceof ujw) {
            ujwVar = (ujw) onmVar;
            int i = ujwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujwVar.b = i - Integer.MIN_VALUE;
            } else {
                ujwVar = new ujw(this, onmVar);
            }
        } else {
            ujwVar = new ujw(this, onmVar);
        }
        Object obj2 = ujwVar.a;
        int i2 = ujwVar.b;
        byte b = 1;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            nbw nbwVar = (nbw) obj;
            j2e0 j2e0Var = this.a.a;
            ArrayList arrayList = nbwVar.a;
            if (arrayList.isEmpty()) {
                lt20Var = new huz(new bl50(new IllegalArgumentException("No members to load")), (byte) 10);
            } else {
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(d3p1.F((d0r) j2e0Var.b, kzd.a, ((el50) it.next()).a));
                }
                lt20Var = new lt20(new huz(new qsc0((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), nbwVar, j2e0Var, (byte) 4), (byte) 26), new w1e0(3, lnmVar, b), (byte) 0);
            }
            wmk wmkVar = new wmk(r261Var, (byte) 9);
            ujwVar.b = 1;
            Object objCollect = lt20Var.collect(wmkVar, ujwVar);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}

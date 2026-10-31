package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l0f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public l0f(o0f o0fVar) {
        this.a = o0fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        k0f k0fVar;
        lt20 huzVar;
        if (onmVar instanceof k0f) {
            k0fVar = (k0f) onmVar;
            int i = k0fVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k0fVar.b = i - Integer.MIN_VALUE;
            } else {
                k0fVar = new k0f(this, onmVar);
            }
        } else {
            k0fVar = new k0f(this, onmVar);
        }
        Object obj2 = k0fVar.a;
        int i2 = k0fVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            v6a0 v6a0Var = this.a.n;
            ArrayList arrayList = ((jye) obj).a;
            qf4 qf4Var = ((add) v6a0Var.b).a;
            if (qf4Var.h() && qf4Var.Q() && !arrayList.isEmpty()) {
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((w4i1) obj3).a, obj3);
                }
                mdd0 mdd0Var = (vcd0) v6a0Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((w4i1) it.next()).a);
                }
                huzVar = new lt20(new mnc0(rqt0.u(new b8d0(mdd0Var.k(arrayList2), linkedHashMap, (byte) 3)), (byte) 11), new rf2(3, (lnm) null, (byte) 23), (byte) 0);
            } else {
                huzVar = new huz(new y1f(b7x.a), (byte) 10);
            }
            k91 k91Var = new k91(r261Var, (byte) 28);
            k0fVar.b = 1;
            Object objCollect = huzVar.collect(k91Var, k0fVar);
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

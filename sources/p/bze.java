package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public bze(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object value;
        Map mapP;
        bph0 bph0Var;
        iye iyeVar = (iye) obj;
        lxh1 lxh1Var = this.a.y;
        String str = iyeVar.a;
        String str2 = iyeVar.b;
        ArrayList<hye> arrayList = iyeVar.c;
        q9i0 q9i0Var = (q9i0) lxh1Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (hye hyeVar : arrayList) {
            String str3 = hyeVar.a;
            String str4 = hyeVar.b;
            int iC = l1d.C(hyeVar.c);
            if (iC == 0) {
                bph0Var = aph0.a;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                bph0Var = bph0.a;
            }
            arrayList2.add(new woh0(str3, str4, bph0Var, hyeVar.d, hyeVar.e));
        }
        w8i0 w8i0Var = (w8i0) q9i0Var.i.computeIfAbsent(str, new e9i0(q9i0Var, (byte) 3));
        bpb1 bpb1Var = w8i0Var.b;
        if (((Map) bpb1Var.getValue()).containsKey(str2)) {
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((woh0) it.next()).a);
            }
            Set setP1 = o7h.p1(arrayList3);
            do {
                value = bpb1Var.getValue();
                mapP = (Map) value;
                List list = (List) mapP.get(str2);
                if (list != null) {
                    List<dph0> list2 = list;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                    for (dph0 dph0VarA : list2) {
                        if (setP1.contains(dph0VarA.a.a)) {
                            dph0VarA = dph0.a(dph0VarA, (yxh1) null, true, 3);
                        }
                        arrayList4.add(dph0VarA);
                    }
                    mapP = sqg0.P(mapP, new mmr0(str2, arrayList4));
                }
            } while (!bpb1Var.k(value, mapP));
            fn31.T(w8i0Var.a, (o8n) null, 0, new og5((Object) w8i0Var, (Object) str2, (Object) q9i0Var, (Object) str, (lnm) null, (byte) 28, false), 3);
        } else {
            q9i0Var.h(str, str2, arrayList2, true);
        }
        return rih1.a;
    }
}

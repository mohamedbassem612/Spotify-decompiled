package p;

import com.spotify.upsells.v1.proto.GatedFeatureContext;
import com.spotify.upsells.v1.proto.GetUpsellResponse;
import com.spotify.upsells.v1.proto.ShouldUpsellResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h2i1 {
    public final yfu a;

    public h2i1(yfu yfuVar, hf41 hf41Var) {
        this.a = yfuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(List list, onm onmVar) {
        f2i1 f2i1Var;
        if (onmVar instanceof f2i1) {
            f2i1Var = (f2i1) onmVar;
            int i = f2i1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2i1Var.d = i - Integer.MIN_VALUE;
            } else {
                f2i1Var = new f2i1(this, onmVar);
            }
        } else {
            f2i1Var = new f2i1(this, onmVar);
        }
        Object objC = f2i1Var.b;
        int i2 = f2i1Var.d;
        if (i2 == 0) {
            hm5.M(objC);
            if (list.isEmpty()) {
                return b7x.a;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(k1o1.x((z740) it.next()));
            }
            f2i1Var.a = list;
            f2i1Var.d = 1;
            objC = this.a.c(arrayList, f2i1Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = f2i1Var.a;
            hm5.M(objC);
        }
        Map map = (Map) objC;
        b2i1 b2i1Var = b2i1.a;
        if (map == null) {
            List list3 = list;
            int iS = zno1.s(q7h.U(list3, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
            for (Object obj : list3) {
                linkedHashMap.put(obj, b2i1Var);
            }
            return linkedHashMap;
        }
        List list4 = list;
        int iS2 = zno1.s(q7h.U(list4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (Object obj2 : list4) {
            ShouldUpsellResponse shouldUpsellResponse = (ShouldUpsellResponse) map.get(k1o1.x((z740) obj2));
            t0i1 t0i1VarO = shouldUpsellResponse != null ? shouldUpsellResponse.o() : null;
            int i3 = t0i1VarO == null ? -1 : vhy0.a[t0i1VarO.ordinal()];
            linkedHashMap2.put(obj2, i3 != 1 ? i3 != 2 ? b2i1Var : new c2i1(false) : new c2i1(true));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(z740 z740Var, e2i1 e2i1Var, fyl fylVar, onm onmVar) {
        g2i1 g2i1Var;
        ila0 ila0VarA;
        if (onmVar instanceof g2i1) {
            g2i1Var = (g2i1) onmVar;
            int i = g2i1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g2i1Var.c = i - Integer.MIN_VALUE;
            } else {
                g2i1Var = new g2i1(this, onmVar);
            }
        } else {
            g2i1Var = new g2i1(this, onmVar);
        }
        Object objF = g2i1Var.a;
        int i2 = g2i1Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            GatedFeatureContext gatedFeatureContextX = k1o1.x(z740Var);
            g2i1Var.c = 1;
            objF = this.a.f(gatedFeatureContextX, e2i1Var, fylVar, g2i1Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        GetUpsellResponse getUpsellResponse = (GetUpsellResponse) objF;
        return (getUpsellResponse == null || (ila0VarA = hf41.a(getUpsellResponse)) == null) ? y1i1.a : new z1i1(ila0VarA);
    }
}

package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t1b extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x1b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1b(x1b x1bVar, byte b) {
        super(1);
        this.a = b;
        this.b = x1bVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        x1b x1bVar = this.b;
        switch (b) {
            case 0:
                vhc1 vhc1Var = (vhc1) obj;
                if (vhc1Var instanceof thc1) {
                    Map map = ((thc1) vhc1Var).j;
                    nfa0 nfa0Var = (nfa0) x1bVar.g;
                    String str = (String) map.get("multiUserAttributionMetadata");
                    if (!((str == null || str.length() <= 0) ? pxd0.y(map) : pxd0.z(map, nfa0Var)).isEmpty() && !map.containsKey("recsplanation")) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                hwq hwqVar = (hwq) obj;
                l7e0 l7e0Var = hwqVar.g;
                xjf1 xjf1Var = null;
                if (!(l7e0Var instanceof j7e0)) {
                    return new n1b(0, (xjf1) null);
                }
                zuc0 zuc0Var = ((j7e0) l7e0Var).a;
                int i = hwqVar.a;
                nfa0 nfa0Var2 = (nfa0) x1bVar.g;
                String str2 = x1bVar.b;
                Map map2 = zuc0Var.g;
                fjf1 fjf1Var = zuc0Var.p;
                if (!(fjf1Var instanceof fjf1)) {
                    hhg1.n("ItemAttributionsExtractor: no track");
                    return null;
                }
                String str3 = (String) map2.get("multiUserAttributionMetadata");
                List listY = (str3 == null || str3.length() <= 0) ? pxd0.y(map2) : pxd0.z(map2, nfa0Var2);
                if (!listY.isEmpty()) {
                    String str4 = zuc0Var.c;
                    String str5 = zuc0Var.i;
                    fjf1 fjf1Var2 = fjf1Var;
                    List list = fjf1Var2.b;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((yif1) it.next()).a);
                    }
                    String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
                    int length = strY0.length();
                    String strF = fjf1Var2.a.a;
                    if (length != 0) {
                        strF = f4i1.f(strY0, " • ", strF);
                    }
                    xjf1Var = new xjf1(str2, str4, str5, strF, zuc0Var.a(1), listY);
                }
                return new n1b(i, xjf1Var);
        }
    }
}

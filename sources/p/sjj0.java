package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sjj0 {
    public final yqg a;
    public final o241 b;
    public final f8b c;
    public final yg7 d;
    public final sx3 e;

    public sjj0(yqg yqgVar, o241 o241Var, f8b f8bVar, yg7 yg7Var, sx3 sx3Var) {
        this.a = yqgVar;
        this.b = o241Var;
        this.c = f8bVar;
        this.d = yg7Var;
        this.e = sx3Var;
    }

    public final Single a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Set set = s4b1.f;
            if (uic.g((String) obj, blc0.g1)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            Set set2 = s4b1.f;
            if (uic.g((String) obj2, blc0.ti)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            Set set3 = s4b1.f;
            if (uic.g((String) obj3, blc0.u1)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            Set set4 = s4b1.f;
            if (uic.j((String) obj4, nyu0.e)) {
                arrayList4.add(obj4);
            }
        }
        xkg0 xkg0Var = new xkg0();
        xkg0Var.put(gh3.class, arrayList);
        xkg0Var.put(z1g1.class, arrayList2);
        xkg0Var.put(vy6.class, arrayList3);
        xkg0Var.put(jo70.class, arrayList4);
        xkg0Var.put(xkk1.class, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list2) {
            Set set5 = s4b1.f;
            if (uic.g((String) obj5, blc0.fh)) {
                arrayList5.add(obj5);
            }
        }
        xkg0Var.put(va81.class, arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list2) {
            Set set6 = s4b1.f;
            if (uic.g((String) obj6, blc0.Pg)) {
                arrayList6.add(obj6);
            }
        }
        xkg0Var.put(mdz.class, arrayList6);
        return this.d.b(new wu00(xkg0Var.b())).flatMap(new kqi0(this, arrayList2, arrayList3, (byte) 5)).map(new yge0(list, this, (byte) 24)).flatMap(new eea0(this, (byte) 23));
    }

    public final Single b(String str) {
        return a(Collections.singletonList(str)).map(o610.P0);
    }
}

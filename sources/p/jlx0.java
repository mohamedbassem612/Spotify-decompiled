package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class jlx0 {
    public static final o3r a;

    static {
        kex0 kex0Var = kex0.c1;
        a = w3p1.o(new l4r(hjx0.a, 2, kex0.e1, new j4r(kex0Var), ilx0.b), kex0.d1);
    }

    public static final z4t0 a(rzq rzqVar, List list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            arrayList.add(new v3o(d3p1.F(rzqVar, a, str), str, (byte) 2));
        }
        return new z4t0((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 4);
    }
}

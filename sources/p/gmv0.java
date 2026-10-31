package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gmv0 {
    public final n0h1 a;
    public final List b;
    public final String c;
    public final gmv0 d;

    public gmv0(n0h1 n0h1Var, List list, String str) {
        this.a = n0h1Var;
        this.b = list;
        this.c = str;
        gmv0 gmv0Var = null;
        if (str != null) {
            n0h1 n0h1VarA = n0h1Var != null ? n0h1Var.a() : null;
            List<n0h1> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (n0h1 n0h1Var2 : list2) {
                arrayList.add(n0h1Var2 != null ? n0h1Var2.a() : null);
            }
            gmv0Var = new gmv0(n0h1VarA, arrayList, null);
        }
        this.d = gmv0Var;
    }
}

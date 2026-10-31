package p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ntl1 extends g7 {
    public final int a;
    public final tr80 b;
    public final ArrayList c;
    public final m4r d;
    public final HashMap e = new HashMap();

    public ntl1(int i, tr80 tr80Var, ArrayList arrayList, m4r m4rVar) {
        this.a = i;
        this.b = tr80Var;
        this.c = arrayList;
        this.d = m4rVar;
    }

    public final int b() {
        return this.a;
    }

    public final Object get(int i) {
        tr80 tr80Var = this.b;
        if (tr80Var.c(i)) {
            return this.c.get(i - ((rr80) tr80Var).a);
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.e;
        Object obj = map.get(numValueOf);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.d.invoke(Integer.valueOf(i));
        map.put(numValueOf, objInvoke);
        return objInvoke;
    }
}

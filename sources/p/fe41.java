package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fe41 {
    public final LinkedHashMap a;
    public final vi11 b;

    public fe41() {
        this.a = new LinkedHashMap();
        this.b = new vi11((byte) 6);
    }

    public final ee41 a(String str) {
        vi11 vi11Var = this.b;
        if (vi11Var.t().containsKey(str)) {
            hhg1.f(j1e1.j(str));
            return null;
        }
        LinkedHashMap linkedHashMap = this.a;
        Object ee41Var = linkedHashMap.get(str);
        if (ee41Var == null) {
            ee41Var = vi11Var.u().containsKey(str) ? new ee41(this, str, vi11Var.u().get(str)) : new ee41(str, this);
            linkedHashMap.put(str, ee41Var);
        }
        return (ee41) ee41Var;
    }

    public final void b(Object obj, String str) {
        if (!w6d1.C(obj)) {
            obj.getClass();
            bhn0.k("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        Object obj2 = this.a.get(str);
        kdn0 kdn0Var = obj2 instanceof kdn0 ? (kdn0) obj2 : null;
        if (kdn0Var != null) {
            kdn0Var.m(obj);
        }
        this.b.S(obj, str);
    }

    public fe41(xkg0 xkg0Var) {
        this.a = new LinkedHashMap();
        this.b = new vi11(xkg0Var);
    }
}

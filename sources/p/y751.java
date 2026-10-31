package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y751 {
    public final bpb1 a;
    public final xe01 b;
    public final bpb1 c;
    public final xe01 d;

    public y751() {
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
        bpb1 bpb1VarB2 = gio1.b(b7x.a);
        this.c = bpb1VarB2;
        this.d = d5p1.h(bpb1VarB2);
    }

    public final synchronized boolean a(int i, ArrayList arrayList) {
        try {
            x751 x751Var = (x751) this.a.getValue();
            if (x751Var == null) {
                return false;
            }
            if (x751Var.b == i && !x751Var.c) {
                Map map = x751Var.d;
                if (map == null) {
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof jl20) {
                        arrayList2.add(obj);
                    }
                }
                return o7h.p1(arrayList2).equals(map.keySet());
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b(hc51 hc51Var, int i) {
        try {
            ec51 ec51Var = (ec51) hc51Var.b.get();
            if (ec51Var.e() == i && ec51Var.b() != null) {
                return true;
            }
            x751 x751Var = (x751) this.a.getValue();
            xb51 xb51Var = x751Var != null ? new xb51(x751Var.b) : null;
            if (xb51Var != null && xb51Var.a == i) {
                this.a.m((Object) null, x751.a(x751Var, null, 3));
                this.c.m((Object) null, b7x.a);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c(pd51 pd51Var) {
        x751 x751Var = (x751) this.a.getValue();
        boolean z = false;
        if (x751Var == null) {
            return false;
        }
        jw41 jw41Var = x751Var.a;
        jw41 jw41Var2 = jw41Var instanceof jw41 ? jw41Var : null;
        if (jw41Var2 == null) {
            return false;
        }
        if (jw41Var2.a.contains(pd51Var) && (x751Var.c || x751Var.d != null)) {
            z = true;
        }
        return z;
    }

    public final synchronized boolean d(int i) {
        x751 x751Var = (x751) this.a.getValue();
        boolean z = false;
        if (x751Var == null) {
            return false;
        }
        if (x751Var.b == i && !x751Var.c) {
            Map map = x751Var.d;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    pd51 pd51Var = (pd51) entry.getKey();
                    if (!u890.j(((Map) this.c.getValue()).get(pd51Var), entry.getValue())) {
                    }
                }
                z = true;
            }
        }
        return z;
    }

    public final synchronized void e(hc51 hc51Var, x751 x751Var, int i, int i2, boolean z, Map map) {
        if (x751Var.c || x751Var.d != null) {
            if (!z) {
                map = null;
            }
            if (this.a.k(x751Var, x751.a(x751Var, map, 3))) {
                hc51Var.e(new se5(new bc51(i, i2), x751Var.b, z));
            }
        }
    }

    public final synchronized int f(hc51 hc51Var, lw41 lw41Var, a851 a851Var) {
        int iE;
        Integer num;
        boolean z = false;
        iE = z751.a.contains(a851Var) ? hc51Var.e(jh31.R0).a.e : hc51Var.e(new k750((byte) 29, z)).d().e();
        this.c.m((Object) null, b7x.a);
        bpb1 bpb1Var = this.a;
        if (a851Var == a851.X) {
            ec51 ec51Var = (ec51) hc51Var.b.get();
            if (ec51Var.e == iE && (num = ec51Var.f) != null && num.intValue() == iE) {
                ac51 ac51Var = ec51Var.g;
                if ((ac51Var != null ? ac51Var.d : null) == cc51.d) {
                    z = true;
                }
            }
        }
        bpb1Var.m((Object) null, new x751(lw41Var, iE, z, null));
        return iE;
    }

    public final synchronized boolean g(hc51 hc51Var, int i) {
        try {
            x751 x751Var = (x751) this.a.getValue();
            boolean z = false;
            if (x751Var == null) {
                return false;
            }
            if (x751Var.b != i) {
                return false;
            }
            if (d(i) && hc51Var.c(i)) {
                z = true;
            }
            if (z) {
                this.a.k(x751Var, x751.a(x751Var, null, 7));
                this.c.m((Object) null, b7x.a);
            }
            return z;
        } catch (Throwable th) {
            throw th;
        }
    }
}

package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g3i0 {
    public final dbu0 a;
    public final o4a b;
    public final ip00 f;
    public final pfr i;
    public final wdd1 j;
    public boolean l;
    public ef81 k = new ef81();
    public final IdentityHashMap d = new IdentityHashMap();
    public final HashMap e = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();

    public g3i0(ip00 ip00Var, pfr pfrVar, wdd1 wdd1Var, dbu0 dbu0Var, o4a o4aVar) {
        this.a = dbu0Var;
        this.b = o4aVar;
        this.f = ip00Var;
        this.i = pfrVar;
        this.j = wdd1Var;
    }

    public final sqe1 a(int i, ArrayList arrayList, ef81 ef81Var) {
        if (!arrayList.isEmpty()) {
            this.k = ef81Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                f3i0 f3i0Var = (f3i0) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.c;
                if (i2 > 0) {
                    f3i0 f3i0Var2 = (f3i0) arrayList2.get(i2 - 1);
                    f3i0Var.b(f3i0Var2.a.L().o() + f3i0Var2.d);
                } else {
                    f3i0Var.b(0);
                }
                int iO = f3i0Var.a.L().o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((f3i0) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, f3i0Var);
                this.e.put(f3i0Var.b, f3i0Var);
                if (this.l) {
                    e(f3i0Var);
                    if (this.d.isEmpty()) {
                        this.h.add(f3i0Var);
                    } else {
                        e3i0 e3i0Var = (e3i0) this.g.get(f3i0Var);
                        if (e3i0Var != null) {
                            e3i0Var.a.g(e3i0Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final sqe1 b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return sqe1.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            f3i0 f3i0Var = (f3i0) arrayList.get(i);
            f3i0Var.d = iO;
            iO += f3i0Var.a.L().o();
        }
        return new uwu0(arrayList, this.k);
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            f3i0 f3i0Var = (f3i0) it.next();
            if (f3i0Var.c.isEmpty()) {
                e3i0 e3i0Var = (e3i0) this.g.get(f3i0Var);
                if (e3i0Var != null) {
                    e3i0Var.a.g(e3i0Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(f3i0 f3i0Var) {
        if (f3i0Var.e && f3i0Var.c.isEmpty()) {
            e3i0 e3i0Var = (e3i0) this.g.remove(f3i0Var);
            e3i0Var.getClass();
            d3i0 d3i0Var = e3i0Var.c;
            qba qbaVar = e3i0Var.a;
            qbaVar.u(e3i0Var.b);
            qbaVar.y(d3i0Var);
            qbaVar.x(d3i0Var);
            this.h.remove(f3i0Var);
        }
    }

    public final void e(f3i0 f3i0Var) {
        g8h0 g8h0Var = f3i0Var.a;
        y2i0 y2i0Var = new y2i0(this);
        d3i0 d3i0Var = new d3i0(this, f3i0Var);
        this.g.put(f3i0Var, new e3i0(g8h0Var, y2i0Var, d3i0Var));
        g8h0Var.b(zoi1.s(null), d3i0Var);
        g8h0Var.a(zoi1.s(null), d3i0Var);
        g8h0Var.q(y2i0Var, this.a, this.b);
    }

    public final void f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.c;
            f3i0 f3i0Var = (f3i0) arrayList.remove(i3);
            this.e.remove(f3i0Var.b);
            int i4 = -f3i0Var.a.L().o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((f3i0) arrayList.get(i5)).d += i4;
            }
            f3i0Var.e = true;
            if (this.l) {
                d(f3i0Var);
            }
        }
    }
}

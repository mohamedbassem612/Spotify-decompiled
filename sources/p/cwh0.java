package p;

import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cwh0 implements akl {
    public ArrayList a;

    public cwh0(z2g1 z2g1Var) {
        int i = mvl1.a;
        til tilVar = z2g1Var.b;
        q8o0 q8o0Var = z2g1Var.d;
        ArrayList arrayListO = p7h.O(new nhl[]{new tha(tilVar, (byte) 0), new xha(z2g1Var.c), new tha(z2g1Var.e, (byte) 3)});
        if (Build.VERSION.SDK_INT >= 28) {
            arrayListO.add(new f8o0((ConnectivityManager) z2g1Var.a.getSystemService("connectivity")));
        } else {
            q8o0Var.getClass();
            arrayListO.addAll(p7h.M(new eaa[]{new tha(q8o0Var, (byte) 1), new tha(q8o0Var, (byte) 2), new z7o0(q8o0Var), new y7o0(q8o0Var)}));
        }
        this.a = arrayListO;
    }

    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                hhg1.n("category must not be null");
                return;
            }
            ArrayList arrayList2 = this.a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.a = arrayList2;
            }
            if (!arrayList2.contains(str)) {
                this.a.add(str);
            }
        }
    }

    @Override // p.akl
    public void accept(Object obj) {
        this.a.add((bfo) obj);
    }

    public void b(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        this.a.add(new a9s0(f, f2, 0.0f, z, z2, f3, f4));
    }

    public void c(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        this.a.add(new j9s0(f, f2, 0.0f, z, z2, f3, f4));
    }

    public dwh0 d() {
        if (this.a == null) {
            return dwh0.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new dwh0(bundle, this.a);
    }

    public void e() {
        this.a.add(b9s0.c);
    }

    public void f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new c9s0(f, f2, f3, f4, f5, f6));
    }

    public void g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new k9s0(f, f2, f3, f4, f5, f6));
    }

    public void h(float f) {
        this.a.add(new d9s0(f));
    }

    public void i(float f) {
        this.a.add(new l9s0(f));
    }

    public void j(float f, float f2) {
        this.a.add(new e9s0(f, f2));
    }

    public void k(float f, float f2) {
        this.a.add(new m9s0(f, f2));
    }

    public void l(float f, float f2) {
        this.a.add(new f9s0(f, f2));
    }

    public void m(float f, float f2) {
        this.a.add(new n9s0(f, f2));
    }

    public void n(float f, float f2, float f3, float f4) {
        this.a.add(new g9s0(f, f2, f3, f4));
    }

    public void o(float f, float f2, float f3, float f4) {
        this.a.add(new o9s0(f, f2, f3, f4));
    }

    public void p(float f, float f2, float f3, float f4) {
        this.a.add(new h9s0(f, f2, f3, f4));
    }

    public void q(float f, float f2, float f3, float f4) {
        this.a.add(new p9s0(f, f2, f3, f4));
    }

    public void r(float f, float f2) {
        this.a.add(new i9s0(f, f2));
    }

    public void s(float f, float f2) {
        this.a.add(new q9s0(f, f2));
    }

    public mr20 t(vwl1 vwl1Var) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((nhl) obj).b(vwl1Var)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((nhl) it.next()).c(vwl1Var.j));
        }
        return rqt0.u(new z4t0((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), (byte) 16));
    }

    public void u(float f) {
        this.a.add(new s9s0(f));
    }

    public void v(float f) {
        this.a.add(new r9s0(f));
    }

    public cwh0() {
        this.a = new ArrayList(32);
    }

    public cwh0(dwh0 dwh0Var) {
        if (dwh0Var != null) {
            dwh0Var.a();
            if (dwh0Var.b.isEmpty()) {
                return;
            }
            this.a = new ArrayList(dwh0Var.b);
            return;
        }
        hhg1.n("selector must not be null");
        throw null;
    }
}

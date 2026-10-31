package p;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tac0 extends x8c0 {
    public final boolean b;
    public final dmj1 d;
    public int e;
    public boolean f;
    public boolean g;
    public w8c0 i;
    public final bpb1 j;
    public uny c = new uny((byte) 23);
    public final ArrayList h = new ArrayList();

    public tac0(iac0 iac0Var, boolean z) {
        this.b = z;
        this.d = new dmj1(iac0Var);
        w8c0 w8c0Var = w8c0.b;
        this.i = w8c0Var;
        this.j = gio1.b(w8c0Var);
    }

    @Override // p.x8c0
    public final void a(hac0 hac0Var) {
        aac0 it0Var;
        iac0 iac0Var;
        k8c0 k8c0Var;
        f("addObserver");
        w8c0 w8c0Var = this.i;
        w8c0 w8c0Var2 = w8c0.a;
        if (w8c0Var != w8c0Var2) {
            w8c0Var2 = w8c0.b;
        }
        sac0 sac0Var = new sac0();
        sac0Var.a = w8c0Var2;
        HashMap map = jbc0.a;
        boolean z = hac0Var instanceof aac0;
        boolean z2 = hac0Var instanceof o5s;
        if (z && z2) {
            it0Var = new q5s((o5s) hac0Var, (aac0) hac0Var);
        } else if (z2) {
            it0Var = new q5s((o5s) hac0Var, null);
        } else if (z) {
            it0Var = (aac0) hac0Var;
        } else {
            Class<?> cls = hac0Var.getClass();
            if (jbc0.b(cls) == 2) {
                Object obj = jbc0.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    jbc0.a((Constructor) list.get(0), hac0Var);
                    throw null;
                }
                int size = list.size();
                le40[] le40VarArr = new le40[size];
                if (size > 0) {
                    jbc0.a((Constructor) list.get(0), hac0Var);
                    throw null;
                }
                it0Var = new ek2(le40VarArr, (byte) 3);
            } else {
                it0Var = new it0(hac0Var);
            }
        }
        sac0Var.b = it0Var;
        if (((sac0) this.c.C(hac0Var, sac0Var)) == null && (iac0Var = (iac0) this.d.c()) != null) {
            boolean z3 = this.e != 0 || this.f;
            w8c0 w8c0VarE = e(hac0Var);
            this.e++;
            while (sac0Var.a.compareTo(w8c0VarE) < 0 && this.c.e(hac0Var)) {
                w8c0 w8c0Var3 = sac0Var.a;
                ArrayList arrayList = this.h;
                arrayList.add(w8c0Var3);
                i8c0 i8c0Var = k8c0.Companion;
                w8c0 w8c0Var4 = sac0Var.a;
                i8c0Var.getClass();
                int iOrdinal = w8c0Var4.ordinal();
                if (iOrdinal == 1) {
                    k8c0Var = k8c0.ON_CREATE;
                } else if (iOrdinal != 2) {
                    k8c0Var = iOrdinal != 3 ? null : k8c0.ON_RESUME;
                } else {
                    k8c0Var = k8c0.ON_START;
                }
                if (k8c0Var == null) {
                    bhn0.y(sac0Var.a, "no event up from ");
                    return;
                } else {
                    sac0Var.a(iac0Var, k8c0Var);
                    r7h.e0(arrayList);
                    w8c0VarE = e(hac0Var);
                }
            }
            if (!z3) {
                j();
            }
            this.e--;
        }
    }

    @Override // p.x8c0
    public final w8c0 b() {
        return this.i;
    }

    @Override // p.x8c0
    public final xe01 c() {
        return d5p1.h(this.j);
    }

    @Override // p.x8c0
    public final void d(hac0 hac0Var) {
        f("removeObserver");
        this.c.D(hac0Var);
    }

    public final w8c0 e(hac0 hac0Var) {
        il10 il10VarC = this.c.c(hac0Var);
        w8c0 w8c0Var = il10VarC != null ? ((sac0) il10VarC.getValue()).a : null;
        ArrayList arrayList = this.h;
        return jto1.o(jto1.o(this.i, w8c0Var), arrayList.isEmpty() ? null : (w8c0) l1d.i(1, arrayList));
    }

    public final void f(String str) {
        if (!this.b || kto1.y()) {
            return;
        }
        bhn0.f(f4i1.f("Method ", str, " must be called on the main thread"));
    }

    public final void g(k8c0 k8c0Var) {
        f("handleLifecycleEvent");
        h(k8c0Var.a());
    }

    public final void h(w8c0 w8c0Var) {
        if (this.i == w8c0Var) {
            return;
        }
        jto1.n((iac0) this.d.c(), this.i, w8c0Var);
        this.i = w8c0Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        j();
        this.f = false;
        if (this.i == w8c0.a) {
            this.c = new uny((byte) 23);
        }
    }

    public final void i(w8c0 w8c0Var) {
        f("setCurrentState");
        h(w8c0Var);
    }

    public final void j() {
        Object objC = this.d.c();
        if (objC == null) {
            eg.m("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        iac0 iac0Var = (iac0) objC;
        while (this.c.H() != 0) {
            w8c0 w8c0Var = ((sac0) this.c.i().getValue()).a;
            w8c0 w8c0Var2 = ((sac0) this.c.v().getValue()).a;
            if (w8c0Var == w8c0Var2 && this.i == w8c0Var2) {
                break;
            }
            this.g = false;
            if (this.i.compareTo(((sac0) this.c.i().getValue()).a) < 0) {
                this.c.j(new rac0(this, iac0Var, (byte) 0));
            }
            il10 il10VarW = this.c.w();
            if (!this.g && il10VarW != null && this.i.compareTo(((sac0) il10VarW.getValue()).a) > 0) {
                this.c.k(new rac0(this, iac0Var, (byte) 1));
            }
        }
        this.g = false;
        this.j.l(this.i);
    }
}

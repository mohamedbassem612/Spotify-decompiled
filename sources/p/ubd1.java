package p;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ubd1 implements tl7 {
    public final pgr a;
    public final LinkedHashSet b = new LinkedHashSet();
    public rl7 c;
    public boolean d;

    public ubd1(pgr pgrVar) {
        this.a = pgrVar;
        pgrVar.c(new tbd1(this));
        this.d = true;
    }

    public final void a(sl7 sl7Var) {
        rl7 rl7Var;
        this.b.remove(sl7Var);
        if (!this.d || (rl7Var = this.c) == null) {
            return;
        }
        sl7Var.a(rl7Var);
    }

    public final void b(rl7 rl7Var) {
        this.a.b(rl7Var);
    }

    public final void c(sl7 sl7Var) {
        rl7 rl7Var;
        this.b.add(sl7Var);
        if (!this.d || (rl7Var = this.c) == null) {
            return;
        }
        sl7Var.b(rl7Var);
    }

    public final void e(rl7 rl7Var) {
        this.a.e(rl7Var);
    }

    public final void g(int i, Float f, Float f2, float f3) {
        this.a.g(i, f, f2, f3);
    }

    public final void h(jen0 jen0Var) {
        this.a.f = jen0Var;
    }

    public final void i(Float f, Float f2, float f3) {
        this.a.i(f, f2, f3);
    }

    public final void j(rl7 rl7Var, jen0 jen0Var) {
        this.a.j(rl7Var, jen0Var);
    }

    public final boolean l() {
        return this.d;
    }

    public final void m(boolean z) {
        rl7 rl7Var;
        rl7 rl7Var2;
        boolean z2 = this.d;
        this.d = z;
        LinkedHashSet linkedHashSet = this.b;
        if (z2 && !z && (rl7Var2 = this.c) != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((sl7) it.next()).a(rl7Var2);
            }
        }
        if (z2 || !z || (rl7Var = this.c) == null) {
            return;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ((sl7) it2.next()).b(rl7Var);
        }
    }
}

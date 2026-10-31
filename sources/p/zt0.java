package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zt0 {
    public final zle1 a;
    public t45 b;
    public final LinkedHashSet c = new LinkedHashSet();

    public zt0(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public final void a(int i) {
        String strB = kk0.b(i);
        LinkedHashSet linkedHashSet = this.c;
        if (linkedHashSet.contains(strB)) {
            return;
        }
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45.m(t45Var, kk0.b(i), 4);
        }
        linkedHashSet.add(kk0.b(i));
    }

    public final void b(int i) {
        t45 t45Var = this.b;
        LinkedHashSet linkedHashSet = this.c;
        if (t45Var != null) {
            if (linkedHashSet.contains(kk0.b(1))) {
                t45Var.g(kk0.b(1));
            }
            t45Var.a("outcome", kk0.a(i));
            this.a.b(t45Var.e());
        }
        this.b = null;
        linkedHashSet.clear();
    }

    public final void c(int i, int i2) {
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.g(kk0.b(i));
        }
        b(i2);
    }
}

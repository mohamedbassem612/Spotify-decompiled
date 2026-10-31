package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kgi0 implements tl7 {
    public int a;
    public boolean b;
    public rl7 c;
    public final LinkedHashSet d = new LinkedHashSet();

    public final void a(sl7 sl7Var) {
        this.d.remove(sl7Var);
    }

    public final void c(sl7 sl7Var) {
        rl7 rl7Var;
        LinkedHashSet linkedHashSet = this.d;
        if (linkedHashSet.contains(sl7Var)) {
            return;
        }
        linkedHashSet.add(sl7Var);
        if (!this.b || (rl7Var = this.c) == null) {
            return;
        }
        sl7Var.b(rl7Var);
    }

    public final void d(String str) {
        if (this.b) {
            rl7 rl7Var = this.c;
            if (u890.j(rl7Var != null ? rl7Var.a : null, str)) {
                return;
            }
            rl7 rl7Var2 = new rl7(str);
            rl7 rl7Var3 = this.c;
            LinkedHashSet linkedHashSet = this.d;
            if (rl7Var3 != null) {
                mqo1.o(linkedHashSet, rl7Var3);
            }
            this.c = rl7Var2;
            mqo1.n(linkedHashSet, rl7Var2);
        }
    }

    public final void b(rl7 rl7Var) {
    }

    public final void e(rl7 rl7Var) {
    }

    public final void j(rl7 rl7Var, jen0 jen0Var) {
    }

    public final void g(int i, Float f, Float f2, float f3) {
    }
}

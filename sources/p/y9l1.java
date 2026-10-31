package p;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9l1 implements tl7 {
    public final rm5 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final kl1 c;

    public y9l1(RecyclerView recyclerView, rm5 rm5Var) {
        this.a = rm5Var;
        kl1 kl1Var = new kl1((byte) 19);
        this.c = kl1Var;
        kl1Var.f = new ltf1(this, (byte) 16);
        recyclerView.m(new zl7(this, (byte) 27));
    }

    public final void a(sl7 sl7Var) {
        this.b.remove(sl7Var);
    }

    public final void b(rl7 rl7Var) {
        ((LinkedHashSet) this.c.b).add(rl7Var);
    }

    public final void c(sl7 sl7Var) {
        this.b.add(sl7Var);
    }

    public final void e(rl7 rl7Var) {
        kl1 kl1Var = this.c;
        ((LinkedHashSet) kl1Var.b).remove(rl7Var);
        ((LinkedHashMap) kl1Var.c).remove(rl7Var);
        if (((Set) kl1Var.e).contains(rl7Var)) {
            kl1Var.B(dm61.u0(rl7Var, (Set) kl1Var.e));
        }
    }

    public final void g(int i, Float f, Float f2, float f3) {
        rm5 rm5Var = this.a;
        jen0 jen0Var = (jen0) rm5Var.b;
        if (jen0Var == null) {
            jen0Var = new jen0();
            ((iu30) rm5Var.a).invoke(jen0Var);
            rm5Var.b = jen0Var;
        }
        this.c.d = jen0Var;
    }

    public final void j(rl7 rl7Var, jen0 jen0Var) {
        kl1 kl1Var = this.c;
        ((LinkedHashMap) kl1Var.c).put(rl7Var, jen0Var);
        if (kl1Var.a) {
            kl1Var.F();
        }
    }
}

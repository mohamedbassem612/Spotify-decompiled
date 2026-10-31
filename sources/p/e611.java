package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class e611 {
    public bb01 a;
    public ArrayList b;
    public byte c;
    public byte d;
    public short e;
    public short f;

    public static void b(w611 w611Var) {
        int i = w611Var.t;
        if (!w611Var.t() && (i & 4) == 0) {
            w611Var.m();
        }
    }

    public abstract boolean a(w611 w611Var, w611 w611Var2, f3a f3aVar, f3a f3aVar2);

    public boolean c(w611 w611Var, List list) {
        return !((zw81) this).g || w611Var.t();
    }

    public final void d(w611 w611Var) {
        bb01 bb01Var = this.a;
        if (bb01Var != null) {
            bb01Var.p(w611Var);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            pze0.m(arrayList.get(0));
            throw null;
        }
    }

    public abstract void f(w611 w611Var);

    public abstract void g();

    public long h() {
        return this.d;
    }

    public abstract boolean i();

    public abstract void j();
}

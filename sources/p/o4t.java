package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o4t {
    public int a;
    public long b;

    public /* synthetic */ o4t(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static Set b(int i) {
        return f46.S0(new d3h1[]{w2h1.b, new v2h1(i)});
    }

    public static o4t f(fc10 fc10Var, izr0 izr0Var) {
        fc10Var.h(0, izr0Var.a, 8);
        izr0Var.R(0);
        return new o4t(izr0Var.q(), izr0Var.v());
    }

    public xj61 a() {
        xj61 xj61Var = new xj61();
        xj61Var.add(w2h1.b);
        int i = this.a;
        if (i != -1) {
            xj61Var.add(new v2h1(i));
        }
        if (this.b != 0) {
            xj61Var.add(new u2h1(System.currentTimeMillis() - this.b));
        }
        return cwl1.j(xj61Var);
    }

    public void c() {
        this.b = System.currentTimeMillis();
    }

    public void d() {
        this.b = 0L;
    }

    public boolean e() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public void g(int i) {
        this.a = i;
    }

    public o4t() {
        this.a = -1;
    }
}

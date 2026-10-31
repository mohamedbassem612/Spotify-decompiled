package p;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dj51 extends b611 {
    public final bml a;
    public int b;
    public int c;
    public byte d;
    public boolean e = true;
    public final /* synthetic */ gj51 f;

    public dj51(gj51 gj51Var, bml bmlVar) {
        this.f = gj51Var;
        new SparseIntArray();
        this.a = bmlVar;
        bmlVar.w(this);
    }

    public final void a() {
        gj51 gj51Var = this.f;
        gj51Var.C();
        gj51Var.h();
    }

    public final void b(int i, int i2) {
        ((z511) this.f).a.d(this.c + i, i2, (Object) null);
    }

    public final void c(int i, int i2, Object obj) {
        ((z511) this.f).a.d(this.c + i, i2, obj);
    }

    public final void d(int i, int i2) {
        int i3 = this.c + i;
        gj51 gj51Var = this.f;
        gj51Var.k(i3, i2);
        gj51Var.E(this.b + 1, i2);
    }

    public final void e(int i, int i2) {
        int i3 = this.c;
        this.f.j(i + i3, i3 + i2);
    }

    public final void f(int i, int i2) {
        int i3 = this.c + i;
        gj51 gj51Var = this.f;
        gj51Var.l(i3, i2);
        gj51Var.E(this.b + 1, -i2);
    }
}

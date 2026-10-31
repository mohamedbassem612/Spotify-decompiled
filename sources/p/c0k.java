package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c0k {
    public final x340 a;
    public xce b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final up20 d = new up20((byte) 2);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public c0k(x340 x340Var, xce xceVar) {
        this.a = x340Var;
        this.b = xceVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            amq0 amq0Var = this.b.c;
            amq0Var.B(glq0.c);
            amq0Var.d[amq0Var.e - amq0Var.b[amq0Var.c - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        xce xceVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        xceVar.getClass();
        if (size != 0) {
            amq0 amq0Var2 = xceVar.c;
            amq0Var2.B(ekq0.c);
            y7y0.N(amq0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                amq0 amq0Var = this.b.c;
                amq0Var.B(ukq0.c);
                int i3 = amq0Var.e - amq0Var.b[amq0Var.c - 1].a;
                int[] iArr = amq0Var.d;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                amq0 amq0Var2 = this.b.c;
                amq0Var2.B(pkq0.c);
                int i6 = amq0Var2.e - amq0Var2.b[amq0Var2.c - 1].a;
                int[] iArr2 = amq0Var2.d;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        ye91 ye91Var = this.a.G;
        int i = z ? ye91Var.i : ye91Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            g0k.a("Tried to seek backward");
        }
        if (i2 > 0) {
            amq0 amq0Var = this.b.c;
            amq0Var.B(xjq0.c);
            amq0Var.d[amq0Var.e - amq0Var.b[amq0Var.c - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        ye91 ye91Var = this.a.G;
        if (ye91Var.c > 0) {
            int i = ye91Var.i;
            up20 up20Var = this.d;
            if (up20Var.f(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.c.B(kkq0.c);
                    this.c = true;
                }
                if (i > 0) {
                    s340 s340VarA = ye91Var.a(i);
                    up20Var.h(i);
                    d(false);
                    amq0 amq0Var = this.b.c;
                    amq0Var.B(jkq0.c);
                    y7y0.N(amq0Var, 0, s340VarA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                g0k.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}

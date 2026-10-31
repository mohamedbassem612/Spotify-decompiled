package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class g0y {
    public int a;
    public int b;
    public int c;
    public final Serializable d;

    public g0y(xkg0 xkg0Var) {
        this.d = xkg0Var;
        this.b = -1;
        this.c = xkg0Var.h;
        e();
    }

    public void a() {
        if (this.d.h == this.c) {
            return;
        }
        eg.d();
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public xkg0 d() {
        return this.d;
    }

    public void e() {
        while (true) {
            int i = this.a;
            xkg0 xkg0Var = this.d;
            if (i >= xkg0Var.f || xkg0Var.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void f(int i) {
        this.a = i;
    }

    public void g(int i) {
        this.b = i;
    }

    public boolean hasNext() {
        return this.a < this.d.f;
    }

    public void remove() {
        xkg0 xkg0Var = this.d;
        a();
        if (this.b == -1) {
            eg.m("Call next() before removing element from the iterator.");
            return;
        }
        xkg0Var.c();
        xkg0Var.j(this.b);
        this.b = -1;
        this.c = xkg0Var.h;
    }

    public g0y(int i, int i2, int i3, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
    }
}

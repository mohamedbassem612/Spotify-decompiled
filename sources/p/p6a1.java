package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p6a1 implements Comparable {
    public int Y;
    public boolean a;
    public float e;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public c46[] i = new c46[16];
    public int t = 0;
    public int X = 0;

    public p6a1(int i) {
        this.Y = i;
    }

    public final void a(c46 c46Var) {
        int i = 0;
        while (true) {
            int i2 = this.t;
            c46[] c46VarArr = this.i;
            if (i >= i2) {
                if (i2 >= c46VarArr.length) {
                    c46VarArr = (c46[]) Arrays.copyOf(c46VarArr, c46VarArr.length * 2);
                    this.i = c46VarArr;
                }
                int i3 = this.t;
                c46VarArr[i3] = c46Var;
                this.t = i3 + 1;
                return;
            }
            if (c46VarArr[i] == c46Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(c46 c46Var) {
        int i = this.t;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c46Var) {
                while (i2 < i - 1) {
                    c46[] c46VarArr = this.i;
                    int i3 = i2 + 1;
                    c46VarArr[i2] = c46VarArr[i3];
                    i2 = i3;
                }
                this.t--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.Y = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.t;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.t = 0;
        this.X = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((p6a1) obj).b;
    }

    public final void d(yic0 yic0Var, float f) {
        this.e = f;
        this.f = true;
        int i = this.t;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(yic0Var, this, false);
        }
        this.t = 0;
    }

    public final void e(yic0 yic0Var, c46 c46Var) {
        int i = this.t;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(yic0Var, c46Var, false);
        }
        this.t = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}

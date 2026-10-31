package p;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l8u0 {
    public static final ko20 b;
    public static final ko20 c;
    public final lls0 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{16, 17, 18, 21, 22, 23, 28, 30}) {
            dm5.y(!false);
            sparseBooleanArray.append(i, true);
        }
        dm5.y(!false);
        b = new ko20(sparseBooleanArray);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i2 : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32}) {
            dm5.y(!false);
            sparseBooleanArray2.append(i2, true);
        }
        dm5.y(!false);
        c = new ko20(sparseBooleanArray2);
    }

    public l8u0(m8u0 m8u0Var) {
        lls0 lls0Var = new lls0((byte) 24);
        this.a = lls0Var;
        lls0Var.d(m8u0Var.a);
    }

    public final void a(int i) {
        this.a.c(i);
    }

    public final void b() {
        ko20 ko20Var = b;
        lls0 lls0Var = this.a;
        lls0Var.d(ko20Var);
        lls0Var.d(c);
    }

    public final void c(int i, boolean z) {
        if (z) {
            this.a.c(i);
        }
    }

    public final m8u0 d() {
        return new m8u0(this.a.l());
    }

    public final void e(int i, boolean z) {
        if (z) {
            lls0 lls0Var = this.a;
            dm5.y(!lls0Var.b);
            ((SparseBooleanArray) lls0Var.c).delete(i);
        }
    }

    public l8u0() {
        this.a = new lls0((byte) 24);
    }
}

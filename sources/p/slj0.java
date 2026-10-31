package p;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class slj0 {
    public final SparseArray a;
    public a2h1 b;

    public slj0(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(a2h1 a2h1Var, int i, int i2) {
        int iA = a2h1Var.a(i);
        SparseArray sparseArray = this.a;
        slj0 slj0Var = (slj0) sparseArray.get(iA);
        if (slj0Var == null) {
            slj0Var = new slj0(1);
            sparseArray.put(a2h1Var.a(i), slj0Var);
        }
        if (i2 > i) {
            slj0Var.a(a2h1Var, i + 1, i2);
        } else {
            slj0Var.b = a2h1Var;
        }
    }
}

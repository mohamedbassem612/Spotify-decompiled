package p;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jna1 extends lr80 {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ Cloneable c;

    public /* synthetic */ jna1(Cloneable cloneable, byte b) {
        this.a = b;
        this.c = cloneable;
    }

    public final boolean hasNext() {
        byte b = this.a;
        ina1 ina1Var = this.c;
        switch (b) {
            case 0:
                return this.b < ((SparseArray) ina1Var).size();
            default:
                return this.b < ina1Var.g();
        }
    }

    public final int nextInt() {
        byte b = this.a;
        ina1 ina1Var = this.c;
        switch (b) {
            case 0:
                int i = this.b;
                this.b = i + 1;
                return ((SparseArray) ina1Var).keyAt(i);
            default:
                int i2 = this.b;
                this.b = i2 + 1;
                return ina1Var.d(i2);
        }
    }
}

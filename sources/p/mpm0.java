package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mpm0 extends dn90 {
    public final long e;
    public final ArrayList f;
    public final ArrayList g;

    public mpm0(int i, long j) {
        super(i, (byte) 3);
        this.e = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public final mpm0 m(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mpm0 mpm0Var = (mpm0) arrayList.get(i2);
            if (mpm0Var.b == i) {
                return mpm0Var;
            }
        }
        return null;
    }

    public final npm0 n(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            npm0 npm0Var = (npm0) arrayList.get(i2);
            if (npm0Var.b == i) {
                return npm0Var;
            }
        }
        return null;
    }

    @Override // p.dn90
    public final String toString() {
        return dn90.d(this.b) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }
}

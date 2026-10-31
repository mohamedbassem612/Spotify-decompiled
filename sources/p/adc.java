package p;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class adc implements gc10 {
    public static final sfv0 i = new sfv0();
    public final ec10 a;
    public final byte b;
    public final ie30 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public it8 f;
    public long g;
    public ie30[] h;

    /* JADX WARN: Multi-variable type inference failed */
    public adc(ec10 ec10Var, int i2, ie30 ie30Var) {
        this.a = ec10Var;
        this.b = i2;
        this.c = ie30Var;
    }

    public final void a(it8 it8Var, long j, long j2) {
        this.f = it8Var;
        this.g = j2;
        boolean z = this.e;
        ec10 ec10Var = this.a;
        if (!z) {
            ec10Var.b(this);
            if (j != -9223372036854775807L) {
                ec10Var.a(0L, j);
            }
            this.e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        ec10Var.a(0L, j);
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i2 >= sparseArray.size()) {
                return;
            }
            zcc zccVar = (zcc) sparseArray.valueAt(i2);
            if (it8Var == null) {
                zccVar.e = zccVar.c;
            } else {
                zccVar.f = j2;
                gtf1 gtf1VarC = it8Var.C(zccVar.a);
                zccVar.e = gtf1VarC;
                ie30 ie30Var = zccVar.d;
                if (ie30Var != null) {
                    gtf1VarC.a(ie30Var);
                }
            }
            i2++;
        }
    }

    public final void s() {
        SparseArray sparseArray = this.d;
        ie30[] ie30VarArr = new ie30[sparseArray.size()];
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ie30 ie30Var = ((zcc) sparseArray.valueAt(i2)).d;
            ie30Var.getClass();
            ie30VarArr[i2] = ie30Var;
        }
        this.h = ie30VarArr;
    }

    public final gtf1 w(int i2, int i3) {
        SparseArray sparseArray = this.d;
        zcc zccVar = (zcc) sparseArray.get(i2);
        if (zccVar == null) {
            dm5.y(this.h == null);
            zccVar = new zcc(i2, i3, i3 == this.b ? this.c : null);
            it8 it8Var = this.f;
            long j = this.g;
            if (it8Var == null) {
                zccVar.e = zccVar.c;
            } else {
                zccVar.f = j;
                gtf1 gtf1VarC = it8Var.C(i3);
                zccVar.e = gtf1VarC;
                ie30 ie30Var = zccVar.d;
                if (ie30Var != null) {
                    gtf1VarC.a(ie30Var);
                }
            }
            sparseArray.put(i2, zccVar);
        }
        return zccVar;
    }

    public final void c(fn51 fn51Var) {
    }
}

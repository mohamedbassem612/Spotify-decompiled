package p;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mhk1 extends phk1 {
    public String k;
    public SparseArray l;
    public SparseArray m;
    public float[] n;

    @Override // p.phk1
    public final void c(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // p.phk1
    public final boolean d(float f, long j, View view, p321 p321Var) {
        this.a.o(f, this.n);
        float[] fArr = this.n;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.i;
        if (Float.isNaN(this.j)) {
            float fA = p321Var.a(view, this.k);
            this.j = fA;
            if (Float.isNaN(fA)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.j)) % 1.0d);
        this.j = f4;
        this.i = j;
        float fA2 = a(f4);
        this.h = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.g;
            if (i >= fArr2.length) {
                break;
            }
            boolean z = this.h;
            float f5 = this.n[i];
            this.h = z | (((double) f5) != 0.0d);
            fArr2[i] = (f5 * fA2) + f3;
            i++;
        }
        gyo1.P((mhl) this.l.valueAt(0), view, this.g);
        if (f2 != 0.0f) {
            this.h = true;
        }
        return this.h;
    }

    @Override // p.phk1
    public final void e(int i) {
        SparseArray sparseArray = this.l;
        int size = sparseArray.size();
        int iD = ((mhl) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        int i2 = iD + 2;
        this.n = new float[i2];
        this.g = new float[iD];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            mhl mhlVar = (mhl) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.m.valueAt(i3);
            dArr[i3] = ((double) iKeyAt) * 0.01d;
            mhlVar.c(this.n);
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.n;
                if (i4 < fArr2.length) {
                    dArr2[i3][i4] = fArr2[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[iD] = fArr[0];
            dArr3[iD + 1] = fArr[1];
        }
        this.a = dxo1.l(i, dArr, dArr2);
    }
}

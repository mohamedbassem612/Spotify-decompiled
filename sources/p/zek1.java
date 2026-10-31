package p;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zek1 extends cfk1 {
    public SparseArray f;
    public float[] g;

    @Override // p.cfk1
    public final void b(float f, int i) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // p.cfk1
    public final void c(View view, float f) {
        this.a.o(f, this.g);
        gyo1.P((mhl) this.f.valueAt(0), view, this.g);
    }

    @Override // p.cfk1
    public final void d(int i) {
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        int iD = ((mhl) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        this.g = new float[iD];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iD);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            mhl mhlVar = (mhl) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            mhlVar.c(this.g);
            int i3 = 0;
            while (true) {
                float[] fArr = this.g;
                if (i3 < fArr.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.a = dxo1.l(i, dArr, dArr2);
    }
}

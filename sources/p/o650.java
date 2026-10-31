package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o650 {
    public final float[] a;
    public final int[] b;

    public o650(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(o650 o650Var) {
        int i = 0;
        while (true) {
            int[] iArr = o650Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = o650Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final o650 b(float[] fArr) {
        int iT;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iT = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iT = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iT = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iT = cxm.t(iArr2[i3], iArr2[i2], (f - f2) / (fArr2[i2] - f2));
                }
            }
            iArr[i] = iT;
        }
        return new o650(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o650.class != obj.getClass()) {
            return false;
        }
        o650 o650Var = (o650) obj;
        return Arrays.equals(this.a, o650Var.a) && Arrays.equals(this.b, o650Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}

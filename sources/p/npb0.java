package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class npb0 {
    public final int a;
    public final mpb0[] b;
    public final v6a0 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public npb0(int i, mpb0[] mpb0VarArr, v6a0 v6a0Var, List list, int i2) {
        this.a = i;
        this.b = mpb0VarArr;
        this.c = v6a0Var;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (mpb0 mpb0Var : mpb0VarArr) {
            iMax = Math.max(iMax, mpb0Var.n);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final mpb0[] a() {
        return this.b;
    }

    public final mpb0[] b(int i, int i2, int i3) {
        mpb0[] mpb0VarArr = this.b;
        int length = mpb0VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            mpb0 mpb0Var = mpb0VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((bg50) this.d.get(i5)).a;
            mpb0Var.n(i, ((int[]) this.c.c)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return mpb0VarArr;
    }
}

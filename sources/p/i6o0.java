package p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i6o0 implements d6o0 {
    public final View a;
    public final q6o0 b;
    public final int[] c;

    public i6o0(View view) {
        this.a = view;
        q6o0 q6o0Var = new q6o0(view);
        q6o0Var.g(true);
        this.b = q6o0Var;
        this.c = new int[2];
        WeakHashMap weakHashMap = b8k1.a;
        view.setNestedScrollingEnabled(true);
    }

    public final long M(int i, long j) {
        int iH = k1o1.h(j);
        int i2 = i == 1 ? 1 : 0;
        q6o0 q6o0Var = this.b;
        if (!q6o0Var.h(iH, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        f46.f0(0, 0, 6, iArr);
        int iE = k1o1.e(Float.intBitsToFloat((int) (j >> 32)));
        int iE2 = k1o1.e(Float.intBitsToFloat((int) (4294967295L & j)));
        q6o0Var.c(iE, iE2, (i == 1 ? 1 : 0) ^ 1, iArr, (int[]) null);
        return k1o1.w(iE, iE2, iArr, j);
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        q6o0 q6o0Var = this.b;
        if (q6o0Var.f(0)) {
            q6o0Var.i(0);
        }
        if (q6o0Var.f(1)) {
            q6o0Var.i(1);
        }
        return new qui1(0L);
    }

    public final long h0(int i, long j, long j2) {
        int iH = k1o1.h(j2);
        int i2 = i == 1 ? 1 : 0;
        q6o0 q6o0Var = this.b;
        if (!q6o0Var.h(iH, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        f46.f0(0, 0, 6, iArr);
        int iE = k1o1.e(Float.intBitsToFloat((int) (j2 >> 32)));
        int iE2 = k1o1.e(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        q6o0Var.d(k1o1.e(Float.intBitsToFloat((int) (j >> 32))), k1o1.e(Float.intBitsToFloat((int) (j & 4294967295L))), iE, iE2, (int[]) null, (i == 1 ? 1 : 0) ^ 1, iArr);
        return k1o1.w(iE, iE2, iArr, j2);
    }

    public final Object k0(long j, lnm lnmVar) {
        float fD = qui1.d(j) * (-1.0f);
        float fE = qui1.e(j) * (-1.0f);
        q6o0 q6o0Var = this.b;
        if (!q6o0Var.b(fD, fE) && !q6o0Var.a(qui1.d(j) * (-1.0f), qui1.e(j) * (-1.0f), true)) {
            j = 0;
        }
        return new qui1(j);
    }
}

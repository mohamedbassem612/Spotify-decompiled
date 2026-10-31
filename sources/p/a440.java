package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a440 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final fdn0 e;
    public final idd1 f;

    public a440(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            bmv0.a("Invalid start index");
        }
        this.d = new ArrayList();
        fdn0 fdn0Var = new fdn0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            fpa0 fpa0Var = (fpa0) this.a.get(i3);
            int i4 = fpa0Var.c;
            int i5 = fpa0Var.d;
            fdn0Var.i(i4, new rl50(i3, i2, i5));
            i2 += i5;
        }
        this.e = fdn0Var;
        this.f = new idd1(new b9o(this, (byte) 4));
    }

    public final boolean a(int i, int i2) {
        rl50 rl50Var;
        int i3;
        int i4;
        fdn0 fdn0Var = this.e;
        rl50 rl50Var2 = (rl50) fdn0Var.b(i);
        if (rl50Var2 == null) {
            return false;
        }
        int i5 = rl50Var2.b;
        int i6 = i2 - rl50Var2.c;
        rl50Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = fdn0Var.c;
        long[] jArr = fdn0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (rl50Var = (rl50) objArr[(i7 << 3) + i9]).b) >= i5 && rl50Var != rl50Var2 && (i4 = i3 + i6) >= 0) {
                        rl50Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}

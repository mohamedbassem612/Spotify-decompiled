package p;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mfh0 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final nl3 e;
    public final pl3 f;
    public final flb0 g;
    public final boolean h;
    public final int i;
    public final int[] j;
    public int k;
    public int l;

    public mfh0(int i, int i2, List list, long j, Object obj, qqq0 qqq0Var, nl3 nl3Var, pl3 pl3Var, flb0 flb0Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = nl3Var;
        this.f = pl3Var;
        this.g = flb0Var;
        this.h = qqq0Var == qqq0.a;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            q5t0 q5t0Var = (q5t0) list.get(i3);
            iMax = Math.max(iMax, !this.h ? q5t0Var.b : q5t0Var.a);
        }
        this.i = iMax;
        this.j = new int[this.b.size() * 2];
        this.l = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.k += i;
        int[] iArr = this.j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void b(int i, int i2, int i3) throws KotlinNothingValueException {
        int i4;
        this.k = i;
        boolean z = this.h;
        this.l = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            q5t0 q5t0Var = (q5t0) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.j;
            if (z) {
                nl3 nl3Var = this.e;
                if (nl3Var == null) {
                    throw kaa0.g("null horizontalAlignment");
                }
                iArr[i6] = nl3Var.a(q5t0Var.a, i2, this.g);
                iArr[i6 + 1] = i;
                i4 = q5t0Var.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                pl3 pl3Var = this.f;
                if (pl3Var == null) {
                    throw kaa0.g("null verticalAlignment");
                }
                iArr[i7] = pl3Var.c(q5t0Var.b, i3);
                i4 = q5t0Var.a;
            }
            i += i4;
        }
    }
}

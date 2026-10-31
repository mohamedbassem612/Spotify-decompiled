package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j5s {
    public boolean c;
    public float e;
    public int a = -1;
    public final bfn0 b = new bfn0(0, new ssb0[16]);
    public int d = -1;

    public static int a(lpb0 lpb0Var, boolean z) {
        qqq0 qqq0Var = qqq0.a;
        if (z) {
            mpb0 mpb0Var = (mpb0) o7h.A0(lpb0Var.n);
            return (lpb0Var.r == qqq0Var ? mpb0Var.x : mpb0Var.y) + 1;
        }
        mpb0 mpb0Var2 = (mpb0) o7h.q0(lpb0Var.n);
        return (lpb0Var.r == qqq0Var ? mpb0Var2.x : mpb0Var2.y) - 1;
    }

    public final void b(zc80 zc80Var, float f, lpb0 lpb0Var) {
        List list = lpb0Var.n;
        List list2 = lpb0Var.n;
        qqq0 qqq0Var = lpb0Var.r;
        if (!list.isEmpty()) {
            int i = 0;
            boolean z = f < 0.0f;
            int iA = a(lpb0Var, z);
            int i2 = z ? ((mpb0) o7h.A0(list2)).a + 1 : ((mpb0) o7h.q0(list2)).a - 1;
            if (i2 >= 0 && i2 < lpb0Var.q) {
                int i3 = this.a;
                bfn0 bfn0Var = this.b;
                if (iA != i3 && iA >= 0) {
                    if (this.c != z) {
                        Object[] objArr = bfn0Var.a;
                        int i4 = bfn0Var.c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ((ssb0) objArr[i5]).cancel();
                        }
                    }
                    this.c = z;
                    this.a = iA;
                    bfn0Var.g();
                    bfn0Var.c(bfn0Var.c, zc80Var.e(iA));
                }
                if (z) {
                    mpb0 mpb0Var = (mpb0) o7h.A0(list2);
                    if (((zko1.p(mpb0Var, qqq0Var) + ((int) (qqq0Var == qqq0.a ? mpb0Var.v & 4294967295L : mpb0Var.v >> 32))) + lpb0Var.t) - lpb0Var.f88p < (-f)) {
                        Object[] objArr2 = bfn0Var.a;
                        int i6 = bfn0Var.c;
                        while (i < i6) {
                            ((ssb0) objArr2[i]).a();
                            i++;
                        }
                    }
                } else if (lpb0Var.o - zko1.p((mpb0) o7h.q0(list2), qqq0Var) < f) {
                    Object[] objArr3 = bfn0Var.a;
                    int i7 = bfn0Var.c;
                    while (i < i7) {
                        ((ssb0) objArr3[i]).a();
                        i++;
                    }
                }
            }
        }
        this.e = f;
    }

    public final void c(zc80 zc80Var, lpb0 lpb0Var) {
        int i = lpb0Var.q;
        List list = lpb0Var.n;
        int i2 = this.a;
        boolean z = this.c;
        bfn0 bfn0Var = this.b;
        if (i2 != -1 && !list.isEmpty() && i2 != a(lpb0Var, z)) {
            this.a = -1;
            Object[] objArr = bfn0Var.a;
            int i3 = bfn0Var.c;
            for (int i4 = 0; i4 < i3; i4++) {
                ((ssb0) objArr[i4]).cancel();
            }
            bfn0Var.g();
        }
        int i5 = this.d;
        if (i5 != -1 && this.e != 0.0f && i5 != i && !list.isEmpty()) {
            int iA = a(lpb0Var, this.e < 0.0f);
            int i6 = this.e < 0.0f ? ((mpb0) o7h.A0(list)).a + 1 : ((mpb0) o7h.q0(list)).a - 1;
            if (i6 >= 0 && i6 < i && iA != this.a && iA >= 0) {
                this.a = iA;
                bfn0Var.g();
                bfn0Var.c(bfn0Var.c, zc80Var.e(iA));
            }
        }
        this.d = i;
    }
}

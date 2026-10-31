package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qyp0 {
    public final ryp0 a = new ryp0();
    public final izr0 b = new izr0(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            ryp0 ryp0Var = this.a;
            if (i5 >= ryp0Var.c) {
                break;
            }
            int[] iArr = ryp0Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[SYNTHETIC] */
    public final boolean b(fc10 fc10Var) {
        int iA;
        int i;
        boolean z;
        int i2;
        dm5.y(fc10Var != null);
        boolean z2 = this.e;
        izr0 izr0Var = this.b;
        if (z2) {
            this.e = false;
            izr0Var.O(0);
        }
        while (!this.e) {
            int i3 = this.c;
            ryp0 ryp0Var = this.a;
            if (i3 >= 0) {
                iA = a(i3);
                i = this.c + this.d;
                if (iA > 0) {
                    izr0Var.d(izr0Var.i() + iA);
                    if (!jto1.E(fc10Var, izr0Var.e(), izr0Var.i(), iA)) {
                        izr0Var.Q(izr0Var.i() + iA);
                        if (ryp0Var.f[i - 1] != 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.e = z;
                    }
                }
                if (i == ryp0Var.c) {
                    i = -1;
                }
                this.c = i;
            } else if (ryp0Var.c(fc10Var) && ryp0Var.a(fc10Var, true)) {
                int iA2 = ryp0Var.d;
                if ((ryp0Var.a & 1) == 1 && izr0Var.i() == 0) {
                    iA2 += a(0);
                    i2 = this.d;
                } else {
                    i2 = 0;
                }
                if (jto1.F(fc10Var, iA2)) {
                    this.c = i2;
                    i3 = i2;
                    iA = a(i3);
                    i = this.c + this.d;
                    if (iA > 0) {
                        izr0Var.d(izr0Var.i() + iA);
                        if (!jto1.E(fc10Var, izr0Var.e(), izr0Var.i(), iA)) {
                            izr0Var.Q(izr0Var.i() + iA);
                            if (ryp0Var.f[i - 1] != 255) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.e = z;
                        }
                    }
                    if (i == ryp0Var.c) {
                        i = -1;
                    }
                    this.c = i;
                }
            }
            return false;
        }
        return true;
    }
}

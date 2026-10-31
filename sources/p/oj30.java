package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oj30 {
    public final gtf1 a;
    public uzf1 d;
    public xks e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ie30 l;
    public ie30 m;
    public boolean n;
    public final onf1 b = new onf1();
    public final izr0 c = new izr0();
    public final izr0 j = new izr0(1);
    public final izr0 k = new izr0();

    public oj30(gtf1 gtf1Var, uzf1 uzf1Var, xks xksVar, ie30 ie30Var) {
        this.a = gtf1Var;
        this.d = uzf1Var;
        this.e = xksVar;
        this.m = ie30Var;
        if (pxd0.H(ie30Var.f66p)) {
            this.l = ie30Var;
        }
        this.d = uzf1Var;
        this.e = xksVar;
        if (this.l == null) {
            gtf1Var.a(this.m);
        }
        e();
    }

    public final int a() {
        int i;
        if (this.n) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return b() != null ? 1073741824 | i : i;
    }

    public final dnf1 b() {
        if (this.n) {
            onf1 onf1Var = this.b;
            xks xksVar = onf1Var.a;
            String str = zoi1.a;
            int i = xksVar.a;
            dnf1 dnf1Var = onf1Var.m;
            if (dnf1Var == null) {
                dnf1[] dnf1VarArr = this.d.a.n;
                dnf1Var = dnf1VarArr == null ? null : dnf1VarArr[i];
            }
            if (dnf1Var != null && dnf1Var.a) {
                return dnf1Var;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.n) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        izr0 izr0Var;
        dnf1 dnf1VarB = b();
        if (dnf1VarB == null) {
            return 0;
        }
        int length = dnf1VarB.d;
        onf1 onf1Var = this.b;
        if (length != 0) {
            izr0Var = onf1Var.n;
        } else {
            byte[] bArr = dnf1VarB.e;
            String str = zoi1.a;
            int length2 = bArr.length;
            izr0 izr0Var2 = this.k;
            izr0Var2.P(bArr, length2);
            length = bArr.length;
            izr0Var = izr0Var2;
        }
        boolean z = onf1Var.k && onf1Var.l[this.f];
        boolean z2 = z || i2 != 0;
        izr0 izr0Var3 = this.j;
        izr0Var3.a[0] = (byte) ((z2 ? SemanticState.Focused : 0) | length);
        izr0Var3.R(0);
        gtf1 gtf1Var = this.a;
        gtf1Var.c(izr0Var3, 1, 1);
        gtf1Var.c(izr0Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        izr0 izr0Var4 = this.c;
        if (!z) {
            izr0Var4.O(8);
            byte[] bArr2 = izr0Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            gtf1Var.c(izr0Var4, 8, 1);
            return length + 9;
        }
        izr0 izr0Var5 = onf1Var.n;
        int iL = izr0Var5.L();
        izr0Var5.S(-2);
        int i3 = (iL * 6) + 2;
        if (i2 != 0) {
            izr0Var4.O(i3);
            byte[] bArr3 = izr0Var4.a;
            izr0Var5.o(0, bArr3, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            izr0Var4 = izr0Var5;
        }
        gtf1Var.c(izr0Var4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        onf1 onf1Var = this.b;
        onf1Var.d = 0;
        onf1Var.f107p = 0L;
        onf1Var.q = false;
        onf1Var.k = false;
        onf1Var.o = false;
        onf1Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}

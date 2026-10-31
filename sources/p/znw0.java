package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class znw0 extends c46 {
    public p6a1[] f;
    public int g;
    public yqu0 h;

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // p.c46
    public final p6a1 d(boolean[] zArr) {
        yqu0 yqu0Var = this.h;
        int i = -1;
        for (int i2 = 0; i2 < this.g; i2++) {
            p6a1 p6a1Var = this.f[i2];
            if (!zArr[p6a1Var.b]) {
                yqu0Var.g(p6a1Var);
                if (i == -1) {
                    if (yqu0Var.h()) {
                        i = i2;
                    }
                } else if (yqu0Var.i(this.f[i])) {
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // p.c46
    public final boolean e() {
        return this.g == 0;
    }

    @Override // p.c46
    public final void i(yic0 yic0Var, c46 c46Var, boolean z) {
        yqu0 yqu0Var = this.h;
        p6a1 p6a1Var = c46Var.a;
        if (p6a1Var == null) {
            return;
        }
        o36 o36Var = c46Var.d;
        int iD = o36Var.d();
        for (int i = 0; i < iD; i++) {
            p6a1 p6a1VarE = o36Var.e(i);
            float f = o36Var.f(i);
            yqu0Var.g(p6a1VarE);
            if (yqu0Var.a(p6a1Var, f)) {
                j(p6a1VarE);
            }
            this.b = (c46Var.b * f) + this.b;
        }
        k(p6a1Var);
    }

    public final void j(p6a1 p6a1Var) {
        int i = this.g + 1;
        p6a1[] p6a1VarArr = this.f;
        if (i > p6a1VarArr.length) {
            p6a1[] p6a1VarArr2 = (p6a1[]) Arrays.copyOf(p6a1VarArr, p6a1VarArr.length * 2);
            this.f = p6a1VarArr2;
        }
        p6a1[] p6a1VarArr3 = this.f;
        int i2 = this.g;
        p6a1VarArr3[i2] = p6a1Var;
        int i3 = i2 + 1;
        this.g = i3;
        if (i3 > 1) {
            int i4 = p6a1Var.b;
        }
        p6a1Var.a = true;
        p6a1Var.a(this);
    }

    public final void k(p6a1 p6a1Var) {
        int i = 0;
        while (i < this.g) {
            if (this.f[i] == p6a1Var) {
                while (true) {
                    int i2 = this.g;
                    if (i >= i2 - 1) {
                        this.g = i2 - 1;
                        p6a1Var.a = false;
                        return;
                    } else {
                        p6a1[] p6a1VarArr = this.f;
                        int i3 = i + 1;
                        p6a1VarArr[i] = p6a1VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p.c46
    public final String toString() {
        yqu0 yqu0Var = this.h;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.g; i++) {
            yqu0Var.g(this.f[i]);
            str = str + yqu0Var + " ";
        }
        return str;
    }
}

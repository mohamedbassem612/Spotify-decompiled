package p;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vy60 {
    public final ff01 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public cv50[] d = new cv50[8];
    public int e = 7;

    public vy60(b270 b270Var) {
        this.c = sj1.g(b270Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                cv50 cv50Var = this.d[length];
                cv50Var.getClass();
                int i4 = cv50Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            cv50[] cv50VarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(cv50VarArr, i5, cv50VarArr, i5 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final rhc b(int i) throws IOException {
        if (i >= 0) {
            cv50[] cv50VarArr = xy60.a;
            if (i <= cv50VarArr.length - 1) {
                return cv50VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - xy60.a.length);
        if (length >= 0) {
            cv50[] cv50VarArr2 = this.d;
            if (length < cv50VarArr2.length) {
                cv50 cv50Var = cv50VarArr2[length];
                cv50Var.getClass();
                return cv50Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(cv50 cv50Var) {
        this.b.add(cv50Var);
        int i = cv50Var.c;
        int i2 = this.a;
        if (i > i2) {
            f46.h0(this.d, null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        cv50[] cv50VarArr = this.d;
        if (i3 > cv50VarArr.length) {
            cv50[] cv50VarArr2 = new cv50[cv50VarArr.length * 2];
            System.arraycopy(cv50VarArr, 0, cv50VarArr2, cv50VarArr.length, cv50VarArr.length);
            this.e = this.d.length - 1;
            this.d = cv50VarArr2;
            cv50VarArr = cv50VarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        cv50VarArr[i4] = cv50Var;
        this.f++;
        this.g += i;
    }

    public final rhc d() {
        ff01 ff01Var = this.c;
        byte bD = ff01Var.d();
        byte[] bArr = w4n1.a;
        int i = bD & 255;
        int i2 = 0;
        boolean z = (bD & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return ff01Var.e(jE);
        }
        nac nacVar = new nac();
        te70 te70Var = ue70.c;
        te70 te70Var2 = te70Var;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte bD2 = ff01Var.d();
            byte[] bArr2 = w4n1.a;
            i2 = (i2 << 8) | (bD2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                te70[] te70VarArr = (te70[]) te70Var2.c;
                te70VarArr.getClass();
                te70Var2 = te70VarArr[(i2 >>> (i3 - 8)) & 255];
                te70Var2.getClass();
                if (((te70[]) te70Var2.c) == null) {
                    nacVar.R(te70Var2.a);
                    i3 -= te70Var2.b;
                    te70Var2 = te70Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            te70[] te70VarArr2 = (te70[]) te70Var2.c;
            te70VarArr2.getClass();
            te70 te70Var3 = te70VarArr2[(i2 << (8 - i3)) & 255];
            te70Var3.getClass();
            int i4 = te70Var3.b;
            if (((te70[]) te70Var3.c) != null || i4 > i3) {
                break;
            }
            nacVar.R(te70Var3.a);
            i3 -= i4;
            te70Var2 = te70Var;
        }
        return nacVar.w(nacVar.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bD = this.c.d();
            byte[] bArr = w4n1.a;
            int i5 = bD & 255;
            if ((bD & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (bD & 127) << i4;
            i4 += 7;
        }
    }
}

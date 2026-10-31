package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wy60 {
    public final nac a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public cv50[] e = new cv50[8];
    public int f = 7;

    public wy60(nac nacVar) {
        this.a = nacVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                cv50 cv50Var = this.e[length];
                cv50Var.getClass();
                i -= cv50Var.c;
                int i4 = this.h;
                cv50 cv50Var2 = this.e[length];
                cv50Var2.getClass();
                this.h = i4 - cv50Var2.c;
                this.g--;
                i3++;
                length--;
            }
            cv50[] cv50VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(cv50VarArr, i5, cv50VarArr, i5 + i3, this.g);
            cv50[] cv50VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(cv50VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(cv50 cv50Var) {
        int i = cv50Var.c;
        int i2 = this.d;
        if (i > i2) {
            f46.h0(this.e, null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        cv50[] cv50VarArr = this.e;
        if (i3 > cv50VarArr.length) {
            cv50[] cv50VarArr2 = new cv50[cv50VarArr.length * 2];
            System.arraycopy(cv50VarArr, 0, cv50VarArr2, cv50VarArr.length, cv50VarArr.length);
            this.f = this.e.length - 1;
            this.e = cv50VarArr2;
            cv50VarArr = cv50VarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        cv50VarArr[i4] = cv50Var;
        this.g++;
        this.h += i;
    }

    public final void c(rhc rhcVar) {
        int[] iArr = ue70.a;
        int iD = rhcVar.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iD; i++) {
            byte bI = rhcVar.i(i);
            byte[] bArr = w4n1.a;
            j2 += (long) ue70.b[bI & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iD2 = rhcVar.d();
        nac nacVar = this.a;
        if (i2 >= iD2) {
            e(rhcVar.d(), 127, 0);
            nacVar.N(rhcVar);
            return;
        }
        nac nacVar2 = new nac();
        int[] iArr2 = ue70.a;
        int iD3 = rhcVar.d();
        int i3 = 0;
        for (int i4 = 0; i4 < iD3; i4++) {
            byte bI2 = rhcVar.i(i4);
            byte[] bArr2 = w4n1.a;
            int i5 = bI2 & 255;
            int i6 = ue70.a[i5];
            byte b = ue70.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                nacVar2.R((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            nacVar2.R((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        rhc rhcVarW = nacVar2.w(nacVar2.b);
        e(rhcVarW.d(), 127, 128);
        nacVar.N(rhcVarW);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cv50 cv50Var = (cv50) arrayList.get(i2);
            rhc rhcVarP = cv50Var.a.p();
            rhc rhcVar = cv50Var.b;
            Integer num = (Integer) xy60.b.get(rhcVarP);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    cv50[] cv50VarArr = xy60.a;
                    if (u890.j(cv50VarArr[iIntValue].b, rhcVar)) {
                        length = length2;
                    } else if (u890.j(cv50VarArr[length2].b, rhcVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    cv50 cv50Var2 = this.e[i3];
                    cv50Var2.getClass();
                    if (u890.j(cv50Var2.a, rhcVarP)) {
                        cv50 cv50Var3 = this.e[i3];
                        cv50Var3.getClass();
                        if (u890.j(cv50Var3.b, rhcVar)) {
                            length2 = xy60.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + xy60.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.R(64);
                c(rhcVarP);
                c(rhcVar);
                b(cv50Var);
            } else {
                rhc rhcVar2 = cv50.d;
                rhcVarP.getClass();
                if (!rhcVarP.k(0, rhcVar2, rhcVar2.d()) || u890.j(cv50.i, rhcVarP)) {
                    e(length, 63, 64);
                    c(rhcVar);
                    b(cv50Var);
                } else {
                    e(length, 15, 0);
                    c(rhcVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        nac nacVar = this.a;
        if (i < i2) {
            nacVar.R(i | i3);
            return;
        }
        nacVar.R(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            nacVar.R(128 | (i4 & 127));
            i4 >>>= 7;
        }
        nacVar.R(i4);
    }
}

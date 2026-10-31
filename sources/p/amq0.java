package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class amq0 extends d9y0 {
    public int c;
    public int e;
    public int g;
    public klq0[] b = new klq0[16];
    public int[] d = new int[16];
    public Object[] f = new Object[16];

    public final boolean A() {
        return this.c == 0;
    }

    public final void B(klq0 klq0Var) {
        int i = this.c;
        klq0[] klq0VarArr = this.b;
        if (i == klq0VarArr.length) {
            klq0[] klq0VarArr2 = new klq0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(klq0VarArr, 0, klq0VarArr2, 0, i);
            this.b = klq0VarArr2;
        }
        int i2 = this.e;
        int i3 = klq0Var.a;
        int i4 = klq0Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.d;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            f46.P(0, 0, length, iArr, iArr2);
            this.d = iArr2;
        }
        int i7 = this.g + i4;
        Object[] objArr = this.f;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f = objArr2;
        }
        klq0[] klq0VarArr3 = this.b;
        int i9 = this.c;
        this.c = i9 + 1;
        klq0VarArr3[i9] = klq0Var;
        this.e += klq0Var.a;
        this.g += i4;
    }

    public final void y() {
        this.c = 0;
        this.e = 0;
        f46.e0(this.f, (te70) null, 0, this.g);
        this.g = 0;
    }

    public final void z(j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        if (this.c != 0) {
            a9a a9aVar = new a9a(this);
            while (true) {
                klq0 klq0VarN = a9aVar.n();
                s340 s340VarB = klq0VarN.b(a9aVar);
                j06 j06Var2 = j06Var;
                hf91 hf91Var2 = hf91Var;
                h72 h72Var2 = h72Var;
                llq0 llq0Var2 = llq0Var;
                try {
                    klq0VarN.a(a9aVar, j06Var2, hf91Var2, h72Var2, llq0Var2);
                    if (!a9aVar.q()) {
                        break;
                    }
                    j06Var = j06Var2;
                    hf91Var = hf91Var2;
                    h72Var = h72Var2;
                    llq0Var = llq0Var2;
                } catch (Throwable th) {
                    rqt0.p(th, llq0Var2, hf91Var2, s340VarB);
                    throw th;
                }
            }
        }
        y();
    }
}

package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zrb0 {
    public hjl b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ bsb0 h;
    public xrb0[] a = vvm1.a;
    public int e = 1;

    public zrb0(bsb0 bsb0Var) {
        this.h = bsb0Var;
    }

    public static void b(zrb0 zrb0Var, jsb0 jsb0Var, c9n c9nVar, yd50 yd50Var, int i, int i2, boolean z) {
        zrb0Var.h.getClass();
        long jI = jsb0Var.i(0);
        zrb0Var.a(jsb0Var, c9nVar, yd50Var, i, i2, (int) (!z ? jI & 4294967295L : jI >> 32));
    }

    public final void a(jsb0 jsb0Var, c9n c9nVar, yd50 yd50Var, int i, int i2, int i3) {
        xrb0[] xrb0VarArr;
        xrb0[] xrb0VarArr2 = this.a;
        int length = xrb0VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                xrb0 xrb0Var = xrb0VarArr2[i4];
                if (xrb0Var != null && xrb0Var.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int iV = men1.v(jsb0Var);
        int length2 = this.a.length;
        while (true) {
            xrb0VarArr = this.a;
            if (iV >= length2) {
                break;
            }
            xrb0 xrb0Var2 = xrb0VarArr[iV];
            if (xrb0Var2 != null) {
                xrb0Var2.d();
            }
            iV++;
        }
        if (xrb0VarArr.length != men1.v(jsb0Var)) {
            this.a = (xrb0[]) Arrays.copyOf(this.a, men1.v(jsb0Var));
        }
        this.b = new hjl(jsb0Var.d());
        this.c = i3;
        this.d = jsb0Var.j();
        this.e = jsb0Var.b();
        int iV2 = men1.v(jsb0Var);
        for (int i5 = 0; i5 < iV2; i5++) {
            mrb0 mrb0VarU = vvm1.u(men1.t(jsb0Var, i5));
            xrb0[] xrb0VarArr3 = this.a;
            if (mrb0VarU == null) {
                xrb0 xrb0Var3 = xrb0VarArr3[i5];
                if (xrb0Var3 != null) {
                    xrb0Var3.d();
                }
                this.a[i5] = null;
            } else {
                xrb0 xrb0Var4 = xrb0VarArr3[i5];
                if (xrb0Var4 == null) {
                    xrb0Var4 = new xrb0(c9nVar, yd50Var, new g030(this.h, (byte) 14));
                    this.a[i5] = xrb0Var4;
                }
                xrb0Var4.d = mrb0VarU.O0;
                xrb0Var4.e = mrb0VarU.P0;
                xrb0Var4.f = mrb0VarU.Q0;
            }
        }
    }
}

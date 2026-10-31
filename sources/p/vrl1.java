package p;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class vrl1 {
    public final hsl1 a;
    public nk80[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public vrl1(hsl1 hsl1Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = hsl1Var;
        c(hsl1Var);
    }

    public final void a() {
        nk80[] nk80VarArr = this.b;
        if (nk80VarArr != null) {
            nk80 nk80VarI = nk80VarArr[0];
            nk80 nk80VarI2 = nk80VarArr[1];
            hsl1 hsl1Var = this.a;
            if (nk80VarI2 == null) {
                nk80VarI2 = hsl1Var.a.i(2);
            }
            if (nk80VarI == null) {
                nk80VarI = hsl1Var.a.i(1);
            }
            h(nk80.a(nk80VarI, nk80VarI2));
            nk80 nk80Var = this.b[fc11.K(16)];
            if (nk80Var != null) {
                g(nk80Var);
            }
            nk80 nk80Var2 = this.b[fc11.K(32)];
            if (nk80Var2 != null) {
                e(nk80Var2);
            }
            nk80 nk80Var3 = this.b[fc11.K(64)];
            if (nk80Var3 != null) {
                i(nk80Var3);
            }
        }
    }

    public abstract hsl1 b();

    public void c(hsl1 hsl1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = hsl1Var.a.f(i);
            int iK = fc11.K(i);
            this.c[iK] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = hsl1Var.a.g(i);
                this.d[iK] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, nk80 nk80Var) {
        if (this.b == null) {
            this.b = new nk80[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[fc11.K(i2)] = nk80Var;
            }
        }
    }

    public abstract void f(nk80 nk80Var);

    public abstract void h(nk80 nk80Var);

    public vrl1() {
        this(new hsl1((hsl1) null));
    }

    public void e(nk80 nk80Var) {
    }

    public void g(nk80 nk80Var) {
    }

    public void i(nk80 nk80Var) {
    }
}

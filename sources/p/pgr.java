package p;

import android.os.SystemClock;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pgr implements tl7 {
    public final lrd1 a;
    public final ql7 b;
    public final rm5 c;
    public final LinkedHashSet d;
    public final rui1 e;
    public jen0 f;
    public rl7 g;

    public pgr(rm5 rm5Var, boolean z) {
        esa1 gic0Var;
        gbe gbeVar = z ? new gbe() : new g2z((byte) 17);
        if (z) {
            jen0 jen0Var = new jen0();
            gic0Var = new esa1((byte) 27);
            gic0Var.b = jen0Var;
            gic0Var.c = gic0Var.o(jen0Var.c());
        } else {
            jen0 jen0Var2 = new jen0();
            gic0Var = new gic0();
            float f = 0.15f * jen0Var2.f;
            gic0Var.a = f;
            gic0Var.b = f;
            gic0Var.c = jen0Var2;
            gic0Var.d = new jen0(0.0f, f, jen0Var2.e, 1.0f + f);
        }
        this.a = gbeVar;
        this.b = gic0Var;
        this.c = rm5Var;
        this.d = new LinkedHashSet();
        this.e = new rui1();
        gbeVar.b(new ogr(this, (byte) 0));
    }

    public final void a(sl7 sl7Var) {
        this.d.remove(sl7Var);
        rl7 rl7Var = this.g;
        if (rl7Var != null) {
            sl7Var.a(rl7Var);
        }
    }

    public final void b(rl7 rl7Var) {
        this.a.m(rl7Var);
    }

    public final void c(sl7 sl7Var) {
        this.d.add(sl7Var);
        rl7 rl7Var = this.g;
        if (rl7Var != null) {
            sl7Var.b(rl7Var);
        }
    }

    public final void e(rl7 rl7Var) {
        this.a.h(rl7Var);
    }

    public final void g(int i, Float f, Float f2, float f3) {
        int i2;
        jen0 jen0Var = this.f;
        if (jen0Var == null) {
            rm5 rm5Var = this.c;
            jen0 jen0Var2 = (jen0) rm5Var.b;
            if (jen0Var2 == null) {
                jen0Var2 = new jen0();
                ((iu30) rm5Var.a).invoke(jen0Var2);
                rm5Var.b = jen0Var2;
            }
            jen0Var = jen0Var2;
        }
        lrd1 lrd1Var = this.a;
        lrd1Var.i(jen0Var);
        ql7 ql7Var = this.b;
        ql7Var.c(jen0Var);
        ql7Var.a(i, f, f2);
        long jUptimeMillis = SystemClock.uptimeMillis();
        float f4 = i;
        rui1 rui1Var = this.e;
        rui1Var.getClass();
        double[] dArr = rui1Var.b;
        long[] jArr = rui1Var.a;
        long j = jUptimeMillis - 300;
        while (true) {
            i2 = rui1Var.d;
            if (i2 <= 0) {
                break;
            }
            int i3 = rui1Var.c;
            if (jArr[i3] >= j) {
                break;
            }
            rui1Var.c = (i3 + 1) % 20;
            rui1Var.d = i2 - 1;
        }
        float f5 = 0.0f;
        if (i2 == 0) {
            rui1Var.e = 0.0d;
            rui1Var.f = 0.0f;
        }
        double d = rui1Var.e + ((double) f4);
        rui1Var.e = d;
        if (i2 == 20) {
            rui1Var.c = (rui1Var.c + 1) % 20;
            i2--;
            rui1Var.d = i2;
        }
        int i4 = (rui1Var.c + i2) % 20;
        jArr[i4] = jUptimeMillis;
        dArr[i4] = d;
        rui1Var.d = i2 + 1;
        jen0 jen0VarI = ql7Var.i();
        int i5 = rui1Var.d;
        if (i5 >= 2) {
            int i6 = rui1Var.c;
            int i7 = ((i5 + i6) - 1) % 20;
            long j2 = jArr[i7] - jArr[i6];
            if (j2 <= 0) {
                f5 = rui1Var.f;
            } else {
                f5 = (float) ((0.19999999999999996d * ((double) rui1Var.f)) + (0.8d * ((double) ((float) (((dArr[i7] - dArr[i6]) / j2) * 1000.0d)))));
                rui1Var.f = f5;
            }
        }
        lrd1Var.j(jen0VarI, f5 / f3);
    }

    public final void h(jen0 jen0Var) {
        this.f = jen0Var;
    }

    public final void i(Float f, Float f2, float f3) {
        jen0 jen0Var = this.f;
        if (jen0Var == null) {
            rm5 rm5Var = this.c;
            jen0 jen0Var2 = (jen0) rm5Var.b;
            if (jen0Var2 == null) {
                jen0Var2 = new jen0();
                ((iu30) rm5Var.a).invoke(jen0Var2);
                rm5Var.b = jen0Var2;
            }
            jen0Var = jen0Var2;
        }
        lrd1 lrd1Var = this.a;
        lrd1Var.i(jen0Var);
        ql7 ql7Var = this.b;
        ql7Var.c(jen0Var);
        ql7Var.a(0, f, f2);
        rui1 rui1Var = this.e;
        rui1Var.c = 0;
        rui1Var.d = 0;
        rui1Var.e = 0.0d;
        rui1Var.f = 0.0f;
        lrd1Var.o(ql7Var.i());
    }

    public final void j(rl7 rl7Var, jen0 jen0Var) {
        this.a.l(rl7Var, jen0Var);
    }
}

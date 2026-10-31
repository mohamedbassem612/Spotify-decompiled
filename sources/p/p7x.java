package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p7x extends f311 {
    public final int a;
    public final ok41 b;

    public p7x(int i) {
        this.a = i;
        this.b = new ok41(i);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1146943914);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1169) != 1168)) {
            llv llvVar = mlv.d;
            int i3 = this.a;
            zod.R(new hsi1("EmptyScene", 0, Integer.valueOf(i3), irn1.o0(i3, 0, llvVar, 2), rno1.b), rk41Var.a, function0, x340Var, 8 | (i2 & 896), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, i2cVar, rk41Var, function0, (byte) 11);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.b;
    }
}

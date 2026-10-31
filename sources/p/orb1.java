package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class orb1 extends f311 {
    public final long a;
    public final qk41 b = nk41.a;

    public orb1(long j) {
        this.a = j;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-607392924);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1169) != 1168)) {
            qk41 qk41Var = this.b;
            if (qk41Var instanceof ok41) {
                x340Var.i0(-145215108);
                zod.R(new hsi1("StaticColorScene", Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.o0(((ok41) qk41Var).a, 0, mlv.d, 2), rno1.a), rk41Var.a, function0, x340Var, 8 | (i2 & 896), 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-144874914);
                x340Var.r(false);
            }
            t1c.a(dug.f(u291.d(nim0.a, 1.0f), this.a, d4o1.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, this, i2cVar, rk41Var, function0, (byte) 24);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.b;
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class f311 implements qj41 {
    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(306870215);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.f0(-1450462366, Integer.valueOf(i));
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            d(i2cVar, rk41Var, function0, x340Var, i4 | (i5 & 112) | (i5 & 896) | (i5 & 7168));
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(this, i2cVar, i, rk41Var, function0, i2, (byte) 17);
        }
    }

    public abstract void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i);
}

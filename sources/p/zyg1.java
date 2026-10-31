package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zyg1 implements qj41 {
    public final azg1 a;
    public final qk41 b;
    public final wyg1 c;
    public final e971 d;
    public final ts11 e;

    public zyg1(azg1 azg1Var, qk41 qk41Var, wyg1 wyg1Var, e971 e971Var, ts11 ts11Var) {
        this.a = azg1Var;
        this.b = qk41Var;
        this.c = wyg1Var;
        this.d = e971Var;
        this.e = ts11Var;
    }

    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        i2c i2cVar2;
        int i3;
        int i4;
        Function0 function1;
        boolean z;
        Object obj = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-115706515);
        if ((i2 & 6) == 0) {
            i2cVar2 = i2cVar;
            i3 = (b0kVar2.g(i2cVar2) ? 4 : 2) | i2;
        } else {
            i2cVar2 = i2cVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= b0kVar2.e(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? b0kVar2.g(rk41Var) : b0kVar2.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function1 = function0;
            i3 |= b0kVar2.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar2.i(this) ? 16384 : 8192;
        }
        int i5 = i3;
        if (b0kVar2.Y(i5 & 1, (i5 & 9363) != 9362)) {
            b0kVar2.f0(475194376, this);
            int i6 = i5 & 112;
            boolean z2 = i6 == 32;
            Object objT = b0kVar2.T();
            if (z2 || objT == obj) {
                this.c.invoke();
                objT = Boolean.valueOf(this.a.a);
                b0kVar2.s0(objT);
            }
            Boolean bool = (Boolean) objT;
            boolean zH = b0kVar2.h(bool.booleanValue());
            Object objT2 = b0kVar2.T();
            if (zH || objT2 == obj) {
                objT2 = (ej31) this.d.invoke(bool);
                b0kVar2.s0(objT2);
            }
            ej31 ej31Var = (ej31) objT2;
            boolean z3 = i6 == 32;
            Object objT3 = b0kVar2.T();
            if (z3 || objT3 == obj) {
                objT3 = (f311) this.e.invoke(bool);
                b0kVar2.s0(objT3);
            }
            f311 f311Var = (f311) objT3;
            boolean z4 = i6 == 32;
            Object objT4 = b0kVar2.T();
            if (z4 || objT4 == obj) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                z = false;
                b0kVar2.i0(1846675477);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1846549586);
                boolean zG = b0kVar2.g(ven0Var);
                Object objT5 = b0kVar2.T();
                if (zG || objT5 == obj) {
                    objT5 = new aya1(ven0Var, (byte) 16);
                    b0kVar2.s0(objT5);
                }
                ej31Var.a(i2cVar2, i4, rk41Var, (Function0) objT5, b0kVar2, (i5 & 1022) | 32768);
                z = false;
                b0kVar2.r(false);
            }
            b0kVar2.i0(475212474);
            f311Var.a(i2cVar, i, rk41Var, function1, b0kVar2, i5 & 8190);
            b0kVar2.r(z);
            b0kVar2.r(z);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(this, i2cVar, i, rk41Var, function0, i2, (byte) 23);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.b;
    }
}

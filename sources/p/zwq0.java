package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zwq0 implements qj41 {
    public final qj41 a;
    public final rx7 b;
    public final iu30 c;

    public zwq0(qj41 qj41Var, rx7 rx7Var, iu30 iu30Var) {
        this.a = qj41Var;
        this.b = rx7Var;
        this.c = iu30Var;
    }

    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1393357556);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.i(this) ? 16384 : 8192;
        }
        int i4 = i3;
        boolean z = false;
        if (b0kVar3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            ven0 ven0VarH = rwq.h(((xgm1) rk41Var.c).getState(), b0kVar3, 0);
            Integer numValueOf = Integer.valueOf(i);
            wgm1 wgm1Var = (wgm1) ven0VarH.getValue();
            Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
            if ((i4 & 896) == 256 || ((i4 & 512) != 0 && b0kVar3.i(rk41Var))) {
                z = true;
            }
            boolean zI = b0kVar3.i(this) | z | b0kVar3.g(ven0VarH);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                rwm0 rwm0Var = new rwm0(rk41Var, this, ven0VarH, (lnm) null, (byte) 13);
                b0kVar3.s0(rwm0Var);
                objT = rwm0Var;
            }
            qxd0.r(numValueOf, wgm1Var, boolValueOf, (vu30) objT, b0kVar3);
            b0kVar2 = b0kVar3;
            d(i2cVar, i, rk41Var, function0, b0kVar2, 65534 & i4);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ywq0(this, i2cVar, i, rk41Var, function0, i2, (byte) 1);
        }
    }

    @Override // p.qj41
    public final Object b(ak41 ak41Var) {
        return this.a.b(ak41Var);
    }

    @Override // p.qj41
    public final Object c(zj41 zj41Var) {
        return this.a.c(zj41Var);
    }

    public final void d(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-648199531);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar2.g(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? b0kVar2.g(rk41Var) : b0kVar2.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar2.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar2.i(this) ? 16384 : 8192;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            this.a.a(i2cVar, i, rk41Var, function0, b0kVar2, i3 & 8190);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ywq0(this, i2cVar, i, rk41Var, function0, i2, (byte) 0);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.a.getDuration();
    }
}

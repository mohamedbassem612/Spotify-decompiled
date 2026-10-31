package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jy60 extends pim0 implements mav0 {
    public idn0 O0;
    public dy60 P0;

    public final void A1() {
        J1();
    }

    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        if (cav0Var == cav0.b) {
            int i = bav0Var.f;
            if (i == 4) {
                fn31.T(v1(), null, 0, new iy60(this, null, (byte) 0), 3);
            } else if (i == 5) {
                fn31.T(v1(), null, 0, new iy60(this, null, (byte) 1), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H1(onm onmVar) {
        gy60 gy60Var;
        dy60 dy60Var;
        if (onmVar instanceof gy60) {
            gy60Var = (gy60) onmVar;
            int i = gy60Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                gy60Var.d = i - os00.INVALID_ID;
            } else {
                gy60Var = new gy60(this, onmVar);
            }
        } else {
            gy60Var = new gy60(this, onmVar);
        }
        Object obj = gy60Var.b;
        int i2 = gy60Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.P0 == null) {
                dy60 dy60Var2 = new dy60();
                idn0 idn0Var = this.O0;
                gy60Var.a = dy60Var2;
                gy60Var.d = 1;
                Object objB = idn0Var.b(dy60Var2, gy60Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
                dy60Var = dy60Var2;
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dy60Var = gy60Var.a;
        hm5.M(obj);
        this.P0 = dy60Var;
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I1(onm onmVar) {
        hy60 hy60Var;
        if (onmVar instanceof hy60) {
            hy60Var = (hy60) onmVar;
            int i = hy60Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                hy60Var.c = i - os00.INVALID_ID;
            } else {
                hy60Var = new hy60(this, onmVar);
            }
        } else {
            hy60Var = new hy60(this, onmVar);
        }
        Object obj = hy60Var.a;
        int i2 = hy60Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            dy60 dy60Var = this.P0;
            if (dy60Var != null) {
                ey60 ey60Var = new ey60(dy60Var);
                idn0 idn0Var = this.O0;
                hy60Var.c = 1;
                Object objB = idn0Var.b(ey60Var, hy60Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        this.P0 = null;
        return rih1.a;
    }

    public final void J1() {
        dy60 dy60Var = this.P0;
        if (dy60Var != null) {
            this.O0.a(new ey60(dy60Var));
            this.P0 = null;
        }
    }

    public final void K0() {
        J1();
    }
}

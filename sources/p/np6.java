package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class np6 implements q8u0 {
    public final yzc0 a;
    public final yzc0 b;
    public final zwz0 c;
    public final mr20 d;
    public final mr20 e;
    public final mr20 f;

    public np6(yzc0 yzc0Var, yzc0 yzc0Var2, zwz0 zwz0Var) {
        this.a = yzc0Var;
        this.b = yzc0Var2;
        this.c = zwz0Var;
        this.d = rqt0.u(new x010(new u70(yzc0Var.j(), (byte) 23), new u70(yzc0Var2.j(), (byte) 24), new ce2(3, (lnm) null, (byte) 2), (byte) 1));
        this.e = rqt0.u(new x010(yzc0Var.j(), yzc0Var2.j(), new l2(3, (lnm) null, (byte) 9), (byte) 1));
        this.f = rqt0.u(h5p1.r(new u70(yzc0Var.j(), (byte) 25), new u70(yzc0Var2.j(), (byte) 26), yzc0Var.a(), yzc0Var2.a(), new mp6(5, (lnm) null, (byte) 0)));
    }

    public final mr20 a() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a A[PHI: r1 r13 r14
      0x009a: PHI (r1v7 p.tv80) = (r1v5 p.tv80), (r1v8 p.tv80) binds: [B:29:0x0098, B:39:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r13v5 boolean) = (r13v3 boolean), (r13v6 boolean) binds: [B:29:0x0098, B:39:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r14v14 boolean) = (r14v11 boolean), (r14v19 boolean) binds: [B:29:0x0098, B:39:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tv80 tv80Var, lnm lnmVar) {
        lp6 lp6Var;
        tv80 tv80Var2;
        boolean z;
        boolean zBooleanValue;
        Object objI;
        boolean z2;
        Object objB;
        if (lnmVar instanceof lp6) {
            lp6Var = (lp6) lnmVar;
            int i = lp6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lp6Var.f = i - Integer.MIN_VALUE;
            } else {
                lp6Var = new lp6(this, (onm) lnmVar);
            }
        } else {
            lp6Var = new lp6(this, (onm) lnmVar);
        }
        Object objI2 = lp6Var.d;
        int i2 = lp6Var.f;
        yzc0 yzc0Var = this.b;
        yzc0 yzc0Var2 = this.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI2);
            u70 u70Var = new u70(yzc0Var2.j(), (byte) 27);
            lp6Var.a = tv80Var;
            lp6Var.f = 1;
            objI2 = b5p1.i(u70Var, lp6Var);
            if (objI2 != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            tv80Var = lp6Var.a;
            hm5.M(objI2);
        } else {
            if (i2 == 2) {
                z = lp6Var.b;
                tv80Var2 = lp6Var.a;
                hm5.M(objI2);
                zBooleanValue = ((Boolean) objI2).booleanValue();
                if (z) {
                    if (zBooleanValue) {
                        mr20 mr20VarC = this.c.c();
                        lp6Var.a = tv80Var2;
                        lp6Var.b = z;
                        lp6Var.c = zBooleanValue;
                        lp6Var.f = 3;
                        objI = b5p1.i(mr20VarC, lp6Var);
                        if (objI != d9nVar) {
                            objI2 = objI;
                            z2 = zBooleanValue;
                        }
                    }
                    return d9nVar;
                }
                yzc0Var = yzc0Var2;
                yjp1 yjp1Var = fjy0.a;
                lp6Var.a = null;
                lp6Var.b = z;
                lp6Var.c = zBooleanValue;
                lp6Var.f = 4;
                objB = yzc0Var.b(tv80Var2, yjp1Var, lp6Var);
                if (objB != d9nVar) {
                    return d9nVar;
                }
                return objB;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(objI2);
                    return objI2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = lp6Var.c;
            z = lp6Var.b;
            tv80Var2 = lp6Var.a;
            hm5.M(objI2);
        }
        if (((Boolean) objI2).booleanValue()) {
            zBooleanValue = z2;
            yzc0Var = yzc0Var2;
        } else {
            zBooleanValue = z2;
        }
        yjp1 yjp1Var2 = fjy0.a;
        lp6Var.a = null;
        lp6Var.b = z;
        lp6Var.c = zBooleanValue;
        lp6Var.f = 4;
        objB = yzc0Var.b(tv80Var2, yjp1Var2, lp6Var);
        if (objB != d9nVar) {
            return d9nVar;
        }
        return objB;
        boolean zBooleanValue2 = ((Boolean) objI2).booleanValue();
        u70 u70Var2 = new u70(yzc0Var.j(), (byte) 28);
        lp6Var.a = tv80Var;
        lp6Var.b = zBooleanValue2;
        lp6Var.f = 2;
        Object objI3 = b5p1.i(u70Var2, lp6Var);
        if (objI3 != d9nVar) {
            tv80Var2 = tv80Var;
            z = zBooleanValue2;
            objI2 = objI3;
            zBooleanValue = ((Boolean) objI2).booleanValue();
            if (z) {
                yzc0Var = yzc0Var2;
            } else if (zBooleanValue) {
                mr20 mr20VarC2 = this.c.c();
                lp6Var.a = tv80Var2;
                lp6Var.b = z;
                lp6Var.c = zBooleanValue;
                lp6Var.f = 3;
                objI = b5p1.i(mr20VarC2, lp6Var);
                if (objI != d9nVar) {
                    objI2 = objI;
                    z2 = zBooleanValue;
                    if (((Boolean) objI2).booleanValue()) {
                        zBooleanValue = z2;
                        yzc0Var = yzc0Var2;
                    } else {
                        zBooleanValue = z2;
                    }
                }
            }
            yjp1 yjp1Var3 = fjy0.a;
            lp6Var.a = null;
            lp6Var.b = z;
            lp6Var.c = zBooleanValue;
            lp6Var.f = 4;
            objB = yzc0Var.b(tv80Var2, yjp1Var3, lp6Var);
            if (objB != d9nVar) {
                return objB;
            }
        }
        return d9nVar;
    }

    public final mr20 i() {
        return this.e;
    }

    public final mr20 isActive() {
        return this.d;
    }
}

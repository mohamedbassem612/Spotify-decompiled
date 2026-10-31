package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class otn0 {
    public final vzq0 a;
    public final int b;
    public final int c;
    public final hux d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final gbx h;

    public otn0(vzq0 vzq0Var, int i, int i2, hux huxVar, int i3, boolean z, boolean z2, gbx gbxVar) {
        this.a = vzq0Var;
        this.b = i;
        this.c = i2;
        this.d = huxVar;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = gbxVar;
    }

    public final void a(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(289069242);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            i5 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(qim0Var, 24.0f);
            if (this.f) {
                qim0VarR = zr7.j(qim0VarR, mgn0.d);
            }
            x340Var.i0(-1377323930);
            long j = cbx.a(x340Var).b.b;
            x340Var.r(false);
            x340Var.i0(-1377322612);
            long j2 = cbx.a(x340Var).b.a;
            x340Var.r(false);
            w0h1.a(this.d, isl.a, qim0VarR, j, j2, this.g, x340Var, 56, 0);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ux1(this, qim0Var2, i, i2, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public final void b(lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        b0k b0kVar2;
        h311 h311VarV;
        qim0 qim0Var3;
        Object objT;
        long j;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1444834900);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(lee1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (b0kVar3.g(this)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                String strO0 = cwl1.o0(b0kVar3, this.e);
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = k8b0.V0;
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarA = s161.a(qim0Var3, (iu30) objT);
                if (this.g) {
                    b0kVar3.i0(-1211895970);
                    j = cbx.a(b0kVar3).b.a;
                } else {
                    b0kVar3.i0(-1211895208);
                    j = cbx.a(b0kVar3).b.b;
                }
                b0kVar3.r(false);
                b0kVar2 = b0kVar3;
                uwo1.e(strO0, qim0VarA, lee1Var, j, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, ((i3 << 6) & 896) | 1572864, 0, 1696);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((byte) 16, i, i2, this, lee1Var, qim0Var2);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (b0kVar3.g(this)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i5 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var2;
            }
            String strO1 = cwl1.o0(b0kVar3, this.e);
            objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = k8b0.V0;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarA2 = s161.a(qim0Var3, (iu30) objT);
            if (this.g) {
                b0kVar3.i0(-1211895970);
                j = cbx.a(b0kVar3).b.a;
            } else {
                b0kVar3.i0(-1211895208);
                j = cbx.a(b0kVar3).b.b;
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            uwo1.e(strO1, qim0VarA2, lee1Var, j, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, ((i3 << 6) & 896) | 1572864, 0, 1696);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 16, i, i2, this, lee1Var, qim0Var2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otn0)) {
            return false;
        }
        otn0 otn0Var = (otn0) obj;
        return this.a.equals(otn0Var.a) && this.b == otn0Var.b && this.c == otn0Var.c && u890.j(this.d, otn0Var.d) && this.e == otn0Var.e && this.f == otn0Var.f && this.g == otn0Var.g && this.h.equals(otn0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.e, eqq.k(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31, this.f), 31, this.g);
    }
}

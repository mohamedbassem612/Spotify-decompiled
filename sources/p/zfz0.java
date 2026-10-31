package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class zfz0 {
    public static final long a = z4p1.g(4289967027L);
    public static final long b = z4p1.g(4280821800L);
    public static final float c = 48.0f;
    public static final float d = 15.0f;
    public static final float e = 16.0f;
    public static final float f = 32.0f;
    public static final float g = 48.0f;
    public static final float h = 12.0f;
    public static final float i = 16.0f;
    public static final float j = 76.0f;
    public static final float k = 8.0f;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1185452506);
        j06 j06Var = x340Var.a;
        int i3 = i2 | 6;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            gra graVar = een.h;
            float f2 = c;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(u291.r(qim0Var2, f2), u7h.f, er31.a);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            glx glxVar = glx.c;
            float f3 = e;
            qim0 qim0VarR = u291.r(qim0Var2, f3);
            int i4 = glx.d | 3120;
            isl islVar = isl.a;
            long j2 = a;
            w0h1.a(glxVar, islVar, qim0VarR, j2, 0L, false, x340Var, i4, 48);
            w0h1.a(elx.c, islVar, u291.r(qim0Var2, f3), j2, 0L, false, x340Var, elx.d | 3120, 48);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i2, (byte) 9);
        }
    }

    public static final void b(fgz0 fgz0Var, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        fgz0 fgz0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-667260517);
        int i3 = i2 | (b0kVar3.i(fgz0Var) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 3072 | (b0kVar3.h(z) ? 16384 : 8192);
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            wat watVar = (wat) b0kVar3.k(t4k.h);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(0.0f, b0kVar3);
            }
            drr0 drr0Var = (drr0) objT2;
            boolean z2 = fgz0Var.a.j.b() && !z;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(fgz0Var.b());
            boolean zH = b0kVar3.h(z2) | b0kVar3.i(fgz0Var) | b0kVar3.i(ven0Var);
            Object objT4 = b0kVar3.T();
            boolean z3 = z2;
            if (zH || objT4 == m4cVar) {
                hl0 hl0Var = new hl0(z3, fgz0Var, ven0Var, (lnm) null, (byte) 19);
                fgz0Var2 = fgz0Var;
                b0kVar3.s0(hl0Var);
                objT4 = hl0Var;
            } else {
                fgz0Var2 = fgz0Var;
            }
            qxd0.s(boolValueOf, boolValueOf2, (vu30) objT4, b0kVar3);
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) objT5;
            Boolean boolValueOf3 = Boolean.valueOf(fgz0Var2.b());
            boolean zI = b0kVar3.i(fgz0Var2) | b0kVar3.i(ven0Var2);
            Object objT6 = b0kVar3.T();
            if (zI || objT6 == m4cVar) {
                objT6 = new p2z0(fgz0Var2, ven0Var2, (lnm) null, (byte) 4);
                b0kVar3.s0(objT6);
            }
            qxd0.t(boolValueOf3, b0kVar3, (vu30) objT6);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zI2 = b0kVar3.i(ven0Var) | b0kVar3.i(ven0Var2);
            Object objT7 = b0kVar3.T();
            if (zI2 || objT7 == m4cVar) {
                objT7 = new vs3(ven0Var, ven0Var2, (lnm) null, (byte) 8);
                b0kVar3.s0(objT7);
            }
            qxd0.t(bool, b0kVar3, (vu30) objT7);
            String str = (String) iu30Var.invoke(Integer.valueOf(fgz0Var2.c(((Number) fgz0Var2.d.getValue()).intValue())));
            int iI0 = watVar.i0(d);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            bby bbyVarE = xay.e(3, (ni20) null);
            ln00 ln00VarF = xay.f(3, (ni20) null);
            gra graVar = een.f;
            h2c h2cVar = h2c.a;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            fq7.g(zBooleanValue, h2cVar.a(qim0Var3, graVar), bbyVarE, ln00VarF, (String) null, apo.r(-181522829, new ni1(drr0Var, watVar, iI0, fgz0Var, c9nVar, str, ven0Var2), b0kVar3), b0kVar2, 196608, 16);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(fgz0Var, iu30Var, qim0Var2, z, i2, (byte) 23);
        }
    }
}

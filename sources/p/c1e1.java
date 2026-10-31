package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class c1e1 {
    public static final d261 a = new d261("selectedBackgroundColor");

    public static final void a(flb0 flb0Var, c380 c380Var, c380 c380Var2, int i, iu30 iu30Var, qim0 qim0Var, fde1 fde1Var, String str, boolean z, b0k b0kVar, int i2) {
        flb0 flb0Var2;
        Object wj40Var;
        int i3;
        Object obj;
        boolean z2;
        Object nzrVar;
        c380 c380Var3 = c380Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1463487161);
        j06 j06Var = x340Var.a;
        int i4 = i2 | (x340Var.e(flb0Var.ordinal()) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.g(c380Var3) ? 256 : 128) | (x340Var.e(i) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536) | (x340Var.e(fde1Var == null ? -1 : fde1Var.ordinal()) ? 1048576 : 524288) | (x340Var.g(str) ? 8388608 : 4194304) | (x340Var.h(z) ? 67108864 : 33554432);
        if (x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            int i5 = i4 & 896;
            boolean z3 = i5 == 256;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = v8r.q(o7h.p1(c380Var3));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z4 = i5 == 256;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                Integer num = (Integer) o7h.G0(c380Var3);
                objT2 = bb00.h(num != null ? num.intValue() : 0, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT2;
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            String strO0 = cwl1.o0(x340Var, 2131963161);
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
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
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            int i6 = i4 & 112;
            boolean zI = (i6 == 32) | x340Var.i(hdn0Var) | x340Var.i(xtb0VarA) | x340Var.d(fX0);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                i3 = 1048576;
                wj40Var = new wj40(c380Var, xtb0VarA, fX0, hdn0Var, (lnm) null, (byte) 3);
                x340Var.s0(wj40Var);
            } else {
                wj40Var = objT3;
                i3 = 1048576;
            }
            qxd0.t(rih1.a, x340Var, (vu30) wj40Var);
            if (fde1Var == null || c380Var2.isEmpty()) {
                c380Var3 = c380Var2;
                obj = null;
                z2 = true;
                x340Var.i0(-16758659);
                x340Var.r(false);
            } else {
                x340Var.i0(-17149786);
                boolean zI2 = (i6 == 32) | (i5 == 256) | ((i4 & 3670016) == i3) | x340Var.i(xtb0VarA) | x340Var.d(fX0);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    c380Var3 = c380Var2;
                    obj = null;
                    z2 = true;
                    nzrVar = new nzr(fde1Var, c380Var3, c380Var, xtb0VarA, fX0, (lnm) null);
                    x340Var.s0(nzrVar);
                } else {
                    nzrVar = objT4;
                    obj = null;
                    z2 = true;
                    c380Var3 = c380Var2;
                }
                qxd0.t(c380Var3, x340Var, (vu30) nzrVar);
                x340Var.r(false);
            }
            flb0Var2 = flb0Var;
            boolean z6 = z2;
            mod.c(new ely0[]{t4k.n.a(flb0Var2), jxq0.a.a(obj)}, apo.r(-337800699, new j27(f, xtb0VarA, c380Var, z, ven0Var, i, iu30Var, strO0, str), x340Var), x340Var, 56);
            x340Var.r(z6);
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), f);
            cxm.a(okb.b, qim0VarH, x340Var, 6);
            cxm.a(okb.c, h2c.a.a(qim0VarH, een.X), x340Var, 6);
            x340Var.r(z6);
        } else {
            flb0Var2 = flb0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(flb0Var2, c380Var, c380Var3, i, iu30Var, qim0Var, fde1Var, str, z, i2);
        }
    }
}
